package au.com.woolworths.feature.shop.myorders.orders.list;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import au.com.woolworths.feature.shop.login.guest.ui.GuestLoginExtra;
import au.com.woolworths.feature.shop.myorders.guest.MyOrdersGuestFragment;
import au.com.woolworths.feature.shop.myorders.orders.OrdersActivity;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment;
import com.woolworths.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersListFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrdersListFragmentAdapter extends FragmentStateAdapter {
    public final OrdersActivity p;
    public List q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OrdersTab.values().length];
            try {
                iArr[OrdersTab.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrdersTab.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrdersTab.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public OrdersListFragmentAdapter(OrdersActivity ordersActivity) {
        super(ordersActivity);
        this.p = ordersActivity;
        this.q = EmptyList.d;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final boolean H(long j) {
        List list = this.q;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (j == ((OrdersTab) it.next()).hashCode()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment I(int i) {
        int iOrdinal = ((OrdersTab) this.q.get(i)).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            OrdersListFragment.Companion companion = OrdersListFragment.p;
            OrdersTab ordersTab = (OrdersTab) this.q.get(i);
            OrdersListFragment.Extras extras = new OrdersListFragment.Extras(ordersTab);
            companion.getClass();
            OrdersListFragment ordersListFragment = new OrdersListFragment();
            if (ordersTab == OrdersTab.e) {
                throw new IllegalArgumentException("Couldn't set guest as order tab");
            }
            ordersListFragment.setArguments(BundleKt.a(new Pair(".extra", extras)));
            return ordersListFragment;
        }
        int i2 = MyOrdersGuestFragment.r;
        OrdersActivity context = this.p;
        Intrinsics.h(context, "context");
        MyOrdersGuestFragment myOrdersGuestFragment = new MyOrdersGuestFragment();
        String string = context.getString(R.string.my_orders_guest_title);
        Intrinsics.g(string, "getString(...)");
        String string2 = context.getString(R.string.my_orders_guest_body);
        Intrinsics.g(string2, "getString(...)");
        String string3 = context.getString(R.string.login);
        Intrinsics.g(string3, "getString(...)");
        String string4 = context.getString(R.string.signup);
        Intrinsics.g(string4, "getString(...)");
        GuestLoginExtra guestLoginExtra = new GuestLoginExtra(string, R.drawable.ic_my_orders_guest_state, string2, string3, string4);
        Bundle bundle = new Bundle();
        bundle.putParcelable("guestlogin.extras", guestLoginExtra);
        myOrdersGuestFragment.setArguments(bundle);
        return myOrdersGuestFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.q.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long j(int i) {
        return ((OrdersTab) this.q.get(i)).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        int iOrdinal = ((OrdersTab) this.q.get(i)).ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
