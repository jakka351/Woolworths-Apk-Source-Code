package au.com.woolworths.feature.shop.recipes.details.ui;

import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ HorizontalListData f;
    public final /* synthetic */ HorizontalListItem g;

    public /* synthetic */ h(Function2 function2, HorizontalListData horizontalListData, HorizontalListItem horizontalListItem, int i) {
        this.d = i;
        this.e = function2;
        this.f = horizontalListData;
        this.g = horizontalListItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f, (RecipeCardSummaryData) this.g);
                break;
            default:
                this.e.invoke(this.f, (RecipeMoreCard) this.g);
                break;
        }
        return Unit.f24250a;
    }
}
