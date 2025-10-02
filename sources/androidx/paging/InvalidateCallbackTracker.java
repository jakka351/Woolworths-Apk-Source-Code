package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/InvalidateCallbackTracker;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InvalidateCallbackTracker<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Lambda f3541a;
    public final Function0 b;
    public final ReentrantLock c = new ReentrantLock();
    public final ArrayList d = new ArrayList();
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidateCallbackTracker(Function0 function0, Function1 function1) {
        this.f3541a = (Lambda) function1;
        this.b = function0;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final boolean a() {
        ArrayList arrayList = this.d;
        if (this.e) {
            return false;
        }
        ReentrantLock reentrantLock = this.c;
        try {
            reentrantLock.lock();
            if (this.e) {
                return false;
            }
            this.e = true;
            List listG0 = CollectionsKt.G0(arrayList);
            arrayList.clear();
            reentrantLock.unlock();
            Iterator<T> it = listG0.iterator();
            while (it.hasNext()) {
                this.f3541a.invoke(it.next());
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void b(Object obj) {
        boolean z = true;
        Function0 function0 = this.b;
        if (function0 != null && ((Boolean) function0.invoke()).booleanValue()) {
            a();
        }
        boolean z2 = this.e;
        ?? r2 = this.f3541a;
        if (z2) {
            r2.invoke(obj);
            return;
        }
        ReentrantLock reentrantLock = this.c;
        try {
            reentrantLock.lock();
            if (!this.e) {
                this.d.add(obj);
                z = false;
            }
            if (z) {
                r2.invoke(obj);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(Object obj) {
        ReentrantLock reentrantLock = this.c;
        try {
            reentrantLock.lock();
            this.d.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }
}
