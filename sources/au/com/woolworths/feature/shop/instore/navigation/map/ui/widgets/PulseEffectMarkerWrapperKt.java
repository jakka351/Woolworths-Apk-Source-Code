package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PulseEffectMarkerWrapperKt {
    public static final void a(Modifier modifier, float f, float f2, float f3, long j, float f4, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        float f5;
        long jH;
        float f6;
        float f7;
        float f8;
        Modifier modifier2;
        float f9;
        float f10;
        ComposableLambdaImpl composableLambdaImpl2;
        final float f11;
        final float f12;
        final float f13;
        final long j2;
        final Modifier modifier3;
        final float f14;
        ComposerImpl composerImplV = composer.v(1084784715);
        if (((i | 208310) & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            f11 = f;
            f14 = f2;
            f13 = f3;
            j2 = j;
            f12 = f4;
            composableLambdaImpl2 = composableLambdaImpl;
        } else {
            composerImplV.u0();
            int i2 = i & 1;
            Modifier.Companion companion = Modifier.Companion.d;
            if (i2 == 0 || composerImplV.c0()) {
                f5 = 0.1f;
                jH = WxTheme.a(composerImplV).h();
                f6 = 44;
                f7 = 50;
                f8 = 100;
                modifier2 = companion;
            } else {
                composerImplV.j();
                modifier2 = modifier;
                f8 = f;
                f7 = f2;
                f6 = f3;
                jH = j;
                f5 = f4;
            }
            composerImplV.W();
            float fT1 = ((Density) composerImplV.x(CompositionLocalsKt.h)).T1(f6);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = AnimatableKt.a(0.1f * fT1);
                composerImplV.A(objG);
            }
            Animatable animatable = (Animatable) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = SingleValueAnimationKt.a(jH);
                composerImplV.A(objD);
            }
            Animatable animatable2 = (Animatable) objD;
            composerImplV.V(false);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(animatable) | composerImplV.I(animatable2) | composerImplV.s(jH) | composerImplV.q(fT1);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1(animatable, animatable2, jH, fT1, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG3);
            Modifier modifierC = OffsetKt.c(SizeKt.z(modifier2, null, 3), BitmapDescriptorFactory.HUE_RED, (f8 - f7) / 2, 1);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierC);
            ComposeUiNode.e3.getClass();
            Modifier modifier4 = modifier2;
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            float f15 = f7;
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierQ = SizeKt.q(companion, f8);
            composerImplV.o(-1224400529);
            boolean zI2 = composerImplV.I(animatable2) | composerImplV.I(animatable);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                float f16 = f8;
                float f17 = f5;
                objG4 = new au.com.woolworths.compose.utils.modifier.a(f16, f17, animatable2, animatable, 1);
                f9 = f16;
                f10 = f17;
                composerImplV.A(objG4);
            } else {
                f9 = f8;
                f10 = f5;
            }
            composerImplV.V(false);
            CanvasKt.a(modifierQ, (Function1) objG4, composerImplV, 0);
            composableLambdaImpl2 = composableLambdaImpl;
            android.support.v4.media.session.a.y(6, composableLambdaImpl2, composerImplV, true);
            f11 = f9;
            f12 = f10;
            f13 = f6;
            j2 = jH;
            modifier3 = modifier4;
            f14 = f15;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            recomposeScopeImplX.d = new Function2(f11, f14, f13, j2, f12, composableLambdaImpl3, i) { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.f
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ float g;
                public final /* synthetic */ long h;
                public final /* synthetic */ float i;
                public final /* synthetic */ ComposableLambdaImpl j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1572865);
                    PulseEffectMarkerWrapperKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
