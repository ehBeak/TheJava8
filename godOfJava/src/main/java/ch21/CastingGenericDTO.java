package ch21;

import java.io.Serializable;

public class CastingGenericDTO<T> implements Serializable {

    private T Object;

    public T getObject() {
        return Object;
    }

    public void setObject(T object) {
        Object = object;
    }
}
