package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class zzo extends zzl implements Serializable {
    private final Pattern zza;

    public zzo(Pattern pattern) {
        this.zza = (Pattern) zzu.zza(pattern);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzl
    public final zzm zza(CharSequence charSequence) {
        return new zzn(this.zza.matcher(charSequence));
    }
}
