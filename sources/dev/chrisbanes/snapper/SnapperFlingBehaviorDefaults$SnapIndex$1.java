package dev.chrisbanes.snapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "<anonymous parameter 1>", "targetIndex", "invoke", "(Ldev/chrisbanes/snapper/SnapperLayoutInfo;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SnapperFlingBehaviorDefaults$SnapIndex$1 extends Lambda implements Function3<SnapperLayoutInfo, Integer, Integer, Integer> {
    public static final SnapperFlingBehaviorDefaults$SnapIndex$1 h = new SnapperFlingBehaviorDefaults$SnapIndex$1(3);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h((SnapperLayoutInfo) obj, "<anonymous parameter 0>");
        return Integer.valueOf(iIntValue);
    }
}
