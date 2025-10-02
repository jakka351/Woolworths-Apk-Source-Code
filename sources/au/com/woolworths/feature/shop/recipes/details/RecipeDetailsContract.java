package au.com.woolworths.feature.shop.recipes.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract;", "", "Actions", "ViewState", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeDetailsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;", "", "LaunchDeepLink", "LaunchRecipeDetails", "LaunchShop", "ShareRecipe", "HandleBannerClick", "LaunchLogin", "PerformSuccessHaptic", "LaunchProductListProductGroup", "LaunchFullPageVideoPlayer", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$HandleBannerClick;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchFullPageVideoPlayer;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchProductListProductGroup;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchShop;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$PerformSuccessHaptic;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$ShareRecipe;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$HandleBannerClick;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HandleBannerClick extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8002a;

            public HandleBannerClick(String link) {
                Intrinsics.h(link, "link");
                this.f8002a = link;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HandleBannerClick) && Intrinsics.c(this.f8002a, ((HandleBannerClick) obj).f8002a);
            }

            public final int hashCode() {
                return this.f8002a.hashCode();
            }

            public final String toString() {
                return YU.a.h("HandleBannerClick(link=", this.f8002a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8003a;

            public LaunchDeepLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f8003a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f8003a, ((LaunchDeepLink) obj).f8003a);
            }

            public final int hashCode() {
                return this.f8003a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchDeepLink(deepLink=", this.f8003a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchFullPageVideoPlayer;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchFullPageVideoPlayer extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final VideoData f8004a;
            public final long b;

            public LaunchFullPageVideoPlayer(VideoData videoData, long j) {
                Intrinsics.h(videoData, "videoData");
                this.f8004a = videoData;
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchFullPageVideoPlayer)) {
                    return false;
                }
                LaunchFullPageVideoPlayer launchFullPageVideoPlayer = (LaunchFullPageVideoPlayer) obj;
                return Intrinsics.c(this.f8004a, launchFullPageVideoPlayer.f8004a) && this.b == launchFullPageVideoPlayer.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (this.f8004a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchFullPageVideoPlayer(videoData=" + this.f8004a + ", videoProgress=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchLogin extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogin f8005a = new LaunchLogin();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchProductListProductGroup;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductListProductGroup extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8006a;
            public final String b;
            public final String c;

            public LaunchProductListProductGroup(String str, String str2, String str3) {
                this.f8006a = str;
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
                return Intrinsics.c(this.f8006a, launchProductListProductGroup.f8006a) && Intrinsics.c(this.b, launchProductListProductGroup.b) && Intrinsics.c(this.c, launchProductListProductGroup.c);
            }

            public final int hashCode() {
                int iHashCode = this.f8006a.hashCode() * 31;
                String str = this.b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return YU.a.o(YU.a.v("LaunchProductListProductGroup(groupId=", this.f8006a, ", title=", this.b, ", type="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRecipeDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8007a;

            public LaunchRecipeDetails(String id) {
                Intrinsics.h(id, "id");
                this.f8007a = id;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRecipeDetails) && Intrinsics.c(this.f8007a, ((LaunchRecipeDetails) obj).f8007a);
            }

            public final int hashCode() {
                return this.f8007a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchRecipeDetails(id=", this.f8007a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$LaunchShop;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchShop extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final RecipeDetailData f8008a;

            public LaunchShop(RecipeDetailData data) {
                Intrinsics.h(data, "data");
                this.f8008a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchShop) && Intrinsics.c(this.f8008a, ((LaunchShop) obj).f8008a);
            }

            public final int hashCode() {
                return this.f8008a.hashCode();
            }

            public final String toString() {
                return "LaunchShop(data=" + this.f8008a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$PerformSuccessHaptic;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformSuccessHaptic extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformSuccessHaptic f8009a = new PerformSuccessHaptic();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformSuccessHaptic);
            }

            public final int hashCode() {
                return -932821126;
            }

            public final String toString() {
                return "PerformSuccessHaptic";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions$ShareRecipe;", "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShareRecipe extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8010a;

            public ShareRecipe(String recipeUrl) {
                Intrinsics.h(recipeUrl, "recipeUrl");
                this.f8010a = recipeUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShareRecipe) && Intrinsics.c(this.f8010a, ((ShareRecipe) obj).f8010a);
            }

            public final int hashCode() {
                return this.f8010a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShareRecipe(recipeUrl=", this.f8010a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$ViewState;", "", "Companion", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState g = new ViewState(false, null, null, null, null, 0);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8011a;
        public final RecipeDetailData b;
        public final RecipeDetailsFullPageErrorState c;
        public final String d;
        public final Integer e;
        public final long f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$ViewState$Companion;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z, RecipeDetailData recipeDetailData, RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState, String str, Integer num, long j) {
            this.f8011a = z;
            this.b = recipeDetailData;
            this.c = recipeDetailsFullPageErrorState;
            this.d = str;
            this.e = num;
            this.f = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8011a == viewState.f8011a && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && this.f == viewState.f;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f8011a) * 31;
            RecipeDetailData recipeDetailData = this.b;
            int iHashCode2 = (iHashCode + (recipeDetailData == null ? 0 : recipeDetailData.hashCode())) * 31;
            RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState = this.c;
            int iHashCode3 = (iHashCode2 + (recipeDetailsFullPageErrorState == null ? 0 : recipeDetailsFullPageErrorState.hashCode())) * 31;
            String str = this.d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.e;
            return Long.hashCode(this.f) + ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f8011a + ", recipeDetailData=" + this.b + ", errorState=" + this.c + ", snackbarMessage=" + this.d + ", cartItemCount=" + this.e + ", videoProgress=" + this.f + ")";
        }
    }
}
