package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class zzjb<MessageType extends zzjb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhf<MessageType, BuilderType> {
    private static Map<Object, zzjb<?, ?>> zzd = new ConcurrentHashMap();
    protected zzlx zzb = zzlx.zza();
    private int zzc = -1;

    public static class zza<T extends zzjb<T, ?>> extends zzhg<T> {
        private final T zza;

        public zza(T t) {
            this.zza = t;
        }
    }

    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType extends zzd<MessageType, BuilderType>> extends zzjb<MessageType, BuilderType> implements zzkm {
        protected zziu<zzf> zzc = zziu.zza();

        public final zziu<zzf> zza() {
            if (this.zzc.zzc()) {
                this.zzc = (zziu) this.zzc.clone();
            }
            return this.zzc;
        }

        /* JADX WARN: Type inference failed for: r1v6, types: [Type, java.util.ArrayList] */
        public final <Type> Type zzb(zzim<MessageType, Type> zzimVar) {
            zze zzeVarZzb = zzjb.zzb(zzimVar);
            if (zzeVarZzb.zza != ((zzjb) zzr())) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            Type type = (Type) this.zzc.zza((zziu<zzf>) zzeVarZzb.zzd);
            if (type == null) {
                return zzeVarZzb.zzb;
            }
            zzf zzfVar = zzeVarZzb.zzd;
            if (!zzfVar.zzd) {
                return (Type) zzeVarZzb.zza(type);
            }
            if (zzfVar.zzc.zza() != zzmo.ENUM) {
                return type;
            }
            ?? r1 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r1.add(zzeVarZzb.zza(it.next()));
            }
            return r1;
        }
    }

    public static abstract class zzd<MessageType extends zzc<MessageType, BuilderType>, BuilderType extends zzd<MessageType, BuilderType>> extends zzb<MessageType, BuilderType> implements zzkm {
        public zzd(MessageType messagetype) {
            super(messagetype);
        }

        @Override // com.google.android.gms.internal.vision.zzjb.zzb
        public void zzb() {
            super.zzb();
            MessageType messagetype = this.zza;
            ((zzc) messagetype).zzc = (zziu) ((zzc) messagetype).zzc.clone();
        }

        @Override // com.google.android.gms.internal.vision.zzjb.zzb
        /* renamed from: zzc */
        public /* synthetic */ zzjb zze() {
            return (zzc) zze();
        }

        @Override // com.google.android.gms.internal.vision.zzjb.zzb, com.google.android.gms.internal.vision.zzkn
        public /* synthetic */ zzkk zze() {
            if (this.zzb) {
                return (zzc) this.zza;
            }
            ((zzc) this.zza).zzc.zzb();
            return (zzc) super.zze();
        }
    }

    public static class zze<ContainingType extends zzkk, Type> extends zzim<ContainingType, Type> {
        final ContainingType zza;
        final Type zzb;
        final zzkk zzc;
        final zzf zzd;

        public zze(ContainingType containingtype, Type type, zzkk zzkkVar, zzf zzfVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (zzfVar.zzc == zzml.zzk && zzkkVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.zza = containingtype;
            this.zzb = type;
            this.zzc = zzkkVar;
            this.zzd = zzfVar;
        }

        public final Object zza(Object obj) {
            if (this.zzd.zzc.zza() != zzmo.ENUM) {
                return obj;
            }
            ((Integer) obj).intValue();
            throw null;
        }
    }

    public static final class zzf implements zziw<zzf> {
        final zzml zzc;
        final zzjh<?> zza = null;
        final int zzb = 202056002;
        final boolean zzd = true;
        final boolean zze = false;

        public zzf(zzjh<?> zzjhVar, int i, zzml zzmlVar, boolean z, boolean z2) {
            this.zzc = zzmlVar;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.zzb - ((zzf) obj).zzb;
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final int zza() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final zzml zzb() {
            return this.zzc;
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final zzmo zzc() {
            return this.zzc.zza();
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final boolean zzd() {
            return this.zzd;
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final boolean zze() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.zziw
        public final zzkn zza(zzkn zzknVar, zzkk zzkkVar) {
            return ((zzb) zzknVar).zza((zzb) zzkkVar);
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final zzkt zza(zzkt zzktVar, zzkt zzktVar2) {
            throw new UnsupportedOperationException();
        }
    }

    public enum zzg {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.zzjd, com.google.android.gms.internal.vision.zzjj] */
    public static zzjj zzn() {
        return zzjd.zzd();
    }

    public static <E> zzjl<E> zzo() {
        return zzlb.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzky.zza().zza((zzky) this).zza(this, (zzjb<MessageType, BuilderType>) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZza = zzky.zza().zza((zzky) this).zza(this);
        this.zza = iZza;
        return iZza;
    }

    public String toString() {
        return zzkp.zza(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.vision.zzkk
    public final void zza(zzii zziiVar) throws IOException {
        zzky.zza().zza((zzky) this).zza((zzlc) this, (zzmr) zzil.zza(zziiVar));
    }

    @Override // com.google.android.gms.internal.vision.zzhf
    public final void zzb(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.vision.zzhf
    public final int zzi() {
        return this.zzc;
    }

    public final <MessageType extends zzjb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzj() {
        return (BuilderType) zza(zzg.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.vision.zzkm
    public final boolean zzk() {
        return zza(this, true);
    }

    public final BuilderType zzl() {
        BuilderType buildertype = (BuilderType) zza(zzg.zze, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.vision.zzkk
    public final int zzm() {
        if (this.zzc == -1) {
            this.zzc = zzky.zza().zza((zzky) this).zzb(this);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.vision.zzkk
    public final /* synthetic */ zzkn zzp() {
        zzb zzbVar = (zzb) zza(zzg.zze, (Object) null, (Object) null);
        zzbVar.zza((zzb) this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.vision.zzkk
    public final /* synthetic */ zzkn zzq() {
        return (zzb) zza(zzg.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.vision.zzkm
    public final /* synthetic */ zzkk zzr() {
        return (zzjb) zza(zzg.zzf, (Object) null, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzc<MessageType, BuilderType>, BuilderType extends zzd<MessageType, BuilderType>, T> zze<MessageType, T> zzb(zzim<MessageType, T> zzimVar) {
        return (zze) zzimVar;
    }

    public static abstract class zzb<MessageType extends zzjb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhe<MessageType, BuilderType> {
        protected MessageType zza;
        protected boolean zzb = false;
        private final MessageType zzc;

        public zzb(MessageType messagetype) {
            this.zzc = messagetype;
            this.zza = (MessageType) messagetype.zza(zzg.zzd, null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.zzhe
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.zzc.zza(zzg.zze, null, null);
            zzbVar.zza((zzb) zze());
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.vision.zzhe
        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb) {
                zzb();
                this.zzb = false;
            }
            zza(this.zza, messagetype);
            return this;
        }

        public void zzb() {
            MessageType messagetype = (MessageType) this.zza.zza(zzg.zzd, null, null);
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.vision.zzkn
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public MessageType zze() {
            if (this.zzb) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            zzky.zza().zza((zzky) messagetype).zzc(messagetype);
            this.zzb = true;
            return this.zza;
        }

        @Override // com.google.android.gms.internal.vision.zzkn
        /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public final MessageType zzf() {
            MessageType messagetype = (MessageType) zze();
            if (messagetype.zzk()) {
                return messagetype;
            }
            throw new zzlv(messagetype);
        }

        @Override // com.google.android.gms.internal.vision.zzkm
        public final boolean zzk() {
            return zzjb.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.vision.zzkm
        public final /* synthetic */ zzkk zzr() {
            return this.zzc;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzky.zza().zza((zzky) messagetype).zzb(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzio zzioVar) throws zzjk {
            if (this.zzb) {
                zzb();
                this.zzb = false;
            }
            try {
                zzky.zza().zza((zzky) this.zza).zza(this.zza, bArr, 0, i2, new zzhn(zzioVar));
                return this;
            } catch (zzjk e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzjk.zza();
            }
        }

        @Override // com.google.android.gms.internal.vision.zzhe
        public final /* synthetic */ zzhe zza(byte[] bArr, int i, int i2, zzio zzioVar) throws zzjk {
            return zzb(bArr, 0, i2, zzioVar);
        }

        @Override // com.google.android.gms.internal.vision.zzhe
        /* renamed from: zza */
        public final /* synthetic */ zzhe clone() {
            return (zzb) clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.vision.zzhe
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public final BuilderType zza(zzif zzifVar, zzio zzioVar) throws IOException {
            if (this.zzb) {
                zzb();
                this.zzb = false;
            }
            try {
                zzky.zza().zza((zzky) this.zza).zza(this.zza, zzig.zza(zzifVar), zzioVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static <T extends zzjb<?, ?>> T zza(Class<T> cls) throws ClassNotFoundException {
        T t = (T) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((zzjb) zzma.zza(cls)).zza(zzg.zzf, (Object) null, (Object) null);
        if (t2 != null) {
            zzd.put(cls, t2);
            return t2;
        }
        throw new IllegalStateException();
    }

    public static <T extends zzjb<?, ?>> void zza(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    public static Object zza(zzkk zzkkVar, String str, Object[] objArr) {
        return new zzla(zzkkVar, str, objArr);
    }

    public static <ContainingType extends zzkk, Type> zze<ContainingType, Type> zza(ContainingType containingtype, zzkk zzkkVar, zzjh<?> zzjhVar, int i, zzml zzmlVar, boolean z, Class cls) {
        return new zze<>(containingtype, Collections.EMPTY_LIST, zzkkVar, new zzf(null, 202056002, zzmlVar, true, false), cls);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final <T extends zzjb<T, ?>> boolean zza(T t, boolean z) {
        byte bByteValue = ((Byte) t.zza(zzg.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzd = zzky.zza().zza((zzky) t).zzd(t);
        if (z) {
            t.zza(zzg.zzb, zZzd ? t : null, null);
        }
        return zZzd;
    }

    public static <E> zzjl<E> zza(zzjl<E> zzjlVar) {
        int size = zzjlVar.size();
        return zzjlVar.zza(size == 0 ? 10 : size << 1);
    }

    private static <T extends zzjb<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzio zzioVar) throws zzjk {
        T t2 = (T) t.zza(zzg.zzd, null, null);
        try {
            zzlc zzlcVarZza = zzky.zza().zza((zzky) t2);
            zzlcVarZza.zza(t2, bArr, 0, i2, new zzhn(zzioVar));
            zzlcVarZza.zzc(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzjk) {
                throw ((zzjk) e.getCause());
            }
            throw new zzjk(e.getMessage()).zza(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzjk.zza().zza(t2);
        }
    }

    private static <T extends zzjb<T, ?>> T zza(T t) throws zzjk {
        if (t == null || t.zzk()) {
            return t;
        }
        throw new zzjk(new zzlv(t).getMessage()).zza(t);
    }

    public static <T extends zzjb<T, ?>> T zza(T t, byte[] bArr) throws zzjk {
        return (T) zza(zza(t, bArr, 0, bArr.length, zzio.zzb()));
    }

    public static <T extends zzjb<T, ?>> T zza(T t, byte[] bArr, zzio zzioVar) throws zzjk {
        return (T) zza(zza(t, bArr, 0, bArr.length, zzioVar));
    }
}
