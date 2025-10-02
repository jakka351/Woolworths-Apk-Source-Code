package androidx.paging;

import androidx.paging.LoadState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/MutableLoadStateCollection;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MutableLoadStateCollection {

    /* renamed from: a, reason: collision with root package name */
    public LoadState f3550a;
    public LoadState b;
    public LoadState c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MutableLoadStateCollection() {
        LoadState.NotLoading notLoading = LoadState.NotLoading.c;
        this.f3550a = notLoading;
        this.b = notLoading;
        this.c = notLoading;
    }

    public final LoadState a(LoadType loadType) {
        Intrinsics.h(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            return this.f3550a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(LoadStates states) {
        Intrinsics.h(states, "states");
        this.f3550a = states.f3547a;
        this.c = states.c;
        this.b = states.b;
    }

    public final void c(LoadType type, LoadState loadState) {
        Intrinsics.h(type, "type");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            this.f3550a = loadState;
        } else if (iOrdinal == 1) {
            this.b = loadState;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.c = loadState;
        }
    }

    public final LoadStates d() {
        return new LoadStates(this.f3550a, this.b, this.c);
    }
}
