package androidx.media3.ui;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public /* synthetic */ a(int i, View view) {
        this.d = i;
        this.e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        View view = this.e;
        switch (i) {
            case 0:
                int i2 = DefaultTimeBar.S;
                ((DefaultTimeBar) view).f(false);
                break;
            case 1:
                float[] fArr = PlayerControlView.E0;
                ((PlayerControlView) view).n();
                break;
            default:
                ((PlayerView) view).invalidate();
                break;
        }
    }
}
