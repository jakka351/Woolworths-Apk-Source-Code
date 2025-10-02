package com.google.firebase.firestore.model;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class DocumentSet implements Iterable<Document> {
    public final ImmutableSortedMap d;
    public final ImmutableSortedSet e;

    public DocumentSet(ImmutableSortedMap immutableSortedMap, ImmutableSortedSet immutableSortedSet) {
        this.d = immutableSortedMap;
        this.e = immutableSortedSet;
    }

    public final DocumentSet b(DocumentKey documentKey) {
        ImmutableSortedMap immutableSortedMap = this.d;
        Document document = (Document) immutableSortedMap.d(documentKey);
        return document == null ? this : new DocumentSet(immutableSortedMap.l(documentKey), this.e.g(document));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DocumentSet.class != obj.getClass()) {
            return false;
        }
        DocumentSet documentSet = (DocumentSet) obj;
        if (this.d.size() != documentSet.d.size()) {
            return false;
        }
        Iterator it = this.e.iterator();
        Iterator it2 = documentSet.e.iterator();
        while (it.hasNext()) {
            if (!((Document) it.next()).equals((Document) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.e.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Document document = (Document) it.next();
            iHashCode = document.getData().hashCode() + ((document.getKey().d.hashCode() + (iHashCode * 31)) * 31);
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator<Document> iterator() {
        return this.e.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.e.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Document document = (Document) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(document);
        }
        sb.append("]");
        return sb.toString();
    }
}
