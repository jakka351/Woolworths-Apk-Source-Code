package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.b7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0535b7 extends View {
    private final Paint b;
    private List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0535b7(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
        this.c = EmptyList.d;
    }

    public final void a(Brush brush) {
        int fillColor = brush != null ? brush.getFillColor() : 0;
        if (fillColor != this.b.getColor()) {
            this.b.setColor(fillColor);
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        if (this.b.getColor() != 0) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                canvas.drawPath((Path) it.next(), this.b);
            }
        }
    }

    public final void a(List paths) {
        Intrinsics.h(paths, "paths");
        this.c = paths;
        invalidate();
    }

    public final void a() {
        this.c = EmptyList.d;
    }
}
