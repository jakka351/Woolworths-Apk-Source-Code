package com.google.firebase.firestore.model;

import com.google.firestore.v1.Value;

/* loaded from: classes6.dex */
public interface Document {
    MutableDocument a();

    boolean b();

    SnapshotVersion c();

    Value d(FieldPath fieldPath);

    boolean e();

    boolean f();

    ObjectValue getData();

    DocumentKey getKey();
}
