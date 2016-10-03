package core.concurrency.habrahabr.incremenator;

/**
 * Created by VasDA on 30.09.2016.
 */
class Program_2 {
    //Переменая, которой оперирует инкременатор
    public static int mValue = 0;

    static Incremenator_2 mInc;    //Объект побочного потока

    public static void main(String[] args) {
        mInc = new Incremenator_2();    //Создание потока

        System.out.print("Значение = ");

        mInc.start();    //Запуск потока

        //Троекратное изменение действия инкременатора
        //с интервалом в i*2 секунд
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(i * 2 * 1000);        //Ожидание в течении i*2 сек.
            } catch (InterruptedException e) {
            }

            mInc.changeAction();    //Переключение действия
        }

        mInc.interrupt();    //Прерывание побочного потока
    }
}