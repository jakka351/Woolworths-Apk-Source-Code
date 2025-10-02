package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
class InsetsAnimationCallback extends WindowInsetsAnimationCompat.Callback {
    public final View f;
    public int g;
    public int h;
    public final int[] i;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.i = new int[2];
        this.f = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void a(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void b(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        View view = this.f;
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        this.g = iArr[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat c(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((WindowInsetsAnimationCompat) it.next()).d() & 8) != 0) {
                this.f.setTranslationY(AnimationUtils.c(r0.c(), this.h, 0));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsAnimationCompat.BoundsCompat d(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        View view = this.f;
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        int i = this.g - iArr[1];
        this.h = i;
        view.setTranslationY(i);
        return boundsCompat;
    }
}
