package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Predicates {

    public static class AndPredicate<T> implements Predicate<T>, Serializable {
        public final List d;

        public AndPredicate(List list) {
            this.d = list;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            int i = 0;
            while (true) {
                List list = this.d;
                if (i >= list.size()) {
                    return true;
                }
                if (!((Predicate) list.get(i)).apply(obj)) {
                    return false;
                }
                i++;
            }
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.d.equals(((AndPredicate) obj).d);
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + 306654252;
        }

        public final String toString() {
            return Predicates.a(this.d, "and");
        }
    }

    public static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {
        public final Predicate d;
        public final Function e;

        public CompositionPredicate(Predicate predicate, Function function) {
            predicate.getClass();
            this.d = predicate;
            this.e = function;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return this.d.apply(this.e.apply(obj));
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof CompositionPredicate) {
                CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
                if (this.e.equals(compositionPredicate.e) && this.d.equals(compositionPredicate.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() ^ this.d.hashCode();
        }

        public final String toString() {
            return this.d + "(" + this.e + ")";
        }
    }

    @GwtIncompatible
    public static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public final String toString() {
            throw null;
        }
    }

    @GwtIncompatible
    public static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof ContainsPatternPredicate) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public String toString() {
            MoreObjects.b(null);
            throw null;
        }
    }

    public static class InPredicate<T> implements Predicate<T>, Serializable {
        public final Collection d;

        public InPredicate(Collection collection) {
            collection.getClass();
            this.d = collection;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            try {
                return this.d.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.d.equals(((InPredicate) obj).d);
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "Predicates.in(" + this.d + ")";
        }
    }

    @GwtIncompatible
    public static class InstanceOfPredicate<T> implements Predicate<T>, Serializable {
        public final Class d;

        public InstanceOfPredicate(Class cls) {
            cls.getClass();
            this.d = cls;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return this.d.isInstance(obj);
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.d == ((InstanceOfPredicate) obj).d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.f(this.d, new StringBuilder("Predicates.instanceOf("), ")");
        }
    }

    public static class IsEqualToPredicate implements Predicate<Object>, Serializable {
        public final Object d;

        public IsEqualToPredicate(Object obj) {
            this.d = obj;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return this.d.equals(obj);
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.d.equals(((IsEqualToPredicate) obj).d);
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return android.support.v4.media.session.a.o(this.d, ")", new StringBuilder("Predicates.equalTo("));
        }
    }

    public static class NotPredicate<T> implements Predicate<T>, Serializable {
        public final Object d;

        public NotPredicate(Predicate predicate) {
            this.d = predicate;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return !this.d.apply(obj);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.d.equals(((NotPredicate) obj).d);
            }
            return false;
        }

        public final int hashCode() {
            return ~this.d.hashCode();
        }

        public final String toString() {
            return android.support.v4.media.session.a.o(this.d, ")", new StringBuilder("Predicates.not("));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ObjectPredicate implements Predicate<Object> {
        public static final /* synthetic */ ObjectPredicate[] d = {new ObjectPredicate() { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        }, new ObjectPredicate() { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new ObjectPredicate() { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new ObjectPredicate() { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};

        /* JADX INFO: Fake field, exist only in values array */
        ObjectPredicate EF2;

        public static ObjectPredicate valueOf(String str) {
            return (ObjectPredicate) Enum.valueOf(ObjectPredicate.class, str);
        }

        public static ObjectPredicate[] values() {
            return (ObjectPredicate[]) d.clone();
        }
    }

    public static class OrPredicate<T> implements Predicate<T>, Serializable {
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof OrPredicate) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return Predicates.a(null, "or");
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    public static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            return obj instanceof SubtypeOfPredicate;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static String a(Iterable iterable, String str) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public static Predicate b(Predicate predicate, Predicate predicate2) {
        predicate.getClass();
        predicate2.getClass();
        return new AndPredicate(Arrays.asList(predicate, predicate2));
    }

    public static Predicate c(Predicate predicate, Function function) {
        return new CompositionPredicate(predicate, function);
    }

    public static Predicate d(Object obj) {
        return new IsEqualToPredicate(obj);
    }

    public static Predicate e(Collection collection) {
        return new InPredicate(collection);
    }

    public static Predicate f(Class cls) {
        return new InstanceOfPredicate(cls);
    }

    public static Predicate g(Predicate predicate) {
        return new NotPredicate(predicate);
    }
}
