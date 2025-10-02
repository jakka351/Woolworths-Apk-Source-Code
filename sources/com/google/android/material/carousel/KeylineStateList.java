package com.google.android.material.carousel;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
class KeylineStateList {

    /* renamed from: a, reason: collision with root package name */
    public final KeylineState f14540a;
    public final List b;
    public final List c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public KeylineStateList(KeylineState keylineState, ArrayList arrayList, ArrayList arrayList2) {
        this.f14540a = keylineState;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableList(arrayList2);
        float f = ((KeylineState) YU.a.c(1, arrayList)).b().f14539a - keylineState.b().f14539a;
        this.f = f;
        float f2 = keylineState.d().f14539a - ((KeylineState) YU.a.c(1, arrayList2)).d().f14539a;
        this.g = f2;
        this.d = d(f, arrayList, true);
        this.e = d(f2, arrayList2, false);
    }

    public static float[] d(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            KeylineState keylineState = (KeylineState) arrayList.get(i2);
            KeylineState keylineState2 = (KeylineState) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? keylineState2.b().f14539a - keylineState.b().f14539a : keylineState.d().f14539a - keylineState2.d().f14539a) / f);
            i++;
        }
        return fArr;
    }

    public static float[] e(List list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{AnimationUtils.b(BitmapDescriptorFactory.HUE_RED, 1.0f, f2, f3, f), i - 1, i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    }

    public static KeylineState f(KeylineState keylineState, int i, int i2, float f, int i3, int i4, float f2) {
        ArrayList arrayList = new ArrayList(keylineState.b);
        arrayList.add(i2, (KeylineState.Keyline) arrayList.remove(i));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.f14537a, f2);
        float f3 = f;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i5);
            float f4 = keyline.d;
            builder.b((f4 / 2.0f) + f3, keyline.c, f4, i5 >= i3 && i5 <= i4, keyline.e, keyline.f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            f3 += keyline.d;
            i5++;
        }
        return builder.d();
    }

    public static KeylineState g(KeylineState keylineState, float f, float f2, boolean z, float f3) {
        int i;
        List list = keylineState.b;
        ArrayList arrayList = new ArrayList(list);
        float f4 = keylineState.f14537a;
        KeylineState.Builder builder = new KeylineState.Builder(f4, f2);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((KeylineState.Keyline) it.next()).e) {
                i2++;
            }
        }
        float size = f / (list.size() - i2);
        float f5 = z ? f : 0.0f;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i3);
            if (keyline.e) {
                i = i3;
                builder.b(keyline.b, keyline.c, keyline.d, false, true, keyline.f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            } else {
                i = i3;
                boolean z2 = i >= keylineState.c && i <= keylineState.d;
                float f6 = keyline.d - size;
                float fB = CarouselStrategy.b(f6, f4, f3);
                float f7 = (f6 / 2.0f) + f5;
                float f8 = f7 - keyline.b;
                float f9 = keyline.f;
                float f10 = f8;
                if (!z) {
                    f8 = 0.0f;
                }
                if (z) {
                    f10 = 0.0f;
                }
                builder.b(f7, fB, f6, z2, false, f9, f8, f10);
                f5 += f6;
            }
            i3 = i + 1;
        }
        return builder.d();
    }

    public final KeylineState a() {
        return (KeylineState) this.c.get(r0.size() - 1);
    }

    public final KeylineState b(float f, float f2, float f3, boolean z) {
        float fB;
        List list;
        float[] fArr;
        float f4 = this.f;
        float f5 = f2 + f4;
        float f6 = this.g;
        float f7 = f3 - f6;
        float f8 = c().a().g;
        float f9 = a().c().h;
        if (f4 == f8) {
            f5 += f8;
        }
        if (f6 == f9) {
            f7 -= f9;
        }
        if (f < f5) {
            fB = AnimationUtils.b(1.0f, BitmapDescriptorFactory.HUE_RED, f2, f5, f);
            list = this.b;
            fArr = this.d;
        } else {
            if (f <= f7) {
                return this.f14540a;
            }
            fB = AnimationUtils.b(BitmapDescriptorFactory.HUE_RED, 1.0f, f7, f3, f);
            list = this.c;
            fArr = this.e;
        }
        if (z) {
            float[] fArrE = e(list, fB, fArr);
            return fArrE[0] >= 0.5f ? (KeylineState) list.get((int) fArrE[2]) : (KeylineState) list.get((int) fArrE[1]);
        }
        float[] fArrE2 = e(list, fB, fArr);
        KeylineState keylineState = (KeylineState) list.get((int) fArrE2[1]);
        KeylineState keylineState2 = (KeylineState) list.get((int) fArrE2[2]);
        float f10 = fArrE2[0];
        float f11 = keylineState.f14537a;
        List list2 = keylineState.b;
        if (f11 != keylineState2.f14537a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list3 = keylineState2.b;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) list2.get(i);
            KeylineState.Keyline keyline2 = (KeylineState.Keyline) list3.get(i);
            arrayList.add(new KeylineState.Keyline(AnimationUtils.a(keyline.f14539a, keyline2.f14539a, f10), AnimationUtils.a(keyline.b, keyline2.b, f10), AnimationUtils.a(keyline.c, keyline2.c, f10), AnimationUtils.a(keyline.d, keyline2.d, f10), false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        }
        return new KeylineState(keylineState.f14537a, arrayList, AnimationUtils.c(f10, keylineState.c, keylineState2.c), AnimationUtils.c(f10, keylineState.d, keylineState2.d));
    }

    public final KeylineState c() {
        return (KeylineState) this.b.get(r0.size() - 1);
    }
}
