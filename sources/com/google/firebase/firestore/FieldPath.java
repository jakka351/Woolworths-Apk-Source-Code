package com.google.firebase.firestore;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class FieldPath {
    static {
        Pattern.compile("[~*/\\[\\]]");
        com.google.firebase.firestore.model.FieldPath fieldPath = com.google.firebase.firestore.model.FieldPath.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldPath.class != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
