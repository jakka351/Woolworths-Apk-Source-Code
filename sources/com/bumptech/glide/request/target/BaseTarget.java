package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;

@Deprecated
/* loaded from: classes4.dex */
public abstract class BaseTarget<Z> implements Target<Z> {
    public Request d;

    @Override // com.bumptech.glide.request.target.Target
    public Request a() {
        return this.d;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void h(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void i(Request request) {
        this.d = request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void j(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }
}
