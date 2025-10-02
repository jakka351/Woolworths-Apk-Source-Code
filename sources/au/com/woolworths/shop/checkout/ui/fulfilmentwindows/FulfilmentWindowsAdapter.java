package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupFragment;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FulfilmentWindowsAdapter extends FragmentStateAdapter {
    public List p;

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment I(int i) {
        FulfilmentWindowsGroupFragment fulfilmentWindowsGroupFragment = new FulfilmentWindowsGroupFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("Index", i);
        fulfilmentWindowsGroupFragment.setArguments(bundle);
        return fulfilmentWindowsGroupFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.p.size();
    }
}
