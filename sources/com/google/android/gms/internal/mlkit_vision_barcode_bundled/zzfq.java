package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzfq implements zzge {
    private final zzfm zza;
    private final zzgs zzb;
    private final boolean zzc;
    private final zzdt zzd;

    private zzfq(zzgs zzgsVar, zzdt zzdtVar, zzfm zzfmVar) {
        this.zzb = zzgsVar;
        this.zzc = zzfmVar instanceof zzed;
        this.zzd = zzdtVar;
        this.zza = zzfmVar;
    }

    public static zzfq zzc(zzgs zzgsVar, zzdt zzdtVar, zzfm zzfmVar) {
        return new zzfq(zzgsVar, zzdtVar, zzfmVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zza(Object obj) {
        int iZzb = ((zzeh) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzed) obj).zzb.zzb() : iZzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int iHashCode = ((zzeh) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzed) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        zzfm zzfmVar = this.zza;
        return zzfmVar instanceof zzeh ? ((zzeh) zzfmVar).zzK() : zzfmVar.zzZ().zzk();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        this.zzb.zza(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzgg.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgg.zzo(this.zzd, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[EDGE_INSN: B:61:0x00b8->B:33:0x00b8 BREAK  A[LOOP:1: B:17:0x0064->B:64:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh) r0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt r1 = r0.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgt.zzf()
            r0.zzc = r1
        L11:
            r6 = r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed r11 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed) r11
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx r11 = r11.zzc()
            r0 = 0
            r1 = r0
        L1a:
            if (r13 >= r14) goto Lc5
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcv.zzj(r12, r13, r15)
            int r2 = r15.zza
            r13 = 11
            r3 = 2
            if (r2 == r13) goto L60
            r13 = r2 & 7
            if (r13 != r3) goto L59
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds r13 = r15.zzd
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm r1 = r10.zza
            int r3 = r2 >>> 3
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef r1 = r13.zzb(r1, r3)
            if (r1 == 0) goto L51
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm r13 = r1.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu.zza()
            java.lang.Class r13 = r13.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge r13 = r2.zzb(r13)
            int r13 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcv.zze(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzee r3 = r1.zzb
            r11.zzi(r3, r2)
            goto L1a
        L51:
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcv.zzi(r2, r3, r4, r5, r6, r7)
            goto L1a
        L59:
            r5 = r14
            r7 = r15
            int r13 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcv.zzp(r2, r12, r4, r5, r7)
            goto L1a
        L60:
            r5 = r14
            r7 = r15
            r13 = 0
            r14 = r0
        L64:
            if (r4 >= r5) goto Lb7
            int r15 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcv.zzj(r12, r4, r7)
            int r2 = r7.zza
            int r4 = r2 >>> 3
            r8 = r2 & 7
            if (r4 == r3) goto L9d
            r9 = 3
            if (r4 == r9) goto L76
            goto Lae
        L76:
            if (r1 == 0) goto L92
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm r2 = r1.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu.zza()
            java.lang.Class r2 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge r2 = r4.zzb(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcv.zze(r2, r12, r15, r5, r7)
            java.lang.Object r15 = r7.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzee r2 = r1.zzb
            r11.zzi(r2, r15)
            goto L64
        L92:
            if (r8 != r3) goto Lae
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcv.zza(r12, r15, r7)
            java.lang.Object r14 = r7.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf r14 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf) r14
            goto L64
        L9d:
            if (r8 != 0) goto Lae
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcv.zzj(r12, r15, r7)
            int r13 = r7.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds r15 = r7.zzd
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm r1 = r10.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef r1 = r15.zzb(r1, r13)
            goto L64
        Lae:
            r4 = 12
            if (r2 == r4) goto Lb8
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcv.zzp(r2, r12, r15, r5, r7)
            goto L64
        Lb7:
            r15 = r4
        Lb8:
            if (r14 == 0) goto Lc0
            int r13 = r13 << 3
            r13 = r13 | r3
            r6.zzj(r13, r14)
        Lc0:
            r13 = r15
            r14 = r5
            r15 = r7
            goto L1a
        Lc5:
            r5 = r14
            if (r13 != r5) goto Lc9
            return
        Lc9:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer r11 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfq.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzi(Object obj, zzhh zzhhVar) throws IOException {
        Iterator itZzf = ((zzed) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzdw zzdwVar = (zzdw) entry.getKey();
            if (zzdwVar.zze() != zzhg.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzdwVar.zzg();
            zzdwVar.zzf();
            if (entry instanceof zzeu) {
                zzhhVar.zzw(zzdwVar.zza(), ((zzeu) entry).zza().zzb());
            } else {
                zzhhVar.zzw(zzdwVar.zza(), entry.getValue());
            }
        }
        ((zzeh) obj).zzc.zzk(zzhhVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzk(Object obj) {
        return ((zzed) obj).zzb.zzk();
    }
}
