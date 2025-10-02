package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;

/* loaded from: classes4.dex */
class KeyframesParser {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f13456a = JsonReader.Options.a("k");

    public static ArrayList a(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser valueParser, boolean z) {
        JsonReader jsonReader2;
        LottieComposition lottieComposition2;
        float f2;
        ValueParser valueParser2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.f() == JsonReader.Token.i) {
            lottieComposition.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.b();
        while (jsonReader.hasNext()) {
            if (jsonReader.h(f13456a) != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.f() == JsonReader.Token.d) {
                jsonReader.a();
                if (jsonReader.f() == JsonReader.Token.j) {
                    JsonReader jsonReader3 = jsonReader;
                    LottieComposition lottieComposition3 = lottieComposition;
                    float f3 = f;
                    ValueParser valueParser3 = valueParser;
                    boolean z3 = z;
                    Keyframe keyframeB = KeyframeParser.b(jsonReader3, lottieComposition3, f3, valueParser3, false, z3);
                    jsonReader2 = jsonReader3;
                    lottieComposition2 = lottieComposition3;
                    f2 = f3;
                    valueParser2 = valueParser3;
                    z2 = z3;
                    arrayList.add(keyframeB);
                } else {
                    jsonReader2 = jsonReader;
                    lottieComposition2 = lottieComposition;
                    f2 = f;
                    valueParser2 = valueParser;
                    z2 = z;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(KeyframeParser.b(jsonReader2, lottieComposition2, f2, valueParser2, true, z2));
                    }
                }
                jsonReader2.c();
                jsonReader = jsonReader2;
                lottieComposition = lottieComposition2;
                f = f2;
                valueParser = valueParser2;
                z = z2;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(KeyframeParser.b(jsonReader4, lottieComposition, f, valueParser, false, z));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.d();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            Keyframe keyframe = (Keyframe) arrayList.get(i2);
            i2++;
            Keyframe keyframe2 = (Keyframe) arrayList.get(i2);
            keyframe.h = Float.valueOf(keyframe2.g);
            if (keyframe.c == null && (obj = keyframe2.b) != null) {
                keyframe.c = obj;
                if (keyframe instanceof PathKeyframe) {
                    ((PathKeyframe) keyframe).d();
                }
            }
        }
        Keyframe keyframe3 = (Keyframe) arrayList.get(i);
        if ((keyframe3.b == null || keyframe3.c == null) && arrayList.size() > 1) {
            arrayList.remove(keyframe3);
        }
    }
}
