package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;

/* loaded from: classes6.dex */
interface ReferenceDelegate {
    void b(DocumentKey documentKey);

    void c();

    void d(DocumentKey documentKey);

    long f();

    void k(TargetData targetData);

    void m(ReferenceSet referenceSet);

    void n(DocumentKey documentKey);

    void o(DocumentKey documentKey);

    void onTransactionCommitted();
}
