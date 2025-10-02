package au.com.woolworths.design.core.ui.component.experimental.coachmark;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupDirection;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoachMarkPopupDirection {
    public static final CoachMarkPopupDirection d;
    public static final CoachMarkPopupDirection e;
    public static final /* synthetic */ CoachMarkPopupDirection[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        CoachMarkPopupDirection coachMarkPopupDirection = new CoachMarkPopupDirection("UP", 0);
        d = coachMarkPopupDirection;
        CoachMarkPopupDirection coachMarkPopupDirection2 = new CoachMarkPopupDirection("DOWN", 1);
        e = coachMarkPopupDirection2;
        CoachMarkPopupDirection[] coachMarkPopupDirectionArr = {coachMarkPopupDirection, coachMarkPopupDirection2};
        f = coachMarkPopupDirectionArr;
        g = EnumEntriesKt.a(coachMarkPopupDirectionArr);
    }

    public static CoachMarkPopupDirection valueOf(String str) {
        return (CoachMarkPopupDirection) Enum.valueOf(CoachMarkPopupDirection.class, str);
    }

    public static CoachMarkPopupDirection[] values() {
        return (CoachMarkPopupDirection[]) f.clone();
    }
}
