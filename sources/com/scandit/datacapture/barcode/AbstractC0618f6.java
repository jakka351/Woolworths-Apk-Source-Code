package com.scandit.datacapture.barcode;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: com.scandit.datacapture.barcode.f6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0618f6 {
    public static final String a(int i) {
        return String.format("#%06X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215), Integer.valueOf(Color.alpha(i))}, 2));
    }
}
