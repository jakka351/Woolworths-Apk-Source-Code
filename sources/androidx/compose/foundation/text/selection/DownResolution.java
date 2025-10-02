package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/DownResolution;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DownResolution {
    public static final DownResolution d;
    public static final DownResolution e;
    public static final DownResolution f;
    public static final DownResolution g;
    public static final /* synthetic */ DownResolution[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        DownResolution downResolution = new DownResolution("Up", 0);
        d = downResolution;
        DownResolution downResolution2 = new DownResolution("Drag", 1);
        e = downResolution2;
        DownResolution downResolution3 = new DownResolution("Timeout", 2);
        f = downResolution3;
        DownResolution downResolution4 = new DownResolution("Cancel", 3);
        g = downResolution4;
        DownResolution[] downResolutionArr = {downResolution, downResolution2, downResolution3, downResolution4};
        h = downResolutionArr;
        i = EnumEntriesKt.a(downResolutionArr);
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) h.clone();
    }
}
