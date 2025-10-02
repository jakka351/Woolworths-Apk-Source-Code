package com.adobe.marketing.mobile.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SetExtensionsKt {
    public static final boolean a(Set set) {
        Intrinsics.h(set, "<this>");
        if (set.isEmpty()) {
            return false;
        }
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return true;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                return false;
            }
        }
        return true;
    }
}
