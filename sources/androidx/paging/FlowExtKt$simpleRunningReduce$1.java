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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FlowExtKt$simpleRunningReduce$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Flow r;
    public final /* synthetic */ SuspendLambda s;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1$1, reason: invalid class name */
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ Ref.ObjectRef d;
        public final /* synthetic */ SuspendLambda e;
        public final /* synthetic */ FlowCollector f;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref.ObjectRef objectRef, Function3 function3, FlowCollector flowCollector) {
            this.d = objectRef;
            this.e = (SuspendLambda) function3;
            this.f = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        
            if (r8.emit(r9, r0) != r1) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1 r0 = (androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1) r0
                int r1 = r0.t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.t = r1
                goto L18
            L13:
                androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1 r0 = new androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.r
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.ResultKt.b(r9)
                goto L75
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                kotlin.jvm.internal.Ref$ObjectRef r8 = r0.q
                java.lang.Object r2 = r0.p
                androidx.paging.FlowExtKt$simpleRunningReduce$1$1 r2 = (androidx.paging.FlowExtKt$simpleRunningReduce$1.AnonymousClass1) r2
                kotlin.ResultKt.b(r9)
                goto L5c
            L3c:
                kotlin.ResultKt.b(r9)
                kotlin.jvm.internal.Ref$ObjectRef r9 = r7.d
                java.lang.Object r2 = r9.d
                java.lang.Object r5 = androidx.paging.FlowExtKt.f3536a
                if (r2 != r5) goto L49
                r2 = r7
                goto L5f
            L49:
                r0.p = r7
                r0.q = r9
                r0.t = r4
                kotlin.coroutines.jvm.internal.SuspendLambda r4 = r7.e
                java.lang.Object r8 = r4.invoke(r2, r8, r0)
                if (r8 != r1) goto L58
                goto L74
            L58:
                r2 = r9
                r9 = r8
                r8 = r2
                r2 = r7
            L5c:
                r6 = r9
                r9 = r8
                r8 = r6
            L5f:
                r9.d = r8
                kotlinx.coroutines.flow.FlowCollector r8 = r2.f
                kotlin.jvm.internal.Ref$ObjectRef r9 = r2.d
                java.lang.Object r9 = r9.d
                r2 = 0
                r0.p = r2
                r0.q = r2
                r0.t = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L75
            L74:
                return r1
            L75:
                kotlin.Unit r8 = kotlin.Unit.f24250a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$simpleRunningReduce$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleRunningReduce$1(Flow flow, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.r = flow;
        this.s = (SuspendLambda) function3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1 = new FlowExtKt$simpleRunningReduce$1(this.r, this.s, continuation);
        flowExtKt$simpleRunningReduce$1.q = obj;
        return flowExtKt$simpleRunningReduce$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$simpleRunningReduce$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.q;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.d = FlowExtKt.f3536a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, this.s, flowCollector);
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
