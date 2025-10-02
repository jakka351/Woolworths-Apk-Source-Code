package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes6.dex */
public final class zzc extends zzeh implements zzfn {
    private static final zzc zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private zzdf zzf;
    private String zzg;
    private zzad zzh;
    private int zzi;
    private zzp zzj;
    private zzv zzk;
    private zzco zzl;
    private zzah zzm;
    private zzao zzn;
    private zzak zzo;
    private zzz zzp;
    private zzn zzq;
    private zzr zzr;
    private zzj zzs;
    private zzeo zzt;
    private zzen zzu;
    private String zzv;
    private zzeo zzw;
    private boolean zzx;
    private double zzy;
    private zzdf zzz;

    static {
        zzc zzcVar = new zzc();
        zzb = zzcVar;
        zzeh.zzV(zzc.class, zzcVar);
    }

    public zzc() {
        zzdf zzdfVar = zzdf.zzb;
        this.zzf = zzdfVar;
        this.zzg = "";
        this.zzt = zzeh.zzP();
        this.zzu = zzeh.zzO();
        this.zzv = "";
        this.zzw = zzeh.zzP();
        this.zzx = true;
        this.zzz = zzdfVar;
    }

    public static /* synthetic */ void n(zzc zzcVar, int i, zzaf zzafVar) {
        zzafVar.getClass();
        zzeo zzeoVar = zzcVar.zzt;
        if (!zzeoVar.zzc()) {
            zzcVar.zzt = zzeh.zzQ(zzeoVar);
        }
        zzcVar.zzt.set(i, zzafVar);
    }

    public final int a() {
        int iA = zzg.a(this.zzi);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int b() {
        return this.zzt.size();
    }

    public final zzn c() {
        zzn zznVar = this.zzq;
        return zznVar == null ? zzn.c() : zznVar;
    }

    public final zzp d() {
        zzp zzpVar = this.zzj;
        return zzpVar == null ? zzp.a() : zzpVar;
    }

    public final zzr e() {
        zzr zzrVar = this.zzr;
        return zzrVar == null ? zzr.a() : zzrVar;
    }

    public final zzv f() {
        zzv zzvVar = this.zzk;
        return zzvVar == null ? zzv.a() : zzvVar;
    }

    public final zzz g() {
        zzz zzzVar = this.zzp;
        return zzzVar == null ? zzz.c() : zzzVar;
    }

    public final zzah h() {
        zzah zzahVar = this.zzm;
        return zzahVar == null ? zzah.a() : zzahVar;
    }

    public final zzak i() {
        zzak zzakVar = this.zzo;
        return zzakVar == null ? zzak.a() : zzakVar;
    }

    public final zzao j() {
        zzao zzaoVar = this.zzn;
        return zzaoVar == null ? zzao.a() : zzaoVar;
    }

    public final zzdf k() {
        return this.zzf;
    }

    public final String l() {
        return this.zzg;
    }

    public final zzeo m() {
        return this.zzt;
    }

    public final boolean o() {
        return (this.zzd & 4096) != 0;
    }

    public final boolean p() {
        return (this.zzd & 32) != 0;
    }

    public final boolean q() {
        return (this.zzd & 8192) != 0;
    }

    public final boolean r() {
        return (this.zzd & 64) != 0;
    }

    public final boolean s() {
        return (this.zzd & 2048) != 0;
    }

    public final boolean t() {
        return (this.zzd & 128) != 0;
    }

    public final boolean u() {
        return (this.zzd & 256) != 0;
    }

    public final boolean v() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean w() {
        return (this.zzd & 512) != 0;
    }

    public final int x() {
        int iA = zze.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final zzco zzb() {
        zzco zzcoVar = this.zzl;
        return zzcoVar == null ? zzco.zzb() : zzcoVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i2 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", zzd.f16009a, "zzf", "zzg", "zzi", zzf.f16010a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", zzaf.class, "zzv", "zzw", zzaf.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i2 == 3) {
            return new zzc();
        }
        if (i2 == 4) {
            return new zzb(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzA = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
