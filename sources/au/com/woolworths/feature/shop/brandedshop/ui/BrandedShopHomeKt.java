package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel;
import au.com.woolworths.feature.shop.brandedshop.ViewState;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopErrorData;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopHeaderData;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopProductGridConfig;
import au.com.woolworths.feature.shop.brandedshop.data.SnackbarContent;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shared.ui.compose.shop.CartIconButtonKt;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.aem.components.model.bottomsheet.GenericPageBottomSheetItem;
import au.com.woolworths.shop.aem.components.model.bottomsheet.StaticBottomSheetData;
import au.com.woolworths.shop.aem.components.ui.bottomsheet.StaticBottomSheetContentKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/ViewState;", "viewState", "brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BrandedShopHomeKt {
    public static final void a(ViewState viewState, boolean z, ProductClickListener productClickListener, Function1 onBrandedShopUiEvent, Function1 onItemSeen, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(viewState, "viewState");
        BrandedShopErrorData brandedShopErrorData = viewState.i;
        Intrinsics.h(productClickListener, "productClickListener");
        Intrinsics.h(onBrandedShopUiEvent, "onBrandedShopUiEvent");
        Intrinsics.h(onItemSeen, "onItemSeen");
        ComposerImpl composerImplV = composer.v(-1228415753);
        int i2 = i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(productClickListener) ? 256 : 128) | (composerImplV.I(onBrandedShopUiEvent) ? 2048 : 1024) | (composerImplV.I(onItemSeen) ? 16384 : 8192) | 196608;
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (viewState.b) {
                composerImplV.o(1283477562);
                BrandedShopBlankSlateKt.a(composerImplV, 0);
                composerImplV.V(false);
            } else if (viewState.f != null) {
                composerImplV.o(1283589162);
                BrandedShopContentKt.a(viewState.c, viewState.f, onBrandedShopUiEvent, onItemSeen, viewState.d, productClickListener, z, null, composerImplV, ((i2 >> 3) & 8064) | ((i2 << 9) & 458752) | ((i2 << 15) & 3670016));
                composerImplV.V(false);
            } else if (brandedShopErrorData != null) {
                composerImplV.o(1284154850);
                FullPageMessage.Error error = brandedShopErrorData.b;
                composerImplV.o(-1633490746);
                boolean zI = ((i2 & 7168) == 2048) | composerImplV.I(viewState);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new f(2, onBrandedShopUiEvent, viewState);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                BrandedShopFullScreenErrorKt.a(error, (Function0) objG, composerImplV, 0);
                composerImplV.V(false);
            } else {
                composerImplV.o(1284517457);
                composerImplV.V(false);
            }
            composerImplV.V(true);
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.loadingbutton.a(viewState, z, productClickListener, onBrandedShopUiEvent, onItemSeen, modifier2, i, 2);
        }
    }

    public static final void b(final ViewState viewState, final Function0 onNavigateUp, final Function0 onSearchClicked, final Function0 onCartClicked, final Function1 onBrandedShopUiEvent, final Function1 onItemSeen, final BrandedShopViewModel viewModel, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onSearchClicked, "onSearchClicked");
        Intrinsics.h(onCartClicked, "onCartClicked");
        Intrinsics.h(onBrandedShopUiEvent, "onBrandedShopUiEvent");
        Intrinsics.h(onItemSeen, "onItemSeen");
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(-2022793636);
        if (((i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(onSearchClicked) ? 256 : 128) | (composerImplV.I(onCartClicked) ? 2048 : 1024) | (composerImplV.I(onBrandedShopUiEvent) ? 16384 : 8192) | (composerImplV.I(onItemSeen) ? 131072 : 65536) | (composerImplV.I(viewModel) ? 1048576 : 524288)) & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(-715171679, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt$BrandedShopScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final ViewState viewState2 = viewState;
                        BrandedShopHeaderData brandedShopHeaderData = viewState2.e;
                        String str = brandedShopHeaderData != null ? brandedShopHeaderData.f6692a : null;
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1084949774, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt$BrandedShopScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final Function0 function02 = onSearchClicked;
                        final Function0 function03 = onCartClicked;
                        TopNavBarKt.b(str, null, null, null, 0L, 0L, 0L, null, 0, composableLambdaImplC, ComposableLambdaKt.c(327624844, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt$BrandedShopScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(SearchKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_search), function02, null, false, 0L, composer3, 0, 56);
                                    ViewState viewState3 = viewState2;
                                    BrandedShopProductGridConfig brandedShopProductGridConfig = viewState3.d;
                                    if (brandedShopProductGridConfig != null && !brandedShopProductGridConfig.f6693a) {
                                        CartIconButtonKt.a(viewState3.f6676a, function03, null, 0L, composer3, 0, 12);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969664, 6, 254);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(139888148, new Function3<SnackbarHostState, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt$BrandedShopScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    SnackbarHostState it = (SnackbarHostState) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, null, null, composer2, 6, 6);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(1061188499, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt$BrandedShopScreen$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        BrandedShopHomeKt.a(viewState, viewModel.g.c(BaseShopAppFeature.w), viewModel, onBrandedShopUiEvent, onItemSeen, null, composer2, 0);
                        BrandedShopHomeKt.c(snackbarHostState, viewState.g, onBrandedShopUiEvent, composer2, 6);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 3462, 1010);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.c(viewState, onNavigateUp, onSearchClicked, onCartClicked, onBrandedShopUiEvent, onItemSeen, viewModel, i);
        }
    }

    public static final void c(SnackbarHostState snackbarHostState, SnackbarContent snackbarContent, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1661724336);
        int i2 = i | (composerImplV.n(snackbarContent) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = snackbarContent instanceof SnackbarContent.AddToListSuccess;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(636945618);
                ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = ((SnackbarContent.AddToListSuccess) snackbarContent).d;
                String str = addToListSuccessEvent.f;
                if (str == null) {
                    str = "";
                }
                String strB = StringResources_androidKt.b(R.string.product_add_to_list_successfully, new Object[]{str, addToListSuccessEvent.e}, composerImplV);
                String upperCase = StringResources_androidKt.c(composerImplV, R.string.view_list).toUpperCase(Locale.ROOT);
                Intrinsics.g(upperCase, "toUpperCase(...)");
                composerImplV.o(-1224400529);
                boolean zN = composerImplV.n(strB) | composerImplV.n(upperCase) | ((i2 & 896) == 256) | composerImplV.I(addToListSuccessEvent);
                Object objG = composerImplV.G();
                if (zN || objG == composer$Companion$Empty$1) {
                    BrandedShopHomeKt$BrandedShopSnackbar$1$1 brandedShopHomeKt$BrandedShopSnackbar$1$1 = new BrandedShopHomeKt$BrandedShopSnackbar$1$1(snackbarHostState, strB, upperCase, function1, addToListSuccessEvent, null);
                    composerImplV.A(brandedShopHomeKt$BrandedShopSnackbar$1$1);
                    objG = brandedShopHomeKt$BrandedShopSnackbar$1$1;
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, snackbarContent, (Function2) objG);
                composerImplV.V(false);
            } else if (snackbarContent instanceof SnackbarContent.AddToCartError) {
                composerImplV.o(637829490);
                String strC = StringResources_androidKt.c(composerImplV, ((SnackbarContent.AddToCartError) snackbarContent).d.d);
                composerImplV.o(-1746271574);
                boolean zN2 = composerImplV.n(strC) | ((i2 & 896) == 256);
                Object objG2 = composerImplV.G();
                if (zN2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new BrandedShopHomeKt$BrandedShopSnackbar$2$1(snackbarHostState, strC, function1, null);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, snackbarContent, (Function2) objG2);
                composerImplV.V(false);
            } else {
                composerImplV.o(638156602);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 0, snackbarHostState, snackbarContent, function1);
        }
    }

    public static final void d(final Function0 onNavigateUp, final Function0 onSearchClicked, final Function0 onCartClicked, final Function1 onBrandedShopUiEvent, final Function1 onItemSeen, final BrandedShopViewModel viewModel, Composer composer, int i) {
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onSearchClicked, "onSearchClicked");
        Intrinsics.h(onCartClicked, "onCartClicked");
        Intrinsics.h(onBrandedShopUiEvent, "onBrandedShopUiEvent");
        Intrinsics.h(onItemSeen, "onItemSeen");
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(-179683100);
        int i2 = i | (composerImplV.I(onNavigateUp) ? 4 : 2) | (composerImplV.I(onSearchClicked) ? 32 : 16) | (composerImplV.I(onCartClicked) ? 256 : 128) | (composerImplV.I(onBrandedShopUiEvent) ? 2048 : 1024) | (composerImplV.I(onItemSeen) ? 16384 : 8192) | (composerImplV.I(viewModel) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.l, composerImplV);
            final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composerImplV, 3078, 6);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            GenericPageBottomSheetItem genericPageBottomSheetItem = ((ViewState) mutableStateA.getD()).h;
            composerImplV.o(-1633490746);
            boolean zN = composerImplV.n(mutableStateA) | composerImplV.I(modalBottomSheetStateC);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                objG2 = new BrandedShopHomeKt$BrandedShopUi$1$1(modalBottomSheetStateC, mutableStateA, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, genericPageBottomSheetItem, (Function2) objG2);
            ModalBottomSheetValue modalBottomSheetValueB = modalBottomSheetStateC.b();
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(modalBottomSheetStateC) | ((i2 & 7168) == 2048);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new BrandedShopHomeKt$BrandedShopUi$2$1(modalBottomSheetStateC, onBrandedShopUiEvent, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, modalBottomSheetValueB, (Function2) objG3);
            composerImplV.o(-1746271574);
            boolean zI2 = ((i2 & 14) == 4) | composerImplV.I(coroutineScope) | composerImplV.I(modalBottomSheetStateC);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                objG4 = new Function0() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        BuildersKt.c(coroutineScope, null, null, new BrandedShopHomeKt$BrandedShopUi$3$1$1(modalBottomSheetStateC, onNavigateUp, null), 3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            BackHandlerKt.a(false, (Function0) objG4, composerImplV, 0, 1);
            ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(-30676974, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt$BrandedShopUi$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheetLayout = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        GenericPageBottomSheetItem genericPageBottomSheetItem2 = ((ViewState) mutableStateA.getD()).h;
                        if (genericPageBottomSheetItem2 instanceof StaticBottomSheetData) {
                            FillElement fillElement = SizeKt.c;
                            StaticBottomSheetData staticBottomSheetData = (StaticBottomSheetData) genericPageBottomSheetItem2;
                            composer2.o(-1633490746);
                            CoroutineScope coroutineScope2 = coroutineScope;
                            boolean zI3 = composer2.I(coroutineScope2);
                            ModalBottomSheetState modalBottomSheetState = modalBottomSheetStateC;
                            boolean zI4 = zI3 | composer2.I(modalBottomSheetState);
                            Object objG5 = composer2.G();
                            if (zI4 || objG5 == Composer.Companion.f1624a) {
                                objG5 = new f(0, coroutineScope2, modalBottomSheetState);
                                composer2.A(objG5);
                            }
                            composer2.l();
                            StaticBottomSheetContentKt.a(staticBottomSheetData, (Function0) objG5, fillElement, composer2, 3128, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableLambdaKt.c(-1604662007, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt$BrandedShopUi$5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        BrandedShopHomeKt.b((ViewState) mutableStateA.getD(), onNavigateUp, onSearchClicked, onCartClicked, onBrandedShopUiEvent, onItemSeen, viewModel, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12583430, 122);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.c(onNavigateUp, onSearchClicked, onCartClicked, onBrandedShopUiEvent, onItemSeen, viewModel, i, 4);
        }
    }
}
