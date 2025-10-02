package au.com.woolworths.foundation.shop.storelocator.network;

import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.foundation.shop.storelocator.models.PickUpSuburbResponse;
import com.salesforce.marketingcloud.storage.db.h;
import io.reactivex.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u0007J7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/network/StoreLocatorApiInterface;", "", "", "url", "Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/models/storelocator/StoreLocatorResult;", "a", "(Ljava/lang/String;)Lio/reactivex/Single;", "searchText", "Lau/com/woolworths/foundation/shop/storelocator/models/PickUpSuburbResponse;", "b", "storeId", "", h.a.b, h.a.c, "Lau/com/woolworths/android/onesite/models/storelocator/StoreLocatorResult$Store;", "c", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lio/reactivex/Single;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StoreLocatorApiInterface {
    @GET
    @NotNull
    Single<StoreLocatorResult> a(@Url @NotNull String url);

    @GET("wow/v2/stores?type=suburb")
    @NotNull
    Single<PickUpSuburbResponse> b(@NotNull @Query("q") String searchText);

    @GET("wow/v2/stores/{storeId}")
    @NotNull
    Single<StoreLocatorResult.Store> c(@Path("storeId") @NotNull String storeId, @Nullable @Query("lat") Double latitude, @Nullable @Query("lon") Double longitude);
}
