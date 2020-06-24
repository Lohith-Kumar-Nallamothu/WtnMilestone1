class fc14
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
int sum=0,r;
r=num%10;
sum=sum+r;
num=num/10;
System.out.println("sum of digits are" +sum);
}
}