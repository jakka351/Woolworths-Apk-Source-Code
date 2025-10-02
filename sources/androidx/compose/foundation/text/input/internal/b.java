package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ IntConsumer e;
    public final /* synthetic */ int f;

    public /* synthetic */ b(IntConsumer intConsumer, int i, int i2) {
        this.d = i2;
        this.e = intConsumer;
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.accept(this.f);
                break;
            default:
                this.e.accept(this.f);
                break;
        }
    }
}
