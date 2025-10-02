package au.com.woolworths.android.onesite.modules.search.searchscreen;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.analytics.adobe.data.SearchData;
import au.com.woolworths.android.onesite.databinding.ItemFeaturedBrandBinding;
import au.com.woolworths.android.onesite.databinding.ItemPopularSearchBinding;
import au.com.woolworths.android.onesite.databinding.ItemPopularSearchHeaderBinding;
import au.com.woolworths.android.onesite.databinding.ItemSuggestedSearchBinding;
import au.com.woolworths.android.onesite.databinding.ItemSuggestedSearchHeaderBinding;
import au.com.woolworths.android.onesite.legacy.databinding.ItemSearchResultBinding;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.feature.shop.trafficdrivers.data.TrafficDriverItem;
import au.com.woolworths.feature.shop.trafficdrivers.ui.TrafficDriverView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import java.util.LinkedList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchAutoCompleteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "SearchItemViewType", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchAutoCompleteAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final SearchViewModel g;
    public String h;
    public final LinkedList i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchAutoCompleteAdapter$SearchItemViewType;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchItemViewType {
        public static final /* synthetic */ SearchItemViewType[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            SearchItemViewType[] searchItemViewTypeArr = {new SearchItemViewType("SEARCH_RESULT", 0), new SearchItemViewType("SUGGESTED_SEARCH_HEADER", 1), new SearchItemViewType("SUGGESTED_SEARCH", 2), new SearchItemViewType("FEATURED_BRAND", 3), new SearchItemViewType("POPULAR_SEARCH_HEADER", 4), new SearchItemViewType("POPULAR_SUGGESTED_SEARCH", 5)};
            d = searchItemViewTypeArr;
            e = EnumEntriesKt.a(searchItemViewTypeArr);
        }

        public static SearchItemViewType valueOf(String str) {
            return (SearchItemViewType) Enum.valueOf(SearchItemViewType.class, str);
        }

        public static SearchItemViewType[] values() {
            return (SearchItemViewType[]) d.clone();
        }
    }

    public SearchAutoCompleteAdapter(SearchViewModel searchViewModel) {
        Intrinsics.h(searchViewModel, "searchViewModel");
        this.g = searchViewModel;
        this.h = "";
        this.i = new LinkedList();
    }

    public static final void G(SearchAutoCompleteAdapter searchAutoCompleteAdapter) {
        SearchViewModel searchViewModel = searchAutoCompleteAdapter.g;
        LegacyShopAnalyticsManager legacyShopAnalyticsManager = searchViewModel.j;
        String pageName = searchViewModel.o;
        Intrinsics.h(pageName, "pageName");
        SearchData searchData = new SearchData("Clear History");
        searchData.b = pageName;
        searchData.c = "1";
        searchData.d = "1";
        legacyShopAnalyticsManager.d(searchData);
        searchViewModel.r.onNext(Unit.f24250a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        return ((SearchableItem) this.i.get(i)).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        Object obj = this.i.get(i);
        Intrinsics.g(obj, "get(...)");
        final SearchableItem searchableItem = (SearchableItem) obj;
        if (viewHolder instanceof SearchAutoCompleteViewHolder) {
            SearchAutoCompleteViewHolder searchAutoCompleteViewHolder = (SearchAutoCompleteViewHolder) viewHolder;
            String text = ((SearchableItem.AutoCompleteItem) searchableItem).f4426a;
            String queryText = this.h;
            Intrinsics.h(text, "text");
            Intrinsics.h(queryText, "queryText");
            StyleSpan styleSpan = new StyleSpan(1);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(searchAutoCompleteViewHolder.itemView.getContext().getColor(R.color.color_accent));
            SpannableString spannableString = new SpannableString(text);
            Locale locale = Locale.ROOT;
            String lowerCase = text.toLowerCase(locale);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            String lowerCase2 = queryText.toLowerCase(locale);
            Intrinsics.g(lowerCase2, "toLowerCase(...)");
            int iC = StringsKt.C(lowerCase, lowerCase2, 0, false, 6);
            if (iC >= 0) {
                spannableString.setSpan(foregroundColorSpan, iC, queryText.length() + iC, 33);
                spannableString.setSpan(styleSpan, iC, queryText.length() + iC, 33);
            }
            searchAutoCompleteViewHolder.f4409a.setText(spannableString);
            searchAutoCompleteViewHolder.itemView.setContentDescription(text);
            final int i2 = 0;
            searchAutoCompleteViewHolder.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.g
                public final /* synthetic */ SearchAutoCompleteAdapter e;

                {
                    this.e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            SearchAutoCompleteAdapter searchAutoCompleteAdapter = this.e;
                            SearchableItem searchableItem2 = searchableItem;
                            Callback.g(view);
                            try {
                                searchAutoCompleteAdapter.g.q6(searchableItem2);
                                return;
                            } finally {
                            }
                        case 1:
                            SearchAutoCompleteAdapter searchAutoCompleteAdapter2 = this.e;
                            SearchableItem searchableItem3 = searchableItem;
                            Callback.g(view);
                            try {
                                searchAutoCompleteAdapter2.g.q6(searchableItem3);
                                return;
                            } finally {
                            }
                        default:
                            SearchAutoCompleteAdapter searchAutoCompleteAdapter3 = this.e;
                            SearchableItem searchableItem4 = searchableItem;
                            Callback.g(view);
                            try {
                                searchAutoCompleteAdapter3.g.q6(searchableItem4);
                                return;
                            } finally {
                            }
                    }
                }
            });
            return;
        }
        if (viewHolder instanceof RecentHeaderViewHolder) {
            RecentHeaderViewHolder recentHeaderViewHolder = (RecentHeaderViewHolder) viewHolder;
            Button button = recentHeaderViewHolder.b;
            recentHeaderViewHolder.f4404a.setText(R.string.recent_search_recent_header_text);
            button.setVisibility(0);
            recentHeaderViewHolder.itemView.setOnClickListener(null);
            button.setOnClickListener(new d(this, 3));
            return;
        }
        if (viewHolder instanceof RecentSearchViewHolder) {
            RecentSearchViewHolder recentSearchViewHolder = (RecentSearchViewHolder) viewHolder;
            recentSearchViewHolder.f4405a.setText(((SearchableItem.SuggestedSearch) searchableItem).f4429a);
            final int i3 = 1;
            recentSearchViewHolder.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.g
                public final /* synthetic */ SearchAutoCompleteAdapter e;

                {
                    this.e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            SearchAutoCompleteAdapter searchAutoCompleteAdapter = this.e;
                            SearchableItem searchableItem2 = searchableItem;
                            Callback.g(view);
                            try {
                                searchAutoCompleteAdapter.g.q6(searchableItem2);
                                return;
                            } finally {
                            }
                        case 1:
                            SearchAutoCompleteAdapter searchAutoCompleteAdapter2 = this.e;
                            SearchableItem searchableItem3 = searchableItem;
                            Callback.g(view);
                            try {
                                searchAutoCompleteAdapter2.g.q6(searchableItem3);
                                return;
                            } finally {
                            }
                        default:
                            SearchAutoCompleteAdapter searchAutoCompleteAdapter3 = this.e;
                            SearchableItem searchableItem4 = searchableItem;
                            Callback.g(view);
                            try {
                                searchAutoCompleteAdapter3.g.q6(searchableItem4);
                                return;
                            } finally {
                            }
                    }
                }
            });
            return;
        }
        if (viewHolder instanceof FeaturedBrandViewHolder) {
            FeaturedBrandViewHolder featuredBrandViewHolder = (FeaturedBrandViewHolder) viewHolder;
            SearchableItem.FeaturedBrandItem featuredBrandItem = (SearchableItem.FeaturedBrandItem) searchableItem;
            TrafficDriverItem trafficDriverItem = featuredBrandItem.b;
            androidx.work.impl.utils.c cVar = new androidx.work.impl.utils.c(2, this, featuredBrandItem, featuredBrandViewHolder);
            Intrinsics.h(trafficDriverItem, "trafficDriverItem");
            TrafficDriverView trafficDriverView = featuredBrandViewHolder.f4400a;
            trafficDriverView.setTrafficDriverItem(trafficDriverItem);
            trafficDriverView.setOnClick(cVar);
            return;
        }
        if (viewHolder instanceof PopularHeaderViewHolder) {
            PopularHeaderViewHolder popularHeaderViewHolder = (PopularHeaderViewHolder) viewHolder;
            Button button2 = popularHeaderViewHolder.b;
            popularHeaderViewHolder.f4402a.setText(R.string.search_popular_header_text);
            button2.setVisibility(8);
            popularHeaderViewHolder.itemView.setOnClickListener(null);
            button2.setOnClickListener(new h());
            return;
        }
        if (!(viewHolder instanceof PopularSearchViewHolder)) {
            throw new IllegalArgumentException("Binding unknown view holder type");
        }
        PopularSearchViewHolder popularSearchViewHolder = (PopularSearchViewHolder) viewHolder;
        popularSearchViewHolder.f4403a.setText(((SearchableItem.PopularSuggestedSearch) searchableItem).f4428a);
        final int i4 = 2;
        popularSearchViewHolder.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.g
            public final /* synthetic */ SearchAutoCompleteAdapter e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        SearchAutoCompleteAdapter searchAutoCompleteAdapter = this.e;
                        SearchableItem searchableItem2 = searchableItem;
                        Callback.g(view);
                        try {
                            searchAutoCompleteAdapter.g.q6(searchableItem2);
                            return;
                        } finally {
                        }
                    case 1:
                        SearchAutoCompleteAdapter searchAutoCompleteAdapter2 = this.e;
                        SearchableItem searchableItem3 = searchableItem;
                        Callback.g(view);
                        try {
                            searchAutoCompleteAdapter2.g.q6(searchableItem3);
                            return;
                        } finally {
                        }
                    default:
                        SearchAutoCompleteAdapter searchAutoCompleteAdapter3 = this.e;
                        SearchableItem searchableItem4 = searchableItem;
                        Callback.g(view);
                        try {
                            searchAutoCompleteAdapter3.g.q6(searchableItem4);
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == R.layout.item_search_result) {
            int i2 = ItemSearchResultBinding.z;
            DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
            ItemSearchResultBinding itemSearchResultBinding = (ItemSearchResultBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_search_result, viewGroup, false, null);
            Intrinsics.g(itemSearchResultBinding, "inflate(...)");
            SearchAutoCompleteViewHolder searchAutoCompleteViewHolder = new SearchAutoCompleteViewHolder(itemSearchResultBinding.h);
            TextView searchAutoCompleteText = itemSearchResultBinding.y;
            Intrinsics.g(searchAutoCompleteText, "searchAutoCompleteText");
            searchAutoCompleteViewHolder.f4409a = searchAutoCompleteText;
            return searchAutoCompleteViewHolder;
        }
        if (i == R.layout.item_suggested_search_header) {
            int i3 = ItemSuggestedSearchHeaderBinding.A;
            DataBinderMapperImpl dataBinderMapperImpl2 = DataBindingUtil.f2545a;
            ItemSuggestedSearchHeaderBinding itemSuggestedSearchHeaderBinding = (ItemSuggestedSearchHeaderBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_suggested_search_header, viewGroup, false, null);
            Intrinsics.g(itemSuggestedSearchHeaderBinding, "inflate(...)");
            RecentHeaderViewHolder recentHeaderViewHolder = new RecentHeaderViewHolder(itemSuggestedSearchHeaderBinding.h);
            TextView headerTextView = itemSuggestedSearchHeaderBinding.z;
            Intrinsics.g(headerTextView, "headerTextView");
            recentHeaderViewHolder.f4404a = headerTextView;
            Button actionTextView = itemSuggestedSearchHeaderBinding.y;
            Intrinsics.g(actionTextView, "actionTextView");
            recentHeaderViewHolder.b = actionTextView;
            return recentHeaderViewHolder;
        }
        if (i == R.layout.item_suggested_search) {
            int i4 = ItemSuggestedSearchBinding.z;
            DataBinderMapperImpl dataBinderMapperImpl3 = DataBindingUtil.f2545a;
            ItemSuggestedSearchBinding itemSuggestedSearchBinding = (ItemSuggestedSearchBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_suggested_search, viewGroup, false, null);
            Intrinsics.g(itemSuggestedSearchBinding, "inflate(...)");
            RecentSearchViewHolder recentSearchViewHolder = new RecentSearchViewHolder(itemSuggestedSearchBinding.h);
            TextView recentSearchTextView = itemSuggestedSearchBinding.y;
            Intrinsics.g(recentSearchTextView, "recentSearchTextView");
            recentSearchViewHolder.f4405a = recentSearchTextView;
            return recentSearchViewHolder;
        }
        if (i == R.layout.item_featured_brand) {
            int i5 = ItemFeaturedBrandBinding.z;
            DataBinderMapperImpl dataBinderMapperImpl4 = DataBindingUtil.f2545a;
            ItemFeaturedBrandBinding itemFeaturedBrandBinding = (ItemFeaturedBrandBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_featured_brand, viewGroup, false, null);
            Intrinsics.g(itemFeaturedBrandBinding, "inflate(...)");
            FeaturedBrandViewHolder featuredBrandViewHolder = new FeaturedBrandViewHolder(itemFeaturedBrandBinding.h);
            TrafficDriverView featuredBrand = itemFeaturedBrandBinding.y;
            Intrinsics.g(featuredBrand, "featuredBrand");
            featuredBrandViewHolder.f4400a = featuredBrand;
            return featuredBrandViewHolder;
        }
        if (i != R.layout.item_popular_search_header) {
            if (i != R.layout.item_popular_search) {
                throw new IllegalArgumentException("Creating unknown view type");
            }
            int i6 = ItemPopularSearchBinding.z;
            DataBinderMapperImpl dataBinderMapperImpl5 = DataBindingUtil.f2545a;
            ItemPopularSearchBinding itemPopularSearchBinding = (ItemPopularSearchBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_popular_search, viewGroup, false, null);
            Intrinsics.g(itemPopularSearchBinding, "inflate(...)");
            PopularSearchViewHolder popularSearchViewHolder = new PopularSearchViewHolder(itemPopularSearchBinding.h);
            TextView popularSearchTextView = itemPopularSearchBinding.y;
            Intrinsics.g(popularSearchTextView, "popularSearchTextView");
            popularSearchViewHolder.f4403a = popularSearchTextView;
            return popularSearchViewHolder;
        }
        int i7 = ItemPopularSearchHeaderBinding.A;
        DataBinderMapperImpl dataBinderMapperImpl6 = DataBindingUtil.f2545a;
        ItemPopularSearchHeaderBinding itemPopularSearchHeaderBinding = (ItemPopularSearchHeaderBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_popular_search_header, viewGroup, false, null);
        Intrinsics.g(itemPopularSearchHeaderBinding, "inflate(...)");
        PopularHeaderViewHolder popularHeaderViewHolder = new PopularHeaderViewHolder(itemPopularSearchHeaderBinding.h);
        TextView headerTextView2 = itemPopularSearchHeaderBinding.z;
        Intrinsics.g(headerTextView2, "headerTextView");
        popularHeaderViewHolder.f4402a = headerTextView2;
        Button actionTextView2 = itemPopularSearchHeaderBinding.y;
        Intrinsics.g(actionTextView2, "actionTextView");
        popularHeaderViewHolder.b = actionTextView2;
        return popularHeaderViewHolder;
    }
}
