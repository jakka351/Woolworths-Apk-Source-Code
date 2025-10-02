package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract;", "", "ViewState", "FreshMagContent", "PageState", "Action", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FreshMagContentContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$Action;", "", "SeekPage", "LaunchCart", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$Action$LaunchCart;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$Action$SeekPage;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$Action$LaunchCart;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$Action;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCart extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCart f8038a = new LaunchCart();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchCart);
            }

            public final int hashCode() {
                return 1345179921;
            }

            public final String toString() {
                return "LaunchCart";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$Action$SeekPage;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$Action;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SeekPage extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final int f8039a;

            public SeekPage(int i) {
                this.f8039a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SeekPage) && this.f8039a == ((SeekPage) obj).f8039a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f8039a);
            }

            public final String toString() {
                return a.e(this.f8039a, "SeekPage(page=", ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$FreshMagContent;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FreshMagContent {

        /* renamed from: a, reason: collision with root package name */
        public final List f8040a;
        public final int b;

        public FreshMagContent(List list, int i) {
            this.f8040a = list;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FreshMagContent)) {
                return false;
            }
            FreshMagContent freshMagContent = (FreshMagContent) obj;
            return Intrinsics.c(this.f8040a, freshMagContent.f8040a) && this.b == freshMagContent.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f8040a.hashCode() * 31);
        }

        public final String toString() {
            return "FreshMagContent(pages=" + this.f8040a + ", selectedPage=" + this.b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$PageState;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageState {
        public static final PageState d;
        public static final PageState e;
        public static final PageState f;
        public static final /* synthetic */ PageState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            PageState pageState = new PageState("LOADING", 0);
            d = pageState;
            PageState pageState2 = new PageState("FRESH_MAG_CONTENT", 1);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$ViewState;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final PageState f8041a;
        public final FreshMagContentErrorState b;
        public final FreshMagContent c;
        public final Integer d;

        public ViewState(PageState pageState, FreshMagContentErrorState freshMagContentErrorState, FreshMagContent freshMagContent, Integer num) {
            this.f8041a = pageState;
            this.b = freshMagContentErrorState;
            this.c = freshMagContent;
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
            return this.f8041a == viewState.f8041a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d);
        }

        public final int hashCode() {
            int iHashCode = this.f8041a.hashCode() * 31;
            FreshMagContentErrorState freshMagContentErrorState = this.b;
            int iHashCode2 = (iHashCode + (freshMagContentErrorState == null ? 0 : freshMagContentErrorState.hashCode())) * 31;
            FreshMagContent freshMagContent = this.c;
            int iHashCode3 = (iHashCode2 + (freshMagContent == null ? 0 : freshMagContent.hashCode())) * 31;
            Integer num = this.d;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(pageState=" + this.f8041a + ", errorState=" + this.b + ", freshMagContent=" + this.c + ", cartItemCount=" + this.d + ")";
        }
    }
}
