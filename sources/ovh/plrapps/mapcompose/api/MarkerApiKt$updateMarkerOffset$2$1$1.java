package ovh.plrapps.mapcompose.api;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.api.MarkerApiKt$updateMarkerOffset$2$1$1", f = "MarkerApi.kt", l = {243}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MarkerApiKt$updateMarkerOffset$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AnimationSpec q;
    public final /* synthetic */ Offset r;
    public final /* synthetic */ MarkerData s;
    public final /* synthetic */ DpOffset t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkerApiKt$updateMarkerOffset$2$1$1(AnimationSpec animationSpec, Offset offset, MarkerData markerData, DpOffset dpOffset, Continuation continuation) {
        super(1, continuation);
        this.q = animationSpec;
        this.r = offset;
        this.s = markerData;
        this.t = dpOffset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MarkerApiKt$updateMarkerOffset$2$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((MarkerApiKt$updateMarkerOffset$2$1$1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Animatable animatableA = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
            Float f = new Float(1.0f);
            final MarkerData markerData = this.s;
            final DpOffset dpOffset = this.t;
            final Offset offset = this.r;
            Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: ovh.plrapps.mapcompose.api.MarkerApiKt$updateMarkerOffset$2$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Animatable animateTo = (Animatable) obj2;
                    Intrinsics.h(animateTo, "$this$animateTo");
                    MarkerData markerData2 = markerData;
                    Offset offset2 = offset;
                    if (offset2 != null) {
                        ((SnapshotMutableStateImpl) markerData2.f).setValue(new Offset(OffsetKt.b(markerData2.b(), ((Number) animateTo.f()).floatValue(), offset2.f1751a)));
                    }
                    DpOffset dpOffset2 = dpOffset;
                    if (dpOffset2 != null) {
                        long j = ((DpOffset) ((SnapshotMutableStateImpl) markerData2.g).getD()).f2198a;
                        long j2 = dpOffset2.f2198a;
                        float fFloatValue = ((Number) animateTo.f()).floatValue();
                        float fB = MathHelpersKt.b(DpOffset.a(j), DpOffset.a(j2), fFloatValue);
                        float fB2 = MathHelpersKt.b(DpOffset.b(j), DpOffset.b(j2), fFloatValue);
                        ((SnapshotMutableStateImpl) markerData2.g).setValue(new DpOffset((Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fB2) & 4294967295L)));
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (Animatable.d(animatableA, f, this.q, null, function1, this, 4) == coroutineSingletons) {
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
