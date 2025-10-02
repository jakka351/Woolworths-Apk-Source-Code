package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "spec", "Landroidx/work/impl/model/WorkSpec;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WorkerUpdater$updateWorkImpl$type$1 extends Lambda implements Function1<WorkSpec, String> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WorkSpec spec = (WorkSpec) obj;
        Intrinsics.h(spec, "spec");
        return spec.c() ? "Periodic" : "OneTime";
    }
}
