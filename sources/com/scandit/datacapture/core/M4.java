package com.scandit.datacapture.core;

import android.util.Range;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class M4 extends E4 {
    public static final M4 d = new M4();
    private static final String e = "CPH2415|CPH2413|CPH2417";

    private M4() {
    }

    @Override // com.scandit.datacapture.core.E4, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return e;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range b(Range[] frameRateRanges, float f) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        ArrayList arrayList = new ArrayList();
        for (Range range : frameRateRanges) {
            Integer num = (Integer) range.getUpper();
            if (num == null || num.intValue() != 24) {
                arrayList.add(range);
            }
        }
        return AbstractC1001f2.b((Range[]) arrayList.toArray(new Range[0]), f);
    }
}
