package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.FormatException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* loaded from: classes6.dex */
public final class UPCAReader extends UPCEANReader {
    public final EAN13Reader i = new EAN13Reader();

    public static Result q(Result result) throws FormatException {
        String str = result.f16131a;
        if (str.charAt(0) != '0') {
            throw FormatException.a();
        }
        Result result2 = new Result(str.substring(1), null, result.c, BarcodeFormat.r);
        Map map = result.e;
        if (map != null) {
            result2.a(map);
        }
        return result2;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public final Result a(BinaryBitmap binaryBitmap, Map map) {
        return q(this.i.a(binaryBitmap, map));
    }

    @Override // com.google.zxing.oned.UPCEANReader, com.google.zxing.oned.OneDReader
    public final Result b(int i, BitArray bitArray, Map map) {
        return q(this.i.b(i, bitArray, map));
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final int k(BitArray bitArray, int[] iArr, StringBuilder sb) {
        return this.i.k(bitArray, iArr, sb);
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final Result l(int i, BitArray bitArray, int[] iArr, Map map) {
        return q(this.i.l(i, bitArray, iArr, map));
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final BarcodeFormat o() {
        return BarcodeFormat.r;
    }
}
