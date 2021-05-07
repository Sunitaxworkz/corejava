class LogicalOperators
{
public static void main(String[] args)
{
   int i = 10;
   int j = 20;
   int k = 10;
System.out.println(i==k && i<j);
System.out.println(i==j && i<j++);
System.out.println(j);
System.out.println(i==k || i<j);
System.out.println(i==j || i<j);
}
}