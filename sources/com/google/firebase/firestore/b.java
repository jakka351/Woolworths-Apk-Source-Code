package com.google.firebase.firestore;

import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Function;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Function {
    public final /* synthetic */ FirebaseFirestore d;

    public /* synthetic */ b(FirebaseFirestore firebaseFirestore) {
        this.d = firebaseFirestore;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        FirestoreClient firestoreClient;
        FirebaseFirestore firebaseFirestore = this.d;
        AsyncQueue asyncQueue = (AsyncQueue) obj;
        synchronized (firebaseFirestore.i) {
            DatabaseId databaseId = firebaseFirestore.c;
            String str = firebaseFirestore.d;
            FirebaseFirestoreSettings firebaseFirestoreSettings = firebaseFirestore.h;
            firebaseFirestoreSettings.getClass();
            firestoreClient = new FirestoreClient(firebaseFirestore.b, new DatabaseInfo(databaseId, str), firebaseFirestore.e, firebaseFirestore.f, asyncQueue, firebaseFirestore.j, (ComponentProvider) firebaseFirestore.f15426a.apply(firebaseFirestoreSettings));
        }
        return firestoreClient;
    }
}
