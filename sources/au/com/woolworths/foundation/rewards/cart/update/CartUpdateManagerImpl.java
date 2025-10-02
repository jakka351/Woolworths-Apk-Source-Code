package au.com.woolworths.foundation.rewards.cart.update;

import au.com.woolworths.foundation.rewards.cart.info.data.CartInfoInteractor;
import au.com.woolworths.foundation.rewards.cart.update.data.CartQuantitiesInteractorImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/CartUpdateManagerImpl;", "Lau/com/woolworths/foundation/rewards/cart/update/CartUpdateManager;", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CartUpdateManagerImpl implements CartUpdateManager {

    /* renamed from: a, reason: collision with root package name */
    public final CartInfoInteractor f8555a;
    public final LinkedHashMap b;

    public CartUpdateManagerImpl(CartInfoInteractor cartInfoInteractor, CartQuantitiesInteractorImpl cartQuantitiesInteractorImpl) {
        Intrinsics.h(cartInfoInteractor, "cartInfoInteractor");
        this.f8555a = cartInfoInteractor;
        this.b = new LinkedHashMap();
    }

    @Override // au.com.woolworths.foundation.rewards.cart.update.CartUpdateManager
    public final void clear() {
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.put((String) it.next(), 0);
        }
    }
}
