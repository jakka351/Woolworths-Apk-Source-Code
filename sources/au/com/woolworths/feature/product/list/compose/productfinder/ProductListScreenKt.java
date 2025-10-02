package au.com.woolworths.feature.product.list.compose.productfinder;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.FragmentManager;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.feature.product.list.ComposeProductListActivity$initUi$1;
import au.com.woolworths.feature.product.list.ComposeProductListActivityContract;
import au.com.woolworths.feature.product.list.ProductListFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/compose/productfinder/KeyboardState;", "keyboardState", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListScreenKt {
    public static final void a(ProductListFragment.Extras extras, FragmentManager fragmentManager, FrameLayout frameLayout, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(117326511);
        if ((((composerImplV.I(extras) ? 4 : 2) | i | (composerImplV.I(fragmentManager) ? 32 : 16) | (composerImplV.I(frameLayout) ? 256 : 128)) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(frameLayout);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new h(frameLayout, 0);
                composerImplV.A(objG);
            }
            Function1 function1 = (Function1) objG;
            composerImplV.V(false);
            composerImplV.o(-1746271574);
            boolean zI2 = composerImplV.I(fragmentManager) | composerImplV.I(extras);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new androidx.lifecycle.f(10, fragmentManager, extras);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            AndroidView_androidKt.a(function1, modifier, (Function1) objG2, composerImplV, 48, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(extras, fragmentManager, frameLayout, modifier, i, 2);
        }
    }

    public static final void b(final ProductListFragment.Extras extras, final FragmentManager fragmentManager, final FrameLayout frameLayout, final ComposeProductListActivity$initUi$1.AnonymousClass1.C00991.AnonymousClass3.C01001 c01001, final ComposeProductListActivityContract.ViewState viewState, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1569742099);
        if (((i | (composerImplV.I(extras) ? 4 : 2) | (composerImplV.I(fragmentManager) ? 32 : 16) | (composerImplV.I(frameLayout) ? 256 : 128) | (composerImplV.n(c01001) ? 2048 : 1024) | (composerImplV.n(viewState) ? 16384 : 8192)) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            KeyboardState keyboardState = KeyboardState.d;
            composerImplV.o(1745738712);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(keyboardState);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.f;
            View view = (View) composerImplV.x(staticProvidableCompositionLocal);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(view);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new b(view, mutableState, 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.c(view, (Function1) objG2, composerImplV);
            composerImplV.V(false);
            View view2 = (View) composerImplV.x(staticProvidableCompositionLocal);
            boolean zA = DarkThemeKt.a(composerImplV);
            long j = Color.j;
            Boolean boolValueOf = Boolean.valueOf(zA);
            composerImplV.o(-1746271574);
            boolean zI2 = composerImplV.I(view2) | composerImplV.p(zA);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                ProductListScreenKt$ProductListScreen$1$1 productListScreenKt$ProductListScreen$1$1 = new ProductListScreenKt$ProductListScreen$1$1(view2, j, zA, null);
                composerImplV.A(productListScreenKt$ProductListScreen$1$1);
                objG3 = productListScreenKt$ProductListScreen$1$1;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, boolValueOf, (Function2) objG3);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(-241409938, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.productfinder.ProductListScreenKt$ProductListScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ComposeProductListActivityContract.ViewState viewState2 = viewState;
                        if (viewState2.c) {
                            ProductFinderTopBarKt.a(viewState2.f5207a, viewState2.b, viewState2.d, c01001, composer2, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(2009429436, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.productfinder.ProductListScreenKt$ProductListScreen$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composer2.o(-1856560580);
                        if (((KeyboardState) mutableState.getD()) == KeyboardState.e) {
                            ProductListScreenKt.a(extras, fragmentManager, frameLayout, SizeKt.c, composer2, 27648);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 1018);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(extras, fragmentManager, frameLayout, c01001, viewState, i, 0);
        }
    }
}
