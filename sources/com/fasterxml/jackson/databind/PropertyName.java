package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public class PropertyName implements Serializable {
    public static final PropertyName g = new PropertyName("", null);
    public static final PropertyName h = new PropertyName(new String(""), null);
    public final String d;
    public final String e;
    public SerializedString f;

    public PropertyName(String str, String str2) {
        Annotation[] annotationArr = ClassUtil.f14330a;
        this.d = str == null ? "" : str;
        this.e = str2;
    }

    public static PropertyName a(String str) {
        return (str == null || str.isEmpty()) ? g : new PropertyName(InternCache.e.a(str), null);
    }

    public static PropertyName b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.isEmpty()) ? g : new PropertyName(InternCache.e.a(str), str2);
    }

    public final boolean c() {
        return !this.d.isEmpty();
    }

    public final boolean d() {
        return this.e == null && this.d.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        PropertyName propertyName = (PropertyName) obj;
        String str = propertyName.e;
        String str2 = propertyName.d;
        String str3 = this.d;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = this.e;
        return str4 == null ? str == null : str4.equals(str);
    }

    public final int hashCode() {
        String str = this.d;
        String str2 = this.e;
        if (str2 == null) {
            return str.hashCode();
        }
        return str.hashCode() ^ str2.hashCode();
    }

    public Object readResolve() {
        String str;
        return (this.e == null && ((str = this.d) == null || "".equals(str))) ? g : this;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        if (str2 == null) {
            return str;
        }
        return "{" + str2 + "}" + str;
    }
}
