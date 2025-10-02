package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/ViewportHint;", "", "Access", "Initial", "Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint$Initial;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ViewportHint {

    /* renamed from: a, reason: collision with root package name */
    public final int f3592a;
    public final int b;
    public final int c;
    public final int d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Access extends ViewportHint {
        public final int e;
        public final int f;

        public Access(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6);
            this.e = i;
            this.f = i2;
        }

        @Override // androidx.paging.ViewportHint
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Access)) {
                return false;
            }
            Access access = (Access) obj;
            return this.e == access.e && this.f == access.f && this.f3592a == access.f3592a && this.b == access.b && this.c == access.c && this.d == access.d;
        }

        @Override // androidx.paging.ViewportHint
        public final int hashCode() {
            return Integer.hashCode(this.f) + Integer.hashCode(this.e) + super.hashCode();
        }

        public final String toString() {
            return StringsKt.n0("ViewportHint.Access(\n            |    pageOffset=" + this.e + ",\n            |    indexInPage=" + this.f + ",\n            |    presentedItemsBefore=" + this.f3592a + ",\n            |    presentedItemsAfter=" + this.b + ",\n            |    originalPageOffsetFirst=" + this.c + ",\n            |    originalPageOffsetLast=" + this.d + ",\n            |)");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/ViewportHint$Initial;", "Landroidx/paging/ViewportHint;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Initial extends ViewportHint {
        public final String toString() {
            return StringsKt.n0("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.f3592a + ",\n            |    presentedItemsAfter=" + this.b + ",\n            |    originalPageOffsetFirst=" + this.c + ",\n            |    originalPageOffsetLast=" + this.d + ",\n            |)");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ViewportHint(int i, int i2, int i3, int i4) {
        this.f3592a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a(LoadType loadType) {
        Intrinsics.h(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.f3592a;
        }
        if (iOrdinal == 2) {
            return this.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewportHint)) {
            return false;
        }
        ViewportHint viewportHint = (ViewportHint) obj;
        return this.f3592a == viewportHint.f3592a && this.b == viewportHint.b && this.c == viewportHint.c && this.d == viewportHint.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.f3592a);
    }
}
