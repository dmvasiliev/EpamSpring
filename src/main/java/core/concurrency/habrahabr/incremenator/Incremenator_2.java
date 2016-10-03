package core.concurrency.habrahabr.incremenator;

/**
 * Created by VasDA on 30.09.2016.
 */
class Incremenator_2 extends Thread {
    private volatile boolean mIsIncrement = true;

    public void changeAction()    //Меняет действие на противоположное
    {
        mIsIncrement = !mIsIncrement;
    }

    @Override
    public void run() {
        do {
            if (!Thread.interrupted())    //Проверка прерывания
            {
                if (mIsIncrement)
                    Program_2.mValue++;    //Инкремент
                else
                    Program_2.mValue--;            //Декремент

                //Вывод текущего значения переменной
                System.out.print(Program_2.mValue + " ");
            } else
                return;        //Завершение потока

            try {
                Thread.sleep(1000);        //Приостановка потока на 1 сек.
            } catch (InterruptedException e) {
                return;    //Завершение потока после прерывания
            }
        }
        while (true);
    }
}
