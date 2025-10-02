package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
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

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "Landroidx/compose/material3/DrawerValue;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", l = {254}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DrawerState$animateTo$3 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<DrawerValue>, DrawerValue, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ AnchoredDragScope q;
    public /* synthetic */ DraggableAnchors r;
    public /* synthetic */ DrawerValue s;
    public final /* synthetic */ DrawerState t;
    public final /* synthetic */ float u;
    public final /* synthetic */ AnimationSpec v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$animateTo$3(DrawerState drawerState, float f, AnimationSpec animationSpec, Continuation continuation) {
        super(4, continuation);
        this.t = drawerState;
        this.u = f;
        this.v = animationSpec;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.u;
        AnimationSpec animationSpec = this.v;
        DrawerState$animateTo$3 drawerState$animateTo$3 = new DrawerState$animateTo$3(this.t, f, animationSpec, (Continuation) obj4);
        drawerState$animateTo$3.q = (AnchoredDragScope) obj;
        drawerState$animateTo$3.r = (DraggableAnchors) obj2;
        drawerState$animateTo$3.s = (DrawerValue) obj3;
        return drawerState$animateTo$3.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnchoredDraggableState anchoredDraggableState = this.t.f1441a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final AnchoredDragScope anchoredDragScope = this.q;
            float fC = this.r.c(this.s);
            if (!Float.isNaN(fC)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float fA = Float.isNaN(((SnapshotMutableFloatStateImpl) anchoredDraggableState.j).a()) ? BitmapDescriptorFactory.HUE_RED : ((SnapshotMutableFloatStateImpl) anchoredDraggableState.j).a();
                floatRef.d = fA;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.DrawerState$animateTo$3.1
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
                if (SuspendAnimationKt.a(fA, fC, this.u, this.v, function2, this) == coroutineSingletons) {
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
