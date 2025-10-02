package coil.compose;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import coil.size.Size;
import coil.size.SizeResolver;
import com.google.android.gms.ads.RequestConfiguration;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcoil/compose/ConstraintsSizeResolver;", "Lcoil/size/SizeResolver;", "Landroidx/compose/ui/layout/LayoutModifier;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConstraintsSizeResolver implements SizeResolver, LayoutModifier {
    @Override // coil.size.SizeResolver
    public final Object a(Continuation continuation) {
        final Flow flow = null;
        return FlowKt.w(new Flow<Size>() { // from class: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "AsyncImage.kt", l = {225}, m = "emit")
                @SourceDebugExtension
                /* renamed from: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 r0 = (coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 r0 = new coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r9)
                        goto L73
                    L27:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L2f:
                        kotlin.ResultKt.b(r9)
                        androidx.compose.ui.unit.Constraints r8 = (androidx.compose.ui.unit.Constraints) r8
                        long r8 = r8.f2197a
                        boolean r2 = androidx.compose.ui.unit.Constraints.k(r8)
                        if (r2 == 0) goto L3e
                        r8 = 0
                        goto L66
                    L3e:
                        coil.size.Size r2 = new coil.size.Size
                        boolean r4 = androidx.compose.ui.unit.Constraints.d(r8)
                        coil.size.Dimension$Undefined r5 = coil.size.Dimension.Undefined.f13027a
                        if (r4 == 0) goto L52
                        int r4 = androidx.compose.ui.unit.Constraints.h(r8)
                        coil.size.Dimension$Pixels r6 = new coil.size.Dimension$Pixels
                        r6.<init>(r4)
                        goto L53
                    L52:
                        r6 = r5
                    L53:
                        boolean r4 = androidx.compose.ui.unit.Constraints.c(r8)
                        if (r4 == 0) goto L62
                        int r8 = androidx.compose.ui.unit.Constraints.g(r8)
                        coil.size.Dimension$Pixels r5 = new coil.size.Dimension$Pixels
                        r5.<init>(r8)
                    L62:
                        r2.<init>(r6, r5)
                        r8 = r2
                    L66:
                        if (r8 == 0) goto L73
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.d
                        java.lang.Object r8 = r9.emit(r8, r0)
                        if (r8 != r1) goto L73
                        return r1
                    L73:
                        kotlin.Unit r8 = kotlin.Unit.f24250a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, continuation);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        new Constraints(j);
        throw null;
    }
}
