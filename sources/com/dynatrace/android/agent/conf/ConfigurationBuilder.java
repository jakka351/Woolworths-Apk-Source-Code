package com.dynatrace.android.agent.conf;

import com.dynatrace.android.agent.Global;

/* loaded from: classes.dex */
public class ConfigurationBuilder {
    public static final /* synthetic */ int m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14092a;
    public final String[] b;
    public final String[] c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final InstrumentationFlavor k;
    public final boolean l;

    static {
        boolean z = Global.f14077a;
    }

    public ConfigurationBuilder() {
        this.b = new String[0];
        this.c = new String[0];
        String[] strArrA = BuilderUtil.a(new String[0]);
        if (strArrA != null) {
            this.b = strArrA;
        }
        String[] strArrA2 = BuilderUtil.a(new String[0]);
        if (strArrA2 != null) {
            this.c = strArrA2;
        }
        this.e = 500;
        this.f = 60000;
        this.h = true;
        this.d = true;
        this.i = true;
        this.j = true;
        this.f14092a = true;
        this.g = true;
        this.k = InstrumentationFlavor.PLAIN;
        this.l = true;
    }
}
