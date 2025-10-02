package androidx.work.impl.utils;

import androidx.work.Configuration;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class EnqueueUtilsKt {
    public static final void a(WorkDatabase workDatabase, Configuration configuration, WorkContinuationImpl workContinuationImpl) {
        int i;
        Intrinsics.h(workDatabase, "workDatabase");
        Intrinsics.h(configuration, "configuration");
        ArrayList arrayListZ = CollectionsKt.Z(workContinuationImpl);
        int i2 = 0;
        while (!arrayListZ.isEmpty()) {
            WorkContinuationImpl workContinuationImpl2 = (WorkContinuationImpl) CollectionsKt.j0(arrayListZ);
            List list = workContinuationImpl2.d;
            Intrinsics.g(list, "current.work");
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((WorkRequest) it.next()).b.j.b() && (i = i + 1) < 0) {
                        CollectionsKt.y0();
                        throw null;
                    }
                }
            }
            i2 += i;
            List list3 = workContinuationImpl2.g;
            if (list3 != null) {
                arrayListZ.addAll(list3);
            }
        }
        if (i2 == 0) {
            return;
        }
        int iN = workDatabase.z().n();
        int i3 = configuration.j;
        if (iN + i2 > i3) {
            throw new IllegalArgumentException(YU.a.m(YU.a.q(i3, iN, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: "), i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        }
    }
}
