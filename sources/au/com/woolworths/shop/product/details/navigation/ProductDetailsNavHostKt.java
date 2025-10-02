package au.com.woolworths.shop.product.details.navigation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.unit.IntOffset;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostKt;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.product.details.ProductDetailsActivity$setViewContent$1;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
import au.com.woolworths.shop.product.details.ProductDetailsViewModel;
import au.com.woolworths.shop.product.details.data.NutritionInfo;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowLink;
import au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt;
import au.com.woolworths.shop.product.details.ui.everydaymarket.AboutEverydayMarketKt;
import au.com.woolworths.shop.product.details.ui.linkdedicatedviews.FullScreenImageGalleryScreenKt;
import au.com.woolworths.shop.product.details.ui.linkdedicatedviews.NutritionalInfoScreenKt;
import au.com.woolworths.shop.product.details.ui.linkdedicatedviews.ParagraphTextScreenKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$ViewState;", "viewState", "product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsNavHostKt {
    public static final void a(final NavHostController navController, final ProductDetailsViewModel viewModel, final PagerState imageGalleryPagerState, final ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 c02631, final ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 anonymousClass2, final Function0 onNavigateUp, final boolean z, final Function1 productDetailsEventSink, final Function1 onChatEntryBannerClicked, Composer composer, final int i) {
        Intrinsics.h(navController, "navController");
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(imageGalleryPagerState, "imageGalleryPagerState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(productDetailsEventSink, "productDetailsEventSink");
        Intrinsics.h(onChatEntryBannerClicked, "onChatEntryBannerClicked");
        ComposerImpl composerImplV = composer.v(-49436998);
        int i2 = (composerImplV.I(onChatEntryBannerClicked) ? 67108864 : 33554432) | i | (composerImplV.I(navController) ? 4 : 2) | (composerImplV.n(viewModel) ? 32 : 16) | (composerImplV.n(imageGalleryPagerState) ? 256 : 128) | (composerImplV.I(c02631) ? 2048 : 1024) | (composerImplV.I(anonymousClass2) ? 16384 : 8192) | (composerImplV.I(onNavigateUp) ? 131072 : 65536) | (composerImplV.p(z) ? 1048576 : 524288) | (composerImplV.I(productDetailsEventSink) ? 8388608 : 4194304);
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ProductDetailsScreen productDetailsScreen = ProductDetailsScreen.INSTANCE;
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 112) == 32) | ((i2 & 896) == 256) | composerImplV.I(c02631) | composerImplV.I(anonymousClass2) | ((458752 & i2) == 131072) | composerImplV.I(navController) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                Function1 function1 = new Function1() { // from class: au.com.woolworths.shop.product.details.navigation.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        NavGraphBuilder NavHost = (NavGraphBuilder) obj;
                        Intrinsics.h(NavHost, "$this$NavHost");
                        final ProductDetailsViewModel productDetailsViewModel = viewModel;
                        final PagerState pagerState = imageGalleryPagerState;
                        final ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 c026312 = c02631;
                        final ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 anonymousClass22 = anonymousClass2;
                        final Function0 function0 = onNavigateUp;
                        final NavHostController navHostController = navController;
                        final boolean z2 = z;
                        final Function1 function12 = productDetailsEventSink;
                        final Function1 function13 = onChatEntryBannerClicked;
                        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.navigation.ProductDetailsNavHostKt$ProductDetailsNavHost$1$1$1
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                AnimatedContentScope composable = (AnimatedContentScope) obj2;
                                NavBackStackEntry it = (NavBackStackEntry) obj3;
                                Composer composer2 = (Composer) obj4;
                                ((Number) obj5).intValue();
                                Intrinsics.h(composable, "$this$composable");
                                Intrinsics.h(it, "it");
                                ProductDetailsViewModel productDetailsViewModel2 = productDetailsViewModel;
                                boolean zC = productDetailsViewModel2.j.c(BaseShopAppFeature.H);
                                boolean zC2 = productDetailsViewModel2.j.c(BaseShopAppFeature.O);
                                composer2.o(5004770);
                                NavHostController navHostController2 = navHostController;
                                boolean zI2 = composer2.I(navHostController2);
                                Object objG2 = composer2.G();
                                Object obj6 = Composer.Companion.f1624a;
                                if (zI2 || objG2 == obj6) {
                                    objG2 = new e(navHostController2, 0);
                                    composer2.A(objG2);
                                }
                                Function0 function02 = (Function0) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(navHostController2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == obj6) {
                                    objG3 = new e(navHostController2, 1);
                                    composer2.A(objG3);
                                }
                                Function0 function03 = (Function0) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(navHostController2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == obj6) {
                                    objG4 = new e(navHostController2, 2);
                                    composer2.A(objG4);
                                }
                                Function0 function04 = (Function0) objG4;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(navHostController2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == obj6) {
                                    objG5 = new e(navHostController2, 3);
                                    composer2.A(objG5);
                                }
                                composer2.l();
                                ProductDetailsScreenKt.j(productDetailsViewModel, pagerState, c026312, anonymousClass22, function0, function02, function03, function04, (Function0) objG5, z2, function12, zC, zC2, function13, composer2, 0);
                                return Unit.f24250a;
                            }
                        }, true, 66299899);
                        Map map = EmptyMap.d;
                        ReflectionFactory reflectionFactory = Reflection.f24268a;
                        NavGraphBuilderKt.a(NavHost, reflectionFactory.b(ProductDetailsScreen.class), map, null, null, null, null, composableLambdaImpl);
                        final int i3 = 0;
                        Function1 function14 = new Function1() { // from class: au.com.woolworths.shop.product.details.navigation.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                AnimatedContentTransitionScope composable = (AnimatedContentTransitionScope) obj2;
                                switch (i3) {
                                    case 0:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 1:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 2:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 3:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 4:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 5:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 6:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    default:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                }
                            }
                        };
                        final int i4 = 1;
                        Function1 function15 = new Function1() { // from class: au.com.woolworths.shop.product.details.navigation.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                AnimatedContentTransitionScope composable = (AnimatedContentTransitionScope) obj2;
                                switch (i4) {
                                    case 0:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 1:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 2:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 3:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 4:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 5:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 6:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    default:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                }
                            }
                        };
                        ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.navigation.ProductDetailsNavHostKt$ProductDetailsNavHost$1$1$4
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                AnimatedContentScope composable = (AnimatedContentScope) obj2;
                                NavBackStackEntry it = (NavBackStackEntry) obj3;
                                Composer composer2 = (Composer) obj4;
                                ((Number) obj5).intValue();
                                Intrinsics.h(composable, "$this$composable");
                                Intrinsics.h(it, "it");
                                NutritionInfo nutritionInfo = ((ProductDetailsContract.ViewState) FlowExtKt.a(productDetailsViewModel.r, composer2).getD()).d;
                                if (nutritionInfo != null) {
                                    composer2.o(5004770);
                                    NavHostController navHostController2 = navHostController;
                                    boolean zI2 = composer2.I(navHostController2);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == Composer.Companion.f1624a) {
                                        objG2 = new e(navHostController2, 6);
                                        composer2.A(objG2);
                                    }
                                    composer2.l();
                                    NutritionalInfoScreenKt.a(nutritionInfo, (Function0) objG2, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1974613518);
                        NavGraphBuilderKt.a(NavHost, reflectionFactory.b(NutritionalInfo.class), EmptyMap.d, function14, function15, function14, function15, composableLambdaImpl2);
                        final int i5 = 2;
                        Function1 function16 = new Function1() { // from class: au.com.woolworths.shop.product.details.navigation.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                AnimatedContentTransitionScope composable = (AnimatedContentTransitionScope) obj2;
                                switch (i5) {
                                    case 0:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 1:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 2:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 3:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 4:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 5:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 6:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    default:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                }
                            }
                        };
                        final int i6 = 3;
                        Function1 function17 = new Function1() { // from class: au.com.woolworths.shop.product.details.navigation.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                AnimatedContentTransitionScope composable = (AnimatedContentTransitionScope) obj2;
                                switch (i6) {
                                    case 0:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 1:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 2:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 3:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 4:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 5:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 6:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    default:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                }
                            }
                        };
                        ComposableLambdaImpl composableLambdaImpl3 = new ComposableLambdaImpl(new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.navigation.ProductDetailsNavHostKt$ProductDetailsNavHost$1$1$7
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                AnimatedContentScope composable = (AnimatedContentScope) obj2;
                                NavBackStackEntry it = (NavBackStackEntry) obj3;
                                Composer composer2 = (Composer) obj4;
                                ((Number) obj5).intValue();
                                Intrinsics.h(composable, "$this$composable");
                                Intrinsics.h(it, "it");
                                MutableState mutableStateA = FlowExtKt.a(productDetailsViewModel.r, composer2);
                                ProductDetailsRowLink productDetailsRowLink = ((ProductDetailsContract.ViewState) mutableStateA.getD()).c;
                                String str = productDetailsRowLink != null ? productDetailsRowLink.f12613a.d : null;
                                ProductDetailsRowLink productDetailsRowLink2 = ((ProductDetailsContract.ViewState) mutableStateA.getD()).c;
                                ParagraphTextItemData paragraphTextItemData = (ParagraphTextItemData) (productDetailsRowLink2 != null ? productDetailsRowLink2.b : null);
                                if (str != null && paragraphTextItemData != null) {
                                    composer2.o(5004770);
                                    NavHostController navHostController2 = navHostController;
                                    boolean zI2 = composer2.I(navHostController2);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == Composer.Companion.f1624a) {
                                        objG2 = new e(navHostController2, 7);
                                        composer2.A(objG2);
                                    }
                                    composer2.l();
                                    ParagraphTextScreenKt.a(str, paragraphTextItemData, (Function0) objG2, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -148977741);
                        NavGraphBuilderKt.a(NavHost, reflectionFactory.b(ParagraphText.class), EmptyMap.d, function16, function17, function16, function17, composableLambdaImpl3);
                        final int i7 = 4;
                        Function1 function18 = new Function1() { // from class: au.com.woolworths.shop.product.details.navigation.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                AnimatedContentTransitionScope composable = (AnimatedContentTransitionScope) obj2;
                                switch (i7) {
                                    case 0:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 1:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 2:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 3:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 4:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 5:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 6:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    default:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                }
                            }
                        };
                        final int i8 = 5;
                        Function1 function19 = new Function1() { // from class: au.com.woolworths.shop.product.details.navigation.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                AnimatedContentTransitionScope composable = (AnimatedContentTransitionScope) obj2;
                                switch (i8) {
                                    case 0:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 1:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 2:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 3:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 4:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 5:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 6:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    default:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                }
                            }
                        };
                        ComposableLambdaImpl composableLambdaImpl4 = new ComposableLambdaImpl(new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.navigation.ProductDetailsNavHostKt$ProductDetailsNavHost$1$1$10
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                AnimatedContentScope composable = (AnimatedContentScope) obj2;
                                NavBackStackEntry it = (NavBackStackEntry) obj3;
                                Composer composer2 = (Composer) obj4;
                                ((Number) obj5).intValue();
                                Intrinsics.h(composable, "$this$composable");
                                Intrinsics.h(it, "it");
                                ProductDetailsContract.ViewState viewState = (ProductDetailsContract.ViewState) FlowExtKt.a(productDetailsViewModel.r, composer2).getD();
                                composer2.o(5004770);
                                NavHostController navHostController2 = navHostController;
                                boolean zI2 = composer2.I(navHostController2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == Composer.Companion.f1624a) {
                                    objG2 = new e(navHostController2, 4);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                Function1 function110 = function12;
                                FullScreenImageGalleryScreenKt.a(viewState, pagerState, (Function0) objG2, function110, composer2, 0);
                                return Unit.f24250a;
                            }
                        }, true, 1676658036);
                        NavGraphBuilderKt.a(NavHost, reflectionFactory.b(FullScreenImageGallery.class), EmptyMap.d, function18, function19, function18, function19, composableLambdaImpl4);
                        final int i9 = 6;
                        Function1 function110 = new Function1() { // from class: au.com.woolworths.shop.product.details.navigation.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                AnimatedContentTransitionScope composable = (AnimatedContentTransitionScope) obj2;
                                switch (i9) {
                                    case 0:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 1:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 2:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 3:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 4:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 5:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 6:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    default:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                }
                            }
                        };
                        final int i10 = 7;
                        Function1 function111 = new Function1() { // from class: au.com.woolworths.shop.product.details.navigation.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                AnimatedContentTransitionScope composable = (AnimatedContentTransitionScope) obj2;
                                switch (i10) {
                                    case 0:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 1:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 2:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 3:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 4:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 5:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    case 6:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.a(0, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                    default:
                                        Intrinsics.h(composable, "$this$composable");
                                        return composable.d(1, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset(VisibilityThresholdsKt.a()), 3));
                                }
                            }
                        };
                        ComposableLambdaImpl composableLambdaImpl5 = new ComposableLambdaImpl(new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.navigation.ProductDetailsNavHostKt$ProductDetailsNavHost$1$1$13
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                AnimatedContentScope composable = (AnimatedContentScope) obj2;
                                NavBackStackEntry it = (NavBackStackEntry) obj3;
                                Composer composer2 = (Composer) obj4;
                                ((Number) obj5).intValue();
                                Intrinsics.h(composable, "$this$composable");
                                Intrinsics.h(it, "it");
                                InfoSection infoSection = ((ProductDetailsContract.ViewState) FlowExtKt.a(productDetailsViewModel.r, composer2).getD()).e;
                                if (infoSection != null) {
                                    composer2.o(5004770);
                                    NavHostController navHostController2 = navHostController;
                                    boolean zI2 = composer2.I(navHostController2);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == Composer.Companion.f1624a) {
                                        objG2 = new e(navHostController2, 5);
                                        composer2.A(objG2);
                                    }
                                    composer2.l();
                                    AboutEverydayMarketKt.c(infoSection, (Function0) objG2, null, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -792673483);
                        NavGraphBuilderKt.a(NavHost, reflectionFactory.b(AboutEverydayMarket.class), EmptyMap.d, function110, function111, function110, function111, composableLambdaImpl5);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG = function1;
            }
            composerImplV.V(false);
            NavHostKt.b(navController, productDetailsScreen, null, null, null, null, null, null, null, (Function1) objG, composerImplV, (i2 & 14) | 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(viewModel, imageGalleryPagerState, c02631, anonymousClass2, onNavigateUp, z, productDetailsEventSink, onChatEntryBannerClicked, i) { // from class: au.com.woolworths.shop.product.details.navigation.c
                public final /* synthetic */ ProductDetailsViewModel e;
                public final /* synthetic */ PagerState f;
                public final /* synthetic */ ProductDetailsActivity$setViewContent$1.AnonymousClass1.C02631 g;
                public final /* synthetic */ ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Function1 l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    ProductDetailsNavHostKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
