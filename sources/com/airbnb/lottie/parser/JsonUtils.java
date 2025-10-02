package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes4.dex */
class JsonUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f13453a = JsonReader.Options.a("x", "y");

    /* renamed from: com.airbnb.lottie.parser.JsonUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13454a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f13454a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13454a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13454a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static int a(JsonReader jsonReader) {
        jsonReader.a();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.c();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static PointF b(JsonReader jsonReader, float f) {
        int iOrdinal = jsonReader.f().ordinal();
        if (iOrdinal == 0) {
            jsonReader.a();
            float fNextDouble = (float) jsonReader.nextDouble();
            float fNextDouble2 = (float) jsonReader.nextDouble();
            while (jsonReader.f() != JsonReader.Token.e) {
                jsonReader.skipValue();
            }
            jsonReader.c();
            return new PointF(fNextDouble * f, fNextDouble2 * f);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.f());
            }
            float fNextDouble3 = (float) jsonReader.nextDouble();
            float fNextDouble4 = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return new PointF(fNextDouble3 * f, fNextDouble4 * f);
        }
        jsonReader.b();
        float fD = BitmapDescriptorFactory.HUE_RED;
        float fD2 = 0.0f;
        while (jsonReader.hasNext()) {
            int iH = jsonReader.h(f13453a);
            if (iH == 0) {
                fD = d(jsonReader);
            } else if (iH != 1) {
                jsonReader.i();
                jsonReader.skipValue();
            } else {
                fD2 = d(jsonReader);
            }
        }
        jsonReader.d();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.a();
        while (jsonReader.f() == JsonReader.Token.d) {
            jsonReader.a();
            arrayList.add(b(jsonReader, f));
            jsonReader.c();
        }
        jsonReader.c();
        return arrayList;
    }

    public static float d(JsonReader jsonReader) {
        JsonReader.Token tokenF = jsonReader.f();
        int iOrdinal = tokenF.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) jsonReader.nextDouble();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + tokenF);
        }
        jsonReader.a();
        float fNextDouble = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.c();
        return fNextDouble;
    }
}
