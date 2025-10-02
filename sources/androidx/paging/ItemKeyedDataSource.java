package androidx.paging;

import androidx.paging.DataSource;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/paging/ItemKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "LoadCallback", "LoadInitialCallback", "LoadInitialParams", "LoadParams", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class ItemKeyedDataSource<Key, Value> extends DataSource<Key, Value> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "Value", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadCallback<Value> {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "Value", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadInitialCallback<Value> extends LoadCallback<Value> {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "", "Key", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadInitialParams<Key> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f3542a;

        public LoadInitialParams(Object obj) {
            this.f3542a = obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadParams;", "", "Key", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadParams<Key> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f3543a;

        public LoadParams(Object key) {
            Intrinsics.h(key, "key");
            this.f3543a = key;
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

    @Override // androidx.paging.DataSource
    public final Object b(Object obj) {
        return g(obj);
    }

    @Override // androidx.paging.DataSource
    public final Object e(DataSource.Params params, ContinuationImpl continuationImpl) {
        LoadType loadType = params.f3533a;
        Object obj = params.b;
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            LoadInitialParams loadInitialParams = new LoadInitialParams(obj);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
            cancellableContinuationImpl.o();
            j(loadInitialParams, new ItemKeyedDataSource$loadInitial$2$1());
            Object objN = cancellableContinuationImpl.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return objN;
        }
        if (iOrdinal == 1) {
            Intrinsics.e(obj);
            LoadParams loadParams = new LoadParams(obj);
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
            cancellableContinuationImpl2.o();
            i(loadParams, new ItemKeyedDataSource$asCallback$1());
            Object objN2 = cancellableContinuationImpl2.n();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
            return objN2;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.e(obj);
        LoadParams loadParams2 = new LoadParams(obj);
        CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
        cancellableContinuationImpl3.o();
        h(loadParams2, new ItemKeyedDataSource$asCallback$1());
        Object objN3 = cancellableContinuationImpl3.n();
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.d;
        return objN3;
    }

    public abstract Object g(Object obj);

    public abstract void h(LoadParams loadParams, LoadCallback loadCallback);

    public abstract void i(LoadParams loadParams, LoadCallback loadCallback);

    public abstract void j(LoadInitialParams loadInitialParams, LoadInitialCallback loadInitialCallback);
}
