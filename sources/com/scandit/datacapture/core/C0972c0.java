package com.scandit.datacapture.core;

import android.util.Rational;
import android.util.Size;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: com.scandit.datacapture.core.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0972c0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f18422a;

    public C0972c0(float f) {
        this.f18422a = f;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return ComparisonsKt.a(Float.valueOf(Math.abs(this.f18422a - new Rational(size.getWidth(), size.getHeight()).floatValue())), Float.valueOf(Math.abs(this.f18422a - new Rational(size2.getWidth(), size2.getHeight()).floatValue())));
    }
}
