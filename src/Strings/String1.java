package Strings;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String s1="ravi";
		String s2="ravi";
		System.out.println(s1.concat(s2));
        System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());*/
		String s3=new String("ravi");
		System.out.println(s3.hashCode());
	/*	System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		*/
		String s4=new String("ravi");
		System.out.println(s4.hashCode());
		/*System.out.println(s1==s3);
		System.out.println("/");*/
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		StringBuffer sb=new StringBuffer("hi");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		StringBuffer sb1=new StringBuffer("hi");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
	}

}
