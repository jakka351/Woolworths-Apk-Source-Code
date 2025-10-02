package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/SnackbarDuration;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SnackbarDuration {
    public static final SnackbarDuration d;
    public static final SnackbarDuration e;
    public static final SnackbarDuration f;
    public static final /* synthetic */ SnackbarDuration[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        SnackbarDuration snackbarDuration = new SnackbarDuration("Short", 0);
        d = snackbarDuration;
        SnackbarDuration snackbarDuration2 = new SnackbarDuration("Long", 1);
        e = snackbarDuration2;
        SnackbarDuration snackbarDuration3 = new SnackbarDuration("Indefinite", 2);
        f = snackbarDuration3;
        SnackbarDuration[] snackbarDurationArr = {snackbarDuration, snackbarDuration2, snackbarDuration3};
        g = snackbarDurationArr;
        h = EnumEntriesKt.a(snackbarDurationArr);
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) g.clone();
    }
}
