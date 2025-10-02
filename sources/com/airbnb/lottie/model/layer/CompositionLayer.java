package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class CompositionLayer extends BaseLayer {
    public BaseKeyframeAnimation D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final Paint H;
    public float I;
    public boolean J;

    /* renamed from: com.airbnb.lottie.model.layer.CompositionLayer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13425a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f13425a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13425a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CompositionLayer(LottieDrawable lottieDrawable, Layer layer, List list, LottieComposition lottieComposition) {
        int i;
        BaseLayer baseLayer;
        BaseLayer compositionLayer;
        super(lottieDrawable, layer);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Paint();
        this.J = true;
        AnimatableFloatValue animatableFloatValue = layer.s;
        if (animatableFloatValue != null) {
            FloatKeyframeAnimation floatKeyframeAnimationG = animatableFloatValue.g();
            this.D = floatKeyframeAnimationG;
            c(floatKeyframeAnimationG);
            this.D.a(this);
        } else {
            this.D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lottieComposition.j.size());
        int size = list.size() - 1;
        BaseLayer baseLayer2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = (Layer) list.get(size);
            int iOrdinal = layer2.e.ordinal();
            if (iOrdinal == 0) {
                compositionLayer = new CompositionLayer(lottieDrawable, layer2, (List) lottieComposition.c.get(layer2.g), lottieComposition);
            } else if (iOrdinal == 1) {
                compositionLayer = new SolidLayer(lottieDrawable, layer2);
            } else if (iOrdinal == 2) {
                compositionLayer = new ImageLayer(lottieDrawable, layer2);
            } else if (iOrdinal == 3) {
                compositionLayer = new NullLayer(lottieDrawable, layer2);
            } else if (iOrdinal == 4) {
                compositionLayer = new ShapeLayer(lottieDrawable, layer2, this, lottieComposition);
            } else if (iOrdinal != 5) {
                Logger.b("Unknown layer type " + layer2.e);
                compositionLayer = null;
            } else {
                compositionLayer = new TextLayer(lottieDrawable, layer2);
            }
            if (compositionLayer != null) {
                longSparseArray.h(compositionLayer.p.d, compositionLayer);
                if (baseLayer2 != null) {
                    baseLayer2.s = compositionLayer;
                    baseLayer2 = null;
                } else {
                    this.E.add(0, compositionLayer);
                    int iOrdinal2 = layer2.u.ordinal();
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        baseLayer2 = compositionLayer;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.j(); i++) {
            BaseLayer baseLayer3 = (BaseLayer) longSparseArray.c(longSparseArray.g(i));
            if (baseLayer3 != null && (baseLayer = (BaseLayer) longSparseArray.c(baseLayer3.p.f)) != null) {
                baseLayer3.t = baseLayer;
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            ((BaseLayer) arrayList.get(size)).a(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        super.b(lottieValueCallback, obj);
        if (obj == LottieProperty.z) {
            if (lottieValueCallback == null) {
                BaseKeyframeAnimation baseKeyframeAnimation = this.D;
                if (baseKeyframeAnimation != null) {
                    baseKeyframeAnimation.j(null);
                    return;
                }
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.D = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.a(this);
            c(this.D);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void j(Canvas canvas, Matrix matrix, int i) {
        Layer layer = this.p;
        float f = layer.o;
        float f2 = layer.p;
        RectF rectF = this.G;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2);
        matrix.mapRect(rectF);
        boolean z = this.o.z;
        ArrayList arrayList = this.E;
        boolean z2 = z && arrayList.size() > 1 && i != 255;
        if (z2) {
            Paint paint = this.H;
            paint.setAlpha(i);
            ThreadLocal threadLocal = Utils.f13480a;
            canvas.saveLayer(rectF, paint);
        } else {
            canvas.save();
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.J || !"__container".equals(layer.c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((BaseLayer) arrayList.get(size)).d(canvas, matrix, i);
            }
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void p(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((BaseLayer) arrayList2.get(i2)).h(keyPath, i, arrayList, keyPath2);
            i2++;
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void q(boolean z) {
        super.q(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((BaseLayer) it.next()).q(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void r(float f) {
        this.I = f;
        super.r(f);
        BaseKeyframeAnimation baseKeyframeAnimation = this.D;
        Layer layer = this.p;
        if (baseKeyframeAnimation != null) {
            LottieComposition lottieComposition = this.o.d;
            f = ((((Float) baseKeyframeAnimation.e()).floatValue() * layer.b.n) - layer.b.l) / ((lottieComposition.m - lottieComposition.l) + 0.01f);
        }
        if (this.D == null) {
            float f2 = layer.n;
            LottieComposition lottieComposition2 = layer.b;
            f -= f2 / (lottieComposition2.m - lottieComposition2.l);
        }
        if (layer.m != BitmapDescriptorFactory.HUE_RED && !"__container".equals(layer.c)) {
            f /= layer.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((BaseLayer) arrayList.get(size)).r(f);
        }
    }
}
