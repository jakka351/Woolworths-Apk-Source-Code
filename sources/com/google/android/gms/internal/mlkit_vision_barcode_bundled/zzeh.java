package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import YU.a;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class zzeh<MessageType extends zzeh<MessageType, BuilderType>, BuilderType extends zzeb<MessageType, BuilderType>> extends zzcq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgt zzc = zzgt.zzc();

    public static zzef zzI(zzfm zzfmVar, Object obj, zzfm zzfmVar2, zzek zzekVar, int i, zzhf zzhfVar, Class cls) {
        return new zzef(zzfmVar, obj, zzfmVar2, new zzee(null, i, zzhfVar, false, false), cls);
    }

    public static zzeh zzJ(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        zzeh zzehVar = (zzeh) map.get(cls);
        if (zzehVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzehVar = (zzeh) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzehVar != null) {
            return zzehVar;
        }
        zzeh zzehVar2 = (zzeh) ((zzeh) zzgz.zze(cls)).zzg(6, null, null);
        if (zzehVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzehVar2);
        return zzehVar2;
    }

    public static zzeh zzL(zzeh zzehVar, byte[] bArr, zzds zzdsVar) throws zzer {
        zzeh zzehVarZze = zze(zzehVar, bArr, 0, bArr.length, zzdsVar);
        if (zzehVarZze == null || zzX(zzehVarZze, true)) {
            return zzehVarZze;
        }
        throw new zzgr(zzehVarZze).zza();
    }

    public static zzem zzM() {
        return zzdz.zzf();
    }

    public static zzem zzN(zzem zzemVar) {
        int size = zzemVar.size();
        return zzemVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzen zzO() {
        return zzei.zzf();
    }

    public static zzeo zzP() {
        return zzfv.zze();
    }

    public static zzeo zzQ(zzeo zzeoVar) {
        int size = zzeoVar.size();
        return zzeoVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzR(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzS(zzfm zzfmVar, String str, Object[] objArr) {
        return new zzfw(zzfmVar, str, objArr);
    }

    public static void zzV(Class cls, zzeh zzehVar) {
        zzehVar.zzU();
        zzb.put(cls, zzehVar);
    }

    public static final boolean zzX(zzeh zzehVar, boolean z) {
        byte bByteValue = ((Byte) zzehVar.zzg(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzfu.zza().zzb(zzehVar.getClass()).zzk(zzehVar);
        if (z) {
            zzehVar.zzg(2, true != zZzk ? null : zzehVar, null);
        }
        return zZzk;
    }

    private final int zzc(zzge zzgeVar) {
        return zzfu.zza().zzb(getClass()).zza(this);
    }

    private static zzeh zze(zzeh zzehVar, byte[] bArr, int i, int i2, zzds zzdsVar) throws zzer {
        if (i2 == 0) {
            return zzehVar;
        }
        zzeh zzehVarZzK = zzehVar.zzK();
        try {
            zzge zzgeVarZzb = zzfu.zza().zzb(zzehVarZzK.getClass());
            zzgeVarZzb.zzh(zzehVarZzK, bArr, 0, i2, new zzcu(zzdsVar));
            zzgeVarZzb.zzf(zzehVarZzK);
            return zzehVarZzK;
        } catch (zzer e) {
            throw e;
        } catch (zzgr e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzer) {
                throw ((zzer) e3.getCause());
            }
            throw new zzer(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzfu.zza().zzb(getClass()).zzj(this, (zzeh) obj);
    }

    public final int hashCode() {
        if (zzY()) {
            return zzE();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzE = zzE();
        this.zza = iZzE;
        return iZzE;
    }

    public final String toString() {
        return zzfo.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcq
    public final int zzB(zzge zzgeVar) {
        if (zzY()) {
            int iZza = zzgeVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(a.d(iZza, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzgeVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(a.d(iZza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    public final int zzE() {
        return zzfu.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final int zzF() {
        if (zzY()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException(a.d(iZzc, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 < 0) {
            throw new IllegalStateException(a.d(iZzc2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzc2;
        return iZzc2;
    }

    public final zzeb zzG() {
        return (zzeb) zzg(5, null, null);
    }

    public final zzeb zzH() {
        zzeb zzebVar = (zzeb) zzg(5, null, null);
        zzebVar.zzg(this);
        return zzebVar;
    }

    public final zzeh zzK() {
        return (zzeh) zzg(4, null, null);
    }

    public final void zzT() {
        zzfu.zza().zzb(getClass()).zzf(this);
        zzU();
    }

    public final void zzU() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzW(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzY() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final /* synthetic */ zzfl zzZ() {
        return (zzeb) zzg(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final /* synthetic */ zzfl zzaa() {
        zzeb zzebVar = (zzeb) zzg(5, null, null);
        zzebVar.zzg(this);
        return zzebVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final void zzab(zzdn zzdnVar) throws IOException {
        zzfu.zza().zzb(getClass()).zzi(this, zzdo.zza(zzdnVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn
    public final /* synthetic */ zzfm zzac() {
        return (zzeh) zzg(6, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn
    public final boolean zzad() {
        return zzX(this, true);
    }

    public abstract Object zzg(int i, Object obj, Object obj2);
}
