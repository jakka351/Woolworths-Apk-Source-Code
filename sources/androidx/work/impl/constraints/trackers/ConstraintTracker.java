package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.b;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/ConstraintTracker;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class ConstraintTracker<T> {

    /* renamed from: a, reason: collision with root package name */
    public final WorkManagerTaskExecutor f3972a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public ConstraintTracker(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.f3972a = workManagerTaskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "context.applicationContext");
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                this.f3972a.d.execute(new b(2, CollectionsKt.G0(this.d), this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
