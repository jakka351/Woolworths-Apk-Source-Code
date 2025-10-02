package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* loaded from: classes7.dex */
final /* synthetic */ class FlowKt__ZipKt {
    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 a(Flow flow, Flow flow2, Flow flow3, Function4 function4) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1(new Flow[]{flow, flow2, flow3}, function4);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2] */
    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 b(Flow flow, Flow flow2, Flow flow3, Flow flow4, Function5 function5) {
        return new Flow<Object>(new Flow[]{flow, flow2, flow3, flow4}, function5) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2
            public final /* synthetic */ Flow[] d;
            public final /* synthetic */ SuspendLambda e;

            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            public final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {
                public int p;
                public /* synthetic */ FlowCollector q;
                public /* synthetic */ Object[] r;
                public final /* synthetic */ SuspendLambda s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Continuation continuation, Function5 function5) {
                    super(3, continuation);
                    this.s = (SuspendLambda) function5;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function5] */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((Continuation) obj3, this.s);
                    anonymousClass2.q = (FlowCollector) obj;
                    anonymousClass2.r = (Object[]) obj2;
                    return anonymousClass2.invokeSuspend(Unit.f24250a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
                
                    if (r1.emit(r12, r11) == r0) goto L15;
                 */
                /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function5] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r1 = r11.p
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L20
                        if (r1 == r3) goto L19
                        if (r1 != r2) goto L11
                        kotlin.ResultKt.b(r12)
                        r10 = r11
                        goto L4b
                    L11:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L19:
                        kotlinx.coroutines.flow.FlowCollector r1 = r11.q
                        kotlin.ResultKt.b(r12)
                        r10 = r11
                        goto L3f
                    L20:
                        kotlin.ResultKt.b(r12)
                        kotlinx.coroutines.flow.FlowCollector r1 = r11.q
                        java.lang.Object[] r12 = r11.r
                        r4 = 0
                        r6 = r12[r4]
                        r7 = r12[r3]
                        r8 = r12[r2]
                        r4 = 3
                        r9 = r12[r4]
                        r11.q = r1
                        r11.p = r3
                        kotlin.coroutines.jvm.internal.SuspendLambda r5 = r11.s
                        r10 = r11
                        java.lang.Object r12 = r5.invoke(r6, r7, r8, r9, r10)
                        if (r12 != r0) goto L3f
                        goto L4a
                    L3f:
                        r3 = 0
                        r10.q = r3
                        r10.p = r2
                        java.lang.Object r12 = r1.emit(r12, r11)
                        if (r12 != r0) goto L4b
                    L4a:
                        return r0
                    L4b:
                        kotlin.Unit r12 = kotlin.Unit.f24250a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.e = (SuspendLambda) function5;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function5] */
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objA = CombineKt.a(continuation, FlowKt__ZipKt$nullArrayFactory$1.d, new AnonymousClass2(null, this.e), flowCollector, this.d);
                return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
            }
        };
    }

    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 c(Flow flow, Flow flow2, Flow flow3, Flow flow4, Flow flow5, Function6 function6) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(new Flow[]{flow, flow2, flow3, flow4, flow5}, function6);
    }

    public static final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 d(Flow flow, Flow flow2, Function3 function3) {
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, flow2, function3);
    }

    public static final Flow e(Flow flow, Flow flow2, Flow flow3, Function5 function5) {
        return new SafeFlow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new Flow[]{flow, flow2, flow3}, null, function5));
    }

    public static final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 f(Flow flow, Flow flow2, Function3 function3) {
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, flow2, function3);
    }
}
