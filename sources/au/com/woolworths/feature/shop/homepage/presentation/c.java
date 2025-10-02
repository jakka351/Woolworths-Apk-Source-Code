package au.com.woolworths.feature.shop.homepage.presentation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.order.OrderCardUIKt;
import au.com.woolworths.sdui.legacy.scrollablelist.MoreCardTileUiKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfigKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                final HorizontalListDataInterface horizontalListDataInterface = (HorizontalListDataInterface) this.e;
                final HomeController homeController = (HomeController) this.f;
                final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) this.g;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.h(LazyRow, "$this$LazyRow");
                List h = horizontalListDataInterface.getH();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : h) {
                    if (obj2 instanceof RecipeCardSummaryData) {
                        arrayList.add(obj2);
                    }
                }
                final RecipeCardSummaryConfig recipeCardSummaryConfigA = RecipeCardSummaryConfigKt.a(arrayList);
                ArrayList arrayListB = CollectionsKt.B(horizontalListDataInterface.getH());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayListB, 10));
                Iterator it = arrayListB.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Unit unit = Unit.f24250a;
                    if (!zHasNext) {
                        return unit;
                    }
                    Object next = it.next();
                    if (next instanceof RecipeCardSummaryData) {
                        final RecipeCardSummaryData recipeCardSummaryData = (RecipeCardSummaryData) next;
                        LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController$buildRecipesTile$1$1$2$1$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    final HorizontalListDataInterface horizontalListDataInterface2 = horizontalListDataInterface;
                                    final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                                    final RecipeCardSummaryData recipeCardSummaryData2 = recipeCardSummaryData;
                                    final RecipeCardSummaryConfig recipeCardSummaryConfig = recipeCardSummaryConfigA;
                                    final HomeController homeController2 = homeController;
                                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-562441842, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController$buildRecipesTile$1$1$2$1$1$1$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer2 = (Composer) obj6;
                                            if ((((Number) obj7).intValue() & 3) == 2 && composer2.c()) {
                                                composer2.j();
                                            } else {
                                                composer2.o(-1746271574);
                                                final HomeController homeController3 = homeController2;
                                                boolean zI = composer2.I(homeController3);
                                                final HorizontalListDataInterface horizontalListDataInterface3 = horizontalListDataInterface2;
                                                boolean zI2 = zI | composer2.I(horizontalListDataInterface3);
                                                final RecipeCardSummaryData recipeCardSummaryData3 = recipeCardSummaryData2;
                                                boolean zI3 = zI2 | composer2.I(recipeCardSummaryData3);
                                                Object objG = composer2.G();
                                                if (zI3 || objG == Composer.Companion.f1624a) {
                                                    objG = new Function0() { // from class: au.com.woolworths.feature.shop.homepage.presentation.d
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            HomePageViewModel homePageViewModel = homeController3.viewModel;
                                                            horizontalListDataInterface3.getD();
                                                            homePageViewModel.getClass();
                                                            homePageViewModel.w6(new HomePageContract.Actions.LaunchRecipeDetails(recipeCardSummaryData3.getId()));
                                                            return Unit.f24250a;
                                                        }
                                                    };
                                                    composer2.A(objG);
                                                }
                                                composer2.l();
                                                RecipeCardKt.a(recipeCardSummaryData3, recipeCardSummaryConfig, (Function0) objG, null, false, sharedIntrinsicHeightState2, composer2, 196616, 24);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer));
                                }
                                return Unit.f24250a;
                            }
                        }, true, 25547370), 3);
                    } else if (next instanceof RecipeMoreCard) {
                        LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController$buildRecipesTile$1$1$2$1$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    String strC = StringResources_androidKt.c(composer, R.string.recipe_horizontal_list_see_all_content_description);
                                    composer.o(-1633490746);
                                    HomeController homeController2 = homeController;
                                    boolean zI = composer.I(homeController2);
                                    HorizontalListDataInterface horizontalListDataInterface2 = horizontalListDataInterface;
                                    boolean zI2 = zI | composer.I(horizontalListDataInterface2);
                                    Object objG = composer.G();
                                    if (zI2 || objG == Composer.Companion.f1624a) {
                                        objG = new b(homeController2, horizontalListDataInterface2, 1);
                                        composer.A(objG);
                                    }
                                    composer.l();
                                    MoreCardTileUiKt.a(strC, null, sharedIntrinsicHeightState, BitmapDescriptorFactory.HUE_RED, (Function0) objG, composer, KyberEngine.KyberPolyBytes, 10);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1267063277), 3);
                    }
                    arrayList2.add(unit);
                }
            default:
                final HomePageFragment homePageFragment = (HomePageFragment) this.f;
                final FulfilmentStatusBannerData fulfilmentStatusBannerData = (FulfilmentStatusBannerData) this.g;
                LazyListScope LazyRow2 = (LazyListScope) obj;
                Intrinsics.h(LazyRow2, "$this$LazyRow");
                for (Object obj3 : ((HorizontalListData) this.e).getH()) {
                    if (obj3 instanceof OrderCardData) {
                        final OrderCardData orderCardData = (OrderCardData) obj3;
                        LazyListScope.i(LazyRow2, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment$ProcessHomeContentPageFeed$11$2$1$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyItemScope item = (LazyItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer.n(item) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer.c()) {
                                    composer.j();
                                } else {
                                    Modifier modifierH = PaddingKt.h(item.d(Modifier.Companion.d, 1.0f), 4, BitmapDescriptorFactory.HUE_RED, 2);
                                    composer.o(-1633490746);
                                    final HomePageFragment homePageFragment2 = homePageFragment;
                                    boolean zI = composer.I(homePageFragment2);
                                    final OrderCardData orderCardData2 = orderCardData;
                                    boolean zI2 = zI | composer.I(orderCardData2);
                                    Object objG = composer.G();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                    if (zI2 || objG == composer$Companion$Empty$1) {
                                        final int i = 0;
                                        objG = new Function0() { // from class: au.com.woolworths.feature.shop.homepage.presentation.i
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i) {
                                                    case 0:
                                                        homePageFragment2.h2().N4(orderCardData2);
                                                        break;
                                                    default:
                                                        homePageFragment2.h2().B3(orderCardData2);
                                                        break;
                                                }
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer.A(objG);
                                    }
                                    Function0 function0 = (Function0) objG;
                                    composer.l();
                                    composer.o(5004770);
                                    boolean zI3 = composer.I(homePageFragment2);
                                    Object objG2 = composer.G();
                                    if (zI3 || objG2 == composer$Companion$Empty$1) {
                                        objG2 = new g(homePageFragment2, 5);
                                        composer.A(objG2);
                                    }
                                    Function0 function02 = (Function0) objG2;
                                    composer.l();
                                    composer.o(-1633490746);
                                    boolean zI4 = composer.I(homePageFragment2) | composer.I(orderCardData2);
                                    Object objG3 = composer.G();
                                    if (zI4 || objG3 == composer$Companion$Empty$1) {
                                        final int i2 = 1;
                                        objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.homepage.presentation.i
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i2) {
                                                    case 0:
                                                        homePageFragment2.h2().N4(orderCardData2);
                                                        break;
                                                    default:
                                                        homePageFragment2.h2().B3(orderCardData2);
                                                        break;
                                                }
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer.A(objG3);
                                    }
                                    composer.l();
                                    OrderCardUIKt.c(orderCardData2, function0, function02, (Function0) objG3, modifierH, fulfilmentStatusBannerData, composer, 196608, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1974604137), 3);
                    }
                }
                return Unit.f24250a;
        }
    }
}
