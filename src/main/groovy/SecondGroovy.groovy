/**
 * Created by Dmitry on 03.05.2017.
 */
class SecondGroovy {
    def static test() {
        ('a'..'z').findAll { el -> // = filter
            el in ['e', 'y', 'u', 'i', 'o', 'a']
        }.each {
            print it + ' '
        }
    }

    public static void main(String[] args) {
        println test()
    }
}
