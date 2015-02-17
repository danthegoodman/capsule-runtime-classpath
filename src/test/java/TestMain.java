public class TestMain {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("TestExternalDependency");
        Object object = clazz.getConstructor().newInstance();
        System.out.println("Hello " + object + " world");
    }
}
