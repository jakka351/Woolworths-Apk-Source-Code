package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Values;
import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.Internal;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class ArrayTransformOperation implements TransformOperation {

    /* renamed from: a, reason: collision with root package name */
    public final List f15539a;

    public static class Remove extends ArrayTransformOperation {
        @Override // com.google.firebase.firestore.model.mutation.ArrayTransformOperation
        public final Value c(Value value) {
            ArrayValue.Builder builderR = Values.f(value) ? (ArrayValue.Builder) value.W().toBuilder() : ArrayValue.R();
            for (Value value2 : this.f15539a) {
                int i = 0;
                while (i < ((ArrayValue) builderR.e).Q()) {
                    if (Values.e(((ArrayValue) builderR.e).P(i), value2)) {
                        builderR.p();
                        ArrayValue.N((ArrayValue) builderR.e, i);
                    } else {
                        i++;
                    }
                }
            }
            Value.Builder builderJ0 = Value.j0();
            builderJ0.p();
            Value.Q((ArrayValue) builderR.m(), (Value) builderJ0.e);
            return (Value) builderJ0.m();
        }
    }

    public static class Union extends ArrayTransformOperation {
        @Override // com.google.firebase.firestore.model.mutation.ArrayTransformOperation
        public final Value c(Value value) {
            ArrayValue.Builder builderR = Values.f(value) ? (ArrayValue.Builder) value.W().toBuilder() : ArrayValue.R();
            for (Value value2 : this.f15539a) {
                if (!Values.d(builderR, value2)) {
                    builderR.p();
                    ArrayValue.L((ArrayValue) builderR.e, value2);
                }
            }
            Value.Builder builderJ0 = Value.j0();
            builderJ0.p();
            Value.Q((ArrayValue) builderR.m(), (Value) builderJ0.e);
            return (Value) builderJ0.m();
        }
    }

    public ArrayTransformOperation(Internal.ProtobufList protobufList) {
        this.f15539a = Collections.unmodifiableList(protobufList);
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public final Value a(Value value, Timestamp timestamp) {
        return c(value);
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public final Value b(Value value, Value value2) {
        return c(value);
    }

    public abstract Value c(Value value);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f15539a.equals(((ArrayTransformOperation) obj).f15539a);
    }

    public final int hashCode() {
        return this.f15539a.hashCode() + (getClass().hashCode() * 31);
    }
}
