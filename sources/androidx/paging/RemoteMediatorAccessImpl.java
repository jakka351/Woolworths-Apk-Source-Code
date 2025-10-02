package androidx.paging;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/RemoteMediatorAccessImpl;", "", "Key", "Value", "Landroidx/paging/RemoteMediatorAccessor;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class RemoteMediatorAccessImpl<Key, Value> implements RemoteMediatorAccessor<Key, Value> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/paging/RemoteMediatorAccessImpl$Companion;", "", "", "PRIORITY_APPEND_PREPEND", "I", "PRIORITY_REFRESH", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3587a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3587a = iArr;
        }
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public final void a() {
        throw null;
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public final void b(PagingState pagingState) {
        final ArrayList arrayList = new ArrayList();
        new Function1<AccessorState<Object, Object>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl$retryFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AccessorState accessorState = (AccessorState) obj;
                Intrinsics.h(accessorState, "accessorState");
                new LoadStates(accessorState.b(LoadType.d), accessorState.b(LoadType.e), accessorState.b(LoadType.f));
                throw null;
            }
        };
        throw null;
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public final void c(final PagingState pagingState) {
        new Function1<AccessorState<Object, Object>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl$requestRefreshIfAllowed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AccessorState it = (AccessorState) obj;
                Intrinsics.h(it, "it");
                if (it.f3521a) {
                    it.f3521a = false;
                    this.h.f(null, LoadType.d, pagingState);
                }
                return Unit.f24250a;
            }
        };
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.RemoteMediatorAccessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.paging.RemoteMediatorAccessImpl$initialize$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.paging.RemoteMediatorAccessImpl$initialize$1 r0 = (androidx.paging.RemoteMediatorAccessImpl$initialize$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.paging.RemoteMediatorAccessImpl$initialize$1 r0 = new androidx.paging.RemoteMediatorAccessImpl$initialize$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.s
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3f
            if (r1 != r3) goto L37
            java.lang.Object r0 = r0.p
            androidx.paging.RemoteMediatorAccessImpl r0 = (androidx.paging.RemoteMediatorAccessImpl) r0
            kotlin.ResultKt.b(r5)
            r1 = r5
            androidx.paging.RemoteMediator$InitializeAction r1 = (androidx.paging.RemoteMediator.InitializeAction) r1
            androidx.paging.RemoteMediator$InitializeAction r3 = androidx.paging.RemoteMediator.InitializeAction.d
            if (r1 == r3) goto L33
            return r5
        L33:
            r0.getClass()
            throw r2
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L3f:
            kotlin.ResultKt.b(r5)
            r0.p = r4
            r0.s = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public final void e(LoadType loadType, PagingState pagingState) {
        Intrinsics.h(loadType, "loadType");
        f(null, loadType, pagingState);
    }

    public final void f(AccessorStateHolder accessorStateHolder, final LoadType loadType, final PagingState pagingState) {
        new Function1<AccessorState<Object, Object>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$requestLoad$newRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AccessorState it = (AccessorState) obj;
                Intrinsics.h(it, "it");
                it.getClass();
                LoadType loadType2 = loadType;
                Intrinsics.h(loadType2, "loadType");
                throw null;
            }
        };
        accessorStateHolder.getClass();
        throw null;
    }

    @Override // androidx.paging.RemoteMediatorAccessor
    public final StateFlow getState() {
        throw null;
    }
}
