package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LazyLayoutItemAnimation$animateDisappearance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyLayoutItemAnimation q;
    public final /* synthetic */ FiniteAnimationSpec r;
    public final /* synthetic */ GraphicsLayer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateDisappearance$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, GraphicsLayer graphicsLayer, Continuation continuation) {
        super(2, continuation);
        this.q = lazyLayoutItemAnimation;
        this.r = finiteAnimationSpec;
        this.s = graphicsLayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animateDisappearance$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                Animatable animatable = lazyLayoutItemAnimation.p;
                Float f = new Float(BitmapDescriptorFactory.HUE_RED);
                FiniteAnimationSpec finiteAnimationSpec = this.r;
                final GraphicsLayer graphicsLayer = this.s;
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        graphicsLayer.f(((Number) ((Animatable) obj2).f()).floatValue());
                        lazyLayoutItemAnimation.c.invoke();
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (Animatable.d(animatable, f, finiteAnimationSpec, null, function1, this, 4) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ((SnapshotMutableStateImpl) lazyLayoutItemAnimation.k).setValue(Boolean.TRUE);
            lazyLayoutItemAnimation.f(false);
            return Unit.f24250a;
        } catch (Throwable th) {
            int i2 = LazyLayoutItemAnimation.t;
            lazyLayoutItemAnimation.f(false);
            throw th;
        }
    }
}
