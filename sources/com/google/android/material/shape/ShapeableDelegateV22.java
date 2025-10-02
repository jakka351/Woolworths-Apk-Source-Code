package com.google.android.material.shape;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@RequiresApi
/* loaded from: classes6.dex */
class ShapeableDelegateV22 extends ShapeableDelegate {
    public boolean f = false;
    public float g = BitmapDescriptorFactory.HUE_RED;

    public ShapeableDelegateV22(FrameLayout frameLayout) {
        e(frameLayout);
    }

    @DoNotInline
    private void e(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV22.1
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                ShapeableDelegateV22 shapeableDelegateV22 = ShapeableDelegateV22.this;
                if (shapeableDelegateV22.c == null || shapeableDelegateV22.d.isEmpty()) {
                    return;
                }
                RectF rectF = shapeableDelegateV22.d;
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, shapeableDelegateV22.g);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    @Override // com.google.android.material.shape.ShapeableDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.widget.FrameLayout r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.shape.ShapeableDelegateV22.b(android.widget.FrameLayout):void");
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final boolean c() {
        return !this.f || this.f14643a;
    }
}
