package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Vibration;

/* loaded from: classes6.dex */
public abstract class F3 {
    public static Feedback a(boolean z, boolean z2) {
        return new Feedback(z2 ? Vibration.INSTANCE.defaultVibration() : null, z ? new ResourceSound(R.raw.sc_barcode_count_success) : null);
    }

    public static Feedback b(boolean z, boolean z2) {
        return new Feedback(z2 ? Vibration.INSTANCE.defaultVibration() : null, z ? new ResourceSound(R.raw.sc_barcode_find_found) : null);
    }
}
