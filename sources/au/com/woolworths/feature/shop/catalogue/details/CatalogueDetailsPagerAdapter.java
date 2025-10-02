package au.com.woolworths.feature.shop.catalogue.details;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shared.web.file.uploader.a;
import au.com.woolworths.feature.shop.catalogue.common.AnalyticsAction;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueDetailsBinding;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailLink;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsContract;
import au.com.woolworths.feature.shop.catalogue.details.analytics.CatalogueDetailsActions;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePage;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePageItem;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okhttp3.HttpUrl;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueDetailsPagerAdapter extends PagerAdapter {
    public final CatalogueDetailsViewModel f;
    public final ArrayList g;

    public CatalogueDetailsPagerAdapter(CatalogueDetailsViewModel catalogueDetailsViewModel) {
        Intrinsics.h(catalogueDetailsViewModel, "catalogueDetailsViewModel");
        this.f = catalogueDetailsViewModel;
        this.g = new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void e(ViewPager viewPager, Object viewObject) {
        Intrinsics.h(viewObject, "viewObject");
        viewPager.removeView((View) viewObject);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int g() {
        return this.g.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object h(ViewPager viewPager, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewPager.getContext());
        int i2 = ItemCatalogueDetailsBinding.C;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ItemCatalogueDetailsBinding itemCatalogueDetailsBinding = (ItemCatalogueDetailsBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_catalogue_details, viewPager, false, null);
        Intrinsics.g(itemCatalogueDetailsBinding, "inflate(...)");
        Object obj = this.g.get(i);
        Intrinsics.g(obj, "get(...)");
        n(itemCatalogueDetailsBinding, (CataloguePage) obj);
        View view = itemCatalogueDetailsBinding.h;
        viewPager.addView(view);
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean i(View view, Object viewObject) {
        Intrinsics.h(view, "view");
        Intrinsics.h(viewObject, "viewObject");
        return view.equals(viewObject);
    }

    public final void n(ItemCatalogueDetailsBinding itemCatalogueDetailsBinding, CataloguePage cataloguePage) {
        ImageView imageView = itemCatalogueDetailsBinding.A;
        imageView.setVisibility(8);
        itemCatalogueDetailsBinding.z.setVisibility(0);
        itemCatalogueDetailsBinding.L(cataloguePage);
        CataloguePageView cataloguePageView = itemCatalogueDetailsBinding.y;
        cataloguePageView.setCatalogueImageLoaderListener(new CatalogueDetailsImageLoaderListener(itemCatalogueDetailsBinding));
        cataloguePageView.setCataloguePageItemClickListener(new CataloguePageItemClickListener() { // from class: au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPagerAdapter$bind$1$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.feature.shop.catalogue.details.CataloguePageItemClickListener
            public final void a(CataloguePageItem cataloguePageItem) {
                Integer numI0;
                EmptyList emptyList;
                String str;
                Map map;
                String storeId;
                CatalogueDetailsViewModel catalogueDetailsViewModel = this.f6827a.f;
                SharedFlowImpl sharedFlowImpl = catalogueDetailsViewModel.i;
                if (!StringsKt.D(cataloguePageItem.getItemId())) {
                    String itemId = cataloguePageItem.getItemId();
                    String itemName = cataloguePageItem.getItemName();
                    String str2 = itemName != null ? itemName : "";
                    AnalyticsManager analyticsManager = catalogueDetailsViewModel.f;
                    AnalyticsAction analyticsAction = CatalogueDetailsActions.e;
                    TrackableValue trackableValue = TrackableValue.x;
                    String str3 = catalogueDetailsViewModel.l;
                    if (str3 == null) {
                        Intrinsics.p("catalogueId");
                        throw null;
                    }
                    TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, str3);
                    trackingMetadataA.b(TrackableValue.A, itemId);
                    analyticsManager.j(analyticsAction, trackingMetadataA);
                    CatalogueStoreInfo catalogueStoreInfoA = catalogueDetailsViewModel.e.f6826a.f6778a.a();
                    if (catalogueStoreInfoA == null || (storeId = catalogueStoreInfoA.getStoreId()) == null) {
                        return;
                    }
                    sharedFlowImpl.f(new CatalogueDetailsContract.Actions.LaunchCatalogueProductList(itemId, str2, storeId, catalogueDetailsViewModel.m));
                    return;
                }
                String youtubeId = cataloguePageItem.getYoutubeId();
                if (youtubeId != null && !StringsKt.D(youtubeId)) {
                    catalogueDetailsViewModel.t6("https://www.youtube.com/watch?v=" + cataloguePageItem.getYoutubeId());
                    return;
                }
                String itemUrl = cataloguePageItem.getItemUrl();
                if (itemUrl == null || StringsKt.D(itemUrl)) {
                    return;
                }
                Lazy lazy = CatalogueDetailLink.f6819a;
                String url = cataloguePageItem.getItemUrl();
                Intrinsics.h(url, "url");
                int i = 0;
                CatalogueDetailLink page = (StringsKt.W(url, "#/?page=", false) && (numI0 = StringsKt.i0(StringsKt.Q(url, "#/?page=", "", false))) != null) ? new CatalogueDetailLink.Page(numI0.intValue() - 1) : null;
                if (page == null) {
                    HttpUrl.j.getClass();
                    HttpUrl httpUrlD = HttpUrl.Companion.d(url);
                    if (httpUrlD == null) {
                        page = CatalogueDetailLink.Companion.a(url);
                        if (page == null) {
                            page = new CatalogueDetailLink.Web(url);
                        }
                    } else {
                        ArrayList arrayList = httpUrlD.f;
                        Set setJ = httpUrlD.j();
                        int iH = MapsKt.h(CollectionsKt.s(setJ, 10));
                        if (iH < 16) {
                            iH = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                        Iterator it = setJ.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            emptyList = EmptyList.d;
                            if (!zHasNext) {
                                break;
                            }
                            Object next = it.next();
                            String name = (String) next;
                            Intrinsics.h(name, "name");
                            List list = httpUrlD.g;
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList(4);
                                IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(i, list.size()));
                                int i2 = intProgressionN.d;
                                int i3 = intProgressionN.e;
                                int i4 = intProgressionN.f;
                                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                                    while (true) {
                                        if (name.equals(list.get(i2))) {
                                            arrayList2.add(list.get(i2 + 1));
                                        }
                                        if (i2 == i3) {
                                            break;
                                        } else {
                                            i2 += i4;
                                        }
                                    }
                                }
                                ?? UnmodifiableList = Collections.unmodifiableList(arrayList2);
                                Intrinsics.g(UnmodifiableList, "unmodifiableList(...)");
                                emptyList = UnmodifiableList;
                            }
                            linkedHashMap.put(next, (String) CollectionsKt.D(emptyList));
                            i = 0;
                        }
                        CatalogueDetailLink recipe = !CollectionsKt.x0(2, CollectionsKt.y(arrayList)).equals(CollectionsKt.R("shop", "recipes")) ? null : new CatalogueDetailLink.Recipe((String) CollectionsKt.O(arrayList));
                        if (recipe != null) {
                            page = recipe;
                        } else {
                            if (CollectionsKt.x0(3, arrayList).equals(CollectionsKt.R("shop", "search", "products")) && (str = (String) linkedHashMap.get(RecentSearch.COLUMN_NAME_SEARCH_TERM)) != null) {
                                String str4 = (String) linkedHashMap.get("filter");
                                if (str4 == null) {
                                    map = EmptyMap.d;
                                } else {
                                    List listT = StringsKt.T(str4, new String[]{";"}, 6);
                                    int iH2 = MapsKt.h(CollectionsKt.s(listT, 10));
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH2 < 16 ? 16 : iH2);
                                    Iterator it2 = listT.iterator();
                                    while (it2.hasNext()) {
                                        List listT2 = StringsKt.T((String) it2.next(), new String[]{"(", ")"}, 6);
                                        String str5 = (String) CollectionsKt.F(listT2);
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        String str6 = (String) CollectionsKt.F(CollectionsKt.y(CollectionsKt.x(listT2, 1)));
                                        linkedHashMap2.put(str5, str6 != null ? StringsKt.T(str6, new String[]{","}, 6) : emptyList);
                                    }
                                    map = linkedHashMap2;
                                }
                                page = new CatalogueDetailLink.Search(str, map);
                            } else {
                                page = null;
                            }
                            if (page == null && (page = CatalogueDetailLink.Companion.a(url)) == null) {
                                page = new CatalogueDetailLink.Web(url);
                            }
                        }
                    }
                }
                if (page instanceof CatalogueDetailLink.Page) {
                    catalogueDetailsViewModel.r6(((CatalogueDetailLink.Page) page).b);
                    return;
                }
                if (page instanceof CatalogueDetailLink.Recipe) {
                    sharedFlowImpl.f(new CatalogueDetailsContract.Actions.LaunchRecipeDetails(((CatalogueDetailLink.Recipe) page).b));
                    return;
                }
                if (page instanceof CatalogueDetailLink.Web) {
                    catalogueDetailsViewModel.t6(((CatalogueDetailLink.Web) page).b);
                    return;
                }
                if (page instanceof CatalogueDetailLink.Search) {
                    CatalogueDetailLink.Search search = (CatalogueDetailLink.Search) page;
                    String str7 = search.b;
                    sharedFlowImpl.f(new CatalogueDetailsContract.Actions.LaunchProductList(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(str7, null), new Activities.ProductList.ExtrasByCatalogueSearch(str7, Activities.ProductList.ProductListType.q), new Activities.ProductList.ExtrasConfig(search.c), 8)));
                } else {
                    if (!(page instanceof CatalogueDetailLink.DeepLink)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sharedFlowImpl.f(new CatalogueDetailsContract.Actions.LaunchDeepLink(((CatalogueDetailLink.DeepLink) page).b));
                }
            }
        });
        imageView.setOnClickListener(new a(1, this, itemCatalogueDetailsBinding, cataloguePage));
        itemCatalogueDetailsBinding.l();
    }
}
