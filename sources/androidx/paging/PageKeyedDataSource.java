package androidx.paging;

import androidx.paging.DataSource;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/paging/PageKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "LoadCallback", "LoadInitialCallback", "LoadInitialParams", "LoadParams", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class PageKeyedDataSource<Key, Value> extends DataSource<Key, Value> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadCallback;", "Key", "Value", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadCallback<Key, Value> {
        public abstract void a(Object obj, List list);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "Key", "Value", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadInitialCallback<Key, Value> {
        public abstract void a(Object obj, List list);

        public abstract void b(List list);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "", "Key", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadInitialParams<Key> {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadParams;", "", "Key", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadParams<Key> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f3565a;

        public LoadParams(Object key) {
            Intrinsics.h(key, "key");
            this.f3565a = key;
        }
    }

    public PageKeyedDataSource() {
        super(DataSource.KeyType.d);
    }

    @Override // androidx.paging.DataSource
    public final Object b(Object obj) {
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // androidx.paging.DataSource
    public final Object e(DataSource.Params params, ContinuationImpl continuationImpl) {
        LoadType loadType = params.f3533a;
        final boolean z = true;
        if (loadType == LoadType.d) {
            LoadInitialParams loadInitialParams = new LoadInitialParams();
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
            cancellableContinuationImpl.o();
            i(loadInitialParams, new LoadInitialCallback<Object, Object>() { // from class: androidx.paging.PageKeyedDataSource$loadInitial$2$1
                @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
                public final void a(Object obj, List list) {
                    cancellableContinuationImpl.resumeWith(new DataSource.BaseResult(list, null, obj, Integer.MIN_VALUE, Integer.MIN_VALUE));
                }

                @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
                public final void b(List list) {
                    cancellableContinuationImpl.resumeWith(new DataSource.BaseResult(list, null, null, 0, 0 - list.size()));
                }
            });
            Object objN = cancellableContinuationImpl.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return objN;
        }
        Object obj = params.b;
        if (obj == null) {
            return new DataSource.BaseResult(EmptyList.d, null, null, 0, 0);
        }
        if (loadType == LoadType.e) {
            LoadParams loadParams = new LoadParams(obj);
            final CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
            cancellableContinuationImpl2.o();
            final boolean z2 = false;
            h(loadParams, new LoadCallback<Object, Object>() { // from class: androidx.paging.PageKeyedDataSource$continuationAsCallback$1
                @Override // androidx.paging.PageKeyedDataSource.LoadCallback
                public final void a(Object obj2, List list) {
                    boolean z3 = z2;
                    cancellableContinuationImpl2.resumeWith(new DataSource.BaseResult(list, z3 ? null : obj2, z3 ? obj2 : null, Integer.MIN_VALUE, Integer.MIN_VALUE));
                }
            });
            Object objN2 = cancellableContinuationImpl2.n();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
            return objN2;
        }
        if (loadType != LoadType.f) {
            throw new IllegalArgumentException("Unsupported type " + params.f3533a);
        }
        LoadParams loadParams2 = new LoadParams(obj);
        final CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
        cancellableContinuationImpl3.o();
        g(loadParams2, new LoadCallback<Object, Object>() { // from class: androidx.paging.PageKeyedDataSource$continuationAsCallback$1
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public final void a(Object obj2, List list) {
                boolean z3 = z;
                cancellableContinuationImpl3.resumeWith(new DataSource.BaseResult(list, z3 ? null : obj2, z3 ? obj2 : null, Integer.MIN_VALUE, Integer.MIN_VALUE));
            }
        });
        Object objN3 = cancellableContinuationImpl3.n();
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.d;
        return objN3;
    }

    public abstract void g(LoadParams loadParams, LoadCallback loadCallback);

    public abstract void h(LoadParams loadParams, LoadCallback loadCallback);

    public abstract void i(LoadInitialParams loadInitialParams, LoadInitialCallback loadInitialCallback);
}
