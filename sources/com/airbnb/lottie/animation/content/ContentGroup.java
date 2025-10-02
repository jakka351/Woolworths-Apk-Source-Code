package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ContentGroup implements DrawingContent, PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* renamed from: a, reason: collision with root package name */
    public final LPaint f13356a;
    public final RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final ArrayList h;
    public final LottieDrawable i;
    public ArrayList j;
    public final TransformKeyframeAnimation k;

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeGroup shapeGroup, LottieComposition lottieComposition) {
        AnimatableTransform animatableTransform;
        String str = shapeGroup.f13418a;
        boolean z = shapeGroup.c;
        List list = shapeGroup.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Content contentA = ((ContentModel) list.get(i2)).a(lottieDrawable, lottieComposition, baseLayer);
            if (contentA != null) {
                arrayList.add(contentA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                animatableTransform = null;
                break;
            }
            ContentModel contentModel = (ContentModel) list.get(i);
            if (contentModel instanceof AnimatableTransform) {
                animatableTransform = (AnimatableTransform) contentModel;
                break;
            }
            i++;
        }
        this(lottieDrawable, baseLayer, str, z, arrayList, animatableTransform);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.k;
        if (transformKeyframeAnimation != null) {
            matrix2.preConcat(transformKeyframeAnimation.e());
        }
        RectF rectF2 = this.e;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Content content = (Content) arrayList.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).a(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.k;
        if (transformKeyframeAnimation != null) {
            transformKeyframeAnimation.c(lottieValueCallback, obj);
        }
    }

    public final List c() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i >= arrayList.size()) {
                    break;
                }
                Content content = (Content) arrayList.get(i);
                if (content instanceof PathContent) {
                    this.j.add((PathContent) content);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void d(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.k;
        if (transformKeyframeAnimation != null) {
            matrix2.preConcat(transformKeyframeAnimation.e());
            i = (int) (((((transformKeyframeAnimation.j == null ? 100 : ((Integer) r9.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.z;
        boolean z2 = false;
        ArrayList arrayList = this.h;
        if (z) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (!(arrayList.get(i2) instanceof DrawingContent) || (i3 = i3 + 1) < 2) {
                    i2++;
                } else if (i != 255) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            RectF rectF = this.b;
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            a(rectF, matrix2, true);
            LPaint lPaint = this.f13356a;
            lPaint.setAlpha(i);
            ThreadLocal threadLocal = Utils.f13480a;
            canvas.saveLayer(rectF, lPaint);
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof DrawingContent) {
                ((DrawingContent) obj).d(canvas, matrix2, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void f(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            Content content = (Content) arrayList.get(size2);
            content.f(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(content);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        throw null;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        Matrix matrix = this.c;
        matrix.reset();
        TransformKeyframeAnimation transformKeyframeAnimation = this.k;
        if (transformKeyframeAnimation != null) {
            matrix.set(transformKeyframeAnimation.e());
        }
        Path path = this.d;
        path.reset();
        if (!this.g) {
            ArrayList arrayList = this.h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Content content = (Content) arrayList.get(size);
                if (content instanceof PathContent) {
                    path.addPath(((PathContent) content).getPath(), matrix);
                }
            }
        }
        return path;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void h(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        String str = this.f;
        if (!keyPath.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            KeyPath keyPath3 = new KeyPath(keyPath2);
            keyPath3.f13393a.add(str);
            if (keyPath.a(i, str)) {
                KeyPath keyPath4 = new KeyPath(keyPath3);
                keyPath4.b = this;
                arrayList.add(keyPath4);
            }
            keyPath2 = keyPath3;
        }
        if (!keyPath.d(i, str)) {
            return;
        }
        int iB = keyPath.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i2 >= arrayList2.size()) {
                return;
            }
            Content content = (Content) arrayList2.get(i2);
            if (content instanceof KeyPathElement) {
                ((KeyPathElement) content).h(keyPath, iB, arrayList, keyPath2);
            }
            i2++;
        }
    }

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, String str, boolean z, ArrayList arrayList, AnimatableTransform animatableTransform) {
        this.f13356a = new LPaint();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = lottieDrawable;
        this.g = z;
        this.h = arrayList;
        if (animatableTransform != null) {
            TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
            this.k = transformKeyframeAnimation;
            transformKeyframeAnimation.a(baseLayer);
            transformKeyframeAnimation.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Content content = (Content) arrayList.get(size);
            if (content instanceof GreedyContent) {
                arrayList2.add((GreedyContent) content);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((GreedyContent) arrayList2.get(size2)).c(arrayList.listIterator(arrayList.size()));
        }
    }
}
