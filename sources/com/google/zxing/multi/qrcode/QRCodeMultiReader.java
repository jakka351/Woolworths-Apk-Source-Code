package com.google.zxing.multi.qrcode;

import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.qrcode.QRCodeReader;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class QRCodeMultiReader extends QRCodeReader implements MultipleBarcodeReader {

    public static final class SAComparator implements Serializable, Comparator<Result> {
        @Override // java.util.Comparator
        public final int compare(Result result, Result result2) {
            Map map = result.e;
            ResultMetadataType resultMetadataType = ResultMetadataType.l;
            return Integer.compare(((Integer) map.get(resultMetadataType)).intValue(), ((Integer) result2.e.get(resultMetadataType)).intValue());
        }
    }
}
