package com.google.firebase.database.collection;

import com.google.firebase.firestore.model.DocumentKey;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class ImmutableSortedMap<K, V> implements Iterable<Map.Entry<K, V>> {

    public static class Builder {

        public interface KeyTranslator<C, D> {
        }
    }

    public abstract boolean b(Object obj);

    public abstract Object d(DocumentKey documentKey);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableSortedMap)) {
            return false;
        }
        ImmutableSortedMap immutableSortedMap = (ImmutableSortedMap) obj;
        if (!g().equals(immutableSortedMap.g()) || size() != immutableSortedMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = immutableSortedMap.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Comparator g();

    public abstract Object h();

    public final int hashCode() {
        int iHashCode = g().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public abstract Object i();

    public abstract boolean isEmpty();

    public abstract ImmutableSortedMap j(Object obj, Object obj2);

    public abstract Iterator k(Object obj);

    public abstract ImmutableSortedMap l(Object obj);

    public abstract int size();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        boolean z = true;
        for (Map.Entry<K, V> entry : this) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
