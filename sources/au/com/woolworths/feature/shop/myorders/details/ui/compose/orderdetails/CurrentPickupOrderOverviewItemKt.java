package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.TertiaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepTypeApiDataKt;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepper;
import au.com.woolworths.feature.shop.myorders.details.models.TooltipType;
import au.com.woolworths.feature.shop.myorders.details.models.TooltipTypeKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CurrentPickupOrderOverviewItemKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7796a;

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
            f7796a = iArr;
        }
    }

    public static final void a(BroadcastBannerData broadcastBannerData, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Function0 function02;
        ComposerImpl composerImplV = composer.v(702647924);
        if ((i & 6) == 0) {
            i3 = i | (composerImplV.I(broadcastBannerData) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
        } else {
            Function0 function03 = i4 != 0 ? null : function0;
            if (broadcastBannerData != null) {
                composerImplV.o(934794973);
                if (function03 != null) {
                    composerImplV.o(5004770);
                    boolean z = (i3 & 112) == 32;
                    Object objG = composerImplV.G();
                    if (z || objG == Composer.Companion.f1624a) {
                        objG = new CurrentPickupOrderOverviewItemKt$Banner$1$1$1$1(function03, null);
                        composerImplV.A(objG);
                    }
                    composerImplV.V(false);
                    EffectsKt.e(composerImplV, function03, (Function2) objG);
                }
                composerImplV.V(false);
                BroadcastBannerKt.a(BroadcastBannerType.f, broadcastBannerData.getTitle(), broadcastBannerData.getImageUrl(), null, null, null, null, broadcastBannerData.getSubtitle(), null, composerImplV, 6, 376);
            }
            function02 = function03;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.a(broadcastBannerData, function02, i, i2, 7);
        }
    }

    public static final void b(ButtonApiData buttonApiData, Function0 function0, Composer composer, int i) {
        int i2;
        boolean z;
        ComposerImpl composerImplV = composer.v(-1082520075);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(buttonApiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ButtonStyleApiData style = buttonApiData.getStyle();
            int i3 = style == null ? -1 : WhenMappings.f7796a[style.ordinal()];
            Modifier.Companion companion = Modifier.Companion.d;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i3 == 1) {
                composerImplV.o(1554034153);
                Modifier modifierE = SizeKt.e(companion, 1.0f);
                String label = buttonApiData.getLabel();
                composerImplV.o(5004770);
                z = (i2 & 112) == 32;
                Object objG = composerImplV.G();
                if (z || objG == composer$Companion$Empty$1) {
                    objG = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(21, function0);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                PrimaryButtonKt.a(label, (Function0) objG, modifierE, false, null, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 248);
                composerImplV.V(false);
            } else if (i3 == 2) {
                composerImplV.o(1554269319);
                Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                String label2 = buttonApiData.getLabel();
                composerImplV.o(5004770);
                z = (i2 & 112) == 32;
                Object objG2 = composerImplV.G();
                if (z || objG2 == composer$Companion$Empty$1) {
                    objG2 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(22, function0);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                SecondaryButtonKt.a(label2, (Function0) objG2, modifierE2, false, null, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 248);
                composerImplV.V(false);
            } else if (i3 != 3) {
                composerImplV.o(1554711627);
                composerImplV.V(false);
            } else {
                composerImplV.o(1554505384);
                Modifier modifierE3 = SizeKt.e(companion, 1.0f);
                String label3 = buttonApiData.getLabel();
                composerImplV.o(5004770);
                z = (i2 & 112) == 32;
                Object objG3 = composerImplV.G();
                if (z || objG3 == composer$Companion$Empty$1) {
                    objG3 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(23, function0);
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
            recomposeScopeImplX.d = new b(buttonApiData, i, 2, function0);
        }
    }

    public static final void c(ButtonApiData buttonApiData, ButtonApiData buttonApiData2, ButtonApiData buttonApiData3, ButtonApiData buttonApiData4, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-554215381);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(buttonApiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(buttonApiData2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(buttonApiData3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(buttonApiData4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(function03) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.I(function04) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else if (buttonApiData != null || buttonApiData2 != null || buttonApiData3 != null || buttonApiData4 != null) {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(4), Alignment.Companion.m, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            Function0 function05 = ComposeUiNode.Companion.b;
            composerImplV.i();
            int i4 = i2;
            if (composerImplV.O) {
                composerImplV.K(function05);
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
            composerImplV.o(548462773);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (buttonApiData != null) {
                composerImplV.o(5004770);
                boolean z = (i4 & 29360128) == 8388608;
                Object objG = composerImplV.G();
                if (z || objG == composer$Companion$Empty$1) {
                    objG = new CurrentPickupOrderOverviewItemKt$Buttons$1$1$1$1(function03, null);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, buttonApiData, (Function2) objG);
                composerImplV.o(-1633490746);
                boolean zI = ((i4 & 57344) == 16384) | composerImplV.I(buttonApiData);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new au.com.woolworths.feature.shop.modeselector.ui.d(function1, buttonApiData, 4);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                b(buttonApiData, (Function0) objG2, composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.o(548472789);
            if (buttonApiData2 != null) {
                composerImplV.o(5004770);
                boolean z2 = (i4 & 234881024) == 67108864;
                Object objG3 = composerImplV.G();
                if (z2 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new CurrentPickupOrderOverviewItemKt$Buttons$1$2$1$1(function04, null);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, buttonApiData2, (Function2) objG3);
                composerImplV.o(-1633490746);
                boolean zI2 = ((i4 & 57344) == 16384) | composerImplV.I(buttonApiData2);
                Object objG4 = composerImplV.G();
                if (zI2 || objG4 == composer$Companion$Empty$1) {
                    objG4 = new au.com.woolworths.feature.shop.modeselector.ui.d(function1, buttonApiData2, 5);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                b(buttonApiData2, (Function0) objG4, composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.o(548482542);
            if (buttonApiData3 != null) {
                b(buttonApiData3, function0, composerImplV, (i4 >> 12) & 112);
            }
            composerImplV.V(false);
            composerImplV.o(548488077);
            if (buttonApiData4 != null) {
                b(buttonApiData4, function02, composerImplV, (i4 >> 15) & 112);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.i(buttonApiData, buttonApiData2, buttonApiData3, buttonApiData4, function1, function0, function02, function03, function04, i);
        }
    }

    public static final void d(CurrentPickupOrderOverview item, Function1 onToolTipClick, Function2 onLinkClick, Function1 onChangeOrCancelClick, Function0 onOnMyWayClick, Function0 onImHereClick, Function0 onChangeOrderButtonDisplayed, Function0 onCancelOrderButtonDisplayed, Function0 onSaveTimeBannerDisplayed, Composer composer, int i) {
        Intrinsics.h(item, "item");
        Intrinsics.h(onToolTipClick, "onToolTipClick");
        Intrinsics.h(onLinkClick, "onLinkClick");
        Intrinsics.h(onChangeOrCancelClick, "onChangeOrCancelClick");
        Intrinsics.h(onOnMyWayClick, "onOnMyWayClick");
        Intrinsics.h(onImHereClick, "onImHereClick");
        Intrinsics.h(onChangeOrderButtonDisplayed, "onChangeOrderButtonDisplayed");
        Intrinsics.h(onCancelOrderButtonDisplayed, "onCancelOrderButtonDisplayed");
        Intrinsics.h(onSaveTimeBannerDisplayed, "onSaveTimeBannerDisplayed");
        ComposerImpl composerImplV = composer.v(-1612594198);
        int i2 = (composerImplV.I(item) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onToolTipClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onLinkClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onChangeOrCancelClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onOnMyWayClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onImHereClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onChangeOrderButtonDisplayed) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(onCancelOrderButtonDisplayed) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.I(onSaveTimeBannerDisplayed) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 24;
            Modifier modifierG = PaddingKt.g(BackgroundKt.b(Modifier.Companion.d, CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a), 16, f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f), Alignment.Companion.m, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            int i4 = i2;
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
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProgressStepper progressStepper = item.f7751a;
            composerImplV.o(-1633490746);
            boolean zI = ((i4 & 112) == 32) | composerImplV.I(item);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new f(0, onToolTipClick, item);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            g(progressStepper, (Function0) objG, composerImplV, 0);
            a(item.s, null, composerImplV, 0, 2);
            h(item.d, item.e, item.r, composerImplV, 0);
            int i5 = (i4 >> 3) & 112;
            f(i5, composerImplV, item.f, onLinkClick);
            a(item.q, onSaveTimeBannerDisplayed, composerImplV, (i4 >> 21) & 112, 0);
            c(item.g, item.h, item.m, item.i, onChangeOrCancelClick, onOnMyWayClick, onImHereClick, onChangeOrderButtonDisplayed, onCancelOrderButtonDisplayed, composerImplV, 268427264 & (i4 << 3));
            e(i5, composerImplV, item.j, onLinkClick);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.i(item, onToolTipClick, onLinkClick, onChangeOrCancelClick, onOnMyWayClick, onImHereClick, onChangeOrderButtonDisplayed, onCancelOrderButtonDisplayed, onSaveTimeBannerDisplayed, i);
        }
    }

    public static final void e(int i, Composer composer, String str, Function2 function2) {
        int i2;
        ComposerImpl composerImplV = composer.v(-788358377);
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
            MarkdownCompatKt.a(str, null, new MarkdownTextViewStyle((Density) composerImplV.x(CompositionLocalsKt.h), CoreTheme.b(composerImplV).e.d.b, CoreTheme.f(composerImplV).f5120a.c.f5124a, (TextAlign) null, 24), null, true, new Color(CoreTheme.b(composerImplV).e.d.f4856a), function2, false, null, null, composerImplV, ((i2 << 15) & 3670016) | (i2 & 14) | 24576, 906);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(str, function2, i, 3);
        }
    }

    public static final void f(int i, Composer composer, String str, Function2 function2) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1424976890);
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
            recomposeScopeImplX.d = new e(str, function2, i, 2);
        }
    }

    public static final void g(ProgressStepper progressStepper, Function0 function0, Composer composer, int i) {
        Modifier.Companion companion;
        boolean z;
        int i2;
        boolean z2;
        ComposerImpl composerImplV = composer.v(-365236537);
        int i3 = (composerImplV.n(progressStepper) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16);
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else if (progressStepper != null) {
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
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion2);
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
            TextKt.a(progressStepper.f7775a, CoreTheme.f(composerImplV).d.f5129a.b, RowScopeInstance.f974a.a(companion2, 1.0f, true), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1008);
            composerImplV = composerImplV;
            TooltipType tooltipType = progressStepper.e;
            composerImplV.o(210869544);
            if (tooltipType == null) {
                companion = companion2;
                z2 = false;
                z = true;
            } else {
                SpacerKt.a(composerImplV, SizeKt.u(companion2, 8));
                composerImplV.o(5004770);
                boolean z3 = (i3 & 112) == 32;
                Object objG = composerImplV.G();
                if (z3 || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(24, function0);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                companion = companion2;
                Modifier modifierQ = SizeKt.q(ClickableKt.d(companion2, false, null, null, (Function0) objG, 7), 24);
                int i6 = TooltipTypeKt.WhenMappings.f7776a[tooltipType.ordinal()];
                z = true;
                if (i6 == 1) {
                    i2 = R.drawable.ic_info_circle;
                } else if (i6 != 2) {
                    z2 = false;
                    i2 = 0;
                    ImageKt.a(PainterResources_androidKt.a(i2, z2 ? 1 : 0, composerImplV), null, modifierQ, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
                    composerImplV = composerImplV;
                } else {
                    i2 = R.drawable.ic_complete_circle;
                }
                z2 = false;
                ImageKt.a(PainterResources_androidKt.a(i2, z2 ? 1 : 0, composerImplV), null, modifierQ, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
                composerImplV = composerImplV;
            }
            composerImplV.V(z2);
            composerImplV.V(z);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 16));
            ProgressStepperKt.a(SizeKt.g(companion, 4), 0L, progressStepper.b, progressStepper.d, ProgressStepTypeApiDataKt.a(progressStepper.c), false, null, composerImplV, 6, 98);
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(progressStepper, i, 17, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(java.lang.String r31, java.lang.String r32, au.com.woolworths.feature.shop.myorders.details.models.OrderSubtitleIcon r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentPickupOrderOverviewItemKt.h(java.lang.String, java.lang.String, au.com.woolworths.feature.shop.myorders.details.models.OrderSubtitleIcon, androidx.compose.runtime.Composer, int):void");
    }
}
