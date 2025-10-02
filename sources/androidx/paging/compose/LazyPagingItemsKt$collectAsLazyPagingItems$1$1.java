package androidx.paging.compose;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", f = "LazyPagingItems.kt", l = {210, 212}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LazyPagingItemsKt$collectAsLazyPagingItems$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyPagingItems q;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1", f = "LazyPagingItems.kt", l = {213}, m = "invokeSuspend")
    /* renamed from: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ LazyPagingItems q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyPagingItems lazyPagingItems, Continuation continuation) {
            super(2, continuation);
            this.q = lazyPagingItems;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            Unit unit = Unit.f24250a;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                LazyPagingItems lazyPagingItems = this.q;
                Object objH = FlowKt.h(lazyPagingItems.f3593a, new LazyPagingItems$collectPagingData$2(lazyPagingItems, null), this);
                if (objH != coroutineSingletons) {
                    objH = unit;
                }
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPagingItemsKt$collectAsLazyPagingItems$1$1(LazyPagingItems lazyPagingItems, Continuation continuation) {
        super(2, continuation);
        this.q = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyPagingItemsKt$collectAsLazyPagingItems$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.p
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.b(r8)
            goto L4b
        L1b:
            kotlin.ResultKt.b(r8)
            kotlin.coroutines.EmptyCoroutineContext r8 = kotlin.coroutines.EmptyCoroutineContext.d
            boolean r1 = r8.equals(r8)
            r5 = 0
            androidx.paging.compose.LazyPagingItems r6 = r7.q
            if (r1 == 0) goto L3d
            r7.p = r4
            kotlinx.coroutines.flow.Flow r8 = r6.f3593a
            androidx.paging.compose.LazyPagingItems$collectPagingData$2 r1 = new androidx.paging.compose.LazyPagingItems$collectPagingData$2
            r1.<init>(r6, r5)
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.h(r8, r1, r7)
            if (r8 != r0) goto L39
            goto L3a
        L39:
            r8 = r2
        L3a:
            if (r8 != r0) goto L4b
            goto L4a
        L3d:
            androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1 r1 = new androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1
            r1.<init>(r6, r5)
            r7.p = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.f(r8, r1, r7)
            if (r8 != r0) goto L4b
        L4a:
            return r0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
