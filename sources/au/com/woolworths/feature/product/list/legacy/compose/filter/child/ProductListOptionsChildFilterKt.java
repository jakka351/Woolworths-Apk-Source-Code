package au.com.woolworths.feature.product.list.legacy.compose.filter.child;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.CheckboxKt;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.state.ToggleableState;
import androidx.lifecycle.compose.c;
import androidx.lifecycle.f;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.product.list.legacy.compose.filter.FilterTextWithCountKt;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListOptionsChildFilterKt {
    public static final void a(FilterMenuItem filterMenuItem, Function1 onFilterOptionClicked, Function2 onFilterCheckboxStateChanged, Composer composer, int i) {
        boolean z = filterMenuItem.h;
        Intrinsics.h(onFilterOptionClicked, "onFilterOptionClicked");
        Intrinsics.h(onFilterCheckboxStateChanged, "onFilterCheckboxStateChanged");
        ComposerImpl composerImplV = composer.v(-1207651860);
        int i2 = (composerImplV.I(filterMenuItem) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onFilterOptionClicked) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onFilterCheckboxStateChanged) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(filterMenuItem);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new f(11, (Object) filterMenuItem, onFilterOptionClicked);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierH = PaddingKt.h(ConditionalModifierKt.b(modifierE, z, (Function1) objG, null, 4), BitmapDescriptorFactory.HUE_RED, 2, 1);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 24;
            Modifier modifierQ = SizeKt.q(PaddingKt.g(ScaleKt.a(companion, 0.85f), 12, 8), f);
            ToggleableState toggleableState = filterMenuItem.i;
            composerImplV.o(-1633490746);
            boolean zI2 = ((i2 & 896) == 256) | composerImplV.I(filterMenuItem);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new androidx.navigation.compose.a(18, onFilterCheckboxStateChanged, filterMenuItem);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            CheckboxKt.c(toggleableState, (Function0) objG2, modifierQ, false, null, composerImplV, KyberEngine.KyberPolyBytes, 56);
            FilterTextWithCountKt.a(filterMenuItem.f, filterMenuItem.j, 0L, composerImplV, 6);
            composerImplV = composerImplV;
            composerImplV.o(1878475712);
            if (z) {
                ImageKt.b(KeyboardArrowRightKt.a(), SizeKt.q(companion, f), ColorFilter.Companion.a(ToneColors.f), composerImplV, 432, 56);
                composerImplV = composerImplV;
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(i, 25, filterMenuItem, onFilterCheckboxStateChanged, onFilterOptionClicked);
        }
    }
}
