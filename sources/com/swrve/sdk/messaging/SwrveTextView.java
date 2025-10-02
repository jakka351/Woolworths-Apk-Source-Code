package com.swrve.sdk.messaging;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swrve.sdk.messaging.SwrveTextViewStyle;

/* loaded from: classes6.dex */
public class SwrveTextView extends AppCompatTextView {

    /* renamed from: com.swrve.sdk.messaging.SwrveTextView$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19104a;

        static {
            int[] iArr = new int[SwrveTextViewStyle.TextAlignment.values().length];
            f19104a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19104a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19104a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SwrveTextView(Context context) {
        super(context);
    }

    public void setCalibratedLineSpacing(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        setLineSpacing(f - getPaint().getFontMetricsInt(null), 1.0f);
    }
}
