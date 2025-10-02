package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1$deferredColor$1", f = "PulseEffectMarkerWrapper.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1$deferredColor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnimationResult<Color, AnimationVector4D>>, Object> {
    public int p;
    public final /* synthetic */ Animatable q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1$deferredColor$1(Animatable animatable, long j, Continuation continuation) {
        super(2, continuation);
        this.q = animatable;
        this.r = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1$deferredColor$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1$deferredColor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Color color = new Color(Color.b(this.r, BitmapDescriptorFactory.HUE_RED));
        TweenSpec tweenSpecE = AnimationSpecKt.e(1000, 0, EasingKt.f756a, 2);
        this.p = 1;
        Object objD = Animatable.d(this.q, color, tweenSpecE, null, null, this, 12);
        return objD == coroutineSingletons ? coroutineSingletons : objD;
    }
}
