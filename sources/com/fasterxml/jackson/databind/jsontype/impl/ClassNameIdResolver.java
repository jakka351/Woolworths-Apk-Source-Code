package com.fasterxml.jackson.databind.jsontype.impl;

import YU.a;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: classes4.dex */
public class ClassNameIdResolver extends TypeIdResolverBase {
    public final PolymorphicTypeValidator c;

    public ClassNameIdResolver(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory);
        this.c = polymorphicTypeValidator;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String a(Object obj) {
        return f(obj, obj.getClass(), this.f14295a);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public final String b() {
        return "class name used as type id";
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public final JavaType c(DeserializationContext deserializationContext, String str) {
        return g(str, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public final String d(Class cls, Object obj) {
        return f(obj, cls, this.f14295a);
    }

    public final String f(Object obj, Class cls, TypeFactory typeFactory) {
        Annotation[] annotationArr = ClassUtil.f14330a;
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                return typeFactory.f(typeFactory.c(null, ClassUtil.m((EnumSet) obj), TypeFactory.h), EnumSet.class).Q();
            }
            if (obj instanceof EnumMap) {
                Class clsL = ClassUtil.l((EnumMap) obj);
                TypeBindings typeBindings = TypeFactory.h;
                return typeFactory.i(EnumMap.class, typeFactory.c(null, clsL, typeBindings), typeFactory.c(null, Object.class, typeBindings)).Q();
            }
        } else if (name.indexOf(36) >= 0 && ClassUtil.r(cls) != null) {
            JavaType javaType = this.b;
            if (ClassUtil.r(javaType.d) == null) {
                return javaType.d.getName();
            }
        }
        return name;
    }

    public JavaType g(String str, DatabindContext databindContext) throws InvalidTypeIdException {
        JavaType javaTypeJ;
        databindContext.getClass();
        int iIndexOf = str.indexOf(60);
        JavaType javaType = this.b;
        PolymorphicTypeValidator polymorphicTypeValidator = this.c;
        PolymorphicTypeValidator.Validity validity = PolymorphicTypeValidator.Validity.d;
        PolymorphicTypeValidator.Validity validity2 = PolymorphicTypeValidator.Validity.e;
        if (iIndexOf > 0) {
            str.substring(0, iIndexOf);
            PolymorphicTypeValidator.Validity validityB = polymorphicTypeValidator.b();
            if (validityB == validity2) {
                throw databindContext.f(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + ClassUtil.f(polymorphicTypeValidator) + ") denied resolution");
            }
            javaTypeJ = databindContext.e().g(str);
            if (!javaTypeJ.F(javaType.d)) {
                throw databindContext.f(javaType, str, "Not a subtype");
            }
            if (validityB != validity && polymorphicTypeValidator.c() != validity) {
                throw databindContext.f(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + ClassUtil.f(polymorphicTypeValidator) + ") denied resolution");
            }
        } else {
            MapperConfig mapperConfigD = databindContext.d();
            PolymorphicTypeValidator.Validity validityB2 = polymorphicTypeValidator.b();
            if (validityB2 == validity2) {
                throw databindContext.f(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + ClassUtil.f(polymorphicTypeValidator) + ") denied resolution");
            }
            try {
                databindContext.e().getClass();
                Class clsL = TypeFactory.l(str);
                if (!javaType.G(clsL)) {
                    throw databindContext.f(javaType, str, "Not a subtype");
                }
                javaTypeJ = mapperConfigD.e.d.j(javaType, clsL, false);
                if (validityB2 == PolymorphicTypeValidator.Validity.f && polymorphicTypeValidator.c() != validity) {
                    throw databindContext.f(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + ClassUtil.f(polymorphicTypeValidator) + ") denied resolution");
                }
            } catch (ClassNotFoundException unused) {
                javaTypeJ = null;
            } catch (Exception e) {
                throw databindContext.f(javaType, str, a.i("problem: (", e.getClass().getName(), ") ", ClassUtil.i(e)));
            }
        }
        if (javaTypeJ != null || !(databindContext instanceof DeserializationContext)) {
            return javaTypeJ;
        }
        ((DeserializationContext) databindContext).G(javaType, str, "no such class found");
        return null;
    }
}
