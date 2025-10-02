package au.com.woolworths.checkout.network;

import au.com.woolworths.checkout.models.PayPalTokenResponse;
import au.com.woolworths.checkout.models.PaymentState;
import au.com.woolworths.foundation.shop.model.checkout.DigitalPayPaymentData;
import com.google.gson.JsonObject;
import io.reactivex.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Url;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0013J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lau/com/woolworths/checkout/network/CheckoutApiInterface;", "", "", "apiFeatures", "url", "Lio/reactivex/Single;", "Lau/com/woolworths/checkout/models/PaymentState;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "Lcom/google/gson/JsonObject;", "c", "Lau/com/woolworths/foundation/shop/model/checkout/DigitalPayPaymentData;", "digitalPayPaymentData", "b", "(Ljava/lang/String;Lau/com/woolworths/foundation/shop/model/checkout/DigitalPayPaymentData;)Lio/reactivex/Single;", "Lau/com/woolworths/checkout/models/PayPalTokenResponse;", "a", "()Lio/reactivex/Single;", "payPalClientToken", "Companion", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CheckoutApiInterface {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/checkout/network/CheckoutApiInterface$Companion;", "", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @GET("wow/v2/commerce/paypal/token")
    @NotNull
    Single<PayPalTokenResponse> a();

    @POST("wow/v2/commerce/checkout/payment/digitalpay")
    @NotNull
    Single<JsonObject> b(@Header("x-enable-feature") @Nullable String apiFeatures, @Body @NotNull DigitalPayPaymentData digitalPayPaymentData);

    @POST
    @NotNull
    Single<JsonObject> c(@Header("x-enable-feature") @Nullable String apiFeatures, @Url @NotNull String url);

    @GET
    @NotNull
    Single<PaymentState> d(@Header("x-enable-feature") @Nullable String apiFeatures, @Url @NotNull String url);
}
