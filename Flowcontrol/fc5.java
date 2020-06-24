class fc5
{
public static void main(String args[])
{
char ch1=args[0].charAt(0);
if(ch1>=48 && ch1<=57)
{
System.out.println("digit");
}
else if((ch1>=65 && ch1<=90)||(ch1>=97 && ch1<=122))
{
System.out.println("alphabet");
}
else
{
System.out.println("special charecter");
}
}
}
