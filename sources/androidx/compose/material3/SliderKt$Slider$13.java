package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SliderKt$Slider$13 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ SliderState h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ SliderColors k;
    public final /* synthetic */ MutableInteractionSource l;
    public final /* synthetic */ ComposableLambdaImpl m;
    public final /* synthetic */ ComposableLambdaImpl n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$13(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, int i) {
        super(2);
        this.h = sliderState;
        this.i = modifier;
        this.j = z;
        this.k = sliderColors;
        this.l = mutableInteractionSource;
        this.m = composableLambdaImpl;
        this.n = composableLambdaImpl2;
        this.o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.o | 1);
        float f = SliderKt.f1498a;
        ComposerImpl composerImplV = ((Composer) obj).v(-1303883986);
        int i2 = iA & 6;
        SliderState sliderState = this.h;
        if (i2 == 0) {
            i = (composerImplV.I(sliderState) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        Modifier modifier = this.i;
        if (i3 == 0) {
            i |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        boolean z = this.j;
        if (i4 == 0) {
            i |= composerImplV.p(z) ? 256 : 128;
        }
        if ((iA & 3072) == 0) {
            i |= 1024;
        }
        int i5 = iA & 24576;
        MutableInteractionSource mutableInteractionSource = this.l;
        if (i5 == 0) {
            i |= composerImplV.n(mutableInteractionSource) ? 16384 : 8192;
        }
        int i6 = 196608 & iA;
        ComposableLambdaImpl composableLambdaImpl = this.m;
        if (i6 == 0) {
            i |= composerImplV.I(composableLambdaImpl) ? 131072 : 65536;
        }
        int i7 = 1572864 & iA;
        ComposableLambdaImpl composableLambdaImpl2 = this.n;
        if (i7 == 0) {
            i |= composerImplV.I(composableLambdaImpl2) ? 1048576 : 524288;
        }
        int i8 = 599187 & i;
        SliderColors sliderColorsF = this.k;
        if (i8 == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((iA & 1) == 0 || composerImplV.c0()) {
                sliderColorsF = SliderDefaults.f(composerImplV);
            } else {
                composerImplV.j();
            }
            int i9 = i & (-7169);
            composerImplV.W();
            int i10 = i9 >> 3;
            SliderKt.b(modifier, sliderState, z, mutableInteractionSource, composableLambdaImpl, composableLambdaImpl2, composerImplV, (i9 & 896) | (i10 & 14) | ((i9 << 3) & 112) | (i10 & 7168) | (57344 & i10) | (i10 & 458752));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new SliderKt$Slider$13(sliderState, modifier, z, sliderColorsF, mutableInteractionSource, composableLambdaImpl, composableLambdaImpl2, iA);
        }
        return Unit.f24250a;
    }
}
