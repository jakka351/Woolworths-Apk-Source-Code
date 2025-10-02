package au.com.woolworths.feature.shop.wpay.data.json.deserializer;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.wpay.domain.model.CreditCardFormWebEvent;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/data/json/deserializer/CreditCardFormWebEventDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lau/com/woolworths/feature/shop/wpay/domain/model/CreditCardFormWebEvent;", "<init>", "()V", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditCardFormWebEventDeserializer implements JsonDeserializer<CreditCardFormWebEvent> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/data/json/deserializer/CreditCardFormWebEventDeserializer$Companion;", "", "", "ELEMENT_EVENT", "Ljava/lang/String;", "ELEMENT_DATA", "EVENT_SUCCESS", "EVENT_FAIL", "EVENT_VALIDATION_ERROR", "EVENT_FORM_CHANGED", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        Intrinsics.h(json, "json");
        Intrinsics.h(typeOfT, "typeOfT");
        Intrinsics.h(context, "context");
        JsonObject jsonObjectB = json.b();
        String strG = jsonObjectB.i("event").g();
        if (strG != null) {
            switch (strG.hashCode()) {
                case -1867169789:
                    if (strG.equals("success")) {
                        Object objA = context.a(jsonObjectB.i("data"), CreditCardFormWebEvent.Success.class);
                        Intrinsics.g(objA, "deserialize(...)");
                        return (CreditCardFormWebEvent) objA;
                    }
                    break;
                case -127316309:
                    if (strG.equals("form-changed")) {
                        return CreditCardFormWebEvent.FormChanged.f8280a;
                    }
                    break;
                case 3135262:
                    if (strG.equals("fail")) {
                        Object objA2 = context.a(jsonObjectB.i("data"), CreditCardFormWebEvent.Fail.class);
                        Intrinsics.g(objA2, "deserialize(...)");
                        return (CreditCardFormWebEvent) objA2;
                    }
                    break;
                case 674377652:
                    if (strG.equals("validation-error")) {
                        CreditCardFormWebEvent.ValidationError validationError = jsonObjectB.i("data") == null ? new CreditCardFormWebEvent.ValidationError(null) : (CreditCardFormWebEvent.ValidationError) context.a(jsonObjectB.i("data"), CreditCardFormWebEvent.ValidationError.class);
                        Intrinsics.e(validationError);
                        return validationError;
                    }
                    break;
            }
        }
        return CreditCardFormWebEvent.Unknown.f8282a;
    }
}
