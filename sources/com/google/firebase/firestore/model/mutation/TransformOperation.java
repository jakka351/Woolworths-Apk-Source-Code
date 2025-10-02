package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firestore.v1.Value;

/* loaded from: classes6.dex */
public interface TransformOperation {
    Value a(Value value, Timestamp timestamp);

    Value b(Value value, Value value2);
}
