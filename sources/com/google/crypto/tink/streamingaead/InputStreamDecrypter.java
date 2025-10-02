package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.CryptoFormat;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class InputStreamDecrypter extends InputStream {
    public boolean d;
    public InputStream e;
    public InputStream f;
    public PrimitiveSet g;
    public byte[] h;

    @Override // java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream = this.e;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.e;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        if (!this.d) {
            this.d = true;
            Iterator it = this.g.a(CryptoFormat.f14969a).iterator();
            while (it.hasNext()) {
                try {
                    try {
                        InputStream inputStreamC = ((StreamingAead) ((PrimitiveSet.Entry) it.next()).f14982a).c(this.f, this.h);
                        int i3 = inputStreamC.read(bArr, i, i2);
                        if (i3 == 0) {
                            this.f.reset();
                            this.d = false;
                        } else {
                            this.e = inputStreamC;
                            this.f.mark(0);
                        }
                        return i3;
                    } catch (GeneralSecurityException unused) {
                        this.f.reset();
                    }
                } catch (IOException unused2) {
                    this.f.reset();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }
}
