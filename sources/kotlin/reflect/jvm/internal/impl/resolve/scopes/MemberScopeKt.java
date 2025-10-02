package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MemberScopeKt {
    public static final HashSet a(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setD = ((MemberScope) it.next()).d();
            if (setD == null) {
                return null;
            }
            CollectionsKt.h(setD, hashSet);
        }
        return hashSet;
    }
}
