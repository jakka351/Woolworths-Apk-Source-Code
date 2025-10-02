package androidx.paging;

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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SimpleChannelFlowKt$simpleChannelFlow$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SuspendLambda r;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {67, 68}, m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public ChannelIterator p;
        public int q;
        public /* synthetic */ Object r;
        public final /* synthetic */ FlowCollector s;
        public final /* synthetic */ SuspendLambda t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(FlowCollector flowCollector, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.s = flowCollector;
            this.t = (SuspendLambda) function2;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.s, this.t, continuation);
            anonymousClass1.r = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        
            if (r8.s.emit(r9, r8) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006f -> B:7:0x0016). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r8.q
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlinx.coroutines.channels.ChannelIterator r1 = r8.p
                java.lang.Object r5 = r8.r
                kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
                kotlin.ResultKt.b(r9)
            L16:
                r9 = r5
                goto L47
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                kotlinx.coroutines.channels.ChannelIterator r1 = r8.p
                java.lang.Object r5 = r8.r
                kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
                kotlin.ResultKt.b(r9)
                goto L57
            L2a:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.r
                kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
                r1 = 0
                r5 = 6
                kotlinx.coroutines.channels.BufferedChannel r1 = kotlinx.coroutines.channels.ChannelKt.a(r1, r5, r4)
                androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r5 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                kotlin.coroutines.jvm.internal.SuspendLambda r6 = r8.t
                r5.<init>(r1, r6, r4)
                r6 = 3
                kotlinx.coroutines.Job r9 = kotlinx.coroutines.BuildersKt.c(r9, r4, r4, r5, r6)
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            L47:
                r8.r = r9
                r8.p = r1
                r8.q = r3
                java.lang.Object r5 = r1.b(r8)
                if (r5 != r0) goto L54
                goto L71
            L54:
                r7 = r5
                r5 = r9
                r9 = r7
            L57:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L72
                java.lang.Object r9 = r1.next()
                r8.r = r5
                r8.p = r1
                r8.q = r2
                kotlinx.coroutines.flow.FlowCollector r6 = r8.s
                java.lang.Object r9 = r6.emit(r9, r8)
                if (r9 != r0) goto L16
            L71:
                return r0
            L72:
                r5.cancel(r4)
                kotlin.Unit r9 = kotlin.Unit.f24250a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleChannelFlowKt$simpleChannelFlow$1(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.r = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(this.r, continuation);
        simpleChannelFlowKt$simpleChannelFlow$1.q = obj;
        return simpleChannelFlowKt$simpleChannelFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((FlowCollector) this.q, this.r, null);
            this.p = 1;
            if (CoroutineScopeKt.c(anonymousClass1, this) == coroutineSingletons) {
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
