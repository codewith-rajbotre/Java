public class Priority{
    public static void main(String[] args) {
        Enum e = Enum.LOW;

        switch (e) {
            case HIGH:
                System.out.println("High Priority");
                break;
                case MEDIUM:
                System.out.println("Medium Priority");
                break;
                case LOW:
                System.out.println("Low Priority");
                break;
            default:
                throw new AssertionError();
        }
    }
}