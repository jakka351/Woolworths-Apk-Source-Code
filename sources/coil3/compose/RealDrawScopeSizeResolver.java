package coil3.compose;

import coil3.size.Size;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/RealDrawScopeSizeResolver;", "Lcoil3/compose/DrawScopeSizeResolver;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class RealDrawScopeSizeResolver implements DrawScopeSizeResolver {
    @Override // coil3.size.SizeResolver
    public final Object a(Continuation continuation) {
        final ChannelFlowTransformLatest channelFlowTransformLatestQ = FlowKt.Q(null, new RealDrawScopeSizeResolver$size$2(3, null));
        return FlowKt.w(new Flow<Size>() { // from class: coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1$2", f = "DrawScopeSizeResolver.kt", l = {52}, m = "emit")
                /* renamed from: coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1$2$1 r0 = (coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1$2$1 r0 = new coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L30
                        if (r2 != r3) goto L28
                        kotlin.ResultKt.b(r10)
                        goto Laa
                    L28:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L30:
                        kotlin.ResultKt.b(r10)
                        androidx.compose.ui.geometry.Size r9 = (androidx.compose.ui.geometry.Size) r9
                        long r9 = r9.f1754a
                        kotlinx.coroutines.CoroutineDispatcher r2 = coil3.compose.internal.UtilsKt.f13070a
                        r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
                        int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                        if (r2 != 0) goto L45
                        coil3.size.Size r9 = coil3.size.Size.c
                        goto L9d
                    L45:
                        float r2 = androidx.compose.ui.geometry.Size.d(r9)
                        double r4 = (double) r2
                        r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                        int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                        if (r2 < 0) goto L9c
                        float r2 = androidx.compose.ui.geometry.Size.b(r9)
                        double r4 = (double) r2
                        int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                        if (r2 < 0) goto L9c
                        coil3.size.Size r2 = new coil3.size.Size
                        float r4 = androidx.compose.ui.geometry.Size.d(r9)
                        boolean r5 = java.lang.Float.isInfinite(r4)
                        coil3.size.Dimension$Undefined r6 = coil3.size.Dimension.Undefined.f13148a
                        if (r5 != 0) goto L7a
                        boolean r5 = java.lang.Float.isNaN(r4)
                        if (r5 != 0) goto L7a
                        int r4 = kotlin.math.MathKt.b(r4)
                        coil3.size.DimensionKt.a(r4)
                        coil3.size.Dimension$Pixels r5 = new coil3.size.Dimension$Pixels
                        r5.<init>(r4)
                        goto L7b
                    L7a:
                        r5 = r6
                    L7b:
                        float r9 = androidx.compose.ui.geometry.Size.b(r9)
                        boolean r10 = java.lang.Float.isInfinite(r9)
                        if (r10 != 0) goto L97
                        boolean r10 = java.lang.Float.isNaN(r9)
                        if (r10 != 0) goto L97
                        int r9 = kotlin.math.MathKt.b(r9)
                        coil3.size.DimensionKt.a(r9)
                        coil3.size.Dimension$Pixels r6 = new coil3.size.Dimension$Pixels
                        r6.<init>(r9)
                    L97:
                        r2.<init>(r5, r6)
                        r9 = r2
                        goto L9d
                    L9c:
                        r9 = 0
                    L9d:
                        if (r9 == 0) goto Laa
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r10 = r8.d
                        java.lang.Object r9 = r10.emit(r9, r0)
                        if (r9 != r1) goto Laa
                        return r1
                    Laa:
                        kotlin.Unit r9 = kotlin.Unit.f24250a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object objCollect = channelFlowTransformLatestQ.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, continuation);
    }

    @Override // coil3.compose.DrawScopeSizeResolver
    public final void connect() {
        throw null;
    }
}
