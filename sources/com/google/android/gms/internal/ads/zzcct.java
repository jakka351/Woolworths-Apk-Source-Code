package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzcct extends zzccq {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcct(zzcbd zzcbdVar) {
        super(zzcbdVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfqm.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfqm.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x03c8, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03d0, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03d2, code lost:
    
        r0 = r10.format(r4);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r34).length());
        r5.append(r17);
        r5.append(r0);
        r5.append(" bytes from ");
        r5.append(r34);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0404, code lost:
    
        r13.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x040e, code lost:
    
        if (r7.isFile() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0410, code lost:
    
        r7.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x041c, code lost:
    
        r7.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0497  */
    @Override // com.google.android.gms.internal.ads.zzccq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(final java.lang.String r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcct.zze(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
        this.zzh = true;
    }
}
