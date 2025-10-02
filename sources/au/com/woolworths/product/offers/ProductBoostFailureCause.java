package au.com.woolworths.product.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostFailureCause;", "", "NoConnectivity", "ServerError", "Lau/com/woolworths/product/offers/ProductBoostFailureCause$NoConnectivity;", "Lau/com/woolworths/product/offers/ProductBoostFailureCause$ServerError;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductBoostFailureCause {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostFailureCause$NoConnectivity;", "Lau/com/woolworths/product/offers/ProductBoostFailureCause;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoConnectivity extends ProductBoostFailureCause {

        /* renamed from: a, reason: collision with root package name */
        public static final NoConnectivity f9323a = new NoConnectivity();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostFailureCause$ServerError;", "Lau/com/woolworths/product/offers/ProductBoostFailureCause;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerError extends ProductBoostFailureCause {

        /* renamed from: a, reason: collision with root package name */
        public static final ServerError f9324a = new ServerError();
    }
}
