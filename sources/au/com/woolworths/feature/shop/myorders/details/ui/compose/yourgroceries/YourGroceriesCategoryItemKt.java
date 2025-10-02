package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.compose.utils.modifier.BorderModifierKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesCategoryItemKt {
    public static final void a(String str, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        ComposerImpl composerImplV = composer.v(1462869253);
        int i4 = (composerImplV.n(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (composerImplV.p(z2) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z3 = i5 != 0 ? false : z2;
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            float f2 = 8;
            Modifier modifierA = BorderModifierKt.a(BackgroundKt.b(PaddingKt.j(SizeKt.e(companion, 1.0f), f, z3 ? 24 : 0, f, BitmapDescriptorFactory.HUE_RED, 8), CoreTheme.b(composerImplV).e.f4848a.d, RoundedCornerShapeKt.d(f2, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12)), CoreTheme.b(composerImplV).e.b.e, f2, false, 58);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.f(SizeKt.e(companion, 1.0f), f), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, (i3 & 14) | KyberEngine.KyberPolyBytes, 1008);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composerImplV).e.b.e, composerImplV, null);
            composerImplV.V(true);
            z2 = z3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, i, i2, z2);
        }
    }
}
