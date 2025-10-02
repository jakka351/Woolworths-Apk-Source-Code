package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.b;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes4.dex */
public class FontCharacter {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13392a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public FontCharacter(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f13392a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + b.c(c * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.b, this.e, this.d);
    }
}
