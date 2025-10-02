package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/ResolvedTextDirection;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResolvedTextDirection {
    public static final ResolvedTextDirection d;
    public static final ResolvedTextDirection e;
    public static final /* synthetic */ ResolvedTextDirection[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ResolvedTextDirection resolvedTextDirection = new ResolvedTextDirection("Ltr", 0);
        d = resolvedTextDirection;
        ResolvedTextDirection resolvedTextDirection2 = new ResolvedTextDirection("Rtl", 1);
        e = resolvedTextDirection2;
        ResolvedTextDirection[] resolvedTextDirectionArr = {resolvedTextDirection, resolvedTextDirection2};
        f = resolvedTextDirectionArr;
        g = EnumEntriesKt.a(resolvedTextDirectionArr);
    }

    public static ResolvedTextDirection valueOf(String str) {
        return (ResolvedTextDirection) Enum.valueOf(ResolvedTextDirection.class, str);
    }

    public static ResolvedTextDirection[] values() {
        return (ResolvedTextDirection[]) f.clone();
    }
}
