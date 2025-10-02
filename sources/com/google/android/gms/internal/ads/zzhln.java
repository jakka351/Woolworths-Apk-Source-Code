package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zzhln implements Iterator, KMappedMarker {
    private final /* synthetic */ Iterator zza;

    public zzhln(@NotNull Iterator delegate) {
        Intrinsics.h(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
