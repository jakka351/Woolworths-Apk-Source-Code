package au.com.woolworths.foundation.rewards.onboarding;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"onboarding_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CoachMarkBannerKt {
    public static final ProgressiveCoachMarkContent a(CoachMarkBanner coachMarkBanner) {
        Intrinsics.h(coachMarkBanner, "<this>");
        String str = coachMarkBanner.j;
        List list = coachMarkBanner.g;
        Object obj = null;
        if (coachMarkBanner.h) {
            return null;
        }
        if (str.length() == 0) {
            return (ProgressiveCoachMarkContent) CollectionsKt.F(list);
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.c(((ProgressiveCoachMarkContent) next).b, str)) {
                obj = next;
                break;
            }
        }
        ProgressiveCoachMarkContent progressiveCoachMarkContent = (ProgressiveCoachMarkContent) obj;
        return progressiveCoachMarkContent == null ? (ProgressiveCoachMarkContent) CollectionsKt.F(list) : progressiveCoachMarkContent;
    }

    public static final int b(CoachMarkBanner coachMarkBanner) {
        Intrinsics.h(coachMarkBanner, "<this>");
        Iterator it = coachMarkBanner.g.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.c(((ProgressiveCoachMarkContent) it.next()).b, coachMarkBanner.j)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
