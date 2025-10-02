package au.com.woolworths.feature.product.list.legacy.compose;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.navigation.fragment.e;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.design.wx.component.FilterChipKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.legacy.data.ProductListChip;
import au.com.woolworths.shared.ui.compose.filter.AllFiltersChipKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterChipGroupKt {
    public static final void a(boolean z, List list, Function0 onAllFiltersChipClick, Function3 onFilterChipClick, int i, boolean z2, String str, Function1 function1, Composer composer, int i2) {
        String str2;
        int i3;
        Intrinsics.h(onAllFiltersChipClick, "onAllFiltersChipClick");
        Intrinsics.h(onFilterChipClick, "onFilterChipClick");
        ComposerImpl composerImplV = composer.v(-2123893119);
        int i4 = i2 | (composerImplV.p(z) ? 4 : 2) | (composerImplV.I(list) ? 32 : 16) | (composerImplV.I(onAllFiltersChipClick) ? 256 : 128) | (composerImplV.I(onFilterChipClick) ? 2048 : 1024) | (composerImplV.r(i) ? 16384 : 8192) | (composerImplV.p(z2) ? 131072 : 65536) | (composerImplV.n(str) ? 1048576 : 524288) | (composerImplV.I(function1) ? 8388608 : 4194304);
        if ((4793491 & i4) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            str2 = str;
        } else {
            ScrollState scrollStateA = ScrollKt.a(composerImplV);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(ScrollKt.b(companion, scrollStateA, false), 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(8), Alignment.Companion.j, composerImplV, 6);
            int i5 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int i6 = i4 & 14;
            int i7 = i4;
            str2 = str;
            int i8 = 8388608;
            AllFiltersChipKt.a(z, z2, i > 0 ? String.valueOf(i) : null, onAllFiltersChipClick, null, null, null, null, null, composerImplV, i6 | ((i4 >> 12) & 112) | ((i4 << 3) & 7168), 0, 2032);
            composerImplV.o(1070136856);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final ProductListChip productListChip = (ProductListChip) it.next();
                Modifier modifierA = TestTagKt.a(companion, "productListFilterChip");
                boolean z3 = str2 != null && Intrinsics.c(productListChip.c.f5353a, str2);
                composerImplV.o(5004770);
                boolean z4 = (i7 & 29360128) == i8;
                Object objG = composerImplV.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (z4 || objG == composer$Companion$Empty$1) {
                    i3 = 4;
                    objG = new au.com.woolworths.design.wx.component.searchbar.a(4, function1);
                    composerImplV.A(objG);
                } else {
                    i3 = 4;
                }
                composerImplV.V(false);
                Modifier modifierB = ConditionalModifierKt.b(modifierA, z3, (Function1) objG, null, i3);
                RoundedCornerShape roundedCornerShapeA = RoundedCornerShapeKt.a(50);
                boolean z5 = true;
                boolean z6 = productListChip.b;
                composerImplV.o(-1633490746);
                int i9 = i7;
                if ((i9 & 7168) != 2048) {
                    z5 = false;
                }
                boolean zN = z5 | composerImplV.n(productListChip);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    objG2 = new androidx.navigation.compose.a(14, onFilterChipClick, productListChip);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                ComposerImpl composerImpl = composerImplV;
                FilterChipKt.a(z, z6, (Function0) objG2, modifierB, roundedCornerShapeA, 0L, 0L, null, null, null, ComposableLambdaKt.c(762394458, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.FilterChipGroupKt$FilterChipGroup$1$1$3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        RowScope FilterChip = (RowScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(FilterChip, "$this$FilterChip");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            composer2.o(5004770);
                            ProductListChip productListChip2 = productListChip;
                            boolean zN2 = composer2.n(productListChip2);
                            Object objG3 = composer2.G();
                            if (zN2 || objG3 == Composer.Companion.f1624a) {
                                objG3 = new e(productListChip2, 17);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            TextKt.b(productListChip2.c.f5353a, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG3), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).o, composer2, 0, 0, 65532);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImpl, i6, 48, 2016);
                i7 = i9;
                composerImplV = composerImpl;
                i8 = 8388608;
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(z, list, onAllFiltersChipClick, onFilterChipClick, i, z2, str2, function1, i2);
        }
    }
}
