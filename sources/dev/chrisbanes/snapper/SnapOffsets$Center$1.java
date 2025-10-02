package dev.chrisbanes.snapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "layout", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "item", "Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "invoke", "(Ldev/chrisbanes/snapper/SnapperLayoutInfo;Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SnapOffsets$Center$1 extends Lambda implements Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> {
    public static final SnapOffsets$Center$1 h = new SnapOffsets$Center$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SnapperLayoutInfo layout = (SnapperLayoutInfo) obj;
        SnapperLayoutItemInfo item = (SnapperLayoutItemInfo) obj2;
        Intrinsics.h(layout, "layout");
        Intrinsics.h(item, "item");
        return Integer.valueOf((layout.a() - item.c()) / 2);
    }
}
