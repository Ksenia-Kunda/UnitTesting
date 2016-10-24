import org.junit.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import shop.Cart;
import shop.RealItem;
import shop.VirtualItem;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ksenia on 23.10.2016.
 */
public class ShopTest {

    @Test(groups = {"item", "shop"})
    public void realItemTest(){
        RealItem realItem = new RealItem();
        double weight = 10;
        realItem.setWeight(weight);
        Assert.assertTrue(weight == realItem.getWeight());
    }

    @Test(groups = "item")
    public void VirtualItemTest(){
        VirtualItem disk = new VirtualItem();
        disk.setName("Windows");
        disk.setPrice(11);
        disk.setSizeOnDisk(20000);
        Assert.assertEquals("Class: class shop.VirtualItem; Name: Windows; Price: 11.0; Size on disk: 20000.0", disk.toString());
    }

    @Test(groups = "shop")
    @Parameters(value = "price")
    public void cartTest(double price){
        Cart cart = new Cart("andrew-cart");
        RealItem realItem = new RealItem();
        realItem.setPrice(price);
        cart.addRealItem(realItem);
        Assert.assertEquals(135.07, cart.getTotalPrice(), 0.9);
        };
    }

