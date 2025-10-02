package au.com.woolworths.feature.shop.catalogue.productlist;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueAdditionalProductDetailsBinding;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHeroProductDetailsBinding;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueProductDescriptionBinding;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalProductItemState;
import au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalProductViewHolder;
import au.com.woolworths.feature.shop.catalogue.productlist.description.ProductDescriptionItemState;
import au.com.woolworths.feature.shop.catalogue.productlist.description.ProductDescriptionViewHolder;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.HeroProductItemState;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.HeroProductTile;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.HeroProductViewHolder;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.extensions.ProductExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$BaseItemState;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$BaseViewHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueProductListAdapter extends ListAdapter<CatalogueProductListContract.BaseItemState, CatalogueProductListContract.BaseViewHolder> {
    public final CatalogueProductListViewModel i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueProductListAdapter(CatalogueProductListViewModel catalogueProductListViewModel) {
        super(new ItemStateDiffUtilCallback());
        Intrinsics.h(catalogueProductListViewModel, "catalogueProductListViewModel");
        this.i = catalogueProductListViewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        return ((CatalogueProductListContract.BaseItemState) this.g.f.get(i)).getE().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        CatalogueProductListContract.BaseViewHolder baseViewHolder = (CatalogueProductListContract.BaseViewHolder) viewHolder;
        boolean z = baseViewHolder instanceof HeroProductViewHolder;
        AsyncListDiffer asyncListDiffer = this.g;
        if (z) {
            Object obj = asyncListDiffer.f.get(i);
            Intrinsics.f(obj, "null cannot be cast to non-null type au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.HeroProductItemState");
            HeroProductItemState heroProductItemState = (HeroProductItemState) obj;
            ItemCatalogueHeroProductDetailsBinding itemCatalogueHeroProductDetailsBinding = ((HeroProductViewHolder) baseViewHolder).f6938a;
            itemCatalogueHeroProductDetailsBinding.M(heroProductItemState);
            HeroProductTile heroProductTile = heroProductItemState.f6936a;
            if (heroProductTile.h) {
                ComposeView memberPriceInfoView = itemCatalogueHeroProductDetailsBinding.A;
                Intrinsics.g(memberPriceInfoView, "memberPriceInfoView");
                ProductExtKt.a(memberPriceInfoView, heroProductTile.f, ProductMemberPriceLabelStyling.d);
            }
            itemCatalogueHeroProductDetailsBinding.l();
            return;
        }
        if (baseViewHolder instanceof AdditionalProductViewHolder) {
            Object obj2 = asyncListDiffer.f.get(i);
            Intrinsics.f(obj2, "null cannot be cast to non-null type au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalProductItemState");
            ItemCatalogueAdditionalProductDetailsBinding itemCatalogueAdditionalProductDetailsBinding = ((AdditionalProductViewHolder) baseViewHolder).f6933a;
            itemCatalogueAdditionalProductDetailsBinding.L((AdditionalProductItemState) obj2);
            itemCatalogueAdditionalProductDetailsBinding.l();
            return;
        }
        if (baseViewHolder instanceof ProductDescriptionViewHolder) {
            Object obj3 = asyncListDiffer.f.get(i);
            Intrinsics.f(obj3, "null cannot be cast to non-null type au.com.woolworths.feature.shop.catalogue.productlist.description.ProductDescriptionItemState");
            ItemCatalogueProductDescriptionBinding itemCatalogueProductDescriptionBinding = ((ProductDescriptionViewHolder) baseViewHolder).f6935a;
            itemCatalogueProductDescriptionBinding.L((ProductDescriptionItemState) obj3);
            itemCatalogueProductDescriptionBinding.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        CatalogueProductListContract.ItemStateType itemStateType = (CatalogueProductListContract.ItemStateType) CatalogueProductListContract.ItemStateType.h.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.g(layoutInflaterFrom, "from(...)");
        return itemStateType.a(viewGroup, layoutInflaterFrom, this.i);
    }
}
