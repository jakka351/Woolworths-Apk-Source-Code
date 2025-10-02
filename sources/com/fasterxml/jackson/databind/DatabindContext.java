package com.fasterxml.jackson.databind;

import YU.a;
import androidx.camera.core.impl.b;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

/* loaded from: classes4.dex */
public abstract class DatabindContext {
    public static String a(String str, String str2) {
        return str2 == null ? str : b.o(str, ": ", str2);
    }

    public static String b(String str) {
        if (str == null) {
            return "[N/A]";
        }
        if (str.length() > 500) {
            str = str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
        }
        return a.h("\"", str, "\"");
    }

    public final Converter c(Object obj) {
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == Converter.None.class || ClassUtil.v(cls)) {
            return null;
        }
        if (!Converter.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(androidx.constraintlayout.core.state.a.f(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        MapperConfig mapperConfigD = d();
        mapperConfigD.e.getClass();
        return (Converter) ClassUtil.h(cls, mapperConfigD.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS));
    }

    public abstract MapperConfig d();

    public abstract TypeFactory e();

    public abstract InvalidTypeIdException f(JavaType javaType, String str, String str2);

    public final ObjectIdGenerator g(ObjectIdInfo objectIdInfo) {
        Class cls = objectIdInfo.b;
        MapperConfig mapperConfigD = d();
        mapperConfigD.e.getClass();
        return ((ObjectIdGenerator) ClassUtil.h(cls, mapperConfigD.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS))).b(objectIdInfo.d);
    }

    public final ObjectIdResolver h(ObjectIdInfo objectIdInfo) {
        Class cls = objectIdInfo.c;
        MapperConfig mapperConfigD = d();
        mapperConfigD.e.getClass();
        return (ObjectIdResolver) ClassUtil.h(cls, mapperConfigD.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS));
    }

    public final Object i(Class cls, String str) {
        if (cls != null) {
            e().k(cls);
        }
        j(str);
        throw null;
    }

    public abstract Object j(String str);
}
