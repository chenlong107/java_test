import groovy.json.JsonOutput;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @Auther: chenlong
 * @Date: 2022/06/30/23:32
 * @Description:
 */
public class test01 {
    public static void main(String[] args) throws JSONException {
        String aaa = "{\"sdk\":{\"version\":3,\"minorVersion\":0,\"build\":3,\"platform\":\"Weapp\",\"partner\":\"\"},\"app\":{\"versionCode\":100,\"versionName\":1,\"installTime\":1655347479582,\"displayName\":\"Taro小程序通用\",\"appKey\":\"FC029B76EA5B4BBBB7CFD21853AB2B45\",\"uniqueId\":\"wxa2c5a7df4097b359\",\"channel\":\"\"},\"device\":{\"type\":\"mobile\",\"softwareConfig\":{\"os\":\"Android 11\",\"local\":\"zh_CN\",\"language\":\"zh_CN\",\"osVersionCode\":\"8.0.23\",\"timezone\":8,\"mpVersion\":\"2.24.6\"},\"hardwareConfig\":{\"model\":\"Redmi K20 Pro\",\"pixel\":\"393*851*2.75\",\"densityDpi\":2.75,\"brand\":\"Xiaomi\"},\"deviceId\":{\"tid\":\"oE9i84onNtDvkr9ov6LNghp2zF1w\",\"uid\":\"oE9i84onNtDvkr9ov6LNghp2zF1w\"}},\"networks\":{\"available\":true,\"connected\":true,\"current\":[{\"type\":\"4g\"}],\"type\":\"cellular\"},\"locations\":[{}],\"appContext\":{\"sessionId\":\"weapp-1655347479584-L0wki7InNSd3\",\"sessionStartTime\":1655347479584},\"ts\":1655347483773,\"action\":{\"domain\":\"page\",\"name\":\"leave\",\"data\":{\"name\":\"customApp/index/entry\",\"from\":\"packages/taro-yum-common/start/privacy/index\",\"query\":{\"classId\":\"9214a75d-e58e-4b5a-8313-7202ac16f1fd\",\"c\":\"f657f6eb9ac18\",\"fromType\":1,\"ActivityID\":\"PHHSXA202200353\",\"__key_\":16553474794122,\"couponCode\":\"847522114679381730I22393\",\"couponcode\":\"847522114679381730I22393\"},\"scene\":1037,\"duration\":4,\"startTime\":1655347483773,\"status\":2,\"start\":1655347489984}},\"ip\":\"123.139.84.177\",\"rectime\":\"1655859050214\",\"country\":\"中国\",\"province\":\"陕西\",\"city\":\"西安\"}";


        JSONObject json = new JSONObject(aaa);

        String sdk = json.getString("sdk");

        System.out.println(sdk);

    }
}
