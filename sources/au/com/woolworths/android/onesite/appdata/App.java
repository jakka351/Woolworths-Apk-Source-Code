package au.com.woolworths.android.onesite.appdata;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/App;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class App {
    public static final /* synthetic */ App[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        App[] appArr = {new App("ALL", 0), new App("WOW", 1), new App("REWARDS", 2)};
        d = appArr;
        e = EnumEntriesKt.a(appArr);
    }

    public static App valueOf(String str) {
        return (App) Enum.valueOf(App.class, str);
    }

    public static App[] values() {
        return (App[]) d.clone();
    }
}
