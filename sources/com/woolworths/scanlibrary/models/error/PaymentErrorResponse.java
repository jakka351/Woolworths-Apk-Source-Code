package com.woolworths.scanlibrary.models.error;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u000bR$\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/woolworths/scanlibrary/models/error/PaymentErrorResponse;", "Lcom/woolworths/scanlibrary/models/error/ApigeeErrorResponse;", "<init>", "()V", "stepUp", "Lcom/woolworths/scanlibrary/models/error/PaymentErrorResponse$StepUp;", "getStepUp", "()Lcom/woolworths/scanlibrary/models/error/PaymentErrorResponse$StepUp;", "setStepUp", "(Lcom/woolworths/scanlibrary/models/error/PaymentErrorResponse$StepUp;)V", "paymentFailLimitExceeded", "", "getPaymentFailLimitExceeded", "()Z", "setPaymentFailLimitExceeded", "(Z)V", "needStepUp", "StepUp", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaymentErrorResponse extends ApigeeErrorResponse {

    @NotNull
    public static final String ERROR_ILLEGAL_STEPUP_TOKEN = "BV57";

    @NotNull
    public static final String ERROR_REQUIRE_STEPUP_TOKEN = "BV59";

    @SerializedName("paymentFailLimitExceeded")
    private boolean paymentFailLimitExceeded;

    @SerializedName("stepUp")
    @Nullable
    private StepUp stepUp;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/woolworths/scanlibrary/models/error/PaymentErrorResponse$StepUp;", "", "<init>", "(Lcom/woolworths/scanlibrary/models/error/PaymentErrorResponse;)V", "mandatory", "", "getMandatory", "()Z", "setMandatory", "(Z)V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class StepUp {

        @SerializedName("mandatory")
        private boolean mandatory;

        @SerializedName("url")
        @NotNull
        private String url = "";

        public StepUp() {
        }

        public final boolean getMandatory() {
            return this.mandatory;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final void setMandatory(boolean z) {
            this.mandatory = z;
        }

        public final void setUrl(@NotNull String str) {
            Intrinsics.h(str, "<set-?>");
            this.url = str;
        }
    }

    public final boolean getPaymentFailLimitExceeded() {
        return this.paymentFailLimitExceeded;
    }

    @Nullable
    public final StepUp getStepUp() {
        return this.stepUp;
    }

    public final boolean needStepUp() {
        StepUp stepUp = this.stepUp;
        String url = stepUp != null ? stepUp.getUrl() : null;
        if (url == null || url.length() == 0) {
            return false;
        }
        return Intrinsics.c(getErrorCode(), ERROR_REQUIRE_STEPUP_TOKEN);
    }

    public final void setPaymentFailLimitExceeded(boolean z) {
        this.paymentFailLimitExceeded = z;
    }

    public final void setStepUp(@Nullable StepUp stepUp) {
        this.stepUp = stepUp;
    }
}
