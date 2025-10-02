package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.ServerTimestamps;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public class ServerTimestampOperation implements TransformOperation {

    /* renamed from: a, reason: collision with root package name */
    public static final ServerTimestampOperation f15549a = new ServerTimestampOperation();

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public final Value a(Value value, Timestamp timestamp) {
        Value.Builder builderJ0 = Value.j0();
        builderJ0.p();
        Value.M((Value) builderJ0.e, "server_timestamp");
        Value value2 = (Value) builderJ0.m();
        Value.Builder builderJ02 = Value.j0();
        Timestamp.Builder builderQ = com.google.protobuf.Timestamp.Q();
        long j = timestamp.d;
        builderQ.p();
        com.google.protobuf.Timestamp.L((com.google.protobuf.Timestamp) builderQ.e, j);
        int i = timestamp.e;
        builderQ.p();
        com.google.protobuf.Timestamp.M((com.google.protobuf.Timestamp) builderQ.e, i);
        builderJ02.p();
        Value.L((Value) builderJ02.e, (com.google.protobuf.Timestamp) builderQ.m());
        Value value3 = (Value) builderJ02.m();
        MapValue.Builder builderR = MapValue.R();
        builderR.t(value2, "__type__");
        builderR.t(value3, "__local_write_time__");
        if (ServerTimestamps.c(value)) {
            value = ServerTimestamps.b(value);
        }
        if (value != null) {
            builderR.t(value, "__previous_value__");
        }
        Value.Builder builderJ03 = Value.j0();
        builderJ03.t(builderR);
        return (Value) builderJ03.m();
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public final Value b(Value value, Value value2) {
        return value2;
    }
}
