package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SnackbarResult;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SnackbarResult {
    public static final SnackbarResult d;
    public static final SnackbarResult e;
    public static final /* synthetic */ SnackbarResult[] f;

    static {
        SnackbarResult snackbarResult = new SnackbarResult("Dismissed", 0);
        d = snackbarResult;
        SnackbarResult snackbarResult2 = new SnackbarResult("ActionPerformed", 1);
        e = snackbarResult2;
        f = new SnackbarResult[]{snackbarResult, snackbarResult2};
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) f.clone();
    }
}
