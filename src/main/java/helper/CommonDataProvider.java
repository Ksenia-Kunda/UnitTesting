package helper;

import org.testng.annotations.DataProvider;
import shop.Cart;

import java.io.File;

/**
 * Created by Ksenia on 22.10.2016.
 */
public class CommonDataProvider {

    @DataProvider
    public static Object[][] readFromFileDataProvider() {

        return new Object[][]{
                new Object[]{new File("src//main//resources//andrew-cart.json"), new Cart("andrew-cart")},
                new Object[]{new File("src//main//resources//eugen-cart.jon"), new Cart("eugen-cart")},
                new Object[]{new File("src//main//resources//MyCartTest.json"), new Cart("MyCartTest")},
                new Object[]{new File("src//main//resources//NotExist.json"), new Cart("NotExist")},
                new Object[]{new File("src//main//resources// .json"), new Cart(" ")}
        };
    }
}
