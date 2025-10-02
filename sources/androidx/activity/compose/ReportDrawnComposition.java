package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/activity/compose/ReportDrawnComposition;", "Lkotlin/Function0;", "", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ReportDrawnComposition implements Function0<Unit> {
    public final FullyDrawnReporter d;
    public final Function0 e;
    public final SnapshotStateObserver f;
    public final Function1 g;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter) {
        boolean z;
        ReportDrawnKt$ReportDrawn$1 reportDrawnKt$ReportDrawn$1 = ReportDrawnKt$ReportDrawn$1.h;
        this.d = fullyDrawnReporter;
        this.e = reportDrawnKt$ReportDrawn$1;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.h);
        snapshotStateObserver.f();
        this.f = snapshotStateObserver;
        ReportDrawnComposition$checkReporter$1 reportDrawnComposition$checkReporter$1 = new ReportDrawnComposition$checkReporter$1(1, this, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
        this.g = reportDrawnComposition$checkReporter$1;
        synchronized (fullyDrawnReporter.c) {
            if (fullyDrawnReporter.f) {
                z = true;
            } else {
                fullyDrawnReporter.g.add(this);
                z = false;
            }
        }
        if (z) {
            invoke();
        }
        if (fullyDrawnReporter.b()) {
            return;
        }
        synchronized (fullyDrawnReporter.c) {
            if (!fullyDrawnReporter.f) {
                fullyDrawnReporter.d++;
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        snapshotStateObserver.e(reportDrawnKt$ReportDrawn$1, reportDrawnComposition$checkReporter$1, new ReportDrawnComposition$observeReporter$1(booleanRef, reportDrawnKt$ReportDrawn$1));
        if (booleanRef.d) {
            snapshotStateObserver.c(reportDrawnKt$ReportDrawn$1);
            if (!fullyDrawnReporter.b()) {
                fullyDrawnReporter.c();
            }
            snapshotStateObserver.b();
            androidx.compose.runtime.snapshots.a aVar = snapshotStateObserver.h;
            if (aVar != null) {
                aVar.dispose();
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SnapshotStateObserver snapshotStateObserver = this.f;
        snapshotStateObserver.b();
        androidx.compose.runtime.snapshots.a aVar = snapshotStateObserver.h;
        if (aVar != null) {
            aVar.dispose();
        }
        return Unit.f24250a;
    }
}
