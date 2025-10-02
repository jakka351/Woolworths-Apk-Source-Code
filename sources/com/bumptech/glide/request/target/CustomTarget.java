package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Util;

/* loaded from: classes4.dex */
public abstract class CustomTarget<T> implements Target<T> {
    public final int d;
    public final int e;
    public Request f;

    public CustomTarget() {
        if (!Util.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final Request a() {
        return this.f;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void b(SingleRequest singleRequest) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void g(SingleRequest singleRequest) {
        singleRequest.b(this.d, this.e);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void h(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void i(Request request) {
        this.f = request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void j(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
    }
}
