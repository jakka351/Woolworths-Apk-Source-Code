package com.woolworths.scanlibrary.data.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.woolworths.scanlibrary.data.payment.PaymentStatus;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/data/payment/PaymentStatusTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/woolworths/scanlibrary/data/payment/PaymentStatus;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaymentStatusTypeAdapter extends TypeAdapter<PaymentStatus> {
    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        PaymentStatus.Companion companion = PaymentStatus.INSTANCE;
        String strNextString = jsonReader != null ? jsonReader.nextString() : null;
        companion.getClass();
        for (PaymentStatus paymentStatus : PaymentStatus.values()) {
            if (Intrinsics.c(paymentStatus.getStatus(), strNextString)) {
                return paymentStatus;
            }
        }
        return PaymentStatus.UNKNOWN;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        PaymentStatus paymentStatus = (PaymentStatus) obj;
        if (jsonWriter != null) {
            jsonWriter.value(paymentStatus != null ? paymentStatus.getStatus() : null);
        }
    }
}
