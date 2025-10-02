package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Objects;

@J2ktIncompatible
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {
    public transient Class i;
    public transient Class j;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.i = (Class) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        this.j = (Class) object2;
        f2(new EnumMap(this.i), new EnumMap(this.j));
        Serialization.b(this, objectInputStream, objectInputStream.readInt());
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.i);
        objectOutputStream.writeObject(this.j);
        Serialization.e(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public final BiMap T0() {
        return this.e;
    }

    @Override // com.google.common.collect.AbstractBiMap
    public final Object Y1(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }

    @Override // com.google.common.collect.AbstractBiMap
    public final Object b2(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.e.containsKey(obj);
    }
}
