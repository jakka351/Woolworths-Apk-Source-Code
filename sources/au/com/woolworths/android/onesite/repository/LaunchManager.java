package au.com.woolworths.android.onesite.repository;

/* loaded from: classes3.dex */
public interface LaunchManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LaunchState {
        public static final LaunchState d;
        public static final LaunchState e;
        public static final LaunchState f;
        public static final LaunchState g;
        public static final LaunchState h;
        public static final /* synthetic */ LaunchState[] i;

        static {
            LaunchState launchState = new LaunchState("UNKNOWN", 0);
            d = launchState;
            LaunchState launchState2 = new LaunchState("FULL_USER_LOGGED_IN", 1);
            e = launchState2;
            LaunchState launchState3 = new LaunchState("REWARDS_ADDED", 2);
            f = launchState3;
            LaunchState launchState4 = new LaunchState("MODE_SELECTED", 3);
            g = launchState4;
            LaunchState launchState5 = new LaunchState("COMPLETE", 4);
            h = launchState5;
            i = new LaunchState[]{launchState, launchState2, launchState3, launchState4, launchState5};
        }

        public static LaunchState valueOf(String str) {
            return (LaunchState) Enum.valueOf(LaunchState.class, str);
        }

        public static LaunchState[] values() {
            return (LaunchState[]) i.clone();
        }
    }

    void a(LaunchState launchState);

    boolean b();

    void c();

    LaunchState d();
}
