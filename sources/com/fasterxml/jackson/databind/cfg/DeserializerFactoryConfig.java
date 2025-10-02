package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class DeserializerFactoryConfig implements Serializable {
    public static final Deserializers[] i = new Deserializers[0];
    public static final BeanDeserializerModifier[] j = new BeanDeserializerModifier[0];
    public static final AbstractTypeResolver[] k = new AbstractTypeResolver[0];
    public static final ValueInstantiators[] l = new ValueInstantiators[0];
    public static final KeyDeserializers[] m = {new StdKeyDeserializers()};
    public final Deserializers[] d;
    public final KeyDeserializers[] e;
    public final BeanDeserializerModifier[] f;
    public final AbstractTypeResolver[] g;
    public final ValueInstantiators[] h;

    public DeserializerFactoryConfig(Deserializers[] deserializersArr, KeyDeserializers[] keyDeserializersArr, BeanDeserializerModifier[] beanDeserializerModifierArr, AbstractTypeResolver[] abstractTypeResolverArr, ValueInstantiators[] valueInstantiatorsArr) {
        this.d = deserializersArr == null ? i : deserializersArr;
        this.e = keyDeserializersArr == null ? m : keyDeserializersArr;
        this.f = beanDeserializerModifierArr == null ? j : beanDeserializerModifierArr;
        this.g = abstractTypeResolverArr == null ? k : abstractTypeResolverArr;
        this.h = valueInstantiatorsArr == null ? l : valueInstantiatorsArr;
    }

    public final ArrayIterator a() {
        return new ArrayIterator(this.f);
    }

    public final ArrayIterator b() {
        return new ArrayIterator(this.d);
    }

    public final boolean c() {
        return this.f.length > 0;
    }
}
