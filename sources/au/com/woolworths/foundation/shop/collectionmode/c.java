package au.com.woolworths.foundation.shop.collectionmode;

import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case 0:
                LegacyShoppingModeRepositoryImpl legacyShoppingModeRepositoryImpl = (LegacyShoppingModeRepositoryImpl) this.e;
                legacyShoppingModeRepositoryImpl.g((SaveAddressResult.Address) this.f);
                ArrayList arrayList = legacyShoppingModeRepositoryImpl.g;
                return arrayList != null ? arrayList : new ArrayList();
            default:
                throw null;
        }
    }
}
