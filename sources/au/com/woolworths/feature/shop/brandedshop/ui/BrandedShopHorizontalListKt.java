package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BrandedShopHorizontalListKt {
    public static final void a(HorizontalListData horizontalListData, au.com.woolworths.design.wx.component.searchbar.a aVar, au.com.woolworths.design.wx.component.searchbar.a aVar2, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1081219571);
        int i2 = i | (composerImplV.I(horizontalListData) ? 4 : 2) | (composerImplV.I(aVar) ? 32 : 16) | (composerImplV.I(aVar2) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 8;
            float f2 = 16;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f2, 5);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
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
            composerImplV.o(-1097673662);
            if (horizontalListData.b.length() > 0) {
                b(horizontalListData, aVar2, composerImplV, 8 | (i2 & 14) | ((i2 >> 3) & 112));
                SpacerKt.c(ColumnScopeInstance.f948a, f, composerImplV, 54);
            }
            composerImplV.V(false);
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = au.com.woolworths.dynamic.page.ui.content.d.f(composerImplV);
            }
            SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objG;
            composerImplV.V(false);
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f2);
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(f2, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(-1746271574);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4 || composerImplV.I(horizontalListData));
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new g(0, horizontalListData, aVar, sharedIntrinsicHeightState);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            LazyDslKt.d(modifierE, lazyListStateA, paddingValuesImplA, false, spacedAlignedG, null, null, false, null, (Function1) objG2, composerImplV, 24966, 488);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 1, horizontalListData, aVar, aVar2);
        }
    }

    public static final void b(HorizontalListData horizontalListData, au.com.woolworths.design.wx.component.searchbar.a aVar, Composer composer, int i) {
        boolean z;
        ComposerImpl composerImplV = composer.v(1276611341);
        int i2 = (composerImplV.I(horizontalListData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(aVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(SizeKt.e(companion, 1.0f), 16, 0);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.k, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
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
            int i4 = i2;
            TextKt.b(horizontalListData.b, RowScopeInstance.f974a.a(companion, 1.0f, true), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImplV).i, composerImplV, 0, 3120, 55292);
            composerImplV = composerImplV;
            String str = horizontalListData.c;
            composerImplV.o(-1818855637);
            if (str == null) {
                z = true;
            } else {
                composerImplV.o(-1633490746);
                boolean z2 = ((i4 & 112) == 32) | ((i4 & 14) == 4 || composerImplV.I(horizontalListData));
                Object objG = composerImplV.G();
                if (z2 || objG == Composer.Companion.f1624a) {
                    objG = new f(3, horizontalListData, aVar);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                z = true;
                TertiaryButtonKt.a(str, (Function0) objG, null, false, false, PaddingKt.a(BitmapDescriptorFactory.HUE_RED, 8, 1), str, composerImplV, 196608, 28);
            }
            composerImplV.V(false);
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(horizontalListData, i, 19, aVar);
        }
    }
}
