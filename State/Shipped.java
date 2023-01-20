public class Shipped implements PackageState
{
    //Singleton
    private static Shipped instance = new Shipped();

    private Shipped() {}

    public static Shipped instance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is shipped !!");
        ctx.setCurrentState(InTransition.instance());
    }
}