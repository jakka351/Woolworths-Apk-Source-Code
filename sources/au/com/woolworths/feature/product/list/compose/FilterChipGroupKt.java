package au.com.woolworths.feature.product.list.compose;

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
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.design.wx.component.FilterChipKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.data.ProductListChip;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterChipGroupKt {
    public static final void a(List list, Function0 onAllFiltersChipClick, Function3 onFilterChipClick, int i, boolean z, String str, Function1 function1, Composer composer, int i2) {
        Function1 function12;
        String str2;
        Function3 function3;
        Intrinsics.h(onAllFiltersChipClick, "onAllFiltersChipClick");
        Intrinsics.h(onFilterChipClick, "onFilterChipClick");
        ComposerImpl composerImplV = composer.v(-409719878);
        int i3 = i2 | (composerImplV.I(list) ? 32 : 16) | (composerImplV.I(onAllFiltersChipClick) ? 256 : 128) | (composerImplV.I(onFilterChipClick) ? 2048 : 1024) | (composerImplV.r(i) ? 16384 : 8192) | (composerImplV.p(z) ? 131072 : 65536) | (composerImplV.n(str) ? 1048576 : 524288) | (composerImplV.I(function1) ? 8388608 : 4194304);
        if ((4793491 & i3) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            function3 = onFilterChipClick;
            str2 = str;
            function12 = function1;
        } else {
            ScrollState scrollStateA = ScrollKt.a(composerImplV);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(ScrollKt.b(companion, scrollStateA, false), 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(8), Alignment.Companion.j, composerImplV, 6);
            int i4 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            function12 = function1;
            str2 = str;
            int i5 = i3;
            Modifier.Companion companion2 = companion;
            AllFiltersChipKt.a(true, z, i > 0 ? String.valueOf(i) : null, onAllFiltersChipClick, null, null, null, null, null, composerImplV, 6 | ((i3 >> 12) & 112) | ((i3 << 3) & 7168), 0, 2032);
            composerImplV.o(-1150216206);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final ProductListChip productListChip = (ProductListChip) it.next();
                boolean z2 = str2 != null && Intrinsics.c(productListChip.getText().getText(), str2);
                composerImplV.o(5004770);
                boolean z3 = (i5 & 29360128) == 8388608;
                Object objG = composerImplV.G();
                Object obj = Composer.Companion.f1624a;
                if (z3 || objG == obj) {
                    objG = new au.com.woolworths.design.wx.component.searchbar.a(1, function12);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                Modifier.Companion companion3 = companion2;
                Modifier modifierB = ConditionalModifierKt.b(companion3, z2, (Function1) objG, null, 4);
                RoundedCornerShape roundedCornerShapeA = RoundedCornerShapeKt.a(50);
                boolean zIsSelected = productListChip.isSelected();
                composerImplV.o(-1633490746);
                int i6 = i5;
                boolean zN = composerImplV.n(productListChip) | ((i6 & 7168) == 2048);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == obj) {
                    objG2 = new androidx.navigation.compose.a(7, onFilterChipClick, productListChip);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                FilterChipKt.a(true, zIsSelected, (Function0) objG2, modifierB, roundedCornerShapeA, 0L, 0L, null, null, null, ComposableLambdaKt.c(-1487323903, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.FilterChipGroupKt$FilterChipGroup$1$1$3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        RowScope FilterChip = (RowScope) obj2;
                        Composer composer2 = (Composer) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Intrinsics.h(FilterChip, "$this$FilterChip");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            composer2.o(5004770);
                            ProductListChip productListChip2 = productListChip;
                            boolean zN2 = composer2.n(productListChip2);
                            Object objG3 = composer2.G();
                            if (zN2 || objG3 == Composer.Companion.f1624a) {
                                objG3 = new androidx.navigation.fragment.e(productListChip2, 15);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            TextKt.b(productListChip2.getText().getText(), SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG3), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).o, composer2, 0, 0, 65532);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 6, 48, 2016);
                i5 = i6;
                companion2 = companion3;
            }
            function3 = onFilterChipClick;
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.d(list, onAllFiltersChipClick, function3, i, z, str2, function12, i2);
        }
    }
}
