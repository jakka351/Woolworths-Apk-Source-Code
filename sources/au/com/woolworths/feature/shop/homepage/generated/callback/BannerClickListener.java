package au.com.woolworths.feature.shop.homepage.generated.callback;

import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.feature.shop.homepage.databinding.EpoxyItemOrdersTileBindingImpl;
import au.com.woolworths.feature.shop.homepage.presentation.OrdersClickListener;

/* loaded from: classes3.dex */
public final class BannerClickListener implements au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner.BannerClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final EpoxyItemOrdersTileBindingImpl f7208a;

    public interface Listener {
    }

    public BannerClickListener(EpoxyItemOrdersTileBindingImpl epoxyItemOrdersTileBindingImpl) {
        this.f7208a = epoxyItemOrdersTileBindingImpl;
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner.BannerClickListener
    public final void a() {
        EpoxyItemOrdersTileBindingImpl epoxyItemOrdersTileBindingImpl = this.f7208a;
        OrdersClickListener ordersClickListener = epoxyItemOrdersTileBindingImpl.H;
        OrderCardData orderCardData = epoxyItemOrdersTileBindingImpl.G;
        if (ordersClickListener != null) {
            ordersClickListener.B3(orderCardData);
        }
    }
}
