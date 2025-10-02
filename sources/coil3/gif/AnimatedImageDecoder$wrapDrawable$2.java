package coil3.gif;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.gif.AnimatedImageDecoder$wrapDrawable$2", f = "AnimatedImageDecoder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AnimatedImageDecoder$wrapDrawable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Drawable p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ Function0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageDecoder$wrapDrawable$2(Drawable drawable, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.p = drawable;
        this.q = function0;
        this.r = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnimatedImageDecoder$wrapDrawable$2(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = (AnimatedImageDecoder$wrapDrawable$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        animatedImageDecoder$wrapDrawable$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.p;
        final Function0 function0 = this.q;
        final Function0 function02 = this.r;
        animatedImageDrawable.registerAnimationCallback(new Animatable2.AnimationCallback() { // from class: coil3.gif.internal.UtilsKt$animatable2CallbackOf$1
            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public final void onAnimationEnd(Drawable drawable) {
                Function0 function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public final void onAnimationStart(Drawable drawable) {
                Function0 function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        });
        return Unit.f24250a;
    }
}
