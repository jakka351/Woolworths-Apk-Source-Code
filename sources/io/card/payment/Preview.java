package io.card.payment;

import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
class Preview extends ViewGroup {
    public int d;
    public int e;
    public SurfaceView f;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawARGB(255, 255, 0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SurfaceView surfaceView = this.f;
        if (!z || getChildCount() <= 0) {
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = this.e;
        int i8 = i5 * i7;
        int i9 = this.d;
        int i10 = i6 * i9;
        if (i8 > i10) {
            int i11 = i10 / i7;
            surfaceView.layout((i5 - i11) / 2, 0, (i5 + i11) / 2, i6);
        } else {
            int i12 = i8 / i9;
            surfaceView.layout(0, (i6 - i12) / 2, i5, (i6 + i12) / 2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), View.resolveSize(getSuggestedMinimumHeight(), i2));
    }
}
