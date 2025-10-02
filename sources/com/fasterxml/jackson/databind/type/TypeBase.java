package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes4.dex */
public abstract class TypeBase extends JavaType implements JsonSerializable {
    public static final TypeBindings l = TypeBindings.j;
    public final JavaType i;
    public final JavaType[] j;
    public final TypeBindings k;

    public TypeBase(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, i, obj, obj2, z);
        this.k = typeBindings == null ? l : typeBindings;
        this.i = javaType;
        this.j = javaTypeArr;
    }

    public static void P(Class cls, StringBuilder sb, boolean z) {
        if (!cls.isPrimitive()) {
            sb.append(Matrix.MATRIX_TYPE_RANDOM_LT);
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = name.charAt(i);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb.append(cCharAt);
            }
            if (z) {
                sb.append(';');
                return;
            }
            return;
        }
        if (cls == Boolean.TYPE) {
            sb.append(Matrix.MATRIX_TYPE_ZERO);
            return;
        }
        if (cls == Byte.TYPE) {
            sb.append('B');
            return;
        }
        if (cls == Short.TYPE) {
            sb.append('S');
            return;
        }
        if (cls == Character.TYPE) {
            sb.append('C');
            return;
        }
        if (cls == Integer.TYPE) {
            sb.append('I');
            return;
        }
        if (cls == Long.TYPE) {
            sb.append('J');
            return;
        }
        if (cls == Float.TYPE) {
            sb.append('F');
        } else if (cls == Double.TYPE) {
            sb.append('D');
        } else {
            if (cls != Void.TYPE) {
                throw new IllegalStateException("Unrecognized primitive type: ".concat(cls.getName()));
            }
            sb.append('V');
        }
    }

    public String Q() {
        return this.d.getName();
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public final String c() {
        return Q();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType d(int i) {
        return this.k.d(i);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final int e() {
        return this.k.e.length;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public final void g(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writableTypeId = new WritableTypeId(JsonToken.VALUE_STRING, this);
        typeSerializer.e(jsonGenerator, writableTypeId);
        h(jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeId);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.J1(Q());
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType i(Class cls) {
        JavaType javaTypeI;
        JavaType[] javaTypeArr;
        if (cls == this.d) {
            return this;
        }
        if (cls.isInterface() && (javaTypeArr = this.j) != null) {
            for (JavaType javaType : javaTypeArr) {
                JavaType javaTypeI2 = javaType.i(cls);
                if (javaTypeI2 != null) {
                    return javaTypeI2;
                }
            }
        }
        JavaType javaType2 = this.i;
        if (javaType2 == null || (javaTypeI = javaType2.i(cls)) == null) {
            return null;
        }
        return javaTypeI;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public TypeBindings j() {
        return this.k;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final List n() {
        int length;
        JavaType[] javaTypeArr = this.j;
        if (javaTypeArr != null && (length = javaTypeArr.length) != 0) {
            return length != 1 ? Arrays.asList(javaTypeArr) : Collections.singletonList(javaTypeArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType q() {
        return this.i;
    }
}
