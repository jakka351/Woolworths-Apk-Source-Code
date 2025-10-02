package au.com.woolworths.android.onesite.network;

import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.TrolleyUpdateData;
import au.com.woolworths.android.onesite.models.config.ConfigResponse;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.android.onesite.models.search.AutoCompleteResponse;
import au.com.woolworths.android.onesite.modules.collectionmode.api.FulfilmentResponse;
import au.com.woolworths.android.onesite.modules.collectionmode.api.UpdateSelectedPickUpLocationRequest;
import au.com.woolworths.android.onesite.modules.storelocator.apis.PickUpLocationsResponse;
import com.salesforce.marketingcloud.storage.db.h;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001+J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0015\u001a\u00020\u00142\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 H'¢\u0006\u0004\b#\u0010$J%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\u00052\b\b\u0001\u0010&\u001a\u00020%H'¢\u0006\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/network/ApiInterface;", "", "", "url", "rewardsId", "Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/models/TrolleyResult;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/models/TrolleyUpdateData;", "trolleyData", "g", "(Ljava/lang/String;Lau/com/woolworths/android/onesite/models/TrolleyUpdateData;)Lio/reactivex/Single;", "appId", "deviceId", "Lau/com/woolworths/android/onesite/models/notification/NotificationResult;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "", "data", "Lau/com/woolworths/android/onesite/models/config/ConfigResponse;", "c", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryParameters", "Lio/reactivex/Observable;", "Lau/com/woolworths/android/onesite/models/search/AutoCompleteResponse;", "e", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/Observable;", "postcode", "Lau/com/woolworths/android/onesite/modules/storelocator/apis/PickUpLocationsResponse;", "h", "(Ljava/lang/String;)Lio/reactivex/Single;", "", h.a.b, h.a.c, "f", "(DD)Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/modules/collectionmode/api/UpdateSelectedPickUpLocationRequest;", "updateSelectedPickUpStoreRequest", "Lretrofit2/Response;", "Lau/com/woolworths/android/onesite/modules/collectionmode/api/FulfilmentResponse;", "a", "(Lau/com/woolworths/android/onesite/modules/collectionmode/api/UpdateSelectedPickUpLocationRequest;)Lio/reactivex/Single;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ApiInterface {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/ApiInterface$Companion;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    @POST("wow/v3/fulfilment")
    @NotNull
    Single<Response<FulfilmentResponse>> a(@Body @NotNull UpdateSelectedPickUpLocationRequest updateSelectedPickUpStoreRequest);

    @GET
    @NotNull
    Single<NotificationResult> b(@Url @NotNull String url, @NotNull @Query("appid") String appId, @NotNull @Query("deviceid") String deviceId);

    @POST("wow/v2/commerce/config")
    @Nullable
    Object c(@Body @NotNull Map<String, String> map, @NotNull Continuation<? super ConfigResponse> continuation);

    @GET
    @NotNull
    Single<TrolleyResult> d(@Url @NotNull String url, @Nullable @Query("edr") String rewardsId);

    @GET
    @NotNull
    Observable<AutoCompleteResponse> e(@Url @NotNull String url, @QueryMap @NotNull Map<String, String> queryParameters);

    @GET("wow/v2/addresses/stores")
    @NotNull
    Single<PickUpLocationsResponse> f(@Query(h.a.b) double latitude, @Query(h.a.c) double longitude);

    @POST
    @NotNull
    Single<TrolleyResult> g(@Url @NotNull String url, @Body @NotNull TrolleyUpdateData trolleyData);

    @GET("wow/v2/addresses/stores")
    @NotNull
    Single<PickUpLocationsResponse> h(@NotNull @Query("postcode") String postcode);
}
