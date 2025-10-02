package com.woolworths.scanlibrary.ui.productsearch.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.Status;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ItemSearchResultSngBinding;
import com.woolworths.scanlibrary.databinding.NetworkStateItemBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.productsearch.SearchActivity;
import com.woolworths.scanlibrary.ui.productsearch.a;
import com.woolworths.scanlibrary.ui.productsearch.viewholder.NetworkStateItemViewHolder;
import com.woolworths.scanlibrary.ui.productsearch.viewholder.ProductViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/adapter/ProductSearchResultItemAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/woolworths/scanlibrary/models/product/Item;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductSearchResultItemAdapter extends PagedListAdapter<Item, RecyclerView.ViewHolder> {
    public static final ProductSearchResultItemAdapter$Companion$ITEM_COMPARATOR$1 k = new ProductSearchResultItemAdapter$Companion$ITEM_COMPARATOR$1();
    public final a i;
    public NetworkState j;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/adapter/ProductSearchResultItemAdapter$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductSearchResultItemAdapter(SearchActivity searchActivity, a aVar) {
        this.i = aVar;
    }

    public final boolean H() {
        NetworkState networkState = this.j;
        if (networkState == null) {
            return false;
        }
        NetworkState networkState2 = NetworkState.d;
        return !Intrinsics.c(networkState, NetworkState.d);
    }

    @Override // androidx.paging.PagedListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return (H() ? 1 : 0) + this.g.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        return (H() && i == i() + (-1)) ? R.layout.network_state_item : R.layout.item_search_result_sng;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        int iK = k(i);
        if (iK == R.layout.item_search_result_sng) {
            Object objG = G(i);
            Intrinsics.e(objG);
            ItemSearchResultSngBinding itemSearchResultSngBinding = ((ProductViewHolder) viewHolder).f21302a;
            itemSearchResultSngBinding.G(145, (Item) objG);
            itemSearchResultSngBinding.l();
            return;
        }
        if (iK == R.layout.network_state_item) {
            NetworkState networkState = this.j;
            NetworkStateItemBinding networkStateItemBinding = ((NetworkStateItemViewHolder) viewHolder).f21301a;
            ProgressBar progressBar = networkStateItemBinding.z;
            TextView textView = networkStateItemBinding.y;
            progressBar.setVisibility((networkState != null ? networkState.f9174a : null) == Status.d ? 0 : 8);
            networkStateItemBinding.A.setVisibility((networkState != null ? networkState.f9174a : null) == Status.f ? 0 : 8);
            textView.setVisibility((networkState != null ? networkState.b : null) != null ? 0 : 8);
            textView.setText(networkState != null ? networkState.b : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void w(RecyclerView.ViewHolder viewHolder, int i, List payloads) {
        Intrinsics.h(payloads, "payloads");
        if (payloads.isEmpty()) {
            v(viewHolder, i);
            return;
        }
        Item item = (Item) G(i);
        Intrinsics.e(item);
        ItemSearchResultSngBinding itemSearchResultSngBinding = ((ProductViewHolder) viewHolder).f21302a;
        itemSearchResultSngBinding.G(145, item);
        itemSearchResultSngBinding.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        if (i == R.layout.item_search_result_sng) {
            ViewDataBinding viewDataBindingC = DataBindingUtil.c(LayoutInflater.from(viewGroup.getContext()), R.layout.item_search_result_sng, viewGroup, false, null);
            Intrinsics.g(viewDataBindingC, "inflate(...)");
            return new ProductViewHolder((ItemSearchResultSngBinding) viewDataBindingC);
        }
        if (i != R.layout.network_state_item) {
            throw new IllegalArgumentException(YU.a.d(i, "unknown view type "));
        }
        int i2 = NetworkStateItemViewHolder.c;
        a retryCallback = this.i;
        Intrinsics.h(retryCallback, "retryCallback");
        ViewDataBinding viewDataBindingC2 = DataBindingUtil.c(LayoutInflater.from(viewGroup.getContext()), R.layout.network_state_item, viewGroup, false, null);
        Intrinsics.g(viewDataBindingC2, "inflate(...)");
        return new NetworkStateItemViewHolder((NetworkStateItemBinding) viewDataBindingC2, retryCallback);
    }
}
