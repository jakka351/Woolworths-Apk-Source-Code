package au.com.woolworths.foundation.shop.model.checkout;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes4.dex */
public class ResponseStatusWithErrorListForOkStatus {

    @SerializedName("ErrorMessage")
    String ErrorMessage;

    @SerializedName("PaymentResponses")
    List<PaymentInstrumentResponse> PaymentResponses;

    public static class PaymentInstrumentResponse {

        @SerializedName("ErrorCode")
        protected String ErrorCode;

        @SerializedName("ErrorDetail")
        protected String ErrorDetail;

        @SerializedName("ErrorMessage")
        protected String ErrorMessage;

        @SerializedName("PaymentInstrumentId")
        protected String PaymentInstrumentId;

        @SerializedName("PaymentInstrumentType")
        protected String PaymentInstrumentType;

        @SerializedName("PaymentTransactionRef")
        protected String PaymentTransactionRef;

        @SerializedName("StepUp")
        protected PaymentStepUp StepUp;

        public PaymentInstrumentResponse() {
        }

        public final String a() {
            return this.ErrorCode;
        }

        public final String b() {
            return this.ErrorDetail;
        }

        public final String c() {
            return this.ErrorMessage;
        }

        public final String d() {
            return this.PaymentInstrumentId;
        }

        public final String e() {
            return this.PaymentInstrumentType;
        }

        public final String f() {
            return this.PaymentTransactionRef;
        }

        public final PaymentStepUp g() {
            return this.StepUp;
        }

        public PaymentInstrumentResponse(String str, String str2, String str3, PaymentStepUp paymentStepUp) {
            this.PaymentInstrumentId = str;
            this.ErrorCode = str2;
            this.ErrorMessage = str3;
            this.StepUp = paymentStepUp;
        }
    }

    public ResponseStatusWithErrorListForOkStatus(List<PaymentInstrumentResponse> list) {
        this.PaymentResponses = list;
    }

    public final String a() {
        return this.ErrorMessage;
    }

    public final List b() {
        return this.PaymentResponses;
    }
}
