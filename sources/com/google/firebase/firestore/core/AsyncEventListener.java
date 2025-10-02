package com.google.firebase.firestore.core;

import androidx.camera.core.processing.g;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class AsyncEventListener<T> implements EventListener<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f15439a;
    public final com.google.firebase.firestore.a b;
    public volatile boolean c = false;

    public AsyncEventListener(Executor executor, com.google.firebase.firestore.a aVar) {
        this.f15439a = executor;
        this.b = aVar;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void a(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        this.f15439a.execute(new g(17, this, obj, firebaseFirestoreException));
    }
}
