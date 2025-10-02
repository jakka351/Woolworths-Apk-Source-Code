package au.com.woolworths.feature.shop.instore.cart.ui;

import au.com.woolworths.feature.shop.instore.cart.InstoreCartContract;
import au.com.woolworths.feature.shop.instore.cart.data.InstoreCartData;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/ui/InstoreCartViewStateParam;", "", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstoreCartViewStateParam {
    public static final /* synthetic */ InstoreCartViewStateParam[] e;
    public static final /* synthetic */ EnumEntries f;
    public final InstoreCartContract.ViewState d;

    static {
        InstoreCartViewStateParam[] instoreCartViewStateParamArr = {new InstoreCartViewStateParam("Content", 0, new InstoreCartContract.ViewState.InstoreCartContent(new InstoreCartData(3, CollectionsKt.R(InstoreCartScreenKt.d, InstoreCartScreenKt.e, InstoreCartScreenKt.f)), true)), new InstoreCartViewStateParam("Empty", 1, InstoreCartContract.ViewState.Empty.f7303a), new InstoreCartViewStateParam("Loading", 2, InstoreCartContract.ViewState.Loading.f7306a), new InstoreCartViewStateParam("ConnectionError", 3, new InstoreCartContract.ViewState.Error(FullPageMessage.Error.ConnectionError.f8915a)), new InstoreCartViewStateParam("ServerError", 4, new InstoreCartContract.ViewState.Error(FullPageMessage.Error.ServerError.f8916a))};
        e = instoreCartViewStateParamArr;
        f = EnumEntriesKt.a(instoreCartViewStateParamArr);
    }

    public InstoreCartViewStateParam(String str, int i, InstoreCartContract.ViewState viewState) {
        this.d = viewState;
    }

    public static InstoreCartViewStateParam valueOf(String str) {
        return (InstoreCartViewStateParam) Enum.valueOf(InstoreCartViewStateParam.class, str);
    }

    public static InstoreCartViewStateParam[] values() {
        return (InstoreCartViewStateParam[]) e.clone();
    }
}
