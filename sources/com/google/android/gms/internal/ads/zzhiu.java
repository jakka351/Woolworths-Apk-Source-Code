package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* loaded from: classes5.dex */
public final class zzhiu {
    static final Charset zza;
    public static final byte[] zzb;
    public static final ByteBuffer zzc;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzc = ByteBuffer.wrap(bArr);
        zzhhg.zzG(bArr, 0, 0, false);
    }

    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int zzb(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzc(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
