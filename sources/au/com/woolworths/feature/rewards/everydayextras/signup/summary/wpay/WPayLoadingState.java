package au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/summary/wpay/WPayLoadingState;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WPayLoadingState {
    public static final WPayLoadingState d;
    public static final WPayLoadingState e;
    public static final WPayLoadingState f;
    public static final /* synthetic */ WPayLoadingState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        WPayLoadingState wPayLoadingState = new WPayLoadingState("NOT_REQUIRED", 0);
        d = wPayLoadingState;
        WPayLoadingState wPayLoadingState2 = new WPayLoadingState("INITIALISING", 1);
        e = wPayLoadingState2;
        WPayLoadingState wPayLoadingState3 = new WPayLoadingState("INITIALIZED", 2);
        f = wPayLoadingState3;
        WPayLoadingState[] wPayLoadingStateArr = {wPayLoadingState, wPayLoadingState2, wPayLoadingState3};
        g = wPayLoadingStateArr;
        h = EnumEntriesKt.a(wPayLoadingStateArr);
    }

    public static WPayLoadingState valueOf(String str) {
        return (WPayLoadingState) Enum.valueOf(WPayLoadingState.class, str);
    }

    public static WPayLoadingState[] values() {
        return (WPayLoadingState[]) g.clone();
    }
}
