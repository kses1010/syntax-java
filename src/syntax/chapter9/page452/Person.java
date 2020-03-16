package syntax.chapter9.page452;

import java.util.Objects;

public class Person {
    long id;

    Person(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person) obj).id;
        }

        return false;
    }
}
