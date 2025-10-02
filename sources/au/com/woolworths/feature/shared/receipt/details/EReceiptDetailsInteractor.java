package au.com.woolworths.feature.shared.receipt.details;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.receipt.details.ShopReceiptDetailsRepository;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsInteractor;", "", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EReceiptDetailsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShopReceiptDetailsRepository f6553a;
    public final FileDownloader b;
    public final Application c;

    public EReceiptDetailsInteractor(ShopReceiptDetailsRepository shopReceiptDetailsRepository, FileDownloader fileDownloader, Application application) {
        this.f6553a = shopReceiptDetailsRepository;
        this.b = fileDownloader;
        this.c = application;
    }
}
