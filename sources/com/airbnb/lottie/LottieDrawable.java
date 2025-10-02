package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.LayerParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieThreadFactory;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final List U = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor V = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new LottieThreadFactory());
    public boolean A;
    public RenderMode B;
    public boolean C;
    public final Matrix D;
    public Bitmap E;
    public Canvas F;
    public Rect G;
    public RectF H;
    public LPaint I;
    public Rect J;
    public Rect K;
    public RectF L;
    public RectF M;
    public Matrix N;
    public Matrix O;
    public boolean P;
    public AsyncUpdates Q;
    public final Semaphore R;
    public final g S;
    public float T;
    public LottieComposition d;
    public final LottieValueAnimator e;
    public final boolean f;
    public boolean g;
    public boolean h;
    public OnVisibleAction i;
    public final ArrayList j;
    public ImageAssetManager k;
    public String l;
    public ImageAssetDelegate m;
    public FontAssetManager n;
    public Map o;
    public String p;
    public FontAssetDelegate q;
    public TextDelegate r;
    public final LottieFeatureFlags s;
    public boolean t;
    public boolean u;
    public CompositionLayer v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* renamed from: com.airbnb.lottie.LottieDrawable$1, reason: invalid class name */
    class AnonymousClass1 extends LottieValueCallback<Object> {
        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final Object a(LottieFrameInfo lottieFrameInfo) {
            throw null;
        }
    }

    public interface LazyCompositionTask {
        void run();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OnVisibleAction {
        public static final OnVisibleAction d;
        public static final OnVisibleAction e;
        public static final OnVisibleAction f;
        public static final /* synthetic */ OnVisibleAction[] g;

        static {
            OnVisibleAction onVisibleAction = new OnVisibleAction("NONE", 0);
            d = onVisibleAction;
            OnVisibleAction onVisibleAction2 = new OnVisibleAction("PLAY", 1);
            e = onVisibleAction2;
            OnVisibleAction onVisibleAction3 = new OnVisibleAction("RESUME", 2);
            f = onVisibleAction3;
            g = new OnVisibleAction[]{onVisibleAction, onVisibleAction2, onVisibleAction3};
        }

        public static OnVisibleAction valueOf(String str) {
            return (OnVisibleAction) Enum.valueOf(OnVisibleAction.class, str);
        }

        public static OnVisibleAction[] values() {
            return (OnVisibleAction[]) g.clone();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        lottieValueAnimator.g = 1.0f;
        lottieValueAnimator.h = false;
        lottieValueAnimator.i = 0L;
        lottieValueAnimator.j = BitmapDescriptorFactory.HUE_RED;
        lottieValueAnimator.k = BitmapDescriptorFactory.HUE_RED;
        lottieValueAnimator.l = 0;
        lottieValueAnimator.m = -2.14748365E9f;
        lottieValueAnimator.n = 2.14748365E9f;
        lottieValueAnimator.p = false;
        lottieValueAnimator.q = false;
        this.e = lottieValueAnimator;
        this.f = true;
        this.g = false;
        this.h = false;
        this.i = OnVisibleAction.d;
        this.j = new ArrayList();
        this.s = new LottieFeatureFlags();
        this.t = false;
        this.u = true;
        this.w = 255;
        this.A = false;
        this.B = RenderMode.d;
        this.C = false;
        this.D = new Matrix();
        this.P = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.s
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                List list = LottieDrawable.U;
                LottieDrawable lottieDrawable = this.d;
                AsyncUpdates asyncUpdates = lottieDrawable.Q;
                if (asyncUpdates == null) {
                    asyncUpdates = AsyncUpdates.d;
                }
                if (asyncUpdates == AsyncUpdates.e) {
                    lottieDrawable.invalidateSelf();
                    return;
                }
                CompositionLayer compositionLayer = lottieDrawable.v;
                if (compositionLayer != null) {
                    compositionLayer.r(lottieDrawable.e.c());
                }
            }
        };
        this.R = new Semaphore(1);
        this.S = new g(this, 1);
        this.T = -3.4028235E38f;
        lottieValueAnimator.addUpdateListener(animatorUpdateListener);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final KeyPath keyPath, final Object obj, final LottieValueCallback lottieValueCallback) {
        CompositionLayer compositionLayer = this.v;
        if (compositionLayer == null) {
            this.j.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run() {
                    List list = LottieDrawable.U;
                    this.f13430a.a(keyPath, obj, lottieValueCallback);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (keyPath == KeyPath.c) {
            compositionLayer.b(lottieValueCallback, obj);
        } else {
            KeyPathElement keyPathElement = keyPath.b;
            if (keyPathElement != null) {
                keyPathElement.b(lottieValueCallback, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.v.h(keyPath, 0, arrayList, new KeyPath(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((KeyPath) arrayList.get(i)).b.b(lottieValueCallback, obj);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == LottieProperty.z) {
                x(this.e.c());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.content.Context r4) {
        /*
            r3 = this;
            boolean r0 = r3.g
            if (r0 == 0) goto L5
            goto L27
        L5:
            boolean r0 = r3.f
            if (r0 == 0) goto L29
            com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode r0 = com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode.d
            if (r4 == 0) goto L24
            java.lang.ThreadLocal r1 = com.airbnb.lottie.utils.Utils.f13480a
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r1 = "animator_duration_scale"
            r2 = 1065353216(0x3f800000, float:1.0)
            float r4 = android.provider.Settings.Global.getFloat(r4, r1, r2)
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L21
            goto L24
        L21:
            com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode r4 = com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode.e
            goto L25
        L24:
            r4 = r0
        L25:
            if (r4 != r0) goto L29
        L27:
            r4 = 1
            return r4
        L29:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieDrawable.b(android.content.Context):boolean");
    }

    public final void c() {
        LottieComposition lottieComposition = this.d;
        if (lottieComposition == null) {
            return;
        }
        JsonReader.Options options = LayerParser.f13457a;
        Rect rect = lottieComposition.k;
        List list = Collections.EMPTY_LIST;
        CompositionLayer compositionLayer = new CompositionLayer(this, new Layer(list, lottieComposition, "__container", -1L, Layer.LayerType.d, -1L, null, list, new AnimatableTransform(), 0, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rect.width(), rect.height(), null, null, list, Layer.MatteType.d, null, false, null, null, LBlendMode.d), lottieComposition.j, lottieComposition);
        this.v = compositionLayer;
        if (this.y) {
            compositionLayer.q(true);
        }
        this.v.J = this.u;
    }

    public final void d() {
        LottieValueAnimator lottieValueAnimator = this.e;
        if (lottieValueAnimator.p) {
            lottieValueAnimator.cancel();
            if (!isVisible()) {
                this.i = OnVisibleAction.d;
            }
        }
        this.d = null;
        this.v = null;
        this.k = null;
        this.T = -3.4028235E38f;
        lottieValueAnimator.o = null;
        lottieValueAnimator.m = -2.14748365E9f;
        lottieValueAnimator.n = 2.14748365E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        CompositionLayer compositionLayer = this.v;
        if (compositionLayer == null) {
            return;
        }
        AsyncUpdates asyncUpdates = this.Q;
        if (asyncUpdates == null) {
            asyncUpdates = AsyncUpdates.d;
        }
        boolean z = asyncUpdates == AsyncUpdates.e;
        g gVar = this.S;
        ThreadPoolExecutor threadPoolExecutor = V;
        LottieValueAnimator lottieValueAnimator = this.e;
        Semaphore semaphore = this.R;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (compositionLayer.I == lottieValueAnimator.c()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (compositionLayer.I != lottieValueAnimator.c()) {
                        threadPoolExecutor.execute(gVar);
                    }
                }
                throw th;
            }
        }
        if (z && y()) {
            x(lottieValueAnimator.c());
        }
        if (this.h) {
            try {
                if (this.C) {
                    o(canvas, compositionLayer);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                Logger.f13477a.getClass();
            }
        } else if (this.C) {
            o(canvas, compositionLayer);
        } else {
            g(canvas);
        }
        this.P = false;
        if (z) {
            semaphore.release();
            if (compositionLayer.I == lottieValueAnimator.c()) {
                return;
            }
            threadPoolExecutor.execute(gVar);
        }
    }

    public final void e() {
        LottieComposition lottieComposition = this.d;
        if (lottieComposition == null) {
            return;
        }
        RenderMode renderMode = this.B;
        int i = lottieComposition.o;
        int iOrdinal = renderMode.ordinal();
        boolean z = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || i > 4)) {
            z = true;
        }
        this.C = z;
    }

    public final void g(Canvas canvas) {
        CompositionLayer compositionLayer = this.v;
        LottieComposition lottieComposition = this.d;
        if (compositionLayer == null || lottieComposition == null) {
            return;
        }
        Matrix matrix = this.D;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preScale(r3.width() / lottieComposition.k.width(), r3.height() / lottieComposition.k.height());
            matrix.preTranslate(r3.left, r3.top);
        }
        compositionLayer.d(canvas, matrix, this.w);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.d;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.d;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(boolean z) {
        HashSet hashSet = this.s.f13344a;
        LottieFeatureFlag lottieFeatureFlag = LottieFeatureFlag.d;
        boolean zAdd = z ? hashSet.add(lottieFeatureFlag) : hashSet.remove(lottieFeatureFlag);
        if (this.d == null || !zAdd) {
            return;
        }
        c();
    }

    public final Context i() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.P) {
            return;
        }
        this.P = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return k();
    }

    public final FontAssetManager j() {
        if (getCallback() == null) {
            return null;
        }
        if (this.n == null) {
            FontAssetManager fontAssetManager = new FontAssetManager(getCallback(), this.q);
            this.n = fontAssetManager;
            String str = this.p;
            if (str != null) {
                fontAssetManager.e = str;
            }
        }
        return this.n;
    }

    public final boolean k() {
        LottieValueAnimator lottieValueAnimator = this.e;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.p;
    }

    public final boolean l() {
        return this.s.f13344a.contains(LottieFeatureFlag.d);
    }

    public final void m() {
        this.j.clear();
        LottieValueAnimator lottieValueAnimator = this.e;
        lottieValueAnimator.g(true);
        Iterator it = lottieValueAnimator.f.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(lottieValueAnimator);
        }
        if (isVisible()) {
            return;
        }
        this.i = OnVisibleAction.d;
    }

    public final void n() {
        if (this.v == null) {
            this.j.add(new q(this, 1));
            return;
        }
        e();
        boolean zB = b(i());
        OnVisibleAction onVisibleAction = OnVisibleAction.d;
        LottieValueAnimator lottieValueAnimator = this.e;
        if (zB || lottieValueAnimator.getRepeatCount() == 0) {
            if (isVisible()) {
                lottieValueAnimator.p = true;
                boolean zF = lottieValueAnimator.f();
                Iterator it = lottieValueAnimator.e.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(lottieValueAnimator, zF);
                }
                lottieValueAnimator.h((int) (lottieValueAnimator.f() ? lottieValueAnimator.d() : lottieValueAnimator.e()));
                lottieValueAnimator.i = 0L;
                lottieValueAnimator.l = 0;
                if (lottieValueAnimator.p) {
                    lottieValueAnimator.g(false);
                    Choreographer.getInstance().postFrameCallback(lottieValueAnimator);
                }
                this.i = onVisibleAction;
            } else {
                this.i = OnVisibleAction.e;
            }
        }
        if (b(i())) {
            return;
        }
        Iterator it2 = U.iterator();
        Marker markerD = null;
        while (it2.hasNext()) {
            markerD = this.d.d((String) it2.next());
            if (markerD != null) {
                break;
            }
        }
        if (markerD != null) {
            r((int) markerD.b);
        } else {
            r((int) (lottieValueAnimator.g < BitmapDescriptorFactory.HUE_RED ? lottieValueAnimator.e() : lottieValueAnimator.d()));
        }
        lottieValueAnimator.g(true);
        lottieValueAnimator.a(lottieValueAnimator.f());
        if (isVisible()) {
            return;
        }
        this.i = onVisibleAction;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(android.graphics.Canvas r10, com.airbnb.lottie.model.layer.CompositionLayer r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieDrawable.o(android.graphics.Canvas, com.airbnb.lottie.model.layer.CompositionLayer):void");
    }

    public final void p() {
        if (this.v == null) {
            this.j.add(new q(this, 0));
            return;
        }
        e();
        boolean zB = b(i());
        OnVisibleAction onVisibleAction = OnVisibleAction.d;
        LottieValueAnimator lottieValueAnimator = this.e;
        if (zB || lottieValueAnimator.getRepeatCount() == 0) {
            if (isVisible()) {
                lottieValueAnimator.p = true;
                lottieValueAnimator.g(false);
                Choreographer.getInstance().postFrameCallback(lottieValueAnimator);
                lottieValueAnimator.i = 0L;
                if (lottieValueAnimator.f() && lottieValueAnimator.k == lottieValueAnimator.e()) {
                    lottieValueAnimator.h(lottieValueAnimator.d());
                } else if (!lottieValueAnimator.f() && lottieValueAnimator.k == lottieValueAnimator.d()) {
                    lottieValueAnimator.h(lottieValueAnimator.e());
                }
                Iterator it = lottieValueAnimator.f.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(lottieValueAnimator);
                }
                this.i = onVisibleAction;
            } else {
                this.i = OnVisibleAction.f;
            }
        }
        if (b(i())) {
            return;
        }
        r((int) (lottieValueAnimator.g < BitmapDescriptorFactory.HUE_RED ? lottieValueAnimator.e() : lottieValueAnimator.d()));
        lottieValueAnimator.g(true);
        lottieValueAnimator.a(lottieValueAnimator.f());
        if (isVisible()) {
            return;
        }
        this.i = onVisibleAction;
    }

    public final boolean q(LottieComposition lottieComposition) {
        if (this.d == lottieComposition) {
            return false;
        }
        this.P = true;
        d();
        this.d = lottieComposition;
        c();
        LottieValueAnimator lottieValueAnimator = this.e;
        boolean z = lottieValueAnimator.o == null;
        lottieValueAnimator.o = lottieComposition;
        if (z) {
            lottieValueAnimator.i(Math.max(lottieValueAnimator.m, lottieComposition.l), Math.min(lottieValueAnimator.n, lottieComposition.m));
        } else {
            lottieValueAnimator.i((int) lottieComposition.l, (int) lottieComposition.m);
        }
        float f = lottieValueAnimator.k;
        lottieValueAnimator.k = BitmapDescriptorFactory.HUE_RED;
        lottieValueAnimator.j = BitmapDescriptorFactory.HUE_RED;
        lottieValueAnimator.h((int) f);
        lottieValueAnimator.b();
        x(lottieValueAnimator.getAnimatedFraction());
        ArrayList arrayList = this.j;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            LazyCompositionTask lazyCompositionTask = (LazyCompositionTask) it.next();
            if (lazyCompositionTask != null) {
                lazyCompositionTask.run();
            }
            it.remove();
        }
        arrayList.clear();
        lottieComposition.f13342a.f13349a = this.x;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void r(int i) {
        if (this.d != null) {
            this.e.h(i);
        } else {
            this.j.add(new m(this, i, 2));
        }
    }

    public final void s(int i) {
        if (this.d == null) {
            this.j.add(new m(this, i, 0));
        } else {
            LottieValueAnimator lottieValueAnimator = this.e;
            lottieValueAnimator.i(lottieValueAnimator.m, i + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.w = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Logger.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        OnVisibleAction onVisibleAction = OnVisibleAction.f;
        if (z) {
            OnVisibleAction onVisibleAction2 = this.i;
            if (onVisibleAction2 == OnVisibleAction.e) {
                n();
                return visible;
            }
            if (onVisibleAction2 == onVisibleAction) {
                p();
                return visible;
            }
        } else {
            if (this.e.p) {
                m();
                this.i = onVisibleAction;
                return visible;
            }
            if (zIsVisible) {
                this.i = OnVisibleAction.d;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        n();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.j.clear();
        LottieValueAnimator lottieValueAnimator = this.e;
        lottieValueAnimator.g(true);
        lottieValueAnimator.a(lottieValueAnimator.f());
        if (isVisible()) {
            return;
        }
        this.i = OnVisibleAction.d;
    }

    public final void t(String str) {
        LottieComposition lottieComposition = this.d;
        if (lottieComposition == null) {
            this.j.add(new k(this, str, 1));
        } else {
            Marker markerD = lottieComposition.d(str);
            if (markerD == null) {
                throw new IllegalArgumentException(YU.a.h("Cannot find marker with name ", str, "."));
            }
            s((int) (markerD.b + markerD.c));
        }
    }

    public final void u(String str) {
        LottieComposition lottieComposition = this.d;
        ArrayList arrayList = this.j;
        if (lottieComposition == null) {
            arrayList.add(new k(this, str, 0));
            return;
        }
        Marker markerD = lottieComposition.d(str);
        if (markerD == null) {
            throw new IllegalArgumentException(YU.a.h("Cannot find marker with name ", str, "."));
        }
        int i = (int) markerD.b;
        int i2 = ((int) markerD.c) + i;
        if (this.d == null) {
            arrayList.add(new p(this, i, i2));
        } else {
            this.e.i(i, i2 + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(int i) {
        if (this.d == null) {
            this.j.add(new m(this, i, 1));
        } else {
            this.e.i(i, (int) r0.n);
        }
    }

    public final void w(String str) {
        LottieComposition lottieComposition = this.d;
        if (lottieComposition == null) {
            this.j.add(new k(this, str, 2));
        } else {
            Marker markerD = lottieComposition.d(str);
            if (markerD == null) {
                throw new IllegalArgumentException(YU.a.h("Cannot find marker with name ", str, "."));
            }
            v((int) markerD.b);
        }
    }

    public final void x(float f) {
        LottieComposition lottieComposition = this.d;
        if (lottieComposition == null) {
            this.j.add(new o(this, f, 2));
        } else {
            this.e.h(MiscUtils.e(lottieComposition.l, lottieComposition.m, f));
        }
    }

    public final boolean y() {
        LottieComposition lottieComposition = this.d;
        if (lottieComposition == null) {
            return false;
        }
        float f = this.T;
        float fC = this.e.c();
        this.T = fC;
        return Math.abs(fC - f) * lottieComposition.b() >= 50.0f;
    }
}
