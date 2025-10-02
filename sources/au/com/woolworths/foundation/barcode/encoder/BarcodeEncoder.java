package au.com.woolworths.foundation.barcode.encoder;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/encoder/BarcodeEncoder;", "", "barcode-encoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeEncoder {
    public static Bitmap a(String contents, BarcodeFormat format, int i, int i2, Map map) {
        Intrinsics.h(contents, "contents");
        Intrinsics.h(format, "format");
        try {
            BitMatrix bitMatrixA = new MultiFormatWriter().a(contents, format, i, i2, map);
            Intrinsics.e(bitMatrixA);
            int i3 = bitMatrixA.d;
            int i4 = bitMatrixA.e;
            int[] iArr = new int[i3 * i4];
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 * i3;
                for (int i7 = 0; i7 < i3; i7++) {
                    iArr[i6 + i7] = bitMatrixA.b(i7, i5) ? -16777216 : -1;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            Intrinsics.g(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.setPixels(iArr, 0, i3, 0, 0, i3, i4);
            return bitmapCreateBitmap;
        } catch (WriterException e) {
            throw e;
        } catch (Exception e2) {
            throw new WriterException(e2);
        }
    }
}
