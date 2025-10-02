package kotlin.reflect.jvm.internal.impl.util.collectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ScopeUtilsKt {
    public static final Collection a(Collection collection, Collection collection2) {
        Intrinsics.h(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final SmartList b(ArrayList arrayList) {
        SmartList smartList = new SmartList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            MemberScope memberScope = (MemberScope) next;
            if (memberScope != null && memberScope != MemberScope.Empty.b) {
                smartList.add(next);
            }
        }
        return smartList;
    }
}
