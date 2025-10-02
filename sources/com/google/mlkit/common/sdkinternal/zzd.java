package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.Cleaner;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes6.dex */
final class zzd extends PhantomReference implements Cleaner.Cleanable {
    public final Set d;
    public final zza e;

    public /* synthetic */ zzd(Cleaner cleaner, ReferenceQueue referenceQueue, Set set, zza zzaVar) {
        super(cleaner, referenceQueue);
        this.d = set;
        this.e = zzaVar;
    }
}
