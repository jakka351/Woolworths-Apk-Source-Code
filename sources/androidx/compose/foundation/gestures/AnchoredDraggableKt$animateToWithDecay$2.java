package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1391, 1409, 1433}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AnchoredDraggableKt$animateToWithDecay$2 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<Object>, Object, Continuation<? super Unit>, Object> {
    public /* synthetic */ AnchoredDragScope p;
    public /* synthetic */ DraggableAnchors q;
    public /* synthetic */ Object r;
    public final /* synthetic */ float s;
    public final /* synthetic */ AnimationSpec t;
    public final /* synthetic */ Ref.FloatRef u;
    public final /* synthetic */ DecayAnimationSpec v;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2$3, reason: invalid class name */
    final class AnonymousClass3 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            AnimationScope animationScope = (AnimationScope) obj;
            MutableState mutableState = animationScope.e;
            if (((Number) ((SnapshotMutableStateImpl) mutableState).getD()).floatValue() < BitmapDescriptorFactory.HUE_RED) {
                throw null;
            }
            SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState;
            if (((Number) snapshotMutableStateImpl.getD()).floatValue() > BitmapDescriptorFactory.HUE_RED) {
                throw null;
            }
            ((Number) snapshotMutableStateImpl.getD()).floatValue();
            ((Number) animationScope.f()).floatValue();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(float f, AnimationSpec animationSpec, Ref.FloatRef floatRef, DecayAnimationSpec decayAnimationSpec, Continuation continuation) {
        super(4, continuation);
        this.s = f;
        this.t = animationSpec;
        this.u = floatRef;
        this.v = decayAnimationSpec;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Ref.FloatRef floatRef = this.u;
        DecayAnimationSpec decayAnimationSpec = this.v;
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.s, this.t, floatRef, decayAnimationSpec, (Continuation) obj4);
        anchoredDraggableKt$animateToWithDecay$2.p = (AnchoredDragScope) obj;
        anchoredDraggableKt$animateToWithDecay$2.q = (DraggableAnchors) obj2;
        anchoredDraggableKt$animateToWithDecay$2.r = obj3;
        Unit unit = Unit.f24250a;
        anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (Float.isNaN(this.q.c(this.r))) {
            return Unit.f24250a;
        }
        throw null;
    }
}
