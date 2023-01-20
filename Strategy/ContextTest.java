import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class ContextTest {

    @Test
    public void Test1() {
        Context context = new Context();
        context.setOpStreategy(new AddStrategy());
        int result = context.execute(5, 4);
        Assert.assertEquals(9, result);
        result = context.execute(3, -4);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void Test2() {
        Context context = new Context();
        context.setOpStreategy(new SubstractStrategy());
        int result = context.execute(5, 4);
        Assert.assertEquals(1, result);
        result = context.execute(3, -4);
        Assert.assertEquals(7, result);
    }

    @Test
    public void Test3() {
        Context context = new Context();
        context.setOpStreategy(new MultyplyStrategy());
        int result = context.execute(5, 4);
        Assert.assertEquals(20, result);
        result = context.execute(0, -4);
        Assert.assertEquals(0, result);
    }
}