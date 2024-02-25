enum MessageType {
    SUCCESS("good"),
    FAILED("danger");

    String color

    MessageType(String color) {
        this.color = color
    }
}