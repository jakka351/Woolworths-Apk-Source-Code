package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class ReferenceSet {

    /* renamed from: a, reason: collision with root package name */
    public ImmutableSortedSet f15506a;
    public ImmutableSortedSet b;

    public ReferenceSet() {
        List list = Collections.EMPTY_LIST;
        this.f15506a = new ImmutableSortedSet(list, DocumentReference.c);
        this.b = new ImmutableSortedSet(list, DocumentReference.d);
    }

    public final void a(DocumentKey documentKey, int i) {
        DocumentReference documentReference = new DocumentReference(documentKey, i);
        this.f15506a = this.f15506a.b(documentReference);
        this.b = this.b.b(documentReference);
    }

    public final boolean b(DocumentKey documentKey) {
        Iterator itD = this.f15506a.d(new DocumentReference(documentKey, 0));
        if (itD.hasNext()) {
            return ((DocumentReference) itD.next()).f15480a.equals(documentKey);
        }
        return false;
    }

    public final ImmutableSortedSet c(int i) {
        Iterator itD = this.b.d(new DocumentReference(DocumentKey.b(), i));
        ImmutableSortedSet immutableSortedSetB = DocumentKey.f;
        while (itD.hasNext()) {
            DocumentReference documentReference = (DocumentReference) itD.next();
            if (documentReference.b != i) {
                break;
            }
            immutableSortedSetB = immutableSortedSetB.b(documentReference.f15480a);
        }
        return immutableSortedSetB;
    }

    public final void d(DocumentKey documentKey, int i) {
        DocumentReference documentReference = new DocumentReference(documentKey, i);
        this.f15506a = this.f15506a.g(documentReference);
        this.b = this.b.g(documentReference);
    }

    public final ImmutableSortedSet e(int i) {
        Iterator itD = this.b.d(new DocumentReference(DocumentKey.b(), i));
        ImmutableSortedSet immutableSortedSetB = DocumentKey.f;
        while (itD.hasNext()) {
            DocumentReference documentReference = (DocumentReference) itD.next();
            if (documentReference.b != i) {
                break;
            }
            immutableSortedSetB = immutableSortedSetB.b(documentReference.f15480a);
            this.f15506a = this.f15506a.g(documentReference);
            this.b = this.b.g(documentReference);
        }
        return immutableSortedSetB;
    }
}
