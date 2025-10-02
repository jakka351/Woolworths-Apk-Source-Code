package com.google.firebase.firestore;

import com.google.firebase.firestore.util.Assert;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class QueryDocumentSnapshot extends DocumentSnapshot {
    @Override // com.google.firebase.firestore.DocumentSnapshot
    public final HashMap a() {
        HashMap mapA = super.a();
        Assert.b(mapA != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return mapA;
    }

    @Override // com.google.firebase.firestore.DocumentSnapshot
    public final Object b() {
        Object objC = c();
        Assert.b(objC != null, "Object in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return objC;
    }

    @Override // com.google.firebase.firestore.DocumentSnapshot
    public final Object c() {
        Object objC = super.c();
        Assert.b(objC != null, "Object in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return objC;
    }
}
