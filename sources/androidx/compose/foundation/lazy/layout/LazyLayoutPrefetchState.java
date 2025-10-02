package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "", "NestedPrefetchScopeImpl", "PrefetchHandle", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState {

    /* renamed from: a, reason: collision with root package name */
    public final PrefetchScheduler f1050a;
    public final Function1 b;
    public final PrefetchMetrics c = new PrefetchMetrics();
    public PrefetchHandleProvider d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$NestedPrefetchScopeImpl;", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public final class NestedPrefetchScopeImpl implements NestedPrefetchScope {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f1051a = new ArrayList();

        public NestedPrefetchScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public final void a(int i) {
            long j = LazyLayoutPrefetchStateKt.f1052a;
            LazyLayoutPrefetchState lazyLayoutPrefetchState = LazyLayoutPrefetchState.this;
            PrefetchHandleProvider prefetchHandleProvider = lazyLayoutPrefetchState.d;
            if (prefetchHandleProvider == null) {
                return;
            }
            this.f1051a.add(prefetchHandleProvider.new HandleAndRequestImpl(i, j, lazyLayoutPrefetchState.c));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "", "Landroidx/compose/foundation/lazy/layout/DummyHandle;", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface PrefetchHandle {
        void b();

        void cancel();
    }

    public LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, Function1 function1) {
        this.f1050a = prefetchScheduler;
        this.b = function1;
    }

    public final PrefetchHandle a(int i, long j) {
        PrefetchHandleProvider prefetchHandleProvider = this.d;
        if (prefetchHandleProvider == null) {
            return DummyHandle.f1032a;
        }
        PrefetchHandleProvider.HandleAndRequestImpl handleAndRequestImpl = prefetchHandleProvider.new HandleAndRequestImpl(i, j, this.c);
        prefetchHandleProvider.c.a(handleAndRequestImpl);
        return handleAndRequestImpl;
    }
}
