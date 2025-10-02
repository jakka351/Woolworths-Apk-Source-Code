package au.com.woolworths.android.onesite.modules.checkout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/CheckOutContract;", "", "LoadingState", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CheckOutContract {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/CheckOutContract$LoadingState;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadingState {
        public static final LoadingState d;
        public static final LoadingState e;
        public static final /* synthetic */ LoadingState[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            LoadingState loadingState = new LoadingState("FULL_PAGE", 0);
            d = loadingState;
            LoadingState loadingState2 = new LoadingState("INLINE", 1);
            LoadingState loadingState3 = new LoadingState("NONE", 2);
            e = loadingState3;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3};
            f = loadingStateArr;
            g = EnumEntriesKt.a(loadingStateArr);
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) f.clone();
        }
    }
}
