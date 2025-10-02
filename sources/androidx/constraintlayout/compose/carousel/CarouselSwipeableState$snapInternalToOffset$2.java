package androidx.constraintlayout.compose.carousel;

import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapInternalToOffset$2", f = "CarouselSwipeable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CarouselSwipeableState$snapInternalToOffset$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ float q;
    public final /* synthetic */ CarouselSwipeableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableState$snapInternalToOffset$2(float f, CarouselSwipeableState carouselSwipeableState, Continuation continuation) {
        super(2, continuation);
        this.q = f;
        this.r = carouselSwipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CarouselSwipeableState$snapInternalToOffset$2 carouselSwipeableState$snapInternalToOffset$2 = new CarouselSwipeableState$snapInternalToOffset$2(this.q, this.r, continuation);
        carouselSwipeableState$snapInternalToOffset$2.p = obj;
        return carouselSwipeableState$snapInternalToOffset$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CarouselSwipeableState$snapInternalToOffset$2 carouselSwipeableState$snapInternalToOffset$2 = (CarouselSwipeableState$snapInternalToOffset$2) create((DragScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        carouselSwipeableState$snapInternalToOffset$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ((DragScope) this.p).a(this.q - ((SnapshotMutableFloatStateImpl) this.r.f).a());
        return Unit.f24250a;
    }
}
