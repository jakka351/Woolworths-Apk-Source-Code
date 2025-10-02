package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ComparisonChain {

    /* renamed from: a, reason: collision with root package name */
    public static final ComparisonChain f14880a = new AnonymousClass1();
    public static final ComparisonChain b = new InactiveComparisonChain(-1);
    public static final ComparisonChain c = new InactiveComparisonChain(1);

    /* renamed from: com.google.common.collect.ComparisonChain$1, reason: invalid class name */
    public class AnonymousClass1 extends ComparisonChain {
        public static ComparisonChain g(int i) {
            return i < 0 ? ComparisonChain.b : i > 0 ? ComparisonChain.c : ComparisonChain.f14880a;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain a(int i, int i2) {
            return g(Integer.compare(i, i2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain b(Comparable comparable, Comparable comparable2) {
            return g(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain c(Object obj, Object obj2, Comparator comparator) {
            return g(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain d(boolean z, boolean z2) {
            return g(Boolean.compare(z, z2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain e(boolean z, boolean z2) {
            return g(Boolean.compare(z2, z));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final int f() {
            return 0;
        }
    }

    public static final class InactiveComparisonChain extends ComparisonChain {
        public final int d;

        public InactiveComparisonChain(int i) {
            this.d = i;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain a(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain b(Comparable comparable, Comparable comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain c(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain d(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain e(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final int f() {
            return this.d;
        }
    }

    public abstract ComparisonChain a(int i, int i2);

    public abstract ComparisonChain b(Comparable comparable, Comparable comparable2);

    public abstract ComparisonChain c(Object obj, Object obj2, Comparator comparator);

    public abstract ComparisonChain d(boolean z, boolean z2);

    public abstract ComparisonChain e(boolean z, boolean z2);

    public abstract int f();
}
