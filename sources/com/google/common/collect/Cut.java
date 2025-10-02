package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.medallia.digital.mobilesdk.q2;
import java.io.Serializable;
import java.lang.Comparable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    public final Comparable d;

    /* renamed from: com.google.common.collect.Cut$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14882a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f14882a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14882a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class AboveAll extends Cut<Comparable<?>> {
        public static final AboveAll e = new AboveAll("");

        private Object readResolve() {
            return e;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: b */
        public final int compareTo(Cut cut) {
            return cut == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((Cut) obj) == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        public final void d(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        public final Comparable e() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        public final Comparable f() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        public final boolean l(Comparable comparable) {
            return false;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable m() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final BoundType n() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public final BoundType o() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public final Cut p() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public final Cut q() {
            throw new IllegalStateException();
        }

        public final String toString() {
            return "+∞";
        }
    }

    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AboveValue(Comparable comparable) {
            super(comparable);
            comparable.getClass();
        }

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb) {
            sb.append('(');
            sb.append(this.d);
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public final void d(StringBuilder sb) {
            sb.append(this.d);
            sb.append(']');
        }

        @Override // com.google.common.collect.Cut
        public final Comparable f() {
            return this.d;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return ~this.d.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public final boolean l(Comparable comparable) {
            Range range = Range.f;
            return this.d.compareTo(comparable) < 0;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable m() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType n() {
            return BoundType.d;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType o() {
            return BoundType.e;
        }

        @Override // com.google.common.collect.Cut
        public final Cut p() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final Cut q() {
            return this;
        }

        public final String toString() {
            return q2.c + this.d + "\\";
        }
    }

    public static final class BelowAll extends Cut<Comparable<?>> {
        public static final BelowAll e = new BelowAll("");

        private Object readResolve() {
            return e;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: b */
        public final int compareTo(Cut cut) {
            return cut == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((Cut) obj) == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        public final void d(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final Comparable e() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        public final Comparable f() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        public final boolean l(Comparable comparable) {
            return true;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable m() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType n() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public final BoundType o() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public final Cut p() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public final Cut q() {
            throw new AssertionError("this statement should be unreachable");
        }

        public final String toString() {
            return "-∞";
        }
    }

    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb) {
            sb.append('[');
            sb.append(this.d);
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public final void d(StringBuilder sb) {
            sb.append(this.d);
            sb.append(')');
        }

        @Override // com.google.common.collect.Cut
        public final Comparable f() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public final boolean l(Comparable comparable) {
            Range range = Range.f;
            return this.d.compareTo(comparable) <= 0;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable m() {
            return this.d;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType n() {
            return BoundType.e;
        }

        @Override // com.google.common.collect.Cut
        public final BoundType o() {
            return BoundType.d;
        }

        @Override // com.google.common.collect.Cut
        public final Cut p() {
            return this;
        }

        @Override // com.google.common.collect.Cut
        public final Cut q() {
            throw null;
        }

        public final String toString() {
            return "\\" + this.d + q2.c;
        }
    }

    public Cut(Comparable comparable) {
        this.d = comparable;
    }

    public static BelowValue a(Comparable comparable) {
        comparable.getClass();
        return new BelowValue(comparable);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Cut cut) {
        if (cut == BelowAll.e) {
            return 1;
        }
        if (cut == AboveAll.e) {
            return -1;
        }
        Comparable comparable = cut.d;
        Range range = Range.f;
        int iCompareTo = this.d.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof AboveValue, cut instanceof AboveValue);
    }

    public abstract void c(StringBuilder sb);

    public abstract void d(StringBuilder sb);

    public Comparable e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Cut) {
            try {
                if (compareTo((Cut) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract Comparable f();

    public abstract int hashCode();

    public abstract boolean l(Comparable comparable);

    public abstract Comparable m();

    public abstract BoundType n();

    public abstract BoundType o();

    public abstract Cut p();

    public abstract Cut q();
}
