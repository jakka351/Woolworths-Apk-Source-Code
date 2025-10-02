package au.com.woolworths.foundation.shop.collectionmode;

import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import io.reactivex.functions.Function;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function {
    public final /* synthetic */ int d;
    public final /* synthetic */ LegacyShoppingModeRepositoryImpl e;
    public final /* synthetic */ SaveAddressResult.Address f;

    public /* synthetic */ b(LegacyShoppingModeRepositoryImpl legacyShoppingModeRepositoryImpl, SaveAddressResult.Address address, int i) {
        this.d = i;
        this.e = legacyShoppingModeRepositoryImpl;
        this.f = address;
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public final Object mo0apply(Object obj) {
        switch (this.d) {
            case 0:
                LegacyShoppingModeRepositoryImpl legacyShoppingModeRepositoryImpl = this.e;
                ArrayList arrayList = legacyShoppingModeRepositoryImpl.g;
                if (arrayList != null) {
                    arrayList.remove(this.f);
                }
                return legacyShoppingModeRepositoryImpl.g;
            default:
                LegacyShoppingModeRepositoryImpl legacyShoppingModeRepositoryImpl2 = this.e;
                legacyShoppingModeRepositoryImpl2.e.H();
                SaveAddressResult.Address address = this.f;
                legacyShoppingModeRepositoryImpl2.g(address);
                if (legacyShoppingModeRepositoryImpl2.c.d()) {
                    return legacyShoppingModeRepositoryImpl2.g;
                }
                legacyShoppingModeRepositoryImpl2.p(address);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(address);
                return arrayList2;
        }
    }
}
