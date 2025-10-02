package com.google.android.gms.internal.ads;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes5.dex */
public final class zzaqr {
    public static long zza(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + llqqqql.a00610061aaaa : j;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static int zzc(byte b) {
        return b < 0 ? b + HPKE.mode_base : b;
    }

    public static long zzd(ByteBuffer byteBuffer) {
        long jZza = zza(byteBuffer) << 32;
        if (jZza >= 0) {
            return zza(byteBuffer) + jZza;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double zze(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static double zzf(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }
}
