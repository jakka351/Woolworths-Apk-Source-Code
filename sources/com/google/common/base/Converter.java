package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class Converter<A, B> implements Function<A, B> {

    /* renamed from: com.google.common.base.Converter$1, reason: invalid class name */
    class AnonymousClass1 implements Iterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator<Object> iterator() {
            new Iterator<Object>() { // from class: com.google.common.base.Converter.1.1
                {
                    throw null;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    throw null;
                }

                @Override // java.util.Iterator
                public final Object next() {
                    AnonymousClass1.this.getClass();
                    throw null;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    throw null;
                }
            };
            throw null;
        }
    }

    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        @Override // com.google.common.base.Converter
        public final Object a(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (obj instanceof ConverterComposition) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.andThen(null)";
        }
    }

    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (obj instanceof FunctionBasedConverter) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Converter.from(null, null)";
        }
    }

    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        public static final Converter d = new IdentityConverter();

        private Object readResolve() {
            return d;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            return obj;
        }

        public final String toString() {
            return "Converter.identity()";
        }
    }

    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        @Override // com.google.common.base.Converter
        public final Object a(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (obj instanceof ReverseConverter) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.reverse()";
        }
    }

    public Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objB = b(obj);
        objB.getClass();
        return objB;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return a(obj);
    }

    public abstract Object b(Object obj);
}
