package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzhy {

    @NotNull
    private List zza = EmptyList.d;

    public final long zza(@NotNull long[] jArr) {
        Iterator it = CollectionsKt.c0(ArraysKt.k0(jArr), this.zza).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(@NotNull long[] jArr) {
        this.zza = ArraysKt.k0(jArr);
    }
}
