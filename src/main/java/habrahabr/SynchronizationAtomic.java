package habrahabr;

/**
 * Created by VasDA on 15.09.2016.
 */
public class SynchronizationAtomic {
    /*
    Если переменная объявлена как volatile, это означает, что ожидается её изменение несколькими потоками. Естественно, вы думаете,
    что JRE наложит какие-то формы синхронизации для volatile переменных. Хорошо это или плохо, JRE неявно обеспечивает синхронизацию
    при доступе к volatile переменным, но с одной очень большой оговоркой: чтение volatile переменных синхронизировано и запись в volatile
    переменные синхронизирована, а неатомарные операции – нет.
    Что означает, что следующий код не безопасен для потоков:
     */

    /*
    myVolatileVar++;

//ToDo    Этот код также может быть записан следующим образом:

    int temp = 0;
    synchronize( myVolatileVar ) {
        temp = myVolatileVar;
    }

    temp++;

    synchronize( myVolatileVar ) {
        myVolatileVar = temp;
    }
    */
}
