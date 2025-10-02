package au.com.woolworths.foundation.rewards.common.ui.info.banner;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerData;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsInfoBannerUiKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ContentAlignment.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContentAlignment contentAlignment = ContentAlignment.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(RewardsInfoBannerData.IconSpecs iconSpecs, Composer composer, int i) {
        Modifier.Companion companion;
        ComposerImpl composerImplV = composer.v(-670989424);
        if ((((composerImplV.n(iconSpecs) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = iconSpecs.f8594a;
            float f2 = iconSpecs.b;
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierR = SizeKt.r(companion2, f, f2);
            if (iconSpecs instanceof RewardsInfoBannerData.LocalIconSpecs) {
                composerImplV.o(-667893804);
                ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_rewards_booster, 0, composerImplV), null, modifierR, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
                composerImplV.V(false);
                companion = companion2;
            } else {
                if (!(iconSpecs instanceof RewardsInfoBannerData.RemoteIconSpecs)) {
                    throw a.w(-575735992, composerImplV, false);
                }
                composerImplV.o(-667645959);
                composerImplV.o(-575723704);
                Painter painterA = ((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue() ? PainterResources_androidKt.a(R.drawable.product_icon_placeholder, 0, composerImplV) : null;
                composerImplV.V(false);
                companion = companion2;
                SingletonAsyncImageKt.b("", null, modifierR, null, painterA, null, null, null, null, null, null, null, composerImplV, 48, 0, 32744);
                composerImplV.V(false);
            }
            SpacerKt.a(composerImplV, SizeKt.q(companion, 8));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 16, iconSpecs);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerData r17, androidx.compose.foundation.layout.PaddingValuesImpl r18, au.com.woolworths.foundation.rewards.common.ui.info.banner.ContentAlignment r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerUiKt.b(au.com.woolworths.foundation.rewards.common.ui.info.banner.RewardsInfoBannerData, androidx.compose.foundation.layout.PaddingValuesImpl, au.com.woolworths.foundation.rewards.common.ui.info.banner.ContentAlignment, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(String str, RewardsInfoBannerData.MessageData messageData, Modifier modifier, Composer composer, int i) {
        Function2 function2;
        Function0 function0;
        Function2 function22;
        Modifier.Companion companion;
        Function2 function23;
        Function2 function24;
        int i2;
        Modifier.Companion companion2;
        RewardsInfoBannerData.MessageData messageData2;
        boolean z;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1183610486);
        if (((i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(messageData) ? 32 : 16) | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            messageData2 = messageData;
        } else {
            Modifier.Companion companion3 = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion3, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            composerImplV.o(1194339395);
            if (str == null) {
                companion = companion3;
                i2 = 4;
                function23 = function26;
                function24 = function28;
                function2 = function27;
                function0 = function02;
                function22 = function25;
            } else {
                function2 = function27;
                function0 = function02;
                function22 = function25;
                companion = companion3;
                function23 = function26;
                function24 = function28;
                TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, 0, 0, 65534);
                composerImplV = composerImplV;
                i2 = 4;
                au.com.woolworths.compose.utils.layout.SpacerKt.c(ColumnScopeInstance.f948a, 4, composerImplV, 54);
            }
            composerImplV.V(false);
            composerImplV.o(1194346037);
            if (messageData == null) {
                messageData2 = messageData;
                companion2 = companion;
                z = true;
            } else {
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
                int i4 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier.Companion companion4 = companion;
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion4);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, function22);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                    b.B(i4, composerImplV, i4, function2);
                }
                Updater.b(composerImplV, modifierD2, function24);
                companion2 = companion4;
                ComposerImpl composerImpl = composerImplV;
                messageData2 = messageData;
                TextKt.b("This is the content to display This is the content to display This is the content to display This is the content to display ", RowScopeInstance.f974a.a(companion4, 1.0f, false), WxTheme.a(composerImplV).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImpl, 0, 0, 65016);
                composerImplV = composerImpl;
                Integer num = messageData2.f8595a;
                composerImplV.o(2032767820);
                if (num != null) {
                    IconKt.a(PainterResources_androidKt.a(num.intValue(), 0, composerImplV), null, PaddingKt.j(companion2, i2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), WxTheme.a(composerImplV).h(), composerImplV, 432, 0);
                }
                composerImplV.V(false);
                z = true;
                composerImplV.V(true);
            }
            composerImplV.V(false);
            composerImplV.V(z);
            modifier2 = companion2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(str, messageData2, modifier2, i, 11);
        }
    }
}
