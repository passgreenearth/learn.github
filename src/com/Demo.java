public class Demo{
	public static void main(String []args){
		String x="Hello";
		String y="World";
		int a=100;
		int b=200;
		System.out.println(x+y);//Output:? HelloWorld
		System.out.println(a+b);//Output:?300
		System.out.println(x+y+a+b);//Output:?HelloWorld100200
		System.out.println(a+b+x+y);//Output:?300HelloWorld
	}


}