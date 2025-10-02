package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class StdValueInstantiator extends ValueInstantiator implements Serializable {
    public final String d;
    public final Class e;
    public AnnotatedWithParams f;
    public AnnotatedWithParams g;
    public SettableBeanProperty[] h;
    public JavaType i;
    public AnnotatedWithParams j;
    public SettableBeanProperty[] k;
    public JavaType l;
    public AnnotatedWithParams m;
    public SettableBeanProperty[] n;
    public AnnotatedWithParams o;
    public AnnotatedWithParams p;
    public AnnotatedWithParams q;
    public AnnotatedWithParams r;
    public AnnotatedWithParams s;
    public AnnotatedWithParams t;
    public AnnotatedWithParams u;

    public StdValueInstantiator(JavaType javaType) {
        this.d = javaType == null ? "UNKNOWN TYPE" : javaType.toString();
        this.e = javaType == null ? Object.class : javaType.d;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final AnnotatedWithParams B() {
        return this.m;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final JavaType C(DeserializationConfig deserializationConfig) {
        return this.l;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final AnnotatedWithParams D() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final AnnotatedWithParams E() {
        return this.j;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final JavaType F(DeserializationConfig deserializationConfig) {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final SettableBeanProperty[] G(DeserializationConfig deserializationConfig) {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Class H() {
        return this.e;
    }

    public final Object I(AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr, DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        if (annotatedWithParams == null) {
            throw new IllegalStateException("No delegate constructor for " + this.d);
        }
        try {
            if (settableBeanPropertyArr == null) {
                return annotatedWithParams.q(obj);
            }
            int length = settableBeanPropertyArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty != null) {
                    deserializationContext.q(settableBeanProperty.n(), settableBeanProperty, null);
                    throw null;
                }
                objArr[i] = obj;
            }
            return annotatedWithParams.p(objArr);
        } catch (Throwable th) {
            throw J(deserializationContext, th);
        }
    }

    public final JsonMappingException J(DeserializationContext deserializationContext, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        return th instanceof JsonMappingException ? (JsonMappingException) th : deserializationContext.L(th, this.e);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean a() {
        return this.t != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean b() {
        return this.r != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean c() {
        return this.u != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean d() {
        return this.s != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean e() {
        return this.p != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean f() {
        return this.q != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean g() {
        return this.g != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean h() {
        return this.o != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean i() {
        return this.l != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean j() {
        return this.f != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean k() {
        return this.i != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final boolean l() {
        return j() || k() || i() || g() || h() || e() || f() || d() || c();
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object n(DeserializationContext deserializationContext, BigDecimal bigDecimal) throws ValueInstantiationException, MismatchedInputException {
        AnnotatedWithParams annotatedWithParams = this.t;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.q(bigDecimal);
            } catch (Throwable th) {
                deserializationContext.y(J(deserializationContext, th), this.t.h());
                throw null;
            }
        }
        if (this.s != null) {
            double dDoubleValue = bigDecimal.doubleValue();
            Double dValueOf = Double.isInfinite(dDoubleValue) ? null : Double.valueOf(dDoubleValue);
            if (dValueOf != null) {
                try {
                    return this.s.q(dValueOf);
                } catch (Throwable th2) {
                    deserializationContext.y(J(deserializationContext, th2), this.s.h());
                    throw null;
                }
            }
        }
        super.n(deserializationContext, bigDecimal);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object o(DeserializationContext deserializationContext, BigInteger bigInteger) throws ValueInstantiationException, MismatchedInputException {
        AnnotatedWithParams annotatedWithParams = this.r;
        if (annotatedWithParams == null) {
            super.o(deserializationContext, bigInteger);
            throw null;
        }
        try {
            return annotatedWithParams.q(bigInteger);
        } catch (Throwable th) {
            deserializationContext.y(J(deserializationContext, th), this.r.h());
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object p(DeserializationContext deserializationContext, boolean z) throws ValueInstantiationException, MismatchedInputException {
        if (this.u == null) {
            super.p(deserializationContext, z);
            throw null;
        }
        try {
            return this.u.q(Boolean.valueOf(z));
        } catch (Throwable th) {
            deserializationContext.y(J(deserializationContext, th), this.u.h());
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object q(DeserializationContext deserializationContext, double d) throws ValueInstantiationException, MismatchedInputException {
        if (this.s != null) {
            try {
                return this.s.q(Double.valueOf(d));
            } catch (Throwable th) {
                deserializationContext.y(J(deserializationContext, th), this.s.h());
                throw null;
            }
        }
        if (this.t == null) {
            super.q(deserializationContext, d);
            throw null;
        }
        try {
            return this.t.q(BigDecimal.valueOf(d));
        } catch (Throwable th2) {
            deserializationContext.y(J(deserializationContext, th2), this.t.h());
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object r(DeserializationContext deserializationContext, int i) throws ValueInstantiationException, MismatchedInputException {
        if (this.p != null) {
            try {
                return this.p.q(Integer.valueOf(i));
            } catch (Throwable th) {
                deserializationContext.y(J(deserializationContext, th), this.p.h());
                throw null;
            }
        }
        if (this.q != null) {
            try {
                return this.q.q(Long.valueOf(i));
            } catch (Throwable th2) {
                deserializationContext.y(J(deserializationContext, th2), this.q.h());
                throw null;
            }
        }
        if (this.r == null) {
            super.r(deserializationContext, i);
            throw null;
        }
        try {
            return this.r.q(BigInteger.valueOf(i));
        } catch (Throwable th3) {
            deserializationContext.y(J(deserializationContext, th3), this.r.h());
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object s(DeserializationContext deserializationContext, long j) throws ValueInstantiationException, MismatchedInputException {
        if (this.q != null) {
            try {
                return this.q.q(Long.valueOf(j));
            } catch (Throwable th) {
                deserializationContext.y(J(deserializationContext, th), this.q.h());
                throw null;
            }
        }
        if (this.r == null) {
            super.s(deserializationContext, j);
            throw null;
        }
        try {
            return this.r.q(BigInteger.valueOf(j));
        } catch (Throwable th2) {
            deserializationContext.y(J(deserializationContext, th2), this.r.h());
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object u(DeserializationContext deserializationContext, Object[] objArr) throws ValueInstantiationException, MismatchedInputException {
        AnnotatedWithParams annotatedWithParams = this.g;
        if (annotatedWithParams == null) {
            super.u(deserializationContext, objArr);
            throw null;
        }
        try {
            return annotatedWithParams.p(objArr);
        } catch (Exception e) {
            deserializationContext.y(J(deserializationContext, e), this.e);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object w(DeserializationContext deserializationContext, String str) throws ValueInstantiationException, MismatchedInputException {
        AnnotatedWithParams annotatedWithParams = this.o;
        if (annotatedWithParams == null) {
            super.w(deserializationContext, str);
            throw null;
        }
        try {
            return annotatedWithParams.q(str);
        } catch (Throwable th) {
            deserializationContext.y(J(deserializationContext, th), this.o.h());
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object x(DeserializationContext deserializationContext, Object obj) {
        AnnotatedWithParams annotatedWithParams = this.m;
        return (annotatedWithParams != null || this.j == null) ? I(annotatedWithParams, this.n, deserializationContext, obj) : z(deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object y(DeserializationContext deserializationContext) throws ValueInstantiationException, MismatchedInputException {
        AnnotatedWithParams annotatedWithParams = this.f;
        if (annotatedWithParams == null) {
            super.y(deserializationContext);
            throw null;
        }
        try {
            return annotatedWithParams.o();
        } catch (Exception e) {
            deserializationContext.y(J(deserializationContext, e), this.e);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public final Object z(DeserializationContext deserializationContext, Object obj) {
        AnnotatedWithParams annotatedWithParams;
        AnnotatedWithParams annotatedWithParams2 = this.j;
        return (annotatedWithParams2 != null || (annotatedWithParams = this.m) == null) ? I(annotatedWithParams2, this.k, deserializationContext, obj) : I(annotatedWithParams, this.n, deserializationContext, obj);
    }
}
