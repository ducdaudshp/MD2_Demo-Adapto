public class Adapter implements phoneTarget{
    checkNumberAdapter checkNumberAdapter = new checkNumberAdapter();
    @Override
    public boolean checkPhoneNumber(String input) {
        if (!checkNumberAdapter.checkNumber(input)) {
            return false;
        }
        if (input.length() < 10 || input.length() > 11) {
            return false;
        }
        return true;
    }
}
