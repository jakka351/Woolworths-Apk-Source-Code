package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/ui/Screen;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Screen {
    public static final Screen d;
    public static final Screen e;
    public static final /* synthetic */ Screen[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        Screen screen = new Screen("CHOOSE_PLAN", 0);
        d = screen;
        Screen screen2 = new Screen("SUMMARY", 1);
        e = screen2;
        Screen[] screenArr = {screen, screen2};
        f = screenArr;
        g = EnumEntriesKt.a(screenArr);
    }

    public static Screen valueOf(String str) {
        return (Screen) Enum.valueOf(Screen.class, str);
    }

    public static Screen[] values() {
        return (Screen[]) f.clone();
    }
}
