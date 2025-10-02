package androidx.media3.exoplayer.source;

import android.util.SparseArray;

/* loaded from: classes2.dex */
final class SpannedData<V> {
    public final l c;
    public final SparseArray b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public int f3147a = -1;

    public SpannedData(l lVar) {
        this.c = lVar;
    }

    public final Object a(int i) {
        SparseArray sparseArray;
        if (this.f3147a == -1) {
            this.f3147a = 0;
        }
        while (true) {
            int i2 = this.f3147a;
            sparseArray = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f3147a--;
        }
        while (this.f3147a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f3147a + 1)) {
            this.f3147a++;
        }
        return sparseArray.valueAt(this.f3147a);
    }
}
