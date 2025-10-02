package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CachedPageEventFlow$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Flow q;
    public final /* synthetic */ CachedPageEventFlow r;

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "emit", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.CachedPageEventFlow$job$1$1, reason: invalid class name */
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ CachedPageEventFlow d;

        public AnonymousClass1(CachedPageEventFlow cachedPageEventFlow) {
            this.d = cachedPageEventFlow;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        
            if (r7.b(r6, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(kotlin.collections.IndexedValue r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.CachedPageEventFlow$job$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.CachedPageEventFlow$job$1$1$emit$1 r0 = (androidx.paging.CachedPageEventFlow$job$1$1$emit$1) r0
                int r1 = r0.t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.t = r1
                goto L18
            L13:
                androidx.paging.CachedPageEventFlow$job$1$1$emit$1 r0 = new androidx.paging.CachedPageEventFlow$job$1$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.r
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.ResultKt.b(r7)
                goto L63
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                kotlin.collections.IndexedValue r6 = r0.q
                java.lang.Object r2 = r0.p
                androidx.paging.CachedPageEventFlow$job$1$1 r2 = (androidx.paging.CachedPageEventFlow$job$1.AnonymousClass1) r2
                kotlin.ResultKt.b(r7)
                goto L51
            L3c:
                kotlin.ResultKt.b(r7)
                androidx.paging.CachedPageEventFlow r7 = r5.d
                kotlinx.coroutines.flow.SharedFlowImpl r7 = r7.b
                r0.p = r5
                r0.q = r6
                r0.t = r4
                java.lang.Object r7 = r7.emit(r6, r0)
                if (r7 != r1) goto L50
                goto L62
            L50:
                r2 = r5
            L51:
                androidx.paging.CachedPageEventFlow r7 = r2.d
                androidx.paging.FlattenedPageController r7 = r7.f3528a
                r2 = 0
                r0.p = r2
                r0.q = r2
                r0.t = r3
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L63
            L62:
                return r1
            L63:
                kotlin.Unit r6 = kotlin.Unit.f24250a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$job$1.AnonymousClass1.emit(kotlin.collections.IndexedValue, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$job$1(Flow flow, CachedPageEventFlow cachedPageEventFlow, Continuation continuation) {
        super(2, continuation);
        this.q = flow;
        this.r = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CachedPageEventFlow$job$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final Flow flow = this.q;
            Flow<IndexedValue<Object>> flow2 = new Flow<IndexedValue<Object>>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$$inlined$unsafeFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new FlowKt__TransformKt$withIndex$1$1(new Ref.IntRef(), flowCollector), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            };
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r);
            this.p = 1;
            if (flow2.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
