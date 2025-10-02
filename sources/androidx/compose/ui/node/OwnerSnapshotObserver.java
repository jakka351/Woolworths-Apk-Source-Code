package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotStateObserver f1931a;
    public final Function1 b = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.h;
    public final Function1 c = OwnerSnapshotObserver$onCommitAffectingMeasure$1.h;
    public final Function1 d = OwnerSnapshotObserver$onCommitAffectingSemantics$1.h;
    public final Function1 e = OwnerSnapshotObserver$onCommitAffectingLayout$1.h;
    public final Function1 f = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.h;
    public final Function1 g = OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.h;
    public final Function1 h = OwnerSnapshotObserver$onCommitAffectingLookahead$1.h;

    public OwnerSnapshotObserver(Function1 function1) {
        this.f1931a = new SnapshotStateObserver(function1);
    }

    public final void a() {
        this.f1931a.d(OwnerSnapshotObserver$clearInvalidObservations$1.h);
    }

    public final void b(OwnerScope ownerScope, Function1 function1, Function0 function0) {
        this.f1931a.e(ownerScope, function1, function0);
    }
}
