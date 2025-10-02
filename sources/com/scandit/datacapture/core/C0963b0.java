package com.scandit.datacapture.core;

import android.util.Size;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: com.scandit.datacapture.core.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0963b0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return ComparisonsKt.a(Integer.valueOf(size.getHeight() * size.getWidth()), Integer.valueOf(size2.getHeight() * size2.getWidth()));
    }
}
