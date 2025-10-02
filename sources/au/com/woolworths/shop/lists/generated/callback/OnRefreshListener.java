package au.com.woolworths.shop.lists.generated.callback;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.shop.lists.databinding.ActivityShoppingListBindingImpl;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes4.dex */
public final class OnRefreshListener implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityShoppingListBindingImpl f12297a;

    public interface Listener {
    }

    public OnRefreshListener(ActivityShoppingListBindingImpl activityShoppingListBindingImpl) {
        this.f12297a = activityShoppingListBindingImpl;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void a() {
        Callback.t();
        try {
            ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.f12297a.R;
            if (iShoppingListDetailsViewModel != null) {
                iShoppingListDetailsViewModel.c5();
            }
        } finally {
            Callback.u();
        }
    }
}
