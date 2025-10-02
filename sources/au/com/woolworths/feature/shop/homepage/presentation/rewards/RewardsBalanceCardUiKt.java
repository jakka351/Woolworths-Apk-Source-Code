package au.com.woolworths.feature.shop.homepage.presentation.rewards;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.homepage.data.AlertIndicator;
import au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData;
import au.com.woolworths.foundation.rewards.common.ui.pointsbalance.PointsIndicatorDescriptionKt;
import au.com.woolworths.foundation.rewards.common.ui.pointsbalance.PointsProgressBarKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"", "showOffersPopup", "showPointsPopup", "isIndicatorDescriptionVisible", "", "internalPoints", "points", "homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsBalanceCardUiKt {
    public static final void a(final RewardsBalanceCardData rewardsBalanceCardData, Function0 function0, final Function0 function02, final Function0 function03, Modifier modifier, Function1 function1, Composer composer, int i) {
        Function1 function12;
        Function0 function04;
        ComposerImpl composerImplV = composer.v(1805065644);
        int i2 = i | (composerImplV.I(rewardsBalanceCardData) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.I(function02) ? 256 : 128) | (composerImplV.I(function03) ? 2048 : 1024) | (composerImplV.n(modifier) ? 16384 : 8192) | 196608;
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            function12 = function1;
            function04 = function02;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.shop.homepage.presentation.modeselector.d(4);
                composerImplV.A(objG);
            }
            Function1 function13 = (Function1) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objD);
            }
            final MutableState mutableState = (MutableState) objD;
            Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD2 == composer$Companion$Empty$1) {
                objD2 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objD2);
            }
            final MutableState mutableState2 = (MutableState) objD2;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(7, function0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierA = TestTagKt.a(ClickableKt.d(modifier, false, null, null, (Function0) objG2, 7), "pointsBalanceCard");
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(rewardsBalanceCardData);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new l(rewardsBalanceCardData, 27);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            CardKt.a(SemanticsModifierKt.b(modifierA, true, (Function1) objG3), null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1071953129, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.rewards.RewardsBalanceCardUiKt$PointsBalanceCard$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    MutableState mutableState3;
                    MutableState mutableState4;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierG = PaddingKt.g(companion, 10, 8);
                        composer2.o(1849434622);
                        Object objG4 = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (objG4 == obj3) {
                            objG4 = new au.com.woolworths.feature.shop.homepage.presentation.modeselector.d(5);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        Modifier modifierA2 = SemanticsModifierKt.a(modifierG, (Function1) objG4);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierA2);
                        ComposeUiNode.e3.getClass();
                        Function0 function05 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function05);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composer2.o(-470801168);
                        RewardsBalanceCardData rewardsBalanceCardData2 = rewardsBalanceCardData;
                        float f = rewardsBalanceCardData2.c;
                        int i3 = rewardsBalanceCardData2.d;
                        if (i3 < 1) {
                            i3 = 1;
                        }
                        float fB = RangesKt.b(f / i3, BitmapDescriptorFactory.HUE_RED, 1.0f);
                        boolean z2 = rewardsBalanceCardData2.c == ProgressBarAnimationConfig.f7254a;
                        boolean z3 = !z2;
                        boolean zBooleanValue = ((Boolean) composer2.x(InspectionModeKt.f1972a)).booleanValue();
                        composer2.o(1849434622);
                        Object objG5 = composer2.G();
                        if (objG5 == obj3) {
                            objG5 = SnapshotStateKt.f(Boolean.valueOf(zBooleanValue || z2));
                            composer2.A(objG5);
                        }
                        MutableState mutableState5 = (MutableState) objG5;
                        composer2.l();
                        String str = rewardsBalanceCardData2.b;
                        int i4 = rewardsBalanceCardData2.c;
                        int i5 = rewardsBalanceCardData2.d;
                        AlertIndicator alertIndicator = rewardsBalanceCardData2.i;
                        String str2 = alertIndicator != null ? alertIndicator.f7178a : null;
                        AlertIndicator alertIndicator2 = rewardsBalanceCardData2.j;
                        String str3 = alertIndicator2 != null ? alertIndicator2.f7178a : null;
                        MutableState mutableState6 = mutableState;
                        boolean zBooleanValue2 = ((Boolean) mutableState6.getD()).booleanValue();
                        MutableState mutableState7 = mutableState2;
                        boolean zBooleanValue3 = ((Boolean) mutableState7.getD()).booleanValue();
                        composer2.o(-1633490746);
                        Function0 function06 = function02;
                        boolean zN = composer2.n(function06);
                        Object objG6 = composer2.G();
                        if (zN || objG6 == obj3) {
                            mutableState3 = mutableState5;
                            objG6 = new d(function06, mutableState6, 0);
                            composer2.A(objG6);
                        } else {
                            mutableState3 = mutableState5;
                        }
                        Function0 function07 = (Function0) objG6;
                        composer2.l();
                        composer2.o(-1633490746);
                        Function0 function08 = function03;
                        boolean zN2 = composer2.n(function08);
                        Object objG7 = composer2.G();
                        if (zN2 || objG7 == obj3) {
                            objG7 = new d(function08, mutableState7, 1);
                            composer2.A(objG7);
                        }
                        Function0 function09 = (Function0) objG7;
                        Object objE = au.com.woolworths.android.onesite.a.e(composer2, -1633490746);
                        if (objE == obj3) {
                            objE = new e(mutableState6, mutableState7, 0);
                            composer2.A(objE);
                        }
                        composer2.l();
                        RewardsBalanceCardUiKt.b(str, str2, str3, function07, function09, (Function0) objE, i4, i5, 0, 0, zBooleanValue2, zBooleanValue3, z3, composer2, 196608);
                        SpacerKt.a(composer2, ColumnScopeInstance.f948a.a(companion, 1.0f, true));
                        Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, 4, 5);
                        composer2.o(-1633490746);
                        boolean zI2 = composer2.I(rewardsBalanceCardData2);
                        Object objG8 = composer2.G();
                        if (zI2 || objG8 == obj3) {
                            mutableState4 = mutableState3;
                            objG8 = new n(11, rewardsBalanceCardData2, mutableState4);
                            composer2.A(objG8);
                        } else {
                            mutableState4 = mutableState3;
                        }
                        composer2.l();
                        PointsProgressBarKt.a(fB, true, (Function0) objG8, modifierJ, z3, composer2, 3120);
                        PointsIndicatorDescriptionKt.a(rewardsBalanceCardData2.f, null, rewardsBalanceCardData2.g, ((Boolean) mutableState4.getD()).booleanValue(), true, composer2, 24576, 2);
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 62);
            composerImplV = composerImplV;
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(rewardsBalanceCardData);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                function12 = function13;
                objG4 = new RewardsBalanceCardUiKt$PointsBalanceCard$5$1(function12, rewardsBalanceCardData, null);
                composerImplV.A(objG4);
            } else {
                function12 = function13;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, rewardsBalanceCardData, (Function2) objG4);
            Boolean bool = (Boolean) mutableState2.getD();
            bool.getClass();
            composerImplV.o(-1633490746);
            boolean z2 = (i2 & 7168) == 2048;
            Object objG5 = composerImplV.G();
            if (z2 || objG5 == composer$Companion$Empty$1) {
                objG5 = new RewardsBalanceCardUiKt$PointsBalanceCard$6$1(function03, mutableState2, null);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, bool, (Function2) objG5);
            Boolean bool2 = (Boolean) mutableState.getD();
            bool2.getClass();
            composerImplV.o(-1633490746);
            boolean z3 = (i2 & 896) == 256;
            Object objG6 = composerImplV.G();
            if (z3 || objG6 == composer$Companion$Empty$1) {
                function04 = function02;
                objG6 = new RewardsBalanceCardUiKt$PointsBalanceCard$7$1(function04, mutableState, null);
                composerImplV.A(objG6);
            } else {
                function04 = function02;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, bool2, (Function2) objG6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.c(rewardsBalanceCardData, function0, function04, function03, modifier, function12, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ff  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r56, final java.lang.String r57, final java.lang.String r58, final kotlin.jvm.functions.Function0 r59, kotlin.jvm.functions.Function0 r60, final kotlin.jvm.functions.Function0 r61, int r62, int r63, int r64, int r65, final boolean r66, final boolean r67, final boolean r68, androidx.compose.runtime.Composer r69, final int r70) {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.homepage.presentation.rewards.RewardsBalanceCardUiKt.b(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, int, int, int, boolean, boolean, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData r15, final kotlin.jvm.functions.Function0 r16, final kotlin.jvm.functions.Function0 r17, final kotlin.jvm.functions.Function0 r18, final kotlin.jvm.functions.Function0 r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.homepage.presentation.rewards.RewardsBalanceCardUiKt.c(au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(final boolean z, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1315485473);
        if ((((composerImplV.p(z) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            String strC = StringResources_androidKt.c(composerImplV, R.string.rewards_show_barcode_content_description);
            Modifier modifierC = SizeKt.c(modifier, 1.0f);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(strC);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(strC, 5);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            CardKt.a(SemanticsModifierKt.b(modifierC, true, (Function1) objG), null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(2110967774, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.rewards.RewardsBalanceCardUiKt$ShowCardCard$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = z ? 8 : 16;
                        float f2 = 6;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierI = PaddingKt.i(companion, f, 8, f, f2);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.i(f2, Alignment.Companion.k), Alignment.Companion.n, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierI);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_rewards_card_small, 0, composer2), null, SizeKt.o(companion, 32), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 432, 120);
                        composer2.o(1849434622);
                        Object objG2 = composer2.G();
                        if (objG2 == Composer.Companion.f1624a) {
                            objG2 = new au.com.woolworths.feature.shop.homepage.presentation.modeselector.d(6);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.rewards_show_card), SemanticsModifierKt.a(companion, (Function1) objG2), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).r, composer2, 0, 0, 65020);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 62);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(z, modifier, i, 0);
        }
    }
}
