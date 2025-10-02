package com.google.firebase.firestore;

/* loaded from: classes6.dex */
public class Filter {

    public static class CompositeFilter extends Filter {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }

    public static class UnaryFilter extends Filter {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }
}
