package au.com.woolworths.feature.shop.myorders.generated.callback;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.feature.shop.myorders.databinding.FragmentOrdersListBindingImpl;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class OnRefreshListener implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentOrdersListBindingImpl f7848a;

    public interface Listener {
    }

    public OnRefreshListener(FragmentOrdersListBindingImpl fragmentOrdersListBindingImpl) {
        this.f7848a = fragmentOrdersListBindingImpl;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void a() {
        Callback.t();
        try {
            Function0 function0 = this.f7848a.C;
            if (function0 != null) {
            }
        } finally {
            Callback.u();
        }
    }
}
