package au.com.woolworths.shop.checkout.ui.substitution.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.CheckboxKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.checkout.domain.model.substitution.ProductSubstitute;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductSubstituteItemKt {
    public static final void a(ProductSubstitute productSubstitute, boolean z, Function2 onItemCheckedChange, Composer composer, int i) {
        Intrinsics.h(onItemCheckedChange, "onItemCheckedChange");
        ComposerImpl composerImplV = composer.v(172883850);
        int i2 = i | (composerImplV.n(productSubstitute) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(onItemCheckedChange) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(BackgroundKt.b(SizeKt.e(companion, 1.0f), CoreTheme.b(composerImplV).d.f4838a.b, RectangleShapeKt.f1779a), 16);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierQ = SizeKt.q(companion, 24);
            composerImplV.o(-1633490746);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new l(12, onItemCheckedChange, productSubstitute);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            CheckboxKt.a(z, (Function1) objG, modifierQ, false, null, composerImplV, ((i2 >> 3) & 14) | KyberEngine.KyberPolyBytes, 56);
            float f = 8;
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            SingletonAsyncImageKt.b(productSubstitute.d, "product image", SizeKt.q(companion, 64), PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable, 0, composerImplV), PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable, 0, composerImplV), null, null, null, null, null, null, null, composerImplV, 432, 0, 32736);
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            TextKt.b(productSubstitute.f10661a, null, CoreTheme.b(composerImplV).d.d.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, composerImplV, 0, 0, 65530);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.a(productSubstitute, z, onItemCheckedChange, i, 10);
        }
    }

    public static final void b(List list, Map map, Function2 onItemCheckedChange, Composer composer, int i) {
        Intrinsics.h(onItemCheckedChange, "onItemCheckedChange");
        ComposerImpl composerImplV = composer.v(2136668108);
        int i2 = (composerImplV.I(list) ? 4 : 2) | i | (composerImplV.I(map) ? 32 : 16) | (composerImplV.I(onItemCheckedChange) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
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
            composerImplV.o(1737024100);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                ProductSubstitute productSubstitute = (ProductSubstitute) obj;
                Boolean bool = (Boolean) map.get(productSubstitute.c);
                a(productSubstitute, bool != null ? bool.booleanValue() : false, onItemCheckedChange, composerImplV, i2 & 896);
                composerImplV.o(1737032429);
                if (i4 != CollectionsKt.I(list)) {
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 3, 0L, composerImplV, null);
                }
                composerImplV.V(false);
                i4 = i5;
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(list, map, onItemCheckedChange, i, 26);
        }
    }
}
