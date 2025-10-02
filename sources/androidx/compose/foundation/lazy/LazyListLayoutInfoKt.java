package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyListLayoutInfoKt {
    public static final int a(LazyListLayoutInfo lazyListLayoutInfo) {
        List listF = lazyListLayoutInfo.f();
        int size = listF.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            size2 += ((LazyListItemInfo) listF.get(i)).getSize();
        }
        return lazyListLayoutInfo.e() + (size2 / listF.size());
    }
}
