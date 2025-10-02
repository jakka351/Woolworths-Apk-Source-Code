package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes6.dex */
public final class MultiFormatUPCEANReader extends OneDReader {
    public static final UPCEANReader[] b = new UPCEANReader[0];

    /* renamed from: a, reason: collision with root package name */
    public final UPCEANReader[] f16178a;

    public MultiFormatUPCEANReader(Map map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.e);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.k)) {
                arrayList.add(new EAN13Reader());
            } else if (collection.contains(BarcodeFormat.r)) {
                arrayList.add(new UPCAReader());
            }
            if (collection.contains(BarcodeFormat.j)) {
                arrayList.add(new EAN8Reader());
            }
            if (collection.contains(BarcodeFormat.s)) {
                arrayList.add(new UPCEReader());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new EAN13Reader());
            arrayList.add(new EAN8Reader());
            arrayList.add(new UPCEReader());
        }
        this.f16178a = (UPCEANReader[]) arrayList.toArray(b);
    }

    @Override // com.google.zxing.oned.OneDReader
    public final Result b(int i, BitArray bitArray, Map map) throws NotFoundException, NumberFormatException {
        int[] iArrN = UPCEANReader.n(bitArray);
        for (UPCEANReader uPCEANReader : this.f16178a) {
            try {
                Result resultL = uPCEANReader.l(i, bitArray, iArrN, map);
                boolean z = resultL.d == BarcodeFormat.k && resultL.f16131a.charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.e);
                BarcodeFormat barcodeFormat = BarcodeFormat.r;
                boolean z2 = collection == null || collection.contains(barcodeFormat);
                if (!z || !z2) {
                    return resultL;
                }
                Result result = new Result(resultL.f16131a.substring(1), resultL.b, resultL.c, barcodeFormat);
                result.a(resultL.e);
                return result;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.f;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public final void reset() {
        for (UPCEANReader uPCEANReader : this.f16178a) {
            uPCEANReader.getClass();
        }
    }
}
