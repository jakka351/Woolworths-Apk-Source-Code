package com.google.firebase.firestore;

import androidx.camera.core.processing.f;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.QueryListener;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class DocumentReference {

    /* renamed from: a, reason: collision with root package name */
    public final DocumentKey f15424a;
    public final FirebaseFirestore b;

    public DocumentReference(DocumentKey documentKey, FirebaseFirestore firebaseFirestore) {
        documentKey.getClass();
        this.f15424a = documentKey;
        this.b = firebaseFirestore;
    }

    public final f a(Executor executor, EventListener eventListener) {
        f fVar;
        Preconditions.a(executor, "Provided executor must not be null.");
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        listenOptions.f15449a = false;
        listenOptions.b = false;
        AsyncEventListener asyncEventListener = new AsyncEventListener(executor, new a(this, eventListener));
        ResourcePath resourcePath = this.f15424a.d;
        List list = Collections.EMPTY_LIST;
        com.google.firebase.firestore.core.Query query = new com.google.firebase.firestore.core.Query(resourcePath);
        FirestoreClientProvider firestoreClientProvider = this.b.i;
        synchronized (firestoreClientProvider) {
            firestoreClientProvider.a();
            FirestoreClient firestoreClient = firestoreClientProvider.b;
            synchronized (firestoreClient.d.f15594a) {
            }
            QueryListener queryListener = new QueryListener(query, listenOptions, asyncEventListener);
            firestoreClient.d.b(new com.google.firebase.firestore.core.b(firestoreClient, queryListener, 1));
            fVar = new f(9, asyncEventListener, firestoreClient, queryListener);
        }
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentReference)) {
            return false;
        }
        DocumentReference documentReference = (DocumentReference) obj;
        return this.f15424a.equals(documentReference.f15424a) && this.b.equals(documentReference.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15424a.d.hashCode() * 31);
    }
}
