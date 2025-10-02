package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
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
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.design.core.ui.component.experimental.chip.AssistChipKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevationTokens;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleSortOptions;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.BundlesHeader;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerStateKt;
import au.com.woolworths.foundation.ui.toolbar.flexibletopbar.FlexibleTopBarColors;
import au.com.woolworths.foundation.ui.toolbar.flexibletopbar.FlexibleTopBarKt;
import au.com.woolworths.sdui.shop.alert.StandardAlertKt;
import au.com.woolworths.sdui.shop.alert.model.BasicInsetAlertModel;
import au.com.woolworths.sdui.shop.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showBannerDivider", "bundles_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesPageKt {
    public static final void a(final Map map, final BundlesProductCardConfig bundlesProductCardConfig, final BundlesData bundlesData, final Function1 eventSink, final LazyPagingItems paginatedData, Modifier modifier, Composer composer, int i) {
        LazyListState lazyListState;
        Intrinsics.h(eventSink, "eventSink");
        Intrinsics.h(paginatedData, "paginatedData");
        ComposerImpl composerImplV = composer.v(-178339171);
        int i2 = i | (composerImplV.I(map) ? 4 : 2) | (composerImplV.n(bundlesProductCardConfig) ? 32 : 16) | (composerImplV.n(bundlesData) ? 256 : 128) | (composerImplV.I(eventSink) ? 2048 : 1024) | (composerImplV.I(paginatedData) ? 16384 : 8192) | (composerImplV.n(modifier) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.TRUE);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            int i3 = i2 & 896;
            int i4 = i2 & 7168;
            boolean z = (i3 == 256) | (i4 == 2048);
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new m(2, bundlesData, eventSink);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            final ListItemsTrackerState listItemsTrackerStateA = ListItemsTrackerStateKt.a(lazyListStateA, (Function1) objG2, composerImplV, 0);
            ListItemsSeenEffectKt.b(listItemsTrackerStateA, composerImplV, 0);
            composerImplV.o(-1633490746);
            int i5 = 57344 & i2;
            boolean z2 = (i4 == 2048) | (i5 == 16384 || composerImplV.I(paginatedData));
            Object objG3 = composerImplV.G();
            if (z2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new BundlesPageKt$BundlesPage$1$1(paginatedData, eventSink, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, paginatedData, (Function2) objG3);
            composerImplV.o(-1224400529);
            boolean zN = (i5 == 16384 || composerImplV.I(paginatedData)) | (i4 == 2048) | (i3 == 256) | composerImplV.n(listItemsTrackerStateA) | composerImplV.n(lazyListStateA) | ((i2 & 112) == 32) | composerImplV.I(map);
            Object objG4 = composerImplV.G();
            if (zN || objG4 == composer$Companion$Empty$1) {
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.shop.bundles.ui.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final LazyPagingItems lazyPagingItems = paginatedData;
                        int iB = lazyPagingItems.b();
                        au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l lVar = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l(lazyPagingItems, 12);
                        final LazyListState lazyListState2 = lazyListStateA;
                        final MutableState mutableState2 = mutableState;
                        final BundlesData bundlesData2 = bundlesData;
                        final BundlesProductCardConfig bundlesProductCardConfig2 = bundlesProductCardConfig;
                        final ListItemsTrackerState listItemsTrackerState = listItemsTrackerStateA;
                        final Map map2 = map;
                        final Function1 function12 = eventSink;
                        LazyListScope.g(LazyColumn, iB, lVar, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesPageKt$BundlesPage$2$1$2
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i6;
                                LazyItemScope items = (LazyItemScope) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                Intrinsics.h(items, "$this$items");
                                if ((iIntValue2 & 6) == 0) {
                                    i6 = (composer2.n(items) ? 4 : 2) | iIntValue2;
                                } else {
                                    i6 = iIntValue2;
                                }
                                if ((iIntValue2 & 48) == 0) {
                                    i6 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if ((i6 & 147) == 146 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    Object objA = lazyPagingItems.a(iIntValue);
                                    boolean z3 = objA instanceof BasicCoreBroadcastBannerModel;
                                    Object obj6 = Composer.Companion.f1624a;
                                    Function1 function13 = function12;
                                    if (z3) {
                                        composer2.o(-1259731731);
                                        BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = (BasicCoreBroadcastBannerModel) objA;
                                        float f = 16;
                                        Modifier modifierJ = PaddingKt.j(items.a(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5)), f, BitmapDescriptorFactory.HUE_RED, f, 12, 2);
                                        composer2.o(5004770);
                                        boolean zN2 = composer2.n(function13);
                                        Object objG5 = composer2.G();
                                        if (zN2 || objG5 == obj6) {
                                            objG5 = new au.com.woolworths.design.wx.component.searchbar.a(15, function13);
                                            composer2.A(objG5);
                                        }
                                        Function1 function14 = (Function1) objG5;
                                        Object objE = au.com.woolworths.android.onesite.a.e(composer2, 5004770);
                                        MutableState mutableState3 = mutableState2;
                                        if (objE == obj6) {
                                            objE = new au.com.woolworths.feature.rewards.offers.listpage.ui.e(mutableState3, 1);
                                            composer2.A(objE);
                                        }
                                        Function0 function0 = (Function0) objE;
                                        boolean zC = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.C(5004770, composer2, function13);
                                        Object objG6 = composer2.G();
                                        if (zC || objG6 == obj6) {
                                            objG6 = new au.com.woolworths.design.wx.component.searchbar.a(16, function13);
                                            composer2.A(objG6);
                                        }
                                        composer2.l();
                                        BroadcastBannerKt.a(basicCoreBroadcastBannerModel, function14, modifierJ, null, function0, (Function1) objG6, composer2, 24584, 8);
                                        if (((Boolean) mutableState3.getD()).booleanValue()) {
                                            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composer2).e.b.e, composer2, null);
                                            composer2 = composer2;
                                        }
                                        composer2.l();
                                    } else if (objA instanceof BasicInsetAlertModel) {
                                        composer2.o(-1258284837);
                                        BasicInsetAlertModel basicInsetAlertModel = (BasicInsetAlertModel) objA;
                                        composer2.o(5004770);
                                        boolean zN3 = composer2.n(function13);
                                        Object objG7 = composer2.G();
                                        if (zN3 || objG7 == obj6) {
                                            objG7 = new au.com.woolworths.design.wx.component.searchbar.a(17, function13);
                                            composer2.A(objG7);
                                        }
                                        Function1 function15 = (Function1) objG7;
                                        composer2.l();
                                        float f2 = 16;
                                        Modifier modifierJ2 = PaddingKt.j(Modifier.Companion.d, f2, BitmapDescriptorFactory.HUE_RED, f2, 12, 2);
                                        composer2.o(5004770);
                                        boolean zN4 = composer2.n(function13);
                                        Object objG8 = composer2.G();
                                        if (zN4 || objG8 == obj6) {
                                            objG8 = new au.com.woolworths.design.wx.component.searchbar.a(18, function13);
                                            composer2.A(objG8);
                                        }
                                        composer2.l();
                                        StandardAlertKt.a(basicInsetAlertModel, function15, modifierJ2, (Function1) objG8, composer2, 392, 0);
                                        composer2.l();
                                    } else if (objA instanceof Bundle) {
                                        composer2.o(-1257368849);
                                        BundlesData bundlesData3 = bundlesData2;
                                        BundleUIKt.a((Bundle) objA, iIntValue, listItemsTrackerState, bundlesData3 instanceof BundlesData.BundlesLandingPage ? (BundlesData.BundlesLandingPage) bundlesData3 : null, lazyListState2, bundlesProductCardConfig2, function12, map2, composer2, i6 & 112);
                                        composer2.l();
                                    } else {
                                        composer2.o(-1256843709);
                                        composer2.l();
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, 429584191), 4);
                        if (bundlesData2 instanceof BundlesData.BundlesLandingErrorPage) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesPageKt$BundlesPage$2$1$3
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        Modifier.Companion companion = Modifier.Companion.d;
                                        Modifier modifierJ = PaddingKt.j(PaddingKt.h(companion, 56, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 154, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composer2, 54);
                                        int p = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierJ);
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
                                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                                        Object obj5 = bundlesData2;
                                        BundlesData.BundlesLandingErrorPage bundlesLandingErrorPage = (BundlesData.BundlesLandingErrorPage) obj5;
                                        SingletonAsyncImageKt.a(bundlesLandingErrorPage.f6762a, null, modifierE, null, ContentScale.Companion.d, composer2, 1573296, 1976);
                                        String str = bundlesLandingErrorPage.b;
                                        if (str == null) {
                                            str = "";
                                        }
                                        float f = 12;
                                        TextKt.a(str, CoreTheme.f(composer2).e.f5133a.b, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, null, 3, 0, false, 0, null, composer2, KyberEngine.KyberPolyBytes, 984);
                                        String str2 = bundlesLandingErrorPage.c;
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        TextKt.a(str2, CoreTheme.f(composer2).f5120a.c.f5124a, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, null, 3, 0, false, 0, null, composer2, KyberEngine.KyberPolyBytes, 984);
                                        LinkData linkData = bundlesLandingErrorPage.d;
                                        composer2.o(-248920949);
                                        if (linkData != null) {
                                            TextWithAltData textWithAltData = linkData.c;
                                            Modifier modifierJ2 = PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                            String upperCase = textWithAltData.f10170a.toUpperCase(Locale.ROOT);
                                            Intrinsics.g(upperCase, "toUpperCase(...)");
                                            String str3 = textWithAltData.b;
                                            composer2.o(-1633490746);
                                            Function1 function13 = function12;
                                            boolean zN2 = composer2.n(function13) | composer2.I(obj5);
                                            Object objG5 = composer2.G();
                                            if (zN2 || objG5 == Composer.Companion.f1624a) {
                                                objG5 = new d(2, obj5, function13);
                                                composer2.A(objG5);
                                            }
                                            composer2.l();
                                            PrimaryButtonKt.a(upperCase, (Function0) objG5, modifierJ2, false, str3, null, null, null, composer2, KyberEngine.KyberPolyBytes, 232);
                                        }
                                        composer2.l();
                                        composer2.f();
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 463924720), 3);
                        }
                        LoadState loadState = lazyPagingItems.d().c;
                        if (loadState instanceof LoadState.Loading) {
                            LazyListScope.i(LazyColumn, null, null, ComposableSingletons$BundlesPageKt.f6776a, 3);
                        } else if (loadState instanceof LoadState.Error) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesPageKt$BundlesPage$2$1$4
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        Modifier modifierG = PaddingKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 16, 24);
                                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
                                        int p = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierG);
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
                                        TextKt.a(StringResources_androidKt.c(composer2, R.string.bundles_pagination_error), CoreTheme.f(composer2).f5120a.b.f5123a, null, 0L, null, 0, 0, false, 0, null, composer2, 0, 1020);
                                        String strC = StringResources_androidKt.c(composer2, R.string.try_again);
                                        composer2.o(5004770);
                                        Function1 function13 = function12;
                                        boolean zN2 = composer2.n(function13);
                                        Object objG5 = composer2.G();
                                        if (zN2 || objG5 == Composer.Companion.f1624a) {
                                            objG5 = new au.com.woolworths.feature.product.list.v2.ui.f(7, function13);
                                            composer2.A(objG5);
                                        }
                                        composer2.l();
                                        TextButtonKt.a((Function0) objG5, strC, null, false, null, null, null, null, composer2, 0, 508);
                                        composer2.f();
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -870116464), 3);
                        } else if (!(loadState instanceof LoadState.NotLoading)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f24250a;
                    }
                };
                lazyListState = lazyListStateA;
                composerImplV.A(function1);
                objG4 = function1;
            } else {
                lazyListState = lazyListStateA;
            }
            composerImplV.V(false);
            LazyDslKt.b(modifier, lazyListState, null, false, null, null, null, false, null, (Function1) objG4, composerImplV, (i2 >> 15) & 14, 508);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.c(map, bundlesProductCardConfig, bundlesData, eventSink, paginatedData, modifier, i, 5);
        }
    }

    public static final void b(final BundlesData bundlesData, final Map map, final BundlesProductCardConfig bundlesProductCardConfig, final Function1 eventSink, Function1 shadowVisibilityChange, final LazyPagingItems paginatedData, Composer composer, int i) {
        Intrinsics.h(eventSink, "eventSink");
        Intrinsics.h(shadowVisibilityChange, "shadowVisibilityChange");
        Intrinsics.h(paginatedData, "paginatedData");
        ComposerImpl composerImplV = composer.v(-785423079);
        if (((i | (composerImplV.n(bundlesData) ? 4 : 2) | (composerImplV.I(map) ? 32 : 16) | (composerImplV.n(bundlesProductCardConfig) ? 256 : 128) | (composerImplV.I(eventSink) ? 2048 : 1024) | (composerImplV.I(paginatedData) ? 131072 : 65536)) & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final TopAppBarScrollBehavior topAppBarScrollBehaviorA = TopAppBarDefaults.a(composerImplV);
            Float fValueOf = Float.valueOf(topAppBarScrollBehaviorA.getF1443a().a());
            composerImplV.o(-1633490746);
            boolean zN = composerImplV.n(topAppBarScrollBehaviorA);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new BundlesPageKt$BundlesPageUi$1$1(topAppBarScrollBehaviorA, shadowVisibilityChange, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, fValueOf, (Function2) objG);
            ScaffoldKt.a(BackgroundKt.b(NestedScrollModifierKt.a(Modifier.Companion.d, topAppBarScrollBehaviorA.a(), null), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a), ComposableLambdaKt.c(557688797, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesPageKt$BundlesPageUi$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        CoreElevationTokens coreElevationTokensC = CoreTheme.c(composer2);
                        final TopAppBarScrollBehavior topAppBarScrollBehavior = topAppBarScrollBehaviorA;
                        CoreElevation coreElevation = topAppBarScrollBehavior.getF1443a().a() == BitmapDescriptorFactory.HUE_RED ? coreElevationTokensC.f4876a : coreElevationTokensC.c;
                        final BundlesData bundlesData2 = bundlesData;
                        final Function1 function1 = eventSink;
                        final LazyPagingItems lazyPagingItems = paginatedData;
                        SurfaceKt.b(null, null, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(710808345, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesPageKt$BundlesPageUi$2.2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    long j = CoreTheme.b(composer3).e.f4848a.c;
                                    composer3.o(-1878377300);
                                    if ((2 & 1) != 0) {
                                        j = MaterialTheme.a(composer3).f1413a;
                                    }
                                    ColorScheme applyTonalElevation = MaterialTheme.a(composer3);
                                    float f = 4;
                                    Intrinsics.h(applyTonalElevation, "$this$applyTonalElevation");
                                    long jG = applyTonalElevation.p;
                                    if (!Color.c(j, jG)) {
                                        jG = j;
                                    } else if (!Dp.a(f, 0)) {
                                        jG = ColorKt.g(Color.b(applyTonalElevation.t, ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), jG);
                                    }
                                    FlexibleTopBarColors flexibleTopBarColors = new FlexibleTopBarColors(j, jG);
                                    composer3.l();
                                    final BundlesData bundlesData3 = bundlesData2;
                                    final Function1 function12 = function1;
                                    final LazyPagingItems lazyPagingItems2 = lazyPagingItems;
                                    FlexibleTopBarKt.a(null, flexibleTopBarColors, topAppBarScrollBehavior, ComposableLambdaKt.c(-1359316992, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesPageKt.BundlesPageUi.2.2.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Modifier.Companion companion;
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else if (lazyPagingItems2.b() > 1) {
                                                BundlesData bundlesData4 = bundlesData3;
                                                if (bundlesData4 instanceof BundlesData.BundlesLandingPage) {
                                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer4, 0);
                                                    int p = composer4.getP();
                                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer4.d();
                                                    Modifier.Companion companion2 = Modifier.Companion.d;
                                                    Modifier modifierD = ComposedModifierKt.d(composer4, companion2);
                                                    ComposeUiNode.e3.getClass();
                                                    Function0 function0 = ComposeUiNode.Companion.b;
                                                    if (composer4.w() == null) {
                                                        ComposablesKt.b();
                                                        throw null;
                                                    }
                                                    composer4.i();
                                                    if (composer4.getO()) {
                                                        composer4.K(function0);
                                                    } else {
                                                        composer4.e();
                                                    }
                                                    Updater.b(composer4, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                                    Updater.b(composer4, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                                    Function2 function2 = ComposeUiNode.Companion.j;
                                                    if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                                        androidx.camera.core.impl.b.z(p, composer4, p, function2);
                                                    }
                                                    Updater.b(composer4, modifierD, ComposeUiNode.Companion.d);
                                                    BundlesHeader bundlesHeader = ((BundlesData.BundlesLandingPage) bundlesData4).f6763a;
                                                    BundleSortOptions bundleSortOptions = bundlesHeader.c;
                                                    composer4.o(-1021779491);
                                                    if (bundleSortOptions == null) {
                                                        companion = companion2;
                                                    } else {
                                                        Modifier modifierJ = PaddingKt.j(companion2, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                                                        companion = companion2;
                                                        ImageVector imageVector = CoreTheme.e(composer4).f4879a.A;
                                                        composer4.o(5004770);
                                                        Function1 function13 = function12;
                                                        boolean zN2 = composer4.n(function13);
                                                        Object objG2 = composer4.G();
                                                        if (zN2 || objG2 == Composer.Companion.f1624a) {
                                                            objG2 = new au.com.woolworths.feature.product.list.v2.ui.f(8, function13);
                                                            composer4.A(objG2);
                                                        }
                                                        composer4.l();
                                                        AssistChipKt.a("Sort", imageVector, (Function0) objG2, modifierJ, null, composer4, 3078, 48);
                                                    }
                                                    composer4.l();
                                                    TextKt.a(bundlesHeader.b, CoreTheme.f(composer4).f5120a.c.f5124a, PaddingKt.j(SizeKt.e(companion, 1.0f), 16, 8, BitmapDescriptorFactory.HUE_RED, 10, 4), 0L, null, 0, 0, false, 0, null, composer4, KyberEngine.KyberPolyBytes, 1016);
                                                    composer4.f();
                                                }
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 3072);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 31);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-545064410, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesPageKt$BundlesPageUi$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues innerPadding = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(innerPadding, "innerPadding");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(innerPadding) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        BundlesPageKt.a(map, bundlesProductCardConfig, bundlesData, eventSink, paginatedData, PaddingKt.e(Modifier.Companion.d, innerPadding), composer2, 32768);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582960, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.c(bundlesData, map, bundlesProductCardConfig, eventSink, shadowVisibilityChange, paginatedData, i, 6);
        }
    }
}
