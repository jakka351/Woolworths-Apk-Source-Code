package au.com.woolworths.foundation.barcode.reader.mlkit;

import android.media.Image;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.SettableImageProxy;
import au.com.woolworths.feature.shop.delivery.address.a;
import com.google.mlkit.vision.barcode.internal.zzh;
import com.google.mlkit.vision.common.InputImage;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/mlkit/MlKitBarcodeImageAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "Companion", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MlKitBarcodeImageAnalyzer implements ImageAnalysis.Analyzer {
    public final a d;
    public final List e;
    public final boolean f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final RssBarcodeDetector h = new RssBarcodeDetector();
    public final zzh i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/mlkit/MlKitBarcodeImageAnalyzer$Companion;", "", "", "FNC", "C", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[PHI: r3
  0x0074: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:11:0x004c, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MlKitBarcodeImageAnalyzer(au.com.woolworths.feature.shop.delivery.address.a r6, java.util.List r7, boolean r8) {
        /*
            r5 = this;
            r5.<init>()
            r5.d = r6
            r5.e = r7
            r5.f = r8
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r8 = 0
            r6.<init>(r8)
            r5.g = r6
            au.com.woolworths.foundation.barcode.reader.mlkit.RssBarcodeDetector r6 = new au.com.woolworths.foundation.barcode.reader.mlkit.RssBarcodeDetector
            r6.<init>()
            r5.h = r6
            com.google.mlkit.vision.barcode.BarcodeScannerOptions$Builder r6 = new com.google.mlkit.vision.barcode.BarcodeScannerOptions$Builder
            r6.<init>()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.s(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L2e:
            boolean r1 = r7.hasNext()
            r2 = 1
            if (r1 == 0) goto L86
            java.lang.Object r1 = r7.next()
            au.com.woolworths.foundation.barcode.reader.models.BarcodeSymbology r1 = (au.com.woolworths.foundation.barcode.reader.models.BarcodeSymbology) r1
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r1, r3)
            int r1 = r1.ordinal()
            if (r1 == 0) goto L7c
            if (r1 == r2) goto L79
            r3 = 2
            if (r1 == r3) goto L76
            r4 = 3
            if (r1 == r4) goto L74
            r3 = 4
            if (r1 == r3) goto L74
            r3 = 5
            if (r1 == r3) goto L7e
            r2 = 8
            if (r1 == r2) goto L7e
            r2 = 9
            if (r1 == r2) goto L71
            r2 = 21
            if (r1 == r2) goto L6e
            switch(r1) {
                case 11: goto L6b;
                case 12: goto L68;
                case 13: goto L65;
                default: goto L63;
            }
        L63:
            r2 = -1
            goto L7e
        L65:
            r2 = 4096(0x1000, float:5.74E-42)
            goto L7e
        L68:
            r2 = 16
            goto L7e
        L6b:
            r2 = 256(0x100, float:3.59E-43)
            goto L7e
        L6e:
            r2 = 2048(0x800, float:2.87E-42)
            goto L7e
        L71:
            r2 = 128(0x80, float:1.794E-43)
            goto L7e
        L74:
            r2 = r3
            goto L7e
        L76:
            r2 = 64
            goto L7e
        L79:
            r2 = 1024(0x400, float:1.435E-42)
            goto L7e
        L7c:
            r2 = 32
        L7e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
            goto L2e
        L86:
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto Lcd
            int r7 = r0.size()
            if (r7 != r2) goto La2
            java.lang.Object r7 = r0.get(r8)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int[] r8 = new int[r8]
            r6.a(r7, r8)
            goto Lbf
        La2:
            java.lang.Object r7 = r0.get(r8)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.util.ArrayList r0 = kotlin.collections.CollectionsKt.J0(r0)
            r0.remove(r8)
            int[] r8 = kotlin.collections.CollectionsKt.F0(r0)
            int r0 = r8.length
            int[] r8 = java.util.Arrays.copyOf(r8, r0)
            r6.a(r7, r8)
        Lbf:
            com.google.mlkit.vision.barcode.BarcodeScannerOptions r7 = new com.google.mlkit.vision.barcode.BarcodeScannerOptions
            int r6 = r6.f15989a
            r7.<init>(r6)
            com.google.mlkit.vision.barcode.internal.zzh r6 = com.google.mlkit.vision.barcode.BarcodeScanning.a(r7)
            r5.i = r6
            return
        Lcd:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "MlKitBarcodeImageAnalyzer: No supported formats"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.barcode.reader.mlkit.MlKitBarcodeImageAnalyzer.<init>(au.com.woolworths.feature.shop.delivery.address.a, java.util.List, boolean):void");
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void b(SettableImageProxy settableImageProxy) throws Exception {
        if (!this.g.get()) {
            settableImageProxy.close();
            return;
        }
        Image image = settableImageProxy.e.getImage();
        if (image != null) {
            this.i.a(InputImage.a(image, settableImageProxy.h.c())).addOnSuccessListener(new a(new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(20, this, settableImageProxy), 20)).addOnFailureListener(new au.com.woolworths.foundation.barcode.reader.a(settableImageProxy, 1));
        }
    }
}
