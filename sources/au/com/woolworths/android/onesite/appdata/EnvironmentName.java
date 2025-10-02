package au.com.woolworths.android.onesite.appdata;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/EnvironmentName;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnvironmentName {
    public static final EnvironmentName d;
    public static final EnvironmentName e;
    public static final EnvironmentName f;
    public static final EnvironmentName g;
    public static final EnvironmentName h;
    public static final /* synthetic */ EnvironmentName[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        EnvironmentName environmentName = new EnvironmentName("MOCK", 0);
        d = environmentName;
        EnvironmentName environmentName2 = new EnvironmentName("TEST", 1);
        e = environmentName2;
        EnvironmentName environmentName3 = new EnvironmentName("DEV", 2);
        f = environmentName3;
        EnvironmentName environmentName4 = new EnvironmentName("UAT", 3);
        g = environmentName4;
        EnvironmentName environmentName5 = new EnvironmentName("PRODUCTION", 4);
        h = environmentName5;
        EnvironmentName[] environmentNameArr = {environmentName, environmentName2, environmentName3, environmentName4, environmentName5};
        i = environmentNameArr;
        j = EnumEntriesKt.a(environmentNameArr);
    }

    public static EnvironmentName valueOf(String str) {
        return (EnvironmentName) Enum.valueOf(EnvironmentName.class, str);
    }

    public static EnvironmentName[] values() {
        return (EnvironmentName[]) i.clone();
    }
}
