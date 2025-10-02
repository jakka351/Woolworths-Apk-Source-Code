package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzaqj extends ByteArrayOutputStream {
    private final zzapy zza;

    public zzaqj(zzapy zzapyVar, int i) {
        this.zza = zzapyVar;
        ((ByteArrayOutputStream) this).buf = zzapyVar.zza(Math.max(i, 256));
    }

    private final void zza(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        zzapy zzapyVar = this.zza;
        int i3 = i2 + i;
        byte[] bArrZza = zzapyVar.zza(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrZza, 0, ((ByteArrayOutputStream) this).count);
        zzapyVar.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrZza;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zza(i2);
        super.write(bArr, i, i2);
    }
}
