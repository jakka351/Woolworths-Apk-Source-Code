package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrySelectDetailedResult {
    public static final TrySelectDetailedResult d;
    public static final TrySelectDetailedResult e;
    public static final TrySelectDetailedResult f;
    public static final TrySelectDetailedResult g;
    public static final /* synthetic */ TrySelectDetailedResult[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        TrySelectDetailedResult trySelectDetailedResult = new TrySelectDetailedResult("SUCCESSFUL", 0);
        d = trySelectDetailedResult;
        TrySelectDetailedResult trySelectDetailedResult2 = new TrySelectDetailedResult("REREGISTER", 1);
        e = trySelectDetailedResult2;
        TrySelectDetailedResult trySelectDetailedResult3 = new TrySelectDetailedResult("CANCELLED", 2);
        f = trySelectDetailedResult3;
        TrySelectDetailedResult trySelectDetailedResult4 = new TrySelectDetailedResult("ALREADY_SELECTED", 3);
        g = trySelectDetailedResult4;
        TrySelectDetailedResult[] trySelectDetailedResultArr = {trySelectDetailedResult, trySelectDetailedResult2, trySelectDetailedResult3, trySelectDetailedResult4};
        h = trySelectDetailedResultArr;
        i = EnumEntriesKt.a(trySelectDetailedResultArr);
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) h.clone();
    }
}
