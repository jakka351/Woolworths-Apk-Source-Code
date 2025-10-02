package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zzhlr extends zzhlm implements Set, KMappedMarker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhlr(@NotNull Collection delegate) {
        super(delegate);
        Intrinsics.h(delegate, "delegate");
    }
}
