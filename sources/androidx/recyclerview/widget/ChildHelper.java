package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.input.pointer.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class ChildHelper {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.AnonymousClass6 f3653a;
    public View e;
    public int d = 0;
    public final Bucket b = new Bucket();
    public final ArrayList c = new ArrayList();

    public static class Bucket {

        /* renamed from: a, reason: collision with root package name */
        public long f3654a = 0;
        public Bucket b;

        public final void a(int i) {
            if (i < 64) {
                this.f3654a &= ~(1 << i);
                return;
            }
            Bucket bucket = this.b;
            if (bucket != null) {
                bucket.a(i - 64);
            }
        }

        public final int b(int i) {
            Bucket bucket = this.b;
            if (bucket == null) {
                return i >= 64 ? Long.bitCount(this.f3654a) : Long.bitCount(this.f3654a & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.f3654a & ((1 << i) - 1));
            }
            return Long.bitCount(this.f3654a) + bucket.b(i - 64);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new Bucket();
            }
        }

        public final boolean d(int i) {
            if (i < 64) {
                return (this.f3654a & (1 << i)) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public final void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.f3654a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f3654a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public final boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f3654a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f3654a = j3;
            long j4 = j - 1;
            this.f3654a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            Bucket bucket = this.b;
            if (bucket != null) {
                if (bucket.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public final void g() {
            this.f3654a = 0L;
            Bucket bucket = this.b;
            if (bucket != null) {
                bucket.g();
            }
        }

        public final void h(int i) {
            if (i < 64) {
                this.f3654a |= 1 << i;
            } else {
                c();
                this.b.h(i - 64);
            }
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.f3654a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.f3654a);
        }
    }

    public interface Callback {
    }

    public ChildHelper(RecyclerView.AnonymousClass6 anonymousClass6) {
        this.f3653a = anonymousClass6;
    }

    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView.AnonymousClass6 anonymousClass6 = this.f3653a;
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i < 0 ? recyclerView.getChildCount() : d(i);
        this.b.e(childCount, z);
        if (z) {
            this.c.add(view);
            RecyclerView.ViewHolder viewHolderP = RecyclerView.P(view);
            if (viewHolderP != null) {
                viewHolderP.onEnteredHiddenState(RecyclerView.this);
            }
        }
        RecyclerView.ViewHolder viewHolderP2 = RecyclerView.P(view);
        if (viewHolderP2 != null) {
            if (!viewHolderP2.isTmpDetached() && !viewHolderP2.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(viewHolderP2);
                throw new IllegalArgumentException(a.j(recyclerView, sb));
            }
            if (RecyclerView.J0) {
                Log.d("RecyclerView", "reAttach " + viewHolderP2);
            }
            viewHolderP2.clearTmpDetachFlag();
        } else if (RecyclerView.I0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(a.j(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final View b(int i) {
        return RecyclerView.this.getChildAt(d(i));
    }

    public final int c() {
        return RecyclerView.this.getChildCount() - this.c.size();
    }

    public final int d(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = RecyclerView.this.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            Bucket bucket = this.b;
            int iB = i - (i2 - bucket.b(i2));
            if (iB == 0) {
                while (bucket.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public final int e(View view) {
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild != -1) {
            Bucket bucket = this.b;
            if (!bucket.d(iIndexOfChild)) {
                return iIndexOfChild - bucket.b(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void f(View view) {
        if (this.c.remove(view)) {
            this.f3653a.a(view);
        }
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
