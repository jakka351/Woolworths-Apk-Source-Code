package androidx.paging;

import androidx.paging.DataSource;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/PositionalDataSource;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/DataSource;", "", "Companion", "LoadInitialCallback", "LoadInitialParams", "LoadRangeCallback", "LoadRangeParams", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class PositionalDataSource<T> extends DataSource<Integer, T> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PositionalDataSource$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialCallback;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadInitialCallback<T> {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialParams;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadInitialParams {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeCallback;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadRangeCallback<T> {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeParams;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadRangeParams {
    }

    @Override // androidx.paging.DataSource
    public final Object b(Object obj) {
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    @Override // androidx.paging.DataSource
    public final Object e(DataSource.Params params, ContinuationImpl continuationImpl) {
        LoadType loadType = params.f3533a;
        boolean z = params.d;
        Object obj = params.b;
        int i = params.e;
        if (loadType != LoadType.d) {
            Intrinsics.e(obj);
            int iIntValue = ((Number) obj).intValue();
            if (params.f3533a == LoadType.e) {
                Math.min(i, iIntValue);
            }
            LoadRangeParams loadRangeParams = new LoadRangeParams();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
            cancellableContinuationImpl.o();
            h(loadRangeParams, new PositionalDataSource$loadRange$2$1());
            Object objN = cancellableContinuationImpl.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return objN;
        }
        int iMax = params.c;
        int iMax2 = 0;
        if (obj != null) {
            int iIntValue2 = ((Number) obj).intValue();
            if (z) {
                iMax = Math.max(iMax / i, 2) * i;
                iMax2 = Math.max(0, ((iIntValue2 - (iMax / 2)) / i) * i);
            } else {
                iMax2 = Math.max(0, iIntValue2 - (iMax / 2));
            }
        }
        LoadInitialParams loadInitialParams = new LoadInitialParams();
        if (iMax2 < 0) {
            throw new IllegalStateException(YU.a.d(iMax2, "invalid start position: ").toString());
        }
        if (iMax < 0) {
            throw new IllegalStateException(YU.a.d(iMax, "invalid load size: ").toString());
        }
        if (i < 0) {
            throw new IllegalStateException(YU.a.d(i, "invalid page size: ").toString());
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
        cancellableContinuationImpl2.o();
        g(loadInitialParams, new PositionalDataSource$loadInitial$2$1());
        Object objN2 = cancellableContinuationImpl2.n();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
        return objN2;
    }

    public abstract void g(LoadInitialParams loadInitialParams, LoadInitialCallback loadInitialCallback);

    public abstract void h(LoadRangeParams loadRangeParams, LoadRangeCallback loadRangeCallback);
}
