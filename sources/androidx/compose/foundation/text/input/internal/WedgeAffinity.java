package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WedgeAffinity {
    public static final WedgeAffinity d;
    public static final WedgeAffinity e;
    public static final /* synthetic */ WedgeAffinity[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        WedgeAffinity wedgeAffinity = new WedgeAffinity("Start", 0);
        d = wedgeAffinity;
        WedgeAffinity wedgeAffinity2 = new WedgeAffinity("End", 1);
        e = wedgeAffinity2;
        WedgeAffinity[] wedgeAffinityArr = {wedgeAffinity, wedgeAffinity2};
        f = wedgeAffinityArr;
        g = EnumEntriesKt.a(wedgeAffinityArr);
    }

    public static WedgeAffinity valueOf(String str) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, str);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) f.clone();
    }
}
