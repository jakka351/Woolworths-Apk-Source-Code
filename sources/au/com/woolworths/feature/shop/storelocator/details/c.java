package au.com.woolworths.feature.shop.storelocator.details;

import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.details.models.StoreExtKt;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Store e;
    public final /* synthetic */ StoreDetailsContract.ViewState f;

    public /* synthetic */ c(StoreDetailsContract.ViewState viewState, Store store) {
        this.d = 2;
        this.f = viewState;
        this.e = store;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Store store = this.e;
        StoreDetailsContract.ViewState viewState = this.f;
        switch (i) {
            case 0:
                int i2 = StoreDetailsScreenKt.f8144a;
                String strB = StoreExtKt.b(store);
                if (strB != null) {
                    Function1 function1 = viewState.h;
                    String strC = StoreExtKt.c(store);
                    function1.invoke(new StoreDetailsContract.ViewModelAction.PickUpAddressSelected(strB, strC != null ? strC : ""));
                    break;
                }
                break;
            case 1:
                int i3 = StoreDetailsScreenKt.f8144a;
                String strA = StoreExtKt.a(store);
                if (strA != null) {
                    Function1 function12 = viewState.h;
                    String strC2 = StoreExtKt.c(store);
                    function12.invoke(new StoreDetailsContract.ViewModelAction.PickUpAddressSelected(strA, strC2 != null ? strC2 : ""));
                    break;
                }
                break;
            default:
                int i4 = StoreDetailsScreenKt.f8144a;
                viewState.h.invoke(new StoreDetailsContract.ViewAction.ShopInStoreSelected(store));
                break;
        }
        return unit;
    }

    public /* synthetic */ c(Store store, StoreDetailsContract.ViewState viewState, int i) {
        this.d = i;
        this.e = store;
        this.f = viewState;
    }
}
