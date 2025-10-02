package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PrefetchMetrics {

    /* renamed from: a, reason: collision with root package name */
    public final Averages f1063a = new Averages();
    public final MutableScatterMap b;
    public Object c;
    public Averages d;

    public PrefetchMetrics() {
        long[] jArr = ScatterMapKt.f699a;
        this.b = new MutableScatterMap();
    }

    public final Averages a(Object obj) {
        Averages averages = this.d;
        if (this.c == obj && averages != null) {
            return averages;
        }
        MutableScatterMap mutableScatterMap = this.b;
        Object objE = mutableScatterMap.e(obj);
        Object obj2 = objE;
        if (objE == null) {
            Averages averages2 = new Averages();
            Averages averages3 = this.f1063a;
            averages2.f1031a = averages3.f1031a;
            averages2.b = averages3.b;
            mutableScatterMap.m(obj, averages2);
            obj2 = averages2;
        }
        Averages averages4 = (Averages) obj2;
        this.c = obj;
        this.d = averages4;
        return averages4;
    }
}
