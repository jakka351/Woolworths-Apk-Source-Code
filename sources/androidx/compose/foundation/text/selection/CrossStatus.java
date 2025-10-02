package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/CrossStatus;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CrossStatus {
    public static final CrossStatus d;
    public static final CrossStatus e;
    public static final CrossStatus f;
    public static final /* synthetic */ CrossStatus[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        CrossStatus crossStatus = new CrossStatus("CROSSED", 0);
        d = crossStatus;
        CrossStatus crossStatus2 = new CrossStatus("NOT_CROSSED", 1);
        e = crossStatus2;
        CrossStatus crossStatus3 = new CrossStatus("COLLAPSED", 2);
        f = crossStatus3;
        CrossStatus[] crossStatusArr = {crossStatus, crossStatus2, crossStatus3};
        g = crossStatusArr;
        h = EnumEntriesKt.a(crossStatusArr);
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) g.clone();
    }
}
