package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzhlc {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhlb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhlc.<clinit>():void");
    }

    private zzhlc() {
    }

    public static /* synthetic */ void zzB(Throwable th) {
        Logger.getLogger(zzhlc.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i = zzhgo.zza;
        Field fieldZzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (fieldZzF != null) {
            return fieldZzF;
        }
        Field fieldZzF2 = zzF(Buffer.class, "address");
        if (fieldZzF2 == null || fieldZzF2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzF2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j, byte b) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j, byte b) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static boolean zza() {
        return zzh;
    }

    public static boolean zzb() {
        return zzg;
    }

    public static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int zzd(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    public static void zze(Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    public static long zzf(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    public static void zzg(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    public static boolean zzh(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    public static void zzi(Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    public static float zzj(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    public static void zzk(Object obj, long j, float f) {
        zzf.zze(obj, j, f);
    }

    public static double zzl(Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    public static void zzm(Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    public static Object zzn(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    public static void zzo(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    public static void zzp(byte[] bArr, long j, byte b) {
        zzf.zza(bArr, zza + j, b);
    }

    public static void zzq(long j, byte[] bArr, long j2, long j3) {
        zzf.zzi(j, bArr, j2, j3);
    }

    public static byte zzr(long j) {
        return zzf.zzh(j);
    }

    public static long zzs(ByteBuffer byteBuffer) {
        zzhlb zzhlbVar = zzf;
        return zzhlbVar.zza.getLong(byteBuffer, zzi);
    }

    public static Unsafe zzt() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhky());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzu(Class cls) {
        int i = zzhgo.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean zzx(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzy(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
