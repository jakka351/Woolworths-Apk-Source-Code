package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1", f = "AsyncPagingDataDiffer.kt", l = {40}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AsyncPagingDataDiffer$special$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super CombinedLoadStates>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Flow r;
    public final /* synthetic */ AsyncPagingDataDiffer s;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1, reason: invalid class name */
    public final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector d;
        public final /* synthetic */ AsyncPagingDataDiffer e;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1", f = "AsyncPagingDataDiffer.kt", l = {BERTags.FLAGS, 225, 229}, m = "emit")
        @SourceDebugExtension
        /* renamed from: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00781 extends ContinuationImpl {
            public /* synthetic */ Object p;
            public int q;
            public Object s;
            public Object t;
            public FlowCollector u;

            public C00781(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.p = obj;
                this.q |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, AsyncPagingDataDiffer asyncPagingDataDiffer) {
            this.e = asyncPagingDataDiffer;
            this.d = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.z((kotlinx.coroutines.flow.internal.FusibleFlow) r10, r4, r0) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        
            if (r2.emit(r9, r0) != r1) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.AnonymousClass1.C00781
                if (r0 == 0) goto L13
                r0 = r10
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1 r0 = (androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.AnonymousClass1.C00781) r0
                int r1 = r0.q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.q = r1
                goto L18
            L13:
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1 r0 = new androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.p
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.q
                r3 = 3
                r4 = 1
                r5 = 2
                r6 = 0
                if (r2 == 0) goto L51
                if (r2 == r4) goto L43
                if (r2 == r5) goto L37
                if (r2 != r3) goto L2f
                kotlin.ResultKt.b(r10)
                goto La5
            L2f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L37:
                java.lang.Object r9 = r0.t
                kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                java.lang.Object r2 = r0.s
                androidx.paging.CombinedLoadStates r2 = (androidx.paging.CombinedLoadStates) r2
                kotlin.ResultKt.b(r10)
                goto L95
            L43:
                kotlinx.coroutines.flow.FlowCollector r9 = r0.u
                java.lang.Object r2 = r0.t
                androidx.paging.CombinedLoadStates r2 = (androidx.paging.CombinedLoadStates) r2
                java.lang.Object r4 = r0.s
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1 r4 = (androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.AnonymousClass1) r4
                kotlin.ResultKt.b(r10)
                goto L7b
            L51:
                kotlin.ResultKt.b(r10)
                androidx.paging.CombinedLoadStates r9 = (androidx.paging.CombinedLoadStates) r9
                androidx.paging.AsyncPagingDataDiffer r10 = r8.e
                kotlinx.coroutines.flow.MutableStateFlow r10 = r10.d
                java.lang.Object r10 = r10.getValue()
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                kotlinx.coroutines.flow.FlowCollector r2 = r8.d
                if (r10 == 0) goto L98
                r0.s = r8
                r0.t = r9
                r0.u = r2
                r0.q = r4
                java.lang.Object r10 = kotlinx.coroutines.YieldKt.a(r0)
                if (r10 != r1) goto L77
                goto La4
            L77:
                r4 = r2
                r2 = r9
                r9 = r4
                r4 = r8
            L7b:
                androidx.paging.AsyncPagingDataDiffer r10 = r4.e
                kotlinx.coroutines.flow.MutableStateFlow r10 = r10.d
                androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1 r4 = new androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1
                r4.<init>(r5, r6)
                r0.s = r2
                r0.t = r9
                r0.u = r6
                r0.q = r5
                kotlinx.coroutines.flow.internal.FusibleFlow r10 = (kotlinx.coroutines.flow.internal.FusibleFlow) r10
                java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.z(r10, r4, r0)
                if (r10 != r1) goto L95
                goto La4
            L95:
                r7 = r2
                r2 = r9
                r9 = r7
            L98:
                r0.s = r6
                r0.t = r6
                r0.q = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto La5
            La4:
                return r1
            La5:
                kotlin.Unit r9 = kotlin.Unit.f24250a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$special$$inlined$transform$1(Flow flow, Continuation continuation, AsyncPagingDataDiffer asyncPagingDataDiffer) {
        super(2, continuation);
        this.r = flow;
        this.s = asyncPagingDataDiffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AsyncPagingDataDiffer$special$$inlined$transform$1 asyncPagingDataDiffer$special$$inlined$transform$1 = new AsyncPagingDataDiffer$special$$inlined$transform$1(this.r, continuation, this.s);
        asyncPagingDataDiffer$special$$inlined$transform$1.q = obj;
        return asyncPagingDataDiffer$special$$inlined$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncPagingDataDiffer$special$$inlined$transform$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((FlowCollector) this.q, this.s);
            this.p = 1;
            if (this.r.collect(anonymousClass1, this) == coroutineSingletons) {
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
