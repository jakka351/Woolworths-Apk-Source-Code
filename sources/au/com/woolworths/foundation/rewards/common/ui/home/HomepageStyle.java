package au.com.woolworths.foundation.rewards.common.ui.home;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/home/HomepageStyle;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomepageStyle {
    public static final HomepageStyle d;
    public static final HomepageStyle e;
    public static final /* synthetic */ HomepageStyle[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        HomepageStyle homepageStyle = new HomepageStyle("Traditional2023", 0);
        d = homepageStyle;
        HomepageStyle homepageStyle2 = new HomepageStyle("Modern2024", 1);
        e = homepageStyle2;
        HomepageStyle[] homepageStyleArr = {homepageStyle, homepageStyle2};
        f = homepageStyleArr;
        g = EnumEntriesKt.a(homepageStyleArr);
    }

    public static HomepageStyle valueOf(String str) {
        return (HomepageStyle) Enum.valueOf(HomepageStyle.class, str);
    }

    public static HomepageStyle[] values() {
        return (HomepageStyle[]) f.clone();
    }
}
