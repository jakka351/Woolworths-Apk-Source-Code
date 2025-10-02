package au.com.woolworths.base.shopapp.modules.collectionmode;

import au.com.woolworths.android.onesite.modules.collectionmode.api.FulfilmentResponse;
import au.com.woolworths.base.shopapp.models.address.AddressResult;
import au.com.woolworths.base.shopapp.models.address.DeleteAddressResult;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import au.com.woolworths.base.shopapp.models.address.SuburbResult;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001%J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\n2\u0014\b\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001aH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010\u0007R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\n8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/ShoppingModeApi;", "", "", "searchText", "Lio/reactivex/Observable;", "Lau/com/woolworths/base/shopapp/models/address/AddressResult;", "c", "(Ljava/lang/String;)Lio/reactivex/Observable;", "Lau/com/woolworths/base/shopapp/models/address/AddressResult$AmasAddressToSave;", "amasAddress", "Lio/reactivex/Single;", "Lau/com/woolworths/base/shopapp/models/address/SaveAddressResult$Address;", "d", "(Lau/com/woolworths/base/shopapp/models/address/AddressResult$AmasAddressToSave;)Lio/reactivex/Single;", "Lau/com/woolworths/base/shopapp/models/address/AddressResult$AlternateAddressToSave;", "altAddress", "g", "(Lau/com/woolworths/base/shopapp/models/address/AddressResult$AlternateAddressToSave;)Lio/reactivex/Single;", "Lau/com/woolworths/base/shopapp/models/address/AddressResult$ManualAddressToSave;", "manualAddress", "a", "(Lau/com/woolworths/base/shopapp/models/address/AddressResult$ManualAddressToSave;)Lio/reactivex/Single;", "addressId", "Lau/com/woolworths/base/shopapp/models/address/DeleteAddressResult;", "h", "(Ljava/lang/String;)Lio/reactivex/Single;", "", "addressDetails", "Lau/com/woolworths/android/onesite/modules/collectionmode/api/FulfilmentResponse;", "e", "(Ljava/util/Map;)Lio/reactivex/Single;", "Lau/com/woolworths/base/shopapp/models/address/SuburbResult;", "b", "Lau/com/woolworths/base/shopapp/models/address/SaveAddressResult;", "f", "()Lio/reactivex/Single;", "savedAddress", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ShoppingModeApi {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/ShoppingModeApi$Companion;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    @POST("wow/v2/addresses")
    @NotNull
    Single<SaveAddressResult.Address> a(@Body @NotNull AddressResult.ManualAddressToSave manualAddress);

    @GET("wow/v2/addresses")
    @NotNull
    Observable<SuburbResult> b(@NotNull @Query("postcode") String searchText);

    @GET("wow/v2/addresses")
    @NotNull
    Observable<AddressResult> c(@NotNull @Query("q") String searchText);

    @POST("wow/v2/addresses")
    @NotNull
    Single<SaveAddressResult.Address> d(@Body @NotNull AddressResult.AmasAddressToSave amasAddress);

    @POST("wow/v3/fulfilment")
    @NotNull
    Single<FulfilmentResponse> e(@Body @NotNull Map<String, String> addressDetails);

    @GET("wow/v2/addresses")
    @NotNull
    Single<SaveAddressResult> f();

    @POST("wow/v2/addresses")
    @NotNull
    Single<SaveAddressResult.Address> g(@Body @NotNull AddressResult.AlternateAddressToSave altAddress);

    @DELETE("wow/v2/addresses/{addressId}")
    @NotNull
    Single<DeleteAddressResult> h(@Path("addressId") @NotNull String addressId);
}
