package com.airbnb.epoxy.preload;

import com.airbnb.epoxy.preload.PreloadRequestHolder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/epoxy/preload/PreloadTargetProvider;", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PreloadTargetProvider<P extends PreloadRequestHolder> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f13335a;

    public PreloadTargetProvider() {
        Intrinsics.h(null, "requestHolderFactory");
        IntRange intRangeO = RangesKt.o(0, 0);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
        IntProgressionIterator it = intRangeO.iterator();
        if (it.f) {
            it.nextInt();
            throw null;
        }
        this.f13335a = new ArrayDeque(arrayList);
    }
}
