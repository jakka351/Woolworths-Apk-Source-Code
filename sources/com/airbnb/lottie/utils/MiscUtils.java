package com.airbnb.lottie.utils;

import YU.a;
import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapeData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class MiscUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f13479a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void d(ShapeData shapeData, Path path) {
        Path path2;
        path.reset();
        PointF pointF = shapeData.b;
        ArrayList arrayList = shapeData.f13416a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = f13479a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            CubicCurveData cubicCurveData = (CubicCurveData) arrayList.get(i);
            PointF pointF3 = cubicCurveData.f13389a;
            PointF pointF4 = cubicCurveData.b;
            PointF pointF5 = cubicCurveData.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (shapeData.c) {
            path3.close();
        }
    }

    public static float e(float f, float f2, float f3) {
        return a.a(f2, f, f3, f);
    }

    public static void f(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2, KeyPathElementContent keyPathElementContent) {
        if (keyPath.a(i, keyPathElementContent.getName())) {
            String name = keyPathElementContent.getName();
            KeyPath keyPath3 = new KeyPath(keyPath2);
            keyPath3.f13393a.add(name);
            KeyPath keyPath4 = new KeyPath(keyPath3);
            keyPath4.b = keyPathElementContent;
            arrayList.add(keyPath4);
        }
    }
}
