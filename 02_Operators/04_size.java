class SizeofExample {
    public static void main(String[] args) {
        char c;
        int dint;
        short sint;
        long lint;
        int llint;
        float flt;
        double dbl;
        double ldbl;

        // Use of sizeof(data type)
        System.out.println(">>>>>>>>>> Use of sizeof(data type) <<<<<<<<<<<<<<");
        System.out.println("Size of sizeof(char)          => " + Byte.BYTES + " Byte");
        System.out.println("Size of sizeof(short int)     => " + Short.BYTES + " Bytes");
        System.out.println("Size of sizeof(int)           => " + Integer.BYTES + " Bytes");
        System.out.println("Size of sizeof(long int)      => " + Long.BYTES + " Bytes");
        System.out.println("Size of sizeof(long long int) => " + Long.BYTES + " Bytes");
        System.out.println("Size of sizeof(float)         => " + Float.BYTES + " Bytes");
        System.out.println("Size of sizeof(double)        => " + Double.BYTES + " Bytes");
        System.out.println("Size of sizeof(long double)   => " + Double.BYTES + " Bytes");

        // Use of sizeof(Varibale)
        System.out.println("\n>>>>>>>>>> Use of sizeof(variable) <<<<<<<<<<<<<<");
        System.out.println("Size of sizeof(c)     => " + Byte.BYTES + " Byte");
        System.out.println("Size of sizeof(sint)  => " + Short.BYTES + " Bytes");
        System.out.println("Size of sizeof(dint)  => " + Integer.BYTES + " Bytes");
        System.out.println("Size of sizeof(lint)  => " + Long.BYTES + " Bytes");
        System.out.println("Size of sizeof(llint) => " + Long.BYTES + " Bytes");
        System.out.println("Size of sizeof(flt)   => " + Float.BYTES + " Bytes");
        System.out.println("Size of sizeof(dbl)   => " + Double.BYTES + " Bytes");
        System.out.println("Size of sizeof(ldbl)  => " + Double.BYTES + " Bytes");

        // Use of sizeof(expression)
        System.out.println("\n>>>>>>>>>> Use of sizeof(expression) <<<<<<<<<<<<<<");
        System.out.println("Size of sizeof('a')     => " + Character.BYTES + " Byte");
        System.out.println("Size of sizeof(4 + 8)   => " + Integer.BYTES + " Bytes");
        System.out.println("Size of sizeof(2.4 + 8) => " + Double.BYTES + " Bytes");
    }
}

