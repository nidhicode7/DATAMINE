class SwitchDemo {
    public static void main(String[] args) {
        String day = "Fri";

        switch (day) {
            case "Mon" -> System.out.println("Start of week");
            case "Fri" -> System.out.println("Almost weekend");
            default -> System.out.println("Regular day");
        }
    }
}
