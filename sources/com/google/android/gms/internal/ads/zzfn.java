package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
final class zzfn implements Comparable {
    public long zzb = -9223372036854775807L;
    public final List zza = new ArrayList();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzfn) obj).zzb);
    }
}
