package androidx.lifecycle;

import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DispatchQueue {
    public boolean b;
    public boolean c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2785a = true;
    public final ArrayDeque d = new ArrayDeque();

    public final void a() {
        ArrayDeque arrayDeque = this.d;
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (!arrayDeque.isEmpty()) {
                if (!(this.b || !this.f2785a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.c = false;
        }
    }
}
