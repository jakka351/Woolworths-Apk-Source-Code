package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/utils/IdGenerator;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IdGenerator {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f3998a;

    public IdGenerator(WorkDatabase workDatabase) {
        Intrinsics.h(workDatabase, "workDatabase");
        this.f3998a = workDatabase;
    }
}
