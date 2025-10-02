package au.com.woolworths.android.onesite.navigation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/ApplicationType;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApplicationType {
    public static final ApplicationType d;
    public static final ApplicationType e;
    public static final /* synthetic */ ApplicationType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ApplicationType applicationType = new ApplicationType("RewardsApplication", 0);
        d = applicationType;
        ApplicationType applicationType2 = new ApplicationType("WowShopApplication", 1);
        e = applicationType2;
        ApplicationType[] applicationTypeArr = {applicationType, applicationType2};
        f = applicationTypeArr;
        g = EnumEntriesKt.a(applicationTypeArr);
    }

    public static ApplicationType valueOf(String str) {
        return (ApplicationType) Enum.valueOf(ApplicationType.class, str);
    }

    public static ApplicationType[] values() {
        return (ApplicationType[]) f.clone();
    }
}
