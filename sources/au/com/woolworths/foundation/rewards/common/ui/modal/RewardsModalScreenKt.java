package au.com.woolworths.foundation.rewards.common.ui.modal;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.e;
import au.com.woolworths.feature.rewards.offers.detail.composable.c;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.foundation.rewards.common.ui.info.FeatureInfoBulletItemUiKt;
import au.com.woolworths.foundation.rewards.common.ui.info.FeatureInfoTextItemUiKt;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter;
import au.com.woolworths.rewards.base.info.FeatureInfoHeading;
import au.com.woolworths.rewards.base.info.FeatureInfoItem;
import au.com.woolworths.rewards.base.info.FeatureInfoTextItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsModalScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RewardsModalStyle.values().length];
            try {
                RewardsModalStyle[] rewardsModalStyleArr = RewardsModalStyle.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RewardsModalStyle[] rewardsModalStyleArr2 = RewardsModalStyle.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RewardsModalStyle[] rewardsModalStyleArr3 = RewardsModalStyle.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(FeatureInfoFooter data, float f, Modifier modifier, Function1 function1, Function1 function12, Composer composer, int i) {
        ComposerImpl composerImpl;
        boolean z;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        ComposerImpl composerImplV = composer.v(-110252292);
        int i2 = i | (composerImplV.I(data) ? 4 : 2) | 3072 | (composerImplV.I(function1) ? 16384 : 8192) | (composerImplV.I(function12) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-2063440988);
            SpacerKt.a(composerImplV, BackgroundKt.b(SizeKt.e(SizeKt.g(companion, 1), 1.0f), ToneColors.j, RectangleShapeKt.f1779a));
            SpacerKt.a(composerImplV, SizeKt.g(companion, 16));
            composerImplV.V(false);
            String label = data.getPrimaryCta().getLabel();
            float f2 = 16;
            Modifier modifierE2 = SizeKt.e(PaddingKt.h(companion, f2, BitmapDescriptorFactory.HUE_RED, 2), 1.0f);
            composerImplV.o(-1633490746);
            boolean z2 = ((i2 & 14) == 4 || composerImplV.I(data)) | ((i2 & 57344) == 16384);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z2 || objG == composer$Companion$Empty$1) {
                objG = new f(22, function1, data);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            PrimaryButtonKt.a(label, (Function0) objG, modifierE2, false, false, null, null, null, null, composerImpl, KyberEngine.KyberPolyBytes, 1016);
            ContentCta secondaryCta = data.getSecondaryCta();
            composerImpl.o(-2063423065);
            if (secondaryCta == null) {
                z = false;
            } else {
                String label2 = secondaryCta.getLabel();
                Modifier modifierH = PaddingKt.h(PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), f2, BitmapDescriptorFactory.HUE_RED, 2);
                composerImpl.o(-1633490746);
                boolean zI = ((i2 & 458752) == 131072) | composerImpl.I(secondaryCta);
                Object objG2 = composerImpl.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new e(function12, secondaryCta, 3);
                    composerImpl.A(objG2);
                }
                z = false;
                composerImpl.V(false);
                SecondaryButtonKt.b(label2, (Function0) objG2, modifierH, false, false, null, null, composerImpl, 0, 120);
                composerImpl = composerImpl;
            }
            composerImpl.V(z);
            SpacerKt.a(composerImpl, SizeKt.g(companion, f2));
            composerImpl.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(data, f, modifier2, function1, function12, i);
        }
    }

    public static final void b(RewardsModalScreenData rewardsModalScreenData, Modifier modifier, List list, Composer composer, int i) {
        List list2;
        Modifier modifier2;
        Modifier modifier3;
        ColumnScopeInstance columnScopeInstance;
        ComposerImpl composerImplV = composer.v(-592119558);
        if (((i | (composerImplV.I(rewardsModalScreenData) ? 4 : 2) | 432) & 147) != 146 || !composerImplV.c()) {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 24;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            String str = rewardsModalScreenData.e;
            TextStyle textStyle = WxTheme.b(composerImplV).i;
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f948a;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
            Modifier modifier4 = modifierJ;
            TextKt.b(str, columnScopeInstance2.b(modifierJ, horizontal), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, textStyle, composerImplV, 0, 0, 65020);
            ColumnScopeInstance columnScopeInstance3 = columnScopeInstance2;
            TextKt.b(rewardsModalScreenData.f, columnScopeInstance2.b(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), horizontal), WxTheme.a(composerImplV).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65016);
            composerImplV = composerImplV;
            composerImplV.o(-1016858120);
            Iterator it = rewardsModalScreenData.g.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                EmptyList emptyList = EmptyList.d;
                if (!zHasNext) {
                    composerImplV.V(false);
                    SpacerKt.a(composerImplV, SizeKt.g(companion, f));
                    composerImplV.V(true);
                    list2 = emptyList;
                    modifier2 = companion;
                    break;
                }
                FeatureInfoItem featureInfoItem = (FeatureInfoItem) it.next();
                if (featureInfoItem instanceof FeatureInfoBulletItem) {
                    composerImplV.o(524952643);
                    modifier3 = modifier4;
                    FeatureInfoBulletItemUiKt.a((FeatureInfoBulletItem) featureInfoItem, modifier3, emptyList, composerImplV, 432, 0);
                    composerImplV.V(false);
                    columnScopeInstance = columnScopeInstance3;
                } else {
                    modifier3 = modifier4;
                    if (featureInfoItem instanceof FeatureInfoTextItem) {
                        composerImplV.o(524959804);
                        columnScopeInstance = columnScopeInstance3;
                        FeatureInfoTextItemUiKt.a(0, composerImplV, columnScopeInstance.b(modifier3, horizontal), ((FeatureInfoTextItem) featureInfoItem).getMarkdownContent());
                        composerImplV.V(false);
                    } else {
                        columnScopeInstance = columnScopeInstance3;
                        if (!(featureInfoItem instanceof FeatureInfoHeading)) {
                            throw a.w(524951152, composerImplV, false);
                        }
                        composerImplV.o(-905876496);
                        composerImplV.V(false);
                    }
                }
                modifier4 = modifier3;
                columnScopeInstance3 = columnScopeInstance;
            }
        } else {
            composerImplV.j();
            modifier2 = modifier;
            list2 = list;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(rewardsModalScreenData, modifier2, list2, i, 12);
        }
    }
}
