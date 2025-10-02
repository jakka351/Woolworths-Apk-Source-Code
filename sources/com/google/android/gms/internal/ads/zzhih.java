package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhib;
import com.google.android.gms.internal.ads.zzhih;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class zzhih<MessageType extends zzhih<MessageType, BuilderType>, BuilderType extends zzhib<MessageType, BuilderType>> extends zzhgk<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzhih<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzhkw zzt = zzhkw.zza();

    public static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            int length = name.length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 43 + 2);
            androidx.constraintlayout.core.state.a.B(sb, "Generated message class \"", name, "\" missing method \"", str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object zzbB(Method method, Object obj, Object... objArr) {
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

    public static zzhip zzbC() {
        return zzhii.zzd();
    }

    public static zzhip zzbD(zzhip zzhipVar) {
        int size = zzhipVar.size();
        return zzhipVar.zzh(size + size);
    }

    public static zzhis zzbE() {
        return zzhjg.zzg();
    }

    public static zzhis zzbF(zzhis zzhisVar) {
        int size = zzhisVar.size();
        return zzhisVar.zzh(size + size);
    }

    public static zzhio zzbG() {
        return zzhhy.zzd();
    }

    public static zzhio zzbH(zzhio zzhioVar) {
        int size = zzhioVar.size();
        return zzhioVar.zzh(size + size);
    }

    public static zzhik zzbI() {
        return zzhho.zzd();
    }

    public static zzhik zzbJ(zzhik zzhikVar) {
        int size = zzhikVar.size();
        return zzhikVar.zzh(size + size);
    }

    public static zzhij zzbK() {
        return zzhgr.zzd();
    }

    public static zzhij zzbL(zzhij zzhijVar) {
        int size = zzhijVar.size();
        return zzhijVar.zzh(size + size);
    }

    public static <E> zzhit<E> zzbM() {
        return zzhkd.zzd();
    }

    public static <E> zzhit<E> zzbN(zzhit<E> zzhitVar) {
        int size = zzhitVar.size();
        return zzhitVar.zzh(size + size);
    }

    public static <T extends zzhih<T, ?>> T zzbO(T t, zzhhg zzhhgVar, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) t.zzbg();
        try {
            zzhkk zzhkkVarZzb = zzhkc.zza().zzb(t2.getClass());
            zzhkkVarZzb.zzg(t2, zzhhh.zza(zzhhgVar), zzhhrVar);
            zzhkkVarZzb.zzk(t2);
            return t2;
        } catch (zzhiw e) {
            if (e.zzb()) {
                throw new zzhiw(e);
            }
            throw e;
        } catch (zzhku e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhiw) {
                throw ((zzhiw) e3.getCause());
            }
            throw new zzhiw(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzhiw) {
                throw ((zzhiw) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends zzhih<T, ?>> T zzbP(T t, zzhhg zzhhgVar) throws zzhiw {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        return (T) zzbO(t, zzhhgVar, zzhhr.zza);
    }

    public static <T extends zzhih<T, ?>> T zzbQ(T t, ByteBuffer byteBuffer, zzhhr zzhhrVar) throws zzhiw {
        zzhhg zzhhgVarZzG;
        boolean z = false;
        if (byteBuffer.hasArray()) {
            zzhhgVarZzG = zzhhg.zzG(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhlc.zzb()) {
            zzhhgVarZzG = new zzhhf(byteBuffer, z, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzhhgVarZzG = zzhhg.zzG(bArr, 0, iRemaining, true);
        }
        T t2 = (T) zzbZ(t, zzhhgVarZzG, zzhhrVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zzhih<T, ?>> T zzbR(T t, ByteBuffer byteBuffer) throws zzhiw {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        return (T) zzbQ(t, byteBuffer, zzhhr.zza);
    }

    public static <T extends zzhih<T, ?>> T zzbS(T t, zzhhb zzhhbVar) throws zzhiw {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        T t2 = (T) zzbT(t, zzhhbVar, zzhhr.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zzhih<T, ?>> T zzbT(T t, zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) zzj(t, zzhhbVar, zzhhrVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zzhih<T, ?>> T zzbU(T t, byte[] bArr) throws zzhiw {
        int length = bArr.length;
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        T t2 = (T) zzh(t, bArr, 0, length, zzhhr.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zzhih<T, ?>> T zzbV(T t, byte[] bArr, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) zzh(t, bArr, 0, bArr.length, zzhhrVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zzhih<T, ?>> T zzbW(T t, InputStream inputStream) throws zzhiw {
        zzhhg zzhhgVarZzF = zzhhg.zzF(inputStream, 4096);
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        T t2 = (T) zzbO(t, zzhhgVarZzF, zzhhr.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zzhih<T, ?>> T zzbX(T t, InputStream inputStream, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) zzbO(t, zzhhg.zzF(inputStream, 4096), zzhhrVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zzhih<T, ?>> T zzbY(T t, zzhhg zzhhgVar) throws zzhiw {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        return (T) zzbZ(t, zzhhgVar, zzhhr.zza);
    }

    public static <T extends zzhih<T, ?>> T zzbZ(T t, zzhhg zzhhgVar, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) zzbO(t, zzhhgVar, zzhhrVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zzhih> T zzbt(Class<T> cls) throws ClassNotFoundException {
        zzhih<?, ?> zzhihVar = zzd.get(cls);
        if (zzhihVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhihVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzhihVar != null) {
            return zzhihVar;
        }
        zzhih<?, ?> zzhihVarZzbw = ((zzhih) zzhlc.zzc(cls)).zzbw();
        if (zzhihVarZzbw == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, zzhihVarZzbw);
        return zzhihVarZzbw;
    }

    public static <T extends zzhih> void zzbu(Class<T> cls, T t) {
        t.zzaY();
        zzd.put(cls, t);
    }

    public static Object zzbv(zzhjs zzhjsVar, String str, Object[] objArr) {
        return new zzhke(zzhjsVar, str, objArr);
    }

    public static <ContainingType extends zzhjs, Type> zzhif<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzhjs zzhjsVar, zzhim zzhimVar, int i, zzhli zzhliVar, Class cls) {
        return new zzhif<>(containingtype, type, zzhjsVar, new zzhie(zzhimVar, i, zzhliVar, false, false), cls);
    }

    public static <ContainingType extends zzhjs, Type> zzhif<ContainingType, Type> zzbz(ContainingType containingtype, zzhjs zzhjsVar, zzhim zzhimVar, int i, zzhli zzhliVar, boolean z, Class cls) {
        return new zzhif<>(containingtype, zzhkd.zzd(), zzhjsVar, new zzhie(zzhimVar, i, zzhliVar, true, z), cls);
    }

    private void zzc() {
        if (this.zzt == zzhkw.zza()) {
            this.zzt = zzhkw.zzb();
        }
    }

    public static <T extends zzhih<T, ?>> T zzca(T t, InputStream inputStream) throws zzhiw {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        T t2 = (T) zzk(t, inputStream, zzhhr.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zzhih<T, ?>> T zzcb(T t, InputStream inputStream, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) zzk(t, inputStream, zzhhrVar);
        zzi(t2);
        return t2;
    }

    private int zzd(zzhkk<?> zzhkkVar) {
        if (zzhkkVar != null) {
            return zzhkkVar.zze(this);
        }
        return zzhkc.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzhid<MessageType, BuilderType>, BuilderType, T> zzhif<MessageType, T> zze(zzhhp<MessageType, T> zzhhpVar) {
        return (zzhif) zzhhpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzhih<T, ?>> boolean zzg(T t, boolean z) {
        byte bByteValue = ((Byte) t.zzdh(zzhig.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzhkc.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdh(zzhig.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t, null);
        }
        return zZzl;
    }

    private static <T extends zzhih<T, ?>> T zzh(T t, byte[] bArr, int i, int i2, zzhhr zzhhrVar) throws zzhiw {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbg();
        try {
            zzhkk zzhkkVarZzb = zzhkc.zza().zzb(t2.getClass());
            zzhkkVarZzb.zzj(t2, bArr, i, i + i2, new zzhgp(zzhhrVar));
            zzhkkVarZzb.zzk(t2);
            return t2;
        } catch (zzhiw e) {
            if (e.zzb()) {
                throw new zzhiw(e);
            }
            throw e;
        } catch (zzhku e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhiw) {
                throw ((zzhiw) e3.getCause());
            }
            throw new zzhiw(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzhih<T, ?>> T zzi(T t) throws zzhiw {
        if (t == null || t.zzbi()) {
            return t;
        }
        throw t.zzaU().zza();
    }

    private static <T extends zzhih<T, ?>> T zzj(T t, zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        zzhhg zzhhgVarZzp = zzhhbVar.zzp();
        T t2 = (T) zzbO(t, zzhhgVarZzp, zzhhrVar);
        zzhhgVarZzp.zzb(0);
        return t2;
    }

    private static <T extends zzhih<T, ?>> T zzk(T t, InputStream inputStream, zzhhr zzhhrVar) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            zzhhg zzhhgVarZzF = zzhhg.zzF(new zzhgi(inputStream, zzhhg.zzM(i, inputStream)), 4096);
            T t2 = (T) zzbO(t, zzhhgVarZzF, zzhhrVar);
            zzhhgVarZzF.zzb(0);
            return t2;
        } catch (zzhiw e) {
            if (e.zzb()) {
                throw new zzhiw(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzhiw(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhkc.zza().zzb(getClass()).zzb(this, (zzhih) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzhju.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhgk
    public int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk
    public void zzaR(int i) {
        if (i < 0) {
            throw new IllegalStateException(YU.a.n(new StringBuilder(String.valueOf(i).length() + 42), "serialized size must be non-negative, was ", i));
        }
        this.zzc = i | (this.zzc & zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk
    public int zzaT(zzhkk zzhkkVar) {
        if (zzaX()) {
            int iZzd = zzd(zzhkkVar);
            if (iZzd >= 0) {
                return iZzd;
            }
            throw new IllegalStateException(YU.a.n(new StringBuilder(String.valueOf(iZzd).length() + 42), "serialized size must be non-negative, was ", iZzd));
        }
        if (zzaQ() != Integer.MAX_VALUE) {
            return zzaQ();
        }
        int iZzd2 = zzd(zzhkkVar);
        zzaR(iZzd2);
        return iZzd2;
    }

    public boolean zzaX() {
        return (this.zzc & zza) != 0;
    }

    public void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public int zzaZ() {
        return this.zzq;
    }

    public void zzba(int i) {
        this.zzq = i;
    }

    public void zzbb() {
        this.zzq = 0;
    }

    public boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public final zzhka<MessageType> zzbd() {
        return (zzhka) zzdh(zzhig.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhjt
    /* renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdh(zzhig.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    /* renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzdd() {
        return (BuilderType) zzdh(zzhig.NEW_BUILDER, null, null);
    }

    public MessageType zzbg() {
        return (MessageType) zzdh(zzhig.NEW_MUTABLE_INSTANCE, null, null);
    }

    public int zzbh() {
        return zzhkc.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhjt
    public final boolean zzbi() {
        return zzg(this, true);
    }

    public boolean zzbj(int i, zzhhg zzhhgVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i, zzhhgVar);
    }

    public void zzbk(int i, int i2) {
        zzc();
        zzhkw zzhkwVar = this.zzt;
        zzhkwVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhkwVar.zzk(i << 3, Long.valueOf(i2));
    }

    public void zzbl(int i, zzhhb zzhhbVar) {
        zzc();
        zzhkw zzhkwVar = this.zzt;
        zzhkwVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhkwVar.zzk((i << 3) | 2, zzhhbVar);
    }

    public void zzbm() {
        zzhkc.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    public final <MessageType2 extends zzhih<MessageType2, BuilderType2>, BuilderType2 extends zzhib<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdh(zzhig.NEW_BUILDER, null, null);
    }

    public final <MessageType2 extends zzhih<MessageType2, BuilderType2>, BuilderType2 extends zzhib<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdh(zzhig.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    public void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public int zzbr() {
        return zzaT(null);
    }

    public Object zzbs() throws Exception {
        return zzdh(zzhig.BUILD_MESSAGE_INFO, null, null);
    }

    public final void zzbx(zzhkw zzhkwVar) {
        this.zzt = zzhkw.zzc(this.zzt, zzhkwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public void zzdc(zzhhm zzhhmVar) throws IOException {
        zzhkc.zza().zzb(getClass()).zzf(this, zzhhn.zza(zzhhmVar));
    }

    public abstract Object zzdh(zzhig zzhigVar, Object obj, Object obj2);
}
