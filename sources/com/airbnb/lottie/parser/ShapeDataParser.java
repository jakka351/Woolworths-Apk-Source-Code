package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
public class ShapeDataParser implements ValueParser<ShapeData> {

    /* renamed from: a, reason: collision with root package name */
    public static final ShapeDataParser f13468a = new ShapeDataParser();
    public static final JsonReader.Options b = JsonReader.Options.a("c", "v", "i", "o");

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        if (jsonReader.f() == JsonReader.Token.d) {
            jsonReader.a();
        }
        jsonReader.b();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            int iH = jsonReader.h(b);
            if (iH == 0) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (iH == 1) {
                arrayListC = JsonUtils.c(jsonReader, f);
            } else if (iH == 2) {
                arrayListC2 = JsonUtils.c(jsonReader, f);
            } else if (iH != 3) {
                jsonReader.i();
                jsonReader.skipValue();
            } else {
                arrayListC3 = JsonUtils.c(jsonReader, f);
            }
        }
        jsonReader.d();
        if (jsonReader.f() == JsonReader.Token.e) {
            jsonReader.c();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new ShapeData(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new CubicCurveData(MiscUtils.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), MiscUtils.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new CubicCurveData(MiscUtils.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), MiscUtils.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new ShapeData(pointF, zNextBoolean, arrayList);
    }
}
