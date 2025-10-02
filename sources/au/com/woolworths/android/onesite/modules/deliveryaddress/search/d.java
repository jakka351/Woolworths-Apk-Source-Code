package au.com.woolworths.android.onesite.modules.deliveryaddress.search;

import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DeliveryAddressSearchViewModel e;
    public final /* synthetic */ SaveAddressResult.Address f;

    public /* synthetic */ d(DeliveryAddressSearchViewModel deliveryAddressSearchViewModel, SaveAddressResult.Address address, int i) {
        this.d = i;
        this.e = deliveryAddressSearchViewModel;
        this.f = address;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                this.e.i.r(this.f.f());
                break;
            default:
                this.e.e.g(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
