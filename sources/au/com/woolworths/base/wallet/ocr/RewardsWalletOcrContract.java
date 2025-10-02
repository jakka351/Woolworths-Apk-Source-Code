package au.com.woolworths.base.wallet.ocr;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.wallet.digipay.framesview.CardDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrContract;", "", "Actions", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsWalletOcrContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrContract$Actions;", "", "ReturnScannedValuesToCallee", "Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrContract$Actions$ReturnScannedValuesToCallee;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrContract$Actions$ReturnScannedValuesToCallee;", "Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrContract$Actions;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ReturnScannedValuesToCallee extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final CardDetails f4696a;

            public ReturnScannedValuesToCallee(CardDetails cardDetails) {
                this.f4696a = cardDetails;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReturnScannedValuesToCallee) && Intrinsics.c(this.f4696a, ((ReturnScannedValuesToCallee) obj).f4696a);
            }

            public final int hashCode() {
                return this.f4696a.hashCode();
            }

            public final String toString() {
                return "ReturnScannedValuesToCallee(cardDetails=" + this.f4696a + ")";
            }
        }
    }
}
