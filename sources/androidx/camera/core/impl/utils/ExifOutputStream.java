package androidx.camera.core.impl.utils;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ExifOutputStream extends FilterOutputStream {
    public static final byte[] j = "Exif\u0000\u0000".getBytes(ExifAttribute.d);
    public final ExifData d;
    public final byte[] e;
    public final ByteBuffer f;
    public int g;
    public int h;
    public int i;

    public static final class JpegHeader {
    }

    public ExifOutputStream(ByteArrayOutputStream byteArrayOutputStream, ExifData exifData) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.e = new byte[1];
        this.f = ByteBuffer.allocate(4);
        this.g = 0;
        this.d = exifData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0367, code lost:
    
        if (r3 <= 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0369, code lost:
    
        ((java.io.FilterOutputStream) r18).out.write(r19, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x036e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(byte[] r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifOutputStream.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.e;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
