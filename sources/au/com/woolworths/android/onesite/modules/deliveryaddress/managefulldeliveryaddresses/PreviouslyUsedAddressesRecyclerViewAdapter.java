package au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.legacy.databinding.ItemPreviouslyUsedAddressBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/managefulldeliveryaddresses/PreviouslyUsedAddressesRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/managefulldeliveryaddresses/PreviouslyUsedAddressesViewHolder;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviouslyUsedAddressesRecyclerViewAdapter extends RecyclerView.Adapter<PreviouslyUsedAddressesViewHolder> {
    public final ManageFullDeliveryAddressesActivity g;
    public final ManageFullDeliveryAddressesContract.Presenter h;
    public final PreviouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1 i = new PreviouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1(this);

    public PreviouslyUsedAddressesRecyclerViewAdapter(ManageFullDeliveryAddressesActivity manageFullDeliveryAddressesActivity, ManageFullDeliveryAddressesContract.Presenter presenter) {
        this.g = manageFullDeliveryAddressesActivity;
        this.h = presenter;
        E(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.h.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long j(int i) {
        return this.h.g(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        this.h.h(i, (PreviouslyUsedAddressesViewHolder) viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.g);
        int i2 = ItemPreviouslyUsedAddressBinding.D;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ItemPreviouslyUsedAddressBinding itemPreviouslyUsedAddressBinding = (ItemPreviouslyUsedAddressBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_previously_used_address, viewGroup, false, null);
        Intrinsics.g(itemPreviouslyUsedAddressBinding, "inflate(...)");
        PreviouslyUsedAddressesViewHolder previouslyUsedAddressesViewHolder = new PreviouslyUsedAddressesViewHolder(itemPreviouslyUsedAddressBinding.h);
        previouslyUsedAddressesViewHolder.f4325a = itemPreviouslyUsedAddressBinding;
        itemPreviouslyUsedAddressBinding.L(previouslyUsedAddressesViewHolder);
        previouslyUsedAddressesViewHolder.b = this.i;
        return previouslyUsedAddressesViewHolder;
    }
}
