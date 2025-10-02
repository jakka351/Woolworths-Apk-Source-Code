package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.collection.IndexBasedArrayIterator;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.PerformanceTracker;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.utils.MeanCalculator;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {
    public float A;
    public BlurMaskFilter B;
    public LPaint C;

    /* renamed from: a, reason: collision with root package name */
    public final Path f13423a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final LPaint d = new LPaint(1);
    public final LPaint e;
    public final LPaint f;
    public final LPaint g;
    public final LPaint h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final LottieDrawable o;
    public final Layer p;
    public final MaskKeyframeAnimation q;
    public final FloatKeyframeAnimation r;
    public BaseLayer s;
    public BaseLayer t;
    public List u;
    public final ArrayList v;
    public final TransformKeyframeAnimation w;
    public boolean x;
    public boolean y;
    public LPaint z;

    /* renamed from: com.airbnb.lottie.model.layer.BaseLayer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13424a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f13424a = iArr2;
            try {
                iArr2[4] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13424a[0] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13424a[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13424a[2] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13424a[3] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13424a[5] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13424a[6] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public BaseLayer(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new LPaint(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new LPaint(mode2);
        LPaint lPaint = new LPaint(1);
        this.g = lPaint;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        LPaint lPaint2 = new LPaint();
        lPaint2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = lPaint2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = BitmapDescriptorFactory.HUE_RED;
        this.o = lottieDrawable;
        this.p = layer;
        List list = layer.h;
        if (layer.u == Layer.MatteType.e) {
            lPaint.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(mode));
        }
        AnimatableTransform animatableTransform = layer.i;
        animatableTransform.getClass();
        TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
        this.w = transformKeyframeAnimation;
        transformKeyframeAnimation.b(this);
        if (list != null && !list.isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(list);
            this.q = maskKeyframeAnimation;
            Iterator it = maskKeyframeAnimation.f13373a.iterator();
            while (it.hasNext()) {
                ((BaseKeyframeAnimation) it.next()).a(this);
            }
            Iterator it2 = this.q.b.iterator();
            while (it2.hasNext()) {
                BaseKeyframeAnimation baseKeyframeAnimation = (BaseKeyframeAnimation) it2.next();
                c(baseKeyframeAnimation);
                baseKeyframeAnimation.a(this);
            }
        }
        Layer layer2 = this.p;
        if (layer2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(layer2.t);
        this.r = floatKeyframeAnimation;
        floatKeyframeAnimation.b = true;
        floatKeyframeAnimation.a(new BaseKeyframeAnimation.AnimationListener() { // from class: com.airbnb.lottie.model.layer.a
            @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
            public final void e() {
                BaseLayer baseLayer = this.f13429a;
                boolean z = baseLayer.r.k() == 1.0f;
                if (z != baseLayer.x) {
                    baseLayer.x = z;
                    baseLayer.o.invalidateSelf();
                }
            }
        });
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        c(this.r);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        i();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((BaseLayer) this.u.get(size)).w.e());
                }
            } else {
                BaseLayer baseLayer = this.t;
                if (baseLayer != null) {
                    matrix2.preConcat(baseLayer.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void b(LottieValueCallback lottieValueCallback, Object obj) {
        this.w.c(lottieValueCallback, obj);
    }

    public final void c(BaseKeyframeAnimation baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.v.add(baseKeyframeAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.BaseLayer.d(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.o.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void f(List list, List list2) {
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void h(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        BaseLayer baseLayer = this.s;
        Layer layer = this.p;
        if (baseLayer != null) {
            String str = baseLayer.p.c;
            KeyPath keyPath3 = new KeyPath(keyPath2);
            keyPath3.f13393a.add(str);
            if (keyPath.a(i, this.s.p.c)) {
                BaseLayer baseLayer2 = this.s;
                KeyPath keyPath4 = new KeyPath(keyPath3);
                keyPath4.b = baseLayer2;
                arrayList.add(keyPath4);
            }
            if (keyPath.d(i, layer.c)) {
                this.s.p(keyPath, keyPath.b(i, this.s.p.c) + i, arrayList, keyPath3);
            }
        }
        String str2 = layer.c;
        String str3 = layer.c;
        if (keyPath.c(i, str2)) {
            if (!"__container".equals(str3)) {
                KeyPath keyPath5 = new KeyPath(keyPath2);
                keyPath5.f13393a.add(str3);
                if (keyPath.a(i, str3)) {
                    KeyPath keyPath6 = new KeyPath(keyPath5);
                    keyPath6.b = this;
                    arrayList.add(keyPath6);
                }
                keyPath2 = keyPath5;
            }
            if (keyPath.d(i, str3)) {
                p(keyPath, keyPath.b(i, str3) + i, arrayList, keyPath2);
            }
        }
    }

    public final void i() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (BaseLayer baseLayer = this.t; baseLayer != null; baseLayer = baseLayer.t) {
            this.u.add(baseLayer);
        }
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i);

    public BlurEffect k() {
        return this.p.w;
    }

    public DropShadowEffect l() {
        return this.p.x;
    }

    public final boolean m() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.q;
        return (maskKeyframeAnimation == null || maskKeyframeAnimation.f13373a.isEmpty()) ? false : true;
    }

    public final void n() {
        PerformanceTracker performanceTracker = this.o.d.f13342a;
        String str = this.p.c;
        HashMap map = performanceTracker.c;
        if (!performanceTracker.f13349a) {
            return;
        }
        MeanCalculator meanCalculator = (MeanCalculator) map.get(str);
        if (meanCalculator == null) {
            meanCalculator = new MeanCalculator();
            map.put(str, meanCalculator);
        }
        int i = meanCalculator.f13478a + 1;
        meanCalculator.f13478a = i;
        if (i == Integer.MAX_VALUE) {
            meanCalculator.f13478a = i / 2;
        }
        if (!str.equals("__container")) {
            return;
        }
        Iterator it = performanceTracker.b.iterator();
        while (true) {
            IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
            if (!indexBasedArrayIterator.hasNext()) {
                return;
            } else {
                ((PerformanceTracker.FrameListener) indexBasedArrayIterator.next()).a();
            }
        }
    }

    public final void o(BaseKeyframeAnimation baseKeyframeAnimation) {
        this.v.remove(baseKeyframeAnimation);
    }

    public void p(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
    }

    public void q(boolean z) {
        if (z && this.z == null) {
            this.z = new LPaint();
        }
        this.y = z;
    }

    public void r(float f) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.w;
        BaseKeyframeAnimation baseKeyframeAnimation = transformKeyframeAnimation.j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = transformKeyframeAnimation.m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = transformKeyframeAnimation.n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = transformKeyframeAnimation.f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation5 = transformKeyframeAnimation.g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation6 = transformKeyframeAnimation.h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.i(f);
        }
        BaseKeyframeAnimation baseKeyframeAnimation7 = transformKeyframeAnimation.i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.i(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = transformKeyframeAnimation.k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.i(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = transformKeyframeAnimation.l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.i(f);
        }
        int i = 0;
        MaskKeyframeAnimation maskKeyframeAnimation = this.q;
        if (maskKeyframeAnimation != null) {
            ArrayList arrayList = maskKeyframeAnimation.f13373a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((BaseKeyframeAnimation) arrayList.get(i2)).i(f);
            }
        }
        FloatKeyframeAnimation floatKeyframeAnimation3 = this.r;
        if (floatKeyframeAnimation3 != null) {
            floatKeyframeAnimation3.i(f);
        }
        BaseLayer baseLayer = this.s;
        if (baseLayer != null) {
            baseLayer.r(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((BaseKeyframeAnimation) arrayList2.get(i)).i(f);
            i++;
        }
    }
}
