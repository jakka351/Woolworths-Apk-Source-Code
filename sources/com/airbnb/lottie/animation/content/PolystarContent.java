package com.airbnb.lottie.animation.content;

import YU.a;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class PolystarContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    public final String e;
    public final LottieDrawable f;
    public final PolystarShape.Type g;
    public final boolean h;
    public final boolean i;
    public final FloatKeyframeAnimation j;
    public final BaseKeyframeAnimation k;
    public final FloatKeyframeAnimation l;
    public final FloatKeyframeAnimation m;
    public final FloatKeyframeAnimation n;
    public final FloatKeyframeAnimation o;
    public final FloatKeyframeAnimation p;
    public boolean r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f13362a = new Path();
    public final Path b = new Path();
    public final PathMeasure c = new PathMeasure();
    public final float[] d = new float[2];
    public final CompoundTrimPathContent q = new CompoundTrimPathContent();

    /* renamed from: com.airbnb.lottie.animation.content.PolystarContent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13363a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f13363a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13363a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.f = lottieDrawable;
        this.e = polystarShape.f13412a;
        PolystarShape.Type type = polystarShape.b;
        this.g = type;
        this.h = polystarShape.j;
        this.i = polystarShape.k;
        FloatKeyframeAnimation floatKeyframeAnimationG = polystarShape.c.g();
        this.j = floatKeyframeAnimationG;
        BaseKeyframeAnimation baseKeyframeAnimationG = polystarShape.d.g();
        this.k = baseKeyframeAnimationG;
        FloatKeyframeAnimation floatKeyframeAnimationG2 = polystarShape.e.g();
        this.l = floatKeyframeAnimationG2;
        FloatKeyframeAnimation floatKeyframeAnimationG3 = polystarShape.g.g();
        this.n = floatKeyframeAnimationG3;
        FloatKeyframeAnimation floatKeyframeAnimationG4 = polystarShape.i.g();
        this.p = floatKeyframeAnimationG4;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.m = polystarShape.f.g();
            this.o = polystarShape.h.g();
        } else {
            this.m = null;
            this.o = null;
        }
        baseLayer.c(floatKeyframeAnimationG);
        baseLayer.c(baseKeyframeAnimationG);
        baseLayer.c(floatKeyframeAnimationG2);
        baseLayer.c(floatKeyframeAnimationG3);
        baseLayer.c(floatKeyframeAnimationG4);
        if (type == type2) {
            baseLayer.c(this.m);
            baseLayer.c(this.o);
        }
        floatKeyframeAnimationG.a(this);
        baseKeyframeAnimationG.a(this);
        floatKeyframeAnimationG2.a(this);
        floatKeyframeAnimationG3.a(this);
        floatKeyframeAnimationG4.a(this);
        if (type == type2) {
            this.m.a(this);
            this.o.a(this);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        FloatKeyframeAnimation floatKeyframeAnimation;
        FloatKeyframeAnimation floatKeyframeAnimation2;
        if (obj == LottieProperty.r) {
            this.j.j(lottieValueCallback);
            return;
        }
        if (obj == LottieProperty.s) {
            this.l.j(lottieValueCallback);
            return;
        }
        if (obj == LottieProperty.i) {
            this.k.j(lottieValueCallback);
            return;
        }
        if (obj == LottieProperty.t && (floatKeyframeAnimation2 = this.m) != null) {
            floatKeyframeAnimation2.j(lottieValueCallback);
            return;
        }
        if (obj == LottieProperty.u) {
            this.n.j(lottieValueCallback);
            return;
        }
        if (obj == LottieProperty.v && (floatKeyframeAnimation = this.o) != null) {
            floatKeyframeAnimation.j(lottieValueCallback);
        } else if (obj == LottieProperty.w) {
            this.p.j(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.r = false;
        this.f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void f(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            Content content = (Content) arrayList.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.c == ShapeTrimPath.Type.d) {
                    this.q.f13355a.add(trimPathContent);
                    trimPathContent.b(this);
                }
            }
            i++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.e;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        boolean z;
        float f;
        double d;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        double d2;
        boolean z2 = this.r;
        Path path = this.f13362a;
        if (z2) {
            return path;
        }
        path.reset();
        if (this.h) {
            this.r = true;
            return path;
        }
        int iOrdinal = this.g.ordinal();
        BaseKeyframeAnimation baseKeyframeAnimation = this.k;
        FloatKeyframeAnimation floatKeyframeAnimation = this.n;
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.p;
        FloatKeyframeAnimation floatKeyframeAnimation3 = this.l;
        FloatKeyframeAnimation floatKeyframeAnimation4 = this.j;
        if (iOrdinal == 0) {
            z = true;
            float fFloatValue = ((Float) floatKeyframeAnimation4.e()).floatValue();
            double radians = Math.toRadians((floatKeyframeAnimation3 != null ? ((Float) floatKeyframeAnimation3.e()).floatValue() : 0.0d) - 90.0d);
            double d3 = fFloatValue;
            float f7 = (float) (6.283185307179586d / d3);
            if (this.i) {
                f7 *= -1.0f;
            }
            float f8 = f7;
            float f9 = f8 / 2.0f;
            float f10 = fFloatValue - ((int) fFloatValue);
            if (f10 != BitmapDescriptorFactory.HUE_RED) {
                f = 2.0f;
                radians += (1.0f - f10) * f9;
            } else {
                f = 2.0f;
            }
            float fFloatValue2 = ((Float) floatKeyframeAnimation.e()).floatValue();
            float fFloatValue3 = ((Float) this.m.e()).floatValue();
            FloatKeyframeAnimation floatKeyframeAnimation5 = this.o;
            float fFloatValue4 = floatKeyframeAnimation5 != null ? ((Float) floatKeyframeAnimation5.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = floatKeyframeAnimation2 != null ? ((Float) floatKeyframeAnimation2.e()).floatValue() / 100.0f : 0.0f;
            if (f10 != BitmapDescriptorFactory.HUE_RED) {
                float fA = a.a(fFloatValue2, fFloatValue3, f10, fFloatValue3);
                double d4 = fA;
                f4 = fA;
                float fCos = (float) (Math.cos(radians) * d4);
                float fSin = (float) (Math.sin(radians) * d4);
                path.moveTo(fCos, fSin);
                d = radians + ((f8 * f10) / f);
                f2 = fCos;
                f3 = fSin;
            } else {
                double d5 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d5);
                float fSin2 = (float) (Math.sin(radians) * d5);
                path.moveTo(fCos2, fSin2);
                d = radians + f9;
                f2 = fCos2;
                f3 = fSin2;
                f4 = 0.0f;
            }
            double dCeil = Math.ceil(d3) * 2.0d;
            double d6 = d;
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                double d7 = i2;
                if (d7 >= dCeil) {
                    break;
                }
                float f11 = z3 ? fFloatValue2 : fFloatValue3;
                float f12 = (f4 == BitmapDescriptorFactory.HUE_RED || d7 != dCeil - 2.0d) ? f9 : (f8 * f10) / f;
                if (f4 != BitmapDescriptorFactory.HUE_RED && d7 == dCeil - 1.0d) {
                    f11 = f4;
                }
                double d8 = f11;
                float fCos3 = (float) (Math.cos(d6) * d8);
                float fSin3 = (float) (Math.sin(d6) * d8);
                if (fFloatValue4 == BitmapDescriptorFactory.HUE_RED && fFloatValue5 == BitmapDescriptorFactory.HUE_RED) {
                    path.lineTo(fCos3, fSin3);
                    f5 = f10;
                    f6 = fCos3;
                } else {
                    f5 = f10;
                    Path path2 = path;
                    double dAtan2 = (float) (Math.atan2(f3, f2) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f13 = f2;
                    float f14 = f3;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f15 = z3 ? fFloatValue4 : fFloatValue5;
                    float f16 = z3 ? fFloatValue5 : fFloatValue4;
                    float f17 = (z3 ? fFloatValue3 : fFloatValue2) * f15 * 0.47829f;
                    float f18 = fCos4 * f17;
                    float f19 = f17 * fSin4;
                    float f20 = (z3 ? fFloatValue2 : fFloatValue3) * f16 * 0.47829f;
                    float f21 = fCos5 * f20;
                    float f22 = f20 * fSin5;
                    if (f10 != BitmapDescriptorFactory.HUE_RED) {
                        if (i2 == 0) {
                            f18 *= f5;
                            f19 *= f5;
                        } else if (d7 == dCeil - 1.0d) {
                            f21 *= f5;
                            f22 *= f5;
                        }
                    }
                    f6 = fCos3;
                    path = path2;
                    path.cubicTo(f13 - f18, f14 - f19, f21 + fCos3, fSin3 + f22, f6, fSin3);
                }
                d6 += f12;
                z3 = !z3;
                i2++;
                f2 = f6;
                f3 = fSin3;
                f10 = f5;
                f = 2.0f;
            }
            PointF pointF = (PointF) baseKeyframeAnimation.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iOrdinal != 1) {
            z = true;
        } else {
            int iFloor = (int) Math.floor(((Float) floatKeyframeAnimation4.e()).floatValue());
            double radians2 = Math.toRadians((floatKeyframeAnimation3 != null ? ((Float) floatKeyframeAnimation3.e()).floatValue() : 0.0d) - 90.0d);
            double d9 = iFloor;
            float fFloatValue6 = ((Float) floatKeyframeAnimation2.e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) floatKeyframeAnimation.e()).floatValue();
            double d10 = fFloatValue7;
            z = true;
            float fCos6 = (float) (Math.cos(radians2) * d10);
            float fSin6 = (float) (Math.sin(radians2) * d10);
            path.moveTo(fCos6, fSin6);
            double d11 = (float) (6.283185307179586d / d9);
            double dCeil2 = Math.ceil(d9);
            double d12 = radians2 + d11;
            int i3 = 0;
            while (true) {
                double d13 = i3;
                if (d13 >= dCeil2) {
                    break;
                }
                double d14 = dCeil2;
                float fCos7 = (float) (Math.cos(d12) * d10);
                float fSin7 = (float) (Math.sin(d12) * d10);
                if (fFloatValue6 != BitmapDescriptorFactory.HUE_RED) {
                    i = i3;
                    Path path3 = path;
                    d2 = d10;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f23 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f24 = f23 * fCos8;
                    float f25 = f23 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f23;
                    float fSin9 = f23 * ((float) Math.sin(dAtan24));
                    if (d13 == d14 - 1.0d) {
                        Path path4 = this.b;
                        path4.reset();
                        path4.moveTo(fCos6, fSin6);
                        float f26 = fCos6 - f24;
                        float f27 = fSin6 - f25;
                        float f28 = fCos7 + fCos9;
                        float f29 = fSin7 + fSin9;
                        path4.cubicTo(f26, f27, f28, f29, fCos7, fSin7);
                        PathMeasure pathMeasure = this.c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f26, f27, f28, f29, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f30 = fSin7 + fSin9;
                        path = path3;
                        fSin6 = fSin7;
                        path.cubicTo(fCos6 - f24, fSin6 - f25, fCos7 + fCos9, f30, fCos7, fSin6);
                        fCos6 = fCos7;
                    }
                } else {
                    i = i3;
                    d2 = d10;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d13 == d14 - 1.0d) {
                        i3 = i + 1;
                        dCeil2 = d14;
                        d10 = d2;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d12 += d11;
                i3 = i + 1;
                dCeil2 = d14;
                d10 = d2;
            }
            PointF pointF2 = (PointF) baseKeyframeAnimation.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.q.a(path);
        this.r = z;
        return path;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void h(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i, arrayList, keyPath2, this);
    }
}
