package au.com.woolworths.base.wallet.digipay.framesview;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/EnrollmentResponseStatus;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnrollmentResponseStatus {
    public static final EnrollmentResponseStatus d;
    public static final /* synthetic */ EnrollmentResponseStatus[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        EnrollmentResponseStatus enrollmentResponseStatus = new EnrollmentResponseStatus("AUTHENTICATION_FAILED", 0);
        d = enrollmentResponseStatus;
        EnrollmentResponseStatus[] enrollmentResponseStatusArr = {enrollmentResponseStatus};
        e = enrollmentResponseStatusArr;
        f = EnumEntriesKt.a(enrollmentResponseStatusArr);
    }

    public static EnrollmentResponseStatus valueOf(String str) {
        return (EnrollmentResponseStatus) Enum.valueOf(EnrollmentResponseStatus.class, str);
    }

    public static EnrollmentResponseStatus[] values() {
        return (EnrollmentResponseStatus[]) e.clone();
    }
}
