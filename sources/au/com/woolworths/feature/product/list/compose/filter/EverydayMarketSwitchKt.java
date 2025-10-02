package au.com.woolworths.feature.product.list.compose.filter;

import android.content.Context;
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
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.SwitchKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.data.ProductFilterSwitch;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EverydayMarketSwitchKt {
    public static final void a(ProductFilterSwitch productFilterSwitch, Function1 onEverydayMarketSwitchClicked, Function0 onMarketplaceCtaClicked, Composer composer, int i) {
        Object obj;
        Function0 function0;
        boolean z;
        Intrinsics.h(onEverydayMarketSwitchClicked, "onEverydayMarketSwitchClicked");
        Intrinsics.h(onMarketplaceCtaClicked, "onMarketplaceCtaClicked");
        ComposerImpl composerImplV = composer.v(-575792110);
        int i2 = (composerImplV.I(productFilterSwitch) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onEverydayMarketSwitchClicked) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onMarketplaceCtaClicked) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function0 = onMarketplaceCtaClicked;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
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
            float f = 16;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
            composerImplV.o(5004770);
            Object objG = composerImplV.G();
            Object obj2 = Composer.Companion.f1624a;
            if (objG == obj2) {
                objG = new a(2);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composerImplV, GraphicsLayerModifierKt.a(modifierJ, (Function1) objG));
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier modifierA = rowScopeInstance.a(companion, 1.0f, true);
            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, Alignment.Companion.j, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            Modifier modifierQ = SizeKt.q(companion, 24);
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            builder.c = Boolean.valueOf(productFilterSwitch.getValue());
            ImageRequestsKt.a(builder);
            builder.j = CachePolicy.g;
            SingletonAsyncImageKt.b(builder.a(), null, modifierQ, PainterResources_androidKt.a(R.drawable.ic_everyday_market_logo_small, 0, composerImplV), PainterResources_androidKt.a(R.drawable.ic_everyday_market_logo_small, 0, composerImplV), null, null, null, null, null, ContentScale.Companion.e, null, composerImplV, 432, 6, 31712);
            Modifier modifierH = PaddingKt.h(companion, 8, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD4, function24);
            TextKt.b(productFilterSwitch.getTitle(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, 0, 0, 65534);
            composerImplV = composerImplV;
            String subtitle = productFilterSwitch.getSubtitle();
            composerImplV.o(323663879);
            if (subtitle == null) {
                function0 = onMarketplaceCtaClicked;
                obj = obj2;
                z = false;
            } else {
                composerImplV.o(323664903);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder();
                builder2.e(subtitle.concat(" "));
                composerImplV.o(323667791);
                if (productFilterSwitch.getButtonCta() != null) {
                    int iL = builder2.l(new SpanStyle(WxTheme.a(composerImplV).h(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65534));
                    try {
                        builder2.k(productFilterSwitch.getButtonCta().getLabel(), productFilterSwitch.getButtonCta().getLabel());
                        builder2.e(productFilterSwitch.getButtonCta().getLabel());
                    } finally {
                        builder2.i(iL);
                    }
                }
                composerImplV.V(false);
                AnnotatedString annotatedStringM = builder2.m();
                composerImplV.V(false);
                TextStyle textStyleA = TextStyle.a(WxTheme.b(composerImplV).s, WxTheme.a(composerImplV).f(), 0L, null, null, 0L, 0L, null, null, 0, 16777214);
                composerImplV.o(-1633490746);
                boolean zN = composerImplV.n(annotatedStringM) | ((i2 & 896) == 256);
                Object objG2 = composerImplV.G();
                obj = obj2;
                if (zN || objG2 == obj) {
                    function0 = onMarketplaceCtaClicked;
                    objG2 = new c(annotatedStringM, function0, 0);
                    composerImplV.A(objG2);
                } else {
                    function0 = onMarketplaceCtaClicked;
                }
                z = false;
                composerImplV.V(false);
                ClickableTextKt.a(annotatedStringM, null, textStyleA, false, 0, 0, null, (Function1) objG2, composerImplV, 0);
                composerImplV = composerImplV;
            }
            android.support.v4.media.session.a.C(composerImplV, z, true, true);
            boolean z2 = z;
            SwitchKt.a(i2 & 112, 8, composerImplV, rowScopeInstance.b(companion, vertical), onEverydayMarketSwitchClicked, productFilterSwitch.getValue(), false);
            composerImplV.V(true);
            Modifier modifierJ2 = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            composerImplV.o(5004770);
            Object objG3 = composerImplV.G();
            if (objG3 == obj) {
                objG3 = new a(3);
                composerImplV.A(objG3);
            }
            composerImplV.V(z2);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composerImplV, GraphicsLayerModifierKt.a(modifierJ2, (Function1) objG3));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(i, 17, productFilterSwitch, function0, onEverydayMarketSwitchClicked);
        }
    }
}
