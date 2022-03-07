public class client {

        public static void main(String[] args) {
            phoneTarget phoneTarget = new Adapter();
            String input1 = "duc12345678";
            String input2 = "123";
            String input3 = "0123456789";
            String input4 = "01234567890";
            System.out.println(input1 + " is phone number: " + phoneTarget.checkPhoneNumber(input1));
            System.out.println(input2 + " is phone number: " + phoneTarget.checkPhoneNumber(input2));
            System.out.println(input3 + " is phone number: " + phoneTarget.checkPhoneNumber(input3));
            System.out.println(input4 + " is phone number: " + phoneTarget.checkPhoneNumber(input4));
        }
}
