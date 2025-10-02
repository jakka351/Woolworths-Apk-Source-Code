package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class PerformanceTracker {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13349a = false;
    public final ArraySet b = new ArraySet(0);
    public final HashMap c = new HashMap();

    /* renamed from: com.airbnb.lottie.PerformanceTracker$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Pair<String, Float>> {
        @Override // java.util.Comparator
        public final int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.b).floatValue();
            float fFloatValue2 = ((Float) pair2.b).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface FrameListener {
        void a();
    }
}
