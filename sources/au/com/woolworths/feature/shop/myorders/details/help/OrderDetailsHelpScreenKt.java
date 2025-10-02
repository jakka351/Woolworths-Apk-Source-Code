package au.com.woolworths.feature.shop.myorders.details.help;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpContract;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpContract$ViewState;", "viewState", "", "helpIconAvailable", "my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderDetailsHelpScreenKt {
    public static final void a(OrderHelpDataList helpData, Function1 onHelpItemClick, Composer composer, int i) {
        Intrinsics.h(helpData, "helpData");
        Intrinsics.h(onHelpItemClick, "onHelpItemClick");
        ComposerImpl composerImplV = composer.v(1853769866);
        int i2 = (composerImplV.I(helpData) ? 4 : 2) | i | (composerImplV.I(onHelpItemClick) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierX0 = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13).x0(SizeKt.c);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(helpData);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(12, helpData, onHelpItemClick);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierX0, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 6, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(helpData, onHelpItemClick, i, 1);
        }
    }

    public static final void b(final OrderDetailsHelpViewModel viewModel, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(1534212100);
        if ((((composerImplV.I(viewModel) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.h, composerImplV);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(1868116169, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpScreenKt$OrderDetailsHelpScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final OrderDetailsHelpViewModel orderDetailsHelpViewModel = viewModel;
                        TopNavBarKt.b("Help & support", null, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1376659354, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpScreenKt$OrderDetailsHelpScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    composer3.o(5004770);
                                    OrderDetailsHelpViewModel orderDetailsHelpViewModel2 = orderDetailsHelpViewModel;
                                    boolean zI = composer3.I(orderDetailsHelpViewModel2);
                                    Object objG = composer3.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new f(orderDetailsHelpViewModel2, 29);
                                        composer3.A(objG);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, "Back", (Function0) objG, null, false, 0L, composer3, 48, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 805306374, 0, 1534);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-1806836549, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpScreenKt$OrderDetailsHelpScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        OrderDetailsHelpContract.ViewState viewState = (OrderDetailsHelpContract.ViewState) mutableStateA.getD();
                        if (!Intrinsics.c(viewState, OrderDetailsHelpContract.ViewState.Loading.f7725a)) {
                            if (!(viewState instanceof OrderDetailsHelpContract.ViewState.Loaded)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            OrderHelpDataList orderHelpDataList = ((OrderDetailsHelpContract.ViewState.Loaded) viewState).f7724a;
                            composer2.o(5004770);
                            OrderDetailsHelpViewModel orderDetailsHelpViewModel = viewModel;
                            boolean zI = composer2.I(orderDetailsHelpViewModel);
                            Object objG = composer2.G();
                            if (zI || objG == Composer.Companion.f1624a) {
                                objG = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(orderDetailsHelpViewModel, 2);
                                composer2.A(objG);
                            }
                            composer2.l();
                            OrderDetailsHelpScreenKt.a(orderHelpDataList, (Function1) objG, composer2, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 1018);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 8, viewModel);
        }
    }
}
