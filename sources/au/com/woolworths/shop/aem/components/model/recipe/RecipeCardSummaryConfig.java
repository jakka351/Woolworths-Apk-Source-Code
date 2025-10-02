package au.com.woolworths.shop.aem.components.model.recipe;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCardSummaryConfig;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RecipeCardSummaryConfig {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10180a;
    public final boolean b;

    public /* synthetic */ RecipeCardSummaryConfig(int i) {
        this((i & 1) == 0, (i & 2) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeCardSummaryConfig)) {
            return false;
        }
        RecipeCardSummaryConfig recipeCardSummaryConfig = (RecipeCardSummaryConfig) obj;
        return this.f10180a == recipeCardSummaryConfig.f10180a && this.b == recipeCardSummaryConfig.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f10180a) * 31);
    }

    public final String toString() {
        return "RecipeCardSummaryConfig(showTimingsSpace=" + this.f10180a + ", showCostPerServeSpace=" + this.b + ")";
    }

    public RecipeCardSummaryConfig(boolean z, boolean z2) {
        this.f10180a = z;
        this.b = z2;
    }
}
