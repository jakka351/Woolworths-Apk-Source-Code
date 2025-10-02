package com.google.firebase.firestore.index;

import com.google.firebase.firestore.model.DocumentKey;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class AutoValue_IndexEntry extends IndexEntry {
    public final int d;
    public final DocumentKey e;
    public final byte[] f;
    public final byte[] g;

    public AutoValue_IndexEntry(int i, DocumentKey documentKey, byte[] bArr, byte[] bArr2) {
        this.d = i;
        if (documentKey == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.e = documentKey;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.f = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.g = bArr2;
    }

    @Override // com.google.firebase.firestore.index.IndexEntry
    public final byte[] b() {
        return this.f;
    }

    @Override // com.google.firebase.firestore.index.IndexEntry
    public final byte[] c() {
        return this.g;
    }

    @Override // com.google.firebase.firestore.index.IndexEntry
    public final DocumentKey d() {
        return this.e;
    }

    @Override // com.google.firebase.firestore.index.IndexEntry
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IndexEntry)) {
            return false;
        }
        IndexEntry indexEntry = (IndexEntry) obj;
        if (this.d != indexEntry.e() || !this.e.equals(indexEntry.d())) {
            return false;
        }
        boolean z = indexEntry instanceof AutoValue_IndexEntry;
        if (Arrays.equals(this.f, z ? ((AutoValue_IndexEntry) indexEntry).f : indexEntry.b())) {
            return Arrays.equals(this.g, z ? ((AutoValue_IndexEntry) indexEntry).g : indexEntry.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.e.d.hashCode()) * 1000003) ^ Arrays.hashCode(this.f)) * 1000003) ^ Arrays.hashCode(this.g);
    }

    public final String toString() {
        return "IndexEntry{indexId=" + this.d + ", documentKey=" + this.e + ", arrayValue=" + Arrays.toString(this.f) + ", directionalValue=" + Arrays.toString(this.g) + "}";
    }
}
