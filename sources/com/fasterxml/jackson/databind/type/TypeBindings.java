package com.fasterxml.jackson.databind.type;

import YU.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class TypeBindings implements Serializable {
    public static final String[] h;
    public static final JavaType[] i;
    public static final TypeBindings j;
    public final String[] d;
    public final JavaType[] e;
    public final String[] f;
    public final int g;

    public static final class AsKey {

        /* renamed from: a, reason: collision with root package name */
        public final Class f14325a;
        public final JavaType[] b;
        public final int c;

        public AsKey(Class cls, JavaType[] javaTypeArr, int i) {
            this.f14325a = cls;
            this.b = javaTypeArr;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != AsKey.class) {
                return false;
            }
            AsKey asKey = (AsKey) obj;
            if (this.c == asKey.c && this.f14325a == asKey.f14325a) {
                JavaType[] javaTypeArr = asKey.b;
                JavaType[] javaTypeArr2 = this.b;
                int length = javaTypeArr2.length;
                if (length == javaTypeArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (!javaTypeArr2[i].equals(javaTypeArr[i])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.c;
        }

        public final String toString() {
            return this.f14325a.getName().concat("<>");
        }
    }

    public static class TypeParamStash {

        /* renamed from: a, reason: collision with root package name */
        public static final TypeVariable[] f14326a = AbstractList.class.getTypeParameters();
        public static final TypeVariable[] b = Collection.class.getTypeParameters();
        public static final TypeVariable[] c = Iterable.class.getTypeParameters();
        public static final TypeVariable[] d = List.class.getTypeParameters();
        public static final TypeVariable[] e = ArrayList.class.getTypeParameters();
        public static final TypeVariable[] f = Map.class.getTypeParameters();
        public static final TypeVariable[] g = HashMap.class.getTypeParameters();
        public static final TypeVariable[] h = LinkedHashMap.class.getTypeParameters();
    }

    static {
        String[] strArr = new String[0];
        h = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        i = javaTypeArr;
        j = new TypeBindings(strArr, javaTypeArr, null);
    }

    public TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? h : strArr;
        this.d = strArr;
        javaTypeArr = javaTypeArr == null ? i : javaTypeArr;
        this.e = javaTypeArr;
        if (strArr.length != javaTypeArr.length) {
            StringBuilder sb = new StringBuilder("Mismatching names (");
            sb.append(strArr.length);
            sb.append("), types (");
            throw new IllegalArgumentException(a.m(sb, javaTypeArr.length, ")"));
        }
        int length = javaTypeArr.length;
        int i2 = 1;
        for (int i3 = 0; i3 < length; i3++) {
            i2 += this.e[i3].e;
        }
        this.f = strArr2;
        this.g = i2;
    }

    public static TypeBindings a(JavaType javaType, Class cls) {
        TypeVariable[] typeParameters;
        if (cls == Collection.class) {
            typeParameters = TypeParamStash.b;
        } else if (cls == List.class) {
            typeParameters = TypeParamStash.d;
        } else if (cls == ArrayList.class) {
            typeParameters = TypeParamStash.e;
        } else if (cls == AbstractList.class) {
            typeParameters = TypeParamStash.f14326a;
        } else if (cls == Iterable.class) {
            typeParameters = TypeParamStash.c;
        } else {
            TypeVariable[] typeVariableArr = TypeParamStash.f14326a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static TypeBindings b(Class cls, JavaType javaType, JavaType javaType2) {
        TypeVariable[] typeParameters;
        if (cls == Map.class) {
            typeParameters = TypeParamStash.f;
        } else if (cls == HashMap.class) {
            typeParameters = TypeParamStash.g;
        } else if (cls == LinkedHashMap.class) {
            typeParameters = TypeParamStash.h;
        } else {
            TypeVariable[] typeVariableArr = TypeParamStash.f14326a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 2) {
            return new TypeBindings(new String[]{typeParameters[0].getName(), typeParameters[1].getName()}, new JavaType[]{javaType, javaType2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static TypeBindings c(Class cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = i;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return a(javaTypeArr[0], cls);
            }
            if (length == 2) {
                return b(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = h;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                strArr[i2] = typeParameters[i2].getName();
            }
        }
        if (strArr.length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, null);
        }
        StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
        androidx.constraintlayout.core.state.a.x(cls, sb, " with ");
        sb.append(javaTypeArr.length);
        sb.append(" type parameter");
        sb.append(javaTypeArr.length == 1 ? "" : "s");
        sb.append(": class expects ");
        sb.append(strArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    public final JavaType d(int i2) {
        if (i2 < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this.e;
        if (i2 >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i2];
    }

    public final List e() {
        JavaType[] javaTypeArr = this.e;
        return javaTypeArr.length == 0 ? Collections.EMPTY_LIST : Arrays.asList(javaTypeArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.u(getClass(), obj)) {
            return false;
        }
        JavaType[] javaTypeArr = this.e;
        int length = javaTypeArr.length;
        JavaType[] javaTypeArr2 = ((TypeBindings) obj).e;
        if (length != javaTypeArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (!javaTypeArr2[i2].equals(javaTypeArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.e.length == 0;
    }

    public final int hashCode() {
        return this.g;
    }

    public Object readResolve() {
        String[] strArr = this.d;
        return (strArr == null || strArr.length == 0) ? j : this;
    }

    public final String toString() {
        JavaType[] javaTypeArr = this.e;
        if (javaTypeArr.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder("<");
        int length = javaTypeArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            JavaType javaType = javaTypeArr[i2];
            StringBuilder sb2 = new StringBuilder(40);
            javaType.m(sb2);
            sb.append(sb2.toString());
        }
        sb.append('>');
        return sb.toString();
    }
}
