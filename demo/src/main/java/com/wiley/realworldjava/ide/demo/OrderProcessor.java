package com.wiley.realworldjava.ide.demo;

public class OrderProcessor {
   public static void main(String[] args) {
// Click in the left margin of the next line, to place a breakpoint there
      OrderProcessor orderProcessor = new OrderProcessor();
      orderProcessor.processOrder("A123", 25.0, 5, "john.jones@example-store.com");
   }

   public void processOrder(String partNumber, double price, int quantity, String email) {
      System.out.println("Processing order for partNumber: " + partNumber);
      double orderTotal = price * quantity;
      boolean orderSuccessful = chargeAndAdjustInventory(partNumber, orderTotal, quantity);

      // Send confirmation email
      sendEmailConfirmation(email, partNumber, orderSuccessful);

      System.out.println("Order processing completed.");
   }

   private boolean chargeAndAdjustInventory(String partNumber, double orderTotal, int quantity) {

      // Simulate charge verification
      boolean chargeVerified = charge(partNumber, orderTotal);

      // Update inventory
// Click in the left margin of the next line, to place a breakpoint there
      boolean inventoryAdjusted = adjustInventory(partNumber, quantity);
      return chargeVerified && inventoryAdjusted;
   }

   private boolean charge(String partNumber, double total) {
      System.out.printf("Verifying payment for order: %s total:%s%n", partNumber, total);
      // Actual payment verification logic would go here
      return true;
   }

   private boolean adjustInventory(String partNumber, int quantity) {
      System.out.printf("Updating inventory for order: %s quantity:%d%n", partNumber, quantity);
      // Actual inventory update logic would go here
      return true;
   }

   private void sendEmailConfirmation(String email, String partNumber, boolean orderPlaced) {
      if(orderPlaced) {
         System.out.printf("Sending order confirmation email %s for part: %s%n", email, partNumber);
      }
      else {
         System.out.printf("Sending order cancellation email %s for part: %s%n", email, partNumber);
      }
   }
}
