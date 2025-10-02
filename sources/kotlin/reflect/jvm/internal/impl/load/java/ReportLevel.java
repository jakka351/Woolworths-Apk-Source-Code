package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ReportLevel {
    public static final ReportLevel e;
    public static final ReportLevel f;
    public static final ReportLevel g;
    public static final /* synthetic */ ReportLevel[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ReportLevel reportLevel = new ReportLevel("IGNORE", 0, "ignore");
        e = reportLevel;
        ReportLevel reportLevel2 = new ReportLevel("WARN", 1, "warn");
        f = reportLevel2;
        ReportLevel reportLevel3 = new ReportLevel("STRICT", 2, "strict");
        g = reportLevel3;
        ReportLevel[] reportLevelArr = {reportLevel, reportLevel2, reportLevel3};
        h = reportLevelArr;
        i = EnumEntriesKt.a(reportLevelArr);
    }

    public ReportLevel(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ReportLevel valueOf(String str) {
        return (ReportLevel) Enum.valueOf(ReportLevel.class, str);
    }

    public static ReportLevel[] values() {
        return (ReportLevel[]) h.clone();
    }
}
