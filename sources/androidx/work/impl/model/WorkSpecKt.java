package androidx.work.impl.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkSpecKt {
    public static final WorkGenerationalId a(WorkSpec workSpec) {
        Intrinsics.h(workSpec, "<this>");
        return new WorkGenerationalId(workSpec.f3990a, workSpec.t);
    }
}
