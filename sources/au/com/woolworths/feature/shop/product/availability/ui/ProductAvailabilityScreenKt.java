package au.com.woolworths.feature.shop.product.availability.ui;

import androidx.camera.core.impl.b;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shared.receipt.details.compose.a;
import au.com.woolworths.feature.shop.account.ui.details.components.c;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiState;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityViewModel;
import au.com.woolworths.foundation.feature.analytics.AnalyticsTracker;
import au.com.woolworths.foundation.feature.analytics.AnalyticsTrackerKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.product.models.ProductCard;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiState;", "viewState", "product-availability_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductAvailabilityScreenKt {
    public static final void a(final ProductAvailabilityUiState.Content content, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-522605000);
        int i2 = (composerImplV.I(content) ? 4 : 2) | i | (composerImplV.I(function1) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
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
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 16;
            CurrentStorePanelUiKt.a(0, 0, composerImplV, PaddingKt.j(companion, f, f, f, BitmapDescriptorFactory.HUE_RED, 8), content.f7989a);
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1244410890, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.product.availability.ui.ProductAvailabilityScreenKt$ContentUi$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f2 = 16;
                        ProductPanelUiKt.a(content.b, PaddingKt.j(Modifier.Companion.d, f2, f2, f2, BitmapDescriptorFactory.HUE_RED, 8), composer2, ProductCard.$stable, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composerImplV, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13));
            NearbyStoresSectionUiKt.b(content.c, function1, null, composerImplV, i2 & 112);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(content, i, 20, function1);
        }
    }

    public static final void b(FullPageMessage.Error error, Function0 function0, Composer composer, int i) {
        FullPageMessage.Error error2;
        Function0 function02;
        ComposerImpl composerImplV = composer.v(32304085);
        int i2 = (composerImplV.n(error) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
            error2 = error;
        } else {
            FullPageMessageSpec fullPageMessageSpecA = FullPageMessageSpec.Companion.a(error, null, null, function0, composerImplV, (i2 & 14) | 1572864 | ((i2 << 12) & 458752), 30);
            error2 = error;
            function02 = function0;
            composerImplV = composerImplV;
            FullPageMessageUiKt.a(fullPageMessageSpecA, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(error2, function02, i, 2);
        }
    }

    public static final void c(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1997218088);
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CircularProgressIndicatorKt.b(null, 0L, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 15);
            composerImplV.V(true);
            modifier = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 21, modifier);
        }
    }

    public static final void d(ProductAvailabilityViewModel viewModel, Function0 onNavigateUp, Composer composer, int i) {
        ProductAvailabilityViewModel productAvailabilityViewModel;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(1510472513);
        int i2 = (composerImplV.n(viewModel) ? 4 : 2) | i | (composerImplV.I(onNavigateUp) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            productAvailabilityViewModel = viewModel;
        } else {
            ProductAvailabilityUiState productAvailabilityUiState = (ProductAvailabilityUiState) FlowExtKt.a(viewModel.i, composerImplV).getD();
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                productAvailabilityViewModel = viewModel;
                ProductAvailabilityScreenKt$ProductAvailabilityScreen$1$1 productAvailabilityScreenKt$ProductAvailabilityScreen$1$1 = new ProductAvailabilityScreenKt$ProductAvailabilityScreen$1$1(1, productAvailabilityViewModel, ProductAvailabilityViewModel.class, "onEvent", "onEvent(Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityUiEvent;)V", 0);
                composerImplV.A(productAvailabilityScreenKt$ProductAvailabilityScreen$1$1);
                objG = productAvailabilityScreenKt$ProductAvailabilityScreen$1$1;
            } else {
                productAvailabilityViewModel = viewModel;
            }
            composerImplV.V(false);
            e(productAvailabilityUiState, onNavigateUp, (Function1) ((KFunction) objG), composerImplV, i2 & 112);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(productAvailabilityViewModel, i, 19, onNavigateUp);
        }
    }

    public static final void e(final ProductAvailabilityUiState uiState, final Function0 onNavigateUp, final Function1 eventSink, Composer composer, int i) {
        int i2;
        Intrinsics.h(uiState, "uiState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(eventSink, "eventSink");
        ComposerImpl composerImplV = composer.v(-819461517);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onNavigateUp) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(eventSink) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final AnalyticsTracker analyticsTrackerA = AnalyticsTrackerKt.a(composerImplV);
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(989797679, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.product.availability.ui.ProductAvailabilityScreenKt$ProductAvailabilityScreenUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.check_availability);
                        final Function0 function0 = onNavigateUp;
                        final AnalyticsTracker analyticsTracker = analyticsTrackerA;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-1345211011, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.product.availability.ui.ProductAvailabilityScreenKt$ProductAvailabilityScreenUi$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    String strC2 = StringResources_androidKt.c(composer3, R.string.content_description_back_button);
                                    composer3.o(-1633490746);
                                    Function0 function02 = function0;
                                    boolean zN = composer3.n(function02);
                                    AnalyticsTracker analyticsTracker2 = analyticsTracker;
                                    boolean zI = zN | composer3.I(analyticsTracker2);
                                    Object objG = composer3.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new f(9, function02, analyticsTracker2);
                                        composer3.A(objG);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC2, (Function0) objG, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(1748677446, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.product.availability.ui.ProductAvailabilityScreenKt$ProductAvailabilityScreenUi$2
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
                        Modifier modifierE = PaddingKt.e(Modifier.Companion.d, it);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objG == composer$Companion$Empty$1) {
                            objG = new l(18);
                            composer2.A(objG);
                        }
                        Function1 function1 = (Function1) objG;
                        Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                        if (objE == composer$Companion$Empty$1) {
                            objE = new l(19);
                            composer2.A(objE);
                        }
                        composer2.l();
                        final Function1 function12 = eventSink;
                        AnimatedContentKt.b(uiState, null, function1, null, "uiState", (Function1) objE, ComposableLambdaKt.c(-114347016, new Function4<AnimatedContentScope, ProductAvailabilityUiState, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.product.availability.ui.ProductAvailabilityScreenKt$ProductAvailabilityScreenUi$2$1$3
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj4;
                                ProductAvailabilityUiState state = (ProductAvailabilityUiState) obj5;
                                Composer composer3 = (Composer) obj6;
                                ((Number) obj7).intValue();
                                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                                Intrinsics.h(state, "state");
                                boolean z = state instanceof ProductAvailabilityUiState.Content;
                                Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                Function1 function13 = function12;
                                if (z) {
                                    composer3.o(1781670864);
                                    ProductAvailabilityUiState.Content content = (ProductAvailabilityUiState.Content) state;
                                    composer3.o(5004770);
                                    boolean zN = composer3.n(function13);
                                    Object objG2 = composer3.G();
                                    if (zN || objG2 == composer$Companion$Empty$12) {
                                        objG2 = new au.com.woolworths.feature.shop.contentpage.ui.c(20, function13);
                                        composer3.A(objG2);
                                    }
                                    composer3.l();
                                    ProductAvailabilityScreenKt.a(content, (Function1) objG2, composer3, 0);
                                    composer3.l();
                                } else if (state instanceof ProductAvailabilityUiState.Error) {
                                    composer3.o(1781680639);
                                    FullPageMessage.Error error = ((ProductAvailabilityUiState.Error) state).f7990a;
                                    composer3.o(5004770);
                                    boolean zN2 = composer3.n(function13);
                                    Object objG3 = composer3.G();
                                    if (zN2 || objG3 == composer$Companion$Empty$12) {
                                        objG3 = new au.com.woolworths.feature.product.list.v2.ui.f(25, function13);
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    ProductAvailabilityScreenKt.b(error, (Function0) objG3, composer3, 0);
                                    composer3.l();
                                } else {
                                    if (!state.equals(ProductAvailabilityUiState.Loading.f7991a)) {
                                        throw au.com.woolworths.android.onesite.a.x(composer3, 1781668823);
                                    }
                                    composer3.o(1781687715);
                                    ProductAvailabilityScreenKt.c(null, composer3, 0);
                                    composer3.l();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1794432, 10);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(uiState, onNavigateUp, eventSink, i, 23);
        }
    }
}
