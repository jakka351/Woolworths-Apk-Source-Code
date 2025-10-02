package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public final class zzanv extends RuntimeException {
    public zzanv(zzamm zzammVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzall zza() {
        return new zzall(getMessage());
    }
}
