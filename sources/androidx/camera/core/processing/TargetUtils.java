package androidx.camera.core.processing;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class TargetUtils {
    public static String a(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join(lllqqql.c0063ccc0063c, arrayList);
    }
}
