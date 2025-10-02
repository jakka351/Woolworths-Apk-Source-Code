package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class SerializerFactoryConfig implements Serializable {
    public static final Serializers[] g = new Serializers[0];
    public static final BeanSerializerModifier[] h = new BeanSerializerModifier[0];
    public final Serializers[] d;
    public final Serializers[] e;
    public final BeanSerializerModifier[] f;

    public SerializerFactoryConfig(Serializers[] serializersArr, Serializers[] serializersArr2, BeanSerializerModifier[] beanSerializerModifierArr) {
        Serializers[] serializersArr3 = g;
        this.d = serializersArr == null ? serializersArr3 : serializersArr;
        this.e = serializersArr2 == null ? serializersArr3 : serializersArr2;
        this.f = beanSerializerModifierArr == null ? h : beanSerializerModifierArr;
    }

    public final boolean a() {
        return this.f.length > 0;
    }

    public final ArrayIterator b() {
        return new ArrayIterator(this.f);
    }
}
