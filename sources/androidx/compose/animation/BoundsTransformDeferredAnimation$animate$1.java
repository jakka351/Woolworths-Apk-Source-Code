package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", f = "AnimateBoundsModifier.kt", l = {428}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BoundsTransformDeferredAnimation$animate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Animatable p;
    public final /* synthetic */ Rect q;
    public final /* synthetic */ BoundsTransformDeferredAnimation r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundsTransformDeferredAnimation$animate$1(Animatable animatable, Rect rect, BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, Continuation continuation) {
        super(2, continuation);
        this.p = animatable;
        this.q = rect;
        this.r = boundsTransformDeferredAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoundsTransformDeferredAnimation$animate$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BoundsTransformDeferredAnimation$animate$1 boundsTransformDeferredAnimation$animate$1 = (BoundsTransformDeferredAnimation$animate$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        boundsTransformDeferredAnimation$animate$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        BoundsTransformDeferredAnimation boundsTransformDeferredAnimation = this.r;
        long j = boundsTransformDeferredAnimation.d;
        long j2 = boundsTransformDeferredAnimation.c;
        Intrinsics.e(((9223372034707292159L & j2) == 9205357640488583168L || j == 9205357640488583168L) ? null : RectKt.a(j2, j));
        throw null;
    }
}
