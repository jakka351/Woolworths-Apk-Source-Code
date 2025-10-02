package com.fasterxml.jackson.databind.util;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* loaded from: classes4.dex */
public class BeanUtil {
    public static String a(JavaType javaType) {
        String str;
        String str2;
        String name = javaType.d.getName();
        if (name.startsWith("java.time.")) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else {
            if (!name.startsWith("org.joda.time.")) {
                return null;
            }
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return str + " type " + ClassUtil.t(javaType) + " not supported by default: add Module \"" + str2 + "\" to enable handling";
    }

    public static Object b(JavaType javaType) {
        Class cls = javaType.d;
        Class clsC = ClassUtil.C(cls);
        if (clsC == null) {
            if (javaType.z() || javaType.b()) {
                return JsonInclude.Include.f;
            }
            if (cls == String.class) {
                return "";
            }
            if (javaType.F(Date.class)) {
                return new Date(0L);
            }
            if (!javaType.F(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }
        if (clsC == Integer.TYPE) {
            return 0;
        }
        if (clsC == Long.TYPE) {
            return 0L;
        }
        if (clsC == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (clsC == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (clsC == Float.TYPE) {
            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
        if (clsC == Byte.TYPE) {
            return (byte) 0;
        }
        if (clsC == Short.TYPE) {
            return (short) 0;
        }
        if (clsC == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException(a.f(clsC, new StringBuilder("Class "), " is not a primitive type"));
    }
}
