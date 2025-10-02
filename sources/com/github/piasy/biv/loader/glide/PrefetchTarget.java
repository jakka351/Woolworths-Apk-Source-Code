package com.github.piasy.biv.loader.glide;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.io.File;

/* loaded from: classes4.dex */
public class PrefetchTarget implements Target<File> {
    public Request d;

    @Override // com.bumptech.glide.request.target.Target
    public final Request a() {
        return this.d;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void b(SingleRequest singleRequest) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final /* bridge */ /* synthetic */ void e(Object obj, Transition transition) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void g(SingleRequest singleRequest) {
        if (!Util.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648, either provide dimensions in the constructor or call override()");
        }
        singleRequest.b(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void h(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void i(Request request) {
        this.d = request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void j(Drawable drawable) {
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
