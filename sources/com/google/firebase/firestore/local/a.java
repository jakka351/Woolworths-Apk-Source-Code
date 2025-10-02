package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import java.util.Comparator;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int d;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                DocumentReference documentReference = (DocumentReference) obj;
                DocumentReference documentReference2 = (DocumentReference) obj2;
                int iCompareTo = documentReference.f15480a.compareTo(documentReference2.f15480a);
                return iCompareTo != 0 ? iCompareTo : Integer.compare(documentReference.b, documentReference2.b);
            case 1:
                DocumentReference documentReference3 = (DocumentReference) obj;
                DocumentReference documentReference4 = (DocumentReference) obj2;
                int iCompare = Integer.compare(documentReference3.b, documentReference4.b);
                return iCompare != 0 ? iCompare : documentReference3.f15480a.compareTo(documentReference4.f15480a);
            case 2:
                return ((Long) obj2).compareTo((Long) obj);
            case 3:
                FieldIndex fieldIndex = (FieldIndex) obj;
                FieldIndex fieldIndex2 = (FieldIndex) obj2;
                int iCompare2 = Long.compare(fieldIndex.f().d(), fieldIndex2.f().d());
                return iCompare2 == 0 ? fieldIndex.c().compareTo(fieldIndex2.c()) : iCompare2;
            default:
                return Integer.compare(((MutationBatch) obj).f15544a, ((MutationBatch) obj2).f15544a);
        }
    }
}
