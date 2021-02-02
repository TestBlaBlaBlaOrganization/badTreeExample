package GeekBrians.Slava_5655380;

import java.util.Random;

public class Util {
    public static int[] strArrToIntArr(String[] sourceArr) {
        int[] returnArr = new int[sourceArr.length];
        for (int i = 0; i < returnArr.length; i++)
            returnArr[i] = Integer.parseInt(sourceArr[i]);
        return returnArr;
    }

    public static int[] generateAndPrintRandomArr() {
        Random rand = new Random();
        int[] arr = new int[rand.nextInt(9) + 1];
        System.out.print("arr: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static class Vector2i {
        public int x;
        public int y;

        public Vector2i() {
            x = 0;
            y = 0;
        }

        public Vector2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static class Vector3i extends Vector2i {
        public int z;

        public Vector3i() {
            super();
            this.z = 0;
        }

        public Vector3i(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }
    }

    public static void deepPrint(Object obj) {
        deepPrint(obj, 0, false);
    }

    private static void deepPrint(Object obj, int recursionLevel, boolean isLast) {
        if (obj.getClass().toString().split(" ")[0].equals("class") && obj.getClass().toString().split(" ")[1].split("")[0].equals("["))
            try {
                if (recursionLevel > 0)
                    System.out.println();
                for (int i = 0; i < recursionLevel; i++)
                    System.out.print("  ");
                System.out.print("[");
                Object[] arr = (Object[]) obj;
                for (int i = 0; i < arr.length; i++)
                    deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                if (arr.getClass().toString().split(" ")[1].split("")[1].equals("[")) {
                    System.out.println();
                    for (int i = 0; i < recursionLevel; i++)
                        System.out.print("  ");
                }
                System.out.print("]" + ((!isLast && recursionLevel > 0) ? "," : ""));
            } catch (ClassCastException e) {
                String type = obj.getClass().toString().split(" ")[1].split("")[1];
                if (type.equals("B")) {
                    byte[] arr = (byte[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("S")) {
                    short[] arr = (short[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("I")) {
                    int[] arr = (int[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("J")) {
                    long[] arr = (long[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("F")) {
                    float[] arr = (float[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("D")) {
                    double[] arr = (double[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("Z")) {
                    boolean[] arr = (boolean[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                } else if (type.equals("C")) {
                    char[] arr = (char[]) obj;
                    for (int i = 0; i < arr.length; i++)
                        deepPrint(arr[i], recursionLevel + 1, i == arr.length - 1);
                }
                System.out.print("]" + ((!isLast && recursionLevel > 0) ? "," : ""));
            }
        else
            System.out.print(obj + ((!isLast && recursionLevel > 0) ? ", " : ""));
    }

    public static String getClassShortName(Object obj) {
        String[] classFullName = obj.getClass().toString().split("\\.");
        return classFullName[classFullName.length - 1];
    }
}

