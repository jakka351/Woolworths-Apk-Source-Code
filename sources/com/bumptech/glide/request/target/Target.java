package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes4.dex */
public interface Target<R> extends LifecycleListener {
    Request a();

    void b(SingleRequest singleRequest);

    void d(Drawable drawable);

    void e(Object obj, Transition transition);

    void g(SingleRequest singleRequest);

    void h(Drawable drawable);

    void i(Request request);

    void j(Drawable drawable);
}
