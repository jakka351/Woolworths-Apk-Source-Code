package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/CurrencyFormatter;", "", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencyFormatter {

    /* renamed from: a, reason: collision with root package name */
    public final DecimalFormat f8358a = new DecimalFormat("0.00");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/CurrencyFormatter$Companion;", "", "", "CENTS_IN_DOLLAR", "D", "", "INTEGER_WITH_TWO_DECIMAL_PLACES_REGEX", "Ljava/lang/String;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public static int a(String str) {
        Double dH0 = StringsKt.h0(StringsKt.Q(str, "$", "", false));
        if (dH0 != null) {
            return (int) (dH0.doubleValue() * 100.0d);
        }
        return 0;
    }
}
