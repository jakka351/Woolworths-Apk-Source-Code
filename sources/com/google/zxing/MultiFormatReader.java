package com.google.zxing;

import com.google.zxing.aztec.AztecReader;
import com.google.zxing.datamatrix.DataMatrixReader;
import com.google.zxing.maxicode.MaxiCodeReader;
import com.google.zxing.oned.MultiFormatOneDReader;
import com.google.zxing.pdf417.PDF417Reader;
import com.google.zxing.qrcode.QRCodeReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes6.dex */
public final class MultiFormatReader implements Reader {
    public static final Reader[] c = new Reader[0];

    /* renamed from: a, reason: collision with root package name */
    public Map f16129a;
    public Reader[] b;

    @Override // com.google.zxing.Reader
    public final Result a(BinaryBitmap binaryBitmap, Map map) {
        c(map);
        return b(binaryBitmap);
    }

    public final Result b(BinaryBitmap binaryBitmap) throws NotFoundException {
        Reader[] readerArr = this.b;
        if (readerArr != null) {
            for (Reader reader : readerArr) {
                try {
                    return reader.a(binaryBitmap, this.f16129a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.f;
    }

    public final void c(Map map) {
        this.f16129a = map;
        boolean z = map != null && map.containsKey(DecodeHintType.f);
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.e);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z2 = collection.contains(BarcodeFormat.r) || collection.contains(BarcodeFormat.s) || collection.contains(BarcodeFormat.k) || collection.contains(BarcodeFormat.j) || collection.contains(BarcodeFormat.e) || collection.contains(BarcodeFormat.f) || collection.contains(BarcodeFormat.g) || collection.contains(BarcodeFormat.h) || collection.contains(BarcodeFormat.l) || collection.contains(BarcodeFormat.p) || collection.contains(BarcodeFormat.q);
            if (z2 && !z) {
                arrayList.add(new MultiFormatOneDReader(map));
            }
            if (collection.contains(BarcodeFormat.o)) {
                arrayList.add(new QRCodeReader());
            }
            if (collection.contains(BarcodeFormat.i)) {
                arrayList.add(new DataMatrixReader());
            }
            if (collection.contains(BarcodeFormat.d)) {
                arrayList.add(new AztecReader());
            }
            if (collection.contains(BarcodeFormat.n)) {
                arrayList.add(new PDF417Reader());
            }
            if (collection.contains(BarcodeFormat.m)) {
                arrayList.add(new MaxiCodeReader());
            }
            if (z2 && z) {
                arrayList.add(new MultiFormatOneDReader(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new MultiFormatOneDReader(map));
            }
            arrayList.add(new QRCodeReader());
            arrayList.add(new DataMatrixReader());
            arrayList.add(new AztecReader());
            arrayList.add(new PDF417Reader());
            arrayList.add(new MaxiCodeReader());
            if (z) {
                arrayList.add(new MultiFormatOneDReader(map));
            }
        }
        this.b = (Reader[]) arrayList.toArray(c);
    }

    @Override // com.google.zxing.Reader
    public final void reset() {
        Reader[] readerArr = this.b;
        if (readerArr != null) {
            for (Reader reader : readerArr) {
                reader.reset();
            }
        }
    }
}
