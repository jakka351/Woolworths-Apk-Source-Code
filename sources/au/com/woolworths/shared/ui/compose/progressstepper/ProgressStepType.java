package au.com.woolworths.shared.ui.compose.progressstepper;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shared/ui/compose/progressstepper/ProgressStepType;", "", "shared-ui-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressStepType {
    public static final ProgressStepType d;
    public static final ProgressStepType e;
    public static final ProgressStepType f;
    public static final ProgressStepType g;
    public static final ProgressStepType h;
    public static final /* synthetic */ ProgressStepType[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        ProgressStepType progressStepType = new ProgressStepType("DONE", 0);
        d = progressStepType;
        ProgressStepType progressStepType2 = new ProgressStepType("LOAD", 1);
        e = progressStepType2;
        ProgressStepType progressStepType3 = new ProgressStepType("IN_PROGRESS", 2);
        f = progressStepType3;
        ProgressStepType progressStepType4 = new ProgressStepType("WARNING", 3);
        g = progressStepType4;
        ProgressStepType progressStepType5 = new ProgressStepType("EMPTY", 4);
        h = progressStepType5;
        ProgressStepType[] progressStepTypeArr = {progressStepType, progressStepType2, progressStepType3, progressStepType4, progressStepType5};
        i = progressStepTypeArr;
        j = EnumEntriesKt.a(progressStepTypeArr);
    }

    public static ProgressStepType valueOf(String str) {
        return (ProgressStepType) Enum.valueOf(ProgressStepType.class, str);
    }

    public static ProgressStepType[] values() {
        return (ProgressStepType[]) i.clone();
    }
}
