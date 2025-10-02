package androidx.constraintlayout.compose.carousel;

import androidx.compose.animation.core.SpringSpec;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes2.dex */
public class CarouselSwipeableState<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f2256a;
    public final MutableState b;
    public final MutableState c;
    public final MutableFloatState d;
    public final MutableFloatState e;
    public final MutableFloatState f;
    public final MutableState g;
    public final MutableState h;
    public final FlowKt__LimitKt$take$$inlined$unsafeFlow$1 i;
    public float j;
    public float k;
    public final MutableState l;
    public final MutableFloatState m;
    public final MutableState n;
    public final DraggableState o;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Object, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState$Companion;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public CarouselSwipeableState(Object obj) {
        SpringSpec springSpec = SwipeableDefaults.f2258a;
        this.f2256a = CarouselSwipeableKt$rememberCarouselSwipeableState$1.h;
        this.b = SnapshotStateKt.f(obj);
        this.c = SnapshotStateKt.f(Boolean.FALSE);
        this.d = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
        this.e = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
        this.f = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
        this.g = SnapshotStateKt.f(null);
        this.h = SnapshotStateKt.f(EmptyMap.d);
        final Flow flowM = SnapshotStateKt.m(new Function0<Map<Float, Object>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$latestNonEmptyAnchorsFlow$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (Map) ((SnapshotMutableStateImpl) this.h.h).getD();
            }
        });
        this.i = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new Flow<Map<Float, Object>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2", f = "CarouselSwipeable.kt", l = {223}, m = "emit")
                /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = ((AbstractFlow) flowM).collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        });
        this.j = Float.NEGATIVE_INFINITY;
        this.k = Float.POSITIVE_INFINITY;
        this.l = SnapshotStateKt.f(CarouselSwipeableState$thresholds$2.h);
        this.m = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
        this.n = SnapshotStateKt.f(null);
        this.o = DraggableKt.a(new Function1<Float, Unit>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$draggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                float fSin;
                float fFloatValue = ((Number) obj2).floatValue();
                CarouselSwipeableState carouselSwipeableState = this.h;
                MutableFloatState mutableFloatState = carouselSwipeableState.f;
                float fA = ((SnapshotMutableFloatStateImpl) mutableFloatState).a() + fFloatValue;
                float fB = RangesKt.b(fA, carouselSwipeableState.j, carouselSwipeableState.k);
                float f = fA - fB;
                if (((ResistanceConfig) ((SnapshotMutableStateImpl) carouselSwipeableState.n).getD()) != null) {
                    fSin = (BitmapDescriptorFactory.HUE_RED / 10.0f) * ((float) Math.sin((RangesKt.b(f / BitmapDescriptorFactory.HUE_RED, -1.0f, 1.0f) * 3.1415927f) / 2));
                } else {
                    fSin = BitmapDescriptorFactory.HUE_RED;
                }
                ((SnapshotMutableFloatStateImpl) carouselSwipeableState.d).p(fB + fSin);
                ((SnapshotMutableFloatStateImpl) carouselSwipeableState.e).p(f);
                ((SnapshotMutableFloatStateImpl) mutableFloatState).p(fA);
                return Unit.f24250a;
            }
        });
    }

    public final Object a(float f, Continuation continuation) {
        SpringSpec springSpec = SwipeableDefaults.f2258a;
        Object objA = this.o.a(MutatePriority.d, new CarouselSwipeableState$animateInternalToOffset$2(f, this, null), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
    /* JADX WARN: Type inference failed for: r11v20, types: [float] */
    /* JADX WARN: Type inference failed for: r11v71, types: [float] */
    /* JADX WARN: Type inference failed for: r11v73, types: [float] */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r11v79 */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.Map r11, java.util.Map r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.carousel.CarouselSwipeableState.b(java.util.Map, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(Object obj) {
        ((SnapshotMutableStateImpl) this.b).setValue(obj);
    }

    public final Object d(float f, ContinuationImpl continuationImpl) {
        Object objA = this.o.a(MutatePriority.d, new CarouselSwipeableState$snapInternalToOffset$2(f, this, null), continuationImpl);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public final Object e(SuspendLambda suspendLambda) {
        Object objCollect = this.i.collect(new CarouselSwipeableState$snapTo$2(this), suspendLambda);
        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
    }
}
