package androidx.constraintlayout.core.motion.utils;

import android.view.View;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class KeyCache {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2279a = new HashMap();

    public final float a(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = this.f2279a;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
