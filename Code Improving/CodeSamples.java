void main() {
    oddNumbers2();
}

/**
 * Very long way to check if a String is "valid".
 */
boolean isValidCheck(final String input) {
    if (input == null) { return false; }
    if (input.trim().length() == 0) { return false; }
    return true;
}

/**
 * Creative way to make star pattern without nested for loop!
 */
void stars() {
    String star = "";
    for (int i = 1; i <= 5; i++) {
        star += "*";
        IO.println(star);
    }
}

/**
 * Printing all odd numbers from 1-19 inclusive.
 */
void oddNumbers1() {
    for (int i = 1; i <= 19; i++) {
        if (i % 2 == 1) { IO.println(i); }
    }
}

void oddNumbers2() {
    int x = 1;
    while (x < 20) {
        IO.println(x);
        x++;
        x++;
    }
}