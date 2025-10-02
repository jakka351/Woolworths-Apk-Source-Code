package dev.chrisbanes.snapper;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class LazyListSnapperLayoutInfo$visibleItems$1 extends FunctionReferenceImpl implements Function1<LazyListItemInfo, LazyListSnapperLayoutItemInfo> {
    public static final LazyListSnapperLayoutInfo$visibleItems$1 d = new LazyListSnapperLayoutInfo$visibleItems$1(1, LazyListSnapperLayoutItemInfo.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LazyListItemInfo p0 = (LazyListItemInfo) obj;
        Intrinsics.h(p0, "p0");
        return new LazyListSnapperLayoutItemInfo(p0);
    }
}
