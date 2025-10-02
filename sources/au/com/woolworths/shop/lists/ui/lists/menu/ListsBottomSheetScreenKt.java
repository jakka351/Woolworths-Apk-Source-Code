package au.com.woolworths.shop.lists.ui.lists.menu;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.RippleKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.ListTitleRowKt;
import au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetContract;
import au.com.woolworths.shop.lists.ui.utils.MenuItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListsBottomSheetScreenKt {
    public static final void a(final ListsBottomSheetContract.ViewState viewState, final Function1 onMenuItemClick, Composer composer, final int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onMenuItemClick, "onMenuItemClick");
        ComposerImpl composerImplV = composer.v(893500399);
        int i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onMenuItemClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ShoppingListWithItems shoppingListWithItems = viewState.b;
            if (shoppingListWithItems == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    ListsBottomSheetScreenKt.a(viewState, onMenuItemClick, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    ListsBottomSheetScreenKt.a(viewState, onMenuItemClick, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            Modifier modifierH = PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, 8, 1);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ListTitleRowKt.a(shoppingListWithItems, null, null, null, composerImplV, 0, 14);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(viewState);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        for (final MenuItem menuItem : viewState.f12327a) {
                            final Function1 function1 = onMenuItemClick;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetScreenKt$ListsBottomSheetScreen$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        Modifier.Companion companion = Modifier.Companion.d;
                                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                                        composer2.o(1849434622);
                                        Object objG2 = composer2.G();
                                        Object obj5 = Composer.Companion.f1624a;
                                        if (objG2 == obj5) {
                                            objG2 = InteractionSourceKt.a();
                                            composer2.A(objG2);
                                        }
                                        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG2;
                                        composer2.l();
                                        IndicationNodeFactory indicationNodeFactoryB = RippleKt.b(BitmapDescriptorFactory.HUE_RED, 3, WxTheme.a(composer2).h(), false);
                                        composer2.o(-1633490746);
                                        final Function1 function12 = function1;
                                        boolean zN = composer2.n(function12);
                                        final MenuItem menuItem2 = menuItem;
                                        boolean zN2 = zN | composer2.n(menuItem2);
                                        Object objG3 = composer2.G();
                                        if (zN2 || objG3 == obj5) {
                                            objG3 = new Function0() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.c
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function12.invoke(menuItem2.getC());
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(objG3);
                                        }
                                        composer2.l();
                                        Modifier modifierH2 = PaddingKt.h(ClickableKt.b(modifierE, mutableInteractionSource, indicationNodeFactoryB, false, null, null, (Function0) objG3, 28), BitmapDescriptorFactory.HUE_RED, 16, 1);
                                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer2, 0);
                                        int p = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierH2);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function02 = ComposeUiNode.Companion.b;
                                        if (composer2.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer2.i();
                                        if (composer2.getO()) {
                                            composer2.K(function02);
                                        } else {
                                            composer2.e();
                                        }
                                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function22 = ComposeUiNode.Companion.j;
                                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                            androidx.camera.core.impl.b.z(p, composer2, p, function22);
                                        }
                                        Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                                        float f = 20;
                                        ImageKt.a(PainterResources_androidKt.a(menuItem2.getF12488a(), 0, composer2), null, SizeKt.q(PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), f), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 432, 120);
                                        TextKt.b(StringResources_androidKt.c(composer2, menuItem2.getB()), PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 0L, 0L, null, 0L, null, new TextAlign(5), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).l, composer2, 48, 0, 65020);
                                        composer2.f();
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1846133673), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(null, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 0, 511);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i5 = 1;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            ListsBottomSheetScreenKt.a(viewState, onMenuItemClick, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            ListsBottomSheetScreenKt.a(viewState, onMenuItemClick, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
