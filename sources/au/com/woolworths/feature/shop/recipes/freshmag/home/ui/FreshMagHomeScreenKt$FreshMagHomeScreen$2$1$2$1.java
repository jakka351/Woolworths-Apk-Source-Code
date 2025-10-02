package au.com.woolworths.feature.shop.recipes.freshmag.home.ui;

import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeAction;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeContract;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class FreshMagHomeScreenKt$FreshMagHomeScreen$2$1$2$1 extends FunctionReferenceImpl implements Function2<HorizontalListData, Object, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object p1) {
        HorizontalListData p0 = (HorizontalListData) obj;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        FreshMagHomeViewModel freshMagHomeViewModel = (FreshMagHomeViewModel) this.receiver;
        freshMagHomeViewModel.getClass();
        if (p1 instanceof RecipeCardSummaryData) {
            freshMagHomeViewModel.N1((RecipeCardSummaryData) p1);
        } else if (p1 instanceof RecipeMoreCard) {
            freshMagHomeViewModel.g.c(FreshMagHomeAction.k);
            String g = p0.getG();
            if (g != null) {
                freshMagHomeViewModel.l.f(new FreshMagHomeContract.Actions.LaunchDeepLink(g));
            }
        }
        return Unit.f24250a;
    }
}
