package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.dynatrace.android.callback.Callback;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class zzcdv extends zzfs implements zzgt {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgs zze;
    private zzge zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzcdv(String str, zzgy zzgyVar, int i, int i2, long j, long j2) {
        super(true);
        zzcu.zza(str);
        this.zzd = str;
        this.zze = new zzgs();
        this.zzb = i;
        this.zzc = i2;
        this.zzh = new ArrayDeque();
        this.zzq = j;
        this.zzr = j2;
        if (zzgyVar != null) {
            zze(zzgyVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            long j2 = this.zzm;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.zzn + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.zzr;
            long j6 = this.zzp;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.zzo;
                if (j6 < j8) {
                    long jMin = Math.min(j8, Math.max(((this.zzq + j7) - r4) - 1, (j7 + j4) - 1));
                    zzk(j7, jMin, 2);
                    this.zzp = jMin;
                    j6 = jMin;
                }
            }
            int i3 = this.zzi.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.zzn) - this.zzm));
            if (i3 == -1) {
                throw new EOFException();
            }
            this.zzm += i3;
            zzh(i3);
            return i3;
        } catch (IOException e) {
            throw new zzgp(e, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws IOException, NumberFormatException {
        this.zzf = zzgeVar;
        this.zzm = 0L;
        long j = zzgeVar.zze;
        long j2 = zzgeVar.zzf;
        long jMin = j2 == -1 ? this.zzq : Math.min(this.zzq, j2);
        this.zzn = j;
        HttpURLConnection httpURLConnectionZzk = zzk(j, (jMin + j) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    long j5 = zzgeVar.zzf;
                    if (j5 != -1) {
                        this.zzl = j5;
                        this.zzo = Math.max(j3, (this.zzn + j5) - 1);
                    } else {
                        this.zzl = j4 - this.zzn;
                        this.zzo = j4 - 1;
                    }
                    this.zzp = j3;
                    this.zzj = true;
                    zzg(zzgeVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    String strP = YU.a.p(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, "]");
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strP);
                }
            }
        }
        throw new zzcdt(headerField, zzgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgp(e, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    @Nullable
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    public final HttpURLConnection zzk(long j, long j2, int i) throws IOException {
        int i2;
        IOException iOException;
        String string = this.zzf.zza.toString();
        try {
            URLConnection uRLConnectionOpenConnection = new URL(string).openConnection();
            Callback.v(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e) {
                    iOException = e;
                    i2 = i;
                    String strValueOf = String.valueOf(string);
                    throw new zzgp("Unable to connect to ".concat(strValueOf), iOException, this.zzf, 2000, i2);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 7 + String.valueOf(j2).length());
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            sb.append(j2);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int iF = Callback.f(httpURLConnection);
                this.zzk = iF;
                if (iF < 200 || iF > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzcdu(this.zzk, headerFields, this.zzf, i);
                }
                try {
                    InputStream inputStreamA = Callback.a(httpURLConnection);
                    if (this.zzi != null) {
                        inputStreamA = new SequenceInputStream(this.zzi, inputStreamA);
                    }
                    this.zzi = inputStreamA;
                    return httpURLConnection;
                } catch (IOException e2) {
                    zzl();
                    throw new zzgp(e2, this.zzf, 2000, i);
                }
            } catch (IOException e3) {
                zzl();
                String strValueOf2 = String.valueOf(string2);
                throw new zzgp("Unable to connect to ".concat(strValueOf2), e3, this.zzf, 2000, i);
            }
        } catch (IOException e4) {
            i2 = i;
            iOException = e4;
        }
    }
}
