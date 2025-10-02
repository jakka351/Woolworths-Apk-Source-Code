package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes4.dex */
public class PointFParser implements ValueParser<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final PointFParser f13462a = new PointFParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        JsonReader.Token tokenF = jsonReader.f();
        if (tokenF != JsonReader.Token.d && tokenF != JsonReader.Token.f) {
            if (tokenF != JsonReader.Token.j) {
                throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenF);
            }
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        return JsonUtils.b(jsonReader, f);
    }
}
