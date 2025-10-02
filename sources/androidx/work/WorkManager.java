package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/WorkManager;", "", "Companion", "UpdateResult", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
/* loaded from: classes.dex */
public abstract class WorkManager {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/WorkManager$Companion;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static WorkManagerImpl a(Context context) {
            Intrinsics.h(context, "context");
            WorkManagerImpl workManagerImplE = WorkManagerImpl.e(context);
            Intrinsics.g(workManagerImplE, "getInstance(context)");
            return workManagerImplE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/WorkManager$UpdateResult;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class UpdateResult {
        public static final /* synthetic */ UpdateResult[] d = {new UpdateResult("NOT_APPLIED", 0), new UpdateResult("APPLIED_IMMEDIATELY", 1), new UpdateResult("APPLIED_FOR_NEXT_RUN", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        UpdateResult EF5;

        public static UpdateResult valueOf(String str) {
            return (UpdateResult) Enum.valueOf(UpdateResult.class, str);
        }

        public static UpdateResult[] values() {
            return (UpdateResult[]) d.clone();
        }
    }

    public final void a(WorkRequest request) {
        Intrinsics.h(request, "request");
        List listQ = CollectionsKt.Q(request);
        WorkManagerImpl workManagerImpl = (WorkManagerImpl) this;
        if (listQ.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new WorkContinuationImpl(workManagerImpl, null, ExistingWorkPolicy.e, listQ, null).a();
    }

    public abstract Operation b(String str, ExistingWorkPolicy existingWorkPolicy, List list);

    public final void c(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest request) {
        Intrinsics.h(uniqueWorkName, "uniqueWorkName");
        Intrinsics.h(request, "request");
        b(uniqueWorkName, existingWorkPolicy, CollectionsKt.Q(request));
    }
}
