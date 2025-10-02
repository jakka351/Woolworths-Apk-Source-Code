package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemProviderKt {
    public static final int a(int i, LazyLayoutItemProvider lazyLayoutItemProvider, Object obj) {
        int iC;
        return (obj == null || lazyLayoutItemProvider.a() == 0 || (i < lazyLayoutItemProvider.a() && obj.equals(lazyLayoutItemProvider.f(i))) || (iC = lazyLayoutItemProvider.c(obj)) == -1) ? i : iC;
    }
}
