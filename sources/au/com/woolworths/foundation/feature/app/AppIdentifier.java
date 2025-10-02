package au.com.woolworths.foundation.feature.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/feature/app/AppIdentifier;", "", "feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppIdentifier {
    public static final AppIdentifier d;
    public static final AppIdentifier e;
    public static final /* synthetic */ AppIdentifier[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        AppIdentifier appIdentifier = new AppIdentifier("Shop", 0);
        d = appIdentifier;
        AppIdentifier appIdentifier2 = new AppIdentifier("Rewards", 1);
        e = appIdentifier2;
        AppIdentifier[] appIdentifierArr = {appIdentifier, appIdentifier2};
        f = appIdentifierArr;
        g = EnumEntriesKt.a(appIdentifierArr);
    }

    public static AppIdentifier valueOf(String str) {
        return (AppIdentifier) Enum.valueOf(AppIdentifier.class, str);
    }

    public static AppIdentifier[] values() {
        return (AppIdentifier[]) f.clone();
    }
}
