package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.woolworths.R;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class BaseRequestOptions<T extends BaseRequestOptions<T>> implements Cloneable {
    public int d;
    public Drawable g;
    public int h;
    public Drawable i;
    public int j;
    public boolean o;
    public boolean s;
    public Resources.Theme t;
    public boolean u;
    public boolean v;
    public boolean x;
    public DiskCacheStrategy e = DiskCacheStrategy.d;
    public Priority f = Priority.f;
    public boolean k = true;
    public int l = -1;
    public int m = -1;
    public Key n = EmptySignature.f13979a;
    public Options p = new Options();
    public CachedHashCodeArrayMap q = new CachedHashCodeArrayMap(0);
    public Class r = Object.class;
    public boolean w = true;

    public static boolean h(int i, int i2) {
        return (i & i2) != 0;
    }

    public final BaseRequestOptions A(Class cls, Transformation transformation, boolean z) {
        if (this.u) {
            return clone().A(cls, transformation, z);
        }
        Preconditions.b(transformation);
        this.q.put(cls, transformation);
        int i = this.d;
        this.d = 67584 | i;
        this.w = false;
        if (z) {
            this.d = i | 198656;
            this.o = true;
        }
        s();
        return this;
    }

    public final BaseRequestOptions B() {
        if (this.u) {
            return clone().B();
        }
        this.x = true;
        this.d |= 1048576;
        s();
        return this;
    }

    public BaseRequestOptions a(BaseRequestOptions baseRequestOptions) {
        if (this.u) {
            return clone().a(baseRequestOptions);
        }
        int i = baseRequestOptions.d;
        if (h(baseRequestOptions.d, 1048576)) {
            this.x = baseRequestOptions.x;
        }
        if (h(baseRequestOptions.d, 4)) {
            this.e = baseRequestOptions.e;
        }
        if (h(baseRequestOptions.d, 8)) {
            this.f = baseRequestOptions.f;
        }
        if (h(baseRequestOptions.d, 16)) {
            this.g = baseRequestOptions.g;
            this.h = 0;
            this.d &= -33;
        }
        if (h(baseRequestOptions.d, 32)) {
            this.h = baseRequestOptions.h;
            this.g = null;
            this.d &= -17;
        }
        if (h(baseRequestOptions.d, 64)) {
            this.i = baseRequestOptions.i;
            this.j = 0;
            this.d &= -129;
        }
        if (h(baseRequestOptions.d, 128)) {
            this.j = baseRequestOptions.j;
            this.i = null;
            this.d &= -65;
        }
        if (h(baseRequestOptions.d, 256)) {
            this.k = baseRequestOptions.k;
        }
        if (h(baseRequestOptions.d, 512)) {
            this.m = baseRequestOptions.m;
            this.l = baseRequestOptions.l;
        }
        if (h(baseRequestOptions.d, 1024)) {
            this.n = baseRequestOptions.n;
        }
        if (h(baseRequestOptions.d, 4096)) {
            this.r = baseRequestOptions.r;
        }
        if (h(baseRequestOptions.d, 8192)) {
            this.d &= -16385;
        }
        if (h(baseRequestOptions.d, 16384)) {
            this.d &= -8193;
        }
        if (h(baseRequestOptions.d, 32768)) {
            this.t = baseRequestOptions.t;
        }
        if (h(baseRequestOptions.d, 131072)) {
            this.o = baseRequestOptions.o;
        }
        if (h(baseRequestOptions.d, 2048)) {
            this.q.putAll((Map) baseRequestOptions.q);
            this.w = baseRequestOptions.w;
        }
        if (h(baseRequestOptions.d, 524288)) {
            this.v = baseRequestOptions.v;
        }
        this.d |= baseRequestOptions.d;
        this.p.f13783a.putAll((SimpleArrayMap) baseRequestOptions.p.f13783a);
        s();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BaseRequestOptions clone() {
        try {
            BaseRequestOptions baseRequestOptions = (BaseRequestOptions) super.clone();
            Options options = new Options();
            baseRequestOptions.p = options;
            options.f13783a.putAll((SimpleArrayMap) this.p.f13783a);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap(0);
            baseRequestOptions.q = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll((Map) this.q);
            baseRequestOptions.s = false;
            baseRequestOptions.u = false;
            return baseRequestOptions;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final BaseRequestOptions c(Class cls) {
        if (this.u) {
            return clone().c(cls);
        }
        this.r = cls;
        this.d |= 4096;
        s();
        return this;
    }

    public final BaseRequestOptions d(DiskCacheStrategy diskCacheStrategy) {
        if (this.u) {
            return clone().d(diskCacheStrategy);
        }
        this.e = diskCacheStrategy;
        this.d |= 4;
        s();
        return this;
    }

    public final BaseRequestOptions e(int i) {
        if (this.u) {
            return clone().e(i);
        }
        this.h = i;
        int i2 = this.d | 32;
        this.g = null;
        this.d = i2 & (-17);
        s();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BaseRequestOptions) {
            return g((BaseRequestOptions) obj);
        }
        return false;
    }

    public final BaseRequestOptions f(Drawable drawable) {
        if (this.u) {
            return clone().f(drawable);
        }
        this.g = drawable;
        int i = this.d | 16;
        this.h = 0;
        this.d = i & (-33);
        s();
        return this;
    }

    public final boolean g(BaseRequestOptions baseRequestOptions) {
        baseRequestOptions.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.h == baseRequestOptions.h && Util.b(this.g, baseRequestOptions.g) && this.j == baseRequestOptions.j && Util.b(this.i, baseRequestOptions.i) && this.k == baseRequestOptions.k && this.l == baseRequestOptions.l && this.m == baseRequestOptions.m && this.o == baseRequestOptions.o && this.v == baseRequestOptions.v && this.e.equals(baseRequestOptions.e) && this.f == baseRequestOptions.f && this.p.equals(baseRequestOptions.p) && this.q.equals(baseRequestOptions.q) && this.r.equals(baseRequestOptions.r) && this.n.equals(baseRequestOptions.n) && Util.b(this.t, baseRequestOptions.t);
    }

    public int hashCode() {
        return Util.i(Util.i(Util.i(Util.i(Util.i(Util.i(Util.i(Util.h(this.v ? 1 : 0, Util.h(0, Util.h(1, Util.h(this.o ? 1 : 0, Util.h(this.m, Util.h(this.l, Util.h(this.k ? 1 : 0, Util.i(Util.h(0, Util.i(Util.h(this.j, Util.i(Util.h(this.h, Util.g(1.0f, 17)), this.g)), this.i)), null)))))))), this.e), this.f), this.p), this.q), this.r), this.n), this.t);
    }

    public final BaseRequestOptions i(boolean z) {
        if (this.u) {
            return clone().i(z);
        }
        this.v = z;
        this.d |= 524288;
        s();
        return this;
    }

    public final BaseRequestOptions j(DownsampleStrategy downsampleStrategy, BitmapTransformation bitmapTransformation) {
        if (this.u) {
            return clone().j(downsampleStrategy, bitmapTransformation);
        }
        t(DownsampleStrategy.f, downsampleStrategy);
        return y(bitmapTransformation, false);
    }

    public final BaseRequestOptions k(int i, int i2) {
        if (this.u) {
            return clone().k(i, i2);
        }
        this.m = i;
        this.l = i2;
        this.d |= 512;
        s();
        return this;
    }

    public final BaseRequestOptions m() {
        if (this.u) {
            return clone().m();
        }
        this.j = R.drawable.catalogue_home_card_placeholder;
        int i = this.d | 128;
        this.i = null;
        this.d = i & (-65);
        s();
        return this;
    }

    public final BaseRequestOptions o(Drawable drawable) {
        if (this.u) {
            return clone().o(drawable);
        }
        this.i = drawable;
        int i = this.d | 64;
        this.j = 0;
        this.d = i & (-129);
        s();
        return this;
    }

    public final BaseRequestOptions p() {
        if (this.u) {
            return clone().p();
        }
        this.f = Priority.g;
        this.d |= 8;
        s();
        return this;
    }

    public final BaseRequestOptions q(Option option) {
        if (this.u) {
            return clone().q(option);
        }
        this.p.f13783a.remove(option);
        s();
        return this;
    }

    public final BaseRequestOptions r(DownsampleStrategy downsampleStrategy, BitmapTransformation bitmapTransformation, boolean z) {
        BaseRequestOptions baseRequestOptionsZ = z ? z(downsampleStrategy, bitmapTransformation) : j(downsampleStrategy, bitmapTransformation);
        baseRequestOptionsZ.w = true;
        return baseRequestOptionsZ;
    }

    public final void s() {
        if (this.s) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final BaseRequestOptions t(Option option, Object obj) {
        if (this.u) {
            return clone().t(option, obj);
        }
        Preconditions.b(option);
        Preconditions.b(obj);
        this.p.f13783a.put(option, obj);
        s();
        return this;
    }

    public final BaseRequestOptions u(Key key) {
        if (this.u) {
            return clone().u(key);
        }
        this.n = key;
        this.d |= 1024;
        s();
        return this;
    }

    public final BaseRequestOptions v(boolean z) {
        if (this.u) {
            return clone().v(true);
        }
        this.k = !z;
        this.d |= 256;
        s();
        return this;
    }

    public final BaseRequestOptions w(Resources.Theme theme) {
        if (this.u) {
            return clone().w(theme);
        }
        this.t = theme;
        if (theme != null) {
            this.d |= 32768;
            return t(ResourceDrawableDecoder.b, theme);
        }
        this.d &= -32769;
        return q(ResourceDrawableDecoder.b);
    }

    public final BaseRequestOptions y(Transformation transformation, boolean z) {
        if (this.u) {
            return clone().y(transformation, z);
        }
        DrawableTransformation drawableTransformation = new DrawableTransformation(transformation, z);
        A(Bitmap.class, transformation, z);
        A(Drawable.class, drawableTransformation, z);
        A(BitmapDrawable.class, drawableTransformation, z);
        A(GifDrawable.class, new GifDrawableTransformation(transformation), z);
        s();
        return this;
    }

    public final BaseRequestOptions z(DownsampleStrategy downsampleStrategy, BitmapTransformation bitmapTransformation) {
        if (this.u) {
            return clone().z(downsampleStrategy, bitmapTransformation);
        }
        t(DownsampleStrategy.f, downsampleStrategy);
        return y(bitmapTransformation, true);
    }
}
