package androidx.paging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/CombineSource;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CombineSource {
    public static final CombineSource d;
    public static final CombineSource e;
    public static final CombineSource f;
    public static final /* synthetic */ CombineSource[] g;

    static {
        CombineSource combineSource = new CombineSource("INITIAL", 0);
        d = combineSource;
        CombineSource combineSource2 = new CombineSource("RECEIVER", 1);
        e = combineSource2;
        CombineSource combineSource3 = new CombineSource("OTHER", 2);
        f = combineSource3;
        g = new CombineSource[]{combineSource, combineSource2, combineSource3};
    }

    public static CombineSource valueOf(String str) {
        return (CombineSource) Enum.valueOf(CombineSource.class, str);
    }

    public static CombineSource[] values() {
        return (CombineSource[]) g.clone();
    }
}
