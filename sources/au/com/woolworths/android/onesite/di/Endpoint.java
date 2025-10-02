package au.com.woolworths.android.onesite.di;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/di/Endpoint;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Endpoint {
    public static final /* synthetic */ Endpoint[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        Endpoint[] endpointArr = {new Endpoint("WOOLWORTHS", 0), new Endpoint("REWARDS", 1), new Endpoint("CATALOGUE", 2), new Endpoint("FRESHMAG", 3), new Endpoint("LIVE_API", 4), new Endpoint("AEM_CONTENT", 5), new Endpoint("PAYMENT", 6), new Endpoint("APIGEE_X", 7)};
        d = endpointArr;
        e = EnumEntriesKt.a(endpointArr);
    }

    public static Endpoint valueOf(String str) {
        return (Endpoint) Enum.valueOf(Endpoint.class, str);
    }

    public static Endpoint[] values() {
        return (Endpoint[]) d.clone();
    }
}
