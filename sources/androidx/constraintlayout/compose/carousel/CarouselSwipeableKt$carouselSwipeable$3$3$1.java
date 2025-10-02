package androidx.constraintlayout.compose.carousel;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1", f = "CarouselSwipeable.kt", l = {584}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CarouselSwipeableKt$carouselSwipeable$3$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CarouselSwipeableState q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ ResistanceConfig s;
    public final /* synthetic */ Density t;
    public final /* synthetic */ Function2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableKt$carouselSwipeable$3$3$1(CarouselSwipeableState carouselSwipeableState, Map map, ResistanceConfig resistanceConfig, Density density, Function2 function2, Continuation continuation) {
        super(2, continuation);
        SpringSpec springSpec = SwipeableDefaults.f2258a;
        this.q = carouselSwipeableState;
        this.r = map;
        this.s = resistanceConfig;
        this.t = density;
        this.u = function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SpringSpec springSpec = SwipeableDefaults.f2258a;
        return new CarouselSwipeableKt$carouselSwipeable$3$3$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CarouselSwipeableKt$carouselSwipeable$3$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CarouselSwipeableState carouselSwipeableState = this.q;
        MutableState mutableState = carouselSwipeableState.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Map map = (Map) ((SnapshotMutableStateImpl) mutableState).getD();
            final ?? r3 = this.r;
            ((SnapshotMutableStateImpl) mutableState).setValue(r3);
            ((SnapshotMutableStateImpl) carouselSwipeableState.n).setValue(this.s);
            final Function2 function2 = this.u;
            final Density density = this.t;
            ((SnapshotMutableStateImpl) carouselSwipeableState.l).setValue(new Function2<Float, Float, Float>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    float fFloatValue2 = ((Number) obj3).floatValue();
                    Float fValueOf = Float.valueOf(fFloatValue);
                    ?? r1 = r3;
                    return Float.valueOf(((ThresholdConfig) function2.invoke(MapsKt.e(fValueOf, r1), MapsKt.e(Float.valueOf(fFloatValue2), r1))).a(density, fFloatValue, fFloatValue2));
                }
            });
            ((SnapshotMutableFloatStateImpl) carouselSwipeableState.m).p(density.T1(SwipeableDefaults.b));
            this.p = 1;
            if (carouselSwipeableState.b(map, r3, this) == coroutineSingletons) {
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
