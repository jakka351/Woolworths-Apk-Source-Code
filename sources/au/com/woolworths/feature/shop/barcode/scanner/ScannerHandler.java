package au.com.woolworths.feature.shop.barcode.scanner;

import au.com.woolworths.feature.shop.barcode.scanner.analyzer.BarcodeAnalyzer;
import com.google.android.gms.ads.RequestConfiguration;
import io.reactivex.Observable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/ScannerHandler;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ScannerHandler<T> {
    void I1(Observable observable);

    void Y();

    BarcodeAnalyzer h3();
}
