package com.google.firebase.firestore.local;

import android.util.SparseArray;

/* loaded from: classes6.dex */
public interface LruDelegate {
    LruGarbageCollector a();

    long e();

    void g(k kVar);

    int h(long j);

    void i(k kVar);

    int j(long j, SparseArray sparseArray);

    long l();
}
