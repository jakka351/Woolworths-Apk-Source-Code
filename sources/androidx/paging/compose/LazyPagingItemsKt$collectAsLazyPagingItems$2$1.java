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
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1", f = "LazyPagingItems.kt", l = {220, 222}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LazyPagingItemsKt$collectAsLazyPagingItems$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyPagingItems q;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1", f = "LazyPagingItems.kt", l = {223}, m = "invokeSuspend")
    /* renamed from: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1, reason: invalid class name */
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
                Object objCollect = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(lazyPagingItems.c.k).collect(new LazyPagingItems$collectLoadState$2(lazyPagingItems), this);
                if (objCollect != coroutineSingletons) {
                    objCollect = unit;
                }
                if (objCollect == coroutineSingletons) {
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
    public LazyPagingItemsKt$collectAsLazyPagingItems$2$1(LazyPagingItems lazyPagingItems, Continuation continuation) {
        super(2, continuation);
        this.q = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyPagingItemsKt$collectAsLazyPagingItems$2$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyPagingItemsKt$collectAsLazyPagingItems$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.ResultKt.b(r7)
            goto L52
        L1b:
            kotlin.ResultKt.b(r7)
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.d
            boolean r1 = r7.equals(r7)
            androidx.paging.compose.LazyPagingItems r5 = r6.q
            if (r1 == 0) goto L43
            r6.p = r4
            androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1 r7 = r5.c
            kotlinx.coroutines.flow.StateFlow r7 = r7.k
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1
            r1.<init>(r7)
            androidx.paging.compose.LazyPagingItems$collectLoadState$2 r7 = new androidx.paging.compose.LazyPagingItems$collectLoadState$2
            r7.<init>(r5)
            java.lang.Object r7 = r1.collect(r7, r6)
            if (r7 != r0) goto L3f
            goto L40
        L3f:
            r7 = r2
        L40:
            if (r7 != r0) goto L52
            goto L51
        L43:
            androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1 r1 = new androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1
            r4 = 0
            r1.<init>(r5, r4)
            r6.p = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r7, r1, r6)
            if (r7 != r0) goto L52
        L51:
            return r0
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
