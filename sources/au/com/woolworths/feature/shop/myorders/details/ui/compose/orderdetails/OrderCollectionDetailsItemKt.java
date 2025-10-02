package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderCollectionDetailsItemKt {
    public static final void a(String str, String str2, String str3, Modifier modifier, OrderCollectionParkingDetails orderCollectionParkingDetails, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Function0 function02;
        int i4;
        Function0 function03;
        ComposerImpl composerImpl;
        Function0 function04;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(2137357906);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(str3) ? 256 : 128;
        }
        int i5 = i3 | 3072 | (composerImplV.I(orderCollectionParkingDetails) ? 16384 : 8192);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i4 = i5 | 196608;
            function02 = function0;
        } else {
            function02 = function0;
            i4 = i5 | (composerImplV.I(function02) ? 131072 : 65536);
        }
        if ((74899 & i4) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
            function04 = function02;
        } else {
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i6 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$1) {
                    objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                    composerImplV.A(objG);
                }
                function03 = (Function0) objG;
                composerImplV.V(false);
            } else {
                function03 = function02;
            }
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), PrimitiveResources_androidKt.a(composerImplV, R.dimen.default_padding), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, PrimitiveResources_androidKt.a(composerImplV, R.dimen.one_and_half_padding), 6);
            composerImplV.o(-1746271574);
            int i7 = 458752 & i4;
            boolean zI = composerImplV.I(orderCollectionParkingDetails) | ((i4 & 896) == 256) | (i7 == 131072);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new androidx.lifecycle.compose.b(22, orderCollectionParkingDetails, str3, function03);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierJ, true, (Function1) objG2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function05 = ComposeUiNode.Companion.b;
            composerImplV.i();
            int i9 = i4;
            if (composerImplV.O) {
                composerImplV.K(function05);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            Modifier modifierB2 = rowScopeInstance.b(companion, vertical);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i10 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function05);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                androidx.camera.core.impl.b.B(i10, composerImplV, i10, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, i9 & 14, 0, 65534);
            TextKt.b(str2, null, WxTheme.a(composerImplV).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, (i9 >> 3) & 14, 0, 65530);
            composerImpl = composerImplV;
            composerImpl.V(true);
            SpacerKt.a(composerImpl, rowScopeInstance.a(companion, 1.0f, true));
            composerImpl.o(478720510);
            if (orderCollectionParkingDetails != null) {
                Modifier modifierG = PaddingKt.g(rowScopeInstance.b(companion, vertical), PrimitiveResources_androidKt.a(composerImpl, R.dimen.default_padding), PrimitiveResources_androidKt.a(composerImpl, R.dimen.quarter_default_padding));
                composerImpl.o(5004770);
                boolean z = i7 == 131072;
                Object objG3 = composerImpl.G();
                if (z || objG3 == composer$Companion$Empty$1) {
                    objG3 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(26, function03);
                    composerImpl.A(objG3);
                }
                composerImpl.V(false);
                Modifier modifierD3 = ClickableKt.d(modifierG, false, null, null, (Function0) objG3, 7);
                composerImpl.o(1849434622);
                Object objG4 = composerImpl.G();
                if (objG4 == composer$Companion$Empty$1) {
                    objG4 = new au.com.woolworths.feature.shop.modeselector.ui.c(28);
                    composerImpl.A(objG4);
                }
                composerImpl.V(false);
                Modifier modifierB3 = SemanticsModifierKt.b(modifierD3, false, (Function1) objG4);
                long jE = TextUnitKt.e(llqqqql.a00610061aaaa, 14.0f);
                TextKt.b(str3 == null ? "" : str3, modifierB3, WxTheme.a(composerImpl).h(), jE, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerImpl, 0, 0, 131056);
                composerImpl = composerImpl;
            }
            composerImpl.V(false);
            composerImpl.V(true);
            function04 = function03;
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.a(str, str2, str3, modifier2, orderCollectionParkingDetails, function04, i, i2, 6);
        }
    }
}
