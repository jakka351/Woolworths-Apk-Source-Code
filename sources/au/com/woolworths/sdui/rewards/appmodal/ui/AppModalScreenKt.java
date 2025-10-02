package au.com.woolworths.sdui.rewards.appmodal.ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.work.impl.utils.b;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter;
import au.com.woolworths.rewards.base.info.FeatureInfoHeading;
import au.com.woolworths.rewards.base.info.FeatureInfoItem;
import au.com.woolworths.rewards.base.info.FeatureInfoTextItem;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"rewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppModalScreenKt {
    public static final void a(final RewardsAppModalData rewardsAppModal, final Function0 onDismiss, final Function1 displayNotificationsPermissionsDialog, final Function1 trackOnButtonClicked, Composer composer, int i) {
        Intrinsics.h(rewardsAppModal, "rewardsAppModal");
        Intrinsics.h(onDismiss, "onDismiss");
        Intrinsics.h(displayNotificationsPermissionsDialog, "displayNotificationsPermissionsDialog");
        Intrinsics.h(trackOnButtonClicked, "trackOnButtonClicked");
        ComposerImpl composerImplV = composer.v(-1528677812);
        int i2 = (composerImplV.I(rewardsAppModal) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onDismiss) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(displayNotificationsPermissionsDialog) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(trackOnButtonClicked) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(null, ComposableLambdaKt.c(-1654200304, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.rewards.appmodal.ui.AppModalScreenKt$AppModalScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final Function1 function1 = displayNotificationsPermissionsDialog;
                        final Function0 function0 = onDismiss;
                        final RewardsAppModalData rewardsAppModalData = rewardsAppModal;
                        final Function1 function12 = trackOnButtonClicked;
                        TopNavBarKt.a("", null, 0L, 0L, 0L, null, coreElevation, null, ComposableLambdaKt.c(1306361977, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.rewards.appmodal.ui.AppModalScreenKt$AppModalScreen$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVector = CoreTheme.e(composer3).f4879a.G;
                                    composer3.o(-1224400529);
                                    Function1 function13 = function12;
                                    boolean zN = composer3.n(function13);
                                    RewardsAppModalData rewardsAppModalData2 = rewardsAppModalData;
                                    boolean zI = zN | composer3.I(rewardsAppModalData2);
                                    Function1 function14 = function1;
                                    boolean zN2 = zI | composer3.n(function14);
                                    Function0 function02 = function0;
                                    boolean zN3 = zN2 | composer3.n(function02);
                                    Object objG = composer3.G();
                                    if (zN3 || objG == Composer.Companion.f1624a) {
                                        b bVar = new b(function13, rewardsAppModalData2, function14, function02, 10);
                                        composer3.A(bVar);
                                        objG = bVar;
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVector, "Close", (Function0) objG, null, false, null, CoreTheme.b(composer3).e.c.d, composer3, 48, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306374, 382);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(1204492057, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.rewards.appmodal.ui.AppModalScreenKt$AppModalScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function2;
                    RewardsAppModalData rewardsAppModalData;
                    Composer composer2;
                    Function2 function22;
                    Function2 function23;
                    BiasAlignment.Horizontal horizontal;
                    Modifier.Companion companion;
                    float f;
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer3.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer3.c()) {
                        composer3.j();
                    } else {
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierE = PaddingKt.e(companion2, paddingValues);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier modifierD = ComposedModifierKt.d(composer3, modifierE);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function0);
                        } else {
                            composer3.e();
                        }
                        Function2 function24 = ComposeUiNode.Companion.g;
                        Updater.b(composer3, measurePolicyD, function24);
                        Function2 function25 = ComposeUiNode.Companion.f;
                        Updater.b(composer3, persistentCompositionLocalMapD, function25);
                        Function2 function26 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function26);
                        }
                        Function2 function27 = ComposeUiNode.Companion.d;
                        Updater.b(composer3, modifierD, function27);
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal2, composer3, 0);
                        int p2 = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer3, companion2);
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function0);
                        } else {
                            composer3.e();
                        }
                        Updater.b(composer3, columnMeasurePolicyA, function24);
                        Updater.b(composer3, persistentCompositionLocalMapD2, function25);
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer3, p2, function26);
                        }
                        Updater.b(composer3, modifierD2, function27);
                        Modifier modifierB = ScrollKt.b(ColumnScopeInstance.f948a.a(companion2, 1.0f, true), ScrollKt.a(composer3), true);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal2, composer3, 0);
                        int p3 = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer3.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer3, modifierB);
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function0);
                        } else {
                            composer3.e();
                        }
                        Updater.b(composer3, columnMeasurePolicyA2, function24);
                        Updater.b(composer3, persistentCompositionLocalMapD3, function25);
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p3))) {
                            androidx.camera.core.impl.b.z(p3, composer3, p3, function26);
                        }
                        Updater.b(composer3, modifierD3, function27);
                        RewardsAppModalData rewardsAppModalData2 = rewardsAppModal;
                        DownloadableAsset downloadableAsset = rewardsAppModalData2.d;
                        composer3.o(605556431);
                        if (downloadableAsset == null) {
                            function22 = function25;
                            function2 = function27;
                            rewardsAppModalData = rewardsAppModalData2;
                            composer2 = composer3;
                            function23 = function26;
                            horizontal = horizontal2;
                        } else {
                            function2 = function27;
                            rewardsAppModalData = rewardsAppModalData2;
                            composer2 = composer3;
                            function22 = function25;
                            function23 = function26;
                            horizontal = horizontal2;
                            SingletonAsyncImageKt.a(downloadableAsset.getAssetUrl(), downloadableAsset.getAltText(), PaddingKt.j(SizeKt.e(companion2, 1.0f), BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, 24, 5), null, ContentScale.Companion.b, composer2, 1572864, 1976);
                        }
                        composer2.l();
                        float f2 = 16;
                        Modifier modifierH = PaddingKt.h(companion2, f2, BitmapDescriptorFactory.HUE_RED, 2);
                        ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p4 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer2.d();
                        Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierH);
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
                        Updater.b(composer2, columnMeasurePolicyA3, function24);
                        Updater.b(composer2, persistentCompositionLocalMapD4, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p4))) {
                            androidx.camera.core.impl.b.z(p4, composer2, p4, function23);
                        }
                        Updater.b(composer2, modifierD4, function2);
                        RewardsAppModalData rewardsAppModalData3 = rewardsAppModalData;
                        Composer composer4 = composer2;
                        float f3 = f2;
                        int i3 = 0;
                        TextKt.a(rewardsAppModalData3.e, CoreTheme.f(composer2).d.c.b, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), CoreTheme.b(composer2).e.d.d, null, 5, 0, false, 0, null, composer4, KyberEngine.KyberPolyBytes, 976);
                        float f4 = 24;
                        Modifier.Companion companion3 = companion2;
                        TextKt.a(rewardsAppModalData3.getSummary(), CoreTheme.f(composer4).f5120a.b.f5123a, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, 7), CoreTheme.b(composer4).e.d.b, null, 5, 0, false, 0, null, composer4, KyberEngine.KyberPolyBytes, 976);
                        composer4.o(-1862851636);
                        for (FeatureInfoItem featureInfoItem : rewardsAppModalData3.getInfoItems()) {
                            if (featureInfoItem instanceof FeatureInfoBulletItem) {
                                composer4.o(110425451);
                                AppModalBulletItemUiKt.a((FeatureInfoBulletItem) featureInfoItem, composer4, i3);
                                composer4.l();
                            } else if (featureInfoItem instanceof FeatureInfoTextItem) {
                                composer4.o(-871694737);
                                composer4.l();
                            } else {
                                if (!(featureInfoItem instanceof FeatureInfoHeading)) {
                                    throw a.x(composer4, 110423716);
                                }
                                composer4.o(-871622569);
                                Modifier.Companion companion4 = companion3;
                                float f5 = f3;
                                companion = companion4;
                                f = f5;
                                TextKt.a(((FeatureInfoHeading) featureInfoItem).getContent(), CoreTheme.f(composer4).e.f5133a.b, PaddingKt.j(companion4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, 7), CoreTheme.b(composer4).e.d.d, null, 5, 0, false, 0, null, composer4, KyberEngine.KyberPolyBytes, 976);
                                composer4.l();
                                f3 = f;
                                companion3 = companion;
                                i3 = 0;
                            }
                            f = f3;
                            companion = companion3;
                            f3 = f;
                            companion3 = companion;
                            i3 = 0;
                        }
                        float f6 = f3;
                        Modifier.Companion companion5 = companion3;
                        composer4.l();
                        composer4.f();
                        composer4.f();
                        composer4.o(666063687);
                        if (!rewardsAppModalData3.getInfoItems().isEmpty()) {
                            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.b(composer4).e.b.f4852a, composer4, PaddingKt.h(companion5, f6, BitmapDescriptorFactory.HUE_RED, 2));
                        }
                        composer4.l();
                        FeatureInfoFooter featureInfoFooter = rewardsAppModalData3.g;
                        ContentCta primaryCta = featureInfoFooter != null ? featureInfoFooter.getPrimaryCta() : null;
                        composer4.o(666075195);
                        if (primaryCta != null) {
                            String label = primaryCta.getLabel();
                            composer4.o(-1224400529);
                            Function1 function1 = trackOnButtonClicked;
                            boolean zN = composer4.n(function1) | composer4.I(primaryCta);
                            Function1 function12 = displayNotificationsPermissionsDialog;
                            boolean zN2 = zN | composer4.n(function12);
                            Function0 function02 = onDismiss;
                            boolean zN3 = zN2 | composer4.n(function02);
                            Object objG = composer4.G();
                            if (zN3 || objG == Composer.Companion.f1624a) {
                                b bVar = new b(function1, primaryCta, function12, function02, 11);
                                composer4.A(bVar);
                                objG = bVar;
                            }
                            composer4.l();
                            PrimaryButtonKt.a(label, (Function0) objG, SizeKt.e(PaddingKt.g(companion5, f6, f4), 1.0f), false, null, null, null, null, composer4, KyberEngine.KyberPolyBytes, 248);
                        }
                        composer4.l();
                        composer4.f();
                        composer4.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582960, 125);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(rewardsAppModal, onDismiss, displayNotificationsPermissionsDialog, trackOnButtonClicked, i, 7);
        }
    }
}
