package au.com.woolworths.feature.shop.catalogue.productlist;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/ItemStateDiffUtilCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$BaseItemState;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemStateDiffUtilCallback extends DiffUtil.ItemCallback<CatalogueProductListContract.BaseItemState> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean a(Object obj, Object obj2) {
        CatalogueProductListContract.BaseItemState oldItem = (CatalogueProductListContract.BaseItemState) obj;
        CatalogueProductListContract.BaseItemState newItem = (CatalogueProductListContract.BaseItemState) obj2;
        Intrinsics.h(oldItem, "oldItem");
        Intrinsics.h(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean b(Object obj, Object obj2) {
        CatalogueProductListContract.BaseItemState oldItem = (CatalogueProductListContract.BaseItemState) obj;
        CatalogueProductListContract.BaseItemState newItem = (CatalogueProductListContract.BaseItemState) obj2;
        Intrinsics.h(oldItem, "oldItem");
        Intrinsics.h(newItem, "newItem");
        return oldItem.getItemType() == newItem.getItemType();
    }
}
