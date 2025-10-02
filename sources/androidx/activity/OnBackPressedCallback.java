package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f56a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public FunctionReferenceImpl c;

    public OnBackPressedCallback(boolean z) {
        this.f56a = z;
    }

    public void d() {
    }

    public abstract void e();

    public void f(BackEventCompat backEvent) {
        Intrinsics.h(backEvent, "backEvent");
    }

    public void g(BackEventCompat backEvent) {
        Intrinsics.h(backEvent, "backEvent");
    }

    public final void h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    public final void i(boolean z) {
        this.f56a = z;
        ?? r1 = this.c;
        if (r1 != 0) {
            r1.invoke();
        }
    }
}
