public class Context {
    IStrategy opStreategy;
    public void setOpStreategy(IStrategy opStreategy) {
        this.opStreategy = opStreategy;
    }

    public int execute(int a, int b) {
        return opStreategy.execute(a, b);
    }
}
