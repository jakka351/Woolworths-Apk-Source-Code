package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes4.dex */
public class ListPreloader<T> implements AbsListView.OnScrollListener {
    public int d;
    public int e;
    public int f;
    public boolean g;

    public interface PreloadModelProvider<U> {
    }

    public interface PreloadSizeProvider<T> {
    }

    public static final class PreloadTarget implements Target<Object> {
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
        public final void e(Object obj, Transition transition) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void g(SingleRequest singleRequest) {
            singleRequest.b(0, 0);
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

    public static final class PreloadTargetQueue {
    }

    public final void a(int i, boolean z) {
        if (this.g != z) {
            this.g = z;
            throw null;
        }
        int iMin = Math.min(this.f, Math.min(this.d, i));
        int iMin2 = Math.min(this.f, Math.max(0, i));
        if (iMin - 1 >= iMin2) {
            throw null;
        }
        this.d = iMin2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.f == 0 && i3 == 0) {
            return;
        }
        this.f = i3;
        int i4 = this.e;
        if (i > i4) {
            a(i2 + i, true);
        } else if (i < i4) {
            a(i, false);
        }
        this.e = i;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
