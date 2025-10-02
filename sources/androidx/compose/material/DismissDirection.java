package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DismissDirection;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DismissDirection {
    public static final DismissDirection d;
    public static final DismissDirection e;
    public static final /* synthetic */ DismissDirection[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        DismissDirection dismissDirection = new DismissDirection("StartToEnd", 0);
        d = dismissDirection;
        DismissDirection dismissDirection2 = new DismissDirection("EndToStart", 1);
        e = dismissDirection2;
        DismissDirection[] dismissDirectionArr = {dismissDirection, dismissDirection2};
        f = dismissDirectionArr;
        g = EnumEntriesKt.a(dismissDirectionArr);
    }

    public static DismissDirection valueOf(String str) {
        return (DismissDirection) Enum.valueOf(DismissDirection.class, str);
    }

    public static DismissDirection[] values() {
        return (DismissDirection[]) f.clone();
    }
}
