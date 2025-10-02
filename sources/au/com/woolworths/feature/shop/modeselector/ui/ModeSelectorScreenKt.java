package au.com.woolworths.feature.shop.modeselector.ui;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorContract;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$ViewState;", "viewState", "mode-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ModeSelectorScreenKt {
    public static final void a(final ModeSelectorContract.ViewState viewState, Function0 onRetryClick, Function0 onDoneButtonClick, Function1 onModeClick, Function2 onFulfilmentButtonClicked, Function1 onModeSelectorOptionSelected, Function1 onApiButtonClick, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Modifier.Companion companion;
        Function2 function2;
        Function2 function22;
        Arrangement$Top$1 arrangement$Top$1;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        FullPageMessageSpec fullPageMessageSpecE;
        Intrinsics.h(viewState, "viewState");
        boolean z4 = viewState.f7519a;
        FullPageMessage.Error error = viewState.b;
        Intrinsics.h(onRetryClick, "onRetryClick");
        Intrinsics.h(onDoneButtonClick, "onDoneButtonClick");
        Intrinsics.h(onModeClick, "onModeClick");
        Intrinsics.h(onFulfilmentButtonClicked, "onFulfilmentButtonClicked");
        Intrinsics.h(onModeSelectorOptionSelected, "onModeSelectorOptionSelected");
        Intrinsics.h(onApiButtonClick, "onApiButtonClick");
        ComposerImpl composerImplV = composer.v(328749646);
        int i4 = (composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= composerImplV.I(onRetryClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onDoneButtonClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.I(onModeClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerImplV.I(onFulfilmentButtonClicked) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= composerImplV.I(onModeSelectorOptionSelected) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= composerImplV.I(onApiButtonClick) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 = i4 | 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 8388608 : 4194304);
        }
        int i6 = i3;
        if ((i6 & 4793491) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifier4 = i5 != 0 ? companion2 : modifier2;
            Modifier modifierB = ScrollKt.b(BackgroundKt.b(modifier4, ToneColors.j, RectangleShapeKt.f1779a).x0(SizeKt.c), ScrollKt.a(composerImplV), true);
            Arrangement.Vertical vertical = error == null ? Arrangement.g : Arrangement.e;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(vertical, horizontal, composerImplV, 48);
            int i7 = composerImplV.P;
            Modifier modifier5 = modifier4;
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
            Function2 function23 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function23);
            Function2 function24 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function24);
            Function2 function25 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function25);
            }
            Function2 function26 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function26);
            if (error != null) {
                composerImplV.o(-1063694507);
                if (error instanceof FullPageMessage.Error.ConnectionError) {
                    composerImplV.o(-1004139254);
                    fullPageMessageSpecE = FullPageMessageSpec.Companion.b(null, StringResources_androidKt.c(composerImplV, R.string.more_selector_network_error), onRetryClick, composerImplV, 7);
                    composerImplV.V(false);
                    modifier3 = modifier5;
                    z3 = true;
                } else {
                    if (!(error instanceof FullPageMessage.Error.ServerError)) {
                        throw au.com.woolworths.android.onesite.a.w(-1004142340, composerImplV, false);
                    }
                    composerImplV.o(-1004130299);
                    modifier3 = modifier5;
                    z3 = true;
                    fullPageMessageSpecE = FullPageMessageSpec.Companion.e(null, null, StringResources_androidKt.c(composerImplV, R.string.mode_selector_server_error), null, onRetryClick, composerImplV, 23);
                    composerImplV = composerImplV;
                    composerImplV.V(false);
                }
                FullPageMessageUiKt.a(fullPageMessageSpecE, null, null, composerImplV, 0, 6);
                composerImplV.V(false);
                z2 = z3;
            } else {
                modifier3 = modifier5;
                composerImplV.o(-1062918918);
                float f3 = 16;
                Modifier modifierF = PaddingKt.f(companion2, f3);
                Arrangement$Top$1 arrangement$Top$12 = Arrangement.c;
                ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$12, horizontal, composerImplV, 48);
                int i8 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierF);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, columnMeasurePolicyA2, function23);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function24);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                    androidx.camera.core.impl.b.B(i8, composerImplV, i8, function25);
                }
                Updater.b(composerImplV, modifierD2, function26);
                int i9 = i6 >> 6;
                ModeSelectorButtonsKt.a(viewState.d, onModeClick, composerImplV, i9 & 112);
                DownloadableAsset downloadableAsset = viewState.e;
                composerImplV.o(1649393206);
                if (downloadableAsset != null) {
                    DownloadableAssetUiKt.b(downloadableAsset, SizeKt.g(PaddingKt.h(TestTagKt.a(companion2, "shopping_mode_header_image"), BitmapDescriptorFactory.HUE_RED, f3, 1), 94), false, false, false, null, null, composerImplV, 48, 124);
                }
                composerImplV.V(false);
                ShoppingModeSection.ShoppingModeSelectorAddressInfoSection shoppingModeSelectorAddressInfoSection = viewState.f;
                composerImplV.o(1649405667);
                if (shoppingModeSelectorAddressInfoSection == null) {
                    companion = companion2;
                    function2 = function25;
                    function22 = function24;
                    arrangement$Top$1 = arrangement$Top$12;
                } else {
                    companion = companion2;
                    function2 = function25;
                    function22 = function24;
                    arrangement$Top$1 = arrangement$Top$12;
                    LocationContentKt.a(shoppingModeSelectorAddressInfoSection, onApiButtonClick, PaddingKt.j(SizeKt.e(TestTagKt.a(companion2, "shopping_mode_location"), 1.0f), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composerImplV, ((i6 >> 15) & 112) | KyberEngine.KyberPolyBytes, 0);
                }
                composerImplV.V(false);
                ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData shoppingModeSelectorStoreDetailsSectionData = viewState.h;
                composerImplV.o(1649419818);
                if (shoppingModeSelectorStoreDetailsSectionData == null) {
                    f = f3;
                } else {
                    f = f3;
                    StoreDetailsSectionKt.b(shoppingModeSelectorStoreDetailsSectionData, onApiButtonClick, PaddingKt.j(SizeKt.e(TestTagKt.a(companion, "shopping_mode_store_details"), 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composerImplV, ((i6 >> 15) & 112) | KyberEngine.KyberPolyBytes, 0);
                }
                composerImplV.V(false);
                ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection = viewState.g;
                composerImplV.o(1649434149);
                if (shoppingModeSelectorOptionsSection != null) {
                    ShoppingModeOptionKt.a(shoppingModeSelectorOptionsSection, onModeSelectorOptionSelected, onFulfilmentButtonClicked, PaddingKt.j(SizeKt.e(TestTagKt.a(companion, "shopping_mode_option"), 1.0f), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composerImplV, ((i6 >> 12) & 112) | 3072 | (i9 & 896), 0);
                    composerImplV = composerImplV;
                }
                composerImplV.V(false);
                ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData = viewState.i;
                composerImplV.o(1649450846);
                if (shoppingModeSelectorStoreFeaturesData == null) {
                    f2 = f;
                    z = false;
                } else {
                    f2 = f;
                    z = false;
                    FeaturesSectionKt.b(shoppingModeSelectorStoreFeaturesData, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composerImplV, 48, 0);
                }
                composerImplV.V(z);
                String str = viewState.j;
                composerImplV.o(1649460321);
                if (str != null) {
                    TextKt.b(str, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, new TextAlign(6), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, 48, 0, 65020);
                }
                composerImplV.V(false);
                String str2 = viewState.k;
                composerImplV.o(1649472929);
                if (str2 != null) {
                    TextKt.b(str2, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, new TextAlign(6), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, 48, 0, 65020);
                }
                composerImplV.V(false);
                composerImplV.V(true);
                Modifier.Companion companion3 = companion;
                Modifier modifierJ = PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, 7);
                ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, Alignment.Companion.m, composerImplV, 0);
                int i10 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, columnMeasurePolicyA3, function23);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                    androidx.camera.core.impl.b.B(i10, composerImplV, i10, function2);
                }
                Updater.b(composerImplV, modifierD3, function26);
                composerImplV.o(133107273);
                if (z4) {
                    z2 = true;
                } else {
                    ComposerImpl composerImpl = composerImplV;
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImpl, null);
                    z2 = true;
                    PrimaryButtonKt.a(StringResources_androidKt.c(composerImpl, R.string.mode_selector_done), onDoneButtonClick, SizeKt.e(PaddingKt.g(companion3, f2, 12), 1.0f), false, false, null, null, null, null, composerImpl, ((i6 >> 3) & 112) | KyberEngine.KyberPolyBytes, 1016);
                    composerImplV = composerImpl;
                }
                android.support.v4.media.session.a.C(composerImplV, false, z2, false);
            }
            composerImplV.V(z2);
            if (viewState.c != null) {
                composerImplV.o(1260567690);
                final Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
                ComposerImpl composerImpl2 = composerImplV;
                AndroidAlertDialog_androidKt.a(onRetryClick, ComposableLambdaKt.c(-670710815, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorContent$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            final ModeSelectorContract.ViewState viewState2 = viewState;
                            Function0 function02 = viewState2.c.f;
                            final Context context2 = context;
                            ButtonKt.c(function02, null, false, null, null, null, null, null, ComposableLambdaKt.c(-659593084, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorContent$2.1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    RowScope TextButton = (RowScope) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(TextButton, "$this$TextButton");
                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        String upperCase = viewState2.c.c.getText(context2).toString().toUpperCase(Locale.ROOT);
                                        Intrinsics.g(upperCase, "toUpperCase(...)");
                                        TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 805306368, 510);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), null, ComposableLambdaKt.c(-1640601313, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorContent$3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            ButtonKt.c(viewState.c.e, null, false, null, null, null, null, null, ComposableSingletons$ModeSelectorScreenKt.f7545a, composer2, 805306368, 510);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), ComposableLambdaKt.c(-2125546562, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorContent$4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            TextKt.b(viewState.c.f7518a.getText(context).toString(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), ComposableLambdaKt.c(1684475485, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorContent$5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            TextKt.b(viewState.c.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), null, 0L, 0L, null, composerImpl2, ((i6 >> 3) & 14) | 224304, 964);
                composerImplV = composerImpl2;
                composerImplV.V(false);
            } else if (z4) {
                composerImplV.o(1261347061);
                LoadingScreenKt.a(composerImplV, 0);
                composerImplV.V(false);
            } else {
                composerImplV.o(1261376852);
                composerImplV.V(false);
            }
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(viewState, onRetryClick, onDoneButtonClick, onModeClick, onFulfilmentButtonClicked, onModeSelectorOptionSelected, onApiButtonClick, modifier2, i, i2);
        }
    }

    public static final void b(final ModeSelectorViewModel viewModel, final Function0 onNavigateUp, final Function1 onOpenMaps, Composer composer, int i) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onOpenMaps, "onOpenMaps");
        ComposerImpl composerImplV = composer.v(-429652216);
        if (((i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(onOpenMaps) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.o, composerImplV);
            final ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composerImplV, 3);
            final Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(context);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.b(context, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            final ManagedActivityResultLauncher managedActivityResultLauncherA = ActivityResultRegistryKt.a(startActivityForResult, (Function1) objG, composerImplV, 0);
            au.com.woolworths.design.wx.component.ScaffoldKt.a(SizeKt.c, scaffoldStateD, ComposableLambdaKt.c(-1670389107, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.mode_selector_screen_title);
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        final Function0 function0 = onNavigateUp;
                        TopNavBarKt.b(strC, modifierE, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-1513985762, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.back), function0, null, false, WxTheme.a(composer3).h(), composer3, 0, 24);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 805306416, 0, 1532);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(1458133503, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddingValue = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValue, "paddingValue");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValue) ? 4 : 2;
                    }
                    int i2 = iIntValue & 19;
                    Unit unit = Unit.f24250a;
                    if (i2 == 18 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    Modifier modifierE = PaddingKt.e(Modifier.Companion.d, paddingValue);
                    ModeSelectorContract.ViewState viewState = (ModeSelectorContract.ViewState) mutableStateA.getD();
                    composer2.o(5004770);
                    ModeSelectorViewModel modeSelectorViewModel = viewModel;
                    boolean zI2 = composer2.I(modeSelectorViewModel);
                    Object objG2 = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (zI2 || objG2 == composer$Companion$Empty$1) {
                        ModeSelectorScreenKt$ModeSelectorScreen$2$1$1 modeSelectorScreenKt$ModeSelectorScreen$2$1$1 = new ModeSelectorScreenKt$ModeSelectorScreen$2$1$1(1, modeSelectorViewModel, ModeSelectorViewModel.class, "changeShoppingMode", "changeShoppingMode$mode_selector_release(Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeButtonType;)V", 0);
                        composer2.A(modeSelectorScreenKt$ModeSelectorScreen$2$1$1);
                        objG2 = modeSelectorScreenKt$ModeSelectorScreen$2$1$1;
                    }
                    KFunction kFunction = (KFunction) objG2;
                    composer2.l();
                    composer2.o(5004770);
                    ModeSelectorViewModel modeSelectorViewModel2 = viewModel;
                    boolean zI3 = composer2.I(modeSelectorViewModel2);
                    Object objG3 = composer2.G();
                    if (zI3 || objG3 == composer$Companion$Empty$1) {
                        ModeSelectorScreenKt$ModeSelectorScreen$2$2$1 modeSelectorScreenKt$ModeSelectorScreen$2$2$1 = new ModeSelectorScreenKt$ModeSelectorScreen$2$2$1(2, modeSelectorViewModel2, ModeSelectorViewModel.class, "onFulfilmentButtonClicked", "onFulfilmentButtonClicked$mode_selector_release(Ljava/lang/String;Lau/com/woolworths/base/shopapp/modules/button/Analytics;)V", 0);
                        composer2.A(modeSelectorScreenKt$ModeSelectorScreen$2$2$1);
                        objG3 = modeSelectorScreenKt$ModeSelectorScreen$2$2$1;
                    }
                    KFunction kFunction2 = (KFunction) objG3;
                    composer2.l();
                    composer2.o(5004770);
                    ModeSelectorViewModel modeSelectorViewModel3 = viewModel;
                    boolean zI4 = composer2.I(modeSelectorViewModel3);
                    Object objG4 = composer2.G();
                    if (zI4 || objG4 == composer$Companion$Empty$1) {
                        ModeSelectorScreenKt$ModeSelectorScreen$2$3$1 modeSelectorScreenKt$ModeSelectorScreen$2$3$1 = new ModeSelectorScreenKt$ModeSelectorScreen$2$3$1(1, modeSelectorViewModel3, ModeSelectorViewModel.class, "onModeSelectorOptionSelected", "onModeSelectorOptionSelected$mode_selector_release(Lau/com/woolworths/feature/shop/modeselector/model/Item;)V", 0);
                        composer2.A(modeSelectorScreenKt$ModeSelectorScreen$2$3$1);
                        objG4 = modeSelectorScreenKt$ModeSelectorScreen$2$3$1;
                    }
                    KFunction kFunction3 = (KFunction) objG4;
                    composer2.l();
                    composer2.o(5004770);
                    ModeSelectorViewModel modeSelectorViewModel4 = viewModel;
                    boolean zI5 = composer2.I(modeSelectorViewModel4);
                    Object objG5 = composer2.G();
                    if (zI5 || objG5 == composer$Companion$Empty$1) {
                        ModeSelectorScreenKt$ModeSelectorScreen$2$4$1 modeSelectorScreenKt$ModeSelectorScreen$2$4$1 = new ModeSelectorScreenKt$ModeSelectorScreen$2$4$1(0, modeSelectorViewModel4, ModeSelectorViewModel.class, "fetchData", "fetchData$mode_selector_release()V", 0);
                        composer2.A(modeSelectorScreenKt$ModeSelectorScreen$2$4$1);
                        objG5 = modeSelectorScreenKt$ModeSelectorScreen$2$4$1;
                    }
                    KFunction kFunction4 = (KFunction) objG5;
                    composer2.l();
                    composer2.o(5004770);
                    ModeSelectorViewModel modeSelectorViewModel5 = viewModel;
                    boolean zI6 = composer2.I(modeSelectorViewModel5);
                    Object objG6 = composer2.G();
                    if (zI6 || objG6 == composer$Companion$Empty$1) {
                        ModeSelectorScreenKt$ModeSelectorScreen$2$5$1 modeSelectorScreenKt$ModeSelectorScreen$2$5$1 = new ModeSelectorScreenKt$ModeSelectorScreen$2$5$1(1, modeSelectorViewModel5, ModeSelectorViewModel.class, "onApiButtonClick", "onApiButtonClick$mode_selector_release(Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;)V", 0);
                        composer2.A(modeSelectorScreenKt$ModeSelectorScreen$2$5$1);
                        objG6 = modeSelectorScreenKt$ModeSelectorScreen$2$5$1;
                    }
                    composer2.l();
                    ModeSelectorScreenKt.a(viewState, (Function0) kFunction4, onNavigateUp, (Function1) kFunction, (Function2) kFunction2, (Function1) kFunction3, (Function1) ((KFunction) objG6), modifierE, composer2, 0, 0);
                    composer2.o(-1224400529);
                    boolean zI7 = composer2.I(viewModel) | composer2.I(context) | composer2.n(scaffoldStateD) | composer2.n(onOpenMaps) | composer2.I(managedActivityResultLauncherA);
                    Object objG7 = composer2.G();
                    if (zI7 || objG7 == composer$Companion$Empty$1) {
                        ModeSelectorScreenKt$ModeSelectorScreen$2$6$1 modeSelectorScreenKt$ModeSelectorScreen$2$6$1 = new ModeSelectorScreenKt$ModeSelectorScreen$2$6$1(viewModel, context, scaffoldStateD, onOpenMaps, managedActivityResultLauncherA, null);
                        composer2.A(modeSelectorScreenKt$ModeSelectorScreen$2$6$1);
                        objG7 = modeSelectorScreenKt$ModeSelectorScreen$2$6$1;
                    }
                    composer2.l();
                    EffectsKt.e(composer2, unit, (Function2) objG7);
                    return unit;
                }
            }, composerImplV), composerImplV, 390, 1016);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(viewModel, onNavigateUp, onOpenMaps, i, 1);
        }
    }
}
