package com.woolworths.scanlibrary.ui.stores;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ViewAvailableStoreItemBinding;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.ui.stores.viewholders.AvailableStoreItemViewHolder;
import com.woolworths.scanlibrary.util.adapter.RecyclerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/woolworths/scanlibrary/ui/stores/AvailableStoresActivity$getAvailableStoreLocationListView$1", "Lcom/woolworths/scanlibrary/util/adapter/RecyclerAdapter;", "Lcom/woolworths/scanlibrary/models/store/Store;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AvailableStoresActivity$getAvailableStoreLocationListView$1 extends RecyclerAdapter<Store, RecyclerView.ViewHolder> {
    @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter
    public final void G(RecyclerView.ViewHolder viewHolder, Object obj, int i) {
        Store model = (Store) obj;
        Intrinsics.h(model, "model");
        if (viewHolder instanceof AvailableStoreItemViewHolder) {
            ViewAvailableStoreItemBinding viewAvailableStoreItemBinding = ((AvailableStoreItemViewHolder) viewHolder).f21345a;
            viewAvailableStoreItemBinding.G(257, model);
            viewAvailableStoreItemBinding.l();
        }
    }

    @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        if (i != R.layout.view_available_store_item) {
            throw new IllegalArgumentException(YU.a.d(i, "unknown view type "));
        }
        ViewDataBinding viewDataBindingC = DataBindingUtil.c(LayoutInflater.from(viewGroup.getContext()), R.layout.view_available_store_item, viewGroup, false, null);
        Intrinsics.g(viewDataBindingC, "inflate(...)");
        return new AvailableStoreItemViewHolder((ViewAvailableStoreItemBinding) viewDataBindingC);
    }
}
