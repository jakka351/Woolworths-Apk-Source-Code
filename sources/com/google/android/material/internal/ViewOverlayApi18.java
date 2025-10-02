package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes6.dex */
class ViewOverlayApi18 implements ViewOverlayImpl {

    /* renamed from: a, reason: collision with root package name */
    public final ViewOverlay f14608a;

    public ViewOverlayApi18(View view) {
        this.f14608a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public final void a(Drawable drawable) {
        this.f14608a.remove(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public final void b(Drawable drawable) {
        this.f14608a.add(drawable);
    }
}
