package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.wx.component.icon.IconKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipe-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class NutritionCircleIndicatorKt {
    public static final void a(float f, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1516952494);
        int i2 = (composerImplV.q(f) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            List listR = CollectionsKt.R(new Color(ColorResources_androidKt.a(composerImplV, R.color.energy_doughnut_start_color)), new Color(ColorResources_androidKt.a(composerImplV, R.color.energy_doughnut_end_color)));
            float fT1 = ((Density) composerImplV.x(CompositionLocalsKt.h)).T1(8);
            Stroke stroke = new Stroke(fT1, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG);
            }
            Animatable animatable = (Animatable) objG;
            composerImplV.V(false);
            float fFloatValue = ((Number) animatable.f()).floatValue() * 360.0f;
            float f2 = fT1 / 2;
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 14) == 4) | composerImplV.I(animatable);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new NutritionCircleIndicatorKt$AnimatedCircularProgressBar$1$1(animatable, f, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, animatable, (Function2) objG2);
            Modifier modifierA = RotateKt.a(modifier, -90.0f);
            composerImplV.o(-1224400529);
            boolean zQ = composerImplV.q(f2) | composerImplV.I(stroke) | composerImplV.n(listR) | composerImplV.q(fFloatValue);
            Object objG3 = composerImplV.G();
            if (zQ || objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.compose.utils.modifier.a(f2, stroke, listR, fFloatValue);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            CanvasKt.a(modifierA, (Function1) objG3, composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(f, modifier, i);
        }
    }

    public static final void b(int i, int i2, Composer composer, Modifier modifier) {
        ComposerImpl composerImplV = composer.v(1024911548);
        if ((((composerImplV.r(i) ? 4 : 2) | i2 | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            modifier = Modifier.Companion.d;
            Modifier modifierQ = SizeKt.q(modifier, 56);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierQ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
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
            a(i / 100.0f, SizeKt.c, composerImplV, 0);
            IconKt.b(VectorResources_androidKt.b(R.drawable.ic_lightning, 6, composerImplV), null, null, ColorResources_androidKt.a(composerImplV, R.color.color_charcoal), composerImplV, 48, 4);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, modifier, i2, 0);
        }
    }
}
