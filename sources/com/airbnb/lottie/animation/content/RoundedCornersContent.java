package com.airbnb.lottie.animation.content;

import YU.a;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class RoundedCornersContent implements ShapeModifierContent, BaseKeyframeAnimation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final LottieDrawable f13366a;
    public final BaseKeyframeAnimation b;
    public ShapeData c;

    public RoundedCornersContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RoundedCorners roundedCorners) {
        this.f13366a = lottieDrawable;
        BaseKeyframeAnimation baseKeyframeAnimationG = roundedCorners.f13415a.g();
        this.b = baseKeyframeAnimationG;
        baseLayer.c(baseKeyframeAnimationG);
        baseKeyframeAnimationG.a(this);
    }

    public static int b(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.f13366a.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void f(List list, List list2) {
    }

    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public final ShapeData g(ShapeData shapeData) {
        ArrayList arrayList;
        float f;
        ShapeData shapeData2 = shapeData;
        ArrayList arrayList2 = shapeData2.f13416a;
        if (arrayList2.size() > 2) {
            float fFloatValue = ((Float) this.b.e()).floatValue();
            if (fFloatValue != BitmapDescriptorFactory.HUE_RED) {
                ArrayList arrayList3 = shapeData2.f13416a;
                boolean z = shapeData2.c;
                boolean z2 = true;
                int size = arrayList3.size() - 1;
                int i = 0;
                while (size >= 0) {
                    CubicCurveData cubicCurveData = (CubicCurveData) arrayList3.get(size);
                    CubicCurveData cubicCurveData2 = (CubicCurveData) arrayList3.get(b(size - 1, arrayList3.size()));
                    PointF pointF = (size != 0 || z) ? cubicCurveData2.c : shapeData2.b;
                    i = (((size != 0 || z) ? cubicCurveData2.b : pointF).equals(pointF) && cubicCurveData.f13389a.equals(pointF) && !(!shapeData2.c && (size == 0 || size == arrayList3.size() - 1))) ? i + 2 : i + 1;
                    size--;
                }
                ShapeData shapeData3 = this.c;
                if (shapeData3 == null || shapeData3.f13416a.size() != i) {
                    ArrayList arrayList4 = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList4.add(new CubicCurveData());
                    }
                    this.c = new ShapeData(new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), false, arrayList4);
                }
                ShapeData shapeData4 = this.c;
                shapeData4.c = z;
                PointF pointF2 = shapeData2.b;
                shapeData4.a(pointF2.x, pointF2.y);
                ArrayList arrayList5 = shapeData4.f13416a;
                boolean z3 = shapeData2.c;
                int i3 = 0;
                int i4 = 0;
                while (i3 < arrayList2.size()) {
                    CubicCurveData cubicCurveData3 = (CubicCurveData) arrayList2.get(i3);
                    CubicCurveData cubicCurveData4 = (CubicCurveData) arrayList2.get(b(i3 - 1, arrayList2.size()));
                    CubicCurveData cubicCurveData5 = (CubicCurveData) arrayList2.get(b(i3 - 2, arrayList2.size()));
                    PointF pointF3 = (i3 != 0 || z3) ? cubicCurveData4.c : shapeData2.b;
                    PointF pointF4 = (i3 != 0 || z3) ? cubicCurveData4.b : pointF3;
                    boolean z4 = z2;
                    PointF pointF5 = cubicCurveData3.f13389a;
                    PointF pointF6 = cubicCurveData5.c;
                    PointF pointF7 = cubicCurveData3.c;
                    boolean z5 = (shapeData2.c || !(i3 == 0 || i3 == arrayList2.size() + (-1))) ? false : z4;
                    if (pointF4.equals(pointF3) && pointF5.equals(pointF3) && !z5) {
                        float f2 = pointF3.x;
                        float f3 = f2 - pointF6.x;
                        float f4 = pointF3.y;
                        float f5 = f4 - pointF6.y;
                        float f6 = pointF7.x - f2;
                        float f7 = pointF7.y - f4;
                        arrayList = arrayList2;
                        float fHypot = (float) Math.hypot(f3, f5);
                        float fHypot2 = (float) Math.hypot(f6, f7);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f8 = pointF3.x;
                        float fA = a.a(pointF6.x, f8, fMin, f8);
                        float f9 = pointF3.y;
                        float fA2 = a.a(pointF6.y, f9, fMin, f9);
                        float fA3 = a.a(pointF7.x, f8, fMin2, f8);
                        float fA4 = a.a(pointF7.y, f9, fMin2, f9);
                        float f10 = fA - ((fA - f8) * 0.5519f);
                        float f11 = fA2 - ((fA2 - f9) * 0.5519f);
                        float f12 = fA3 - ((fA3 - f8) * 0.5519f);
                        float f13 = fA4 - ((fA4 - f9) * 0.5519f);
                        CubicCurveData cubicCurveData6 = (CubicCurveData) arrayList5.get(b(i4 - 1, arrayList5.size()));
                        CubicCurveData cubicCurveData7 = (CubicCurveData) arrayList5.get(i4);
                        f = fFloatValue;
                        cubicCurveData6.b.set(fA, fA2);
                        cubicCurveData6.c.set(fA, fA2);
                        if (i3 == 0) {
                            shapeData4.a(fA, fA2);
                        }
                        cubicCurveData7.f13389a.set(f10, f11);
                        CubicCurveData cubicCurveData8 = (CubicCurveData) arrayList5.get(i4 + 1);
                        cubicCurveData7.b.set(f12, f13);
                        cubicCurveData7.c.set(fA3, fA4);
                        cubicCurveData8.f13389a.set(fA3, fA4);
                        i4 += 2;
                    } else {
                        arrayList = arrayList2;
                        f = fFloatValue;
                        CubicCurveData cubicCurveData9 = (CubicCurveData) arrayList5.get(b(i4 - 1, arrayList5.size()));
                        CubicCurveData cubicCurveData10 = (CubicCurveData) arrayList5.get(i4);
                        PointF pointF8 = cubicCurveData4.b;
                        cubicCurveData9.b.set(pointF8.x, pointF8.y);
                        PointF pointF9 = cubicCurveData4.c;
                        cubicCurveData9.c.set(pointF9.x, pointF9.y);
                        PointF pointF10 = cubicCurveData3.f13389a;
                        cubicCurveData10.f13389a.set(pointF10.x, pointF10.y);
                        i4++;
                    }
                    i3++;
                    shapeData2 = shapeData;
                    z2 = z4;
                    arrayList2 = arrayList;
                    fFloatValue = f;
                }
                return shapeData4;
            }
        }
        return shapeData2;
    }
}
