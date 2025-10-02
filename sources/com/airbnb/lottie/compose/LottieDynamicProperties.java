package com.airbnb.lottie.compose;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.value.ScaleXY;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LottieDynamicProperties {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13380a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;

    public LottieDynamicProperties(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((LottieDynamicProperty) obj).f13381a instanceof Integer) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((LottieDynamicProperty) obj2).f13381a instanceof PointF) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (((LottieDynamicProperty) obj3).f13381a instanceof Float) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list2) {
            if (((LottieDynamicProperty) obj4).f13381a instanceof ScaleXY) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list2) {
            if (((LottieDynamicProperty) obj5).f13381a instanceof ColorFilter) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list2) {
            if (((LottieDynamicProperty) obj6).f13381a instanceof Object[]) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list2) {
            if (((LottieDynamicProperty) obj7).f13381a instanceof Typeface) {
                arrayList7.add(obj7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj8 : list2) {
            if (((LottieDynamicProperty) obj8).f13381a instanceof Bitmap) {
                arrayList8.add(obj8);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj9 : list2) {
            if (((LottieDynamicProperty) obj9).f13381a instanceof CharSequence) {
                arrayList9.add(obj9);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj10 : list2) {
            if (((LottieDynamicProperty) obj10).f13381a instanceof Path) {
                arrayList10.add(obj10);
            }
        }
        this.f13380a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = arrayList5;
        this.f = arrayList6;
        this.g = arrayList7;
        this.h = arrayList8;
        this.i = arrayList9;
        this.j = arrayList10;
    }
}
