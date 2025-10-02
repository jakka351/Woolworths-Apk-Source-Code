package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class GifDrawable extends Drawable implements GifFrameLoader.FrameCallback, Animatable, Animatable2Compat {
    public final GifState d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int i;
    public boolean k;
    public Paint l;
    public Rect m;
    public boolean h = true;
    public final int j = -1;

    /* loaded from: classes4.dex */
    public static final class GifState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final GifFrameLoader f13939a;

        public GifState(GifFrameLoader gifFrameLoader) {
            this.f13939a = gifFrameLoader;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new GifDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new GifDrawable(this);
        }
    }

    public GifDrawable(GifState gifState) {
        this.d = gifState;
    }

    @Override // com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (this.d.f13939a.c() == r0.f13939a.e() - 1) {
            this.i++;
        }
        int i = this.j;
        if (i == -1 || this.i < i) {
            return;
        }
        stop();
    }

    public final ByteBuffer b() {
        return this.d.f13939a.a();
    }

    public final Bitmap c() {
        return this.d.f13939a.d();
    }

    public final void d() {
        Preconditions.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.g);
        GifState gifState = this.d;
        if (gifState.f13939a.e() == 1) {
            invalidateSelf();
        } else {
            if (this.e) {
                return;
            }
            this.e = true;
            gifState.f13939a.k(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g) {
            return;
        }
        if (this.k) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.m == null) {
                this.m = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.m);
            this.k = false;
        }
        Bitmap bitmapB = this.d.f13939a.b();
        if (this.m == null) {
            this.m = new Rect();
        }
        Rect rect = this.m;
        if (this.l == null) {
            this.l = new Paint(2);
        }
        canvas.drawBitmap(bitmapB, (Rect) null, rect, this.l);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.f13939a.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.f13939a.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.k = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.l == null) {
            this.l = new Paint(2);
        }
        this.l.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.l == null) {
            this.l = new Paint(2);
        }
        this.l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Preconditions.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.g);
        this.h = z;
        if (!z) {
            this.e = false;
            this.d.f13939a.l(this);
        } else if (this.f) {
            d();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f = true;
        this.i = 0;
        if (this.h) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f = false;
        this.e = false;
        this.d.f13939a.l(this);
    }
}
