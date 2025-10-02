package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.ScaleXY;

/* loaded from: classes4.dex */
public class ScaleXYParser implements ValueParser<ScaleXY> {

    /* renamed from: a, reason: collision with root package name */
    public static final ScaleXYParser f13467a = new ScaleXYParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        boolean z = jsonReader.f() == JsonReader.Token.d;
        if (z) {
            jsonReader.a();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.c();
        }
        return new ScaleXY((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
