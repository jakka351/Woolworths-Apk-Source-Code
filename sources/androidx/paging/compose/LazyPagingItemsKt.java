package androidx.paging.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.paging.LoadState;
import androidx.paging.LoadStates;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"paging-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyPagingItemsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final LoadStates f3594a;

    static {
        LoadState.NotLoading notLoading = new LoadState.NotLoading(false);
        f3594a = new LoadStates(LoadState.Loading.b, notLoading, notLoading);
    }

    public static final LazyPagingItems a(Flow flow, Composer composer) {
        Intrinsics.h(flow, "<this>");
        composer.F(388053246);
        composer.F(1046463091);
        boolean zN = composer.n(flow);
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (zN || objG == obj) {
            objG = new LazyPagingItems(flow);
            composer.A(objG);
        }
        LazyPagingItems lazyPagingItems = (LazyPagingItems) objG;
        composer.N();
        composer.F(1046463169);
        Object obj2 = EmptyCoroutineContext.d;
        boolean zI = composer.I(obj2) | composer.I(lazyPagingItems);
        Object objG2 = composer.G();
        if (zI || objG2 == obj) {
            objG2 = new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(lazyPagingItems, null);
            composer.A(objG2);
        }
        composer.N();
        EffectsKt.e(composer, lazyPagingItems, (Function2) objG2);
        composer.F(1046463438);
        boolean zI2 = composer.I(obj2) | composer.I(lazyPagingItems);
        Object objG3 = composer.G();
        if (zI2 || objG3 == obj) {
            objG3 = new LazyPagingItemsKt$collectAsLazyPagingItems$2$1(lazyPagingItems, null);
            composer.A(objG3);
        }
        composer.N();
        EffectsKt.e(composer, lazyPagingItems, (Function2) objG3);
        composer.N();
        return lazyPagingItems;
    }
}
