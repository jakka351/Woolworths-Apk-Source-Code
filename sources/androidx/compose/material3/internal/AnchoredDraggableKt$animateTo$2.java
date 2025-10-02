package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {685}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AnchoredDraggableKt$animateTo$2 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<Object>, Object, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ AnchoredDragScope q;
    public /* synthetic */ DraggableAnchors r;
    public /* synthetic */ Object s;
    public final /* synthetic */ AnchoredDraggableState t;
    public final /* synthetic */ float u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState anchoredDraggableState, float f, Continuation continuation) {
        super(4, continuation);
        this.t = anchoredDraggableState;
        this.u = f;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.t, this.u, (Continuation) obj4);
        anchoredDraggableKt$animateTo$2.q = (AnchoredDragScope) obj;
        anchoredDraggableKt$animateTo$2.r = (DraggableAnchors) obj2;
        anchoredDraggableKt$animateTo$2.s = obj3;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final AnchoredDragScope anchoredDragScope = this.q;
            float fC = this.r.c(this.s);
            if (!Float.isNaN(fC)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                AnchoredDraggableState anchoredDraggableState = this.t;
                float fA = Float.isNaN(((SnapshotMutableFloatStateImpl) anchoredDraggableState.j).a()) ? BitmapDescriptorFactory.HUE_RED : ((SnapshotMutableFloatStateImpl) anchoredDraggableState.j).a();
                floatRef.d = fA;
                AnimationSpec animationSpec = anchoredDraggableState.c;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        float fFloatValue = ((Number) obj2).floatValue();
                        anchoredDragScope.a(fFloatValue, ((Number) obj3).floatValue());
                        floatRef.d = fFloatValue;
                        return Unit.f24250a;
                    }
                };
                this.q = null;
                this.r = null;
                this.p = 1;
                if (SuspendAnimationKt.a(fA, fC, this.u, animationSpec, function2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
