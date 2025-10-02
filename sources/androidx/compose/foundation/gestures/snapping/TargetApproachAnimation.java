package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/TargetApproachAnimation;", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TargetApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimationSpec f918a;

    public TargetApproachAnimation(AnimationSpec animationSpec) {
        this.f918a = animationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public final Object a(ScrollScope scrollScope, Float f, Float f2, Function1 function1, Continuation continuation) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objC = SnapFlingBehaviorKt.c(scrollScope, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, AnimationStateKt.a(BitmapDescriptorFactory.HUE_RED, fFloatValue2, 28), this.f918a, function1, (ContinuationImpl) continuation);
        return objC == CoroutineSingletons.d ? objC : (AnimationResult) objC;
    }
}
