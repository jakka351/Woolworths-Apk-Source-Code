package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/MutatePriority;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MutatePriority {
    public static final MutatePriority d;
    public static final MutatePriority e;
    public static final MutatePriority f;
    public static final /* synthetic */ MutatePriority[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        d = mutatePriority;
        MutatePriority mutatePriority2 = new MutatePriority("UserInput", 1);
        e = mutatePriority2;
        MutatePriority mutatePriority3 = new MutatePriority("PreventUserInput", 2);
        f = mutatePriority3;
        MutatePriority[] mutatePriorityArr = {mutatePriority, mutatePriority2, mutatePriority3};
        g = mutatePriorityArr;
        h = EnumEntriesKt.a(mutatePriorityArr);
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) g.clone();
    }
}
