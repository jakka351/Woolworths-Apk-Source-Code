package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ErrorType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorType {
    public static final Companion e;
    public static final ErrorType f;
    public static final /* synthetic */ ErrorType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ErrorType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ErrorType errorType = new ErrorType("fetchValidPaymentInstrumentsFailure", 0, "fetchValidPaymentInstrumentsFailure");
        ErrorType errorType2 = new ErrorType("noCardsAvailable", 1, "noCardsAvailable");
        ErrorType errorType3 = new ErrorType("expiredCard", 2, "expiredCard");
        ErrorType errorType4 = new ErrorType("invalidQRID", 3, "invalidQRID");
        ErrorType errorType5 = new ErrorType("updatePaymentSessionFailure", 4, "updatePaymentSessionFailure");
        ErrorType errorType6 = new ErrorType("preApprovePaymentFailure", 5, "preApprovePaymentFailure");
        ErrorType errorType7 = new ErrorType("fetchPaymentRequestFailure", 6, "fetchPaymentRequestFailure");
        ErrorType errorType8 = new ErrorType("paymentRejected", 7, "paymentRejected");
        ErrorType errorType9 = new ErrorType("paymentCancelled", 8, "paymentCancelled");
        ErrorType errorType10 = new ErrorType("transactionFailure", 9, "transactionFailure");
        ErrorType errorType11 = new ErrorType("reviewFailure", 10, "reviewFailure");
        ErrorType errorType12 = new ErrorType("UNKNOWN__", 11, "UNKNOWN__");
        f = errorType12;
        ErrorType[] errorTypeArr = {errorType, errorType2, errorType3, errorType4, errorType5, errorType6, errorType7, errorType8, errorType9, errorType10, errorType11, errorType12};
        g = errorTypeArr;
        h = EnumEntriesKt.a(errorTypeArr);
        e = new Companion();
        CollectionsKt.R("fetchValidPaymentInstrumentsFailure", "noCardsAvailable", "expiredCard", "invalidQRID", "updatePaymentSessionFailure", "preApprovePaymentFailure", "fetchPaymentRequestFailure", "paymentRejected", "paymentCancelled", "transactionFailure", "reviewFailure");
    }

    public ErrorType(String str, int i, String str2) {
        this.d = str2;
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) g.clone();
    }
}
