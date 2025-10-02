package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zzhlp extends zzhlm implements Set, KMappedMarker {

    @NotNull
    private final Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhlp(@NotNull Set delegate) {
        super(delegate);
        Intrinsics.h(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // com.google.android.gms.internal.ads.zzhlm, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhlm, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator iterator() {
        return new zzhlo(this.zza.iterator());
    }
}
