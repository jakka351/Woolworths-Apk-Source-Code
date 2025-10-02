package com.google.firebase.firestore;

/* loaded from: classes6.dex */
public final class TransactionOptions {

    public static final class Builder {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransactionOptions.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 5;
    }

    public final String toString() {
        return "TransactionOptions{maxAttempts=5}";
    }
}
