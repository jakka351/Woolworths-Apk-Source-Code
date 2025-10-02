package au.com.woolworths.feature.shop.barcode.scanner.analyzer;

import android.media.Image;
import androidx.camera.core.SettableImageProxy;
import androidx.lifecycle.f;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.e;
import au.com.woolworths.feature.rewards.offers.home.ui.a;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.common.InputImage;
import io.reactivex.subjects.PublishSubject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/analyzer/BarcodeAnalyzer;", "Lau/com/woolworths/feature/shop/barcode/scanner/analyzer/ImageAnalyzer;", "Lau/com/woolworths/foundation/barcode/reader/models/BarcodeData;", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public class BarcodeAnalyzer implements ImageAnalyzer<BarcodeData> {
    public final PublishSubject d = new PublishSubject();
    public final Lazy e = LazyKt.b(new a(29));

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void b(SettableImageProxy settableImageProxy) {
        Image image = settableImageProxy.e.getImage();
        Intrinsics.e(image);
        BarcodeScanning.a((BarcodeScannerOptions) this.e.getD()).a(InputImage.a(image, settableImageProxy.h.c())).addOnSuccessListener(new e(new f(26, settableImageProxy, this), 29));
    }
}
