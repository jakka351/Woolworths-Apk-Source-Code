package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ByQuadrantReader implements Reader {
    @Override // com.google.zxing.Reader
    public final Result a(BinaryBitmap binaryBitmap, Map map) {
        LuminanceSource luminanceSource = binaryBitmap.f16127a.f16126a;
        int i = luminanceSource.f16128a / 2;
        int i2 = luminanceSource.b / 2;
        try {
            try {
                try {
                    try {
                        binaryBitmap.a(0, 0, i, i2);
                        throw null;
                    } catch (NotFoundException unused) {
                        binaryBitmap.a(i, i2, i, i2);
                        throw null;
                    }
                } catch (NotFoundException unused2) {
                    binaryBitmap.a(0, i2, i, i2);
                    throw null;
                }
            } catch (NotFoundException unused3) {
                binaryBitmap.a(i, 0, i, i2);
                throw null;
            }
        } catch (NotFoundException unused4) {
            binaryBitmap.a(i / 2, i2 / 2, i, i2);
            throw null;
        }
    }

    @Override // com.google.zxing.Reader
    public final void reset() {
        throw null;
    }
}
