package androidx.work.impl.constraints;

import androidx.work.impl.constraints.controllers.ConstraintController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WorkConstraintsTracker$areAllConstraintsMet$1 extends Lambda implements Function1<ConstraintController, CharSequence> {
    public static final WorkConstraintsTracker$areAllConstraintsMet$1 h = new WorkConstraintsTracker$areAllConstraintsMet$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstraintController it = (ConstraintController) obj;
        Intrinsics.h(it, "it");
        return it.getClass().getSimpleName();
    }
}
