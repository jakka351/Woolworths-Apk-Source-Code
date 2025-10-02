package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.media.s;
import com.salesforce.marketingcloud.media.u;

@SuppressLint
/* loaded from: classes6.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final o f16981a;
    private final s.a b;
    private boolean c;

    public t(o oVar, Uri uri) {
        this.f16981a = oVar;
        this.b = new s.a(uri);
    }

    public t a() {
        this.b.b();
        return this;
    }

    public t b() {
        this.b.c();
        return this;
    }

    public void c() {
        a((f) null);
    }

    public t d() {
        this.c = true;
        return this;
    }

    private s a(long j) {
        s sVarA = this.b.a();
        sVarA.l = j;
        return sVarA;
    }

    public t a(float f, float f2, @ColorInt int i) {
        this.b.a(f, f2, i);
        return this;
    }

    public void a(f fVar) {
        long jNanoTime = System.nanoTime();
        if (!this.b.d()) {
            this.b.a(o.c.NORMAL);
        }
        s sVarA = a(jNanoTime);
        if (!s.b.a(sVarA.d) || this.f16981a.a(sVarA.b) == null) {
            this.f16981a.a((a) new j(this.f16981a, sVarA, fVar));
        } else {
            com.salesforce.marketingcloud.g.a("IMAGE", "onSuccess - Loaded from: MEMORY", new Object[0]);
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    public void a(ImageView imageView) {
        a(imageView, (f) null);
    }

    public void a(ImageView imageView, f fVar) {
        Bitmap bitmapA;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("TODO");
        }
        if (!this.b.d()) {
            this.b.a(o.c.HIGH);
        }
        if (this.c) {
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                this.f16981a.a(imageView, new g(this, imageView, fVar));
                return;
            }
            this.b.a(width, height);
        }
        s sVarA = a(System.nanoTime());
        if (!s.b.a(sVarA.d) || (bitmapA = this.f16981a.a(sVarA.b)) == null) {
            this.f16981a.a((a) new p(this.f16981a, new v(imageView), sVarA, fVar));
            return;
        }
        u.b bVar = new u.b(bitmapA, o.b.MEMORY);
        l.a(imageView, this.f16981a.f16973a, bVar);
        com.salesforce.marketingcloud.g.a("IMAGE", "onSuccess - Loaded from: %s", bVar.c());
        if (fVar != null) {
            fVar.a();
        }
    }

    public t a(o.c cVar) {
        this.b.a(cVar);
        return this;
    }

    public t a(int i, int i2) {
        this.b.a(i, i2);
        return this;
    }

    public t a(s.b bVar, s.b... bVarArr) {
        this.b.a(bVar, bVarArr);
        return this;
    }
}
