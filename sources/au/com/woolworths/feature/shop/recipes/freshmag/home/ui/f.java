package au.com.woolworths.feature.shop.recipes.freshmag.home.ui;

import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ HorizontalListData f;
    public final /* synthetic */ HorizontalListItem g;

    public /* synthetic */ f(Function2 function2, HorizontalListData horizontalListData, HorizontalListItem horizontalListItem, int i) {
        this.d = i;
        this.e = function2;
        this.f = horizontalListData;
        this.g = horizontalListItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                RecipeCardSummaryData recipeCardSummaryData = (RecipeCardSummaryData) this.g;
                Function2 function2 = this.e;
                if (function2 != null) {
                    function2.invoke(this.f, recipeCardSummaryData);
                }
                break;
            default:
                RecipeMoreCard recipeMoreCard = (RecipeMoreCard) this.g;
                Function2 function22 = this.e;
                if (function22 != null) {
                    function22.invoke(this.f, recipeMoreCard);
                }
                break;
        }
        return Unit.f24250a;
    }
}
