
public class Instance_variable_hiding38 {
int a=10;
public void hide()
{
int a=15;
System.out.println("Local Variable = "+ a);
System.out.println("Hidden Variable = "+this.a);
}
public static void main(String[] args)
{
	Instance_variable_hiding38 ob = new Instance_variable_hiding38();
	ob.hide();
}
}
