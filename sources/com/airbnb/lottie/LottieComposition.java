package com.airbnb.lottie;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class LottieComposition {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public SparseArrayCompat h;
    public LongSparseArray i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;

    /* renamed from: a, reason: collision with root package name */
    public final PerformanceTracker f13342a = new PerformanceTracker();
    public final HashSet b = new HashSet();
    public int o = 0;

    @Deprecated
    public static class Factory {

        public static final class ListenerAdapter implements LottieListener<LottieComposition>, Cancellable {
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                throw null;
            }
        }
    }

    public final void a(String str) {
        Logger.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = Utils.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                LottieImageAsset lottieImageAsset = (LottieImageAsset) entry.getValue();
                float f = this.e / fC;
                int i = (int) (lottieImageAsset.f13345a * f);
                int i2 = (int) (lottieImageAsset.b * f);
                LottieImageAsset lottieImageAsset2 = new LottieImageAsset(i, i2, lottieImageAsset.c, lottieImageAsset.d, lottieImageAsset.e);
                Bitmap bitmap = lottieImageAsset.f;
                if (bitmap != null) {
                    lottieImageAsset2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, lottieImageAsset2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final Marker d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            Marker marker = (Marker) this.g.get(i);
            String str2 = marker.f13395a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return marker;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((Layer) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
