package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkState;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.e;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.buyagain.domain.BuyAgainHeader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-buy-again_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainHeaderKt {
    public static final void a(BuyAgainHeader buyAgainHeader, List list, boolean z, CoachMarkState filterCoachMarkState, Modifier modifier, Function1 onChipClick, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.h(filterCoachMarkState, "filterCoachMarkState");
        Intrinsics.h(onChipClick, "onChipClick");
        ComposerImpl composerImplV = composer.v(1411302681);
        int i4 = (composerImplV.n(buyAgainHeader) ? 4 : 2) | i | (composerImplV.I(list) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.p(z) ? 256 : 128;
        }
        int i5 = i4 | (composerImplV.n(filterCoachMarkState) ? 2048 : 1024);
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i5 | (composerImplV.n(modifier2) ? 16384 : 8192);
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(onChipClick) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifier4 = i6 != 0 ? companion : modifier2;
            Modifier modifierB = BackgroundKt.b(modifier4, CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(4), Alignment.Companion.m, composerImplV, 6);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            composerImplV.o(1026530351);
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            Modifier modifier5 = modifier4;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            FilterChipsKt.a(list, onChipClick, z, filterCoachMarkState, null, composerImplV, (i3 & 7168) | ((i3 >> 12) & 112) | (i3 & 896));
            composerImplV.V(true);
            composerImplV.V(false);
            Modifier modifierJ = PaddingKt.j(companion, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, 6);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i9 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i9))) {
                androidx.camera.core.impl.b.B(i9, composerImplV, i9, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            TextKt.a(buyAgainHeader.f10255a, CoreTheme.f(composerImplV).f5120a.c.b, null, Color.b(CoreTheme.b(composerImplV).e.d.d, z ? BitmapDescriptorFactory.HUE_RED : 1.0f), null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            composerImplV = composerImplV;
            composerImplV.o(1864307495);
            if (z) {
                ProductTileSkeletonKt.d(null, composerImplV, 0);
            }
            android.support.v4.media.session.a.C(composerImplV, false, true, true);
            modifier3 = modifier5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(buyAgainHeader, list, z, filterCoachMarkState, modifier3, onChipClick, i, i2);
        }
    }
}
