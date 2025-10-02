package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/LoadState;", "", "Error", "Loading", "NotLoading", "Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState$NotLoading;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class LoadState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3546a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Error extends LoadState {
        public final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(false);
            Intrinsics.h(error, "error");
            this.b = error;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f3546a == error.f3546a && Intrinsics.c(this.b, error.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + Boolean.hashCode(this.f3546a);
        }

        public final String toString() {
            return "Error(endOfPaginationReached=" + this.f3546a + ", error=" + this.b + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Loading extends LoadState {
        public static final Loading b = new Loading(false);

        public final boolean equals(Object obj) {
            if (obj instanceof Loading) {
                return this.f3546a == ((Loading) obj).f3546a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3546a);
        }

        public final String toString() {
            return androidx.camera.core.impl.b.s(new StringBuilder("Loading(endOfPaginationReached="), this.f3546a, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/LoadState$NotLoading;", "Landroidx/paging/LoadState;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotLoading extends LoadState {
        public static final NotLoading b = new NotLoading(true);
        public static final NotLoading c = new NotLoading(false);

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/LoadState$NotLoading$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (obj instanceof NotLoading) {
                return this.f3546a == ((NotLoading) obj).f3546a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3546a);
        }

        public final String toString() {
            return androidx.camera.core.impl.b.s(new StringBuilder("NotLoading(endOfPaginationReached="), this.f3546a, ')');
        }
    }

    public LoadState(boolean z) {
        this.f3546a = z;
    }
}
