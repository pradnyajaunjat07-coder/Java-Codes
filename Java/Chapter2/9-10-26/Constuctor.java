class Constructor {
    // Constructor (Must match the exact name and case of the class)
    Constructor() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        // Creating an object triggers the constructor
        Constructor c1 = new Constructor();
        System.out.println("Program Finished");
    }
}
