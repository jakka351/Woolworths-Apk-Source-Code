package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListErrorScreenKt {
    public static final void a(ProductListZeroResults.ProductListFullScreenError productListFullScreenError, Function1 eventSink, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z;
        boolean z2;
        Intrinsics.h(eventSink, "eventSink");
        ComposerImpl composerImplV = composer.v(-1522220050);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(productListFullScreenError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(eventSink) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierH = PaddingKt.h(BackgroundKt.b(modifier.x0(SizeKt.c), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a), 56, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composerImplV, 54);
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
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier.Companion companion = Modifier.Companion.d;
            SingletonAsyncImageKt.a(productListFullScreenError.f5625a, null, SizeKt.e(companion, 1.0f), null, ContentScale.Companion.d, composerImplV, 1573296, 1976);
            String str = productListFullScreenError.b;
            if (str == null) {
                str = "";
            }
            float f = 12;
            int i4 = i2;
            TextKt.a(str, CoreTheme.f(composerImplV).e.f5133a.b, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, null, 3, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 984);
            String str2 = productListFullScreenError.c;
            if (str2 == null) {
                str2 = "";
            }
            TextKt.a(str2, CoreTheme.f(composerImplV).f5120a.c.f5124a, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, null, 3, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 984);
            composerImplV = composerImplV;
            LinkData linkData = productListFullScreenError.d;
            composerImplV.o(962808374);
            if (linkData == null) {
                z = false;
                z2 = true;
            } else {
                TextWithAltData textWithAltData = linkData.c;
                Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                String upperCase = textWithAltData.f10170a.toUpperCase(Locale.ROOT);
                Intrinsics.g(upperCase, "toUpperCase(...)");
                String str3 = textWithAltData.b;
                composerImplV.o(-1746271574);
                boolean zI = ((i4 & 112) == 32) | composerImplV.I(linkData) | composerImplV.I(productListFullScreenError);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new a(1, eventSink, linkData, productListFullScreenError);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                z = false;
                z2 = true;
                PrimaryButtonKt.a(upperCase, (Function0) objG, modifierJ, false, str3, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 232);
                composerImplV = composerImplV;
            }
            composerImplV.V(z);
            composerImplV.V(z2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(i, 26, productListFullScreenError, modifier, eventSink);
        }
    }
}
