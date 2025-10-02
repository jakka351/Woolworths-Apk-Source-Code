package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import android.content.Context;
import android.webkit.URLUtil;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.TertiaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentDeliveryOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSubtitleIcon;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepTypeApiDataKt;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepper;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CurrentDeliveryOrderOverviewItemKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7795a;

        static {
            int[] iArr = new int[ButtonStyleApiData.values().length];
            try {
                iArr[ButtonStyleApiData.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyleApiData.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStyleApiData.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7795a = iArr;
        }
    }

    public static final void a(ButtonApiData buttonApiData, Function0 function0, Composer composer, int i) {
        boolean z;
        ComposerImpl composerImplV = composer.v(-1112728467);
        int i2 = (composerImplV.I(buttonApiData) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ButtonStyleApiData style = buttonApiData.getStyle();
            int i3 = style == null ? -1 : WhenMappings.f7795a[style.ordinal()];
            Modifier.Companion companion = Modifier.Companion.d;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i3 == 1) {
                composerImplV.o(-736007055);
                Modifier modifierE = SizeKt.e(companion, 1.0f);
                String label = buttonApiData.getLabel();
                composerImplV.o(5004770);
                z = (i2 & 112) == 32;
                Object objG = composerImplV.G();
                if (z || objG == composer$Companion$Empty$1) {
                    objG = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(18, function0);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                PrimaryButtonKt.a(label, (Function0) objG, modifierE, false, null, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 248);
                composerImplV.V(false);
            } else if (i3 == 2) {
                composerImplV.o(-735770897);
                Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                String label2 = buttonApiData.getLabel();
                composerImplV.o(5004770);
                z = (i2 & 112) == 32;
                Object objG2 = composerImplV.G();
                if (z || objG2 == composer$Companion$Empty$1) {
                    objG2 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(19, function0);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                SecondaryButtonKt.a(label2, (Function0) objG2, modifierE2, false, null, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 248);
                composerImplV.V(false);
            } else if (i3 != 3) {
                composerImplV.o(-735326605);
                composerImplV.V(false);
            } else {
                composerImplV.o(-735533840);
                Modifier modifierE3 = SizeKt.e(companion, 1.0f);
                String label3 = buttonApiData.getLabel();
                composerImplV.o(5004770);
                z = (i2 & 112) == 32;
                Object objG3 = composerImplV.G();
                if (z || objG3 == composer$Companion$Empty$1) {
                    objG3 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(20, function0);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                TertiaryButtonKt.a(label3, (Function0) objG3, modifierE3, false, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 248);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(buttonApiData, i, 16, function0);
        }
    }

    public static final void b(ButtonApiData buttonApiData, ButtonApiData buttonApiData2, Function1 function1, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-91517185);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(buttonApiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(buttonApiData2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function02) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else if (buttonApiData != null || buttonApiData2 != null) {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(4), Alignment.Companion.m, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1802127287);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (buttonApiData != null) {
                composerImplV.o(5004770);
                boolean z = (i2 & 7168) == 2048;
                Object objG = composerImplV.G();
                if (z || objG == composer$Companion$Empty$1) {
                    objG = new CurrentDeliveryOrderOverviewItemKt$Buttons$1$1$1$1(function0, null);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, buttonApiData, (Function2) objG);
                composerImplV.o(-1633490746);
                boolean zI = ((i2 & 896) == 256) | composerImplV.I(buttonApiData);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new au.com.woolworths.feature.shop.modeselector.ui.d(function1, buttonApiData, 2);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                a(buttonApiData, (Function0) objG2, composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.o(-1802117271);
            if (buttonApiData2 != null) {
                composerImplV.o(5004770);
                boolean z2 = (57344 & i2) == 16384;
                Object objG3 = composerImplV.G();
                if (z2 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new CurrentDeliveryOrderOverviewItemKt$Buttons$1$2$1$1(function02, null);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, buttonApiData2, (Function2) objG3);
                composerImplV.o(-1633490746);
                boolean zI2 = ((i2 & 896) == 256) | composerImplV.I(buttonApiData2);
                Object objG4 = composerImplV.G();
                if (zI2 || objG4 == composer$Companion$Empty$1) {
                    objG4 = new au.com.woolworths.feature.shop.modeselector.ui.d(function1, buttonApiData2, 3);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                a(buttonApiData2, (Function0) objG4, composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(buttonApiData, buttonApiData2, function1, function0, function02, i, 12);
        }
    }

    public static final void c(CurrentDeliveryOrderOverview item, Function1 onBannerImpression, Function1 onToolTipClick, Function2 onLinkClick, Function1 onChangeOrCancelClick, Function0 onChangeOrderButtonDisplayed, Function0 onCancelOrderButtonDisplayed, Composer composer, int i) {
        Function1 function1;
        Function2 function2;
        Intrinsics.h(item, "item");
        List list = item.f7748a;
        String str = item.l;
        Intrinsics.h(onBannerImpression, "onBannerImpression");
        Intrinsics.h(onToolTipClick, "onToolTipClick");
        Intrinsics.h(onLinkClick, "onLinkClick");
        Intrinsics.h(onChangeOrCancelClick, "onChangeOrCancelClick");
        Intrinsics.h(onChangeOrderButtonDisplayed, "onChangeOrderButtonDisplayed");
        Intrinsics.h(onCancelOrderButtonDisplayed, "onCancelOrderButtonDisplayed");
        ComposerImpl composerImplV = composer.v(1133967179);
        int i2 = (composerImplV.I(item) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onBannerImpression) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onToolTipClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onLinkClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onChangeOrCancelClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onChangeOrderButtonDisplayed) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onCancelOrderButtonDisplayed) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
            function1 = onToolTipClick;
            function2 = onLinkClick;
        } else {
            long j = CoreTheme.b(composerImplV).e.f4848a.c;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(companion, j, rectangleShapeKt$RectangleShape$1);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i3 = composerImplV.P;
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
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function25);
            composerImplV.o(1738744752);
            if (!list.isEmpty()) {
                f(list, onBannerImpression, composerImplV, i2 & 112);
            }
            composerImplV.V(false);
            composerImplV.o(1738748702);
            if (str != null && (!StringsKt.D(str)) && URLUtil.isValidUrl(str)) {
                P2PLiveTrackingMapItemKt.a(0, composerImplV, null, str);
            }
            composerImplV.V(false);
            float f = 24;
            Modifier modifierG = PaddingKt.g(companion, 16, f);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.g(f), horizontal, composerImplV, 6);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierG);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function24);
            }
            Updater.b(composerImplV, modifierD2, function25);
            ProgressStepper progressStepper = item.c;
            StepsToolTip stepsToolTip = item.d;
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(item);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                function1 = onToolTipClick;
                objG = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(13, function1, item);
                composerImplV.A(objG);
            } else {
                function1 = onToolTipClick;
            }
            composerImplV.V(false);
            d(progressStepper, stepsToolTip, (Function1) objG, composerImplV, 0);
            h(item.i, item.j, item.k, composerImplV, 0);
            int i5 = i2 >> 6;
            int i6 = i5 & 112;
            function2 = onLinkClick;
            g(i6, composerImplV, item.e, function2);
            b(item.g, item.h, onChangeOrCancelClick, onChangeOrderButtonDisplayed, onCancelOrderButtonDisplayed, composerImplV, i5 & 65408);
            e(i6, composerImplV, item.f, function2);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.a(item, onBannerImpression, function1, function2, onChangeOrCancelClick, onChangeOrderButtonDisplayed, onCancelOrderButtonDisplayed, i);
        }
    }

    public static final void d(ProgressStepper progressStepper, StepsToolTip stepsToolTip, Function1 function1, Composer composer, int i) {
        boolean z;
        Modifier.Companion companion;
        ProgressStepper progressStepper2 = progressStepper;
        ComposerImpl composerImplV = composer.v(-2115335363);
        int i2 = i | (composerImplV.n(progressStepper2) ? 4 : 2) | (composerImplV.I(stepsToolTip) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else if (progressStepper2 != null) {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion2);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.a(progressStepper2.f7775a, CoreTheme.f(composerImplV).d.f5129a.b, RowScopeInstance.f974a.a(companion2, 1.0f, true), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1008);
            SpacerKt.a(composerImplV, SizeKt.u(companion2, 8));
            composerImplV.o(718064596);
            if (stepsToolTip == null) {
                companion = companion2;
                z = false;
            } else {
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(stepsToolTip) | ((i2 & 896) == 256);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.feature.shop.contentpage.ui.n(29, function1, stepsToolTip);
                    composerImplV.A(objG);
                }
                z = false;
                composerImplV.V(false);
                companion = companion2;
                ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_info_circle, 0, composerImplV), null, SizeKt.q(ClickableKt.d(companion2, false, null, null, (Function0) objG, 7), 20), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
            }
            composerImplV.V(z);
            composerImplV.V(true);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 16));
            progressStepper2 = progressStepper;
            ProgressStepperKt.a(SizeKt.g(companion, 4), 0L, progressStepper2.b, progressStepper2.d, ProgressStepTypeApiDataKt.a(progressStepper2.c), false, null, composerImplV, 6, 98);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(progressStepper2, stepsToolTip, function1, i, 3);
        }
    }

    public static final void e(int i, Composer composer, String str, Function2 function2) {
        int i2;
        ComposerImpl composerImplV = composer.v(-62062720);
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
        } else if (str != null) {
            MarkdownCompatKt.a(str, null, new MarkdownTextViewStyle((Density) composerImplV.x(CompositionLocalsKt.h), CoreTheme.b(composerImplV).e.c.b, CoreTheme.f(composerImplV).f5120a.c.f5124a, (TextAlign) null, 24), null, true, new Color(CoreTheme.b(composerImplV).e.d.f4856a), function2, false, null, null, composerImplV, ((i2 << 15) & 3670016) | (i2 & 14) | 24576, 906);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(str, function2, i, 0);
        }
    }

    public static final void f(List list, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(391801106);
        int i2 = (composerImplV.I(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                final InsetBannerApiData insetBannerApiData = (InsetBannerApiData) obj;
                composerImplV.o(-1436251615);
                if (i3 > 0) {
                    SpacerKt.a(composerImplV, SizeKt.g(Modifier.Companion.d, 8));
                }
                composerImplV.V(false);
                ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(2131676182, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentDeliveryOrderOverviewItemKt$InsetBanners$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer2 = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(insetBannerApiData);
                            composer2.o(1849434622);
                            Object objG = composer2.G();
                            if (objG == Composer.Companion.f1624a) {
                                objG = new au.com.woolworths.feature.shop.modeselector.ui.c(15);
                                composer2.A(objG);
                            }
                            composer2.l();
                            InsetBannerUiKt.b(uiModel, null, false, (Function1) objG, composer2, 24576, 14);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV));
                function1.invoke(insetBannerApiData);
                i3 = i4;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(list, i, 1, function1);
        }
    }

    public static final void g(int i, Composer composer, String str, Function2 function2) {
        int i2;
        ComposerImpl composerImplV = composer.v(-121120337);
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
        } else if (str != null) {
            MarkdownCompatKt.a(str, null, new MarkdownTextViewStyle((Density) composerImplV.x(CompositionLocalsKt.h), CoreTheme.b(composerImplV).e.d.d, CoreTheme.f(composerImplV).f5120a.b.f5123a, (TextAlign) null, 24), null, true, new Color(CoreTheme.b(composerImplV).e.d.d), function2, false, null, null, composerImplV, ((i2 << 15) & 3670016) | (i2 & 14) | 24576, 906);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(str, function2, i, 1);
        }
    }

    public static final void h(String str, String str2, OrderSubtitleIcon orderSubtitleIcon, Composer composer, int i) {
        Function2 function2;
        MarkdownTextViewStyle markdownTextViewStyle;
        int i2;
        boolean z;
        Context context;
        Function2 function22;
        Function2 function23;
        Function0 function0;
        Function2 function24;
        Modifier.Companion companion;
        Function2 function25;
        boolean z2;
        OrderSubtitleIcon orderSubtitleIcon2;
        ComposerImpl composerImplV = composer.v(254036326);
        int i3 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.r(orderSubtitleIcon == null ? -1 : orderSubtitleIcon.ordinal()) ? 256 : 128);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            orderSubtitleIcon2 = orderSubtitleIcon;
        } else {
            Context context2 = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            MarkdownTextViewStyle markdownTextViewStyle2 = new MarkdownTextViewStyle((Density) composerImplV.x(CompositionLocalsKt.h), CoreTheme.b(composerImplV).e.d.d, CoreTheme.f(composerImplV).d.c.b, (TextAlign) null, 24);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion2);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function26 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function26);
            Function2 function27 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function27);
            Function2 function28 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function28);
            }
            Function2 function29 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function29);
            composerImplV.o(1667651356);
            if (str == null) {
                i2 = i3;
                function22 = function29;
                context = context2;
                markdownTextViewStyle = markdownTextViewStyle2;
                function23 = function27;
                function24 = function28;
                companion = companion2;
                function0 = function02;
                function2 = function26;
                z = false;
            } else {
                function2 = function26;
                markdownTextViewStyle = markdownTextViewStyle2;
                i2 = i3;
                z = false;
                context = context2;
                function22 = function29;
                function23 = function27;
                function0 = function02;
                function24 = function28;
                companion = companion2;
                TextKt.a(str, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, CoreTheme.b(composerImplV).e.d.b, null, 0, 0, false, 0, null, composerImplV, i3 & 14, 1012);
            }
            composerImplV.V(z);
            composerImplV.o(1667660039);
            if (str2 == null) {
                orderSubtitleIcon2 = orderSubtitleIcon;
                z2 = true;
            } else {
                Modifier.Companion companion3 = companion;
                SpacerKt.a(composerImplV, SizeKt.g(companion3, 4));
                Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, Alignment.Companion.k, composerImplV, 48);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion3);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Function2 function210 = function2;
                Updater.b(composerImplV, rowMeasurePolicyA, function210);
                Function2 function211 = function23;
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function211);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    function25 = function24;
                    androidx.camera.core.impl.b.B(i5, composerImplV, i5, function25);
                } else {
                    function25 = function24;
                }
                Function2 function212 = function22;
                Updater.b(composerImplV, modifierD2, function212);
                Modifier modifierV = SizeKt.v(companion3, z ? 1.0f : 0.0f, 240);
                BiasAlignment.Vertical vertical = Alignment.Companion.j;
                RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composerImplV, 6);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierV);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA2, function210);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function211);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImplV, i6, function25);
                }
                Updater.b(composerImplV, modifierD3, function212);
                Modifier modifierA = SizeKt.A(companion3, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false);
                composerImplV.o(-1633490746);
                Context context3 = context;
                MarkdownTextViewStyle markdownTextViewStyle3 = markdownTextViewStyle;
                boolean zI = composerImplV.I(context3) | composerImplV.I(markdownTextViewStyle3);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(context3, 14, markdownTextViewStyle3, false);
                    composerImplV.A(objG);
                }
                composerImplV.V(z);
                Function2 function213 = function25;
                Function0 function03 = function0;
                MarkdownCompatKt.a(str2, modifierA, null, (Function1) objG, false, null, null, false, null, null, composerImplV, ((i2 >> 3) & 14) | 48, 1012);
                composerImplV = composerImplV;
                z2 = true;
                composerImplV.V(true);
                composerImplV.o(-1037589464);
                orderSubtitleIcon2 = orderSubtitleIcon;
                if (orderSubtitleIcon2 == OrderSubtitleIcon.f) {
                    SpacerKt.a(composerImplV, SizeKt.u(companion3, 8));
                    Modifier modifierA2 = RowScopeInstance.f974a.a(companion3, 1.0f, true);
                    RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(arrangement$Start$1, vertical, composerImplV, 6);
                    int i7 = composerImplV.P;
                    PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
                    Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierA2);
                    composerImplV.i();
                    if (composerImplV.O) {
                        composerImplV.K(function03);
                    } else {
                        composerImplV.e();
                    }
                    Updater.b(composerImplV, rowMeasurePolicyA3, function210);
                    Updater.b(composerImplV, persistentCompositionLocalMapQ4, function211);
                    if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                        androidx.camera.core.impl.b.B(i7, composerImplV, i7, function213);
                    }
                    Updater.b(composerImplV, modifierD4, function212);
                    ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_warning, 0, composerImplV), null, SizeKt.q(companion3, 24), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
                    composerImplV = composerImplV;
                    z2 = true;
                    composerImplV.V(true);
                }
                z = false;
                composerImplV.V(false);
                composerImplV.V(z2);
            }
            composerImplV.V(z);
            composerImplV.V(z2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(str, str2, orderSubtitleIcon2, i, 0);
        }
    }
}
