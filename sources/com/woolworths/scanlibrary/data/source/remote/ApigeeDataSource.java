package com.woolworths.scanlibrary.data.source.remote;

import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.ads.RequestConfiguration;
import com.woolworths.scanlibrary.models.authentication.AuthResponse;
import com.woolworths.scanlibrary.models.authentication.Request;
import com.woolworths.scanlibrary.models.authentication.SignoutResponse;
import com.woolworths.scanlibrary.models.authentication.firestore.FireStoreAccessResponse;
import com.woolworths.scanlibrary.models.authentication.guest.GuestLoginRequest;
import com.woolworths.scanlibrary.models.authentication.guest.GuestLoginResponse;
import com.woolworths.scanlibrary.models.authentication.reward.RewardLoginAPIRequest;
import com.woolworths.scanlibrary.models.cart.CartAddItemRequest;
import com.woolworths.scanlibrary.models.cart.CartResponse;
import com.woolworths.scanlibrary.models.cart.UpdateQuantityRequest;
import com.woolworths.scanlibrary.models.device.DeviceCloudInfo;
import com.woolworths.scanlibrary.models.notification.Notifications;
import com.woolworths.scanlibrary.models.payment.PaymentRequest;
import com.woolworths.scanlibrary.models.payment.PaymentResponse;
import com.woolworths.scanlibrary.models.pendingpromotions.ApprovePendingPromotionsRequest;
import com.woolworths.scanlibrary.models.product.search.AutoCompleteResponse;
import com.woolworths.scanlibrary.models.product.search.SearchResponse;
import com.woolworths.scanlibrary.models.profile.ProfileResponse;
import com.woolworths.scanlibrary.models.receipt.EmailReceiptRequest;
import com.woolworths.scanlibrary.models.receipt.EmailReceiptResponse;
import com.woolworths.scanlibrary.models.receipt.Receipt;
import com.woolworths.scanlibrary.models.receipt.ReceiptRequestByCartId;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.models.store.Stores;
import com.woolworths.scanlibrary.models.tapon.TapOnResponse;
import com.woolworths.scanlibrary.models.tapon.TapOnStoreDetailsRequest;
import com.woolworths.scanlibrary.models.transactions.TxnList;
import com.woolworths.scanlibrary.models.transferpos.TransferToPosResponse;
import com.woolworths.scanlibrary.models.user.TermsConditionInfo;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H'¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\b2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001bH'¢\u0006\u0004\b\u001e\u0010\u001fJI\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 2\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\b2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0001\u0010!\u001a\u00020\bH'¢\u0006\u0004\b\"\u0010#J?\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\b2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0001\u0010!\u001a\u00020\bH'¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b)\u0010'J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b*\u0010'J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00042\b\b\u0001\u0010\u0003\u001a\u00020+H'¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0004H'¢\u0006\u0004\b0\u0010\u0015J\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b1\u0010'J\u001f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00042\b\b\u0001\u0010\u0003\u001a\u000202H'¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\b\u0012\u0004\u0012\u0002030\u0004H'¢\u0006\u0004\b6\u0010\u0015J\u001f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00042\b\b\u0001\u0010\u0003\u001a\u000207H'¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00042\b\b\u0001\u0010\u0003\u001a\u00020;H'¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020<0\u0004H'¢\u0006\u0004\b?\u0010\u0015J=\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00042\b\b\u0001\u0010@\u001a\u00020\b2\b\b\u0001\u0010A\u001a\u00020\b2\b\b\u0001\u0010B\u001a\u00020\b2\b\b\u0001\u0010C\u001a\u00020\bH'¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\b\u0012\u0004\u0012\u0002080\u00042\b\b\u0001\u0010H\u001a\u00020GH'¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u0004H'¢\u0006\u0004\bL\u0010\u0015J\u001f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00042\b\b\u0001\u0010M\u001a\u00020\bH'¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\b\u0012\u0004\u0012\u00020N0\u00042\b\b\u0001\u0010Q\u001a\u00020\bH'¢\u0006\u0004\bR\u0010PJ\u001f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0S2\b\b\u0001\u0010M\u001a\u00020\bH'¢\u0006\u0004\bU\u0010VJ\u0015\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u0004H'¢\u0006\u0004\bX\u0010\u0015J\u0015\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u0004H'¢\u0006\u0004\bZ\u0010\u0015J\u001f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\\\u001a\u00020[H'¢\u0006\u0004\b]\u0010^J\u001f\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u00042\b\b\u0001\u0010\u0003\u001a\u00020_H'¢\u0006\u0004\ba\u0010bJ\u0015\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u0004H'¢\u0006\u0004\bd\u0010\u0015J\u0015\u0010e\u001a\b\u0012\u0004\u0012\u0002080\u0004H'¢\u0006\u0004\be\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006fÀ\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/data/source/remote/ApigeeDataSource;", "", "Lcom/woolworths/scanlibrary/models/authentication/Request;", "request", "Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/authentication/AuthResponse;", "x", "(Lcom/woolworths/scanlibrary/models/authentication/Request;)Lio/reactivex/Single;", "", "authcode", "tempToken", "Lcom/woolworths/scanlibrary/models/authentication/reward/RewardLoginAPIRequest;", "rewardAPIRequest", "s", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/authentication/reward/RewardLoginAPIRequest;)Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/authentication/guest/GuestLoginRequest;", "Lcom/woolworths/scanlibrary/models/authentication/guest/GuestLoginResponse;", "z", "(Lcom/woolworths/scanlibrary/models/authentication/guest/GuestLoginRequest;)Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/authentication/SignoutResponse;", "t", "()Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/cart/CartAddItemRequest;", "requestId", "", "storeId", "cartView", "", "fullCartRequired", "Lcom/woolworths/scanlibrary/models/cart/CartResponse;", "w", "(Lcom/woolworths/scanlibrary/models/cart/CartAddItemRequest;ILjava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/cart/UpdateQuantityRequest;", "lineNo", "A", "(Lcom/woolworths/scanlibrary/models/cart/UpdateQuantityRequest;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lio/reactivex/Single;", "O", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lio/reactivex/Single;", "P", "(I)Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/store/Store;", "r", "J", "Lcom/woolworths/scanlibrary/models/tapon/TapOnStoreDetailsRequest;", "Lcom/woolworths/scanlibrary/models/tapon/TapOnResponse;", "u", "(Lcom/woolworths/scanlibrary/models/tapon/TapOnStoreDetailsRequest;)Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/profile/ProfileResponse;", "Q", "H", "Lcom/woolworths/scanlibrary/models/receipt/ReceiptRequestByCartId;", "Lcom/woolworths/scanlibrary/models/receipt/Receipt;", "v", "(Lcom/woolworths/scanlibrary/models/receipt/ReceiptRequestByCartId;)Lio/reactivex/Single;", "F", "Lcom/woolworths/scanlibrary/models/device/DeviceCloudInfo;", "Lokhttp3/ResponseBody;", "D", "(Lcom/woolworths/scanlibrary/models/device/DeviceCloudInfo;)Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/payment/PaymentRequest;", "Lcom/woolworths/scanlibrary/models/payment/PaymentResponse;", "M", "(Lcom/woolworths/scanlibrary/models/payment/PaymentRequest;)Lio/reactivex/Single;", "E", "appId", "deviceId", "osVersion", "appVersion", "Lcom/woolworths/scanlibrary/models/notification/Notifications;", "C", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/user/TermsConditionInfo;", "termsConditionInfo", "K", "(Lcom/woolworths/scanlibrary/models/user/TermsConditionInfo;)Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/transactions/TxnList;", "q", SearchIntents.EXTRA_QUERY, "Lcom/woolworths/scanlibrary/models/product/search/SearchResponse;", "L", "(Ljava/lang/String;)Lio/reactivex/Single;", "url", "y", "Lio/reactivex/Observable;", "Lcom/woolworths/scanlibrary/models/product/search/AutoCompleteResponse;", "S", "(Ljava/lang/String;)Lio/reactivex/Observable;", "Lcom/woolworths/scanlibrary/models/store/Stores;", "I", "Lcom/woolworths/scanlibrary/models/authentication/firestore/FireStoreAccessResponse;", "b", "Lcom/woolworths/scanlibrary/models/pendingpromotions/ApprovePendingPromotionsRequest;", "promotions", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Lcom/woolworths/scanlibrary/models/pendingpromotions/ApprovePendingPromotionsRequest;)Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/receipt/EmailReceiptRequest;", "Lcom/woolworths/scanlibrary/models/receipt/EmailReceiptResponse;", "R", "(Lcom/woolworths/scanlibrary/models/receipt/EmailReceiptRequest;)Lio/reactivex/Single;", "Lcom/woolworths/scanlibrary/models/transferpos/TransferToPosResponse;", "B", "N", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ApigeeDataSource {
    @PUT("/scan/go/v3/cart/items/{lineItem}")
    @NotNull
    Single<CartResponse> A(@Body @NotNull UpdateQuantityRequest request, @Header("storeid") int storeId, @Header("cartview") @NotNull String cartView, @Header("isfullcartresponse") @Nullable Boolean fullCartRequired, @Path(encoded = true, value = "lineItem") @NotNull String lineNo);

    @GET("/scan/go/transaction/save")
    @NotNull
    Single<TransferToPosResponse> B();

    @GET("/wow/v1/notifications")
    @NotNull
    Single<Notifications> C(@NotNull @Query("appid") String appId, @NotNull @Query("deviceid") String deviceId, @NotNull @Query("osversion") String osVersion, @NotNull @Query("appversion") String appVersion);

    @POST("/scan/go/device/register")
    @NotNull
    Single<ResponseBody> D(@Body @NotNull DeviceCloudInfo request);

    @GET("/scan/go/transaction/complete")
    @NotNull
    Single<PaymentResponse> E();

    @GET("/scan/go/receipt/view/parking")
    @NotNull
    Single<Receipt> F();

    @POST("/scan/go/promotions/approve")
    @NotNull
    Single<CartResponse> G(@Body @NotNull ApprovePendingPromotionsRequest promotions);

    @GET("/scan/go/checkout")
    @NotNull
    Single<CartResponse> H(@Header("storeid") int storeId);

    @GET("/scan/go/stores/details")
    @NotNull
    Single<Stores> I();

    @GET("/scan/go/cart")
    @NotNull
    Single<CartResponse> J(@Header("storeid") int storeId);

    @POST("/scan/go/tnc/accept")
    @NotNull
    Single<ResponseBody> K(@Body @NotNull TermsConditionInfo termsConditionInfo);

    @GET("/scan/go/find/product")
    @NotNull
    Single<SearchResponse> L(@NotNull @Query("q") String query);

    @POST("/scan/go/payment")
    @NotNull
    Single<PaymentResponse> M(@Body @NotNull PaymentRequest request);

    @GET("/scan/go/recall/confirm")
    @NotNull
    Single<ResponseBody> N();

    @DELETE("/scan/go/v3/cart/items/{lineItem}")
    @NotNull
    Single<CartResponse> O(@Header("storeid") int storeId, @Header("cartview") @NotNull String cartView, @Header("isfullcartresponse") @Nullable Boolean fullCartRequired, @Path(encoded = true, value = "lineItem") @NotNull String lineNo);

    @DELETE("/scan/go/cart")
    @NotNull
    Single<CartResponse> P(@Header("storeid") int storeId);

    @GET("/scan/go/userprofile")
    @NotNull
    Single<ProfileResponse> Q();

    @POST("/scan/go/receipt/email/pdf")
    @NotNull
    Single<EmailReceiptResponse> R(@Body @NotNull EmailReceiptRequest request);

    @GET("/scan/go/find/product/autocomplete")
    @NotNull
    Observable<AutoCompleteResponse> S(@NotNull @Query("q") String query);

    @GET("/scan/go/datasync/access")
    @NotNull
    Single<FireStoreAccessResponse> b();

    @GET("/scan/go/transaction/history")
    @NotNull
    Single<TxnList> q();

    @GET("/scan/go/storelocator/{storeId}")
    @NotNull
    Single<Store> r(@Path("storeId") int storeId);

    @POST("/scan/go/v2/login/rewards")
    @NotNull
    Single<AuthResponse> s(@Header("authcode") @NotNull String authcode, @Header("authorization") @NotNull String tempToken, @Body @NotNull RewardLoginAPIRequest rewardAPIRequest);

    @GET("scan/go/signout")
    @NotNull
    Single<SignoutResponse> t();

    @POST("/scan/go/tapon")
    @NotNull
    Single<TapOnResponse> u(@Body @NotNull TapOnStoreDetailsRequest request);

    @POST("/scan/go/receipt/view")
    @NotNull
    Single<Receipt> v(@Body @NotNull ReceiptRequestByCartId request);

    @POST("/scan/go/cart/items")
    @NotNull
    Single<CartResponse> w(@Body @NotNull CartAddItemRequest requestId, @Header("storeid") int storeId, @Header("cartview") @NotNull String cartView, @Header("isfullcartresponse") @Nullable Boolean fullCartRequired);

    @POST("/scan/go/v2/login")
    @NotNull
    Single<AuthResponse> x(@Body @NotNull Request request);

    @GET
    @NotNull
    Single<SearchResponse> y(@Url @NotNull String url);

    @POST("/scan/go/v1/login/guest")
    @NotNull
    Single<GuestLoginResponse> z(@Body @NotNull GuestLoginRequest request);
}
