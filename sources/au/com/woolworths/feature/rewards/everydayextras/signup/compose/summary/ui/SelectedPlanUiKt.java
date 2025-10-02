package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.android.onesite.extensions.IntExtKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.common.SubscribePlanExtensionsKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import au.com.woolworths.shared.ui.compose.price.PriceLabelKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SelectedPlanUiKt {
    public static final void a(EverydayExtrasSummaryContentItem.SelectedPlan selectedPlan, Function1 onChangePlanClick, Composer composer, int i) {
        Function1 function1;
        EverydayExtrasSummaryContentItem.SelectedPlan selectedPlan2 = selectedPlan;
        int i2 = selectedPlan2.e;
        Intrinsics.h(onChangePlanClick, "onChangePlanClick");
        ComposerImpl composerImplV = composer.v(330809460);
        int i3 = i | (composerImplV.n(selectedPlan2) ? 4 : 2) | (composerImplV.I(onChangePlanClick) ? 32 : 16);
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function1 = onChangePlanClick;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(SizeKt.e(companion, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(8);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierH, true, (Function1) objG);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            TextKt.b(selectedPlan2.d, SizeKt.e(companion, 1.0f), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImplV).p, composerImplV, 48, 3120, 55292);
            composerImplV = composerImplV;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.j, composerImplV, 6);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            PriceLabelKt.a(null, null, IntExtKt.b(i2), !SubscribePlanExtensionsKt.a(i2) ? IntExtKt.a(i2) : "", null, 0L, composerImplV, 0, 51);
            selectedPlan2 = selectedPlan;
            String str = selectedPlan2.f.d;
            float f = 8;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
            Modifier modifierA = TestTagKt.a(companion, "ChangePlanButton");
            composerImplV.o(-1633490746);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                function1 = onChangePlanClick;
                objG2 = new b(1, function1, selectedPlan2);
                composerImplV.A(objG2);
            } else {
                function1 = onChangePlanClick;
            }
            composerImplV.V(false);
            SecondaryButtonKt.b(str, (Function0) objG2, modifierA, false, false, paddingValuesImpl, null, composerImplV, 196992, 88);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(selectedPlan2, function1, i, 1);
        }
    }
}
