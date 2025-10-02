package com.github.piasy.biv.loader.glide;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import com.github.piasy.biv.loader.glide.GlideProgressSupport;
import java.io.File;

/* loaded from: classes4.dex */
public abstract class ImageDownloadTarget implements Target<File>, GlideProgressSupport.ProgressListener {
    public Request d;
    public final String e;

    public ImageDownloadTarget(String str) {
        this.e = str;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final Request a() {
        return this.d;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void b(SingleRequest singleRequest) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void d(Drawable drawable) {
        GlideProgressSupport.DispatchingProgressListener.a(this.e);
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
        GlideProgressSupport.DispatchingProgressListener.f14354a.put(this.e.split("\\?")[0], this);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void i(Request request) {
        this.d = request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void j(Drawable drawable) {
        GlideProgressSupport.DispatchingProgressListener.a(this.e);
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: k */
    public void e(File file, Transition transition) {
        GlideProgressSupport.DispatchingProgressListener.a(this.e);
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
