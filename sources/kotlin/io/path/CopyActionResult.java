package kotlin.io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/path/CopyActionResult;", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalPathApi
/* loaded from: classes7.dex */
public final class CopyActionResult {
    public static final /* synthetic */ CopyActionResult[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        CopyActionResult[] copyActionResultArr = {new CopyActionResult("CONTINUE", 0), new CopyActionResult("SKIP_SUBTREE", 1), new CopyActionResult("TERMINATE", 2)};
        d = copyActionResultArr;
        e = EnumEntriesKt.a(copyActionResultArr);
    }

    public static CopyActionResult valueOf(String str) {
        return (CopyActionResult) Enum.valueOf(CopyActionResult.class, str);
    }

    public static CopyActionResult[] values() {
        return (CopyActionResult[]) d.clone();
    }
}
