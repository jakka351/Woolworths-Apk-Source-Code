package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodsTooltip;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
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
public final class OrderDetailsDeliveryDriverInfoItemKt {
    public static final void a(final String str, final String str2, final String str3, InsetBanner insetBanner, final ButtonApiData buttonApiData, final DeliveryMethodsTooltip deliveryMethodsTooltip, final Function0 onBannerLoaded, Function0 function0, final Function0 onInfoIconClick, Composer composer, final int i) {
        int i2;
        float f;
        int i3;
        float f2;
        boolean z;
        Modifier.Companion companion;
        ComposerImpl composerImpl;
        boolean z2;
        final InsetBanner insetBanner2 = insetBanner;
        final Function0 onLiveTrackingClick = function0;
        Intrinsics.h(onBannerLoaded, "onBannerLoaded");
        Intrinsics.h(onLiveTrackingClick, "onLiveTrackingClick");
        Intrinsics.h(onInfoIconClick, "onInfoIconClick");
        ComposerImpl composerImplV = composer.v(-332812981);
        int i4 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.n(str3) ? 256 : 128) | (composerImplV.I(insetBanner2) ? 2048 : 1024) | (composerImplV.I(buttonApiData) ? 16384 : 8192) | (composerImplV.I(deliveryMethodsTooltip) ? 131072 : 65536) | (composerImplV.I(onBannerLoaded) ? 1048576 : 524288) | (composerImplV.I(onLiveTrackingClick) ? 8388608 : 4194304) | (composerImplV.I(onInfoIconClick) ? 67108864 : 33554432);
        if ((38347923 & i4) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i5 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            if (buttonApiData != null) {
                f = 12;
                i2 = 16;
            } else {
                i2 = 16;
                f = 16;
            }
            float f3 = i2;
            Modifier modifierJ = PaddingKt.j(PaddingKt.j(SizeKt.e(companion2, 1.0f), f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, f, 5);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            Painter painterA = PainterResources_androidKt.a(R.drawable.avatar, 0, composerImplV);
            Modifier modifierQ = SizeKt.q(companion2, 48);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            SingletonAsyncImageKt.b(str3, null, rowScopeInstance.b(modifierQ, vertical), painterA, null, null, null, null, null, null, ContentScale.Companion.b, null, composerImplV, ((i4 >> 6) & 14) | 48, 6, 31728);
            if (deliveryMethodsTooltip != null) {
                i3 = 0;
                f2 = 0;
            } else {
                i3 = 0;
                f2 = f3;
            }
            Modifier modifierB = rowScopeInstance.b(rowScopeInstance.a(PaddingKt.j(companion2, f3, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 10), 1.0f, true), vertical);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, i3);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            if (StringsKt.D(str2) || StringsKt.D(str)) {
                z = true;
                companion = companion2;
                composerImplV.o(242160011);
                TextKt.b(str, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.b, composerImplV, i4 & 14, 0, 65530);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else {
                composerImplV.o(241615775);
                TextStyle textStyle = CoreTheme.f(composerImplV).f5120a.c.f5124a;
                companion = companion2;
                z = true;
                TextKt.b(str2, null, CoreTheme.b(composerImplV).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, (i4 >> 3) & 14, 0, 65530);
                SpacerKt.a(composerImplV, SizeKt.g(companion, 4));
                TextKt.b(str, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.b, composerImplV, i4 & 14, 0, 65530);
                composerImpl = composerImplV;
                composerImpl.V(false);
            }
            composerImpl.V(z);
            composerImpl.o(1574830922);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (deliveryMethodsTooltip == null) {
                z2 = false;
            } else {
                ImageVector imageVector = CoreTheme.e(composerImpl).i.d;
                long j = CoreTheme.b(composerImpl).e.c.f4854a;
                Modifier modifierB2 = rowScopeInstance.b(companion, vertical);
                composerImpl.o(5004770);
                boolean z3 = (i4 & 234881024) == 67108864 ? z : false;
                Object objG = composerImpl.G();
                if (z3 || objG == composer$Companion$Empty$1) {
                    objG = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(28, onInfoIconClick);
                    composerImpl.A(objG);
                }
                z2 = false;
                composerImpl.V(false);
                ComposerImpl composerImpl2 = composerImpl;
                IconButtonKt.c(imageVector, "info", (Function0) objG, modifierB2, false, null, j, composerImpl2, 48, 48);
                composerImpl = composerImpl2;
            }
            composerImpl.V(z2);
            composerImpl.V(z);
            composerImpl.o(-731381013);
            if (insetBanner == null) {
                insetBanner2 = insetBanner;
            } else {
                insetBanner2 = insetBanner;
                ThemeKt.b(6, composerImpl, ComposableLambdaKt.c(1806631241, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderDetailsDeliveryDriverInfoItemKt$OrderDetailsDeliveryDriverInfoItem$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            float f4 = 16;
                            Modifier modifierA = ClipKt.a(PaddingKt.i(Modifier.Companion.d, f4, 0, f4, f4), RoundedCornerShapeKt.b(8));
                            composer2.o(1849434622);
                            Object objG2 = composer2.G();
                            if (objG2 == Composer.Companion.f1624a) {
                                objG2 = new au.com.woolworths.feature.shop.modeselector.ui.c(29);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            InsetBannerUiKt.b(insetBanner2, modifierA, false, (Function1) objG2, composer2, 24576, 12);
                        }
                        return Unit.f24250a;
                    }
                }, composerImpl));
                onBannerLoaded.invoke();
            }
            composerImpl.V(false);
            composerImpl.o(-731365069);
            if (buttonApiData == null) {
                onLiveTrackingClick = function0;
            } else {
                String label = buttonApiData.getLabel();
                composerImpl.o(5004770);
                boolean z4 = (i4 & 29360128) == 8388608 ? z : false;
                Object objG2 = composerImpl.G();
                if (z4 || objG2 == composer$Companion$Empty$1) {
                    onLiveTrackingClick = function0;
                    objG2 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(29, onLiveTrackingClick);
                    composerImpl.A(objG2);
                } else {
                    onLiveTrackingClick = function0;
                }
                composerImpl.V(false);
                ComposerImpl composerImpl3 = composerImpl;
                PrimaryButtonKt.a(label, (Function0) objG2, PaddingKt.j(SizeKt.e(companion, 1.0f), f3, BitmapDescriptorFactory.HUE_RED, f3, f3, 2), buttonApiData.getEnabled(), null, null, CoreTheme.e(composerImpl).e.p, null, composerImpl3, KyberEngine.KyberPolyBytes, 176);
                composerImpl = composerImpl3;
            }
            composerImpl.V(false);
            composerImpl.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, str2, str3, insetBanner2, buttonApiData, deliveryMethodsTooltip, onBannerLoaded, onLiveTrackingClick, onInfoIconClick, i) { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.j
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ InsetBanner g;
                public final /* synthetic */ ButtonApiData h;
                public final /* synthetic */ DeliveryMethodsTooltip i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Function0 l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    OrderDetailsDeliveryDriverInfoItemKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
