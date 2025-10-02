package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTextRangeSelector;
import com.airbnb.lottie.model.animatable.AnimatableTextStyle;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class TextLayer extends BaseLayer {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final Paint G;
    public final Paint H;
    public final HashMap I;
    public final LongSparseArray J;
    public final ArrayList K;
    public final TextKeyframeAnimation L;
    public final LottieDrawable M;
    public final LottieComposition N;
    public final TextRangeUnits O;
    public final ColorKeyframeAnimation P;
    public ValueCallbackKeyframeAnimation Q;
    public final ColorKeyframeAnimation R;
    public ValueCallbackKeyframeAnimation S;
    public final FloatKeyframeAnimation T;
    public ValueCallbackKeyframeAnimation U;
    public final FloatKeyframeAnimation V;
    public ValueCallbackKeyframeAnimation W;
    public final IntegerKeyframeAnimation X;
    public ValueCallbackKeyframeAnimation Y;
    public ValueCallbackKeyframeAnimation Z;
    public final IntegerKeyframeAnimation a0;
    public final IntegerKeyframeAnimation b0;
    public final IntegerKeyframeAnimation c0;

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$1, reason: invalid class name */
    public class AnonymousClass1 extends Paint {
    }

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$2, reason: invalid class name */
    public class AnonymousClass2 extends Paint {
    }

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13427a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f13427a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13427a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13427a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class TextSubLine {

        /* renamed from: a, reason: collision with root package name */
        public String f13428a;
        public float b;
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        AnimatableTextRangeSelector animatableTextRangeSelector;
        AnimatableTextRangeSelector animatableTextRangeSelector2;
        AnimatableIntegerValue animatableIntegerValue;
        AnimatableTextRangeSelector animatableTextRangeSelector3;
        AnimatableIntegerValue animatableIntegerValue2;
        AnimatableTextRangeSelector animatableTextRangeSelector4;
        AnimatableIntegerValue animatableIntegerValue3;
        AnimatableTextStyle animatableTextStyle;
        AnimatableIntegerValue animatableIntegerValue4;
        AnimatableTextStyle animatableTextStyle2;
        AnimatableFloatValue animatableFloatValue;
        AnimatableTextStyle animatableTextStyle3;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableTextStyle animatableTextStyle4;
        AnimatableColorValue animatableColorValue;
        AnimatableTextStyle animatableTextStyle5;
        AnimatableColorValue animatableColorValue2;
        super(lottieDrawable, layer);
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(1);
        anonymousClass1.setStyle(Paint.Style.FILL);
        this.G = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(1);
        anonymousClass2.setStyle(Paint.Style.STROKE);
        this.H = anonymousClass2;
        this.I = new HashMap();
        this.J = new LongSparseArray((Object) null);
        this.K = new ArrayList();
        this.O = TextRangeUnits.e;
        this.M = lottieDrawable;
        this.N = layer.b;
        TextKeyframeAnimation textKeyframeAnimationG = layer.q.g();
        this.L = textKeyframeAnimationG;
        textKeyframeAnimationG.a(this);
        c(textKeyframeAnimationG);
        AnimatableTextProperties animatableTextProperties = layer.r;
        if (animatableTextProperties != null && (animatableTextStyle5 = animatableTextProperties.f13399a) != null && (animatableColorValue2 = animatableTextStyle5.f13401a) != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG = animatableColorValue2.g();
            this.P = (ColorKeyframeAnimation) baseKeyframeAnimationG;
            baseKeyframeAnimationG.a(this);
            c(baseKeyframeAnimationG);
        }
        if (animatableTextProperties != null && (animatableTextStyle4 = animatableTextProperties.f13399a) != null && (animatableColorValue = animatableTextStyle4.b) != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG2 = animatableColorValue.g();
            this.R = (ColorKeyframeAnimation) baseKeyframeAnimationG2;
            baseKeyframeAnimationG2.a(this);
            c(baseKeyframeAnimationG2);
        }
        if (animatableTextProperties != null && (animatableTextStyle3 = animatableTextProperties.f13399a) != null && (animatableFloatValue2 = animatableTextStyle3.c) != null) {
            FloatKeyframeAnimation floatKeyframeAnimationG = animatableFloatValue2.g();
            this.T = floatKeyframeAnimationG;
            floatKeyframeAnimationG.a(this);
            c(floatKeyframeAnimationG);
        }
        if (animatableTextProperties != null && (animatableTextStyle2 = animatableTextProperties.f13399a) != null && (animatableFloatValue = animatableTextStyle2.d) != null) {
            FloatKeyframeAnimation floatKeyframeAnimationG2 = animatableFloatValue.g();
            this.V = floatKeyframeAnimationG2;
            floatKeyframeAnimationG2.a(this);
            c(floatKeyframeAnimationG2);
        }
        if (animatableTextProperties != null && (animatableTextStyle = animatableTextProperties.f13399a) != null && (animatableIntegerValue4 = animatableTextStyle.e) != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG3 = animatableIntegerValue4.g();
            this.X = (IntegerKeyframeAnimation) baseKeyframeAnimationG3;
            baseKeyframeAnimationG3.a(this);
            c(baseKeyframeAnimationG3);
        }
        if (animatableTextProperties != null && (animatableTextRangeSelector4 = animatableTextProperties.b) != null && (animatableIntegerValue3 = animatableTextRangeSelector4.f13400a) != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG4 = animatableIntegerValue3.g();
            this.a0 = (IntegerKeyframeAnimation) baseKeyframeAnimationG4;
            baseKeyframeAnimationG4.a(this);
            c(baseKeyframeAnimationG4);
        }
        if (animatableTextProperties != null && (animatableTextRangeSelector3 = animatableTextProperties.b) != null && (animatableIntegerValue2 = animatableTextRangeSelector3.b) != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG5 = animatableIntegerValue2.g();
            this.b0 = (IntegerKeyframeAnimation) baseKeyframeAnimationG5;
            baseKeyframeAnimationG5.a(this);
            c(baseKeyframeAnimationG5);
        }
        if (animatableTextProperties != null && (animatableTextRangeSelector2 = animatableTextProperties.b) != null && (animatableIntegerValue = animatableTextRangeSelector2.c) != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG6 = animatableIntegerValue.g();
            this.c0 = (IntegerKeyframeAnimation) baseKeyframeAnimationG6;
            baseKeyframeAnimationG6.a(this);
            c(baseKeyframeAnimationG6);
        }
        if (animatableTextProperties == null || (animatableTextRangeSelector = animatableTextProperties.b) == null) {
            return;
        }
        this.O = animatableTextRangeSelector.d;
    }

    public static void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        canvas.drawText(str, 0, str.length(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
    }

    public static void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        LottieComposition lottieComposition = this.N;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lottieComposition.k.width(), lottieComposition.k.height());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        super.b(lottieValueCallback, obj);
        PointF pointF = LottieProperty.f13346a;
        if (obj == 1) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.Q;
            if (valueCallbackKeyframeAnimation != null) {
                o(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.Q = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.Q = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            c(this.Q);
            return;
        }
        if (obj == 2) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = this.S;
            if (valueCallbackKeyframeAnimation3 != null) {
                o(valueCallbackKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.S = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.S = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.a(this);
            c(this.S);
            return;
        }
        if (obj == LottieProperty.n) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = this.U;
            if (valueCallbackKeyframeAnimation5 != null) {
                o(valueCallbackKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.U = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.U = valueCallbackKeyframeAnimation6;
            valueCallbackKeyframeAnimation6.a(this);
            c(this.U);
            return;
        }
        if (obj == LottieProperty.o) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation7 = this.W;
            if (valueCallbackKeyframeAnimation7 != null) {
                o(valueCallbackKeyframeAnimation7);
            }
            if (lottieValueCallback == null) {
                this.W = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation8 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.W = valueCallbackKeyframeAnimation8;
            valueCallbackKeyframeAnimation8.a(this);
            c(this.W);
            return;
        }
        if (obj == LottieProperty.A) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation9 = this.Y;
            if (valueCallbackKeyframeAnimation9 != null) {
                o(valueCallbackKeyframeAnimation9);
            }
            if (lottieValueCallback == null) {
                this.Y = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation10 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.Y = valueCallbackKeyframeAnimation10;
            valueCallbackKeyframeAnimation10.a(this);
            c(this.Y);
            return;
        }
        if (obj != LottieProperty.H) {
            if (obj == LottieProperty.J) {
                this.L.k(lottieValueCallback);
                return;
            }
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation11 = this.Z;
        if (valueCallbackKeyframeAnimation11 != null) {
            o(valueCallbackKeyframeAnimation11);
        }
        if (lottieValueCallback == null) {
            this.Z = null;
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation12 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
        this.Z = valueCallbackKeyframeAnimation12;
        valueCallbackKeyframeAnimation12.a(this);
        c(this.Z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e5  */
    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r32, android.graphics.Matrix r33, int r34) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.TextLayer.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void s(DocumentData documentData, int i, int i2) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.Q;
        Paint paint = this.G;
        if (valueCallbackKeyframeAnimation != null) {
            paint.setColor(((Integer) valueCallbackKeyframeAnimation.e()).intValue());
        } else {
            ColorKeyframeAnimation colorKeyframeAnimation = this.P;
            if (colorKeyframeAnimation == null || !w(i2)) {
                paint.setColor(documentData.h);
            } else {
                paint.setColor(((Integer) colorKeyframeAnimation.e()).intValue());
            }
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.S;
        Paint paint2 = this.H;
        if (valueCallbackKeyframeAnimation2 != null) {
            paint2.setColor(((Integer) valueCallbackKeyframeAnimation2.e()).intValue());
        } else {
            ColorKeyframeAnimation colorKeyframeAnimation2 = this.R;
            if (colorKeyframeAnimation2 == null || !w(i2)) {
                paint2.setColor(documentData.i);
            } else {
                paint2.setColor(((Integer) colorKeyframeAnimation2.e()).intValue());
            }
        }
        BaseKeyframeAnimation baseKeyframeAnimation = this.w.j;
        int iIntValue = 100;
        int iIntValue2 = baseKeyframeAnimation == null ? 100 : ((Integer) baseKeyframeAnimation.e()).intValue();
        IntegerKeyframeAnimation integerKeyframeAnimation = this.X;
        if (integerKeyframeAnimation != null && w(i2)) {
            iIntValue = ((Integer) integerKeyframeAnimation.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        paint.setAlpha(iRound);
        paint2.setAlpha(iRound);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = this.U;
        if (valueCallbackKeyframeAnimation3 != null) {
            paint2.setStrokeWidth(((Float) valueCallbackKeyframeAnimation3.e()).floatValue());
            return;
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.T;
        if (floatKeyframeAnimation == null || !w(i2)) {
            paint2.setStrokeWidth(Utils.c() * documentData.j);
        } else {
            paint2.setStrokeWidth(((Float) floatKeyframeAnimation.e()).floatValue());
        }
    }

    public final TextSubLine v(int i) {
        ArrayList arrayList = this.K;
        for (int size = arrayList.size(); size < i; size++) {
            TextSubLine textSubLine = new TextSubLine();
            textSubLine.f13428a = "";
            textSubLine.b = BitmapDescriptorFactory.HUE_RED;
            arrayList.add(textSubLine);
        }
        return (TextSubLine) arrayList.get(i - 1);
    }

    public final boolean w(int i) {
        IntegerKeyframeAnimation integerKeyframeAnimation;
        int length = ((DocumentData) this.L.e()).f13390a.length();
        IntegerKeyframeAnimation integerKeyframeAnimation2 = this.a0;
        if (integerKeyframeAnimation2 == null || (integerKeyframeAnimation = this.b0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) integerKeyframeAnimation2.e()).intValue(), ((Integer) integerKeyframeAnimation.e()).intValue());
        int iMax = Math.max(((Integer) integerKeyframeAnimation2.e()).intValue(), ((Integer) integerKeyframeAnimation.e()).intValue());
        IntegerKeyframeAnimation integerKeyframeAnimation3 = this.c0;
        if (integerKeyframeAnimation3 != null) {
            int iIntValue = ((Integer) integerKeyframeAnimation3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.O == TextRangeUnits.e) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean x(Canvas canvas, DocumentData documentData, int i, float f) {
        PointF pointF = documentData.l;
        PointF pointF2 = documentData.m;
        float fC = Utils.c();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f3 = (i * documentData.f * fC) + (pointF == null ? 0.0f : (documentData.f * fC) + pointF.y);
        if (this.M.A && pointF2 != null && pointF != null && f3 >= pointF.y + pointF2.y + documentData.c) {
            return false;
        }
        float f4 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f2 = pointF2.x;
        }
        int iOrdinal = documentData.d.ordinal();
        if (iOrdinal == 0) {
            canvas.translate(f4, f3);
            return true;
        }
        if (iOrdinal == 1) {
            canvas.translate((f4 + f2) - f, f3);
            return true;
        }
        if (iOrdinal != 2) {
            return true;
        }
        canvas.translate(((f2 / 2.0f) + f4) - (f / 2.0f), f3);
        return true;
    }

    public final List y(String str, float f, Font font, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                int iA = FontCharacter.a(cCharAt, font.f13391a, font.c);
                SparseArrayCompat sparseArrayCompat = this.N.h;
                sparseArrayCompat.getClass();
                FontCharacter fontCharacter = (FontCharacter) SparseArrayCompatKt.b(sparseArrayCompat, iA);
                if (fontCharacter != null) {
                    fMeasureText = (Utils.c() * ((float) fontCharacter.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.G.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > BitmapDescriptorFactory.HUE_RED && f4 >= f && cCharAt != ' ') {
                i++;
                TextSubLine textSubLineV = v(i);
                if (i3 == i2) {
                    textSubLineV.f13428a = str.substring(i2, i4).trim();
                    textSubLineV.b = (f4 - fMeasureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    textSubLineV.f13428a = str.substring(i2, i3 - 1).trim();
                    textSubLineV.b = ((f4 - f5) - ((r8.length() - r14.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > BitmapDescriptorFactory.HUE_RED) {
            i++;
            TextSubLine textSubLineV2 = v(i);
            textSubLineV2.f13428a = str.substring(i2);
            textSubLineV2.b = f4;
        }
        return this.K.subList(0, i);
    }
}
