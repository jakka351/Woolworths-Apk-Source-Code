package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.BitSet;

/* loaded from: classes4.dex */
public abstract class ValueInstantiator {

    public static class Delegating extends ValueInstantiator implements Serializable {
        public final ValueInstantiator d;

        public Delegating(ValueInstantiator valueInstantiator) {
            this.d = valueInstantiator;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final AnnotatedWithParams B() {
            return this.d.B();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final JavaType C(DeserializationConfig deserializationConfig) {
            return this.d.C(deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final AnnotatedWithParams D() {
            return this.d.D();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final AnnotatedWithParams E() {
            return this.d.E();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final JavaType F(DeserializationConfig deserializationConfig) {
            return this.d.F(deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final SettableBeanProperty[] G(DeserializationConfig deserializationConfig) {
            return this.d.G(deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Class H() {
            return this.d.H();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean c() {
            return this.d.c();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean d() {
            return this.d.d();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean e() {
            return this.d.e();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean f() {
            return this.d.f();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean g() {
            return this.d.g();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean h() {
            return this.d.h();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean i() {
            return this.d.i();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean j() {
            return this.d.j();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean k() {
            return this.d.k();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean l() {
            return this.d.l();
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final ValueInstantiator m(BeanDescription beanDescription, DeserializationContext deserializationContext) {
            ValueInstantiator valueInstantiator = this.d;
            ValueInstantiator valueInstantiatorM = valueInstantiator.m(beanDescription, deserializationContext);
            return valueInstantiatorM == valueInstantiator ? this : new Delegating(valueInstantiatorM);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object n(DeserializationContext deserializationContext, BigDecimal bigDecimal) {
            return this.d.n(deserializationContext, bigDecimal);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object o(DeserializationContext deserializationContext, BigInteger bigInteger) {
            return this.d.o(deserializationContext, bigInteger);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object p(DeserializationContext deserializationContext, boolean z) {
            return this.d.p(deserializationContext, z);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object q(DeserializationContext deserializationContext, double d) {
            return this.d.q(deserializationContext, d);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object r(DeserializationContext deserializationContext, int i) {
            return this.d.r(deserializationContext, i);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object s(DeserializationContext deserializationContext, long j) {
            return this.d.s(deserializationContext, j);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object t(DeserializationContext deserializationContext, SettableBeanProperty[] settableBeanPropertyArr, PropertyValueBuffer propertyValueBuffer) {
            return this.d.t(deserializationContext, settableBeanPropertyArr, propertyValueBuffer);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object u(DeserializationContext deserializationContext, Object[] objArr) {
            return this.d.u(deserializationContext, objArr);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object w(DeserializationContext deserializationContext, String str) {
            return this.d.w(deserializationContext, str);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object x(DeserializationContext deserializationContext, Object obj) {
            return this.d.x(deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object y(DeserializationContext deserializationContext) {
            return this.d.y(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object z(DeserializationContext deserializationContext, Object obj) {
            return this.d.z(deserializationContext, obj);
        }
    }

    public interface Gettable {
    }

    public AnnotatedWithParams B() {
        return null;
    }

    public JavaType C(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AnnotatedWithParams D() {
        return null;
    }

    public AnnotatedWithParams E() {
        return null;
    }

    public JavaType F(DeserializationConfig deserializationConfig) {
        return null;
    }

    public SettableBeanProperty[] G(DeserializationConfig deserializationConfig) {
        return null;
    }

    public Class H() {
        return Object.class;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this instanceof JsonLocationInstantiator;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return D() != null;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return j() || k() || i() || g() || h() || e() || f() || d() || c();
    }

    public ValueInstantiator m(BeanDescription beanDescription, DeserializationContext deserializationContext) {
        return this;
    }

    public Object n(DeserializationContext deserializationContext, BigDecimal bigDecimal) throws MismatchedInputException {
        deserializationContext.z(H(), this, "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)", bigDecimal);
        throw null;
    }

    public Object o(DeserializationContext deserializationContext, BigInteger bigInteger) throws MismatchedInputException {
        deserializationContext.z(H(), this, "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)", bigInteger);
        throw null;
    }

    public Object p(DeserializationContext deserializationContext, boolean z) throws MismatchedInputException {
        deserializationContext.z(H(), this, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z));
        throw null;
    }

    public Object q(DeserializationContext deserializationContext, double d) throws MismatchedInputException {
        deserializationContext.z(H(), this, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d));
        throw null;
    }

    public Object r(DeserializationContext deserializationContext, int i) throws MismatchedInputException {
        deserializationContext.z(H(), this, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i));
        throw null;
    }

    public Object s(DeserializationContext deserializationContext, long j) throws MismatchedInputException {
        deserializationContext.z(H(), this, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j));
        throw null;
    }

    public Object t(DeserializationContext deserializationContext, SettableBeanProperty[] settableBeanPropertyArr, PropertyValueBuffer propertyValueBuffer) throws MismatchedInputException {
        DeserializationContext deserializationContext2 = propertyValueBuffer.b;
        BitSet bitSet = propertyValueBuffer.g;
        Object[] objArr = propertyValueBuffer.d;
        if (propertyValueBuffer.e > 0) {
            if (bitSet != null) {
                int length = objArr.length;
                int i = 0;
                while (true) {
                    int iNextClearBit = bitSet.nextClearBit(i);
                    if (iNextClearBit >= length) {
                        break;
                    }
                    objArr[iNextClearBit] = propertyValueBuffer.a(settableBeanPropertyArr[iNextClearBit]);
                    i = iNextClearBit + 1;
                }
            } else {
                int i2 = propertyValueBuffer.f;
                int length2 = objArr.length;
                int i3 = 0;
                while (i3 < length2) {
                    if ((i2 & 1) == 0) {
                        objArr[i3] = propertyValueBuffer.a(settableBeanPropertyArr[i3]);
                    }
                    i3++;
                    i2 >>= 1;
                }
            }
        }
        if (deserializationContext2.N(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i4 = 0; i4 < settableBeanPropertyArr.length; i4++) {
                if (objArr[i4] == null) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i4];
                    deserializationContext2.U(settableBeanProperty, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", settableBeanProperty.f.d, Integer.valueOf(settableBeanProperty.l()));
                    throw null;
                }
            }
        }
        return u(deserializationContext, objArr);
    }

    public Object u(DeserializationContext deserializationContext, Object[] objArr) throws MismatchedInputException {
        deserializationContext.z(H(), this, "no creator with arguments specified", new Object[0]);
        throw null;
    }

    public Object w(DeserializationContext deserializationContext, String str) throws MismatchedInputException {
        Class clsH = H();
        JsonParser jsonParser = deserializationContext.i;
        deserializationContext.z(clsH, this, "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
        throw null;
    }

    public Object x(DeserializationContext deserializationContext, Object obj) throws MismatchedInputException {
        deserializationContext.z(H(), this, "no array delegate creator specified", new Object[0]);
        throw null;
    }

    public Object y(DeserializationContext deserializationContext) throws MismatchedInputException {
        deserializationContext.z(H(), this, "no default no-arguments constructor found", new Object[0]);
        throw null;
    }

    public Object z(DeserializationContext deserializationContext, Object obj) throws MismatchedInputException {
        deserializationContext.z(H(), this, "no delegate creator specified", new Object[0]);
        throw null;
    }

    public static class Base extends ValueInstantiator implements Serializable {
        public final Class d;

        public Base(JavaType javaType) {
            this.d = javaType.d;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Class H() {
            return this.d;
        }

        public Base(Class cls) {
            this.d = cls;
        }
    }
}
