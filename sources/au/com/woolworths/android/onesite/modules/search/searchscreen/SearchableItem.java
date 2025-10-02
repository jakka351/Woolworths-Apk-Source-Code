package au.com.woolworths.android.onesite.modules.search.searchscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchAutoCompleteAdapter;
import au.com.woolworths.feature.shop.trafficdrivers.data.TrafficDriverItem;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem;", "", "AutoCompleteItem", "FeaturedBrandItem", "HeaderItem", "PopularHeaderItem", "PopularSuggestedSearch", "SuggestedSearch", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$AutoCompleteItem;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$FeaturedBrandItem;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$HeaderItem;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$PopularHeaderItem;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$PopularSuggestedSearch;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$SuggestedSearch;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SearchableItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$AutoCompleteItem;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutoCompleteItem implements SearchableItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f4426a;

        public AutoCompleteItem(String autoCompleteItem) {
            Intrinsics.h(autoCompleteItem, "autoCompleteItem");
            this.f4426a = autoCompleteItem;
        }

        @Override // au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem
        public final int a() {
            SearchAutoCompleteAdapter.SearchItemViewType[] searchItemViewTypeArr = SearchAutoCompleteAdapter.SearchItemViewType.d;
            return R.layout.item_search_result;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AutoCompleteItem) && Intrinsics.c(this.f4426a, ((AutoCompleteItem) obj).f4426a);
        }

        public final int hashCode() {
            return this.f4426a.hashCode();
        }

        public final String toString() {
            return YU.a.h("AutoCompleteItem(autoCompleteItem=", this.f4426a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$FeaturedBrandItem;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeaturedBrandItem implements SearchableItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f4427a;
        public final TrafficDriverItem b;
        public final AnalyticsData c;

        public FeaturedBrandItem(String searchTerm, TrafficDriverItem item, AnalyticsData analyticsData) {
            Intrinsics.h(searchTerm, "searchTerm");
            Intrinsics.h(item, "item");
            this.f4427a = searchTerm;
            this.b = item;
            this.c = analyticsData;
        }

        @Override // au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem
        public final int a() {
            SearchAutoCompleteAdapter.SearchItemViewType[] searchItemViewTypeArr = SearchAutoCompleteAdapter.SearchItemViewType.d;
            return R.layout.item_featured_brand;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeaturedBrandItem)) {
                return false;
            }
            FeaturedBrandItem featuredBrandItem = (FeaturedBrandItem) obj;
            return Intrinsics.c(this.f4427a, featuredBrandItem.f4427a) && Intrinsics.c(this.b, featuredBrandItem.b) && Intrinsics.c(this.c, featuredBrandItem.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f4427a.hashCode() * 31)) * 31;
            AnalyticsData analyticsData = this.c;
            return iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeaturedBrandItem(searchTerm=");
            sb.append(this.f4427a);
            sb.append(", item=");
            sb.append(this.b);
            sb.append(", analyticsData=");
            return au.com.woolworths.android.onesite.a.n(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$HeaderItem;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderItem implements SearchableItem {
        @Override // au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem
        public final int a() {
            SearchAutoCompleteAdapter.SearchItemViewType[] searchItemViewTypeArr = SearchAutoCompleteAdapter.SearchItemViewType.d;
            return R.layout.item_suggested_search_header;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HeaderItem);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (Integer.hashCode(R.string.recent_search_recent_header_text) * 31);
        }

        public final String toString() {
            return "HeaderItem(headerResource=2132018793, isClearable=true)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$PopularHeaderItem;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PopularHeaderItem implements SearchableItem {
        @Override // au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem
        public final int a() {
            SearchAutoCompleteAdapter.SearchItemViewType[] searchItemViewTypeArr = SearchAutoCompleteAdapter.SearchItemViewType.d;
            return R.layout.item_popular_search_header;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PopularHeaderItem);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Integer.hashCode(R.string.search_popular_header_text) * 31);
        }

        public final String toString() {
            return "PopularHeaderItem(headerResource=2132019117, isClearable=false)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$PopularSuggestedSearch;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PopularSuggestedSearch implements SearchableItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f4428a;

        public PopularSuggestedSearch(String suggestion) {
            Intrinsics.h(suggestion, "suggestion");
            this.f4428a = suggestion;
        }

        @Override // au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem
        public final int a() {
            SearchAutoCompleteAdapter.SearchItemViewType[] searchItemViewTypeArr = SearchAutoCompleteAdapter.SearchItemViewType.d;
            return R.layout.item_popular_search;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PopularSuggestedSearch) && Intrinsics.c(this.f4428a, ((PopularSuggestedSearch) obj).f4428a);
        }

        public final int hashCode() {
            return this.f4428a.hashCode();
        }

        public final String toString() {
            return YU.a.h("PopularSuggestedSearch(suggestion=", this.f4428a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem$SuggestedSearch;", "Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchableItem;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SuggestedSearch implements SearchableItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f4429a;

        public SuggestedSearch(String suggestion) {
            Intrinsics.h(suggestion, "suggestion");
            this.f4429a = suggestion;
        }

        @Override // au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem
        public final int a() {
            SearchAutoCompleteAdapter.SearchItemViewType[] searchItemViewTypeArr = SearchAutoCompleteAdapter.SearchItemViewType.d;
            return R.layout.item_suggested_search;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestedSearch) && Intrinsics.c(this.f4429a, ((SuggestedSearch) obj).f4429a);
        }

        public final int hashCode() {
            return this.f4429a.hashCode();
        }

        public final String toString() {
            return YU.a.h("SuggestedSearch(suggestion=", this.f4429a, ")");
        }
    }

    int a();
}
