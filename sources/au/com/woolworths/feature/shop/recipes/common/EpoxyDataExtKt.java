package au.com.woolworths.feature.shop.recipes.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.feature.shop.recipes.ItemRecipeSeeAllCardBindingModel_;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeListener;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfigKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import com.airbnb.epoxy.ComposeEpoxyModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EpoxyDataExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.airbnb.epoxy.ComposeEpoxyModel, com.airbnb.epoxy.EpoxyModel] */
    public static final ArrayList a(HorizontalListData horizontalListData, HorizontalListData horizontalListData2, HorizontalListActionClickListener horizontalListActionClickListener, final FreshMagHomeListener freshMagHomeListener) {
        ItemRecipeSeeAllCardBindingModel_ itemRecipeSeeAllCardBindingModel_;
        Intrinsics.h(horizontalListActionClickListener, "horizontalListActionClickListener");
        Intrinsics.h(freshMagHomeListener, "freshMagHomeListener");
        List<Object> h = horizontalListData.getH();
        final ArrayList arrayList = new ArrayList();
        for (Object obj : h) {
            if (obj instanceof RecipeCardSummaryData) {
                arrayList.add(obj);
            }
        }
        List<Object> h2 = horizontalListData.getH();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : h2) {
            if (obj2 instanceof RecipeCardSummaryData) {
                final RecipeCardSummaryData recipeCardSummaryData = (RecipeCardSummaryData) obj2;
                ?? composeEpoxyModel = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.common.EpoxyDataExtKt$buildLatestRecipesCarouselModels$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Composer composer = (Composer) obj3;
                        if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            composer.o(1849434622);
                            Object objG = composer.G();
                            if (objG == Composer.Companion.f1624a) {
                                objG = new SharedIntrinsicHeightState();
                                composer.A(objG);
                            }
                            final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objG;
                            composer.l();
                            final RecipeCardSummaryConfig recipeCardSummaryConfigA = RecipeCardSummaryConfigKt.a(arrayList);
                            final RecipeCardSummaryData recipeCardSummaryData2 = recipeCardSummaryData;
                            final FreshMagHomeListener freshMagHomeListener2 = freshMagHomeListener;
                            CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1688203007, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.common.EpoxyDataExtKt$buildLatestRecipesCarouselModels$1$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    Composer composer2 = (Composer) obj5;
                                    if ((((Number) obj6).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        composer2.o(-1633490746);
                                        Object obj7 = freshMagHomeListener2;
                                        boolean zI = composer2.I(obj7);
                                        RecipeCardSummaryData recipeCardSummaryData3 = recipeCardSummaryData2;
                                        boolean zI2 = zI | composer2.I(recipeCardSummaryData3);
                                        Object objG2 = composer2.G();
                                        if (zI2 || objG2 == Composer.Companion.f1624a) {
                                            objG2 = new f(10, obj7, recipeCardSummaryData3);
                                            composer2.A(objG2);
                                        }
                                        composer2.l();
                                        RecipeCardKt.a(recipeCardSummaryData3, recipeCardSummaryConfigA, (Function0) objG2, null, false, sharedIntrinsicHeightState, composer2, 196616, 24);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer));
                        }
                        return Unit.f24250a;
                    }
                }, true, 1450095013));
                composeEpoxyModel.p("recipe_card_" + recipeCardSummaryData.getId());
                itemRecipeSeeAllCardBindingModel_ = composeEpoxyModel;
            } else if (obj2 instanceof RecipeMoreCard) {
                ItemRecipeSeeAllCardBindingModel_ itemRecipeSeeAllCardBindingModel_2 = new ItemRecipeSeeAllCardBindingModel_();
                itemRecipeSeeAllCardBindingModel_2.M();
                itemRecipeSeeAllCardBindingModel_2.t();
                itemRecipeSeeAllCardBindingModel_2.n = horizontalListData2;
                itemRecipeSeeAllCardBindingModel_2.t();
                itemRecipeSeeAllCardBindingModel_2.o = horizontalListActionClickListener;
                itemRecipeSeeAllCardBindingModel_ = itemRecipeSeeAllCardBindingModel_2;
            } else {
                Bark.Companion companion = Bark.f8483a;
                Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.k), "HorizontalListData with items of type " + obj2 + " is not expected and can't be displayed", null);
                itemRecipeSeeAllCardBindingModel_ = null;
            }
            if (itemRecipeSeeAllCardBindingModel_ != null) {
                arrayList2.add(itemRecipeSeeAllCardBindingModel_);
            }
        }
        return CollectionsKt.J0(arrayList2);
    }
}
