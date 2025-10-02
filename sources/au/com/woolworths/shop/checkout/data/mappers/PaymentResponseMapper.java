package au.com.woolworths.shop.checkout.data.mappers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.model.checkout.OrderSummary;
import au.com.woolworths.foundation.shop.model.checkout.PaymentErrors;
import au.com.woolworths.foundation.shop.model.checkout.PaymentStepUp;
import au.com.woolworths.foundation.shop.model.checkout.ResponseStatusWithErrorList;
import au.com.woolworths.foundation.shop.model.checkout.ResponseStatusWithErrorListForOkStatus;
import au.com.woolworths.shop.checkout.domain.model.PaymentError;
import au.com.woolworths.shop.checkout.domain.model.PaymentErrorStepUp;
import au.com.woolworths.shop.checkout.domain.model.PaymentResponse;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/data/mappers/PaymentResponseMapper;", "", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PaymentResponseMapper {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f10542a = new Gson();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/data/mappers/PaymentResponseMapper$Companion;", "", "", "ERROR_CODE_BAD_REQUEST", "I", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final JsonObject a(PaymentResponse paymentResponse) {
        Object orderSummary;
        boolean z = paymentResponse instanceof PaymentResponse.Fail;
        Gson gson = this.f10542a;
        if (z) {
            ArrayList<PaymentError> arrayList = ((PaymentResponse.Fail) paymentResponse).f10627a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            for (PaymentError paymentError : arrayList) {
                String str = paymentError.f10625a;
                String str2 = paymentError.b;
                String str3 = paymentError.c;
                PaymentErrorStepUp paymentErrorStepUp = paymentError.d;
                arrayList2.add(new ResponseStatusWithErrorListForOkStatus.PaymentInstrumentResponse(str, str2, str3, paymentErrorStepUp != null ? new PaymentStepUp(paymentErrorStepUp.f10626a, new URL(paymentErrorStepUp.b)) : null));
            }
            orderSummary = new ResponseStatusWithErrorListForOkStatus(arrayList2);
        } else {
            if (!(paymentResponse instanceof PaymentResponse.Success)) {
                if (!(paymentResponse instanceof PaymentResponse.ValidationError)) {
                    throw new NoWhenBranchMatchedException();
                }
                PaymentResponse.ValidationError validationError = (PaymentResponse.ValidationError) paymentResponse;
                ResponseBody.Companion companion = ResponseBody.e;
                String str4 = validationError.f10629a;
                String strJ = gson.j(new PaymentErrors(str4, new ResponseStatusWithErrorList(validationError.b, str4, null, null)));
                Intrinsics.g(strJ, "toJson(...)");
                companion.getClass();
                throw new HttpException(Response.a(400, ResponseBody.Companion.a(strJ, null)));
            }
            orderSummary = new OrderSummary(r11.f10628a, ((PaymentResponse.Success) paymentResponse).b);
        }
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(gson.j(orderSummary)));
            JsonElement jsonElementA = JsonParser.a(jsonReader);
            jsonElementA.getClass();
            if (!(jsonElementA instanceof JsonNull) && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return jsonElementA.b();
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException(e3);
        }
    }
}
