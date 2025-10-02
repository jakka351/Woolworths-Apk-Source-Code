package au.com.woolworths.foundation.google.pay;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/google/pay/PaymentsUtil;", "", "google-pay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentsUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final JSONObject f8532a = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
    public static final JSONArray b = new JSONArray((Collection) Constants.f8528a);
    public static final JSONObject c;

    static {
        JSONObject jSONObjectPut = new JSONObject().put("merchantName", "Woolworths");
        Intrinsics.g(jSONObjectPut, "put(...)");
        c = jSONObjectPut;
    }

    public static JSONObject a(List list) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("type", "CARD").put("parameters", new JSONObject().put("allowedAuthMethods", b).put("allowedCardNetworks", new JSONArray((Collection) list)).put("billingAddressRequired", true).put("billingAddressParameters", new JSONObject().put("format", "FULL")));
        Intrinsics.g(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public static JSONArray b(String merchantId, List allowedCardNetworks) throws JSONException {
        Intrinsics.h(merchantId, "merchantId");
        Intrinsics.h(allowedCardNetworks, "allowedCardNetworks");
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectA = a(allowedCardNetworks);
        JSONObject jSONObjectPut = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject(MapsKt.j(new Pair("gateway", "gr4vy"), new Pair("gatewayMerchantId", merchantId))));
        Intrinsics.g(jSONObjectPut, "put(...)");
        JSONObject jSONObjectPut2 = jSONObjectA.put("tokenizationSpecification", jSONObjectPut);
        Intrinsics.g(jSONObjectPut2, "put(...)");
        JSONArray jSONArrayPut = jSONArray.put(jSONObjectPut2);
        Intrinsics.g(jSONArrayPut, "put(...)");
        return jSONArrayPut;
    }
}
