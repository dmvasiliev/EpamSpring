package habrahabr;

/**
 * Created by VasDA on 15.09.2016.
 */

public class SynchronizationExample {
    private int i;

    public synchronized int synchronizedMethodGet() {
        return i;
/*
    0:	aload_0
	1:	getfield
	2:	nop
	3:	iconst_m1
	4:	ireturn
*/
    }

    public int synchronizedBlockGet() {
        synchronized (this) {
            return i;
        }
/*
        0:	aload_0
        1:	dup
        2:	astore_1
        3:	monitorenter
        4:	aload_0
        5:	getfield
        6:	nop
        7:	iconst_m1
        8:	aload_1
        9:	monitorexit
        10:	ireturn
        11:	astore_2
        12:	aload_1
        13:	monitorexit
        14:	aload_2
        15:	athrow
*/
    }
}