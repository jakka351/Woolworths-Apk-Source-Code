package au.com.woolworths.foundation.barcode.reader;

import android.media.Image;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.SettableImageProxy;
import au.com.woolworths.foundation.barcode.reader.BarcodeReader;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.internal.zzh;
import com.google.mlkit.vision.common.InputImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/BarcodeImageAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeImageAnalyzer implements ImageAnalysis.Analyzer {
    public final au.com.woolworths.feature.shop.delivery.address.a d;
    public final zzh e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BarcodeReader.ScanType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BarcodeReader.ScanType[] scanTypeArr = BarcodeReader.ScanType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public BarcodeImageAnalyzer(BarcodeReader.ScanType scanType, au.com.woolworths.feature.shop.delivery.address.a aVar) {
        Intrinsics.h(scanType, "scanType");
        this.d = aVar;
        BarcodeScannerOptions.Builder builder = new BarcodeScannerOptions.Builder();
        int iOrdinal = scanType.ordinal();
        if (iOrdinal == 1) {
            builder.a(1, new int[0]);
        } else if (iOrdinal != 2) {
            builder.a(256, new int[0]);
        } else {
            builder.a(256, 1);
        }
        this.e = BarcodeScanning.a(new BarcodeScannerOptions(builder.f15989a));
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void b(SettableImageProxy settableImageProxy) {
        Image image = settableImageProxy.e.getImage();
        if (image != null) {
            this.e.a(InputImage.a(image, settableImageProxy.h.c())).addOnSuccessListener(new au.com.woolworths.feature.shop.delivery.address.a(new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(19, this, settableImageProxy), 19)).addOnFailureListener(new a(settableImageProxy, 0));
        }
    }
}
