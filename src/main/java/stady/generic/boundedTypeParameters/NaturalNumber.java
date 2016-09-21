package stady.generic.boundedTypeParameters;

/**
 * Created by VasDA on 21.09.2016.
 */
public class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n) {
        this.n = n;
    }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }
}


//A type variable with multiple bounds is a subtype of all the types listed in the bound. If one of the bounds is a class, it must be specified
//    first. For example:

class A { /* ... */
}

interface B { /* ... */
}

interface C { /* ... */
}

class D<T extends A & B & C> { /* ... */
}

//If bound A is not specified first, you get a compile-time error:
// class D <T extends B & A & C> { /* ... */ }  // compile-time error