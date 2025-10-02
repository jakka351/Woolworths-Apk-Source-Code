package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class zzaqd implements zzaor {
    private final zzaqc zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqd(zzaqc zzaqcVar, int i) {
        this.zzc = zzaqcVar;
    }

    @VisibleForTesting
    public static byte[] zzg(zzaqb zzaqbVar, long j) throws IOException {
        long jZza = zzaqbVar.zza();
        if (j >= 0 && j <= jZza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaqbVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(jZza).length());
        androidx.constraintlayout.core.state.a.A(sb, "streamToBytes length=", j, ", maxLength=");
        sb.append(jZza);
        throw new IOException(sb.toString());
    }

    public static void zzh(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    public static void zzj(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static long zzk(InputStream inputStream) throws IOException {
        return (zzp(inputStream) & 255) | ((zzp(inputStream) & 255) << 8) | ((zzp(inputStream) & 255) << 16) | ((zzp(inputStream) & 255) << 24) | ((zzp(inputStream) & 255) << 32) | ((zzp(inputStream) & 255) << 40) | ((zzp(inputStream) & 255) << 48) | ((zzp(inputStream) & 255) << 56);
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static String zzm(zzaqb zzaqbVar) throws IOException {
        return new String(zzg(zzaqbVar, zzk(zzaqbVar)), "UTF-8");
    }

    private final void zzn(String str, zzaqa zzaqaVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb = (zzaqaVar.zza - ((zzaqa) map.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzaqaVar.zza;
        }
        map.put(str, zzaqaVar);
    }

    private final void zzo(String str) {
        zzaqa zzaqaVar = (zzaqa) this.zza.remove(str);
        if (zzaqaVar != null) {
            this.zzb -= zzaqaVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized zzaoq zza(String str) {
        zzaqa zzaqaVar = (zzaqa) this.zza.get(str);
        if (zzaqaVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzaqb zzaqbVar = new zzaqb(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                String str2 = zzaqa.zza(zzaqbVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzapt.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] bArrZzg = zzg(zzaqbVar, zzaqbVar.zza());
                zzaoq zzaoqVar = new zzaoq();
                zzaoqVar.zza = bArrZzg;
                zzaoqVar.zzb = zzaqaVar.zzc;
                zzaoqVar.zzc = zzaqaVar.zzd;
                zzaoqVar.zzd = zzaqaVar.zze;
                zzaoqVar.zze = zzaqaVar.zzf;
                zzaoqVar.zzf = zzaqaVar.zzg;
                List<zzaoz> list = zzaqaVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaoz zzaozVar : list) {
                    treeMap.put(zzaozVar.zza(), zzaozVar.zzb());
                }
                zzaoqVar.zzg = treeMap;
                zzaoqVar.zzh = Collections.unmodifiableList(list);
                return zzaoqVar;
            } finally {
                zzaqbVar.close();
            }
        } catch (IOException e) {
            zzapt.zzb("%s: %s", fileZzf.getAbsolutePath(), e.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized void zzb(String str, zzaoq zzaoqVar) {
        float f;
        try {
            long j = this.zzb;
            int length = zzaoqVar.zza.length;
            long j2 = j + length;
            int i = this.zzd;
            float f2 = 0.9f;
            if (j2 <= i || length <= i * 0.9f) {
                File fileZzf = zzf(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzf));
                    zzaqa zzaqaVar = new zzaqa(str, zzaoqVar);
                    try {
                        zzh(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaqaVar.zzb);
                        String str2 = zzaqaVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzj(bufferedOutputStream, zzaqaVar.zzd);
                        zzj(bufferedOutputStream, zzaqaVar.zze);
                        zzj(bufferedOutputStream, zzaqaVar.zzf);
                        zzj(bufferedOutputStream, zzaqaVar.zzg);
                        List<zzaoz> list = zzaqaVar.zzh;
                        if (list != null) {
                            zzh(bufferedOutputStream, list.size());
                            for (zzaoz zzaozVar : list) {
                                zzl(bufferedOutputStream, zzaozVar.zza());
                                zzl(bufferedOutputStream, zzaozVar.zzb());
                            }
                        } else {
                            zzh(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzaoqVar.zza);
                        bufferedOutputStream.close();
                        zzaqaVar.zza = fileZzf.length();
                        zzn(str, zzaqaVar);
                        long j3 = this.zzb;
                        int i2 = this.zzd;
                        if (j3 >= i2) {
                            boolean z = zzapt.zzb;
                            if (z) {
                                zzapt.zza("Pruning old cache entries.", new Object[0]);
                            }
                            long j4 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                zzaqa zzaqaVar2 = (zzaqa) ((Map.Entry) it.next()).getValue();
                                String str3 = zzaqaVar2.zzb;
                                if (zzf(str3).delete()) {
                                    f = f2;
                                    this.zzb -= zzaqaVar2.zza;
                                } else {
                                    f = f2;
                                    zzapt.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i3++;
                                if (this.zzb < i2 * f) {
                                    break;
                                } else {
                                    f2 = f;
                                }
                            }
                            if (z) {
                                zzapt.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.zzb - j4), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzapt.zzb("%s", e.toString());
                        bufferedOutputStream.close();
                        zzapt.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzf.delete()) {
                        zzapt.zzb("Could not clean up file %s", fileZzf.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzapt.zzb("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzc();
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized void zzc() {
        long length;
        zzaqb zzaqbVar;
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        length = file.length();
                        zzaqbVar = new zzaqb(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        zzaqa zzaqaVarZza = zzaqa.zza(zzaqbVar);
                        zzaqaVarZza.zza = length;
                        zzn(zzaqaVarZza.zzb, zzaqaVarZza);
                        zzaqbVar.close();
                    } catch (Throwable th) {
                        zzaqbVar.close();
                        throw th;
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzapt.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final synchronized void zzd(String str, boolean z) {
        zzaoq zzaoqVarZza = zza(str);
        if (zzaoqVarZza != null) {
            zzaoqVarZza.zzf = 0L;
            zzaoqVarZza.zze = 0L;
            zzb(str, zzaoqVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzapt.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzaqd(File file, int i) {
        this.zzc = new zzapz(this, file);
    }
}
