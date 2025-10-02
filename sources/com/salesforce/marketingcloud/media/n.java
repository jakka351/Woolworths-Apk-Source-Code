package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.media.s;
import com.salesforce.marketingcloud.media.u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint
/* loaded from: classes6.dex */
public class n implements Runnable {
    private static final String m = "ImageHandler-";
    private static final String n = "ImageHandler-Idle";
    private static final ThreadLocal<StringBuilder> o = new a();
    private static final u p = new b();

    /* renamed from: a, reason: collision with root package name */
    final o f16971a;
    final h b;
    final String c;
    final u d;
    final com.salesforce.marketingcloud.media.c e;
    s f;
    com.salesforce.marketingcloud.media.a g;
    List<com.salesforce.marketingcloud.media.a> h;
    u.b i;
    Future<?> j;
    Exception k;
    o.c l;

    public class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder(n.m);
        }
    }

    public class b extends u {
        @Override // com.salesforce.marketingcloud.media.u
        public boolean a(s sVar) {
            return true;
        }

        @Override // com.salesforce.marketingcloud.media.u
        public void a(o oVar, s sVar, u.a aVar) throws IOException {
            aVar.a(new k(sVar));
        }
    }

    public class c implements u.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f16972a;
        final /* synthetic */ CountDownLatch b;
        final /* synthetic */ AtomicReference c;

        public c(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f16972a = atomicReference;
            this.b = countDownLatch;
            this.c = atomicReference2;
        }

        @Override // com.salesforce.marketingcloud.media.u.a
        public void a(Throwable th) {
            this.c.set(th);
            this.b.countDown();
        }

        @Override // com.salesforce.marketingcloud.media.u.a
        public void a(u.b bVar) {
            this.f16972a.set(bVar);
            this.b.countDown();
        }
    }

    public n(o oVar, h hVar, com.salesforce.marketingcloud.media.c cVar, com.salesforce.marketingcloud.media.a aVar, u uVar) {
        this.f16971a = oVar;
        this.b = hVar;
        this.e = cVar;
        this.g = aVar;
        this.c = aVar.c();
        this.f = aVar.e();
        this.d = uVar;
        this.l = aVar.d();
    }

    public void a(com.salesforce.marketingcloud.media.a aVar) {
        if (this.g == null) {
            this.g = aVar;
            return;
        }
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(aVar);
        o.c cVarD = aVar.d();
        if (cVarD.ordinal() > this.l.ordinal()) {
            this.l = cVarD;
        }
    }

    public void b(com.salesforce.marketingcloud.media.a aVar) {
        if (this.g == aVar) {
            this.g = null;
            return;
        }
        List<com.salesforce.marketingcloud.media.a> list = this.h;
        if (list != null) {
            list.remove(aVar);
        }
    }

    public com.salesforce.marketingcloud.media.a c() {
        return this.g;
    }

    public List<com.salesforce.marketingcloud.media.a> d() {
        return this.h;
    }

    public s e() {
        return this.f;
    }

    public Exception f() {
        return this.k;
    }

    public o g() {
        return this.f16971a;
    }

    public String h() {
        return this.c;
    }

    public u.b i() {
        return this.i;
    }

    public boolean j() {
        Future<?> future = this.j;
        return future != null && future.isCancelled();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                a(this.f);
                u.b bVarB = b();
                this.i = bVarB;
                if (bVarB.d()) {
                    com.salesforce.marketingcloud.g.a("IMAGE", "onSuccess - Loaded from: %s", this.i.c());
                    this.b.b(this);
                } else {
                    this.b.c(this);
                }
            } catch (Exception e) {
                this.k = e;
                this.b.c(this);
            }
            Thread.currentThread().setName(n);
        } catch (Throwable th) {
            Thread.currentThread().setName(n);
            throw th;
        }
    }

    public boolean a() {
        List<com.salesforce.marketingcloud.media.a> list;
        Future<?> future;
        return this.g == null && ((list = this.h) == null || list.isEmpty()) && (future = this.j) != null && future.cancel(false);
    }

    public u.b b() throws InterruptedException, IOException {
        Bitmap bitmapA;
        if (s.b.a(this.f.d) && (bitmapA = this.e.a(this.c)) != null) {
            return new u.b(bitmapA, o.b.MEMORY);
        }
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.d.a(this.f16971a, this.f, new c(atomicReference, countDownLatch, atomicReference2));
            countDownLatch.await();
            Throwable th = (Throwable) atomicReference2.get();
            if (th != null) {
                throw new RuntimeException(th);
            }
            u.b bVar = (u.b) atomicReference.get();
            if (bVar.d()) {
                Bitmap bitmapA2 = bVar.a();
                if (this.f.e()) {
                    if (this.f.d()) {
                        bitmapA2 = b(this.f, bitmapA2);
                    }
                    if (this.f.c()) {
                        bitmapA2 = a(this.f, bitmapA2);
                    }
                    return new u.b(bitmapA2, bVar.c());
                }
            }
            return bVar;
        } catch (InterruptedException e) {
            throw new InterruptedIOException(e.getMessage());
        }
    }

    public static Bitmap a(s sVar, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = sVar.i;
        float f2 = sVar.j;
        float f3 = width;
        float f4 = height;
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, f4);
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, f4);
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            paint2.setStrokeWidth(f2);
            paint2.setColor(sVar.k);
            float f5 = f2 / 2.0f;
            rectF2.inset(f5, f5);
            float fFloor = (float) Math.floor(f5);
            rectF.inset(fFloor, fFloor);
        }
        if (f > BitmapDescriptorFactory.HUE_RED) {
            canvas.drawRoundRect(rectF, f, f, paint);
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                canvas.drawRoundRect(rectF2, f, f, paint2);
            }
        } else {
            canvas.drawRect(rectF, paint);
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                canvas.drawRect(rectF2, paint2);
            }
        }
        if (bitmap == bitmapCreateBitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static Bitmap b(s sVar, Bitmap bitmap) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        int i3 = 0;
        if (sVar.d()) {
            int i4 = sVar.e;
            int i5 = sVar.f;
            if (sVar.g) {
                if (i4 != 0) {
                    f9 = i4;
                    f10 = width;
                } else {
                    f9 = i5;
                    f10 = height;
                }
                float f13 = f9 / f10;
                if (i5 != 0) {
                    f11 = i5;
                    f12 = height;
                } else {
                    f11 = i4;
                    f12 = width;
                }
                float f14 = f11 / f12;
                if (f13 > f14) {
                    int iCeil = (int) Math.ceil((f14 / f13) * height);
                    f14 = i5 / iCeil;
                    i2 = (height - iCeil) / 2;
                    height = iCeil;
                } else if (f13 < f14) {
                    int iCeil2 = (int) Math.ceil((f13 / f14) * width);
                    int i6 = (width - iCeil2) / 2;
                    width = iCeil2;
                    f13 = i4 / iCeil2;
                    i2 = 0;
                    i3 = i6;
                } else {
                    i2 = 0;
                    f13 = f14;
                }
                matrix.preScale(f13, f14);
                i = i2;
            } else {
                if (sVar.h) {
                    if (i4 != 0) {
                        f5 = i4;
                        f6 = width;
                    } else {
                        f5 = i5;
                        f6 = height;
                    }
                    float f15 = f5 / f6;
                    if (i5 != 0) {
                        f7 = i5;
                        f8 = height;
                    } else {
                        f7 = i4;
                        f8 = width;
                    }
                    float f16 = f7 / f8;
                    if (f15 >= f16) {
                        f15 = f16;
                    }
                    matrix.preScale(f15, f15);
                } else if ((i4 != 0 || i5 != 0) && (i4 != width || i5 != height)) {
                    if (i4 != 0) {
                        f = i4;
                        f2 = width;
                    } else {
                        f = i5;
                        f2 = height;
                    }
                    float f17 = f / f2;
                    if (i5 != 0) {
                        f3 = i5;
                        f4 = height;
                    } else {
                        f3 = i4;
                        f4 = width;
                    }
                    matrix.preScale(f17, f3 / f4);
                }
                i = 0;
            }
        } else {
            i = 0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i3, i, width, height, matrix, true);
        if (bitmapCreateBitmap == bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static n a(o oVar, h hVar, com.salesforce.marketingcloud.media.c cVar, com.salesforce.marketingcloud.media.a aVar) {
        s sVarE = aVar.e();
        List<u> listA = oVar.a();
        int size = listA.size();
        for (int i = 0; i < size; i++) {
            u uVar = listA.get(i);
            if (uVar.a(sVarE)) {
                return new n(oVar, hVar, cVar, aVar, uVar);
            }
        }
        return new n(oVar, hVar, cVar, aVar, p);
    }

    public static void a(s sVar) {
        String strB = sVar.b();
        StringBuilder sb = o.get();
        sb.ensureCapacity(strB.length() + 13);
        sb.replace(13, sb.length(), strB);
        Thread.currentThread().setName(sb.toString());
    }
}
