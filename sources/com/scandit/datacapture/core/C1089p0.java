package com.scandit.datacapture.core;

import android.util.Size;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: com.scandit.datacapture.core.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1089p0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return ComparisonsKt.a(Integer.valueOf(size.getWidth() * size.getHeight()), Integer.valueOf(size2.getWidth() * size2.getHeight()));
    }
}
