package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
public final class Suppliers {

    @VisibleForTesting
    /* loaded from: classes6.dex */
    public static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        public transient Object d;

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.d = new Object();
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }

        public final String toString() {
            return "Suppliers.memoizeWithExpiration(null, 0, NANOS)";
        }
    }

    @VisibleForTesting
    public static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        public transient Object d = new Object();
        public final Supplier e;
        public volatile transient boolean f;
        public transient Object g;

        public MemoizingSupplier(Supplier supplier) {
            this.e = supplier;
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.d = new Object();
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            if (!this.f) {
                synchronized (this.d) {
                    try {
                        if (!this.f) {
                            Object obj = this.e.get();
                            this.g = obj;
                            this.f = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return this.g;
        }

        public final String toString() {
            Object objO;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (this.f) {
                objO = android.support.v4.media.session.a.o(this.g, ">", new StringBuilder("<supplier that returned "));
            } else {
                objO = this.e;
            }
            return android.support.v4.media.session.a.o(objO, ")", sb);
        }
    }

    @VisibleForTesting
    public static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {
        public static final a g = new a();
        public final Object d = new Object();
        public volatile Supplier e;
        public Object f;

        public NonSerializableMemoizingSupplier(Supplier supplier) {
            this.e = supplier;
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            Supplier supplier = this.e;
            a aVar = g;
            if (supplier != aVar) {
                synchronized (this.d) {
                    try {
                        if (this.e != aVar) {
                            Object obj = this.e.get();
                            this.f = obj;
                            this.e = aVar;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return this.f;
        }

        public final String toString() {
            Object objO = this.e;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (objO == g) {
                objO = android.support.v4.media.session.a.o(this.f, ">", new StringBuilder("<supplier that returned "));
            }
            return android.support.v4.media.session.a.o(objO, ")", sb);
        }
    }

    /* loaded from: classes6.dex */
    public static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        public final boolean equals(Object obj) {
            if (obj instanceof SupplierComposition) {
                throw null;
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "Suppliers.compose(null, null)";
        }
    }

    /* loaded from: classes6.dex */
    public interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public static final class SupplierFunctionImpl implements SupplierFunction<Object> {
        public static final /* synthetic */ SupplierFunctionImpl[] d = {new SupplierFunctionImpl("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        SupplierFunctionImpl EF5;

        public static SupplierFunctionImpl valueOf(String str) {
            return (SupplierFunctionImpl) Enum.valueOf(SupplierFunctionImpl.class, str);
        }

        public static SupplierFunctionImpl[] values() {
            return (SupplierFunctionImpl[]) d.clone();
        }

        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return ((Supplier) obj).get();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    public static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        public final Object d;

        public SupplierOfInstance(Object obj) {
            this.d = obj;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.a(this.d, ((SupplierOfInstance) obj).d);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        public final Object get() {
            return this.d;
        }

        public final int hashCode() {
            return Objects.b(this.d);
        }

        public final String toString() {
            return android.support.v4.media.session.a.o(this.d, ")", new StringBuilder("Suppliers.ofInstance("));
        }
    }

    @J2ktIncompatible
    /* loaded from: classes6.dex */
    public static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }

        public final String toString() {
            return "Suppliers.synchronizedSupplier(null)";
        }
    }

    public static Supplier a(Supplier supplier) {
        return ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) ? supplier : supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    public static Supplier b(Object obj) {
        return new SupplierOfInstance(obj);
    }
}
