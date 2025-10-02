package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.CheckboxColors;
import androidx.compose.material.CheckboxDefaults;
import androidx.compose.material.CheckboxKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CheckableTextUiKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    public static final void a(final EverydayExtrasSummaryContentItem.CheckableTextItem checkableTextItem, boolean z, boolean z2, final Function1 onCheckboxToggle, Composer composer, int i) {
        ?? r3;
        Function2 function2;
        Function2 function22;
        Function0 function0;
        Function2 function23;
        Arrangement$Start$1 arrangement$Start$1;
        CheckboxColors checkboxColorsA;
        EverydayExtrasSummaryContentItem.CheckableTextItem checkableTextItem2;
        ComposerImpl composerImpl;
        Intrinsics.h(onCheckboxToggle, "onCheckboxToggle");
        ComposerImpl composerImplV = composer.v(-1410722912);
        int i2 = i | (composerImplV.n(checkableTextItem) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.p(z2) ? 256 : 128) | (composerImplV.I(onCheckboxToggle) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            checkableTextItem2 = checkableTextItem;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 4;
            float f2 = 12;
            Modifier modifierJ = PaddingKt.j(PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f2, 5);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function24 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function24);
            Function2 function25 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function25);
            Function2 function26 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function26);
            }
            Function2 function27 = ComposeUiNode.Companion.d;
            Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD, function27, 1849434622);
            Object obj = Composer.Companion.f1624a;
            if (objF == obj) {
                objF = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objF);
            }
            final MutableState mutableState = (MutableState) objF;
            composerImplV.V(false);
            Arrangement$Start$1 arrangement$Start$12 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.j;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$12, vertical, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function24);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function25);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function26);
            }
            Updater.b(composerImplV, modifierD2, function27);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function24);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function25);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function26);
            }
            Updater.b(composerImplV, modifierD3, function27);
            composerImplV.o(1363325534);
            if (z2) {
                r3 = 0;
                BoxKt.a(BackgroundKt.b(SizeKt.q(companion, 18), ColorResources_androidKt.a(composerImplV, R.color.everyday_extras_checkbox_error_background), RectangleShapeKt.f1779a), composerImplV, 0);
            } else {
                r3 = 0;
            }
            composerImplV.V(r3);
            Modifier modifierA = TestTagKt.a(SizeKt.q(companion, 24), "checkbox");
            if (z2) {
                composerImplV.o(-686050002);
                function2 = function25;
                arrangement$Start$1 = arrangement$Start$12;
                function22 = function26;
                function0 = function02;
                function23 = function24;
                checkboxColorsA = CheckboxDefaults.a(RewardsColors.b, ColorResources_androidKt.a(composerImplV, R.color.everyday_extras_subscription_error), composerImplV, 0, 28);
                composerImplV.V(r3);
            } else {
                function2 = function25;
                function22 = function26;
                function0 = function02;
                function23 = function24;
                arrangement$Start$1 = arrangement$Start$12;
                composerImplV.o(-685773637);
                checkboxColorsA = CheckboxDefaults.a(RewardsColors.b, 0L, composerImplV, 0, 30);
                composerImplV.V(r3);
            }
            composerImplV.o(-1633490746);
            boolean z3 = (i2 & 7168) == 2048 ? true : r3;
            Object objG = composerImplV.G();
            if (z3 || objG == obj) {
                objG = new Function1() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        bool.booleanValue();
                        mutableState.setValue(bool);
                        onCheckboxToggle.invoke(bool);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(r3);
            CheckboxKt.a(z, (Function1) objG, modifierA, false, checkboxColorsA, composerImplV, ((i2 >> 3) & 14) | KyberEngine.KyberPolyBytes, 24);
            composerImplV.V(true);
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-7022665, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.CheckableTextUiKt$CheckableTextUi$1$1$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        MarkdownCompatKt.a(checkableTextItem.d, PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new MarkdownTextViewStyle((Density) composer2.x(CompositionLocalsKt.h), WxTheme.a(composer2).c(), WxTheme.b(composer2).l, (TextAlign) null, 24), null, false, new Color(CoreTheme.b(composer2).f4782a.d.b.f4798a), null, false, null, null, composer2, 48, 984);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            composerImplV.V(true);
            Modifier modifierA2 = AlphaKt.a(PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), z2 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composerImplV, r3);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierA2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA2, function23);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function2);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function22);
            }
            Updater.b(composerImplV, modifierD4, function27);
            Modifier modifierQ = SizeKt.q(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), f2);
            checkableTextItem2 = checkableTextItem;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_everyday_extras_error_filled, r3, composerImplV), null, modifierQ, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
            Modifier modifierJ2 = PaddingKt.j(RowScopeInstance.f974a.a(companion, 1.0f, true), 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            String str = checkableTextItem2.f;
            if (str == null) {
                str = "";
            }
            TextKt.b(str, modifierJ2, ColorResources_androidKt.a(composerImplV, R.color.everyday_extras_subscription_error), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65528);
            ComposerImpl composerImpl2 = composerImplV;
            composerImpl2.V(true);
            composerImpl2.V(true);
            composerImpl = composerImpl2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(checkableTextItem2, z, z2, onCheckboxToggle, i);
        }
    }
}
