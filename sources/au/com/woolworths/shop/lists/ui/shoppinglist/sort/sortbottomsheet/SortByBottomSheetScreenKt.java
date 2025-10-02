package au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SortByBottomSheetScreenKt {
    public static final void a(SortByBottomSheetContract.ViewState viewState, final Function1 onSelected, Composer composer, int i) {
        final SortByBottomSheetContract.ViewState viewState2 = viewState;
        Intrinsics.h(viewState2, "viewState");
        Intrinsics.h(onSelected, "onSelected");
        ComposerImpl composerImplV = composer.v(-25825611);
        int i2 = i | (composerImplV.n(viewState2) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onSelected) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierH = PaddingKt.h(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, 1);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
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
            int i4 = i2;
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.shop_lists_sort_by_title), PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, 48, 0, 65532);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composerImplV, PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, 8, 1));
            composerImplV = composerImplV;
            Modifier modifierH2 = PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(-1633490746);
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                viewState2 = viewState;
                objG = new Function1() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        for (final SortBy sortBy : CollectionsKt.G0(SortBy.j)) {
                            final Function1 function1 = onSelected;
                            final SortByBottomSheetContract.ViewState viewState3 = viewState2;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetScreenKt$SortByBottomSheetScreen$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                                        composer2.o(-1633490746);
                                        final Function1 function12 = function1;
                                        boolean zN = composer2.n(function12);
                                        final SortBy sortBy2 = sortBy;
                                        boolean zR = zN | composer2.r(sortBy2.ordinal());
                                        Object objG2 = composer2.G();
                                        if (zR || objG2 == Composer.Companion.f1624a) {
                                            objG2 = new Function0() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.c
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function12.invoke(sortBy2);
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(objG2);
                                        }
                                        composer2.l();
                                        Modifier modifierH3 = PaddingKt.h(ClickableKt.d(modifierE, false, null, null, (Function0) objG2, 7), BitmapDescriptorFactory.HUE_RED, 14, 1);
                                        String strC = StringResources_androidKt.c(composer2, sortBy2.d);
                                        TextStyle textStyle = WxTheme.b(composer2).n;
                                        composer2.o(1427057325);
                                        long jH = viewState3.f12446a == sortBy2 ? WxTheme.a(composer2).h() : Color.k;
                                        composer2.l();
                                        TextKt.b(strC, modifierH3, jH, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 65528);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -1321418600), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            } else {
                viewState2 = viewState;
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierH2, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 6, 510);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(viewState2, i, 3, onSelected);
        }
    }
}
