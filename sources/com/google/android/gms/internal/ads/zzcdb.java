package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class zzcdb extends zzfs implements zzgt {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgs zzg;
    private zzge zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcdb(String str, zzgy zzgyVar, int i, int i2, int i3) {
        super(true);
        this.zzc = new zzcda(this);
        this.zzr = new HashSet();
        zzcu.zza(str);
        this.zzf = str;
        this.zzg = new zzgs();
        this.zzd = i;
        this.zze = i2;
        this.zzq = i3;
        if (zzgyVar != null) {
            zze(zzgyVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i3 = this.zzj.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += i3;
                    zzh(i3);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int i4 = this.zzj.read(bArr, i, i2);
            if (i4 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += i4;
            zzh(i4);
            return i4;
        } catch (IOException e) {
            throw new zzgp(e, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2 A[Catch: IOException -> 0x0047, TryCatch #2 {IOException -> 0x0047, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003e, B:11:0x004a, B:12:0x0062, B:14:0x0068, B:21:0x0095, B:23:0x00b5, B:24:0x00d4, B:25:0x00d9, B:27:0x00e2, B:28:0x00e9, B:41:0x0112, B:94:0x0273, B:96:0x0280, B:98:0x0291, B:101:0x029a, B:102:0x02a7, B:104:0x02b1, B:105:0x02b8, B:106:0x02b9, B:107:0x02d6), top: B:114:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0280 A[Catch: IOException -> 0x0047, TryCatch #2 {IOException -> 0x0047, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003e, B:11:0x004a, B:12:0x0062, B:14:0x0068, B:21:0x0095, B:23:0x00b5, B:24:0x00d4, B:25:0x00d9, B:27:0x00e2, B:28:0x00e9, B:41:0x0112, B:94:0x0273, B:96:0x0280, B:98:0x0291, B:101:0x029a, B:102:0x02a7, B:104:0x02b1, B:105:0x02b8, B:106:0x02b9, B:107:0x02d6), top: B:114:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzge r25) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdb.zzb(com.google.android.gms.internal.ads.zzge):long");
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                String str = zzeo.zza;
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgp(e, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    @Nullable
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzk(int i) throws SocketException {
        this.zzq = i;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    public final /* synthetic */ int zzm() {
        return this.zzq;
    }
}
