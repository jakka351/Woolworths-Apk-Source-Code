package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.component.FilterChipKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.data.SortOption;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsSortOptionItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterSortItemKt {
    public static final void a(final ProductListOptionsSortOptionItem item, Function0 onGetVisibleSortOptions, Function1 onSortOptionSelected, Composer composer, int i) {
        Intrinsics.h(item, "item");
        Intrinsics.h(onGetVisibleSortOptions, "onGetVisibleSortOptions");
        Intrinsics.h(onSortOptionSelected, "onSortOptionSelected");
        ComposerImpl composerImplV = composer.v(194464048);
        int i2 = (composerImplV.n(item) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onGetVisibleSortOptions) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onSortOptionSelected) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = item instanceof ProductListOptionsSortOptionItem.SortOptionItem;
            Modifier.Companion companion = Modifier.Companion.d;
            if (z) {
                composerImplV.o(-632102772);
                Modifier modifierA = AspectRatioKt.a(companion, 3.8f);
                boolean zIsApplied = ((ProductListOptionsSortOptionItem.SortOptionItem) item).f5398a.isApplied();
                composerImplV.o(-1633490746);
                boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                Object objG = composerImplV.G();
                if (z2 || objG == Composer.Companion.f1624a) {
                    objG = new androidx.navigation.compose.a(10, onSortOptionSelected, item);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                FilterChipKt.a(true, zIsApplied, (Function0) objG, modifierA, null, 0L, 0L, null, null, null, ComposableLambdaKt.c(-1201037943, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.FilterSortItemKt$FilterSortItem$2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Composer composer2;
                        RowScope FilterChip = (RowScope) obj;
                        Composer composer3 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(FilterChip, "$this$FilterChip");
                        if ((iIntValue & 17) == 16 && composer3.c()) {
                            composer3.j();
                        } else {
                            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer3, 48);
                            int p = composer3.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                            Modifier modifierD = ComposedModifierKt.d(composer3, modifierE);
                            ComposeUiNode.e3.getClass();
                            Function0 function0 = ComposeUiNode.Companion.b;
                            if (composer3.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer3.i();
                            if (composer3.getO()) {
                                composer3.K(function0);
                            } else {
                                composer3.e();
                            }
                            Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer3, p, function2);
                            }
                            Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                            SortOption sortOption = ((ProductListOptionsSortOptionItem.SortOptionItem) item).f5398a;
                            TextKt.b(sortOption.getTitle(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).o, composer3, 0, 0, 65534);
                            String subtitle = sortOption.getSubtitle();
                            composer3.o(-785723587);
                            if (subtitle == null) {
                                composer2 = composer3;
                            } else {
                                composer2 = composer3;
                                TextKt.b(sortOption.getSubtitle(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).r, composer2, 0, 0, 65534);
                            }
                            composer2.l();
                            composer2.f();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 3078, 48, 2032);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else {
                if (!(item instanceof ProductListOptionsSortOptionItem.SortOptionsToggleItem)) {
                    throw au.com.woolworths.android.onesite.a.w(-2098602035, composerImplV, false);
                }
                composerImplV.o(-631084236);
                FilterChipKt.a(true, false, onGetVisibleSortOptions, AspectRatioKt.a(companion, 3.8f), null, 0L, 0L, null, null, null, ComposableLambdaKt.c(1685897010, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.filter.FilterSortItemKt$FilterSortItem$3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        RowScope FilterChip = (RowScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(FilterChip, "$this$FilterChip");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                            TextKt.b(StringResources_androidKt.c(composer2, ((ProductListOptionsSortOptionItem.SortOptionsToggleItem) item).f5399a), modifierE, WxTheme.a(composer2).h(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).o, composer2, 48, 0, 65016);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, ((i2 << 3) & 896) | 3126, 48, 2032);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(item, onGetVisibleSortOptions, onSortOptionSelected, i, 18);
        }
    }
}
