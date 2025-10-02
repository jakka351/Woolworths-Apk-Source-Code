package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.jdk14.JDK14Util;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class DefaultAccessorNamingStrategy extends AccessorNamingStrategy {
    public final boolean d;
    public final boolean e;
    public final String f = "get";
    public final String g = "is";
    public final String h;

    public interface BaseNameValidator {
    }

    public static class FirstCharBasedValidator implements BaseNameValidator {
    }

    public static class Provider extends AccessorNamingStrategy.Provider implements Serializable {
    }

    public static class RecordNaming extends DefaultAccessorNamingStrategy {
        public final Set i;

        public RecordNaming(MapperConfigBase mapperConfigBase, AnnotatedClass annotatedClass) {
            super(mapperConfigBase, null);
            String[] strArrB = JDK14Util.b(annotatedClass.e);
            this.i = strArrB == null ? Collections.EMPTY_SET : new HashSet(Arrays.asList(strArrB));
        }

        @Override // com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy, com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public final String c(AnnotatedMethod annotatedMethod, String str) {
            return this.i.contains(str) ? str : super.c(annotatedMethod, str);
        }
    }

    public DefaultAccessorNamingStrategy(MapperConfig mapperConfig, String str) {
        this.d = mapperConfig.m(MapperFeature.USE_STD_BEAN_NAMING);
        this.e = mapperConfig.m(MapperFeature.ALLOW_IS_GETTERS_FOR_NON_BOOLEAN);
        this.h = str;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public final String a(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this.g;
        if (str2 == null) {
            return null;
        }
        Class<?> returnType = annotatedMethod.g.getReturnType();
        if ((this.e || returnType == Boolean.class || returnType == Boolean.TYPE) && str.startsWith(str2)) {
            return this.d ? f(2, str) : e(2, str);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public final String b(String str) {
        String str2 = this.h;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        return this.d ? f(str2.length(), str) : e(str2.length(), str);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String c(AnnotatedMethod annotatedMethod, String str) {
        Method method = annotatedMethod.g;
        String str2 = this.f;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            Class<?> returnType = method.getReturnType();
            if (returnType.isArray()) {
                String name = returnType.getComponentType().getName();
                if (name.contains(".cglib") && (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib"))) {
                    return null;
                }
            }
        } else if ("getMetaClass".equals(str) && method.getReturnType().getName().startsWith("groovy.lang")) {
            return null;
        }
        return this.d ? f(str2.length(), str) : e(str2.length(), str);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public final String d(String str) {
        return str;
    }

    public final String e(int i, String str) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb.append((CharSequence) str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public final String f(int i, String str) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i2, length);
        return sb.toString();
    }
}
