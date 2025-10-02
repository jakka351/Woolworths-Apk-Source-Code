package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzaig implements zzadz {
    public static final zzaig zza = new zzaig(true);
    public static final zzaig zzb = new zzaig(false);
    public final boolean zzc;

    private zzaig(boolean z) {
        this.zzc = z;
    }

    public final String toString() {
        boolean z = !this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
