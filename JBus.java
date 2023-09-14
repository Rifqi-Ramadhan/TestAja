import java.util.*;

/**
 * Write a description of class JBus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/**
 * Write a description of class JBus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


/**
 * Write a description of class JBus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Price{
    double rebate, price;
    int discount;

    public Price(double price){
        this.price = price;
        this.rebate = 0;
        this.discount = 0;
    }
    public Price (double price, int discount){
        this.price = price;
        this.discount = discount;
        this.rebate = 0;
    }
    public Price (double price, double rebate){
        this.price = price;
        this.rebate = rebate;
        this.discount = 0;
    }

}
class Rating{
    long count,total;
    public Rating(int dua){
            count = dua;
            total = dua;
    }
}
public class JBus
{
    public static String getBusName(){
        return "Bus";
    }
    public static boolean IsDiscount(){
        return true;
    }
    public static float getDiscountPercentage(int beforeDiscount, int afterDiscount){
        float fbD = (float)beforeDiscount;
        float faD = (float)afterDiscount;

        if (beforeDiscount < afterDiscount){
            return 0;
        }else if (beforeDiscount != 0 && afterDiscount == 0){
            return 100.0f; 
        }
        else 
            return (fbD/(fbD - faD));
    }
    public static int getDiscountedPrice(int price, float DiscountPercentage){
            //temporary variable
            float typeCastPrice = (float)price;
            float getPrice = 0;
            int IgetPrice;
            if (DiscountPercentage >100.0f){
                DiscountPercentage = 100;
            }else
            getPrice = typeCastPrice - (typeCastPrice * (DiscountPercentage/100));
            IgetPrice = (int)getPrice;
            return IgetPrice;
    }
    public static int getOriginalPrice(int discountedPrice, float DiscountPercentage){
        //temporary Variable
        float discountPrice = (float)discountedPrice;
        float getOriPrice = (100 / (100 - DiscountPercentage)) * discountPrice;

        return (int)getOriPrice;
    }
    public static float getAdminPercentage(){
        return 0.05f;
    }
    public static int  getAdminFee(int price){
        float floatingPrice = (float)price;
        float getResult = floatingPrice * getAdminPercentage();
        return (int)getResult;
    }
    public static int getTotalPrice(int price, int numberOfSeat){
        int priceAdmin = (price + getAdminFee(price)) * numberOfSeat;
        return priceAdmin;
    }

    public static void main (String[] args){
        Price obj = new Price(5d);
        Price obj1 = new Price(7d, 5);
        Price obj2 = new Price(8d, 9d);
        Rating obj3 = new Rating(3);

        System.out.println("First");
        System.out.println("Price :" + obj.price);
        System.out.println("discount :" +obj.discount);
        System.out.println("Rebate :" + obj.rebate);

        System.out.println("Second");
        System.out.println("Price :" + obj1.price);
        System.out.println("discount :" +obj1.discount);
        System.out.println("Rebate :" + obj1.rebate);

        System.out.println("Third");
        System.out.println("Price :" + obj2.price);
        System.out.println("discount :" +obj2.discount);
        System.out.println("Rebate :" + obj2.rebate);

        System.out.println("Fourth");
        System.out.println("Count :" + obj3.count);
        System.out.println("Total :" +obj3.total);
    }
}