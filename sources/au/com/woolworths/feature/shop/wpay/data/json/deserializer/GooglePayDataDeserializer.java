package au.com.woolworths.feature.shop.wpay.data.json.deserializer;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.wpay.domain.model.GooglePayData;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/data/json/deserializer/GooglePayDataDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lau/com/woolworths/feature/shop/wpay/domain/model/GooglePayData;", "<init>", "()V", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayDataDeserializer implements JsonDeserializer<GooglePayData> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/data/json/deserializer/GooglePayDataDeserializer$Companion;", "", "", "ELEMENT_PAYMENT_METHOD", "Ljava/lang/String;", "ELEMENT_TOKENIZATION_DATA", "ELEMENT_TOKEN", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        Intrinsics.h(json, "json");
        Intrinsics.h(typeOfT, "typeOfT");
        Intrinsics.h(context, "context");
        String strG = json.b().i("paymentMethodData").b().i("tokenizationData").b().i("token").g();
        Intrinsics.g(strG, "getAsString(...)");
        return new GooglePayData(strG);
    }
}
