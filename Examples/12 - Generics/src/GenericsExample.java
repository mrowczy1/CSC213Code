void main() {
    Box<Integer> boxedInt = new Box<>(4);
    Integer thing1 = boxedInt.returnThing();

    Box<String> boxedStr = new Box<>("Yo");
    String thing2 = boxedStr.returnThing();

    Box<Box<Integer>> boxedBox = new Box<>(boxedInt);
    Box<Integer> thing3 = boxedBox.returnThing();

    IO.println("boxedInt: " + boxedInt);
    IO.println("boxedStr: " + boxedStr);
    IO.println("boxedBox: " + boxedBox);
}

public static class Box<T> {
    private final T thing;
    Box(T thing) { this.thing = thing;}
    public T returnThing() { return thing; }
    @Override public String toString() { return Objects.toString(thing); }
}
