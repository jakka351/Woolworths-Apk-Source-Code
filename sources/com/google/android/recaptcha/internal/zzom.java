package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzom implements zzow {
    private final zzoi zza;
    private final zzpl zzb;
    private final boolean zzc;
    private final zzmp zzd;

    private zzom(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        this.zzb = zzplVar;
        this.zzc = zzoiVar instanceof zzna;
        this.zzd = zzmpVar;
        this.zza = zzoiVar;
    }

    public static zzom zzc(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        return new zzom(zzplVar, zzmpVar, zzoiVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int iZzb = ((zznd) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzna) obj).zzb.zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int iHashCode = ((zznd) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        zzoi zzoiVar = this.zza;
        return zzoiVar instanceof zznd ? ((zznd) zzoiVar).zzv() : zzoiVar.zzad().zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzoy.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzoy.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws IOException {
        boolean zZzO;
        zzpl zzplVar = this.zzb;
        Object objZza = zzplVar.zza(obj);
        ((zzna) obj).zzi();
        while (zzovVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzovVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) != 2) {
                        zZzO = zzovVar.zzO();
                    } else {
                        if (zzmoVar.zza(this.zza, iZzd >>> 3) != null) {
                            throw null;
                        }
                        zZzO = zzplVar.zzk(objZza, zzovVar, 0);
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    zznc zzncVarZza = null;
                    zzle zzleVarZzp = null;
                    while (zzovVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzovVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzovVar.zzj();
                            zzncVarZza = zzmoVar.zza(this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (zzncVarZza != null) {
                                throw null;
                            }
                            zzleVarZzp = zzovVar.zzp();
                        } else if (!zzovVar.zzO()) {
                            break;
                        }
                    }
                    if (zzovVar.zzd() != 12) {
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzleVarZzp == null) {
                        continue;
                    } else {
                        if (zzncVarZza != null) {
                            throw null;
                        }
                        zzplVar.zzg(objZza, iZzj, zzleVarZzp);
                    }
                }
            } finally {
                zzplVar.zzj(obj, objZza);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r12 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r6.zzj((r11 << 3) | 2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        r12 = r13;
        r11 = r3;
        r13 = r5;
        r14 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008b A[EDGE_INSN: B:58:0x008b->B:35:0x008b BREAK  A[LOOP:1: B:18:0x004e->B:63:0x004e], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r10, byte[] r11, int r12, int r13, com.google.android.recaptcha.internal.zzkt r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.recaptcha.internal.zznd r0 = (com.google.android.recaptcha.internal.zznd) r0
            com.google.android.recaptcha.internal.zzpm r1 = r0.zzc
            com.google.android.recaptcha.internal.zzpm r2 = com.google.android.recaptcha.internal.zzpm.zzc()
            if (r1 != r2) goto L11
            com.google.android.recaptcha.internal.zzpm r1 = com.google.android.recaptcha.internal.zzpm.zzf()
            r0.zzc = r1
        L11:
            r6 = r1
            com.google.android.recaptcha.internal.zzna r10 = (com.google.android.recaptcha.internal.zzna) r10
            r10.zzi()
            r10 = 0
            r0 = r10
        L19:
            if (r12 >= r13) goto L98
            int r4 = com.google.android.recaptcha.internal.zzku.zzi(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r1 = 2
            if (r2 == r12) goto L49
            r12 = r2 & 7
            if (r12 != r1) goto L41
            com.google.android.recaptcha.internal.zzmo r12 = r14.zzd
            com.google.android.recaptcha.internal.zzoi r0 = r9.zza
            int r1 = r2 >>> 3
            com.google.android.recaptcha.internal.zznc r0 = r12.zza(r0, r1)
            if (r0 != 0) goto L3e
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = com.google.android.recaptcha.internal.zzku.zzh(r2, r3, r4, r5, r6, r7)
            goto L19
        L3e:
            int r11 = com.google.android.recaptcha.internal.zzos.zza
            throw r10
        L41:
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = com.google.android.recaptcha.internal.zzku.zzo(r2, r3, r4, r5, r7)
            goto L19
        L49:
            r3 = r11
            r5 = r13
            r7 = r14
            r11 = 0
            r12 = r10
        L4e:
            if (r4 >= r5) goto L8a
            int r13 = com.google.android.recaptcha.internal.zzku.zzi(r3, r4, r7)
            int r14 = r7.zza
            int r2 = r14 >>> 3
            r4 = r14 & 7
            if (r2 == r1) goto L70
            r8 = 3
            if (r2 == r8) goto L60
            goto L81
        L60:
            if (r0 != 0) goto L6d
            if (r4 != r1) goto L81
            int r4 = com.google.android.recaptcha.internal.zzku.zza(r3, r13, r7)
            java.lang.Object r12 = r7.zzc
            com.google.android.recaptcha.internal.zzle r12 = (com.google.android.recaptcha.internal.zzle) r12
            goto L4e
        L6d:
            int r11 = com.google.android.recaptcha.internal.zzos.zza
            throw r10
        L70:
            if (r4 != 0) goto L81
            int r4 = com.google.android.recaptcha.internal.zzku.zzi(r3, r13, r7)
            int r11 = r7.zza
            com.google.android.recaptcha.internal.zzmo r13 = r7.zzd
            com.google.android.recaptcha.internal.zzoi r14 = r9.zza
            com.google.android.recaptcha.internal.zznc r0 = r13.zza(r14, r11)
            goto L4e
        L81:
            r2 = 12
            if (r14 == r2) goto L8b
            int r4 = com.google.android.recaptcha.internal.zzku.zzo(r14, r3, r13, r5, r7)
            goto L4e
        L8a:
            r13 = r4
        L8b:
            if (r12 == 0) goto L93
            int r11 = r11 << 3
            r11 = r11 | r1
            r6.zzj(r11, r12)
        L93:
            r12 = r13
            r11 = r3
            r13 = r5
            r14 = r7
            goto L19
        L98:
            r5 = r13
            if (r12 != r5) goto L9c
            return
        L9c:
            com.google.android.recaptcha.internal.zznn r10 = new com.google.android.recaptcha.internal.zznn
            java.lang.String r11 = "Failed to parse the message."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzom.zzi(java.lang.Object, byte[], int, int, com.google.android.recaptcha.internal.zzkt):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzj(Object obj, zzpy zzpyVar) throws IOException {
        Iterator itZzf = ((zzna) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzms zzmsVar = (zzms) entry.getKey();
            if (zzmsVar.zze() != zzpx.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (entry instanceof zznp) {
                zzpyVar.zzw(zzmsVar.zza(), ((zznp) entry).zza().zzb());
            } else {
                zzpyVar.zzw(zzmsVar.zza(), entry.getValue());
            }
        }
        ((zznd) obj).zzc.zzk(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        return ((zzna) obj).zzb.zzk();
    }
}
