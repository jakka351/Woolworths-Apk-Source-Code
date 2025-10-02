package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSize;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IntrinsicSize {
    public static final IntrinsicSize d;
    public static final IntrinsicSize e;
    public static final /* synthetic */ IntrinsicSize[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        IntrinsicSize intrinsicSize = new IntrinsicSize("Min", 0);
        d = intrinsicSize;
        IntrinsicSize intrinsicSize2 = new IntrinsicSize("Max", 1);
        e = intrinsicSize2;
        IntrinsicSize[] intrinsicSizeArr = {intrinsicSize, intrinsicSize2};
        f = intrinsicSizeArr;
        g = EnumEntriesKt.a(intrinsicSizeArr);
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) f.clone();
    }
}
