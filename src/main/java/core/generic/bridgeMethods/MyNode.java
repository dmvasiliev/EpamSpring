package core.generic.bridgeMethods;

/**
 * Created by VasDA on 26.09.2016.
 */
public class MyNode extends Node<Integer> {
    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}