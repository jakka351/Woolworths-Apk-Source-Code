package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.PublishedApi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/CompositionSource;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
/* loaded from: classes2.dex */
public final class CompositionSource {
    public static final CompositionSource d;
    public static final CompositionSource e;
    public static final /* synthetic */ CompositionSource[] f;

    static {
        CompositionSource compositionSource = new CompositionSource("Unknown", 0);
        d = compositionSource;
        CompositionSource compositionSource2 = new CompositionSource("Content", 1);
        e = compositionSource2;
        f = new CompositionSource[]{compositionSource, compositionSource2};
    }

    public static CompositionSource valueOf(String str) {
        return (CompositionSource) Enum.valueOf(CompositionSource.class, str);
    }

    public static CompositionSource[] values() {
        return (CompositionSource[]) f.clone();
    }
}
