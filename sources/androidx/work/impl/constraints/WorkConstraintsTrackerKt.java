package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*$\b\u0002\u0010\u0003\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006\u0004"}, d2 = {"Lkotlin/Function1;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "OnConstraintState", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkConstraintsTrackerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3965a;

    static {
        String strG = Logger.g("WorkConstraintsTracker");
        Intrinsics.g(strG, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f3965a = strG;
    }

    public static final Job a(WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, CoroutineDispatcher dispatcher, OnConstraintsStateChangedListener listener) {
        Intrinsics.h(workConstraintsTracker, "<this>");
        Intrinsics.h(dispatcher, "dispatcher");
        Intrinsics.h(listener, "listener");
        return BuildersKt.c(CoroutineScopeKt.a(dispatcher), null, null, new WorkConstraintsTrackerKt$listen$1(workConstraintsTracker, workSpec, listener, null), 3);
    }
}
