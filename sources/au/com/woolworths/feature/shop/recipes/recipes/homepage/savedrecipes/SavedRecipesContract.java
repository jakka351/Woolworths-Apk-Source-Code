package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesContract;", "", "Actions", "ViewState", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SavedRecipesContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesContract$Actions;", "", "LaunchRecipeDetails", "LaunchLogin", "Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesContract$Actions$LaunchRecipeDetails;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesContract$Actions;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchLogin extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogin f8069a = new LaunchLogin();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesContract$Actions;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRecipeDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8070a;

            public LaunchRecipeDetails(String recipeId) {
                Intrinsics.h(recipeId, "recipeId");
                this.f8070a = recipeId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRecipeDetails) && Intrinsics.c(this.f8070a, ((LaunchRecipeDetails) obj).f8070a);
            }

            public final int hashCode() {
                return this.f8070a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchRecipeDetails(recipeId=", this.f8070a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesContract$ViewState;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8071a;
        public final FullPageErrorCause b;
        public final List c;

        public ViewState(boolean z, SavedRecipesFullPageErrorState savedRecipesFullPageErrorState, List content) {
            Intrinsics.h(content, "content");
            this.f8071a = z;
            this.b = savedRecipesFullPageErrorState;
            this.c = content;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8071a == viewState.f8071a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f8071a) * 31;
            FullPageErrorCause fullPageErrorCause = this.b;
            return this.c.hashCode() + ((iHashCode + (fullPageErrorCause == null ? 0 : fullPageErrorCause.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isLoading=");
            sb.append(this.f8071a);
            sb.append(", errorState=");
            sb.append(this.b);
            sb.append(", content=");
            return android.support.v4.media.session.a.t(sb, this.c, ")");
        }
    }
}
