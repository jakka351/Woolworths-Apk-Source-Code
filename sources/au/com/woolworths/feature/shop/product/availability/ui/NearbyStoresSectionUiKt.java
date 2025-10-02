package au.com.woolworths.feature.shop.product.availability.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.editorder.review.components.a;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.feature.shop.product.availability.domain.StoreProductAvailabilityData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-availability_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class NearbyStoresSectionUiKt {
    public static final void a(StoreProductAvailabilityData storeProductAvailabilityData, Function1 function1, Modifier modifier, Composer composer, int i) {
        boolean z;
        Function1 function12;
        boolean z2;
        ComposerImpl composerImplV = composer.v(92733311);
        int i2 = i | (composerImplV.n(storeProductAvailabilityData) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function12 = function1;
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$SpaceBetween$1, vertical, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(4);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(rowScopeInstance.a(companion, 1.0f, true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 11);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(spacedAlignedG, Alignment.Companion.m, composerImplV, 6);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.a(storeProductAvailabilityData.b, CoreTheme.f(composerImplV).f5120a.f5121a.b, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 2, false, 1, null, composerImplV, 102236160, 692);
            TextKt.a(storeProductAvailabilityData.c, CoreTheme.f(composerImplV).f5120a.b.f5123a, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 2, false, 1, null, composerImplV, 102236160, 692);
            Double d = storeProductAvailabilityData.d.f7994a;
            composerImplV.o(201249715);
            if (d == null) {
                function12 = function1;
                z = false;
                z2 = true;
            } else {
                double dDoubleValue = d.doubleValue();
                RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.f934a, vertical, composerImplV, 48);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, companion);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA2, function2);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    b.B(i5, composerImplV, i5, function23);
                }
                Updater.b(composerImplV, modifierD3, function24);
                z = false;
                TextKt.a(dDoubleValue + " km", CoreTheme.f(composerImplV).f5120a.b.b, SizeKt.w(companion, 64, BitmapDescriptorFactory.HUE_RED, 2), CoreTheme.b(composerImplV).e.d.b, null, 0, 2, false, 1, null, composerImplV, 102236544, 688);
                composerImplV.o(-1633490746);
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objG = composerImplV.G();
                if (z3 || objG == Composer.Companion.f1624a) {
                    function12 = function1;
                    objG = new f(8, function12, storeProductAvailabilityData);
                    composerImplV.A(objG);
                } else {
                    function12 = function1;
                }
                composerImplV.V(false);
                c(0, composerImplV, null, (Function0) objG);
                z2 = true;
                composerImplV.V(true);
            }
            composerImplV.V(z);
            composerImplV.V(z2);
            if (storeProductAvailabilityData.e) {
                composerImplV.o(-1695854812);
                ThemeKt.b(6, composerImplV, ComposableSingletons$NearbyStoresSectionUiKt.b);
                composerImplV.V(z);
            } else {
                composerImplV.o(-1695758526);
                ThemeKt.b(6, composerImplV, ComposableSingletons$NearbyStoresSectionUiKt.c);
                composerImplV.V(z);
            }
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(storeProductAvailabilityData, function12, modifier, i, 4);
        }
    }

    public static final void b(List list, Function1 onStoreDetailsClick, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(onStoreDetailsClick, "onStoreDetailsClick");
        ComposerImpl composerImplV = composer.v(-723631981);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onStoreDetailsClick) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(-1633490746);
            boolean zI = ((i3 & 112) == 32) | composerImplV.I(list);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new a(2, list, onStoreDetailsClick);
                composerImplV.A(objG);
            }
            Function1 function1 = (Function1) objG;
            composerImplV.V(false);
            modifier2 = Modifier.Companion.d;
            LazyDslKt.b(modifier2, null, null, false, null, null, null, false, null, function1, composerImplV, 6, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons.a(list, onStoreDetailsClick, modifier2, i);
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(1807292219);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(5004770);
            boolean z = (i3 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new k(4, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ClickableKt.d(companion, false, null, null, (Function0) objG, 7);
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
                b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            modifier2 = companion;
            androidx.compose.material.TextKt.b(StringResources_androidKt.c(composerImplV, R.string.button_label_store_details), RowScopeInstance.f974a.a(companion, 1.0f, false), CoreTheme.b(composerImplV).f4782a.d.b.f4798a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.c.b, composerImplV, 0, 0, 65528);
            Modifier modifierK = SizeKt.k(modifier2, 16);
            ImageVector imageVector = CoreTheme.e(composerImplV).e.n;
            long j = CoreTheme.b(composerImplV).f4782a.d.b.f4798a;
            composerImplV = composerImplV;
            IconKt.b(imageVector, null, modifierK, j, composerImplV, 432, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(function0, modifier2, i, 4);
        }
    }
}
