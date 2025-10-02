package io.card.payment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;

/* loaded from: classes7.dex */
class Logo {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f23879a;
    public Bitmap b;
    public boolean c;
    public final Context d;

    public Logo(Context context) {
        Paint paint = new Paint();
        this.f23879a = paint;
        paint.setAntiAlias(true);
        paint.setAlpha(100);
        this.b = null;
        this.d = context;
    }

    public final void a(boolean z) {
        if (this.b == null || z != this.c) {
            this.c = z;
            Context context = this.d;
            if (z) {
                this.b = BitmapFactory.decodeResource(context.getResources(), R.drawable.cio_card_io_logo);
            } else {
                this.b = BitmapFactory.decodeResource(context.getResources(), R.drawable.cio_paypal_logo);
            }
        }
    }
}
