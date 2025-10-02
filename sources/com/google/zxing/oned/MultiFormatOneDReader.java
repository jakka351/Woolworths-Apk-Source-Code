package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.RSS14Reader;
import com.google.zxing.oned.rss.expanded.RSSExpandedReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes6.dex */
public final class MultiFormatOneDReader extends OneDReader {
    public static final OneDReader[] b = new OneDReader[0];

    /* renamed from: a, reason: collision with root package name */
    public final OneDReader[] f16177a;

    public MultiFormatOneDReader(Map map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.e);
        boolean z = (map == null || map.get(DecodeHintType.i) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.k) || collection.contains(BarcodeFormat.r) || collection.contains(BarcodeFormat.j) || collection.contains(BarcodeFormat.s)) {
                arrayList.add(new MultiFormatUPCEANReader(map));
            }
            if (collection.contains(BarcodeFormat.f)) {
                arrayList.add(new Code39Reader(z));
            }
            if (collection.contains(BarcodeFormat.g)) {
                arrayList.add(new Code93Reader());
            }
            if (collection.contains(BarcodeFormat.h)) {
                arrayList.add(new Code128Reader());
            }
            if (collection.contains(BarcodeFormat.l)) {
                arrayList.add(new ITFReader());
            }
            if (collection.contains(BarcodeFormat.e)) {
                arrayList.add(new CodaBarReader());
            }
            if (collection.contains(BarcodeFormat.p)) {
                arrayList.add(new RSS14Reader());
            }
            if (collection.contains(BarcodeFormat.q)) {
                arrayList.add(new RSSExpandedReader());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new MultiFormatUPCEANReader(map));
            arrayList.add(new Code39Reader(false));
            arrayList.add(new CodaBarReader());
            arrayList.add(new Code93Reader());
            arrayList.add(new Code128Reader());
            arrayList.add(new ITFReader());
            arrayList.add(new RSS14Reader());
            arrayList.add(new RSSExpandedReader());
        }
        this.f16177a = (OneDReader[]) arrayList.toArray(b);
    }

    @Override // com.google.zxing.oned.OneDReader
    public final Result b(int i, BitArray bitArray, Map map) throws NotFoundException {
        for (OneDReader oneDReader : this.f16177a) {
            try {
                return oneDReader.b(i, bitArray, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.f;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public final void reset() {
        for (OneDReader oneDReader : this.f16177a) {
            oneDReader.reset();
        }
    }
}
