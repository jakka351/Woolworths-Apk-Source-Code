package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzdv {
    public static void zza(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(YU.a.n(new StringBuilder(String.valueOf(i).length() + 4), "csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void zzb(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
