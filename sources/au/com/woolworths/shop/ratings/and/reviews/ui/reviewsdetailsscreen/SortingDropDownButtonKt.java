package au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ratings-and-reviews_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SortingDropDownButtonKt {
    public static final void a(int i, Composer composer, final List list, Function0 onDismissRequest, final Function1 onSortOptionSelected, boolean z) {
        Intrinsics.h(onDismissRequest, "onDismissRequest");
        Intrinsics.h(onSortOptionSelected, "onSortOptionSelected");
        ComposerImpl composerImplV = composer.v(-1600369057);
        int i2 = i | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(onSortOptionSelected) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            AndroidMenu_androidKt.a(z, onDismissRequest, null, 0L, null, null, ComposableLambdaKt.c(547754194, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.SortingDropDownButtonKt$SortOptionDropDownMenu$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope DropdownMenu = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(DropdownMenu, "$this$DropdownMenu");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        for (final SortingOption sortingOption : list) {
                            composer2.o(-1633490746);
                            Function1 function1 = onSortOptionSelected;
                            boolean zN = composer2.n(function1) | composer2.r(sortingOption.ordinal());
                            Object objG = composer2.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new au.com.woolworths.shop.checkout.ui.details.c(22, function1, sortingOption);
                                composer2.A(objG);
                            }
                            composer2.l();
                            AndroidMenu_androidKt.b((Function0) objG, null, false, null, ComposableLambdaKt.c(-1724028719, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.SortingDropDownButtonKt$SortOptionDropDownMenu$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    RowScope DropdownMenuItem = (RowScope) obj4;
                                    Composer composer3 = (Composer) obj5;
                                    int iIntValue2 = ((Number) obj6).intValue();
                                    Intrinsics.h(DropdownMenuItem, "$this$DropdownMenuItem");
                                    if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        TextKt.a(sortingOption.d, CoreTheme.f(composer3).f5120a.b.f5123a, null, 0L, null, 0, 0, false, 0, null, composer3, 0, 1020);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 196608);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 14) | 1572912, 60);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(list, z, onDismissRequest, onSortOptionSelected, i, 5);
        }
    }

    public static final void b(Function0 onDropDownClicked, final SortingOption selectedSortOption, Composer composer, int i) {
        Intrinsics.h(onDropDownClicked, "onDropDownClicked");
        Intrinsics.h(selectedSortOption, "selectedSortOption");
        ComposerImpl composerImplV = composer.v(114260587);
        int i2 = (composerImplV.I(onDropDownClicked) ? 4 : 2) | i | (composerImplV.r(selectedSortOption.ordinal()) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = BackgroundKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.b, Alignment.Companion.k, composerImplV, 54);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ButtonKt.c(onDropDownClicked, null, false, null, null, null, null, null, ComposableLambdaKt.c(2086079116, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.SortingDropDownButtonKt$SortingDropDownButton$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope TextButton = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(TextButton, "$this$TextButton");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.a(selectedSortOption.e, CoreTheme.f(composer2).e.b.b, null, CoreTheme.b(composer2).e.c.f4854a, null, 0, 0, false, 0, null, composer2, 0, 1012);
                        IconKt.b(KeyboardArrowDownKt.a(), "", Modifier.Companion.d, CoreTheme.b(composer2).e.c.f4854a, composer2, 432, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 14) | 805306368, 510);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.productcard.ui.components.b(onDropDownClicked, i, 3, selectedSortOption);
        }
    }
}
