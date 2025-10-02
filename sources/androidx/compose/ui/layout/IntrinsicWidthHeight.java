package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IntrinsicWidthHeight {
    public static final IntrinsicWidthHeight d;
    public static final IntrinsicWidthHeight e;
    public static final /* synthetic */ IntrinsicWidthHeight[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        IntrinsicWidthHeight intrinsicWidthHeight = new IntrinsicWidthHeight("Width", 0);
        d = intrinsicWidthHeight;
        IntrinsicWidthHeight intrinsicWidthHeight2 = new IntrinsicWidthHeight("Height", 1);
        e = intrinsicWidthHeight2;
        IntrinsicWidthHeight[] intrinsicWidthHeightArr = {intrinsicWidthHeight, intrinsicWidthHeight2};
        f = intrinsicWidthHeightArr;
        g = EnumEntriesKt.a(intrinsicWidthHeightArr);
    }

    public static IntrinsicWidthHeight valueOf(String str) {
        return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
    }

    public static IntrinsicWidthHeight[] values() {
        return (IntrinsicWidthHeight[]) f.clone();
    }
}
