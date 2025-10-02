package com.google.firebase.firestore;

import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.AsyncQueue;

/* loaded from: classes6.dex */
final class FirestoreClientProvider {

    /* renamed from: a, reason: collision with root package name */
    public final b f15427a;
    public FirestoreClient b;
    public final AsyncQueue c = new AsyncQueue();

    public FirestoreClientProvider(b bVar) {
        this.f15427a = bVar;
    }

    public final synchronized void a() {
        if (this.b == null) {
            this.b = (FirestoreClient) this.f15427a.apply(this.c);
        }
    }
}
