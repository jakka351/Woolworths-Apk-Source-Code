package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* loaded from: classes5.dex */
public final class zzfvt extends zzfvl {
    private final ExecutorService zzb;
    private final zzfvs zzc;
    private final Function zzd;

    public zzfvt(File file, ExecutorService executorService, zzfvs zzfvsVar, Function function) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzfvsVar;
        this.zzd = function;
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public final ListenableFuture zzb() {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfvq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public final ListenableFuture zzc(final Object obj) {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfvp
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    public final /* synthetic */ Object zzd() {
        Object objZzc;
        Object objZzb;
        synchronized (this) {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.zza);
                        try {
                            objZzb = this.zzc.zzb(fileInputStream);
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        objZzc = this.zzc.zzc();
                        return objZzc;
                    }
                } catch (zzfvo e) {
                    objZzc = this.zzd.apply(e);
                    return objZzc;
                }
            } catch (IOException e2) {
                objZzc = this.zzd.apply(new zzfvo(e2));
                return objZzc;
            }
        }
        return objZzb;
    }

    public final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            try {
                File file = this.zza;
                zzgmr.zzb(file);
                if (!file.exists() && !file.createNewFile()) {
                    String absolutePath = this.zza.getAbsolutePath();
                    StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 23);
                    sb.append("Failed to create file: ");
                    sb.append(absolutePath);
                    throw new IOException(sb.toString());
                }
                file.setWritable(true);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }
}
