package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SelectAlternativeOptionsBottomSheetContentKt {
    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1113677605);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(SizeKt.t(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 16, BitmapDescriptorFactory.HUE_RED, 2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.l, composerImplV, 48);
            int i2 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b("What would you like to do?", PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composerImplV).m, WxTheme.a(composerImplV).h(), TextUnitKt.c(14), null, null, 0L, 0L, null, null, 0, 16777212), composerImplV, 54, 0, 65532);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(i, 25);
        }
    }

    public static final void b(int i, int i2, Composer composer, String str, Function0 function0) {
        int i3;
        ComposerImpl composerImplV = composer.v(1259266092);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.n(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.r(i) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ClickableKt.d(SizeKt.t(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 56, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), false, null, null, function0, 7);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            float f = 16;
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            IconKt.b(VectorResources_androidKt.b(i, (i3 & 112) | 6, composerImplV), null, SizeKt.q(companion, 20), WxTheme.a(composerImplV).f(), composerImplV, 432, 0);
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            TextKt.b(str, null, WxTheme.a(composerImplV).c(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, i3 & 14, 0, 65530);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.a(str, i, function0, i2, 14);
        }
    }

    public static final void c(Function0 onSaveKeepingOriginalClick, Function0 onSaveReplacingOriginalClick, Function0 onAddItemToCartClick, boolean z, Composer composer, int i) {
        int i2;
        Intrinsics.h(onSaveKeepingOriginalClick, "onSaveKeepingOriginalClick");
        Intrinsics.h(onSaveReplacingOriginalClick, "onSaveReplacingOriginalClick");
        Intrinsics.h(onAddItemToCartClick, "onAddItemToCartClick");
        ComposerImpl composerImplV = composer.v(-991986038);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onSaveKeepingOriginalClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onSaveReplacingOriginalClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onAddItemToCartClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            a(composerImplV, 6);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 3, 0L, composerImplV, null);
            b(R.drawable.ic_shop_lists_replace, ((i2 << 3) & 896) | 6, composerImplV, "Save and replace original", onSaveReplacingOriginalClick);
            b(R.drawable.ic_shop_lists_save, ((i2 << 6) & 896) | 6, composerImplV, "Save and keep original", onSaveKeepingOriginalClick);
            composerImplV.o(41253768);
            if (z) {
                b(R.drawable.ic_shop_lists_add_to_cart, (i2 & 896) | 6, composerImplV, "Add item to cart", onAddItemToCartClick);
            }
            android.support.v4.media.session.a.C(composerImplV, false, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(i, 14, onSaveKeepingOriginalClick, onSaveReplacingOriginalClick, onAddItemToCartClick, z);
        }
    }
}
