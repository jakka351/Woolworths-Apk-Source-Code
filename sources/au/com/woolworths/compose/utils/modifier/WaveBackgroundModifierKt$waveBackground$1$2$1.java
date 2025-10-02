package au.com.woolworths.compose.utils.modifier;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.random.AbstractPlatformRandom;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$waveBackground$1$2$1", f = "WaveBackgroundModifier.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WaveBackgroundModifierKt$waveBackground$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Animatable p;
    public final /* synthetic */ long q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveBackgroundModifierKt$waveBackground$1$2$1(Animatable animatable, long j, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = animatable;
        this.q = j;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WaveBackgroundModifierKt$waveBackground$1$2$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        WaveBackgroundModifierKt$waveBackground$1$2$1 waveBackgroundModifierKt$waveBackground$1$2$1 = (WaveBackgroundModifierKt$waveBackground$1$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        waveBackgroundModifierKt$waveBackground$1$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (((Number) this.p.f()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
            long j = this.q;
            if (!Size.a(j, 0L)) {
                int i = (int) (j >> 32);
                float f = 2;
                float fIntBitsToFloat = Float.intBitsToFloat(i) / f;
                int i2 = (int) (j & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / f;
                float fIntBitsToFloat3 = fIntBitsToFloat - (Float.intBitsToFloat(i) * 3.0f);
                float fIntBitsToFloat4 = (Float.intBitsToFloat(i) * 2.0f) + fIntBitsToFloat;
                float fIntBitsToFloat5 = fIntBitsToFloat2 - (Float.intBitsToFloat(i2) * 3.0f);
                float fIntBitsToFloat6 = (Float.intBitsToFloat(i2) * 2.0f) + fIntBitsToFloat2;
                AbstractPlatformRandom abstractPlatformRandom = Random.e;
                float fA = YU.a.a(fIntBitsToFloat4, fIntBitsToFloat3, abstractPlatformRandom.g(), fIntBitsToFloat3);
                float fA2 = YU.a.a(fIntBitsToFloat6, fIntBitsToFloat5, abstractPlatformRandom.g(), fIntBitsToFloat5);
                this.r.setValue(new Offset((Float.floatToRawIntBits(fA2) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32)));
            }
        }
        return Unit.f24250a;
    }
}
