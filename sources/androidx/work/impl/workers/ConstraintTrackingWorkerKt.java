package androidx.work.impl.workers;

import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ConstraintTrackingWorkerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4015a;

    static {
        String strG = Logger.g("ConstraintTrkngWrkr");
        Intrinsics.g(strG, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        f4015a = strG;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.work.impl.constraints.WorkConstraintsTracker r4, androidx.work.impl.model.WorkSpec r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 r0 = (androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 r0 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.flow.Flow r4 = r4.b(r5)
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2 r6 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2
            r2 = 0
            r6.<init>(r5, r2)
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r5 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
            r5.<init>(r6, r4)
            androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1 r4 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1
            r4.<init>()
            r0.q = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.w(r4, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            androidx.work.impl.constraints.ConstraintsState$ConstraintsNotMet r6 = (androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) r6
            int r4 = r6.f3959a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorkerKt.a(androidx.work.impl.constraints.WorkConstraintsTracker, androidx.work.impl.model.WorkSpec, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
