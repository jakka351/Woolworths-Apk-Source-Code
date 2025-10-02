package androidx.paging;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/DiffingChangePayload;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class DiffingChangePayload {
    public static final DiffingChangePayload d;
    public static final DiffingChangePayload e;
    public static final DiffingChangePayload f;
    public static final /* synthetic */ DiffingChangePayload[] g;

    static {
        DiffingChangePayload diffingChangePayload = new DiffingChangePayload("ITEM_TO_PLACEHOLDER", 0);
        d = diffingChangePayload;
        DiffingChangePayload diffingChangePayload2 = new DiffingChangePayload("PLACEHOLDER_TO_ITEM", 1);
        e = diffingChangePayload2;
        DiffingChangePayload diffingChangePayload3 = new DiffingChangePayload("PLACEHOLDER_POSITION_CHANGE", 2);
        f = diffingChangePayload3;
        g = new DiffingChangePayload[]{diffingChangePayload, diffingChangePayload2, diffingChangePayload3};
    }

    public static DiffingChangePayload valueOf(String str) {
        return (DiffingChangePayload) Enum.valueOf(DiffingChangePayload.class, str);
    }

    public static DiffingChangePayload[] values() {
        return (DiffingChangePayload[]) g.clone();
    }
}
