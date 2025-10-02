package com.google.firebase.firestore;

import android.util.SparseArray;
import com.google.firebase.FirebaseException;

/* loaded from: classes6.dex */
public class FirebaseFirestoreException extends FirebaseException {

    public enum Code {
        OK(0),
        /* JADX INFO: Fake field, exist only in values array */
        CANCELLED(1),
        UNKNOWN(2),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_ARGUMENT(3),
        /* JADX INFO: Fake field, exist only in values array */
        DEADLINE_EXCEEDED(4),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_FOUND(5),
        /* JADX INFO: Fake field, exist only in values array */
        ALREADY_EXISTS(6),
        /* JADX INFO: Fake field, exist only in values array */
        PERMISSION_DENIED(7),
        /* JADX INFO: Fake field, exist only in values array */
        RESOURCE_EXHAUSTED(8),
        /* JADX INFO: Fake field, exist only in values array */
        FAILED_PRECONDITION(9),
        /* JADX INFO: Fake field, exist only in values array */
        ABORTED(10),
        /* JADX INFO: Fake field, exist only in values array */
        OUT_OF_RANGE(11),
        /* JADX INFO: Fake field, exist only in values array */
        UNIMPLEMENTED(12),
        /* JADX INFO: Fake field, exist only in values array */
        INTERNAL(13),
        /* JADX INFO: Fake field, exist only in values array */
        UNAVAILABLE(14),
        /* JADX INFO: Fake field, exist only in values array */
        DATA_LOSS(15),
        /* JADX INFO: Fake field, exist only in values array */
        UNAUTHENTICATED(16);

        public static final SparseArray g;
        public final int d;

        static {
            SparseArray sparseArray = new SparseArray();
            for (Code code : values()) {
                Code code2 = (Code) sparseArray.get(code.d);
                if (code2 != null) {
                    throw new IllegalStateException("Code value duplication between " + code2 + "&" + code.name());
                }
                sparseArray.put(code.d, code);
            }
            g = sparseArray;
        }

        Code(int i) {
            this.d = i;
        }
    }
}
