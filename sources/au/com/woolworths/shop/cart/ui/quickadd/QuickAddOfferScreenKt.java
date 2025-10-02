package au.com.woolworths.shop.cart.ui.quickadd;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetStateKt;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferContract;
import au.com.woolworths.shop.cart.ui.shared.LoadingScreenKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobSupport;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferContract$ViewState;", "viewState", "shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class QuickAddOfferScreenKt {
    public static final void a(final QuickAddOfferViewModel quickAddOfferViewModel, final SnackbarHostState snackbarHostState, final Function0 onNavigateUp, Composer composer, final int i) {
        Intrinsics.h(snackbarHostState, "snackbarHostState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-760548661);
        if ((((composerImplV.I(quickAddOfferViewModel) ? 4 : 2) | i | (composerImplV.I(onNavigateUp) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            final SheetState sheetStateA = SheetStateKt.a(6, 0, composerImplV);
            final MutableState mutableStateA = FlowExtKt.a(quickAddOfferViewModel.k, composerImplV);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(quickAddOfferViewModel);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new QuickAddOfferScreenKt$QuickAddOfferScreen$1$1(quickAddOfferViewModel, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG2);
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-896033649, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferScreenKt$QuickAddOfferScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final SheetState sheetState = sheetStateA;
                        final Function0 function0 = onNavigateUp;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        TopNavBarKt.a("", null, 0L, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(-2130577279, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferScreenKt$QuickAddOfferScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    String strC = StringResources_androidKt.c(composer3, R.string.back);
                                    composer3.o(-1746271574);
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    boolean zI2 = composer3.I(coroutineScope3);
                                    final SheetState sheetState2 = sheetState;
                                    boolean zI3 = zI2 | composer3.I(sheetState2);
                                    final Function0 function02 = function0;
                                    boolean zN = zI3 | composer3.n(function02);
                                    Object objG3 = composer3.G();
                                    if (zN || objG3 == Composer.Companion.f1624a) {
                                        objG3 = new Function0() { // from class: au.com.woolworths.shop.cart.ui.quickadd.b
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                ((JobSupport) BuildersKt.c(coroutineScope3, null, null, new QuickAddOfferScreenKt$QuickAddOfferScreen$2$1$1$1$1(sheetState2, null), 3)).invokeOnCompletion(new j(11, function02));
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC, (Function0) objG3, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663302, 638);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(1991207697, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferScreenKt$QuickAddOfferScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, null, composer2, 0, 2);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), 0L, null, ComposableLambdaKt.c(-1748716904, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferScreenKt$QuickAddOfferScreen$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        State state = mutableStateA;
                        QuickAddOfferContract.Content content = ((QuickAddOfferContract.ViewState) state.getD()).b;
                        if (Intrinsics.c(content, QuickAddOfferContract.Content.Empty.f10531a)) {
                            composer2.o(1928145106);
                            if (((QuickAddOfferContract.ViewState) state.getD()).f10534a) {
                                LoadingScreenKt.a(0L, composer2, 0);
                            }
                            composer2.l();
                        } else {
                            boolean z = content instanceof QuickAddOfferContract.Content.Error;
                            QuickAddOfferViewModel quickAddOfferViewModel2 = quickAddOfferViewModel;
                            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                            if (z) {
                                composer2.o(-1184721670);
                                FillElement fillElement = SizeKt.c;
                                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                                int p = composer2.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                Modifier modifierD = ComposedModifierKt.d(composer2, fillElement);
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
                                Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                Function2 function2 = ComposeUiNode.Companion.j;
                                if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                    androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                }
                                Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                QuickAddOfferContract.Content.Error error = (QuickAddOfferContract.Content.Error) content;
                                Painter painterA = PainterResources_androidKt.a(error.f10532a, 0, composer2);
                                String strC = StringResources_androidKt.c(composer2, error.b);
                                String strC2 = StringResources_androidKt.c(composer2, error.c);
                                String strC3 = StringResources_androidKt.c(composer2, R.string.try_again_button_text);
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(quickAddOfferViewModel2);
                                Object objG3 = composer2.G();
                                if (zI2 || objG3 == composer$Companion$Empty$12) {
                                    objG3 = new QuickAddOfferScreenKt$QuickAddOfferScreen$4$1$1$1(0, quickAddOfferViewModel2, QuickAddOfferViewModel.class, "loadOffers", "loadOffers()V", 0);
                                    composer2.A(objG3);
                                }
                                composer2.l();
                                FullPageMessageUiKt.a(FullPageMessageSpec.Companion.d(painterA, strC, strC2, strC3, (Function0) ((KFunction) objG3)), null, null, composer2, 0, 6);
                                composer2.o(209907889);
                                if (((QuickAddOfferContract.ViewState) state.getD()).f10534a) {
                                    LoadingScreenKt.a(0L, composer2, 0);
                                }
                                composer2.l();
                                composer2.f();
                                composer2.l();
                            } else {
                                if (!(content instanceof QuickAddOfferContract.Content.Success)) {
                                    throw au.com.woolworths.android.onesite.a.x(composer2, -1184729898);
                                }
                                composer2.o(1929200842);
                                Modifier modifierE = PaddingKt.e(Modifier.Companion.d, it);
                                boolean z2 = ((QuickAddOfferContract.ViewState) state.getD()).f10534a;
                                QuickAddOfferContract.Content.Success success = (QuickAddOfferContract.Content.Success) content;
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(quickAddOfferViewModel2);
                                Object objG4 = composer2.G();
                                if (zI3 || objG4 == composer$Companion$Empty$12) {
                                    QuickAddOfferScreenKt$QuickAddOfferScreen$4$2$1 quickAddOfferScreenKt$QuickAddOfferScreen$4$2$1 = new QuickAddOfferScreenKt$QuickAddOfferScreen$4$2$1(1, quickAddOfferViewModel2, QuickAddOfferViewModel.class, "onAddClick", "onAddClick(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(quickAddOfferScreenKt$QuickAddOfferScreen$4$2$1);
                                    objG4 = quickAddOfferScreenKt$QuickAddOfferScreen$4$2$1;
                                }
                                KFunction kFunction = (KFunction) objG4;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(quickAddOfferViewModel2);
                                Object objG5 = composer2.G();
                                if (zI4 || objG5 == composer$Companion$Empty$12) {
                                    QuickAddOfferScreenKt$QuickAddOfferScreen$4$3$1 quickAddOfferScreenKt$QuickAddOfferScreen$4$3$1 = new QuickAddOfferScreenKt$QuickAddOfferScreen$4$3$1(1, quickAddOfferViewModel2, QuickAddOfferViewModel.class, "onDecrementClick", "onDecrementClick(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(quickAddOfferScreenKt$QuickAddOfferScreen$4$3$1);
                                    objG5 = quickAddOfferScreenKt$QuickAddOfferScreen$4$3$1;
                                }
                                KFunction kFunction2 = (KFunction) objG5;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(quickAddOfferViewModel2);
                                Object objG6 = composer2.G();
                                if (zI5 || objG6 == composer$Companion$Empty$12) {
                                    QuickAddOfferScreenKt$QuickAddOfferScreen$4$4$1 quickAddOfferScreenKt$QuickAddOfferScreen$4$4$1 = new QuickAddOfferScreenKt$QuickAddOfferScreen$4$4$1(1, quickAddOfferViewModel2, QuickAddOfferViewModel.class, "onIncrementClick", "onIncrementClick(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(quickAddOfferScreenKt$QuickAddOfferScreen$4$4$1);
                                    objG6 = quickAddOfferScreenKt$QuickAddOfferScreen$4$4$1;
                                }
                                KFunction kFunction3 = (KFunction) objG6;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(quickAddOfferViewModel2);
                                Object objG7 = composer2.G();
                                if (zI6 || objG7 == composer$Companion$Empty$12) {
                                    QuickAddOfferScreenKt$QuickAddOfferScreen$4$5$1 quickAddOfferScreenKt$QuickAddOfferScreen$4$5$1 = new QuickAddOfferScreenKt$QuickAddOfferScreen$4$5$1(1, quickAddOfferViewModel2, QuickAddOfferViewModel.class, "onQuantityClick", "onQuantityClick(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(quickAddOfferScreenKt$QuickAddOfferScreen$4$5$1);
                                    objG7 = quickAddOfferScreenKt$QuickAddOfferScreen$4$5$1;
                                }
                                composer2.l();
                                QuickAddOfferSuccessScreenKt.f(z2, success, (Function1) kFunction, (Function1) kFunction2, (Function1) kFunction3, (Function1) ((KFunction) objG7), modifierE, composer2, 0, 0);
                                composer2.l();
                            }
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12586038, 116);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(snackbarHostState, onNavigateUp, i) { // from class: au.com.woolworths.shop.cart.ui.quickadd.a
                public final /* synthetic */ SnackbarHostState e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(49);
                    QuickAddOfferScreenKt.a(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
