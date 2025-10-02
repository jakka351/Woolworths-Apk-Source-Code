package au.com.woolworths.feature.product.list.legacy.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/compose/CoachMarkPopupDirection;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoachMarkPopupDirection {
    public static final /* synthetic */ CoachMarkPopupDirection[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        CoachMarkPopupDirection[] coachMarkPopupDirectionArr = {new CoachMarkPopupDirection("UP", 0), new CoachMarkPopupDirection("DOWN", 1)};
        d = coachMarkPopupDirectionArr;
        e = EnumEntriesKt.a(coachMarkPopupDirectionArr);
    }

    public static CoachMarkPopupDirection valueOf(String str) {
        return (CoachMarkPopupDirection) Enum.valueOf(CoachMarkPopupDirection.class, str);
    }

    public static CoachMarkPopupDirection[] values() {
        return (CoachMarkPopupDirection[]) d.clone();
    }
}
