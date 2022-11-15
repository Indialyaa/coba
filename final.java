class ParentClass 
{
    final void showData() 
    {
        System.out.println("This is a final method of Parent class");
    }
}

class ChildClass extends ParentClass 
{
    // It will throw compliation error
    final void showData() 
    {
        System.out.println("This is a final method of Child class");
    }
}
class final{
    public static void main(String arg[])
    {
        ParentClass obj = new ChildClass();
        obj.showData();
    }
}