package au.com.woolworths.foundation.shop.collectionmode;

import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int d;
    public final /* synthetic */ LegacyShoppingModeRepositoryImpl e;

    public /* synthetic */ a(LegacyShoppingModeRepositoryImpl legacyShoppingModeRepositoryImpl, int i) {
        this.d = i;
        this.e = legacyShoppingModeRepositoryImpl;
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public final Object mo0apply(Object obj) {
        ArrayList arrayList;
        switch (this.d) {
            case 0:
                String str = (String) obj;
                LegacyShoppingModeRepositoryImpl legacyShoppingModeRepositoryImpl = this.e;
                return legacyShoppingModeRepositoryImpl.i.c(BaseShopAppFeature.n) ? legacyShoppingModeRepositoryImpl.h.e(str) : legacyShoppingModeRepositoryImpl.d.b(str);
            case 1:
                SaveAddressResult saveAddressResult = (SaveAddressResult) obj;
                ArrayList arrayList2 = new ArrayList();
                LegacyShoppingModeRepositoryImpl legacyShoppingModeRepositoryImpl2 = this.e;
                if (saveAddressResult != null && saveAddressResult.a() != null && saveAddressResult.a().size() > 0) {
                    for (SaveAddressResult.Address address : saveAddressResult.a()) {
                        if (address.g()) {
                            legacyShoppingModeRepositoryImpl2.p(address);
                        }
                        if (!arrayList2.contains(address) && (legacyShoppingModeRepositoryImpl2.m() == null || !legacyShoppingModeRepositoryImpl2.m().toString().equals(address.toString()))) {
                            arrayList2.add(address);
                        }
                    }
                }
                legacyShoppingModeRepositoryImpl2.g = arrayList2;
                return arrayList2;
            default:
                SaveAddressResult.Address address2 = (SaveAddressResult.Address) obj;
                LegacyShoppingModeRepositoryImpl legacyShoppingModeRepositoryImpl3 = this.e;
                if (legacyShoppingModeRepositoryImpl3.e.R()) {
                    return legacyShoppingModeRepositoryImpl3.i(address2);
                }
                legacyShoppingModeRepositoryImpl3.g(address2);
                if (legacyShoppingModeRepositoryImpl3.c.d()) {
                    arrayList = legacyShoppingModeRepositoryImpl3.g;
                } else {
                    legacyShoppingModeRepositoryImpl3.p(address2);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(address2);
                    arrayList = arrayList3;
                }
                return Single.e(arrayList);
        }
    }
}
