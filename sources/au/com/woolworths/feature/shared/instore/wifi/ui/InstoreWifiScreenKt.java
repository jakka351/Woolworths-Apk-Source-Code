package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.dialog.AlertDialog;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.TextColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shared.instore.wifi.markdown.MarkdownLinkColorPlugin;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.ContentRowData;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.RewardsAppSpecificContent;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.ShopAppSpecificContent;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.sdui.legacy.banner.inlinemessage.InlineMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-wifi_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstoreWifiScreenKt {
    public static final void a(InstoreWifiContract.ViewState viewState, String str, Function2 function2, Function2 function22, AppSpecificContent appSpecificContent, Composer composer, int i) {
        Modifier modifierE;
        ComposerImpl composerImplV = composer.v(-2057271822);
        int i2 = i | (composerImplV.n(viewState) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.I(function2) ? 256 : 128) | (composerImplV.n(appSpecificContent) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1353255078);
            if (!viewState.b) {
                InlineMessageUiKt.a(new InlineMessage(InlineErrorType.f, new ResText(R.string.info_wifi_device_not_supported), null), null, composerImplV, 0, 2);
            }
            composerImplV.V(false);
            boolean z = appSpecificContent instanceof RewardsAppSpecificContent;
            Modifier.Companion companion = Modifier.Companion.d;
            if (z) {
                float f = 24;
                modifierE = PaddingKt.j(PaddingKt.j(PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7), BitmapDescriptorFactory.HUE_RED, 48, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            } else {
                modifierE = SizeKt.e(PaddingKt.j(PaddingKt.h(companion, 24, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 18, 7), 1.0f);
            }
            ImageKt.a(PainterResources_androidKt.a(appSpecificContent.a(), 0, composerImplV), null, modifierE, null, ContentScale.Companion.d, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 24624, 104);
            float f2 = 20;
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.instore_wifi_connected_already), PaddingKt.j(PaddingKt.h(companion, f2, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).v, composerImplV, 48, 0, 65532);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.enjoy_free_wifi), PaddingKt.j(PaddingKt.h(companion, f2, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, 7), WxTheme.a(composerImplV).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).j, composerImplV, 48, 0, 65016);
            String strC = StringResources_androidKt.c(composerImplV, appSpecificContent.i());
            boolean z2 = viewState.b;
            boolean zC = Intrinsics.c(viewState.c, Boolean.TRUE);
            composerImplV.o(5004770);
            boolean z3 = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new n(1, function2);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            n(strC, z2, zC, (Function1) objG, appSpecificContent.g(), composerImplV, 0, 0);
            float f3 = 16;
            b(str, function22, appSpecificContent, PaddingKt.i(companion, f3, 28, f3, f3), composerImplV, ((i2 >> 3) & 14) | 48 | ((i2 >> 6) & 896));
            composerImplV = composerImplV;
            String str2 = viewState.f6531a;
            if (str2 != null) {
                p(48, composerImplV, SizeKt.e(PaddingKt.j(companion, f3, BitmapDescriptorFactory.HUE_RED, f3, f3, 2), 1.0f), str2);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new o(viewState, str, function2, function22, appSpecificContent, i, 1);
        }
    }

    public static final void b(String str, Function2 function2, AppSpecificContent appSpecificContent, Modifier modifier, Composer composer, int i) {
        int i2;
        String strB;
        ComposerImpl composerImplV = composer.v(-1066215373);
        if ((i & 48) == 0) {
            i2 = (composerImplV.I(function2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? composerImplV.n(appSpecificContent) : composerImplV.I(appSpecificContent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i2 & 1169) == 1168 && composerImplV.c()) {
            composerImplV.j();
        } else {
            String strD = appSpecificContent.d();
            String strH = appSpecificContent.h();
            String strF = appSpecificContent.f();
            String strC = appSpecificContent.c();
            if (appSpecificContent.k()) {
                composerImplV.o(1956546443);
                strB = StringResources_androidKt.b(appSpecificContent.e(), new Object[]{"com.woolworths.shop://feedbackForm?formid=5952", strD, strH, strF, strC}, composerImplV);
                composerImplV.V(false);
            } else {
                composerImplV.o(1956809726);
                strB = StringResources_androidKt.b(appSpecificContent.j(), new Object[]{strD, strH, strF, strC}, composerImplV);
                composerImplV.V(false);
            }
            MarkdownCompatKt.b(strB, R.layout.links_markdown, modifier, null, function2, CollectionsKt.Q(new MarkdownLinkColorPlugin(ColorKt.j(WxTheme.a(composerImplV).h()))), composerImplV, ((i2 >> 3) & 896) | ((i2 << 12) & 458752), 88);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(str, function2, appSpecificContent, modifier, i, 12);
        }
    }

    public static final void c(int i, String str, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        int i3;
        ComposableLambdaImpl composableLambdaImpl2;
        String str2 = str;
        ComposerImpl composerImplV = composer.v(66056572);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.r(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composableLambdaImpl2 = composableLambdaImpl;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 54);
            int i4 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierK = SizeKt.k(companion, 72);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierK);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            int i6 = i3;
            ImageKt.a(PainterResources_androidKt.a(i, i3 & 14, composerImplV), null, companion, null, ContentScale.Companion.d, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 25008, 104);
            composerImplV.V(true);
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 20, 16, BitmapDescriptorFactory.HUE_RED, 9);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            str2 = str;
            composableLambdaImpl2 = composableLambdaImpl;
            TextKt.b(str2, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, ((i6 >> 3) & 14) | 48, 0, 65532);
            composerImplV = composerImplV;
            composableLambdaImpl2.invoke(composerImplV, Integer.valueOf((i6 >> 6) & 14));
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.a(i, str2, composableLambdaImpl2, i2);
        }
    }

    public static final void d(int i, String str, final Function2 function2, final String str2, Modifier modifier, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-889109540);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.r(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.n(str2) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final List listQ = CollectionsKt.Q(new MarkdownLinkColorPlugin(ColorKt.j(WxTheme.a(composerImplV).h())));
            c(i, str, ComposableLambdaKt.c(-703587572, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt$ContentRowWithMarkdown$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        MarkdownCompatKt.b(str2, R.layout.detail_content_markdown, Modifier.Companion.d, null, function2, listQ, composer2, 0, 88);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i4 & 112) | (i4 & 14) | KyberEngine.KyberPolyBytes);
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.b(i, str, function2, str2, modifier2, i2);
        }
    }

    public static final void e(InstoreWifiContract.ErrorType errorType, Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1234054655);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(errorType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1633490746);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(20, function1, errorType);
                composerImplV.A(objG);
            }
            Function0 function0 = (Function0) objG;
            composerImplV.V(false);
            AlertDialog.f5143a.b(function0, StringResources_androidKt.c(composerImplV, R.string.ok), function0, null, null, StringResources_androidKt.c(composerImplV, R.string.wifi_generic_error), 0L, 0L, composerImplV, 0, 472);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(errorType, i, 15, function1);
        }
    }

    public static final void f(final Function0 function0, final InstoreWifiContract.ViewState viewState, ScaffoldState scaffoldState, final String str, final Function2 function2, MutableState mutableState, Function1 function1, final Function1 function12, final Function1 function13, final Function2 function22, final Function2 function23, final Function2 function24, Function0 function02, Function0 function03, Function1 function14, final Boolean bool, final Function1 function15, final AppSpecificContent appSpecificContent, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        String str2;
        Function2 function25;
        int i6;
        MutableState mutableState2;
        ComposerImpl composerImpl;
        final ScaffoldState scaffoldState2;
        MutableState mutableState3;
        Continuation continuation;
        final Modifier modifier2;
        final InstoreWifiContract.ViewState viewState2 = viewState;
        Function1 function16 = function1;
        Function0 function04 = function02;
        Function0 function05 = function03;
        Function1 function17 = function14;
        ComposerImpl composerImplV = composer.v(604386400);
        if ((i & 6) == 0) {
            i4 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i7 = i4;
        if ((i & 48) == 0) {
            i5 = i7 | (composerImplV.n(viewState2) ? 32 : 16);
        } else {
            i5 = i7;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.n(scaffoldState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i5 |= composerImplV.n(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            function25 = function2;
            i5 |= composerImplV.I(function25) ? 16384 : 8192;
        } else {
            function25 = function2;
        }
        if ((i & 196608) == 0) {
            i5 |= composerImplV.n(mutableState) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= composerImplV.I(function16) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= composerImplV.I(function12) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= composerImplV.I(function13) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= composerImplV.I(function22) ? 536870912 : 268435456;
        }
        int i8 = i5;
        if ((i2 & 6) == 0) {
            i6 = i2 | (composerImplV.I(function23) ? 4 : 2);
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= composerImplV.I(function24) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i6 |= composerImplV.I(function04) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= composerImplV.I(function05) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= composerImplV.I(function17) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i6 |= composerImplV.n(bool) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= composerImplV.I(function15) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= (i2 & 16777216) == 0 ? composerImplV.n(appSpecificContent) : composerImplV.I(appSpecificContent) ? 8388608 : 4194304;
        }
        int i9 = i3 & 262144;
        if (i9 != 0) {
            i6 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i6 |= composerImplV.n(modifier) ? 67108864 : 33554432;
        }
        int i10 = i6;
        if ((i8 & 306783379) == 306783378 && (38347923 & i10) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            scaffoldState2 = scaffoldState;
            mutableState3 = mutableState;
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier modifier3 = i9 != 0 ? Modifier.Companion.d : modifier;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(bool);
                composerImplV.A(objG);
            }
            MutableState mutableState4 = (MutableState) objG;
            composerImplV.V(false);
            Boolean boolValueOf = Boolean.valueOf(viewState2.c == null);
            composerImplV.o(-1746271574);
            int i11 = i8 & 112;
            final Modifier modifier4 = modifier3;
            boolean z = (i11 == 32) | ((i10 & 3670016) == 1048576);
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new InstoreWifiScreenKt$InstoreWifiScreen$11$1(mutableState4, viewState2, function15, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, boolValueOf, (Function2) objG2);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                mutableState2 = mutableState4;
                objG3 = new au.com.woolworths.feature.rewards.account.authentication.ui.c(appSpecificContent, function12, mutableState2, function13, function22, function23, function24);
                composerImplV.A(objG3);
            } else {
                mutableState2 = mutableState4;
            }
            final Function2 function26 = (Function2) objG3;
            composerImplV.V(false);
            final String str3 = str2;
            final Function2 function27 = function25;
            composerImpl = composerImplV;
            final MutableState mutableState5 = mutableState2;
            scaffoldState2 = scaffoldState;
            ScaffoldKt.a(SizeKt.c, scaffoldState2, ComposableLambdaKt.c(-390100699, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt$InstoreWifiScreen$12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.title_instore_wifi);
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        final Function0 function06 = function0;
                        TopNavBarKt.b(strC, modifierE, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(754904054, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt$InstoreWifiScreen$12.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.back), function06, null, false, WxTheme.a(composer3).h(), composer3, 0, 24);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 805306416, 0, 1532);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-276378345, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt$InstoreWifiScreen$13
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierB = ScrollKt.b(modifier4.x0(SizeKt.c), ScrollKt.a(composer2), true);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
                        ComposeUiNode.e3.getClass();
                        Function0 function06 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function06);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function28 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function28);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Boolean bool2 = (Boolean) mutableState5.getD();
                        boolean zC = Intrinsics.c(bool2, Boolean.TRUE);
                        InstoreWifiContract.ViewState viewState3 = viewState;
                        String str4 = str3;
                        Function2 function29 = function27;
                        Function2 function210 = function26;
                        AppSpecificContent appSpecificContent2 = appSpecificContent;
                        if (zC) {
                            composer2.o(1523392288);
                            InstoreWifiScreenKt.a(viewState3, str4, function29, function210, appSpecificContent2, composer2, 3072);
                            composer2.l();
                        } else if (Intrinsics.c(bool2, Boolean.FALSE)) {
                            composer2.o(1523693825);
                            InstoreWifiScreenKt.j(viewState3, str4, function29, function210, appSpecificContent2, composer2, 3072);
                            composer2.l();
                        } else {
                            composer2.o(-643575855);
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImpl), composerImpl, ((i8 >> 3) & 112) | 390, 1016);
            composerImpl.o(994884812);
            if (((Boolean) mutableState.getD()).booleanValue()) {
                Boolean bool2 = Boolean.TRUE;
                composerImpl.o(5004770);
                boolean z2 = (i10 & 7168) == 2048;
                Object objG4 = composerImpl.G();
                if (z2 || objG4 == composer$Companion$Empty$1) {
                    function05 = function03;
                    continuation = null;
                    objG4 = new InstoreWifiScreenKt$InstoreWifiScreen$14$1(function05, null);
                    composerImpl.A(objG4);
                } else {
                    function05 = function03;
                    continuation = null;
                }
                composerImpl.V(false);
                EffectsKt.e(composerImpl, bool2, (Function2) objG4);
                int i12 = ((i8 >> 15) & 14) | ((i10 >> 9) & 112);
                mutableState3 = mutableState;
                function17 = function14;
                i(mutableState3, function17, composerImpl, i12);
            } else {
                mutableState3 = mutableState;
                function05 = function03;
                function17 = function14;
                continuation = null;
            }
            composerImpl.V(false);
            viewState2 = viewState;
            InstoreWifiContract.ErrorType errorType = viewState2.f;
            composerImpl.o(994892149);
            if (errorType == null) {
                function16 = function1;
            } else {
                function16 = function1;
                e(errorType, function16, composerImpl, (i8 >> 15) & 112);
            }
            composerImpl.V(false);
            composerImpl.o(994897017);
            if (viewState2.d) {
                h(composerImpl, 0);
            }
            composerImpl.V(false);
            String str4 = viewState2.e;
            composerImpl.o(-1746271574);
            boolean z3 = (i11 == 32) | ((i8 & 896) == 256) | ((i10 & 896) == 256);
            Object objG5 = composerImpl.G();
            if (z3 || objG5 == composer$Companion$Empty$1) {
                function04 = function02;
                objG5 = new InstoreWifiScreenKt$InstoreWifiScreen$16$1(viewState2, scaffoldState2, function04, continuation);
                composerImpl.A(objG5);
            } else {
                function04 = function02;
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, str4, (Function2) objG5);
            modifier2 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final MutableState mutableState6 = mutableState3;
            final Function1 function18 = function16;
            final Function1 function19 = function17;
            final Function0 function06 = function05;
            final Function0 function07 = function04;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    InstoreWifiScreenKt.f(function0, viewState2, scaffoldState2, str, function2, mutableState6, function18, function12, function13, function22, function23, function24, function07, function06, function19, bool, function15, appSpecificContent, modifier2, (Composer) obj, iA, iA2, i3);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void g(final Function0 onNavigateUp, final Function0 showJoinScreenAction, final Function1 showFeedbackFormAction, final Function1 onErrorDialogDismissed, final Function1 onLoginDialogDismissed, final Function1 onOpenUrl, final InstoreWifiViewModel instoreWifiViewModel, final String baseApiUrl, final Boolean bool, final Function1 onConnectedModeSet, final AppSpecificContent content, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        int i4;
        MutableState mutableState;
        ComposerImpl composerImpl;
        final Modifier modifier2;
        InstoreWifiViewModel viewModel = instoreWifiViewModel;
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(showJoinScreenAction, "showJoinScreenAction");
        Intrinsics.h(showFeedbackFormAction, "showFeedbackFormAction");
        Intrinsics.h(onErrorDialogDismissed, "onErrorDialogDismissed");
        Intrinsics.h(onLoginDialogDismissed, "onLoginDialogDismissed");
        Intrinsics.h(onOpenUrl, "onOpenUrl");
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(baseApiUrl, "baseApiUrl");
        Intrinsics.h(onConnectedModeSet, "onConnectedModeSet");
        Intrinsics.h(content, "content");
        ComposerImpl composerImplV = composer.v(1808981517);
        int i5 = i | (composerImplV.I(onNavigateUp) ? 4 : 2) | (composerImplV.I(showJoinScreenAction) ? 32 : 16) | (composerImplV.I(showFeedbackFormAction) ? 256 : 128) | (composerImplV.I(onErrorDialogDismissed) ? 2048 : 1024) | (composerImplV.I(onLoginDialogDismissed) ? 16384 : 8192) | (composerImplV.I(onOpenUrl) ? 131072 : 65536) | (composerImplV.I(viewModel) ? 1048576 : 524288) | (composerImplV.n(baseApiUrl) ? 8388608 : 4194304) | (composerImplV.n(bool) ? 67108864 : 33554432) | (composerImplV.I(onConnectedModeSet) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? composerImplV.n(content) : composerImplV.I(content) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i6 = i3 | 48;
        if ((i5 & 306783379) == 306783378 && (i6 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            InstoreWifiContract.ViewState viewState = (InstoreWifiContract.ViewState) FlowExtKt.a(viewModel.j, composerImplV).getD();
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            MutableState mutableState2 = (MutableState) objG;
            composerImplV.V(false);
            ScaffoldState scaffoldStateD = androidx.compose.material.ScaffoldKt.d(null, composerImplV, 3);
            Flow flow = viewModel.k;
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(viewModel) | ((i5 & 458752) == 131072) | ((i5 & 896) == 256) | ((i5 & 112) == 32);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$12) {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                i4 = i5;
                objG2 = new InstoreWifiScreenKt$InstoreWifiScreen$1$1(viewModel, mutableState2, onOpenUrl, showFeedbackFormAction, showJoinScreenAction, null);
                mutableState = mutableState2;
                viewModel = viewModel;
                composerImplV.A(objG2);
            } else {
                i4 = i5;
                mutableState = mutableState2;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG2);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(viewModel);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                InstoreWifiScreenKt$InstoreWifiScreen$2$1 instoreWifiScreenKt$InstoreWifiScreen$2$1 = new InstoreWifiScreenKt$InstoreWifiScreen$2$1(2, viewModel, InstoreWifiViewModel.class, "onJoinCheckChanged", "onJoinCheckChanged(ZZ)V", 0);
                composerImplV.A(instoreWifiScreenKt$InstoreWifiScreen$2$1);
                objG3 = instoreWifiScreenKt$InstoreWifiScreen$2$1;
            }
            KFunction kFunction = (KFunction) objG3;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI3 = composerImplV.I(viewModel);
            Object objG4 = composerImplV.G();
            if (zI3 || objG4 == composer$Companion$Empty$1) {
                InstoreWifiScreenKt$InstoreWifiScreen$3$1 instoreWifiScreenKt$InstoreWifiScreen$3$1 = new InstoreWifiScreenKt$InstoreWifiScreen$3$1(1, viewModel, InstoreWifiViewModel.class, "onSendFeedbackClicked", "onSendFeedbackClicked(Z)V", 0);
                composerImplV.A(instoreWifiScreenKt$InstoreWifiScreen$3$1);
                objG4 = instoreWifiScreenKt$InstoreWifiScreen$3$1;
            }
            KFunction kFunction2 = (KFunction) objG4;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI4 = composerImplV.I(viewModel);
            Object objG5 = composerImplV.G();
            if (zI4 || objG5 == composer$Companion$Empty$1) {
                InstoreWifiScreenKt$InstoreWifiScreen$4$1 instoreWifiScreenKt$InstoreWifiScreen$4$1 = new InstoreWifiScreenKt$InstoreWifiScreen$4$1(1, viewModel, InstoreWifiViewModel.class, "onNotificationPreferencesClicked", "onNotificationPreferencesClicked(Z)V", 0);
                composerImplV.A(instoreWifiScreenKt$InstoreWifiScreen$4$1);
                objG5 = instoreWifiScreenKt$InstoreWifiScreen$4$1;
            }
            KFunction kFunction3 = (KFunction) objG5;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI5 = composerImplV.I(viewModel);
            Object objG6 = composerImplV.G();
            if (zI5 || objG6 == composer$Companion$Empty$1) {
                InstoreWifiScreenKt$InstoreWifiScreen$5$1 instoreWifiScreenKt$InstoreWifiScreen$5$1 = new InstoreWifiScreenKt$InstoreWifiScreen$5$1(2, viewModel, InstoreWifiViewModel.class, "onTermsClicked", "onTermsClicked$instore_wifi_release(ZLjava/lang/String;)V", 0);
                composerImplV.A(instoreWifiScreenKt$InstoreWifiScreen$5$1);
                objG6 = instoreWifiScreenKt$InstoreWifiScreen$5$1;
            }
            KFunction kFunction4 = (KFunction) objG6;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI6 = composerImplV.I(viewModel);
            Object objG7 = composerImplV.G();
            if (zI6 || objG7 == composer$Companion$Empty$1) {
                InstoreWifiScreenKt$InstoreWifiScreen$6$1 instoreWifiScreenKt$InstoreWifiScreen$6$1 = new InstoreWifiScreenKt$InstoreWifiScreen$6$1(2, viewModel, InstoreWifiViewModel.class, "onPrivacyPolicyClicked", "onPrivacyPolicyClicked$instore_wifi_release(ZLjava/lang/String;)V", 0);
                composerImplV.A(instoreWifiScreenKt$InstoreWifiScreen$6$1);
                objG7 = instoreWifiScreenKt$InstoreWifiScreen$6$1;
            }
            KFunction kFunction5 = (KFunction) objG7;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI7 = composerImplV.I(viewModel);
            Object objG8 = composerImplV.G();
            if (zI7 || objG8 == composer$Companion$Empty$1) {
                InstoreWifiScreenKt$InstoreWifiScreen$7$1 instoreWifiScreenKt$InstoreWifiScreen$7$1 = new InstoreWifiScreenKt$InstoreWifiScreen$7$1(2, viewModel, InstoreWifiViewModel.class, "onCollectionNoticeClicked", "onCollectionNoticeClicked$instore_wifi_release(ZLjava/lang/String;)V", 0);
                composerImplV.A(instoreWifiScreenKt$InstoreWifiScreen$7$1);
                objG8 = instoreWifiScreenKt$InstoreWifiScreen$7$1;
            }
            KFunction kFunction6 = (KFunction) objG8;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI8 = composerImplV.I(viewModel);
            Object objG9 = composerImplV.G();
            if (zI8 || objG9 == composer$Companion$Empty$1) {
                InstoreWifiScreenKt$InstoreWifiScreen$8$1 instoreWifiScreenKt$InstoreWifiScreen$8$1 = new InstoreWifiScreenKt$InstoreWifiScreen$8$1(0, viewModel, InstoreWifiViewModel.class, "onSnackBarMessageShown", "onSnackBarMessageShown()V", 0);
                composerImplV.A(instoreWifiScreenKt$InstoreWifiScreen$8$1);
                objG9 = instoreWifiScreenKt$InstoreWifiScreen$8$1;
            }
            KFunction kFunction7 = (KFunction) objG9;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI9 = composerImplV.I(viewModel);
            Object objG10 = composerImplV.G();
            if (zI9 || objG10 == composer$Companion$Empty$1) {
                objG10 = new InstoreWifiScreenKt$InstoreWifiScreen$9$1(0, viewModel, InstoreWifiViewModel.class, "onLoginDialogShown", "onLoginDialogShown()V", 0);
                composerImplV.A(objG10);
            }
            composerImplV.V(false);
            int i7 = i4 >> 9;
            int i8 = i6 << 21;
            int i9 = (i4 & 57344) | (i7 & 458752) | (3670016 & i7) | (29360128 & i8) | (i8 & 234881024);
            Modifier.Companion companion = Modifier.Companion.d;
            composerImpl = composerImplV;
            f(onNavigateUp, viewState, scaffoldStateD, baseApiUrl, (Function2) kFunction, mutableState, onErrorDialogDismissed, (Function1) kFunction2, (Function1) kFunction3, (Function2) kFunction4, (Function2) kFunction5, (Function2) kFunction6, (Function0) kFunction7, (Function0) ((KFunction) objG10), onLoginDialogDismissed, bool, onConnectedModeSet, content, companion, composerImpl, (i4 & 14) | 196608 | ((i4 >> 12) & 7168) | ((i4 << 9) & 3670016), i9, 0);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(showJoinScreenAction, showFeedbackFormAction, onErrorDialogDismissed, onLoginDialogDismissed, onOpenUrl, instoreWifiViewModel, baseApiUrl, bool, onConnectedModeSet, content, modifier2, i, i2) { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.p
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ InstoreWifiViewModel j;
                public final /* synthetic */ String k;
                public final /* synthetic */ Boolean l;
                public final /* synthetic */ Function1 m;
                public final /* synthetic */ AppSpecificContent n;
                public final /* synthetic */ Modifier o;
                public final /* synthetic */ int p;

                {
                    this.p = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    int iA2 = RecomposeScopeImplKt.a(this.p);
                    InstoreWifiScreenKt.g(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void h(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(57486620);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new Color(Color.b(Color.b, 0.4f));
                composerImplV.A(objG);
            }
            long j = ((Color) objG).f1766a;
            composerImplV.V(false);
            SurfaceKt.a(fillElement, null, j, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$InstoreWifiScreenKt.b, composerImplV, 1573254, 58);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(i, 4);
        }
    }

    public static final void i(final MutableState mutableState, Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1841416435);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(mutableState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(5004770);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new Function0() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState.setValue(Boolean.FALSE);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            Function0 function0 = (Function0) objG;
            composerImplV.V(false);
            String strC = StringResources_androidKt.c(composerImplV, R.string.continue_text);
            composerImplV.o(-1633490746);
            int i4 = i2 & 112;
            boolean z2 = (i3 == 4) | (i4 == 32);
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.design.core.ui.component.experimental.topbar.e(1, mutableState, function1);
                composerImplV.A(objG2);
            }
            Function0 function02 = (Function0) objG2;
            composerImplV.V(false);
            String strC2 = StringResources_androidKt.c(composerImplV, R.string.cancel);
            composerImplV.o(-1633490746);
            boolean z3 = (i3 == 4) | (i4 == 32);
            Object objG3 = composerImplV.G();
            if (z3 || objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.design.core.ui.component.experimental.topbar.e(2, mutableState, function1);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            AlertDialog.f5143a.a(function0, strC, function02, strC2, (Function0) objG3, null, null, StringResources_androidKt.c(composerImplV, R.string.instore_wifi_login_alert_message), null, 0L, 0L, composerImpl, 0, 8032);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new m(mutableState, function1, i, 0);
        }
    }

    public static final void j(InstoreWifiContract.ViewState viewState, String str, Function2 function2, Function2 function22, AppSpecificContent appSpecificContent, Composer composer, int i) {
        Modifier.Companion companion;
        Function2 function23;
        ComposerImpl composerImplV = composer.v(-1690953159);
        int i2 = i | (composerImplV.n(viewState) ? 4 : 2) | (composerImplV.I(function2) ? 256 : 128) | (composerImplV.n(appSpecificContent) ? 16384 : 8192);
        if ((i2 & 9347) == 9346 && composerImplV.c()) {
            composerImplV.j();
            function23 = function22;
        } else {
            composerImplV.o(-1508337343);
            if (!viewState.b) {
                InlineMessageUiKt.a(new InlineMessage(InlineErrorType.f, new ResText(R.string.info_wifi_device_not_supported), null), null, composerImplV, 0, 2);
            }
            composerImplV.V(false);
            appSpecificContent.getClass();
            String strC = StringResources_androidKt.c(composerImplV, R.string.instore_wifi_connect);
            TextStyle textStyle = WxTheme.b(composerImplV).v;
            float f = 16;
            Modifier.Companion companion2 = Modifier.Companion.d;
            TextKt.b(strC, PaddingKt.j(PaddingKt.j(PaddingKt.h(companion2, f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 20, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, 48, 0, 65532);
            composerImplV = composerImplV;
            String strC2 = StringResources_androidKt.c(composerImplV, appSpecificContent.i());
            boolean z = viewState.b;
            boolean zC = Intrinsics.c(viewState.c, Boolean.TRUE);
            composerImplV.o(5004770);
            boolean z2 = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new n(0, function2);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            n(strC2, z, zC, (Function1) objG, false, composerImplV, 0, 16);
            composerImplV.o(-1508310658);
            for (final ContentRowData contentRowData : appSpecificContent.b()) {
                boolean z3 = contentRowData.d;
                int i3 = contentRowData.b;
                if (z3) {
                    composerImplV.o(2006743288);
                    int i4 = contentRowData.f6541a;
                    String strC3 = StringResources_androidKt.c(composerImplV, i3);
                    int i5 = contentRowData.c;
                    String[] strArr = (String[]) contentRowData.e.toArray(new String[0]);
                    d(i4, strC3, function22, StringResources_androidKt.b(i5, Arrays.copyOf(strArr, strArr.length), composerImplV), null, composerImplV, KyberEngine.KyberPolyBytes);
                    composerImplV.V(false);
                } else {
                    composerImplV.o(2007100439);
                    c(contentRowData.f6541a, StringResources_androidKt.c(composerImplV, i3), ComposableLambdaKt.c(-1078824433, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt$NotYetConnected$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                InstoreWifiScreenKt.o(contentRowData.c, 0, 2, composer2, null);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV), composerImplV, KyberEngine.KyberPolyBytes);
                    composerImplV.V(false);
                }
            }
            composerImplV.V(false);
            if (appSpecificContent instanceof ShopAppSpecificContent) {
                composerImplV.o(487677569);
                companion = companion2;
                ShopAppSpecificContent shopAppSpecificContent = (ShopAppSpecificContent) appSpecificContent;
                function23 = function22;
                m(function23, shopAppSpecificContent.h(), shopAppSpecificContent.c(), PaddingKt.i(companion, f, 28, f, f), composerImplV, 54);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else {
                companion = companion2;
                if (appSpecificContent instanceof RewardsAppSpecificContent) {
                    composerImplV.o(488321470);
                    function23 = function22;
                    k(6, composerImplV, ((RewardsAppSpecificContent) appSpecificContent).c(), function23);
                    composerImplV.V(false);
                } else {
                    function23 = function22;
                    composerImplV.o(488645513);
                    composerImplV.V(false);
                }
            }
            String str2 = viewState.f6531a;
            if (str2 != null) {
                p(48, composerImplV, SizeKt.e(PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, f, f, 2), 1.0f), str2);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new o(viewState, str, function2, function23, appSpecificContent, i, 0);
        }
    }

    public static final void k(int i, Composer composer, String str, Function2 function2) {
        int i2;
        ComposerImpl composerImplV = composer.v(1862663440);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n("https://www.everyday.com.au/terms/app.html?utm_source=edr-app&utm_medium=referral&utm_term=terms-of-use") ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n("https://www.woolworthsgroup.com.au/au/en/privacy.html") ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(companion, f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
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
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            o(R.string.rewards_disconnect_at_any_time_text, 48, 0, composerImplV, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13));
            int i4 = i2;
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.rewards_quick_links_title_text), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, f, 5), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, 0, 0, 65532);
            composerImplV = composerImplV;
            composerImplV.o(659645180);
            Iterator it = CollectionsKt.R(StringResources_androidKt.b(R.string.rewards_instore_wifi_link_markdown, new Object[]{StringResources_androidKt.c(composerImplV, R.string.rewards_instore_wifi_terms_and_conditions_link_text), "https://www.everyday.com.au/terms/app.html?utm_source=edr-app&utm_medium=referral&utm_term=terms-of-use"}, composerImplV), StringResources_androidKt.b(R.string.rewards_instore_wifi_link_markdown, new Object[]{StringResources_androidKt.c(composerImplV, R.string.rewards_instore_wifi_privacy_policy_link_text), "https://www.woolworthsgroup.com.au/au/en/privacy.html"}, composerImplV), StringResources_androidKt.b(R.string.rewards_instore_wifi_link_markdown, new Object[]{StringResources_androidKt.c(composerImplV, R.string.rewards_instore_wifi_collection_notice_link_text), str}, composerImplV)).iterator();
            while (it.hasNext()) {
                l((String) it.next(), null, function2, composerImplV, (i4 << 6) & 896, 2);
                SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new j(function2, str, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(java.lang.String r20, androidx.compose.ui.Modifier r21, kotlin.jvm.functions.Function2 r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt.l(java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void m(Function2 function2, String str, String str2, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1652451812);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n("com.woolworths.shop://feedbackForm?formid=5952") ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n("https://www.woolworthsgroup.com.au/privacy-policy") ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MarkdownCompatKt.b(StringResources_androidKt.b(R.string.instore_wifi_links_not_yet_joined, new Object[]{"com.woolworths.shop://feedbackForm?formid=5952", str, "https://www.woolworthsgroup.com.au/privacy-policy", str2}, composerImplV), R.layout.links_markdown, modifier, null, function2, CollectionsKt.Q(new MarkdownLinkColorPlugin(ColorKt.j(WxTheme.a(composerImplV).h()))), composerImplV, ((i2 >> 9) & 896) | ((i2 << 15) & 458752), 88);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(function2, str, str2, modifier, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(java.lang.String r31, boolean r32, boolean r33, kotlin.jvm.functions.Function1 r34, boolean r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt.n(java.lang.String, boolean, boolean, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void o(int r25, int r26, int r27, androidx.compose.runtime.Composer r28, androidx.compose.ui.Modifier r29) {
        /*
            r1 = r25
            r0 = -87484332(0xfffffffffac91854, float:-5.2207255E35)
            r2 = r28
            androidx.compose.runtime.ComposerImpl r0 = r2.v(r0)
            boolean r2 = r0.r(r1)
            if (r2 == 0) goto L13
            r2 = 4
            goto L14
        L13:
            r2 = 2
        L14:
            r2 = r26 | r2
            r3 = r27 & 2
            if (r3 == 0) goto L1f
            r2 = r2 | 48
        L1c:
            r4 = r29
            goto L31
        L1f:
            r4 = r26 & 48
            if (r4 != 0) goto L1c
            r4 = r29
            boolean r5 = r0.n(r4)
            if (r5 == 0) goto L2e
            r5 = 32
            goto L30
        L2e:
            r5 = 16
        L30:
            r2 = r2 | r5
        L31:
            r5 = r2 & 19
            r6 = 18
            if (r5 != r6) goto L45
            boolean r5 = r0.c()
            if (r5 != 0) goto L3e
            goto L45
        L3e:
            r0.j()
            r21 = r0
            r2 = r4
            goto L81
        L45:
            if (r3 == 0) goto L4b
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion.d
        L49:
            r4 = r2
            goto L4d
        L4b:
            r3 = r4
            goto L49
        L4d:
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.c(r0, r1)
            au.com.woolworths.design.wx.foundation.ColorScheme r5 = au.com.woolworths.design.wx.foundation.WxTheme.a(r0)
            long r5 = r5.f()
            au.com.woolworths.design.wx.foundation.WxTypography r7 = au.com.woolworths.design.wx.foundation.WxTheme.b(r0)
            androidx.compose.ui.text.TextStyle r7 = r7.n
            r22 = r4 & 112(0x70, float:1.57E-43)
            r23 = 0
            r24 = 65528(0xfff8, float:9.1824E-41)
            r4 = r5
            r20 = r7
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = r0
            androidx.compose.material.TextKt.b(r2, r3, r4, r6, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r3
        L81:
            androidx.compose.runtime.RecomposeScopeImpl r6 = r21.X()
            if (r6 == 0) goto L93
            au.com.woolworths.feature.shared.instore.wifi.ui.k r0 = new au.com.woolworths.feature.shared.instore.wifi.ui.k
            r5 = 0
            r3 = r26
            r4 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt.o(int, int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier):void");
    }

    public static final void p(int i, Composer composer, Modifier modifier, String str) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(787355306);
        if ((((composerImplV.n(str) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            TextKt.b(StringResources_androidKt.b(R.string.title_wifi_lib_version, new Object[]{str}, composerImplV), modifier, TextColors.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImpl, 48, 0, 65528);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str, modifier, i, 7);
        }
    }
}
