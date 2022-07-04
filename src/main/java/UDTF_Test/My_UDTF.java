package UDTF_Test;

import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.exec.UDFArgumentLengthException;
import org.apache.hadoop.hive.ql.exec.UDFArgumentTypeException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.StructField;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: chenlong
 * @Date: 2022/07/03/18:49
 * @Description:
 */
public class My_UDTF extends GenericUDTF {

    @Override
    public StructObjectInspector initialize(StructObjectInspector argOIs) throws UDFArgumentException {
        if (argOIs.getAllStructFieldRefs().size() <= 1) {
            throw new UDFArgumentLengthException("input args must greater than 1");
        }

//        if (!"string".equalsIgnoreCase(allStructFieldRefs.get(0).getFieldObjectInspector().getTypeName())) {
//            throw new UDFArgumentTypeException(0,"first input args type is not String");
//        }

        List<String> fieldNames = new ArrayList<>();
        List<ObjectInspector> filedObject = new ArrayList<>();
        List<? extends StructField> allStructFieldRefs = argOIs.getAllStructFieldRefs();

        for (int i = 1; i < allStructFieldRefs.size(); i++) {
            fieldNames.add(allStructFieldRefs.get(i).getFieldName());
            filedObject.add(allStructFieldRefs.get(i).getFieldObjectInspector());
        }


//        for (StructField structFieldRef : allStructFieldRefs) {
//            fieldNames.add(structFieldRef.getFieldName());
//            filedObject.add(structFieldRef.getFieldObjectInspector());
//        }

//        fieldNames.add("sdk");
//        fieldNames.add("app");
//        fieldNames.add("action");
//
//        filedObject.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);
//        filedObject.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);
//        filedObject.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);

        return ObjectInspectorFactory.getStandardStructObjectInspector(fieldNames, filedObject);

    }

    @Override
    public void process(Object[] args) throws HiveException {
        String str_json = args[0].toString();

        JSONObject jsonObject = null;

        String[] result = new String[args.length-1];

        try {
            jsonObject = new JSONObject(str_json);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        for (int i = 1; i < args.length; i++) {
            try {
               String str = jsonObject.getString(args[i].toString());
                result[i-1] = str;

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        forward(result);

    }

    @Override
    public void close() throws HiveException {

    }
}
