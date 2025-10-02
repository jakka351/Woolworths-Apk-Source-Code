package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzsj implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public zzsj(zzsm zzsmVar) {
        Objects.requireNonNull(zzsmVar);
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        return bundle;
    }
}
