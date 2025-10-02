package com.google.android.gms.internal.fido;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* loaded from: classes5.dex */
public final class zzde {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzdd zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzdb zzdbVar = new zzdb(bArr, 0, 0, false, null);
        try {
            zzdbVar.zza(0);
            zzf = zzdbVar;
        } catch (zzdf e) {
            throw new IllegalArgumentException(e);
        }
    }
}
