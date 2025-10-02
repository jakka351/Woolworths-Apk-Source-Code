package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class LottieCompositionMoshiParser {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f13459a = JsonReader.Options.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final JsonReader.Options b = JsonReader.Options.a("id", "layers", "w", "h", "p", "u");
    public static final JsonReader.Options c = JsonReader.Options.a("list");
    public static final JsonReader.Options d = JsonReader.Options.a("cm", "tm", "dr");

    public static LottieComposition a(JsonReader jsonReader) throws NumberFormatException {
        float f;
        LottieComposition lottieComposition;
        LottieComposition lottieComposition2;
        int i;
        float f2;
        LottieComposition lottieComposition3;
        float f3;
        float f4;
        int i2;
        float fC = Utils.c();
        LongSparseArray longSparseArray = new LongSparseArray((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat(0);
        LottieComposition lottieComposition4 = new LottieComposition();
        jsonReader.b();
        int iNextInt = 0;
        int iNextInt2 = 0;
        float fNextDouble = BitmapDescriptorFactory.HUE_RED;
        float fNextDouble2 = BitmapDescriptorFactory.HUE_RED;
        float fNextDouble3 = BitmapDescriptorFactory.HUE_RED;
        while (jsonReader.hasNext()) {
            switch (jsonReader.h(f13459a)) {
                case 0:
                    iNextInt = jsonReader.nextInt();
                    break;
                case 1:
                    iNextInt2 = jsonReader.nextInt();
                    break;
                case 2:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    lottieComposition4 = lottieComposition4;
                    break;
                case 3:
                    f = fC;
                    lottieComposition = lottieComposition4;
                    fNextDouble = ((float) jsonReader.nextDouble()) - 0.01f;
                    lottieComposition4 = lottieComposition;
                    fC = f;
                    break;
                case 4:
                    f = fC;
                    lottieComposition = lottieComposition4;
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    lottieComposition4 = lottieComposition;
                    fC = f;
                    break;
                case 5:
                    f = fC;
                    lottieComposition2 = lottieComposition4;
                    i = iNextInt2;
                    f2 = fNextDouble2;
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    int i5 = Integer.parseInt(strArrSplit[2]);
                    if (i3 < 4 || (i3 <= 4 && (i4 < 4 || (i4 <= 4 && i5 < 0)))) {
                        lottieComposition2.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    lottieComposition4 = lottieComposition2;
                    iNextInt2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                case 6:
                    f = fC;
                    LottieComposition lottieComposition5 = lottieComposition4;
                    i = iNextInt2;
                    f2 = fNextDouble2;
                    jsonReader.a();
                    int i6 = 0;
                    while (jsonReader.hasNext()) {
                        LottieComposition lottieComposition6 = lottieComposition5;
                        Layer layerA = LayerParser.a(jsonReader, lottieComposition6);
                        if (layerA.e == Layer.LayerType.e) {
                            i6++;
                        }
                        arrayList.add(layerA);
                        longSparseArray.h(layerA.d, layerA);
                        if (i6 > 4) {
                            Logger.b("You have " + i6 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        lottieComposition5 = lottieComposition6;
                    }
                    lottieComposition2 = lottieComposition5;
                    jsonReader.c();
                    lottieComposition4 = lottieComposition2;
                    iNextInt2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                case 7:
                    f = fC;
                    i = iNextInt2;
                    f2 = fNextDouble2;
                    jsonReader.a();
                    while (jsonReader.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray((Object) null);
                        jsonReader.b();
                        String strNextString = null;
                        String strNextString2 = null;
                        String strNextString3 = null;
                        int iNextInt3 = 0;
                        int iNextInt4 = 0;
                        while (jsonReader.hasNext()) {
                            int iH = jsonReader.h(b);
                            if (iH != 0) {
                                if (iH == 1) {
                                    jsonReader.a();
                                    while (jsonReader.hasNext()) {
                                        Layer layerA2 = LayerParser.a(jsonReader, lottieComposition4);
                                        longSparseArray2.h(layerA2.d, layerA2);
                                        arrayList3.add(layerA2);
                                        lottieComposition4 = lottieComposition4;
                                    }
                                    lottieComposition3 = lottieComposition4;
                                    jsonReader.c();
                                } else if (iH == 2) {
                                    iNextInt3 = jsonReader.nextInt();
                                } else if (iH == 3) {
                                    iNextInt4 = jsonReader.nextInt();
                                } else if (iH == 4) {
                                    strNextString2 = jsonReader.nextString();
                                } else if (iH != 5) {
                                    jsonReader.i();
                                    jsonReader.skipValue();
                                    lottieComposition3 = lottieComposition4;
                                } else {
                                    strNextString3 = jsonReader.nextString();
                                }
                                lottieComposition4 = lottieComposition3;
                            } else {
                                strNextString = jsonReader.nextString();
                            }
                        }
                        LottieComposition lottieComposition7 = lottieComposition4;
                        jsonReader.d();
                        if (strNextString2 != null) {
                            map2.put(strNextString, new LottieImageAsset(iNextInt3, iNextInt4, strNextString, strNextString2, strNextString3));
                        } else {
                            map.put(strNextString, arrayList3);
                        }
                        lottieComposition4 = lottieComposition7;
                    }
                    jsonReader.c();
                    lottieComposition2 = lottieComposition4;
                    lottieComposition4 = lottieComposition2;
                    iNextInt2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                case 8:
                    f = fC;
                    i = iNextInt2;
                    float f5 = fNextDouble2;
                    jsonReader.b();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.h(c) != 0) {
                            jsonReader.i();
                            jsonReader.skipValue();
                        } else {
                            jsonReader.a();
                            while (jsonReader.hasNext()) {
                                JsonReader.Options options = FontParser.f13448a;
                                jsonReader.b();
                                String strNextString4 = null;
                                String strNextString5 = null;
                                String strNextString6 = null;
                                while (jsonReader.hasNext()) {
                                    int iH2 = jsonReader.h(FontParser.f13448a);
                                    if (iH2 != 0) {
                                        float f6 = f5;
                                        if (iH2 == 1) {
                                            strNextString5 = jsonReader.nextString();
                                        } else if (iH2 == 2) {
                                            strNextString6 = jsonReader.nextString();
                                        } else if (iH2 != 3) {
                                            jsonReader.i();
                                            jsonReader.skipValue();
                                        } else {
                                            jsonReader.nextDouble();
                                        }
                                        f5 = f6;
                                    } else {
                                        strNextString4 = jsonReader.nextString();
                                    }
                                }
                                jsonReader.d();
                                map3.put(strNextString5, new Font(strNextString4, strNextString5, strNextString6));
                                f5 = f5;
                            }
                            jsonReader.c();
                        }
                    }
                    f2 = f5;
                    jsonReader.d();
                    lottieComposition2 = lottieComposition4;
                    lottieComposition4 = lottieComposition2;
                    iNextInt2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                case 9:
                    f = fC;
                    i = iNextInt2;
                    f3 = fNextDouble2;
                    jsonReader.a();
                    while (jsonReader.hasNext()) {
                        JsonReader.Options options2 = FontCharacterParser.f13447a;
                        ArrayList arrayList4 = new ArrayList();
                        jsonReader.b();
                        double dNextDouble = 0.0d;
                        char cCharAt = 0;
                        String strNextString7 = null;
                        String strNextString8 = null;
                        while (jsonReader.hasNext()) {
                            int iH3 = jsonReader.h(FontCharacterParser.f13447a);
                            if (iH3 == 0) {
                                cCharAt = jsonReader.nextString().charAt(0);
                            } else if (iH3 == 1) {
                                jsonReader.nextDouble();
                            } else if (iH3 == 2) {
                                dNextDouble = jsonReader.nextDouble();
                            } else if (iH3 == 3) {
                                strNextString7 = jsonReader.nextString();
                            } else if (iH3 == 4) {
                                strNextString8 = jsonReader.nextString();
                            } else if (iH3 != 5) {
                                jsonReader.i();
                                jsonReader.skipValue();
                            } else {
                                jsonReader.b();
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.h(FontCharacterParser.b) != 0) {
                                        jsonReader.i();
                                        jsonReader.skipValue();
                                    } else {
                                        jsonReader.a();
                                        while (jsonReader.hasNext()) {
                                            arrayList4.add((ShapeGroup) ContentModelParser.a(jsonReader, lottieComposition4));
                                        }
                                        jsonReader.c();
                                    }
                                }
                                jsonReader.d();
                            }
                        }
                        jsonReader.d();
                        FontCharacter fontCharacter = new FontCharacter(arrayList4, cCharAt, dNextDouble, strNextString7, strNextString8);
                        sparseArrayCompat.d(fontCharacter.hashCode(), fontCharacter);
                    }
                    jsonReader.c();
                    f2 = f3;
                    lottieComposition2 = lottieComposition4;
                    lottieComposition4 = lottieComposition2;
                    iNextInt2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                case 10:
                    jsonReader.a();
                    while (jsonReader.hasNext()) {
                        jsonReader.b();
                        String strNextString9 = null;
                        float fNextDouble4 = BitmapDescriptorFactory.HUE_RED;
                        float fNextDouble5 = BitmapDescriptorFactory.HUE_RED;
                        while (jsonReader.hasNext()) {
                            int iH4 = jsonReader.h(d);
                            if (iH4 != 0) {
                                f4 = fC;
                                if (iH4 == 1) {
                                    i2 = iNextInt2;
                                    fNextDouble2 = fNextDouble2;
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                } else if (iH4 != 2) {
                                    jsonReader.i();
                                    jsonReader.skipValue();
                                } else {
                                    i2 = iNextInt2;
                                    fNextDouble2 = fNextDouble2;
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                }
                                iNextInt2 = i2;
                            } else {
                                f4 = fC;
                                strNextString9 = jsonReader.nextString();
                            }
                            fC = f4;
                        }
                        jsonReader.d();
                        arrayList2.add(new Marker(strNextString9, fNextDouble4, fNextDouble5));
                        fNextDouble2 = fNextDouble2;
                        iNextInt2 = iNextInt2;
                        fC = fC;
                    }
                    f = fC;
                    i = iNextInt2;
                    f3 = fNextDouble2;
                    jsonReader.c();
                    f2 = f3;
                    lottieComposition2 = lottieComposition4;
                    lottieComposition4 = lottieComposition2;
                    iNextInt2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                default:
                    jsonReader.i();
                    jsonReader.skipValue();
                    f = fC;
                    lottieComposition2 = lottieComposition4;
                    i = iNextInt2;
                    f2 = fNextDouble2;
                    lottieComposition4 = lottieComposition2;
                    iNextInt2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
            }
        }
        float f7 = fC;
        LottieComposition lottieComposition8 = lottieComposition4;
        Rect rect = new Rect(0, 0, (int) (iNextInt * f7), (int) (iNextInt2 * f7));
        float fC2 = Utils.c();
        lottieComposition8.k = rect;
        lottieComposition8.l = fNextDouble2;
        lottieComposition8.m = fNextDouble;
        lottieComposition8.n = fNextDouble3;
        lottieComposition8.j = arrayList;
        lottieComposition8.i = longSparseArray;
        lottieComposition8.c = map;
        lottieComposition8.d = map2;
        lottieComposition8.e = fC2;
        lottieComposition8.h = sparseArrayCompat;
        lottieComposition8.f = map3;
        lottieComposition8.g = arrayList2;
        return lottieComposition8;
    }
}
