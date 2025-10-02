package ovh.plrapps.mapcompose.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1", f = "Throttle.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ThrottleKt$throttle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Flow q;
    public final /* synthetic */ SuspendLambda r;
    public final /* synthetic */ long s;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "emit", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1$1, reason: invalid class name */
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ SuspendLambda d;
        public final /* synthetic */ long e;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1 function1, long j) {
            this.d = (SuspendLambda) function1;
            this.e = j;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (kotlinx.coroutines.DelayKt.b(r3, r6) == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(kotlin.Unit r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r6 = r7 instanceof ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1$1$emit$1
                if (r6 == 0) goto L13
                r6 = r7
                ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1$1$emit$1 r6 = (ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1$1$emit$1) r6
                int r0 = r6.s
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r6.s = r0
                goto L18
            L13:
                ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1$1$emit$1 r6 = new ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1$1$emit$1
                r6.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r6.q
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r6.s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L32
                if (r1 != r2) goto L2a
                kotlin.ResultKt.b(r7)
                goto L59
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                java.lang.Object r1 = r6.p
                ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1$1 r1 = (ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1.AnonymousClass1) r1
                kotlin.ResultKt.b(r7)
                goto L4b
            L3a:
                kotlin.ResultKt.b(r7)
                r6.p = r5
                r6.s = r3
                kotlin.coroutines.jvm.internal.SuspendLambda r7 = r5.d
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r0) goto L4a
                goto L58
            L4a:
                r1 = r5
            L4b:
                long r3 = r1.e
                r7 = 0
                r6.p = r7
                r6.s = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.b(r3, r6)
                if (r6 != r0) goto L59
            L58:
                return r0
            L59:
                kotlin.Unit r6 = kotlin.Unit.f24250a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1.AnonymousClass1.emit(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThrottleKt$throttle$1(Flow flow, Function1 function1, long j, Continuation continuation) {
        super(2, continuation);
        this.q = flow;
        this.r = (SuspendLambda) function1;
        this.s = j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThrottleKt$throttle$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ThrottleKt$throttle$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s);
            this.p = 1;
            if (this.q.collect(anonymousClass1, this) == coroutineSingletons) {
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
