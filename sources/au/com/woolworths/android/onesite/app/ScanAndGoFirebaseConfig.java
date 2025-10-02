package au.com.woolworths.android.onesite.app;

import au.com.woolworths.android.onesite.appdata.FirebaseConfigBuilder;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/app/ScanAndGoFirebaseConfig;", "", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScanAndGoFirebaseConfig {
    public static final ScanAndGoFirebaseConfig e;
    public static final ScanAndGoFirebaseConfig f;
    public static final ScanAndGoFirebaseConfig g;
    public static final ScanAndGoFirebaseConfig h;
    public static final ScanAndGoFirebaseConfig i;
    public static final /* synthetic */ ScanAndGoFirebaseConfig[] j;
    public static final /* synthetic */ EnumEntries k;
    public final FirebaseConfigBuilder d;

    static {
        ScanAndGoFirebaseConfig scanAndGoFirebaseConfig = new ScanAndGoFirebaseConfig("MOCK", 0, new FirebaseConfigBuilder("https://gcp-wow-food-wlx-sng-dev.firebaseio.com", "1053912948955", "QUl6YVN5Q0g4dEhldFNSYWtsUGN1c1NXQW55SEd2cU5lbzZnVlJz", "1:1053912948955:android:71acd5e2d24c133a696cfe", "gcp-wow-food-wlx-sng-dev.appspot.com", "gcp-wow-food-wlx-sng-dev"));
        e = scanAndGoFirebaseConfig;
        ScanAndGoFirebaseConfig scanAndGoFirebaseConfig2 = new ScanAndGoFirebaseConfig("DEV", 1, new FirebaseConfigBuilder("https://gcp-wow-food-wlx-sng-dev.firebaseio.com", "1053912948955", "QUl6YVN5Q0g4dEhldFNSYWtsUGN1c1NXQW55SEd2cU5lbzZnVlJz", "1:1053912948955:android:71acd5e2d24c133a696cfe", "gcp-wow-food-wlx-sng-dev.appspot.com", "gcp-wow-food-wlx-sng-dev"));
        f = scanAndGoFirebaseConfig2;
        ScanAndGoFirebaseConfig scanAndGoFirebaseConfig3 = new ScanAndGoFirebaseConfig("SIT", 2, new FirebaseConfigBuilder("https://gcp-wow-food-wlx-sng-test.firebaseio.com", "517047122446", "QUl6YVN5Q3JoOTRRRkdzQ3JkdGdleTNac2xMeHcxY29hbHFQRjlz", "1:517047122446:android:6475284958234d26dcda5f", "gcp-wow-food-wlx-sng-test.appspot.com", "gcp-wow-food-wlx-sng-test"));
        g = scanAndGoFirebaseConfig3;
        ScanAndGoFirebaseConfig scanAndGoFirebaseConfig4 = new ScanAndGoFirebaseConfig("UAT", 3, new FirebaseConfigBuilder("https://gcp-wow-food-wlx-sng-uat.firebaseio.com", "928685818405", "QUl6YVN5QzhZX1c5QlBodWVFVjhVY1dJR25LSVlrMXdSc3lVdnJB", "1:928685818405:android:1e97efd6981bf00584b5cc", "gcp-wow-food-wlx-sng-uat.appspot.com", "gcp-wow-food-wlx-sng-uat"));
        h = scanAndGoFirebaseConfig4;
        ScanAndGoFirebaseConfig scanAndGoFirebaseConfig5 = new ScanAndGoFirebaseConfig("PRODUCTION", 4, new FirebaseConfigBuilder("https://gcp-wow-food-wlx-sng-prod.firebaseio.com", "829219357372", "QUl6YVN5Q0VweXhtaVlfZnRYdjM4UzJqcEZzWEhWVDRUaHBubEtJ", "1:829219357372:android:f49dcf4b10f4207a8406b9", "gcp-wow-food-wlx-sng-uat.appspot.com", "gcp-wow-food-wlx-sng-prod"));
        i = scanAndGoFirebaseConfig5;
        ScanAndGoFirebaseConfig[] scanAndGoFirebaseConfigArr = {scanAndGoFirebaseConfig, scanAndGoFirebaseConfig2, scanAndGoFirebaseConfig3, scanAndGoFirebaseConfig4, scanAndGoFirebaseConfig5};
        j = scanAndGoFirebaseConfigArr;
        k = EnumEntriesKt.a(scanAndGoFirebaseConfigArr);
    }

    public ScanAndGoFirebaseConfig(String str, int i2, FirebaseConfigBuilder firebaseConfigBuilder) {
        this.d = firebaseConfigBuilder;
    }

    public static ScanAndGoFirebaseConfig valueOf(String str) {
        return (ScanAndGoFirebaseConfig) Enum.valueOf(ScanAndGoFirebaseConfig.class, str);
    }

    public static ScanAndGoFirebaseConfig[] values() {
        return (ScanAndGoFirebaseConfig[]) j.clone();
    }
}
