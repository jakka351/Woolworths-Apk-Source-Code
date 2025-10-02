package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.camera.core.impl.b;

/* loaded from: classes7.dex */
public class AsyncDrawable extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final String f24210a;
    public final AsyncDrawableLoader b;
    public final ImageSize c;
    public final ImageSizeResolver d;
    public final Drawable e;
    public Drawable f;
    public Drawable.Callback g;
    public int h;
    public float i;
    public boolean j;
    public boolean k = false;

    public class WrappedCallback implements Drawable.Callback {
        public final Drawable.Callback d;

        public WrappedCallback(Drawable.Callback callback) {
            this.d = callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            this.d.invalidateDrawable(AsyncDrawable.this);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.d.scheduleDrawable(AsyncDrawable.this, runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.d.unscheduleDrawable(AsyncDrawable.this, runnable);
        }
    }

    public AsyncDrawable(String str, AsyncDrawableLoader asyncDrawableLoader, ImageSizeResolverDef imageSizeResolverDef, ImageSize imageSize) {
        this.f24210a = str;
        this.b = asyncDrawableLoader;
        this.d = imageSizeResolverDef;
        this.c = imageSize;
        asyncDrawableLoader.getClass();
        this.e = null;
    }

    public final boolean a() {
        return this.f != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r5 = this;
            int r0 = r5.h
            r1 = 0
            if (r0 != 0) goto L34
            r0 = 1
            r5.j = r0
            android.graphics.drawable.Drawable r2 = r5.f
            if (r2 == 0) goto L2b
            android.graphics.Rect r3 = r2.getBounds()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L17
            goto L30
        L17:
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r2.getIntrinsicWidth()
            int r2 = r2.getIntrinsicHeight()
            r3.<init>(r1, r1, r4, r2)
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L2b
            goto L30
        L2b:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1, r1, r0, r0)
        L30:
            r5.setBounds(r3)
            return
        L34:
            r5.j = r1
            io.noties.markwon.image.ImageSizeResolver r0 = r5.d
            android.graphics.Rect r0 = r0.a(r5)
            android.graphics.drawable.Drawable r1 = r5.f
            r1.setBounds(r0)
            android.graphics.drawable.Drawable r1 = r5.f
            android.graphics.drawable.Drawable$Callback r2 = r5.g
            r1.setCallback(r2)
            r5.setBounds(r0)
            r5.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.image.AsyncDrawable.b():void");
    }

    public final void c(Drawable.Callback callback) {
        this.g = callback == null ? null : new WrappedCallback(callback);
        super.setCallback(callback);
        Drawable.Callback callback2 = this.g;
        AsyncDrawableLoader asyncDrawableLoader = this.b;
        if (callback2 == null) {
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setCallback(null);
                Object obj = this.f;
                if (obj instanceof Animatable) {
                    Animatable animatable = (Animatable) obj;
                    boolean zIsRunning = animatable.isRunning();
                    this.k = zIsRunning;
                    if (zIsRunning) {
                        animatable.stop();
                    }
                }
            }
            asyncDrawableLoader.a(this);
            return;
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.getCallback() == null) {
            this.f.setCallback(this.g);
        }
        Drawable drawable3 = this.f;
        boolean z = drawable3 == null || drawable3 == this.e;
        if (drawable3 != null) {
            drawable3.setCallback(this.g);
            Object obj2 = this.f;
            if ((obj2 instanceof Animatable) && this.k) {
                ((Animatable) obj2).start();
            }
        }
        if (z) {
            asyncDrawableLoader.b(this);
        }
    }

    public final void d(Drawable drawable) {
        this.k = false;
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (a()) {
            this.f.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (a()) {
            return this.f.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (a()) {
            return this.f.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (a()) {
            return this.f.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsyncDrawable{destination='");
        sb.append(this.f24210a);
        sb.append("', imageSize=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append(this.f);
        sb.append(", canvasWidth=");
        sb.append(this.h);
        sb.append(", textSize=");
        sb.append(this.i);
        sb.append(", waitingForDimensions=");
        return b.s(sb, this.j, '}');
    }
}
