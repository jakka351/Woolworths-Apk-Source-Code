package leakcanary;

import android.app.Activity;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
final class AndroidLeakFixes$TEXT_LINE_POOL$apply$1 implements Runnable {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: leakcanary.AndroidLeakFixes$TEXT_LINE_POOL$apply$1$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements Function1<Activity, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Activity it = (Activity) obj;
            Intrinsics.i(it, "it");
            throw null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field sCachedField = Class.forName("android.text.TextLine").getDeclaredField("sCached");
            Intrinsics.d(sCachedField, "sCachedField");
            sCachedField.setAccessible(true);
            Object obj = sCachedField.get(null);
            if (obj != null && obj.getClass().isArray()) {
                AndroidLeakFixes[] androidLeakFixesArr = AndroidLeakFixes.e;
                throw null;
            }
        } catch (Exception unused) {
        }
    }
}
