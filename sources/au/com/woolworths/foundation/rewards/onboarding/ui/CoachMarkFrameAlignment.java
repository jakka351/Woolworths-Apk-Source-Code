package au.com.woolworths.foundation.rewards.onboarding.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/CoachMarkFrameAlignment;", "", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoachMarkFrameAlignment {
    public static final CoachMarkFrameAlignment d;
    public static final /* synthetic */ CoachMarkFrameAlignment[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        CoachMarkFrameAlignment coachMarkFrameAlignment = new CoachMarkFrameAlignment("Automatic", 0);
        d = coachMarkFrameAlignment;
        CoachMarkFrameAlignment[] coachMarkFrameAlignmentArr = {coachMarkFrameAlignment, new CoachMarkFrameAlignment("Top", 1), new CoachMarkFrameAlignment("Bottom", 2)};
        e = coachMarkFrameAlignmentArr;
        f = EnumEntriesKt.a(coachMarkFrameAlignmentArr);
    }

    public static CoachMarkFrameAlignment valueOf(String str) {
        return (CoachMarkFrameAlignment) Enum.valueOf(CoachMarkFrameAlignment.class, str);
    }

    public static CoachMarkFrameAlignment[] values() {
        return (CoachMarkFrameAlignment[]) e.clone();
    }
}
