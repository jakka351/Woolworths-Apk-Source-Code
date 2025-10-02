package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes4.dex */
public class TextKeyframeAnimation extends KeyframeAnimation<DocumentData> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f(Keyframe keyframe, float f) {
        Object obj;
        Object obj2 = keyframe.b;
        LottieValueCallback lottieValueCallback = this.e;
        if (lottieValueCallback == null) {
            return (f != 1.0f || (obj = keyframe.c) == null) ? (DocumentData) obj2 : (DocumentData) obj;
        }
        float f2 = keyframe.g;
        Float f3 = keyframe.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        DocumentData documentData = (DocumentData) obj2;
        Object obj3 = keyframe.c;
        return (DocumentData) lottieValueCallback.b(f2, fFloatValue, documentData, obj3 == null ? documentData : (DocumentData) obj3, f, c(), this.d);
    }

    public final void k(final LottieValueCallback lottieValueCallback) {
        final LottieFrameInfo lottieFrameInfo = new LottieFrameInfo();
        final DocumentData documentData = new DocumentData();
        j(new LottieValueCallback<DocumentData>() { // from class: com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public final Object a(LottieFrameInfo lottieFrameInfo2) {
                float f = lottieFrameInfo2.f13482a;
                float f2 = lottieFrameInfo2.b;
                String str = ((DocumentData) lottieFrameInfo2.c).f13390a;
                String str2 = ((DocumentData) lottieFrameInfo2.d).f13390a;
                float f3 = lottieFrameInfo2.e;
                float f4 = lottieFrameInfo2.f;
                float f5 = lottieFrameInfo2.g;
                LottieFrameInfo lottieFrameInfo3 = lottieFrameInfo;
                lottieFrameInfo3.f13482a = f;
                lottieFrameInfo3.b = f2;
                lottieFrameInfo3.c = str;
                lottieFrameInfo3.d = str2;
                lottieFrameInfo3.e = f3;
                lottieFrameInfo3.f = f4;
                lottieFrameInfo3.g = f5;
                String str3 = (String) lottieValueCallback.a(lottieFrameInfo3);
                DocumentData documentData2 = (DocumentData) (lottieFrameInfo2.f == 1.0f ? lottieFrameInfo2.d : lottieFrameInfo2.c);
                String str4 = documentData2.b;
                float f6 = documentData2.c;
                DocumentData.Justification justification = documentData2.d;
                int i = documentData2.e;
                float f7 = documentData2.f;
                float f8 = documentData2.g;
                int i2 = documentData2.h;
                int i3 = documentData2.i;
                float f9 = documentData2.j;
                boolean z = documentData2.k;
                PointF pointF = documentData2.l;
                PointF pointF2 = documentData2.m;
                DocumentData documentData3 = documentData;
                documentData3.f13390a = str3;
                documentData3.b = str4;
                documentData3.c = f6;
                documentData3.d = justification;
                documentData3.e = i;
                documentData3.f = f7;
                documentData3.g = f8;
                documentData3.h = i2;
                documentData3.i = i3;
                documentData3.j = f9;
                documentData3.k = z;
                documentData3.l = pointF;
                documentData3.m = pointF2;
                return documentData3;
            }
        });
    }
}
