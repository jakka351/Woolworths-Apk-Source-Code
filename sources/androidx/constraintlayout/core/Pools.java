package androidx.constraintlayout.core;

/* loaded from: classes2.dex */
final class Pools {

    public interface Pool<T> {
    }

    public static class SimplePool<T> implements Pool<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f2264a = new Object[256];
        public int b;

        public final boolean a(ArrayRow arrayRow) {
            int i = this.b;
            Object[] objArr = this.f2264a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = arrayRow;
            this.b = i + 1;
            return true;
        }
    }
}
