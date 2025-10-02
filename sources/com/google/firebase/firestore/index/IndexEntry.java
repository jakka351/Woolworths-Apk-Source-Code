package com.google.firebase.firestore.index;

import com.google.auto.value.AutoValue;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Util;

@AutoValue
/* loaded from: classes6.dex */
public abstract class IndexEntry implements Comparable<IndexEntry> {
    public static IndexEntry a(int i, DocumentKey documentKey, byte[] bArr, byte[] bArr2) {
        return new AutoValue_IndexEntry(i, documentKey, bArr, bArr2);
    }

    public abstract byte[] b();

    public abstract byte[] c();

    @Override // java.lang.Comparable
    public final int compareTo(IndexEntry indexEntry) {
        IndexEntry indexEntry2 = indexEntry;
        int iCompare = Integer.compare(e(), indexEntry2.e());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = d().compareTo(indexEntry2.d());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iB = Util.b(b(), indexEntry2.b());
        return iB != 0 ? iB : Util.b(c(), indexEntry2.c());
    }

    public abstract DocumentKey d();

    public abstract int e();
}
