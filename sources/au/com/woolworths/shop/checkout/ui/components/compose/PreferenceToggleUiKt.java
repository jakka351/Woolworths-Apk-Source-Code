package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.SwitchColors;
import androidx.compose.material.SwitchDefaults;
import androidx.compose.material.SwitchKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PreferenceToggleUiKt {
    public static final void a(String str, String str2, String str3, boolean z, boolean z2, Function1 onClick, Composer composer, int i) {
        int i2;
        long jD;
        long jD2;
        ComposerImpl composerImpl;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-1511310837);
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
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.p(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onClick) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            SwitchColors switchColorsA = SwitchDefaults.a(WxTheme.a(composerImplV).h(), composerImplV, 1022);
            if (z) {
                composerImplV.o(-670757230);
                jD = WxTheme.a(composerImplV).c();
            } else {
                composerImplV.o(-670756166);
                jD = WxTheme.a(composerImplV).d();
            }
            composerImplV.V(false);
            if (z) {
                composerImplV.o(-670753349);
                jD2 = WxTheme.a(composerImplV).f();
            } else {
                composerImplV.o(-670752006);
                jD2 = WxTheme.a(composerImplV).d();
            }
            composerImplV.V(false);
            long j = jD2;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
            TextKt.b(str, PaddingKt.j(companion, f, f, f, BitmapDescriptorFactory.HUE_RED, 8), jD, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, (i2 & 14) | 48, 0, 65528);
            long j2 = jD;
            float f2 = 8;
            int i4 = i2;
            TextKt.b(str2, PaddingKt.j(companion, f, f2, f, BitmapDescriptorFactory.HUE_RED, 8), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, ((i2 >> 3) & 14) | 48, 0, 65528);
            Modifier modifierI = PaddingKt.i(SizeKt.e(ToggleableKt.b(companion, z2, z, new Role(1), onClick), 1.0f), f, f2, f, 12);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierI);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.b(str3, RowScopeInstance.f974a.a(companion, 1.0f, true), j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, (i4 >> 6) & 14, 0, 65528);
            SwitchKt.a(z2, null, null, z, switchColorsA, composerImplV, ((i4 >> 12) & 14) | 48 | (i4 & 7168), 20);
            composerImpl = composerImplV;
            composerImpl.V(true);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.aem.components.ui.downloadableAsset.a(str, str2, str3, z, z2, onClick, i);
        }
    }
}
