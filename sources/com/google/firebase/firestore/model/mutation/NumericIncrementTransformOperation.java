package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.v1.Value;

/* loaded from: classes6.dex */
public class NumericIncrementTransformOperation implements TransformOperation {

    /* renamed from: a, reason: collision with root package name */
    public Value f15547a;

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public final Value a(Value value, Timestamp timestamp) {
        Value value2;
        long jC0;
        Value value3 = this.f15547a;
        if (Values.h(value) || Values.g(value)) {
            value2 = value;
        } else {
            Value.Builder builderJ0 = Value.j0();
            builderJ0.p();
            Value.U((Value) builderJ0.e, 0L);
            value2 = (Value) builderJ0.m();
        }
        if (!Values.h(value2) || !Values.h(value3)) {
            if (Values.h(value2)) {
                double dC = c() + value2.c0();
                Value.Builder builderJ02 = Value.j0();
                builderJ02.p();
                Value.V((Value) builderJ02.e, dC);
                return (Value) builderJ02.m();
            }
            Assert.b(Values.g(value2), "Expected NumberValue to be of type DoubleValue, but was ", value.getClass().getCanonicalName());
            double dC2 = c() + value2.a0();
            Value.Builder builderJ03 = Value.j0();
            builderJ03.p();
            Value.V((Value) builderJ03.e, dC2);
            return (Value) builderJ03.m();
        }
        long jC02 = value2.c0();
        if (Values.g(value3)) {
            jC0 = (long) value3.a0();
        } else {
            if (!Values.h(value3)) {
                Assert.a("Expected 'operand' to be of Number type, but was " + value3.getClass().getCanonicalName(), new Object[0]);
                throw null;
            }
            jC0 = value3.c0();
        }
        long j = jC02 + jC0;
        if (((jC0 ^ j) & (jC02 ^ j)) < 0) {
            j = j >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        Value.Builder builderJ04 = Value.j0();
        builderJ04.p();
        Value.U((Value) builderJ04.e, j);
        return (Value) builderJ04.m();
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public final Value b(Value value, Value value2) {
        return value2;
    }

    public final double c() {
        Value value = this.f15547a;
        if (Values.g(value)) {
            return value.a0();
        }
        if (Values.h(value)) {
            return value.c0();
        }
        Assert.a("Expected 'operand' to be of Number type, but was " + value.getClass().getCanonicalName(), new Object[0]);
        throw null;
    }
}
