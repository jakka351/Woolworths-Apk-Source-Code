package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
class KeyframeParser {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f13455a = new LinearInterpolator();
    public static final JsonReader.Options b = JsonReader.Options.a("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final JsonReader.Options c = JsonReader.Options.a("x", "y");

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        pointF.x = MiscUtils.b(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = MiscUtils.b(pointF2.x, -1.0f, 1.0f);
        float fB = MiscUtils.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        ThreadLocal threadLocal = Utils.f13480a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, BitmapDescriptorFactory.HUE_RED), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.BaseInterpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.airbnb.lottie.value.Keyframe b(com.airbnb.lottie.parser.moshi.JsonReader r24, com.airbnb.lottie.LottieComposition r25, float r26, com.airbnb.lottie.parser.ValueParser r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.KeyframeParser.b(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.LottieComposition, float, com.airbnb.lottie.parser.ValueParser, boolean, boolean):com.airbnb.lottie.value.Keyframe");
    }
}
