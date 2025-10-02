package au.com.woolworths.feature.shop.myorders.details.invoices;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/invoices/OrderInvoiceFailureException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderInvoiceFailureException extends RuntimeException {
    public final Text d;

    public OrderInvoiceFailureException(Text text) {
        super("Error when downloading invoice", null);
        this.d = text;
    }
}
