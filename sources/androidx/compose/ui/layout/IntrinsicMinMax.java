package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMinMax;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IntrinsicMinMax {
    public static final IntrinsicMinMax d;
    public static final IntrinsicMinMax e;
    public static final /* synthetic */ IntrinsicMinMax[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        IntrinsicMinMax intrinsicMinMax = new IntrinsicMinMax("Min", 0);
        d = intrinsicMinMax;
        IntrinsicMinMax intrinsicMinMax2 = new IntrinsicMinMax("Max", 1);
        e = intrinsicMinMax2;
        IntrinsicMinMax[] intrinsicMinMaxArr = {intrinsicMinMax, intrinsicMinMax2};
        f = intrinsicMinMaxArr;
        g = EnumEntriesKt.a(intrinsicMinMaxArr);
    }

    public static IntrinsicMinMax valueOf(String str) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) f.clone();
    }
}
