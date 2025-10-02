package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyGridSnapLayoutInfoProviderKt {
    public static final int a(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        return (int) (orientation == Orientation.d ? lazyGridItemInfo.c() & 4294967295L : lazyGridItemInfo.c() >> 32);
    }
}
