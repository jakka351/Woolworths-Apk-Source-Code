package androidx.paging;

import androidx.paging.PagingData;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"androidx/paging/PagingDataTransforms__PagingDataTransformsKt", "androidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagingDataTransforms {
    public static final PagingData a(PagingData pagingData, final Function2 function2) {
        Intrinsics.h(pagingData, "<this>");
        final Flow flow = pagingData.f3573a;
        return new PagingData(new Flow(function2, flow) { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1
            public final /* synthetic */ Flow d;
            public final /* synthetic */ SuspendLambda e;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "androidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;
                public final /* synthetic */ SuspendLambda e;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2", f = "PagingDataTransforms.kt", l = {225, 223}, m = "emit")
                @SourceDebugExtension
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;
                    public FlowCollector r;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Function2 function2, FlowCollector flowCollector) {
                    this.d = flowCollector;
                    this.e = (SuspendLambda) function2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
                
                    if (r7.emit(r8, r0) == r1) goto L22;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1 r0 = (androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1 r0 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.b(r8)
                        goto L5b
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        kotlinx.coroutines.flow.FlowCollector r7 = r0.r
                        kotlin.ResultKt.b(r8)
                        goto L4f
                    L38:
                        kotlin.ResultKt.b(r8)
                        androidx.paging.PageEvent r7 = (androidx.paging.PageEvent) r7
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.d
                        r0.r = r8
                        r0.q = r4
                        kotlin.coroutines.jvm.internal.SuspendLambda r2 = r6.e
                        java.lang.Object r7 = r7.a(r2, r0)
                        if (r7 != r1) goto L4c
                        goto L5a
                    L4c:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L4f:
                        r2 = 0
                        r0.r = r2
                        r0.q = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L5b
                    L5a:
                        return r1
                    L5b:
                        kotlin.Unit r7 = kotlin.Unit.f24250a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.d = flow;
                this.e = (SuspendLambda) function2;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.d.collect(new AnonymousClass2(this.e, flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, pagingData.b, pagingData.c, PagingData.AnonymousClass1.h);
    }
}
