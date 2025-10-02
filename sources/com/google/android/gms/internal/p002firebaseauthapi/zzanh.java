package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzanh extends zzanm {
    private final /* synthetic */ zzang zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzani(this.zza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzanh(zzang zzangVar) {
        super(zzangVar);
        Objects.requireNonNull(zzangVar);
        this.zza = zzangVar;
    }
}
