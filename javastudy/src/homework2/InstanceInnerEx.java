package src.homework2;

public class InstanceInnerEx {
	public static void main(String[] args) {
		OuterEx oc = new OuterEx();
		OuterEx.InnerEx ic = oc.new InnerEx();
		ic.info();
	}
}
