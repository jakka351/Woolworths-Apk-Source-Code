package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes4.dex */
public class DocumentDataParser implements ValueParser<DocumentData> {

    /* renamed from: a, reason: collision with root package name */
    public static final DocumentDataParser f13443a = new DocumentDataParser();
    public static final JsonReader.Options b = JsonReader.Options.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        int i;
        boolean z;
        jsonReader.b();
        String strNextString = null;
        DocumentData.Justification justification = DocumentData.Justification.d;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        DocumentData.Justification justification2 = justification;
        int iNextInt = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zNextBoolean = true;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.h(b)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    break;
                case 1:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 2:
                    i = iA2;
                    z = zNextBoolean;
                    fNextDouble = (float) jsonReader.nextDouble();
                    iA2 = i;
                    zNextBoolean = z;
                    break;
                case 3:
                    PointF pointF3 = pointF;
                    int i2 = iA2;
                    z = zNextBoolean;
                    int iNextInt2 = jsonReader.nextInt();
                    justification2 = (iNextInt2 > 2 || iNextInt2 < 0) ? justification : DocumentData.Justification.values()[iNextInt2];
                    iA2 = i2;
                    pointF = pointF3;
                    zNextBoolean = z;
                    break;
                case 4:
                    iNextInt = jsonReader.nextInt();
                    break;
                case 5:
                    i = iA2;
                    z = zNextBoolean;
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    iA2 = i;
                    zNextBoolean = z;
                    break;
                case 6:
                    i = iA2;
                    z = zNextBoolean;
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    iA2 = i;
                    zNextBoolean = z;
                    break;
                case 7:
                    iA = JsonUtils.a(jsonReader);
                    break;
                case 8:
                    iA2 = JsonUtils.a(jsonReader);
                    break;
                case 9:
                    i = iA2;
                    z = zNextBoolean;
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    iA2 = i;
                    zNextBoolean = z;
                    break;
                case 10:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 11:
                    jsonReader.a();
                    i = iA2;
                    z = zNextBoolean;
                    pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.c();
                    iA2 = i;
                    zNextBoolean = z;
                    break;
                case 12:
                    jsonReader.a();
                    pointF2 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.c();
                    justification = justification;
                    pointF = pointF;
                    break;
                default:
                    jsonReader.i();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.d();
        DocumentData documentData = new DocumentData();
        documentData.f13390a = strNextString;
        documentData.b = strNextString2;
        documentData.c = fNextDouble;
        documentData.d = justification2;
        documentData.e = iNextInt;
        documentData.f = fNextDouble2;
        documentData.g = fNextDouble3;
        documentData.h = iA;
        documentData.i = iA2;
        documentData.j = fNextDouble4;
        documentData.k = zNextBoolean;
        documentData.l = pointF;
        documentData.m = pointF2;
        return documentData;
    }
}
