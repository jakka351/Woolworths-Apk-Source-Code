package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shared.instore.wifi.markdown.MarkdownLinkColorPlugin;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiContract;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "accepted", "instore-wifi_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class JoinInStoreWifiScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AppIdentifier.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AppIdentifier appIdentifier = AppIdentifier.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(int i, Composer composer, Function2 function2) {
        ComposerImpl composerImplV = composer.v(318739255);
        int i2 = (composerImplV.I(function2) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            c(composerImplV, 0);
            d(R.string.rewards_join_screen_content_tracking_title, 0, composerImplV);
            int i3 = (i2 << 3) & 112;
            b(i3, composerImplV, StringResources_androidKt.c(composerImplV, R.string.rewards_join_screen_content_tracking_text), function2);
            d(R.string.rewards_join_screen_content_auto_connection_title, 0, composerImplV);
            b(i3, composerImplV, StringResources_androidKt.c(composerImplV, R.string.rewards_join_screen_content_auto_connection_text), function2);
            d(R.string.rewards_join_screen_content_liability_exclusion_title, 0, composerImplV);
            b(i3, composerImplV, StringResources_androidKt.c(composerImplV, R.string.rewards_join_screen_content_liability_exclusion_text), function2);
            SpacerKt.a(composerImplV, SizeKt.g(Modifier.Companion.d, 16));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new q(i, function2);
        }
    }

    public static final void b(int i, Composer composer, String str, Function2 function2) {
        int i2;
        String str2;
        Function2 function22;
        ComposerImpl composerImplV = composer.v(1851029133);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            str2 = str;
            function22 = function2;
        } else {
            str2 = str;
            function22 = function2;
            MarkdownCompatKt.b(str2, R.layout.detail_content_markdown, PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2), null, function22, CollectionsKt.Q(new MarkdownLinkColorPlugin(ColorKt.j(WxTheme.a(composerImplV).h()))), composerImplV, (i2 & 14) | KyberEngine.KyberPolyBytes | ((i2 << 12) & 458752), 88);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new j(str2, function22, i);
        }
    }

    public static final void c(Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1254857387);
        if ((((composerImplV.r(R.string.rewards_join_screen_content_important_terms_and_conditions_subtitle) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            float f = 16;
            composerImpl = composerImplV;
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.rewards_join_screen_content_important_terms_and_conditions_subtitle), PaddingKt.i(Modifier.Companion.d, f, f, f, 4), WxTheme.a(composerImplV).c(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImpl, 0, 0, 65528);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(i, 7);
        }
    }

    public static final void d(int i, int i2, Composer composer) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1747324993);
        if ((((composerImplV.r(i) ? 4 : 2) | i2) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            float f = 16;
            composerImpl = composerImplV;
            TextKt.b(StringResources_androidKt.c(composerImplV, i), PaddingKt.i(Modifier.Companion.d, f, f, f, 4), WxTheme.a(composerImplV).c(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImpl, 0, 0, 65528);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new r(i, i2, 0);
        }
    }

    public static final void e(int i, Composer composer, String str, Function2 function2) {
        ComposerImpl composerImplV = composer.v(914098529);
        int i2 = (composerImplV.I(function2) ? 4 : 2) | i | (composerImplV.n(str) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
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
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.rewards_join_screen_title), null, WxTheme.a(composerImplV).c(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).f, composerImplV, 0, 0, 65530);
            composerImplV = composerImplV;
            MarkdownCompatKt.b(StringResources_androidKt.b(R.string.rewards_join_screen_subtitle, new Object[]{str}, composerImplV), R.layout.detail_content_markdown, PaddingKt.g(companion, 2, 8), null, function2, CollectionsKt.Q(new MarkdownLinkColorPlugin(ColorKt.j(WxTheme.a(composerImplV).h()))), composerImplV, (i2 << 15) & 458752, 88);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(function2, i, 29, str);
        }
    }

    public static final void f(AppIdentifier appIdentifier, JoinWifiViewModel viewModel, JoinWifiActionHandler joinWifiActionHandler, Modifier modifier, Composer composer, int i) {
        Object joinInStoreWifiScreenKt$JoinInStoreWifiScreen$2$1;
        JoinWifiViewModel joinWifiViewModel;
        JoinWifiViewModel joinWifiViewModel2;
        Modifier modifier2;
        Object joinInStoreWifiScreenKt$JoinInStoreWifiScreen$6$1;
        JoinWifiViewModel joinWifiViewModel3;
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(1200610554);
        int i2 = i | (composerImplV.r(appIdentifier.ordinal()) ? 4 : 2) | (composerImplV.I(viewModel) ? 32 : 16) | (composerImplV.n(joinWifiActionHandler) ? 256 : 128) | 3072;
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            joinWifiViewModel2 = viewModel;
            modifier2 = modifier;
        } else {
            JoinWifiContract.ViewState viewState = (JoinWifiContract.ViewState) FlowExtKt.a(viewModel.k, composerImplV).getD();
            Flow flow = viewModel.l;
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(viewModel);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$1$1(viewModel, joinWifiActionHandler, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
            int iOrdinal = appIdentifier.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(-1097722416);
                boolean z = viewState.f6538a;
                composerImplV.o(5004770);
                boolean zI2 = composerImplV.I(viewModel);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    joinWifiViewModel = viewModel;
                    joinInStoreWifiScreenKt$JoinInStoreWifiScreen$2$1 = new JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$2$1(0, joinWifiViewModel, JoinWifiViewModel.class, "onCloseClicked", "onCloseClicked()V", 0);
                    composerImplV.A(joinInStoreWifiScreenKt$JoinInStoreWifiScreen$2$1);
                } else {
                    joinWifiViewModel = viewModel;
                    joinInStoreWifiScreenKt$JoinInStoreWifiScreen$2$1 = objG2;
                }
                KFunction kFunction = (KFunction) joinInStoreWifiScreenKt$JoinInStoreWifiScreen$2$1;
                composerImplV.V(false);
                boolean z2 = viewState.b;
                composerImplV.o(5004770);
                boolean zI3 = composerImplV.I(joinWifiViewModel);
                Object objG3 = composerImplV.G();
                if (zI3 || objG3 == composer$Companion$Empty$1) {
                    JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$3$1 joinInStoreWifiScreenKt$JoinInStoreWifiScreen$3$1 = new JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$3$1(1, joinWifiViewModel, JoinWifiViewModel.class, "onAcceptTermsChanged", "onAcceptTermsChanged(Z)V", 0);
                    composerImplV.A(joinInStoreWifiScreenKt$JoinInStoreWifiScreen$3$1);
                    objG3 = joinInStoreWifiScreenKt$JoinInStoreWifiScreen$3$1;
                }
                KFunction kFunction2 = (KFunction) objG3;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean zI4 = composerImplV.I(joinWifiViewModel);
                Object objG4 = composerImplV.G();
                if (zI4 || objG4 == composer$Companion$Empty$1) {
                    JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$4$1 joinInStoreWifiScreenKt$JoinInStoreWifiScreen$4$1 = new JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$4$1(0, joinWifiViewModel, JoinWifiViewModel.class, "onContinue", "onContinue()V", 0);
                    joinWifiViewModel2 = joinWifiViewModel;
                    composerImplV.A(joinInStoreWifiScreenKt$JoinInStoreWifiScreen$4$1);
                    objG4 = joinInStoreWifiScreenKt$JoinInStoreWifiScreen$4$1;
                } else {
                    joinWifiViewModel2 = joinWifiViewModel;
                }
                KFunction kFunction3 = (KFunction) objG4;
                composerImplV.V(false);
                String strP6 = joinWifiViewModel2.p6(appIdentifier);
                int iOrdinal2 = appIdentifier.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                k((Function0) kFunction, z2, (Function1) kFunction2, (Function0) kFunction3, strP6, joinWifiViewModel2.q6(appIdentifier), null, z, composerImplV, 12582912);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw au.com.woolworths.android.onesite.a.w(-1559431847, composerImplV, false);
                }
                composerImplV.o(-1097024513);
                boolean z3 = viewState.f6538a;
                composerImplV.o(5004770);
                boolean zI5 = composerImplV.I(viewModel);
                Object objG5 = composerImplV.G();
                if (zI5 || objG5 == composer$Companion$Empty$1) {
                    JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$5$1 joinInStoreWifiScreenKt$JoinInStoreWifiScreen$5$1 = new JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$5$1(0, viewModel, JoinWifiViewModel.class, "onCloseClicked", "onCloseClicked()V", 0);
                    composerImplV.A(joinInStoreWifiScreenKt$JoinInStoreWifiScreen$5$1);
                    objG5 = joinInStoreWifiScreenKt$JoinInStoreWifiScreen$5$1;
                }
                KFunction kFunction4 = (KFunction) objG5;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean zI6 = composerImplV.I(viewModel);
                Object objG6 = composerImplV.G();
                if (zI6 || objG6 == composer$Companion$Empty$1) {
                    joinInStoreWifiScreenKt$JoinInStoreWifiScreen$6$1 = new JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$6$1(0, viewModel, JoinWifiViewModel.class, "onContinue", "onContinue()V", 0);
                    joinWifiViewModel3 = viewModel;
                    composerImplV.A(joinInStoreWifiScreenKt$JoinInStoreWifiScreen$6$1);
                } else {
                    joinInStoreWifiScreenKt$JoinInStoreWifiScreen$6$1 = objG6;
                    joinWifiViewModel3 = viewModel;
                }
                KFunction kFunction5 = (KFunction) joinInStoreWifiScreenKt$JoinInStoreWifiScreen$6$1;
                composerImplV.V(false);
                String strP62 = joinWifiViewModel3.p6(appIdentifier);
                int iOrdinal3 = appIdentifier.ordinal();
                if (iOrdinal3 != 0 && iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                String strQ6 = joinWifiViewModel3.q6(appIdentifier);
                Function0 function0 = (Function0) kFunction4;
                Function0 function02 = (Function0) kFunction5;
                composerImplV.o(5004770);
                boolean zI7 = composerImplV.I(joinWifiViewModel3);
                Object objG7 = composerImplV.G();
                if (zI7 || objG7 == composer$Companion$Empty$1) {
                    objG7 = new q(joinWifiViewModel3, 0);
                    composerImplV.A(objG7);
                }
                Function2 function2 = (Function2) objG7;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean zI8 = composerImplV.I(joinWifiViewModel3);
                Object objG8 = composerImplV.G();
                if (zI8 || objG8 == composer$Companion$Empty$1) {
                    objG8 = new q(joinWifiViewModel3, 1);
                    composerImplV.A(objG8);
                }
                composerImplV.V(false);
                i(function0, function02, strP62, strQ6, function2, (Function2) objG8, null, z3, composerImplV, 196608);
                composerImplV.V(false);
                joinWifiViewModel2 = joinWifiViewModel3;
            }
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(appIdentifier, joinWifiViewModel2, joinWifiActionHandler, modifier2, i, 14);
        }
    }

    public static final void g(Function2 function2, Function2 function22, String str, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(434235516);
        int i2 = i | (composerImplV.I(function2) ? 4 : 2) | (composerImplV.I(function22) ? 32 : 16) | (composerImplV.n("https://www.woolworthsgroup.com.au/privacy-policy") ? 256 : 128) | (composerImplV.n(str) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            d(R.string.rewards_join_screen_content_privacy_policy_title, 0, composerImplV);
            int i3 = i2 << 3;
            b(i3 & 112, composerImplV, StringResources_androidKt.c(composerImplV, R.string.rewards_join_screen_content_privacy_policy_text), function2);
            Modifier.Companion companion = Modifier.Companion.d;
            SpacerKt.a(composerImplV, SizeKt.g(companion, 20));
            float f = 16;
            int i4 = (i3 & 896) | 48;
            InstoreWifiScreenKt.l(StringResources_androidKt.b(R.string.rewards_instore_wifi_link_markdown, new Object[]{StringResources_androidKt.c(composerImplV, R.string.rewards_instore_wifi_privacy_policy_link_text), "https://www.woolworthsgroup.com.au/privacy-policy"}, composerImplV), PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), function22, composerImplV, i4, 0);
            float f2 = 8;
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composerImplV, PaddingKt.j(companion, f, f2, BitmapDescriptorFactory.HUE_RED, f2, 4));
            composerImplV = composerImplV;
            InstoreWifiScreenKt.l(StringResources_androidKt.b(R.string.rewards_instore_wifi_link_markdown, new Object[]{StringResources_androidKt.c(composerImplV, R.string.rewards_instore_wifi_collection_notice_link_text), str}, composerImplV), PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), function22, composerImplV, i4, 0);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 150));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(function2, function22, str, i, 13);
        }
    }

    public static final void h(Function0 function0, Function2 function2, String str, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(897757794);
        int i2 = i | (composerImplV.I(function0) ? 4 : 2) | (composerImplV.I(function2) ? 32 : 16) | (composerImplV.n(str) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 24, 7), WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 8));
            float f = 16;
            MarkdownCompatKt.b(StringResources_androidKt.b(R.string.rewards_join_screen_bottom_section_markdown_text, new Object[]{str}, composerImplV), R.layout.detail_content_centered_markdown, ColumnScopeInstance.f948a.b(PaddingKt.g(companion, f, 12), Alignment.Companion.n), null, function2, CollectionsKt.Q(new MarkdownLinkColorPlugin(ColorKt.j(WxTheme.a(composerImplV).h()))), composerImplV, (i2 << 12) & 458752, 88);
            PrimaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.rewards_join_screen_bottom_section_button_text), function0, PaddingKt.h(SizeKt.e(companion, 1.0f), f, BitmapDescriptorFactory.HUE_RED, 2), false, false, null, null, null, null, composerImplV, ((i2 << 3) & 112) | KyberEngine.KyberPolyBytes, 1016);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(function0, function2, str, i, 14);
        }
    }

    public static final void i(final Function0 function0, final Function0 function02, final String str, final String str2, final Function2 function2, final Function2 function22, Function2 function23, final boolean z, Composer composer, int i) {
        int i2;
        Function2 function24;
        ComposerImpl composerImplV = composer.v(1481173957);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function02) ? 32 : 16;
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
            i2 |= composerImplV.n(Modifier.Companion.d) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(function22) ? 8388608 : 4194304;
        }
        int i3 = i2 | 100663296;
        if ((805306368 & i) == 0) {
            i3 |= composerImplV.p(z) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            function24 = function23;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new b(6);
                composerImplV.A(objG);
            }
            final Function2 function25 = (Function2) objG;
            composerImplV.V(false);
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(-547352622, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt$RewardsJoinInStoreWifiScreen$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        final Function0 function03 = function0;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-186402003, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt$RewardsJoinInStoreWifiScreen$4.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                                    final Function0 function04 = function03;
                                    TopNavBarKt.b(null, modifierE, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1911761916, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt.RewardsJoinInStoreWifiScreen.4.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer4, R.string.back), function04, null, false, WxTheme.a(composer4).h(), composer4, 0, 24);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 805306422, 0, 1532);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final Function0 function04 = function02;
                        final Function2 function26 = function22;
                        final String str3 = str;
                        ComposableLambdaImpl composableLambdaImplC2 = ComposableLambdaKt.c(-496290585, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt$RewardsJoinInStoreWifiScreen$4.2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    JoinInStoreWifiScreenKt.h(function04, function26, str3, composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final Function2 function27 = function2;
                        final String str4 = str2;
                        final Function2 function28 = function25;
                        ScaffoldKt.a(fillElement, null, composableLambdaImplC, null, null, 0, 0L, 0L, composableLambdaImplC2, null, ComposableLambdaKt.c(406544507, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt$RewardsJoinInStoreWifiScreen$4.3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                PaddingValues it = (PaddingValues) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(it, "it");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierB = ScrollKt.b(PaddingKt.h(SizeKt.c, BitmapDescriptorFactory.HUE_RED, 24, 1), ScrollKt.a(composer3), true);
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 48);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierB);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function05 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function05);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function29 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function29);
                                    }
                                    Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                    String str5 = str3;
                                    Function2 function210 = function28;
                                    JoinInStoreWifiScreenKt.e(0, composer3, str5, function210);
                                    JoinInStoreWifiScreenKt.a(0, composer3, function210);
                                    JoinInStoreWifiScreenKt.g(function210, function27, str4, composer3, 0);
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 100663686, 762);
                        if (z) {
                            InstoreWifiScreenKt.h(composer2, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            function24 = function25;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.g(function0, function02, str, str2, function2, function22, function24, z, i);
        }
    }

    public static final void j(boolean z, Function1 function1, Function2 function2, String str, String str2, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-307477868);
        int i2 = i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.I(function2) ? 256 : 128) | (composerImplV.n(str) ? 2048 : 1024) | (composerImplV.n("https://www.woolworthsgroup.com.au/privacy-policy") ? 16384 : 8192) | (composerImplV.n(str2) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            MarkdownCompatKt.b(StringResources_androidKt.b(R.string.shop_join_screen_additional_content, new Object[]{str, "https://www.woolworthsgroup.com.au/privacy-policy", str2}, composerImplV), R.layout.detail_content_markdown, PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2), null, function2, CollectionsKt.Q(new MarkdownLinkColorPlugin(ColorKt.j(WxTheme.a(composerImplV).h()))), composerImplV, ((i2 << 9) & 458752) | KyberEngine.KyberPolyBytes, 88);
            composerImplV = composerImplV;
            SpacerKt.a(composerImplV, SizeKt.g(companion, 32));
            int i3 = i2 << 6;
            InstoreWifiScreenKt.n(StringResources_androidKt.c(composerImplV, R.string.switch_wifi_accept_terms), true, z, function1, false, composerImplV, (i3 & 896) | 48 | (i3 & 7168), 16);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.v2.ui.g(z, function1, function2, str, str2, i);
        }
    }

    public static final void k(final Function0 onNavigateUp, final boolean z, final Function1 onAgreeTsAndCsToggled, final Function0 onContinueClicked, final String urlTermsOfWifiUse, final String urlWifiCollectionNotice, Function2 function2, final boolean z2, Composer composer, int i) {
        int i2;
        Function2 function22;
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onAgreeTsAndCsToggled, "onAgreeTsAndCsToggled");
        Intrinsics.h(onContinueClicked, "onContinueClicked");
        Intrinsics.h(urlTermsOfWifiUse, "urlTermsOfWifiUse");
        Intrinsics.h(urlWifiCollectionNotice, "urlWifiCollectionNotice");
        ComposerImpl composerImplV = composer.v(-420156828);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onNavigateUp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onAgreeTsAndCsToggled) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onContinueClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(urlTermsOfWifiUse) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n("https://www.woolworthsgroup.com.au/privacy-policy") ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(urlWifiCollectionNotice) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.n(Modifier.Companion.d) ? 8388608 : 4194304;
        }
        int i3 = i2 | 100663296;
        if ((805306368 & i) == 0) {
            i3 |= composerImplV.p(z2) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            function22 = function2;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new b(5);
                composerImplV.A(objG);
            }
            final Function2 function23 = (Function2) objG;
            composerImplV.V(false);
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-880785748, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt$ShopJoinInStoreWifiScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-481919737, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt$ShopJoinInStoreWifiScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                                    final Function0 function02 = function0;
                                    TopNavBarKt.b(null, modifierE, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(220146902, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt.ShopJoinInStoreWifiScreen.2.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer4, R.string.back), function02, null, false, WxTheme.a(composer4).h(), composer4, 0, 24);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 805306422, 0, 1532);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final Function1 function1 = onAgreeTsAndCsToggled;
                        final String str = urlWifiCollectionNotice;
                        final Function0 function02 = onContinueClicked;
                        final boolean z3 = z;
                        final Function2 function24 = function23;
                        final String str2 = urlTermsOfWifiUse;
                        ScaffoldKt.a(fillElement, null, composableLambdaImplC, null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(1917276245, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt$ShopJoinInStoreWifiScreen$2.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                PaddingValues it = (PaddingValues) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(it, "it");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierB = ScrollKt.b(PaddingKt.h(SizeKt.c, BitmapDescriptorFactory.HUE_RED, 24, 1), ScrollKt.a(composer3), true);
                                    Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
                                    BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$SpaceBetween$1, horizontal, composer3, 6);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierB);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function03 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function03);
                                    } else {
                                        composer3.e();
                                    }
                                    Function2 function25 = ComposeUiNode.Companion.g;
                                    Updater.b(composer3, columnMeasurePolicyA, function25);
                                    Function2 function26 = ComposeUiNode.Companion.f;
                                    Updater.b(composer3, persistentCompositionLocalMapD, function26);
                                    Function2 function27 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function27);
                                    }
                                    Function2 function28 = ComposeUiNode.Companion.d;
                                    Updater.b(composer3, modifierD, function28);
                                    ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.c, horizontal, composer3, 0);
                                    int p2 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierD2 = ComposedModifierKt.d(composer3, companion);
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function03);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, columnMeasurePolicyA2, function25);
                                    Updater.b(composer3, persistentCompositionLocalMapD2, function26);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                        androidx.camera.core.impl.b.z(p2, composer3, p2, function27);
                                    }
                                    Updater.b(composer3, modifierD2, function28);
                                    String str3 = str2;
                                    Function2 function29 = function24;
                                    JoinInStoreWifiScreenKt.e(0, composer3, str3, function29);
                                    JoinInStoreWifiScreenKt.a(0, composer3, function29);
                                    boolean z4 = z3;
                                    JoinInStoreWifiScreenKt.j(z4, function1, function29, str3, str, composer3, 0);
                                    composer3.f();
                                    float f = 16;
                                    PrimaryButtonKt.a(StringResources_androidKt.c(composer3, R.string.rewards_join_screen_bottom_section_button_text), function02, PaddingKt.j(SizeKt.e(companion, 1.0f), f, f, f, BitmapDescriptorFactory.HUE_RED, 8), z4, false, null, null, null, null, composer3, 0, 1008);
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 390, 1018);
                        if (z2) {
                            InstoreWifiScreenKt.h(composer2, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            function22 = function23;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new s(onNavigateUp, z, onAgreeTsAndCsToggled, onContinueClicked, urlTermsOfWifiUse, urlWifiCollectionNotice, function22, z2, i);
        }
    }
}
