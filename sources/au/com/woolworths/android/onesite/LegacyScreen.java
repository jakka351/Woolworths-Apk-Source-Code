package au.com.woolworths.android.onesite;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/LegacyScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class LegacyScreen implements Screen {
    public static final /* synthetic */ LegacyScreen[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        LegacyScreen[] legacyScreenArr = {new LegacyScreen() { // from class: au.com.woolworths.android.onesite.LegacyScreen.COLLECTION_MODE_SELECTOR
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Collection Mode";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Collection Mode screen";
            }
        }};
        d = legacyScreenArr;
        e = EnumEntriesKt.a(legacyScreenArr);
    }

    public static LegacyScreen valueOf(String str) {
        return (LegacyScreen) Enum.valueOf(LegacyScreen.class, str);
    }

    public static LegacyScreen[] values() {
        return (LegacyScreen[]) d.clone();
    }
}
