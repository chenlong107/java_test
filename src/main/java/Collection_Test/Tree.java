package Collection_Test;

/**
 * @Auther: chenlong
 * @Date: 2022/04/22/13:46
 * @Description:
 */
public class Tree {
    Tree_Node root;

    public void add(int num){
        Tree_Node newTree = new Tree_Node(num);
        if (root == null){
            root = newTree;
        } else {
            insert(root,newTree);
        }
    }

    private void insert(Tree_Node target,Tree_Node newTree){
        if (newTree.value < target.value){
            if (target.left == null){
                target.left = newTree;
            } else{
                insert(target.left,newTree);
            }
        } else {
            if (target.right == null){
                target.right = newTree;
            } else {
                insert(target.right,newTree);
            }
        }
    }

    public void travel(){
        view(root);
    }

    private void view(Tree_Node target){
        if (target == null){
            return;
        }
        view(target.left);
        System.out.println(target.value);
        view(target.right);
    }
}
