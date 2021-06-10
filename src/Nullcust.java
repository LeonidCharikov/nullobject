public class Nullcust extends Emp {

   @Override
   public String getName() {
      return "Not Available in Customer Database";
   }

   @Override
   public boolean isNull() {
      return true;
   }
}