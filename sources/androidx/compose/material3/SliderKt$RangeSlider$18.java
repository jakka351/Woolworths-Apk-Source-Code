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
final class SliderKt$RangeSlider$18 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ RangeSliderState h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ SliderColors k;
    public final /* synthetic */ MutableInteractionSource l;
    public final /* synthetic */ MutableInteractionSource m;
    public final /* synthetic */ ComposableLambdaImpl n;
    public final /* synthetic */ ComposableLambdaImpl o;
    public final /* synthetic */ ComposableLambdaImpl p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$18(RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, int i) {
        super(2);
        this.h = rangeSliderState;
        this.i = modifier;
        this.j = z;
        this.k = sliderColors;
        this.l = mutableInteractionSource;
        this.m = mutableInteractionSource2;
        this.n = composableLambdaImpl;
        this.o = composableLambdaImpl2;
        this.p = composableLambdaImpl3;
        this.q = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.q | 1);
        float f = SliderKt.f1498a;
        ComposerImpl composerImplV = ((Composer) obj).v(511405654);
        int i2 = iA & 6;
        RangeSliderState rangeSliderState = this.h;
        if (i2 == 0) {
            i = (composerImplV.I(rangeSliderState) ? 4 : 2) | iA;
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
        MutableInteractionSource mutableInteractionSource2 = this.m;
        if (i6 == 0) {
            i |= composerImplV.n(mutableInteractionSource2) ? 131072 : 65536;
        }
        int i7 = 1572864 & iA;
        ComposableLambdaImpl composableLambdaImpl = this.n;
        if (i7 == 0) {
            i |= composerImplV.I(composableLambdaImpl) ? 1048576 : 524288;
        }
        int i8 = 12582912 & iA;
        ComposableLambdaImpl composableLambdaImpl2 = this.o;
        if (i8 == 0) {
            i |= composerImplV.I(composableLambdaImpl2) ? 8388608 : 4194304;
        }
        int i9 = 100663296 & iA;
        ComposableLambdaImpl composableLambdaImpl3 = this.p;
        if (i9 == 0) {
            i |= composerImplV.I(composableLambdaImpl3) ? 67108864 : 33554432;
        }
        int i10 = 38347923 & i;
        SliderColors sliderColorsF = this.k;
        if (i10 == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((iA & 1) == 0 || composerImplV.c0()) {
                sliderColorsF = SliderDefaults.f(composerImplV);
            } else {
                composerImplV.j();
            }
            int i11 = i & (-7169);
            composerImplV.W();
            int i12 = i11 >> 3;
            SliderKt.a(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource2, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, composerImplV, (i11 & 896) | (i12 & 14) | ((i11 << 3) & 112) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (i12 & 29360128));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new SliderKt$RangeSlider$18(rangeSliderState, modifier, z, sliderColorsF, mutableInteractionSource, mutableInteractionSource2, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, iA);
        }
        return Unit.f24250a;
    }
}
