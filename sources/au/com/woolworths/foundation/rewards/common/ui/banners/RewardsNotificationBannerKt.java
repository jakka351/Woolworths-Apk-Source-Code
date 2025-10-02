package au.com.woolworths.foundation.rewards.common.ui.banners;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.rewards.common.ui.banners.analytics.RewardsBannerAnalytics;
import au.com.woolworths.foundation.rewards.common.ui.banners.data.RewardsNotificationBannerData;
import au.com.woolworths.foundation.rewards.common.ui.buttons.ActionTextButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsNotificationBannerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8572a = 0;

    static {
        new RewardsNotificationBannerData(Integer.valueOf(R.drawable.ic_info_filled), TintColors.b, "Everyday Extra benefits have been paused", "We couldn’t process your payment. Your benefits have been suspended as a result.", AccentColors.b, "Update details", Boolean.TRUE, Boolean.FALSE, new RewardsBannerAnalytics("", ""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final void a(RewardsNotificationBannerData rewardsNotificationBannerData, Function0 onCloseButtonClick, Function0 onActionButtonClick, Modifier modifier, Composer composer, int i) {
        Function2 function2;
        Modifier.Companion companion;
        RowScopeInstance rowScopeInstance;
        Arrangement$Top$1 arrangement$Top$1;
        BiasAlignment.Horizontal horizontal;
        Function2 function22;
        Function2 function23;
        Function2 function24;
        boolean z;
        ComposerImpl composerImpl;
        int i2;
        float f;
        Modifier.Companion companion2;
        ComposerImpl composerImpl2;
        final Function0 function0;
        boolean z2;
        boolean z3;
        Modifier.Companion companion3;
        ComposerImpl composerImpl3;
        Modifier modifier2;
        ComposerImpl composerImpl4;
        final RewardsNotificationBannerData rewardsNotificationBannerData2 = rewardsNotificationBannerData;
        Integer num = rewardsNotificationBannerData2.f8575a;
        Intrinsics.h(onCloseButtonClick, "onCloseButtonClick");
        Intrinsics.h(onActionButtonClick, "onActionButtonClick");
        ComposerImpl composerImplV = composer.v(826886234);
        int i3 = i | (composerImplV.n(rewardsNotificationBannerData2) ? 4 : 2) | (composerImplV.I(onCloseButtonClick) ? 32 : 16) | (composerImplV.I(onActionButtonClick) ? 256 : 128) | 3072;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            function0 = onActionButtonClick;
            composerImpl4 = composerImplV;
        } else {
            Modifier.Companion companion4 = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(SizeKt.e(companion4, 1.0f), rewardsNotificationBannerData2.b, RectangleShapeKt.f1779a);
            Arrangement$Top$1 arrangement$Top$12 = Arrangement.c;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$12, horizontal2, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function25 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function25);
            Function2 function26 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function26);
            Function2 function27 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            Modifier modifierE = SizeKt.e(companion4, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function25);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function26);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function27);
            }
            Updater.b(composerImplV, modifierD2, function28);
            composerImplV.o(-1479922909);
            int iIntValue = num.intValue();
            composerImplV.o(-1479922241);
            int iIntValue2 = num.intValue();
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f974a;
            if (iIntValue2 > 0) {
                float f2 = 12;
                Modifier modifierB2 = rowScopeInstance2.b(SizeKt.q(PaddingKt.j(companion4, f2, f2, BitmapDescriptorFactory.HUE_RED, f2, 4), 20), Alignment.Companion.k);
                Painter painterA = PainterResources_androidKt.a(iIntValue, 0, composerImplV);
                function2 = function28;
                z = 0;
                rowScopeInstance = rowScopeInstance2;
                function23 = function26;
                companion = companion4;
                function24 = function27;
                horizontal = horizontal2;
                arrangement$Top$1 = arrangement$Top$12;
                function22 = function25;
                ImageKt.a(painterA, null, modifierB2, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
                composerImpl = composerImplV;
            } else {
                function2 = function28;
                companion = companion4;
                rowScopeInstance = rowScopeInstance2;
                arrangement$Top$1 = arrangement$Top$12;
                horizontal = horizontal2;
                function22 = function25;
                function23 = function26;
                function24 = function27;
                z = 0;
                composerImpl = composerImplV;
            }
            composerImpl.V(z);
            composerImpl.V(z);
            Modifier.Companion companion5 = companion;
            float f3 = 12;
            Modifier modifierF = PaddingKt.f(rowScopeInstance.a(companion5, 1.0f, true), f3);
            BiasAlignment.Horizontal horizontal3 = horizontal;
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal3, composerImpl, z);
            int i6 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImpl.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImpl, modifierF);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function02);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, columnMeasurePolicyA2, function22);
            Updater.b(composerImpl, persistentCompositionLocalMapQ3, function23);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i6))) {
                b.B(i6, composerImpl, i6, function24);
            }
            Function2 function29 = function2;
            Object objF = a.f(composerImpl, modifierD3, function29, 1849434622);
            if (objF == Composer.Companion.f1624a) {
                objF = new au.com.woolworths.feature.shop.recipes.recipes.list.b(27);
                composerImpl.A(objF);
            }
            composerImpl.V(z);
            Modifier modifierB3 = SemanticsModifierKt.b(companion5, true, (Function1) objF);
            ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, horizontal3, composerImpl, z);
            int i7 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImpl.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImpl, modifierB3);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function02);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, columnMeasurePolicyA3, function22);
            Updater.b(composerImpl, persistentCompositionLocalMapQ4, function23);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImpl, i7, function24);
            }
            Updater.b(composerImpl, modifierD4, function29);
            rewardsNotificationBannerData2 = rewardsNotificationBannerData;
            String str = rewardsNotificationBannerData2.c;
            composerImpl.o(718109098);
            if (str == null) {
                f = f3;
                companion2 = companion5;
                i2 = 4;
                composerImpl2 = composerImpl;
            } else {
                i2 = 4;
                Composer composer2 = composerImpl;
                f = f3;
                companion2 = companion5;
                TextKt.b(str, PaddingKt.j(SizeKt.e(companion5, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl).o, composer2, 48, 0, 65532);
                composerImpl2 = composer2;
            }
            composerImpl2.V(z);
            composerImpl2.o(718120789);
            ComposerImpl composerImpl5 = composerImpl2;
            if (rewardsNotificationBannerData2.d.length() > 0) {
                Composer composer3 = composerImpl2;
                TextKt.b(rewardsNotificationBannerData2.d, PaddingKt.j(SizeKt.e(companion2, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i2, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl2).n, composer3, 48, 0, 65532);
                composerImpl5 = composer3;
            }
            composerImpl5.V(z);
            composerImpl5.V(true);
            function0 = onActionButtonClick;
            CoreThemeKt.b(6, composerImpl5, ComposableLambdaKt.c(-200015187, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.banners.RewardsNotificationBannerKt$RewardsNotificationBanner$1$1$2$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer4 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer4.c()) {
                        composer4.j();
                    } else {
                        String str2 = rewardsNotificationBannerData2.f;
                        if (str2 == null) {
                            str2 = "";
                        }
                        ActionTextButtonKt.a(str2, function0, null, 0L, null, false, composer4, 0, 60);
                    }
                    return Unit.f24250a;
                }
            }, composerImpl5));
            composerImpl5.V(true);
            composerImpl5.o(-1479863545);
            if (rewardsNotificationBannerData2.g.equals(Boolean.TRUE)) {
                float f4 = 14;
                companion3 = companion2;
                Modifier modifierQ = SizeKt.q(PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, f4, f4, BitmapDescriptorFactory.HUE_RED, 9), f);
                ComposerImpl composerImpl6 = composerImpl5;
                z2 = z;
                z3 = true;
                IconButtonKt.b(PainterResources_androidKt.a(R.drawable.ic_close, z, composerImpl5), StringResources_androidKt.c(composerImpl5, R.string.dismiss_button), onCloseButtonClick, modifierQ, false, 0L, composerImpl6, ((i3 << 3) & 896) | 3072, 48);
                composerImpl3 = composerImpl6;
            } else {
                z2 = z;
                z3 = true;
                companion3 = companion2;
                composerImpl3 = composerImpl5;
            }
            composerImpl3.V(z2);
            composerImpl3.V(z3);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImpl3, null);
            composerImpl3.V(z3);
            modifier2 = companion3;
            composerImpl4 = composerImpl3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl4.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a((Object) rewardsNotificationBannerData2, (Object) onCloseButtonClick, (Object) function0, modifier2, i, 23);
        }
    }
}
