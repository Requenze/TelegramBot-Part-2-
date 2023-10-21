package org.example.functions;

import java.lang.reflect.InvocationTargetException;

public interface ImagesOperation {
    float[] execute(float[] rgb) throws InvocationTargetException, IllegalAccessException;
}
