package Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Entity {

    public Entity(ResultSet dbResults) {

        System.out.println("You need to implement the Entity hydration constructor");

    }

    protected Entity() {
    }
}