package au.com.woolworths.android.onesite.modules.customviews.statefulbutton;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButtonState;", "", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatefulButtonState {
    public static final StatefulButtonState d;
    public static final StatefulButtonState e;
    public static final StatefulButtonState f;
    public static final StatefulButtonState g;
    public static final /* synthetic */ StatefulButtonState[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        StatefulButtonState statefulButtonState = new StatefulButtonState("NORMAL", 0);
        d = statefulButtonState;
        StatefulButtonState statefulButtonState2 = new StatefulButtonState("LOADING", 1);
        e = statefulButtonState2;
        StatefulButtonState statefulButtonState3 = new StatefulButtonState("DISABLED", 2);
        f = statefulButtonState3;
        StatefulButtonState statefulButtonState4 = new StatefulButtonState("CHECKED", 3);
        g = statefulButtonState4;
        StatefulButtonState[] statefulButtonStateArr = {statefulButtonState, statefulButtonState2, statefulButtonState3, statefulButtonState4};
        h = statefulButtonStateArr;
        i = EnumEntriesKt.a(statefulButtonStateArr);
    }

    public static StatefulButtonState valueOf(String str) {
        return (StatefulButtonState) Enum.valueOf(StatefulButtonState.class, str);
    }

    public static StatefulButtonState[] values() {
        return (StatefulButtonState[]) h.clone();
    }
}
