package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ItemCheckoutProductKt {
    public static final void a(String str, String str2, String str3, String str4, Function0 onDeleteTap, Composer composer, int i) {
        int i2;
        Function2 function2;
        ComposerImpl composerImpl;
        Intrinsics.h(onDeleteTap, "onDeleteTap");
        ComposerImpl composerImplV = composer.v(-1753247649);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onDeleteTap) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierI = PaddingKt.i(companion, f, 12, f, 4);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.j;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierI);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            int i4 = i2;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function25);
            Painter painterA = PainterResources_androidKt.a(R.drawable.ic_campaign_default, 0, composerImplV);
            SingletonAsyncImageKt.b(str, "product image", SizeKt.q(companion, 64), painterA, painterA, null, null, null, null, null, null, null, composerImplV, (i4 & 14) | 432, 0, 32736);
            SpacerKt.a(composerImplV, SizeKt.u(companion, 8));
            Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$SpaceBetween$1, Alignment.Companion.m, composerImplV, 6);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function24);
            }
            Updater.b(composerImplV, modifierD2, function25);
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$SpaceBetween$1, vertical, composerImplV, 54);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierE);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA2, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function24);
            }
            Updater.b(composerImplV, modifierD3, function25);
            TextKt.b(str2, RowScopeInstance.f974a.a(companion, 1.0f, true), CoreTheme.b(composerImplV).d.d.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, composerImplV, (i4 >> 3) & 14, 0, 65528);
            float f2 = 24;
            int i7 = i4 >> 6;
            IconButtonKt.c(CoreTheme.e(composerImplV).f4879a.b, "delete", onDeleteTap, SizeKt.q(PaddingKt.j(companion, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 6), f2), false, null, CoreTheme.b(composerImplV).f4782a.c.f4791a.f4792a, composerImplV, (i7 & 896) | 3120, 48);
            composerImplV.V(true);
            Modifier modifierE2 = SizeKt.e(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(arrangement$SpaceBetween$1, Alignment.Companion.l, composerImplV, 54);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierE2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA3, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                function2 = function24;
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function2);
            } else {
                function2 = function24;
            }
            Updater.b(composerImplV, modifierD4, function25);
            TextKt.b(str3, null, CoreTheme.b(composerImplV).d.d.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, composerImplV, i7 & 14, 0, 65530);
            composerImpl = composerImplV;
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.c, Alignment.Companion.o, composerImpl, 48);
            int i9 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImpl.Q();
            Modifier modifierD5 = ComposedModifierKt.d(composerImpl, companion);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function0);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, columnMeasurePolicyA2, function22);
            Updater.b(composerImpl, persistentCompositionLocalMapQ5, function23);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i9))) {
                androidx.camera.core.impl.b.B(i9, composerImpl, i9, function2);
            }
            Updater.b(composerImpl, modifierD5, function25);
            TextKt.b(StringResources_androidKt.c(composerImpl, R.string.checkout_product_total), null, CoreTheme.b(composerImpl).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).b.f5125a.f5126a, composerImpl, 0, 0, 65530);
            TextKt.b(str4, null, CoreTheme.b(composerImpl).d.d.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).f5120a.f5121a.b, composerImpl, (i4 >> 9) & 14, 0, 65530);
            composerImpl.V(true);
            composerImpl.V(true);
            composerImpl.V(true);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(str, str2, str3, str4, onDeleteTap, i, 2);
        }
    }
}
