package androidx.constraintlayout.compose;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/LayoutInfoFlags;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LayoutInfoFlags {
    public static final LayoutInfoFlags d;
    public static final /* synthetic */ LayoutInfoFlags[] e;

    /* JADX INFO: Fake field, exist only in values array */
    LayoutInfoFlags EF0;

    static {
        LayoutInfoFlags layoutInfoFlags = new LayoutInfoFlags("NONE", 0);
        LayoutInfoFlags layoutInfoFlags2 = new LayoutInfoFlags("BOUNDS", 1);
        d = layoutInfoFlags2;
        e = new LayoutInfoFlags[]{layoutInfoFlags, layoutInfoFlags2};
    }

    public static LayoutInfoFlags valueOf(String str) {
        return (LayoutInfoFlags) Enum.valueOf(LayoutInfoFlags.class, str);
    }

    public static LayoutInfoFlags[] values() {
        return (LayoutInfoFlags[]) e.clone();
    }
}
