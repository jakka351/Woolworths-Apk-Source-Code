package kotlin.reflect.jvm.internal.impl.load.java;

import android.support.v4.media.session.a;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class Jsr305Settings {

    /* renamed from: a, reason: collision with root package name */
    public final ReportLevel f24406a;
    public final ReportLevel b;
    public final Map c;
    public final Lazy d;
    public final boolean e;

    public Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2) {
        Map map = EmptyMap.d;
        this.f24406a = reportLevel;
        this.b = reportLevel2;
        this.c = map;
        this.d = LazyKt.b(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings$$Lambda$0
            public final Jsr305Settings d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ListBuilder listBuilderV = CollectionsKt.v();
                Jsr305Settings jsr305Settings = this.d;
                listBuilderV.add(jsr305Settings.f24406a.d);
                ReportLevel reportLevel3 = jsr305Settings.b;
                if (reportLevel3 != null) {
                    listBuilderV.add("under-migration:".concat(reportLevel3.d));
                }
                for (Map.Entry entry : jsr305Settings.c.entrySet()) {
                    listBuilderV.add("@" + entry.getKey() + ':' + ((ReportLevel) entry.getValue()).d);
                }
                return (String[]) CollectionsKt.q(listBuilderV).toArray(new String[0]);
            }
        });
        ReportLevel reportLevel3 = ReportLevel.e;
        this.e = reportLevel == reportLevel3 && reportLevel2 == reportLevel3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f24406a == jsr305Settings.f24406a && this.b == jsr305Settings.b && Intrinsics.c(this.c, jsr305Settings.c);
    }

    public final int hashCode() {
        int iHashCode = this.f24406a.hashCode() * 31;
        ReportLevel reportLevel = this.b;
        return this.c.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Jsr305Settings(globalLevel=");
        sb.append(this.f24406a);
        sb.append(", migrationLevel=");
        sb.append(this.b);
        sb.append(", userDefinedLevelForSpecificAnnotation=");
        return a.u(sb, this.c, ')');
    }
}
