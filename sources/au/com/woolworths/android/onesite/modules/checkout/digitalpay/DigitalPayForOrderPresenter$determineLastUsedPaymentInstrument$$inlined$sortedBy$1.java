package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DigitalPayForOrderPresenter$determineLastUsedPaymentInstrument$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(((PaymentInstrument) obj).getLastUsed(), ((PaymentInstrument) obj2).getLastUsed());
    }
}
