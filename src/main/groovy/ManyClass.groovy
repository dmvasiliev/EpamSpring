/**
 * Created by Dmitry on 03.05.2017.
 */

class Account {
    String name
    BigDecimal value
}

// конструктор по умолчанию добавляется автоматически
// такой конструктор - синтаксический сахар для
// a = new Account()
// a.setName("Account #1")
// a.setValue(new BigDecimal(10))
a = new Account(name: "Account #1", value: new BigDecimal(10))

// геттеры и сеттеры генерируются автоматически
def name = a.getName()
a.setName("Account #2")
println "${a.name}"

class Person {
    def first
    def last

    // явно задаем сеттер
    void setFirst(first) {
        println "${this.first} is becoming ${first}"
        this.first = first
    }
}

p = new Person(first: "A", last: "G")
// если обращаться к полю, то будет использоваться сеттер
p.first = "C"

println "${p.first} ${p.last}"

// наследвание как в java
class ExtendedAccount extends Account {
    def debt

    // задаем конструктор
    ExtendedAccount(name, value, debt) {
        setName(name)
        setValue(value)
        setDebt(debt)
    }

    def String toString() {
        "${name} ${value} ${debt}"
    }
}