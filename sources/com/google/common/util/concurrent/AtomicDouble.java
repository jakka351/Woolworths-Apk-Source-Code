package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class AtomicDouble extends Number implements Serializable {
    public transient AtomicLong d;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = new AtomicLong();
        this.d.set(Double.doubleToRawLongBits(objectInputStream.readDouble()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(a());
    }

    public final double a() {
        return Double.longBitsToDouble(this.d.get());
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return a();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) a();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) a();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) a();
    }

    public final String toString() {
        return Double.toString(a());
    }
}
