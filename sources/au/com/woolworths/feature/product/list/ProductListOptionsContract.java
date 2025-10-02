package au.com.woolworths.feature.product.list;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.feature.product.list.ui.ChildFilterMenuState;
import au.com.woolworths.feature.product.list.ui.SortOptionsDisplayMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract;", "", "ViewState", "Actions", "FilterOptionsActions", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductListOptionsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions;", "", "SeeResults", "ShowMessage", "LaunchFilterOptions", "LaunchMarketplaceHowItWorks", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions$LaunchFilterOptions;", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions$LaunchMarketplaceHowItWorks;", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions$SeeResults;", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions$ShowMessage;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions$LaunchFilterOptions;", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchFilterOptions extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5253a;

            public LaunchFilterOptions(String filterId) {
                Intrinsics.h(filterId, "filterId");
                this.f5253a = filterId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchFilterOptions) && Intrinsics.c(this.f5253a, ((LaunchFilterOptions) obj).f5253a);
            }

            public final int hashCode() {
                return this.f5253a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchFilterOptions(filterId=", this.f5253a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions$LaunchMarketplaceHowItWorks;", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchMarketplaceHowItWorks extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final InfoSection f5254a;

            public LaunchMarketplaceHowItWorks(InfoSection infoSection) {
                Intrinsics.h(infoSection, "infoSection");
                this.f5254a = infoSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchMarketplaceHowItWorks) && Intrinsics.c(this.f5254a, ((LaunchMarketplaceHowItWorks) obj).f5254a);
            }

            public final int hashCode() {
                return this.f5254a.hashCode();
            }

            public final String toString() {
                return "LaunchMarketplaceHowItWorks(infoSection=" + this.f5254a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions$SeeResults;", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SeeResults extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductsDisplayMode f5255a;

            public SeeResults(ProductsDisplayMode productsDisplayMode) {
                this.f5255a = productsDisplayMode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SeeResults) && this.f5255a == ((SeeResults) obj).f5255a;
            }

            public final int hashCode() {
                return this.f5255a.hashCode();
            }

            public final String toString() {
                return "SeeResults(displayMode=" + this.f5255a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions$ShowMessage;", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f5256a;

            public ShowMessage(ResText resText) {
                this.f5256a = resText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowMessage) && Intrinsics.c(this.f5256a, ((ShowMessage) obj).f5256a);
            }

            public final int hashCode() {
                return this.f5256a.hashCode();
            }

            public final String toString() {
                return "ShowMessage(messageText=" + this.f5256a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract$FilterOptionsActions;", "", "OpenUrl", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$FilterOptionsActions$OpenUrl;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class FilterOptionsActions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract$FilterOptionsActions$OpenUrl;", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$FilterOptionsActions;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends FilterOptionsActions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5257a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f5257a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f5257a, ((OpenUrl) obj).f5257a);
            }

            public final int hashCode() {
                return this.f5257a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f5257a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsContract$ViewState;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f5258a;
        public final SortOptionsDisplayMode b;
        public final Text c;
        public final String d;
        public final List e;
        public final List f;
        public final boolean g;
        public final ChildFilterMenuState h;
        public final int i;
        public final StatefulButtonState j;

        public ViewState(boolean z, SortOptionsDisplayMode sortOptionsDisplayMode, Text pageTitle, String str, List productListOptionsItems, List productListOptionsFilters, boolean z2, ChildFilterMenuState childFilterMenuState, int i, StatefulButtonState statefulButtonState) {
            Intrinsics.h(pageTitle, "pageTitle");
            Intrinsics.h(productListOptionsItems, "productListOptionsItems");
            Intrinsics.h(productListOptionsFilters, "productListOptionsFilters");
            this.f5258a = z;
            this.b = sortOptionsDisplayMode;
            this.c = pageTitle;
            this.d = str;
            this.e = productListOptionsItems;
            this.f = productListOptionsFilters;
            this.g = z2;
            this.h = childFilterMenuState;
            this.i = i;
            this.j = statefulButtonState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v14, types: [java.util.List] */
        public static ViewState a(ViewState viewState, boolean z, SortOptionsDisplayMode sortOptionsDisplayMode, Text text, String str, ArrayList arrayList, List list, boolean z2, ChildFilterMenuState childFilterMenuState, int i, int i2) {
            if ((i2 & 1) != 0) {
                z = viewState.f5258a;
            }
            boolean z3 = z;
            if ((i2 & 2) != 0) {
                sortOptionsDisplayMode = viewState.b;
            }
            SortOptionsDisplayMode sortOptionsDisplayMode2 = sortOptionsDisplayMode;
            if ((i2 & 4) != 0) {
                text = viewState.c;
            }
            Text pageTitle = text;
            if ((i2 & 8) != 0) {
                str = viewState.d;
            }
            String str2 = str;
            ArrayList productListOptionsItems = (i2 & 16) != 0 ? viewState.e : arrayList;
            viewState.getClass();
            List productListOptionsFilters = (i2 & 64) != 0 ? viewState.f : list;
            viewState.getClass();
            boolean z4 = (i2 & 256) != 0 ? viewState.g : z2;
            ChildFilterMenuState childFilterMenuState2 = (i2 & 512) != 0 ? viewState.h : childFilterMenuState;
            int i3 = (i2 & 1024) != 0 ? viewState.i : i;
            StatefulButtonState seeResultsButtonState = viewState.j;
            viewState.getClass();
            Intrinsics.h(sortOptionsDisplayMode2, "sortOptionsDisplayMode");
            Intrinsics.h(pageTitle, "pageTitle");
            Intrinsics.h(productListOptionsItems, "productListOptionsItems");
            Intrinsics.h(productListOptionsFilters, "productListOptionsFilters");
            Intrinsics.h(childFilterMenuState2, "childFilterMenuState");
            Intrinsics.h(seeResultsButtonState, "seeResultsButtonState");
            return new ViewState(z3, sortOptionsDisplayMode2, pageTitle, str2, productListOptionsItems, productListOptionsFilters, z4, childFilterMenuState2, i3, seeResultsButtonState);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f5258a == viewState.f5258a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && this.g == viewState.g && this.h == viewState.h && this.i == viewState.i && this.j == viewState.j;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f5258a) * 31)) * 31)) * 31;
            String str = this.d;
            return this.j.hashCode() + androidx.camera.core.impl.b.a(this.i, (this.h.hashCode() + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 961, this.e), 961, this.f), 31, this.g)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isLoading=");
            sb.append(this.f5258a);
            sb.append(", sortOptionsDisplayMode=");
            sb.append(this.b);
            sb.append(", pageTitle=");
            sb.append(this.c);
            sb.append(", visibleFiltersParentKey=");
            sb.append(this.d);
            sb.append(", productListOptionsItems=");
            au.com.woolworths.android.onesite.a.C(sb, this.e, ", sortOptionsInsetBanner=null, productListOptionsFilters=", this.f, ", marketplaceSwitchChecked=null, resetMenuItemEnabled=");
            sb.append(this.g);
            sb.append(", childFilterMenuState=");
            sb.append(this.h);
            sb.append(", totalNumberOfResults=");
            sb.append(this.i);
            sb.append(", seeResultsButtonState=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ViewState(Text text, List list, List list2, int i) {
            SortOptionsDisplayMode sortOptionsDisplayMode = SortOptionsDisplayMode.e;
            Text resText = (i & 4) != 0 ? new ResText(com.woolworths.R.string.product_list_filter) : text;
            int i2 = i & 16;
            EmptyList emptyList = EmptyList.d;
            this(false, sortOptionsDisplayMode, resText, null, i2 != 0 ? emptyList : list, (i & 64) != 0 ? emptyList : list2, false, ChildFilterMenuState.e, (i & 1024) != 0 ? 0 : 10, StatefulButtonState.d);
        }
    }
}
