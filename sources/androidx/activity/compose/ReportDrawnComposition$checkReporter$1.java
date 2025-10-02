package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends FunctionReferenceImpl implements Function1<Function0<? extends Boolean>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Function0) obj);
        return Unit.f24250a;
    }

    public final void m(Function0 function0) {
        ReportDrawnComposition reportDrawnComposition = (ReportDrawnComposition) this.receiver;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        SnapshotStateObserver snapshotStateObserver = reportDrawnComposition.f;
        snapshotStateObserver.e(function0, reportDrawnComposition.g, new ReportDrawnComposition$observeReporter$1(booleanRef, function0));
        if (booleanRef.d) {
            snapshotStateObserver.c(ReportDrawnKt$ReportDrawn$1.h);
            FullyDrawnReporter fullyDrawnReporter = reportDrawnComposition.d;
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
}
