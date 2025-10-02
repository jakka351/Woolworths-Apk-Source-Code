package androidx.recyclerview.widget;

/* loaded from: classes2.dex */
public class BatchingListUpdateCallback implements ListUpdateCallback {
    public final ListUpdateCallback d;
    public int e = 0;
    public int f = -1;
    public int g = -1;
    public Object h = null;

    public BatchingListUpdateCallback(ListUpdateCallback listUpdateCallback) {
        this.d = listUpdateCallback;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void a(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.e == 3 && i <= (i4 = this.g + (i3 = this.f)) && (i5 = i + i2) >= i3 && this.h == obj) {
            this.f = Math.min(i, i3);
            this.g = Math.max(i4, i5) - this.f;
            return;
        }
        e();
        this.f = i;
        this.g = i2;
        this.h = obj;
        this.e = 3;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void b(int i, int i2) {
        int i3;
        if (this.e == 2 && (i3 = this.f) >= i && i3 <= i + i2) {
            this.g += i2;
            this.f = i;
        } else {
            e();
            this.f = i;
            this.g = i2;
            this.e = 2;
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void c(int i, int i2) {
        e();
        this.d.c(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void d(int i, int i2) {
        int i3;
        if (this.e == 1 && i >= (i3 = this.f)) {
            int i4 = this.g;
            if (i <= i3 + i4) {
                this.g = i4 + i2;
                this.f = Math.min(i, i3);
                return;
            }
        }
        e();
        this.f = i;
        this.g = i2;
        this.e = 1;
    }

    public final void e() {
        int i = this.e;
        if (i == 0) {
            return;
        }
        ListUpdateCallback listUpdateCallback = this.d;
        if (i == 1) {
            listUpdateCallback.d(this.f, this.g);
        } else if (i == 2) {
            listUpdateCallback.b(this.f, this.g);
        } else if (i == 3) {
            listUpdateCallback.a(this.f, this.g, this.h);
        }
        this.h = null;
        this.e = 0;
    }
}
