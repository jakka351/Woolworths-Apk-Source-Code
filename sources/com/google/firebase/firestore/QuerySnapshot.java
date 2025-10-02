package com.google.firebase.firestore;

import java.util.Iterator;

/* loaded from: classes6.dex */
public class QuerySnapshot implements Iterable<QueryDocumentSnapshot> {

    public class QuerySnapshotIterator implements Iterator<QueryDocumentSnapshot> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final QueryDocumentSnapshot next() {
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuerySnapshot) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // java.lang.Iterable
    public final Iterator<QueryDocumentSnapshot> iterator() {
        throw null;
    }
}
