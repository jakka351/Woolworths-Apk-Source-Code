package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.ClassUtil;

/* loaded from: classes4.dex */
public class ObjectIdInfo {
    public static final ObjectIdInfo f = new ObjectIdInfo(PropertyName.h, Object.class, null, false, null);

    /* renamed from: a, reason: collision with root package name */
    public final PropertyName f14277a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final boolean e;

    public ObjectIdInfo(PropertyName propertyName, Class cls, Class cls2, boolean z, Class cls3) {
        this.f14277a = propertyName;
        this.d = cls;
        this.b = cls2;
        this.e = z;
        this.c = cls3 == null ? SimpleObjectIdResolver.class : cls3;
    }

    public final String toString() {
        return "ObjectIdInfo: propName=" + this.f14277a + ", scope=" + ClassUtil.B(this.d) + ", generatorType=" + ClassUtil.B(this.b) + ", alwaysAsId=" + this.e;
    }
}
