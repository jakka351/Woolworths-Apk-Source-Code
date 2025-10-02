package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SliderKt$RangeSliderImpl$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ List k;
    public final /* synthetic */ SliderColors l;
    public final /* synthetic */ float m;
    public final /* synthetic */ MutableInteractionSource n;
    public final /* synthetic */ MutableInteractionSource o;
    public final /* synthetic */ Modifier p;
    public final /* synthetic */ Modifier q;
    public final /* synthetic */ Modifier r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$2(boolean z, float f, float f2, List list, SliderColors sliderColors, float f3, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, int i, int i2) {
        super(2);
        this.h = z;
        this.i = f;
        this.j = f2;
        this.k = list;
        this.l = sliderColors;
        this.m = f3;
        this.n = mutableInteractionSource;
        this.o = mutableInteractionSource2;
        this.p = modifier;
        this.q = modifier2;
        this.r = modifier3;
        this.s = i;
        this.t = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        Modifier modifier;
        Modifier modifier2;
        float f;
        List list;
        MutableInteractionSource mutableInteractionSource;
        float f2;
        float f3;
        MutableInteractionSource mutableInteractionSource2;
        SliderColors sliderColors;
        ComposerImpl composerImpl;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.s | 1);
        int iA2 = RecomposeScopeImplKt.a(this.t);
        float f4 = SliderKt.f1325a;
        ComposerImpl composerImplV = ((Composer) obj).v(-278895713);
        int i3 = iA & 6;
        boolean z = this.h;
        if (i3 == 0) {
            i = (composerImplV.p(z) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i4 = iA & 48;
        float f5 = this.i;
        if (i4 == 0) {
            i |= composerImplV.q(f5) ? 32 : 16;
        }
        int i5 = iA & KyberEngine.KyberPolyBytes;
        float f6 = this.j;
        if (i5 == 0) {
            i |= composerImplV.q(f6) ? 256 : 128;
        }
        int i6 = iA & 3072;
        List list2 = this.k;
        if (i6 == 0) {
            i |= composerImplV.I(list2) ? 2048 : 1024;
        }
        int i7 = iA & 24576;
        SliderColors sliderColors2 = this.l;
        if (i7 == 0) {
            i |= composerImplV.n(sliderColors2) ? 16384 : 8192;
        }
        int i8 = 196608 & iA;
        float f7 = this.m;
        if (i8 == 0) {
            i |= composerImplV.q(f7) ? 131072 : 65536;
        }
        int i9 = 1572864 & iA;
        MutableInteractionSource mutableInteractionSource3 = this.n;
        if (i9 == 0) {
            i |= composerImplV.n(mutableInteractionSource3) ? 1048576 : 524288;
        }
        int i10 = 12582912 & iA;
        MutableInteractionSource mutableInteractionSource4 = this.o;
        if (i10 == 0) {
            i |= composerImplV.n(mutableInteractionSource4) ? 8388608 : 4194304;
        }
        int i11 = 100663296 & iA;
        Modifier modifier3 = this.p;
        if (i11 == 0) {
            i |= composerImplV.n(modifier3) ? 67108864 : 33554432;
        }
        int i12 = 805306368 & iA;
        Modifier modifier4 = this.q;
        if (i12 == 0) {
            i |= composerImplV.n(modifier4) ? 536870912 : 268435456;
        }
        int i13 = iA2 & 6;
        Modifier modifier5 = this.r;
        if (i13 == 0) {
            i2 = iA2 | (composerImplV.n(modifier5) ? 4 : 2);
        } else {
            i2 = iA2;
        }
        int i14 = i;
        if (composerImplV.z(i14 & 1, ((i & 306783379) == 306783378 && (i2 & 3) == 2) ? false : true)) {
            final String strA = Strings_androidKt.a(composerImplV, 5);
            final String strA2 = Strings_androidKt.a(composerImplV, 6);
            Modifier modifierX0 = modifier3.x0(SliderKt.f);
            modifier = modifier3;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i15 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            f = f6;
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i15))) {
                b.B(i15, composerImplV, i15, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            float fT1 = density.T1(SliderKt.e);
            float f8 = SliderKt.f1325a;
            composerImpl = composerImplV;
            float fT12 = density.T1(f8);
            float fC = density.C(f7);
            float f9 = f8 * 2;
            float f10 = fC * f5;
            float f11 = fC * f;
            BiasAlignment biasAlignment = Alignment.Companion.d;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierX02 = boxScopeInstance.g(companion, biasAlignment).x0(SizeKt.c);
            int i16 = i14 >> 9;
            int i17 = i14 << 6;
            f2 = f7;
            mutableInteractionSource2 = mutableInteractionSource3;
            SliderKt.c(modifierX02, sliderColors2, z, f5, f, list2, fT12, fT1, composerImpl, (i17 & 458752) | (i16 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
            f3 = f5;
            list = list2;
            sliderColors = sliderColors2;
            z = z;
            boolean zN = composerImpl.n(strA);
            Object objG = composerImpl.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        SemanticsPropertiesKt.k((SemanticsPropertyReceiver) obj3, strA);
                        return Unit.f24250a;
                    }
                };
                composerImpl.A(objG);
            }
            int i18 = i14 & 57344;
            int i19 = (i14 << 15) & 458752;
            SliderKt.b(FocusableKt.a(SemanticsModifierKt.b(companion, true, (Function1) objG), true, mutableInteractionSource2).x0(modifier4), f10, mutableInteractionSource2, sliderColors, z, f9, composerImpl, (i16 & 7168) | 1572870 | i18 | i19);
            boolean zN2 = composerImpl.n(strA2);
            Object objG2 = composerImpl.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        SemanticsPropertiesKt.k((SemanticsPropertyReceiver) obj3, strA2);
                        return Unit.f24250a;
                    }
                };
                composerImpl.A(objG2);
            }
            mutableInteractionSource = mutableInteractionSource4;
            Modifier modifierA = FocusableKt.a(SemanticsModifierKt.b(companion, true, (Function1) objG2), true, mutableInteractionSource);
            modifier2 = modifier5;
            SliderKt.b(modifierA.x0(modifier2), f11, mutableInteractionSource, sliderColors, z, f9, composerImpl, ((i14 >> 12) & 7168) | 1572870 | i18 | i19);
            composerImpl.V(true);
        } else {
            modifier = modifier3;
            modifier2 = modifier5;
            f = f6;
            list = list2;
            mutableInteractionSource = mutableInteractionSource4;
            f2 = f7;
            f3 = f5;
            mutableInteractionSource2 = mutableInteractionSource3;
            sliderColors = sliderColors2;
            composerImpl = composerImplV;
            composerImpl.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            SliderColors sliderColors3 = sliderColors;
            recomposeScopeImplX.d = new SliderKt$RangeSliderImpl$2(z, f3, f, list, sliderColors3, f2, mutableInteractionSource2, mutableInteractionSource, modifier, modifier4, modifier2, iA, iA2);
        }
        return Unit.f24250a;
    }
}
