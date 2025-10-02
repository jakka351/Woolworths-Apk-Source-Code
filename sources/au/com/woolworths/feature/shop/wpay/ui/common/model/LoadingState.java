package au.com.woolworths.feature.shop.wpay.ui.common.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/common/model/LoadingState;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoadingState {
    public static final LoadingState d;
    public static final LoadingState e;
    public static final LoadingState f;
    public static final /* synthetic */ LoadingState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        LoadingState loadingState = new LoadingState("NONE", 0);
        d = loadingState;
        LoadingState loadingState2 = new LoadingState("CIRCULAR", 1);
        e = loadingState2;
        LoadingState loadingState3 = new LoadingState("WAPPLE", 2);
        f = loadingState3;
        LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3};
        g = loadingStateArr;
        h = EnumEntriesKt.a(loadingStateArr);
    }

    public static LoadingState valueOf(String str) {
        return (LoadingState) Enum.valueOf(LoadingState.class, str);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) g.clone();
    }
}
