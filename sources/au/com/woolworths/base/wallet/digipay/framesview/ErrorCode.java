package au.com.woolworths.base.wallet.digipay.framesview;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ErrorCode;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorCode {
    public static final ErrorCode d;
    public static final ErrorCode e;
    public static final ErrorCode f;
    public static final ErrorCode g;
    public static final ErrorCode h;
    public static final /* synthetic */ ErrorCode[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        ErrorCode errorCode = new ErrorCode("FATAL_ERROR", 0);
        d = errorCode;
        ErrorCode errorCode2 = new ErrorCode("NETWORK_ERROR", 1);
        e = errorCode2;
        ErrorCode errorCode3 = new ErrorCode("TIMEOUT_ERROR", 2);
        f = errorCode3;
        ErrorCode errorCode4 = new ErrorCode("FORM_ERROR", 3);
        g = errorCode4;
        ErrorCode errorCode5 = new ErrorCode("VALIDATION_ERROR", 4);
        h = errorCode5;
        ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3, errorCode4, errorCode5};
        i = errorCodeArr;
        j = EnumEntriesKt.a(errorCodeArr);
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) i.clone();
    }
}
