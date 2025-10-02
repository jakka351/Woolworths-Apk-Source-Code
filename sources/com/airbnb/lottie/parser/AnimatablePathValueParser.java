package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class AnimatablePathValueParser {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f13436a = JsonReader.Options.a("k", "x", "y");

    public static AnimatablePathValue a(JsonReader jsonReader, LottieComposition lottieComposition) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.f() == JsonReader.Token.d) {
            jsonReader.a();
            while (jsonReader.hasNext()) {
                JsonReader jsonReader2 = jsonReader;
                LottieComposition lottieComposition2 = lottieComposition;
                arrayList.add(new PathKeyframe(lottieComposition2, KeyframeParser.b(jsonReader2, lottieComposition2, Utils.c(), PathParser.f13461a, jsonReader.f() == JsonReader.Token.f, false)));
                jsonReader = jsonReader2;
                lottieComposition = lottieComposition2;
            }
            jsonReader.c();
            KeyframesParser.b(arrayList);
        } else {
            arrayList.add(new Keyframe(JsonUtils.b(jsonReader, Utils.c())));
        }
        return new AnimatablePathValue(arrayList);
    }

    public static AnimatableValue b(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.b();
        AnimatablePathValue animatablePathValueA = null;
        AnimatableFloatValue animatableFloatValueB = null;
        boolean z = false;
        AnimatableFloatValue animatableFloatValueB2 = null;
        while (jsonReader.f() != JsonReader.Token.g) {
            int iH = jsonReader.h(f13436a);
            if (iH != 0) {
                JsonReader.Token token = JsonReader.Token.i;
                if (iH != 1) {
                    if (iH != 2) {
                        jsonReader.i();
                        jsonReader.skipValue();
                    } else if (jsonReader.f() == token) {
                        jsonReader.skipValue();
                        z = true;
                    } else {
                        animatableFloatValueB = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                    }
                } else if (jsonReader.f() == token) {
                    jsonReader.skipValue();
                    z = true;
                } else {
                    animatableFloatValueB2 = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                }
            } else {
                animatablePathValueA = a(jsonReader, lottieComposition);
            }
        }
        jsonReader.d();
        if (z) {
            lottieComposition.a("Lottie doesn't support expressions.");
        }
        return animatablePathValueA != null ? animatablePathValueA : new AnimatableSplitDimensionPathValue(animatableFloatValueB2, animatableFloatValueB);
    }
}
