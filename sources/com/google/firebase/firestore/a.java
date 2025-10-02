package com.google.firebase.firestore;

import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.util.Assert;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements EventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DocumentReference f15433a;
    public final /* synthetic */ EventListener b;

    public /* synthetic */ a(DocumentReference documentReference, EventListener eventListener) {
        this.f15433a = documentReference;
        this.b = eventListener;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void a(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        DocumentSnapshot documentSnapshot;
        ViewSnapshot viewSnapshot = (ViewSnapshot) obj;
        EventListener eventListener = this.b;
        if (firebaseFirestoreException != null) {
            eventListener.a(null, firebaseFirestoreException);
            return;
        }
        Assert.b(viewSnapshot != null, "Got event without value or error set", new Object[0]);
        Assert.b(viewSnapshot.b.d.size() <= 1, "Too many documents returned on a document query", new Object[0]);
        DocumentSet documentSet = viewSnapshot.b;
        DocumentReference documentReference = this.f15433a;
        Document document = (Document) documentSet.d.d(documentReference.f15424a);
        if (document != null) {
            documentSnapshot = new DocumentSnapshot(documentReference.b, document.getKey(), document, viewSnapshot.e, viewSnapshot.f.d.b(document.getKey()));
        } else {
            documentSnapshot = new DocumentSnapshot(documentReference.b, documentReference.f15424a, null, viewSnapshot.e, false);
        }
        eventListener.a(documentSnapshot, null);
    }
}
