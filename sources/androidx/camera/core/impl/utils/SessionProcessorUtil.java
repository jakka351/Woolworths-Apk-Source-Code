package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.SessionProcessor;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class SessionProcessorUtil {
    public static boolean a(SessionProcessor sessionProcessor, int... iArr) {
        if (sessionProcessor == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return Collections.EMPTY_SET.containsAll(arrayList);
    }
}
