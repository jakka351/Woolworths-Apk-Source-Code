package au.com.woolworths.feature.shop.recipes.recipes.list;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract;", "", "Actions", "ViewState", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RecipesListContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions;", "", "HandleBannerClick", "LaunchProductListProductGroup", "LaunchRecipeDetails", "LaunchRecipeSearch", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions$HandleBannerClick;", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions$LaunchProductListProductGroup;", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions$LaunchRecipeSearch;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions$HandleBannerClick;", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HandleBannerClick extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8077a;

            public HandleBannerClick(String link) {
                Intrinsics.h(link, "link");
                this.f8077a = link;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HandleBannerClick) && Intrinsics.c(this.f8077a, ((HandleBannerClick) obj).f8077a);
            }

            public final int hashCode() {
                return this.f8077a.hashCode();
            }

            public final String toString() {
                return YU.a.h("HandleBannerClick(link=", this.f8077a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions$LaunchProductListProductGroup;", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductListProductGroup extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8078a;
            public final String b;
            public final String c;

            public LaunchProductListProductGroup(String str, String str2, String str3) {
                this.f8078a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductListProductGroup)) {
                    return false;
                }
                LaunchProductListProductGroup launchProductListProductGroup = (LaunchProductListProductGroup) obj;
                return Intrinsics.c(this.f8078a, launchProductListProductGroup.f8078a) && Intrinsics.c(this.b, launchProductListProductGroup.b) && Intrinsics.c(this.c, launchProductListProductGroup.c);
            }

            public final int hashCode() {
                int iHashCode = this.f8078a.hashCode() * 31;
                String str = this.b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return YU.a.o(YU.a.v("LaunchProductListProductGroup(groupId=", this.f8078a, ", title=", this.b, ", type="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRecipeDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8079a;

            public LaunchRecipeDetails(String recipeId) {
                Intrinsics.h(recipeId, "recipeId");
                this.f8079a = recipeId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRecipeDetails) && Intrinsics.c(this.f8079a, ((LaunchRecipeDetails) obj).f8079a);
            }

            public final int hashCode() {
                return this.f8079a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchRecipeDetails(recipeId=", this.f8079a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions$LaunchRecipeSearch;", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRecipeSearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8080a;

            public LaunchRecipeSearch(String searchTerm) {
                Intrinsics.h(searchTerm, "searchTerm");
                this.f8080a = searchTerm;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRecipeSearch) && Intrinsics.c(this.f8080a, ((LaunchRecipeSearch) obj).f8080a);
            }

            public final int hashCode() {
                return this.f8080a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchRecipeSearch(searchTerm=", this.f8080a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$ViewState;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8081a;
        public final int b;
        public final FullPageErrorCause c;

        public ViewState(boolean z, int i, RecipeListFullPageErrorState recipeListFullPageErrorState) {
            this.f8081a = z;
            this.b = i;
            this.c = recipeListFullPageErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8081a == viewState.f8081a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            int iA = androidx.camera.core.impl.b.a(this.b, Boolean.hashCode(this.f8081a) * 31, 31);
            FullPageErrorCause fullPageErrorCause = this.c;
            return iA + (fullPageErrorCause == null ? 0 : fullPageErrorCause.hashCode());
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f8081a + ", totalCount=" + this.b + ", errorState=" + this.c + ")";
        }
    }
}
