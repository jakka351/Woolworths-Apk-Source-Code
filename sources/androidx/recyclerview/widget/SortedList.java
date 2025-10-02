package androidx.recyclerview.widget;

import java.util.Comparator;

/* loaded from: classes2.dex */
public class SortedList<T> {

    public static class BatchedCallback<T2> extends Callback<T2> {
        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        public final void a(int i, int i2, Object obj) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void b(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void c(int i, int i2) {
            throw null;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public final void d(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public final void e() {
            throw null;
        }
    }

    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public void a(int i, int i2, Object obj) {
            e();
            throw null;
        }

        public abstract void e();
    }
}
