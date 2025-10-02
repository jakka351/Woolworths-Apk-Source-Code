package au.com.woolworths.feature.shop.catalogue.productlist;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueAdditionalProductDetailsBinding;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHeroProductDetailsBinding;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueProductDescriptionBinding;
import au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalItemInfo;
import au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalProductViewHolder;
import au.com.woolworths.feature.shop.catalogue.productlist.description.ProductDescriptionViewHolder;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.HeroProductViewHolder;
import au.com.woolworths.product.models.ProductCard;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract;", "", "Action", "ViewState", "PageState", "BaseItemState", "BaseViewHolder", "ItemStateType", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueProductListContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action;", "", "LaunchCatalogueProductDetails", "LaunchAddToList", "LaunchProductBottomSheet", "LaunchAvailabilityMessageBottomSheet", "LaunchSimpleRestrictedPurchaseDialog", "LaunchLoginForRestrictedPurchaseDialog", "LaunchInStoreMap", "LaunchCheckStock", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchAddToList;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchAvailabilityMessageBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchCatalogueProductDetails;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchCheckStock;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchInStoreMap;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchLoginForRestrictedPurchaseDialog;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchProductBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchSimpleRestrictedPurchaseDialog;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchAddToList;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAddToList extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6910a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchAddToList(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6910a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAddToList) && Intrinsics.c(this.f6910a, ((LaunchAddToList) obj).f6910a);
            }

            public final int hashCode() {
                return this.f6910a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchAddToList(productCard=", this.f6910a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchAvailabilityMessageBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAvailabilityMessageBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6911a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchAvailabilityMessageBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6911a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAvailabilityMessageBottomSheet) && Intrinsics.c(this.f6911a, ((LaunchAvailabilityMessageBottomSheet) obj).f6911a);
            }

            public final int hashCode() {
                return this.f6911a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchAvailabilityMessageBottomSheet(productCard=", this.f6911a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchCatalogueProductDetails;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCatalogueProductDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final AdditionalItemInfo f6912a;

            public LaunchCatalogueProductDetails(AdditionalItemInfo additionalItemInfo) {
                this.f6912a = additionalItemInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchCatalogueProductDetails) && Intrinsics.c(this.f6912a, ((LaunchCatalogueProductDetails) obj).f6912a);
            }

            public final int hashCode() {
                return this.f6912a.hashCode();
            }

            public final String toString() {
                return "LaunchCatalogueProductDetails(itemInfo=" + this.f6912a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchCheckStock;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCheckStock extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6913a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchCheckStock(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6913a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchCheckStock) && Intrinsics.c(this.f6913a, ((LaunchCheckStock) obj).f6913a);
            }

            public final int hashCode() {
                return this.f6913a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchCheckStock(productCard=", this.f6913a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchInStoreMap;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchInStoreMap extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6914a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchInStoreMap(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6914a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchInStoreMap) && Intrinsics.c(this.f6914a, ((LaunchInStoreMap) obj).f6914a);
            }

            public final int hashCode() {
                return this.f6914a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchInStoreMap(productCard=", this.f6914a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchLoginForRestrictedPurchaseDialog;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchLoginForRestrictedPurchaseDialog extends Action {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchProductBottomSheet;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f6915a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f6915a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductBottomSheet) && Intrinsics.c(this.f6915a, ((LaunchProductBottomSheet) obj).f6915a);
            }

            public final int hashCode() {
                return this.f6915a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchProductBottomSheet(productCard=", this.f6915a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action$LaunchSimpleRestrictedPurchaseDialog;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSimpleRestrictedPurchaseDialog extends Action {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$BaseItemState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BaseItemState {
        ItemStateType getItemType();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class BaseViewHolder extends RecyclerView.ViewHolder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$ItemStateType;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ItemStateType {
        public static final ItemStateType d;
        public static final ItemStateType e;
        public static final ItemStateType f;
        public static final /* synthetic */ ItemStateType[] g;
        public static final /* synthetic */ EnumEntries h;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract.ItemStateType.ADDITIONAL_PRODUCT", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$ItemStateType;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ADDITIONAL_PRODUCT extends ItemStateType {
            public ADDITIONAL_PRODUCT() {
                super("ADDITIONAL_PRODUCT", 2);
            }

            @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract.ItemStateType
            public final BaseViewHolder a(ViewGroup viewGroup, LayoutInflater layoutInflater, CatalogueProductListViewModel catalogueProdListViewModel) {
                Intrinsics.h(catalogueProdListViewModel, "catalogueProdListViewModel");
                int i = ItemCatalogueAdditionalProductDetailsBinding.G;
                DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                ItemCatalogueAdditionalProductDetailsBinding itemCatalogueAdditionalProductDetailsBinding = (ItemCatalogueAdditionalProductDetailsBinding) ViewDataBinding.q(layoutInflater, R.layout.item_catalogue_additional_product_details, viewGroup, false, null);
                Intrinsics.g(itemCatalogueAdditionalProductDetailsBinding, "inflate(...)");
                return new AdditionalProductViewHolder(itemCatalogueAdditionalProductDetailsBinding, catalogueProdListViewModel);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract.ItemStateType.HERO_PRODUCT_DETAIL", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$ItemStateType;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class HERO_PRODUCT_DETAIL extends ItemStateType {
            public HERO_PRODUCT_DETAIL() {
                super("HERO_PRODUCT_DETAIL", 0);
            }

            @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract.ItemStateType
            public final BaseViewHolder a(ViewGroup viewGroup, LayoutInflater layoutInflater, CatalogueProductListViewModel catalogueProdListViewModel) {
                Intrinsics.h(catalogueProdListViewModel, "catalogueProdListViewModel");
                int i = ItemCatalogueHeroProductDetailsBinding.O;
                DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                ItemCatalogueHeroProductDetailsBinding itemCatalogueHeroProductDetailsBinding = (ItemCatalogueHeroProductDetailsBinding) ViewDataBinding.q(layoutInflater, R.layout.item_catalogue_hero_product_details, viewGroup, false, null);
                Intrinsics.g(itemCatalogueHeroProductDetailsBinding, "inflate(...)");
                return new HeroProductViewHolder(itemCatalogueHeroProductDetailsBinding, catalogueProdListViewModel);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract.ItemStateType.PRODUCT_DESCRIPTION", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$ItemStateType;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PRODUCT_DESCRIPTION extends ItemStateType {
            public PRODUCT_DESCRIPTION() {
                super("PRODUCT_DESCRIPTION", 1);
            }

            @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract.ItemStateType
            public final BaseViewHolder a(ViewGroup viewGroup, LayoutInflater layoutInflater, CatalogueProductListViewModel catalogueProdListViewModel) {
                Intrinsics.h(catalogueProdListViewModel, "catalogueProdListViewModel");
                int i = ItemCatalogueProductDescriptionBinding.C;
                DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                ItemCatalogueProductDescriptionBinding itemCatalogueProductDescriptionBinding = (ItemCatalogueProductDescriptionBinding) ViewDataBinding.q(layoutInflater, R.layout.item_catalogue_product_description, viewGroup, false, null);
                Intrinsics.g(itemCatalogueProductDescriptionBinding, "inflate(...)");
                return new ProductDescriptionViewHolder(itemCatalogueProductDescriptionBinding, catalogueProdListViewModel);
            }
        }

        static {
            HERO_PRODUCT_DETAIL hero_product_detail = new HERO_PRODUCT_DETAIL();
            d = hero_product_detail;
            PRODUCT_DESCRIPTION product_description = new PRODUCT_DESCRIPTION();
            e = product_description;
            ADDITIONAL_PRODUCT additional_product = new ADDITIONAL_PRODUCT();
            f = additional_product;
            ItemStateType[] itemStateTypeArr = {hero_product_detail, product_description, additional_product};
            g = itemStateTypeArr;
            h = EnumEntriesKt.a(itemStateTypeArr);
        }

        public static ItemStateType valueOf(String str) {
            return (ItemStateType) Enum.valueOf(ItemStateType.class, str);
        }

        public static ItemStateType[] values() {
            return (ItemStateType[]) g.clone();
        }

        public abstract BaseViewHolder a(ViewGroup viewGroup, LayoutInflater layoutInflater, CatalogueProductListViewModel catalogueProductListViewModel);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$PageState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageState {
        public static final PageState d;
        public static final PageState e;
        public static final PageState f;
        public static final /* synthetic */ PageState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            PageState pageState = new PageState("LOADING", 0);
            d = pageState;
            PageState pageState2 = new PageState("CATALOGUE_PRODUCT_DETAILS", 1);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$ViewState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final PageState f6916a;
        public final CatalogueProductListErrorState b;
        public final CatalogueProductListInlineState c;
        public final Object d;

        public ViewState(PageState pageState, CatalogueProductListErrorState catalogueProductListErrorState, CatalogueProductListInlineState catalogueProductListInlineState, List list) {
            this.f6916a = pageState;
            this.b = catalogueProductListErrorState;
            this.c = catalogueProductListInlineState;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6916a == viewState.f6916a && this.b == viewState.b && this.c == viewState.c && this.d.equals(viewState.d);
        }

        public final int hashCode() {
            int iHashCode = this.f6916a.hashCode() * 31;
            CatalogueProductListErrorState catalogueProductListErrorState = this.b;
            int iHashCode2 = (iHashCode + (catalogueProductListErrorState == null ? 0 : catalogueProductListErrorState.hashCode())) * 31;
            CatalogueProductListInlineState catalogueProductListInlineState = this.c;
            return this.d.hashCode() + ((iHashCode2 + (catalogueProductListInlineState != null ? catalogueProductListInlineState.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ViewState(pageState=" + this.f6916a + ", errorState=" + this.b + ", inlineState=" + this.c + ", items=" + this.d + ")";
        }
    }
}
