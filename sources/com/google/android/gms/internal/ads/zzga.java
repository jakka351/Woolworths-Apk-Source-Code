package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public interface zzga extends zzi {
    long zzb(zzge zzgeVar) throws IOException;

    @Nullable
    Uri zzc();

    void zzd() throws IOException;

    void zze(zzgy zzgyVar);

    default Map zzj() {
        return Collections.EMPTY_MAP;
    }
}
