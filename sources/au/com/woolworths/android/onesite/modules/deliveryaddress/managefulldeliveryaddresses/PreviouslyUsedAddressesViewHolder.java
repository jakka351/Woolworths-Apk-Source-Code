package au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses;

import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.legacy.databinding.ItemPreviouslyUsedAddressBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract;

/* loaded from: classes3.dex */
public class PreviouslyUsedAddressesViewHolder extends RecyclerView.ViewHolder implements ManageFullDeliveryAddressesContract.ViewHolder, PreviouslyUsedAddressItemEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public ItemPreviouslyUsedAddressBinding f4325a;
    public PreviouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1 b;

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.PreviouslyUsedAddressItemEventHandler
    public final void a() {
        PreviouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1 previouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1 = this.b;
        if (previouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1 != null) {
            previouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1.f4324a.h.f(getAdapterPosition());
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.PreviouslyUsedAddressItemEventHandler
    public final void b() {
        ItemPreviouslyUsedAddressBinding itemPreviouslyUsedAddressBinding = this.f4325a;
        PreviouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1 previouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1 = this.b;
        if (previouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1 != null) {
            c(false);
            itemPreviouslyUsedAddressBinding.z.setVisibility(0);
            itemPreviouslyUsedAddressBinding.A.setVisibility(8);
            previouslyUsedAddressesRecyclerViewAdapter$mViewHolderListener$1.f4324a.h.e(getAdapterPosition());
        }
    }

    public final void c(boolean z) {
        this.f4325a.B.setEnabled(z);
    }
}
