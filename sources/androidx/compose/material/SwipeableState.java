package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/SwipeableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@Deprecated
@ExperimentalMaterialApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public class SwipeableState<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimationSpec f1332a;
    public final Function1 b;
    public final MutableState c;
    public final MutableState d = SnapshotStateKt.f(Boolean.FALSE);
    public final MutableFloatState e = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutableFloatState f = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutableFloatState g = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutableState h = SnapshotStateKt.f(null);
    public final MutableState i = SnapshotStateKt.f(EmptyMap.d);
    public final FlowKt__LimitKt$take$$inlined$unsafeFlow$1 j;
    public float k;
    public float l;
    public final MutableState m;
    public final MutableFloatState n;
    public final MutableState o;
    public final DraggableState p;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SwipeableState$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Object, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1) {
        this.f1332a = animationSpec;
        this.b = function1;
        this.c = SnapshotStateKt.f(obj);
        final Flow flowM = SnapshotStateKt.m(new Function0<Map<Float, Object>>() { // from class: androidx.compose.material.SwipeableState$latestNonEmptyAnchorsFlow$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.b();
            }
        });
        this.j = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new Flow<Map<Float, Object>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {223}, m = "emit")
                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L46
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        r6 = r5
                        java.util.Map r6 = (java.util.Map) r6
                        boolean r6 = r6.isEmpty()
                        if (r6 != 0) goto L46
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L46
                        return r1
                    L46:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = ((AbstractFlow) flowM).collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        });
        this.k = Float.NEGATIVE_INFINITY;
        this.l = Float.POSITIVE_INFINITY;
        this.m = SnapshotStateKt.f(SwipeableState$thresholds$2.h);
        this.n = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
        this.o = SnapshotStateKt.f(null);
        this.p = DraggableKt.a(new Function1<Float, Unit>() { // from class: androidx.compose.material.SwipeableState$draggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                float fFloatValue = ((Number) obj2).floatValue();
                SwipeableState swipeableState = this.h;
                float fA = ((SnapshotMutableFloatStateImpl) swipeableState.g).a() + fFloatValue;
                float fB = RangesKt.b(fA, swipeableState.k, swipeableState.l);
                float f = fA - fB;
                ResistanceConfig resistanceConfig = (ResistanceConfig) ((SnapshotMutableStateImpl) swipeableState.o).getD();
                float fSin = BitmapDescriptorFactory.HUE_RED;
                if (resistanceConfig != null) {
                    float f2 = f < BitmapDescriptorFactory.HUE_RED ? resistanceConfig.b : resistanceConfig.c;
                    if (f2 != BitmapDescriptorFactory.HUE_RED) {
                        float f3 = resistanceConfig.f1313a;
                        float f4 = f / f3;
                        if (f4 < -1.0f) {
                            f4 = -1.0f;
                        }
                        if (f4 > 1.0f) {
                            f4 = 1.0f;
                        }
                        fSin = ((float) Math.sin((f4 * 3.1415927f) / 2)) * (f3 / f2);
                    }
                }
                ((SnapshotMutableFloatStateImpl) swipeableState.e).p(fB + fSin);
                ((SnapshotMutableFloatStateImpl) swipeableState.f).p(f);
                ((SnapshotMutableFloatStateImpl) swipeableState.g).p(fA);
                return Unit.f24250a;
            }
        });
    }

    public final Object a(float f, AnimationSpec animationSpec, Continuation continuation) {
        Object objA = this.p.a(MutatePriority.d, new SwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public final Map b() {
        return (Map) ((SnapshotMutableStateImpl) this.i).getD();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022c  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [float] */
    /* JADX WARN: Type inference failed for: r12v20, types: [float] */
    /* JADX WARN: Type inference failed for: r12v51, types: [float] */
    /* JADX WARN: Type inference failed for: r12v72, types: [float] */
    /* JADX WARN: Type inference failed for: r12v74, types: [float] */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r12v82 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.Map r12, java.util.LinkedHashMap r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.c(java.util.Map, java.util.LinkedHashMap, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void d(Object obj) {
        ((SnapshotMutableStateImpl) this.c).setValue(obj);
    }
}
