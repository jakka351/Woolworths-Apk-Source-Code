package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes4.dex */
class GifFrameLoader {

    /* renamed from: a, reason: collision with root package name */
    public final StandardGifDecoder f13941a;
    public final Handler b;
    public final ArrayList c;
    public final RequestManager d;
    public final BitmapPool e;
    public boolean f;
    public boolean g;
    public RequestBuilder h;
    public DelayTarget i;
    public boolean j;
    public DelayTarget k;
    public Bitmap l;
    public Transformation m;
    public DelayTarget n;
    public int o;
    public int p;
    public int q;

    @VisibleForTesting
    public static class DelayTarget extends CustomTarget<Bitmap> {
        public final Handler g;
        public final int h;
        public final long i;
        public Bitmap j;

        public DelayTarget(Handler handler, int i, long j) {
            this.g = handler;
            this.h = i;
            this.i = j;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void d(Drawable drawable) {
            this.j = null;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void e(Object obj, Transition transition) {
            this.j = (Bitmap) obj;
            Handler handler = this.g;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.i);
        }
    }

    /* loaded from: classes.dex */
    public interface FrameCallback {
        void a();
    }

    public class FrameLoaderCallback implements Handler.Callback {
        public FrameLoaderCallback() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            GifFrameLoader gifFrameLoader = GifFrameLoader.this;
            if (i == 1) {
                gifFrameLoader.i((DelayTarget) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            gifFrameLoader.d.f((DelayTarget) message.obj);
            return false;
        }
    }

    @VisibleForTesting
    public interface OnEveryFrameListener {
    }

    public GifFrameLoader(Glide glide, StandardGifDecoder standardGifDecoder, int i, int i2, UnitTransformation unitTransformation, Bitmap bitmap) {
        BitmapPool bitmapPool = glide.e;
        GlideContext glideContext = glide.g;
        RequestManager requestManagerD = Glide.d(glideContext.getBaseContext());
        RequestBuilder requestBuilderD = Glide.d(glideContext.getBaseContext()).c(Bitmap.class).a(RequestManager.n).a(((RequestOptions) ((RequestOptions) ((RequestOptions) new RequestOptions().d(DiskCacheStrategy.b)).B()).v(true)).k(i, i2));
        this.c = new ArrayList();
        this.d = requestManagerD;
        Handler handler = new Handler(Looper.getMainLooper(), new FrameLoaderCallback());
        this.e = bitmapPool;
        this.b = handler;
        this.h = requestBuilderD;
        this.f13941a = standardGifDecoder;
        j(unitTransformation, bitmap);
    }

    public final ByteBuffer a() {
        return this.f13941a.d.asReadOnlyBuffer();
    }

    public final Bitmap b() {
        DelayTarget delayTarget = this.i;
        return delayTarget != null ? delayTarget.j : this.l;
    }

    public final int c() {
        DelayTarget delayTarget = this.i;
        if (delayTarget != null) {
            return delayTarget.h;
        }
        return -1;
    }

    public final Bitmap d() {
        return this.l;
    }

    public final int e() {
        return this.f13941a.l.c;
    }

    public final int f() {
        return this.q;
    }

    public final int g() {
        return this.p;
    }

    public final void h() {
        if (!this.f || this.g) {
            return;
        }
        DelayTarget delayTarget = this.n;
        if (delayTarget != null) {
            this.n = null;
            i(delayTarget);
            return;
        }
        this.g = true;
        StandardGifDecoder standardGifDecoder = this.f13941a;
        long jUptimeMillis = SystemClock.uptimeMillis() + standardGifDecoder.d();
        standardGifDecoder.b();
        this.k = new DelayTarget(this.b, standardGifDecoder.k, jUptimeMillis);
        this.h.a((RequestOptions) new RequestOptions().u(new ObjectKey(Double.valueOf(Math.random())))).N(standardGifDecoder).I(this.k);
    }

    public final void i(DelayTarget delayTarget) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, delayTarget).sendToTarget();
            return;
        }
        if (!this.f) {
            this.n = delayTarget;
            return;
        }
        if (delayTarget.j != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.d(bitmap);
                this.l = null;
            }
            DelayTarget delayTarget2 = this.i;
            this.i = delayTarget;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((FrameCallback) arrayList.get(size)).a();
            }
            if (delayTarget2 != null) {
                handler.obtainMessage(2, delayTarget2).sendToTarget();
            }
        }
        h();
    }

    public final void j(Transformation transformation, Bitmap bitmap) {
        Preconditions.c(transformation, "Argument must not be null");
        this.m = transformation;
        Preconditions.c(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.a(new RequestOptions().y(transformation, true));
        this.o = Util.c(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }

    public final void k(GifDrawable gifDrawable) {
        if (this.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = this.c;
        if (arrayList.contains(gifDrawable)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(gifDrawable);
        if (!zIsEmpty || this.f) {
            return;
        }
        this.f = true;
        this.j = false;
        h();
    }

    public final void l(GifDrawable gifDrawable) {
        ArrayList arrayList = this.c;
        arrayList.remove(gifDrawable);
        if (arrayList.isEmpty()) {
            this.f = false;
        }
    }
}
