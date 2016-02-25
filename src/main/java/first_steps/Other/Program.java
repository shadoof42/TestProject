package first_steps.Other;

/**
 * Created by user on 19.02.2016.
 */
/**class SomeThing			//Нечто, реализующее интерфейс Runnable
        implements Runnable		//(содержащее метод run())
{
    public void run()		//Этот метод будет выполняться в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }
}

public class Program			//Класс с методом main()
{
    static SomeThing mThing;	//mThing - объект класса, реализующего интерфейс Runnable

    public static void main(String[] args)
    {
        mThing = new SomeThing();

        Thread myThready = new Thread(mThing);	//Создание потока "myThready"
        myThready.start();				//Запуск потока

        System.out.println("Главный поток завершён...");
    }
}*/
/*public class Program		//Класс с методом main().
{
    public static void main(String[] args)
    {
        //Создание потока
        Thread myThready = new Thread(new Runnable()
        {
            public void run() //Этот метод будет выполняться в побочном потоке
            {
                System.out.println("Привет из побочного потока!");
            }
        });
        myThready.start();	//Запуск потока

        System.out.println("Главный поток завершён...");
    }
}*/
class AffableThread extends Thread
{
    @Override
    public void run()	//Этот метод будет выполнен в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }
}

public class Program
{
    static AffableThread mSecondThread;

    public static void main(String[] args)
    {
        mSecondThread = new AffableThread();	//Создание потока
        mSecondThread.start();					//Запуск потока

        System.out.println("Главный поток завершён...");
    }
}