package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/ui/toolbar/collapsingtoolbar/BackgroundOverlayPosition;", "", "toolbar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundOverlayPosition {
    public static final BackgroundOverlayPosition d;
    public static final /* synthetic */ BackgroundOverlayPosition[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        BackgroundOverlayPosition backgroundOverlayPosition = new BackgroundOverlayPosition("AboveContent", 0);
        d = backgroundOverlayPosition;
        BackgroundOverlayPosition[] backgroundOverlayPositionArr = {backgroundOverlayPosition, new BackgroundOverlayPosition("BelowContent", 1)};
        e = backgroundOverlayPositionArr;
        f = EnumEntriesKt.a(backgroundOverlayPositionArr);
    }

    public static BackgroundOverlayPosition valueOf(String str) {
        return (BackgroundOverlayPosition) Enum.valueOf(BackgroundOverlayPosition.class, str);
    }

    public static BackgroundOverlayPosition[] values() {
        return (BackgroundOverlayPosition[]) e.clone();
    }
}
