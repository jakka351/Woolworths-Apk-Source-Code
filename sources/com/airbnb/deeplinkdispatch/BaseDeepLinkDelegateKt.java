package com.airbnb.deeplinkdispatch;

import com.airbnb.deeplinkdispatch.base.MatchIndex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"deeplinkdispatch_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BaseDeepLinkDelegateKt {
    public static final ArrayList a(List list) {
        Intrinsics.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MatchIndex matchIndex = ((BaseRegistry) it.next()).b;
            CollectionsKt.h(matchIndex.b(0, matchIndex.f13300a.length), arrayList);
        }
        return arrayList;
    }
}
