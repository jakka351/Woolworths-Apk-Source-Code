package au.com.woolworths.shop.digipay;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-digipay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DigipayExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10908a;

        static {
            int[] iArr = new int[PayErrorCode.values().length];
            try {
                iArr[PayErrorCode.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PayErrorCode.TIMEOUT_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PayErrorCode.RETRIES_EXHAUSTED_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10908a = iArr;
        }
    }

    public static final Throwable a(PayError payError) {
        Intrinsics.h(payError, "<this>");
        PayErrorCode payErrorCode = payError.getPayErrorCode();
        Intrinsics.g(payErrorCode, "getPayErrorCode(...)");
        int i = WhenMappings.f10908a[payErrorCode.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new NoConnectivityException(payError.getErrorMessage());
        }
        return new Throwable(payError.getPayErrorCode() + " " + payError.getErrorMessage());
    }
}
