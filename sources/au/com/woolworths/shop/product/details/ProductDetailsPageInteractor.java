package au.com.woolworths.shop.product.details;

import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsPageInteractor;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductDetailsPageInteractor {
    void a();

    StateFlow b();

    Object c(String str, List list, BarcodeData barcodeData, String str2, String str3, ContinuationImpl continuationImpl);

    Object d(List list, BarcodeData barcodeData, ContinuationImpl continuationImpl);

    Object e(String str, List list, ContinuationImpl continuationImpl);
}
