class fc7
{
public static void main(String args[])
{
char ch1=args[0].charAt(0);
if(ch1>=65&& ch1<=90)
{
ch1+=32;
System.out.println("lowercase letter is:"+ch1);
}
else if(ch1>=97&&ch1<=122)
{
ch1-=32;
System.out.println("upper case letter is:"+ch1);
}
}
}