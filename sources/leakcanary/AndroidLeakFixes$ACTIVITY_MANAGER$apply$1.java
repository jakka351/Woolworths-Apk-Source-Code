package leakcanary;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
final class AndroidLeakFixes$ACTIVITY_MANAGER$apply$1 implements Runnable {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "activity", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: leakcanary.AndroidLeakFixes$ACTIVITY_MANAGER$apply$1$3, reason: invalid class name */
    final class AnonymousClass3 extends Lambda implements Function1<Activity, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            Intrinsics.i(activity, "activity");
            try {
                throw null;
            } catch (Exception unused) {
                return Unit.f24250a;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw null;
    }
}
