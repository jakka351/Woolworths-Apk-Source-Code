package com.google.zxing;

import com.google.zxing.aztec.AztecWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.DataMatrixWriter;
import com.google.zxing.oned.CodaBarWriter;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.oned.Code39Writer;
import com.google.zxing.oned.Code93Writer;
import com.google.zxing.oned.EAN13Writer;
import com.google.zxing.oned.EAN8Writer;
import com.google.zxing.oned.ITFWriter;
import com.google.zxing.oned.UPCAWriter;
import com.google.zxing.oned.UPCEWriter;
import com.google.zxing.pdf417.PDF417Writer;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.Map;

/* loaded from: classes6.dex */
public final class MultiFormatWriter implements Writer {

    /* renamed from: com.google.zxing.MultiFormatWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16130a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f16130a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16130a[15] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16130a[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16130a[14] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16130a[11] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16130a[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16130a[3] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16130a[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16130a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16130a[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16130a[1] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16130a[5] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16130a[0] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        Writer aztecWriter;
        switch (barcodeFormat.ordinal()) {
            case 0:
                aztecWriter = new AztecWriter();
                break;
            case 1:
                aztecWriter = new CodaBarWriter();
                break;
            case 2:
                aztecWriter = new Code39Writer();
                break;
            case 3:
                aztecWriter = new Code93Writer();
                break;
            case 4:
                aztecWriter = new Code128Writer();
                break;
            case 5:
                aztecWriter = new DataMatrixWriter();
                break;
            case 6:
                aztecWriter = new EAN8Writer();
                break;
            case 7:
                aztecWriter = new EAN13Writer();
                break;
            case 8:
                aztecWriter = new ITFWriter();
                break;
            case 9:
            case 12:
            case 13:
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
            case 10:
                aztecWriter = new PDF417Writer();
                break;
            case 11:
                aztecWriter = new QRCodeWriter();
                break;
            case 14:
                aztecWriter = new UPCAWriter();
                break;
            case 15:
                aztecWriter = new UPCEWriter();
                break;
        }
        return aztecWriter.a(str, barcodeFormat, i, i2, map);
    }
}
