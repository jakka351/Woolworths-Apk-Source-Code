package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.core.os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class GapWorker implements Runnable {
    public static final ThreadLocal h = new ThreadLocal();
    public static final Comparator i = new AnonymousClass1();
    public long e;
    public long f;
    public final ArrayList d = new ArrayList();
    public final ArrayList g = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.GapWorker$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Task> {
        @Override // java.util.Comparator
        public final int compare(Task task, Task task2) {
            Task task3 = task;
            Task task4 = task2;
            RecyclerView recyclerView = task3.d;
            if ((recyclerView == null) == (task4.d == null)) {
                boolean z = task3.f3668a;
                if (z == task4.f3668a) {
                    int i = task4.b - task3.b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = task3.c - task4.c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
                if (z) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    @SuppressLint
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {

        /* renamed from: a, reason: collision with root package name */
        public int f3667a;
        public int b;
        public int[] c;
        public int d;

        public final void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.q;
            if (recyclerView.p == null || layoutManager == null || !layoutManager.i) {
                return;
            }
            if (z) {
                if (!recyclerView.h.g()) {
                    layoutManager.l(recyclerView.p.i(), this);
                }
            } else if (!recyclerView.S()) {
                layoutManager.k(this.f3667a, this.b, recyclerView.l0, this);
            }
            int i = this.d;
            if (i > layoutManager.j) {
                layoutManager.j = i;
                layoutManager.k = z;
                recyclerView.f.o();
            }
        }
    }

    public static class Task {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3668a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public static RecyclerView.ViewHolder c(RecyclerView recyclerView, int i2, long j) {
        int childCount = RecyclerView.this.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView.ViewHolder viewHolderP = RecyclerView.P(RecyclerView.this.getChildAt(i3));
            if (viewHolderP.mPosition == i2 && !viewHolderP.isInvalid()) {
                return null;
            }
        }
        RecyclerView.Recycler recycler = recyclerView.f;
        if (j == Long.MAX_VALUE) {
            try {
                if (TraceCompat.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.b0(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.a0();
        RecyclerView.ViewHolder viewHolderM = recycler.m(i2, j);
        if (viewHolderM != null) {
            if (!viewHolderM.isBound() || viewHolderM.isInvalid()) {
                recycler.a(viewHolderM, false);
            } else {
                recycler.i(viewHolderM.itemView);
            }
        }
        recyclerView.b0(false);
        Trace.endSection();
        return viewHolderM;
    }

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.w) {
            if (RecyclerView.I0 && !this.d.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.e == 0) {
                this.e = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.k0;
        layoutPrefetchRegistryImpl.f3667a = i2;
        layoutPrefetchRegistryImpl.b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r18) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GapWorker.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.d;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f);
                }
            }
        } finally {
            this.e = 0L;
            Trace.endSection();
        }
    }
}
