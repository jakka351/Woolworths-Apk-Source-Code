package androidx.paging;

import androidx.paging.LoadState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/LoadStates;", "", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoadStates {
    public static final LoadStates d;

    /* renamed from: a, reason: collision with root package name */
    public final LoadState f3547a;
    public final LoadState b;
    public final LoadState c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/LoadStates$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        LoadState.NotLoading notLoading = LoadState.NotLoading.c;
        d = new LoadStates(notLoading, notLoading, notLoading);
    }

    public LoadStates(LoadState loadState, LoadState loadState2, LoadState loadState3) {
        this.f3547a = loadState;
        this.b = loadState2;
        this.c = loadState3;
    }

    public static LoadStates a(LoadStates loadStates, int i) {
        int i2 = i & 1;
        LoadState loadState = LoadState.NotLoading.c;
        LoadState loadState2 = i2 != 0 ? loadStates.f3547a : loadState;
        LoadState loadState3 = (i & 2) != 0 ? loadStates.b : loadState;
        if ((i & 4) != 0) {
            loadState = loadStates.c;
        }
        return new LoadStates(loadState2, loadState3, loadState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadStates)) {
            return false;
        }
        LoadStates loadStates = (LoadStates) obj;
        return Intrinsics.c(this.f3547a, loadStates.f3547a) && Intrinsics.c(this.b, loadStates.b) && Intrinsics.c(this.c, loadStates.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f3547a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f3547a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
