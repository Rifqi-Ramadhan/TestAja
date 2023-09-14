package RifqiRamadhanJBusRS;

public class JBus
{
    public static int getBusId(){
        return 0;
    }
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
        else if (beforeDiscount == 0 && afterDiscount ==0){
            return 0f;
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
}

