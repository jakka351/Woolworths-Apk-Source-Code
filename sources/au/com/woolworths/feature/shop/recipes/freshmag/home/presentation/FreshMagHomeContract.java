package au.com.woolworths.feature.shop.recipes.freshmag.home.presentation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeData;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract;", "", "ViewState", "PageState", "Actions", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FreshMagHomeContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions;", "", "LaunchRecipeDetails", "LaunchDeepLink", "LaunchFreshMagContent", "LaunchCart", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions$LaunchCart;", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions$LaunchFreshMagContent;", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions$LaunchRecipeDetails;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions$LaunchCart;", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCart extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCart f8058a = new LaunchCart();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchCart);
            }

            public final int hashCode() {
                return -935683894;
            }

            public final String toString() {
                return "LaunchCart";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8059a;

            public LaunchDeepLink(String str) {
                this.f8059a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f8059a, ((LaunchDeepLink) obj).f8059a);
            }

            public final int hashCode() {
                return this.f8059a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchDeepLink(deepLink=", this.f8059a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions$LaunchFreshMagContent;", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchFreshMagContent extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8060a;

            public LaunchFreshMagContent(String id) {
                Intrinsics.h(id, "id");
                this.f8060a = id;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchFreshMagContent) && Intrinsics.c(this.f8060a, ((LaunchFreshMagContent) obj).f8060a);
            }

            public final int hashCode() {
                return this.f8060a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchFreshMagContent(id=", this.f8060a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions$LaunchRecipeDetails;", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRecipeDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8061a;

            public LaunchRecipeDetails(String id) {
                Intrinsics.h(id, "id");
                this.f8061a = id;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRecipeDetails) && Intrinsics.c(this.f8061a, ((LaunchRecipeDetails) obj).f8061a);
            }

            public final int hashCode() {
                return this.f8061a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchRecipeDetails(id=", this.f8061a, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$PageState;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageState {
        public static final PageState d;
        public static final PageState e;
        public static final PageState f;
        public static final /* synthetic */ PageState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            PageState pageState = new PageState("LOADING", 0);
            d = pageState;
            PageState pageState2 = new PageState("FRESH_MAG_HOME", 1);
            e = pageState2;
            PageState pageState3 = new PageState("ERROR", 2);
            f = pageState3;
            PageState[] pageStateArr = {pageState, pageState2, pageState3};
            g = pageStateArr;
            h = EnumEntriesKt.a(pageStateArr);
        }

        public static PageState valueOf(String str) {
            return (PageState) Enum.valueOf(PageState.class, str);
        }

        public static PageState[] values() {
            return (PageState[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$ViewState;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final PageState f8062a;
        public final FreshMagHomeErrorState b;
        public final FreshMagHomeData c;
        public final Integer d;

        public ViewState(PageState pageState, FreshMagHomeErrorState freshMagHomeErrorState, FreshMagHomeData freshMagHomeData, Integer num) {
            this.f8062a = pageState;
            this.b = freshMagHomeErrorState;
            this.c = freshMagHomeData;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8062a == viewState.f8062a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d);
        }

        public final int hashCode() {
            int iHashCode = this.f8062a.hashCode() * 31;
            FreshMagHomeErrorState freshMagHomeErrorState = this.b;
            int iHashCode2 = (iHashCode + (freshMagHomeErrorState == null ? 0 : freshMagHomeErrorState.hashCode())) * 31;
            FreshMagHomeData freshMagHomeData = this.c;
            int iHashCode3 = (iHashCode2 + (freshMagHomeData == null ? 0 : freshMagHomeData.f8052a.hashCode())) * 31;
            Integer num = this.d;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(pageState=" + this.f8062a + ", errorState=" + this.b + ", freshMagHomeData=" + this.c + ", cartItemCount=" + this.d + ")";
        }
    }
}
