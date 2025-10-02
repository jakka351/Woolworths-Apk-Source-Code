package com.google.zxing.qrcode.encoder;

import androidx.constraintlayout.core.state.a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

/* loaded from: classes6.dex */
public final class QRCode {

    /* renamed from: a, reason: collision with root package name */
    public Mode f16239a;
    public ErrorCorrectionLevel b;
    public Version c;
    public int d;
    public ByteMatrix e;

    public final String toString() {
        StringBuilder sbO = a.o(200, "<<\n mode: ");
        sbO.append(this.f16239a);
        sbO.append("\n ecLevel: ");
        sbO.append(this.b);
        sbO.append("\n version: ");
        sbO.append(this.c);
        sbO.append("\n maskPattern: ");
        sbO.append(this.d);
        if (this.e == null) {
            sbO.append("\n matrix: null\n");
        } else {
            sbO.append("\n matrix:\n");
            sbO.append(this.e);
        }
        sbO.append(">>\n");
        return sbO.toString();
    }
}
