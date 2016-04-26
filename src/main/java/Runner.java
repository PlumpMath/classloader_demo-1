public class Runner {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InterruptedException {
        System.out.println("user.dir=" + System.getProperty("user.dir"));

        while (true) {
            ClassLoader classLoader = new MyClassLoader(Runner.class.getClassLoader());
            Class<?> dogClass = classLoader.loadClass("Dog");
            AbstractDog dog = (AbstractDog) dogClass.newInstance();


            System.out.println(dog.bark());

            Thread.sleep(2_000);
        }
    }
}
