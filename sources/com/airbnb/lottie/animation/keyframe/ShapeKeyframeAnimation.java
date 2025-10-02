package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.ShapeModifierContent;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ShapeKeyframeAnimation extends BaseKeyframeAnimation<ShapeData, Path> {
    public final ShapeData i;
    public final Path j;
    public Path k;
    public Path l;
    public ArrayList m;

    public ShapeKeyframeAnimation(List list) {
        super(list);
        this.i = new ShapeData();
        this.j = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f(Keyframe keyframe, float f) {
        ShapeData shapeDataG;
        ShapeData shapeData = (ShapeData) keyframe.b;
        ShapeData shapeData2 = (ShapeData) keyframe.c;
        ShapeData shapeData3 = shapeData2 == null ? shapeData : shapeData2;
        ShapeData shapeData4 = this.i;
        ArrayList arrayList = shapeData4.f13416a;
        if (shapeData4.b == null) {
            shapeData4.b = new PointF();
        }
        boolean z = shapeData.c;
        ArrayList arrayList2 = shapeData.f13416a;
        boolean z2 = true;
        shapeData4.c = z || shapeData3.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = shapeData3.f13416a;
        if (size != arrayList3.size()) {
            Logger.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new CubicCurveData());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = shapeData.b;
        PointF pointF2 = shapeData3.b;
        shapeData4.a(MiscUtils.e(pointF.x, pointF2.x, f), MiscUtils.e(pointF.y, pointF2.y, f));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            CubicCurveData cubicCurveData = (CubicCurveData) arrayList2.get(size4);
            CubicCurveData cubicCurveData2 = (CubicCurveData) arrayList3.get(size4);
            PointF pointF3 = cubicCurveData.f13389a;
            PointF pointF4 = cubicCurveData.b;
            PointF pointF5 = cubicCurveData.c;
            PointF pointF6 = cubicCurveData2.f13389a;
            boolean z3 = z2;
            PointF pointF7 = cubicCurveData2.b;
            PointF pointF8 = cubicCurveData2.c;
            ((CubicCurveData) arrayList.get(size4)).f13389a.set(MiscUtils.e(pointF3.x, pointF6.x, f), MiscUtils.e(pointF3.y, pointF6.y, f));
            ((CubicCurveData) arrayList.get(size4)).b.set(MiscUtils.e(pointF4.x, pointF7.x, f), MiscUtils.e(pointF4.y, pointF7.y, f));
            ((CubicCurveData) arrayList.get(size4)).c.set(MiscUtils.e(pointF5.x, pointF8.x, f), MiscUtils.e(pointF5.y, pointF8.y, f));
            size4--;
            z2 = z3;
            arrayList2 = arrayList2;
            shapeData4 = shapeData4;
            arrayList3 = arrayList3;
        }
        ShapeData shapeData5 = shapeData4;
        ArrayList arrayList4 = this.m;
        if (arrayList4 != null) {
            shapeDataG = shapeData5;
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                shapeDataG = ((ShapeModifierContent) this.m.get(size5)).g(shapeDataG);
            }
        } else {
            shapeDataG = shapeData5;
        }
        Path path = this.j;
        MiscUtils.d(shapeDataG, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        MiscUtils.d(shapeData, this.k);
        if (shapeData2 != null) {
            MiscUtils.d(shapeData2, this.l);
        }
        LottieValueCallback lottieValueCallback = this.e;
        float f2 = keyframe.g;
        float fFloatValue = keyframe.h.floatValue();
        Path path2 = this.k;
        return (Path) lottieValueCallback.b(f2, fFloatValue, path2, shapeData2 == null ? path2 : this.l, f, d(), this.d);
    }
}
