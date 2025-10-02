package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {
        public static final Equals d = new Equals();

        private Object readResolve() {
            return d;
        }

        @Override // com.google.common.base.Equivalence
        public final boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        public final int b(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EquivalentToPredicate) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "null.equivalentTo(null)";
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {
        public static final Identity d = new Identity();

        private Object readResolve() {
            return d;
        }

        @Override // com.google.common.base.Equivalence
        public final boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        public final int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Wrapper) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.wrap(null)";
        }
    }

    public static Equivalence c() {
        return Equals.d;
    }

    public static Equivalence e() {
        return Identity.d;
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract int b(Object obj);

    public final boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }
}
