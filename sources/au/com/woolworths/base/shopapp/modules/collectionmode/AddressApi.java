package au.com.woolworths.base.shopapp.modules.collectionmode;

import au.com.woolworths.base.shopapp.models.address.AddressInput;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/AddressApi;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AddressApi {
    Object a(AddressInput addressInput, Continuation continuation);

    Object b(int i, Continuation continuation);

    Object c(Continuation continuation);

    Object d(String str, Continuation continuation);

    Object e(String str, Continuation continuation);
}
