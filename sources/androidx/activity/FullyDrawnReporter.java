package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FullyDrawnReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f54a;
    public final Function0 b;
    public final Object c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final f h;

    public FullyDrawnReporter(Executor executor, Function0 function0) {
        Intrinsics.h(executor, "executor");
        this.f54a = executor;
        this.b = function0;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new f(this, 1);
    }

    public final void a() {
        synchronized (this.c) {
            try {
                this.f = true;
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.c) {
            z = this.f;
        }
        return z;
    }

    public final void c() {
        int i;
        synchronized (this.c) {
            if (!this.f && (i = this.d) > 0) {
                int i2 = i - 1;
                this.d = i2;
                if (!this.e && i2 == 0) {
                    this.e = true;
                    this.f54a.execute(this.h);
                }
            }
        }
    }
}
