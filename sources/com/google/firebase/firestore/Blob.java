package com.google.firebase.firestore;

import com.google.firebase.firestore.util.Util;
import com.google.protobuf.ByteString;

/* loaded from: classes6.dex */
public class Blob implements Comparable<Blob> {
    public final ByteString d;

    public Blob(ByteString byteString) {
        this.d = byteString;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Blob blob) {
        return Util.c(this.d, blob.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Blob) {
            return this.d.equals(((Blob) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Blob { bytes=" + Util.h(this.d) + " }";
    }
}
