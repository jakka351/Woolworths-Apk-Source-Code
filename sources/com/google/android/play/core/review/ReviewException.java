package com.google.android.play.core.review;

import androidx.constraintlayout.core.state.a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes6.dex */
public class ReviewException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    public ReviewException(int i) {
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = com.google.android.play.core.review.model.zza.f14765a;
        Integer numValueOf2 = Integer.valueOf(i);
        super(new Status(i, String.format(locale, "Review Error(%d): %s", numValueOf, !map.containsKey(numValueOf2) ? "" : a.i((String) map.get(numValueOf2), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) com.google.android.play.core.review.model.zza.b.get(numValueOf2), ")"))));
    }
}
