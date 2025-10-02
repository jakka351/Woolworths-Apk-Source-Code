package au.com.woolworths.feature.rewards.redemptionsettings.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionIconExtKt;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingCta;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.compose.utils.modifier.OptionalModifierKt;
import au.com.woolworths.design.core.ui.component.stable.f;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "ctaSize", "redemption-settings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RedemptionSettingKt {
    public static final void a(final boolean z, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1447937578);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-101388722);
            long jH = z ? WxTheme.a(composerImplV).h() : ToneColors.i;
            composerImplV.V(false);
            BoxKt.a(BackgroundKt.b(ClipKt.a(SizeKt.q(Modifier.Companion.d, 40), RoundedCornerShapeKt.f1100a), jH, RectangleShapeKt.f1779a), composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.ui.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    RedemptionSettingKt.a(z, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final RewardsRedemptionSettingsItem item, final Function0 onCtaClick, Modifier modifier, final boolean z, final boolean z2, Composer composer, int i, int i2) {
        int i3;
        PaddingValuesImpl paddingValuesImpl;
        boolean z3;
        Modifier modifier2;
        Intrinsics.h(item, "item");
        Intrinsics.h(onCtaClick, "onCtaClick");
        ComposerImpl composerImplV = composer.v(1792768091);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerImplV.n(item) : composerImplV.I(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onCtaClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.p(z2) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            z3 = z;
            modifier2 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            Modifier modifier3 = modifier;
            if (item.getCta() == null) {
                paddingValuesImpl = RedemptionCommonUIKt.f6474a;
            } else {
                float f = 16;
                paddingValuesImpl = new PaddingValuesImpl(f, 24, f, f);
            }
            z3 = z;
            RedemptionCommonUIKt.a(z3, modifier3, paddingValuesImpl, ComposableLambdaKt.c(2141508381, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionSettingKt$RedemptionSetting$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope SettingBox = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(SettingBox, "$this$SettingBox");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        RedemptionSettingKt.c(item, onCtaClick, null, z, z2, composer2, RewardsRedemptionSettingsItem.$stable);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 9) & 14) | 3072 | ((i3 >> 3) & 112), 0);
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(item, onCtaClick, modifier2, z3, z2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    public static final void c(RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem, Function0 function0, Modifier modifier, boolean z, boolean z2, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        ?? r10;
        Modifier.Companion companion2;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-784938533);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(rewardsRedemptionSettingsItem) : composerImplV.I(rewardsRedemptionSettingsItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.p(z2) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion3 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion3);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
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
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion3);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            float f = 16;
            Modifier modifierJ = PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 11);
            BiasAlignment biasAlignment = Alignment.Companion.e;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            a(z, composerImplV, (i3 >> 9) & 14);
            RewardsRedemptionSettingCta rewardsRedemptionSettingCta = null;
            if (z2) {
                composerImplV.o(1047259172);
                companion = companion3;
                r10 = 0;
                ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, SizeKt.q(BoxScopeInstance.f944a.g(companion3, biasAlignment), 24));
                composerImplV.V(false);
            } else {
                companion = companion3;
                r10 = 0;
                composerImplV.o(1047496322);
                ImageKt.a(PainterResources_androidKt.a(RewardsRedemptionIconExtKt.getIconRes(rewardsRedemptionSettingsItem.getIcon(), z), 0, composerImplV), null, SizeKt.q(companion, 24), null, null, BitmapDescriptorFactory.HUE_RED, z ? ColorFilter.Companion.a(Color.f) : null, composerImplV, 432, 56);
                composerImplV.V(false);
            }
            composerImplV.V(true);
            Modifier.Companion companion4 = companion;
            int i7 = i3;
            RedemptionCommonUIKt.b(rewardsRedemptionSettingsItem.getTitle(), rewardsRedemptionSettingsItem.getBody(), null, z, composerImplV, i3 & 7168, 4);
            composerImplV.V(true);
            RewardsRedemptionSettingCta cta = rewardsRedemptionSettingsItem.getCta();
            if (cta != null && rewardsRedemptionSettingsItem.isSelected()) {
                rewardsRedemptionSettingCta = cta;
            }
            composerImplV.o(-1705427579);
            if (rewardsRedemptionSettingCta == null) {
                companion2 = companion4;
            } else {
                SpacerKt.a(composerImplV, SizeKt.g(companion4, f));
                companion2 = companion4;
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, ToneColors.i, composerImplV, null);
                float fT1 = ((Density) composerImplV.x(CompositionLocalsKt.h)).T1(32);
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                Object obj = Composer.Companion.f1624a;
                if (objG == obj) {
                    objG = SnapshotStateKt.f(new IntSize(0L));
                    composerImplV.A(objG);
                }
                MutableState mutableState = (MutableState) objG;
                composerImplV.V(r10);
                float f2 = (int) (((IntSize) mutableState.getD()).f2202a >> 32);
                Float fValueOf = Float.valueOf(f2 / (f2 + fT1));
                float f3 = (int) (((IntSize) mutableState.getD()).f2202a & 4294967295L);
                Float fValueOf2 = Float.valueOf(f3 / (fT1 + f3));
                Pair pair = new Pair(fValueOf, fValueOf2);
                composerImplV.o(5004770);
                Object objG2 = composerImplV.G();
                if (objG2 == obj) {
                    objG2 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 3);
                    composerImplV.A(objG2);
                }
                composerImplV.V(r10);
                Modifier modifierA = OnRemeasuredModifierKt.a(companion2, (Function1) objG2);
                boolean z3 = fValueOf2.floatValue() * fValueOf.floatValue() > BitmapDescriptorFactory.HUE_RED ? true : r10;
                composerImplV.o(-1633490746);
                boolean zN = ((i7 & 112) == 32 ? true : r10) | composerImplV.n(pair);
                Object objG3 = composerImplV.G();
                if (zN || objG3 == obj) {
                    objG3 = new androidx.lifecycle.f(20, pair, function0);
                    composerImplV.A(objG3);
                }
                composerImplV.V(r10);
                d(rewardsRedemptionSettingCta, OptionalModifierKt.a(modifierA, z3, (Function1) objG3), composerImplV, RewardsRedemptionSettingCta.$stable, r10);
            }
            composerImplV.V(r10);
            composerImplV.V(true);
            modifier2 = companion2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(rewardsRedemptionSettingsItem, function0, modifier2, z, z2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingCta r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionSettingKt.d(au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingCta, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
