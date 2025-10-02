package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/Error;", "", "Lau/com/woolworths/base/wallet/digipay/framesview/FatalError;", "Lau/com/woolworths/base/wallet/digipay/framesview/FormError;", "Lau/com/woolworths/base/wallet/digipay/framesview/NetworkError;", "Lau/com/woolworths/base/wallet/digipay/framesview/NetworkTimeoutError;", "Lau/com/woolworths/base/wallet/digipay/framesview/ValidationError;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Error {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorCode f4666a;
    public final String b;

    public Error(ErrorCode errorCode, String str) {
        this.f4666a = errorCode;
        this.b = str;
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            str = "";
        }
        return "[" + this.f4666a + "]: " + str;
    }
}
