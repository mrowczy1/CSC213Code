void main() {
    Box<Integer> boxedInt = new Box<>(4);
    Integer thing1 = boxedInt.getThing();
//    boxedInt.setThing("Hi"); // This is a problem because type erasure. Compile-time type check, but erased at runtime.

    Box<String> boxedStr = new Box<>("Yo");
    String thing2 = boxedStr.getThing();

    Box<Box<Integer>> boxedBox = new Box<>(boxedInt);
    Box<Integer> thing3 = boxedBox.getThing();

    IO.println("boxedInt: " + boxedInt);
    IO.println("boxedStr: " + boxedStr);
    IO.println("boxedBox: " + boxedBox);
}

public static class Box<T> {
    private T thing;
    Box(T thing) { this.thing = thing;}
    public T getThing() { return thing; }
    public void setThing(T thing) { this.thing = thing; }
    @Override public String toString() { return Objects.toString(thing); }
}
