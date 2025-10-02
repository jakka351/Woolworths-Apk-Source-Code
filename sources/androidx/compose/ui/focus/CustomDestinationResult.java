package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CustomDestinationResult {
    public static final CustomDestinationResult d;
    public static final CustomDestinationResult e;
    public static final CustomDestinationResult f;
    public static final /* synthetic */ CustomDestinationResult[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        CustomDestinationResult customDestinationResult = new CustomDestinationResult("None", 0);
        d = customDestinationResult;
        CustomDestinationResult customDestinationResult2 = new CustomDestinationResult("Cancelled", 1);
        e = customDestinationResult2;
        CustomDestinationResult customDestinationResult3 = new CustomDestinationResult("Redirected", 2);
        f = customDestinationResult3;
        CustomDestinationResult[] customDestinationResultArr = {customDestinationResult, customDestinationResult2, customDestinationResult3, new CustomDestinationResult("RedirectCancelled", 3)};
        g = customDestinationResultArr;
        h = EnumEntriesKt.a(customDestinationResultArr);
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) g.clone();
    }
}
