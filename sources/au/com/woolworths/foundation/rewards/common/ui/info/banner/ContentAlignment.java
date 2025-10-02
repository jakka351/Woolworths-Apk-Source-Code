package au.com.woolworths.foundation.rewards.common.ui.info.banner;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/info/banner/ContentAlignment;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentAlignment {
    public static final ContentAlignment d;
    public static final ContentAlignment e;
    public static final /* synthetic */ ContentAlignment[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ContentAlignment contentAlignment = new ContentAlignment("Vertical", 0);
        d = contentAlignment;
        ContentAlignment contentAlignment2 = new ContentAlignment("Horizontal", 1);
        e = contentAlignment2;
        ContentAlignment[] contentAlignmentArr = {contentAlignment, contentAlignment2};
        f = contentAlignmentArr;
        g = EnumEntriesKt.a(contentAlignmentArr);
    }

    public static ContentAlignment valueOf(String str) {
        return (ContentAlignment) Enum.valueOf(ContentAlignment.class, str);
    }

    public static ContentAlignment[] values() {
        return (ContentAlignment[]) f.clone();
    }
}
