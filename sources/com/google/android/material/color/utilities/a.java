package com.google.android.material.color.utilities;

import java.util.function.Function;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14557a;
    public final /* synthetic */ MaterialDynamicColors b;

    public /* synthetic */ a(MaterialDynamicColors materialDynamicColors, int i) {
        this.f14557a = i;
        this.b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f14557a) {
            case 0:
                MaterialDynamicColors materialDynamicColors = this.b;
                materialDynamicColors.e();
                materialDynamicColors.d();
                return new ToneDeltaPair();
            case 1:
                MaterialDynamicColors materialDynamicColors2 = this.b;
                materialDynamicColors2.i();
                materialDynamicColors2.h();
                return new ToneDeltaPair();
            case 2:
                MaterialDynamicColors materialDynamicColors3 = this.b;
                materialDynamicColors3.g();
                materialDynamicColors3.f();
                return new ToneDeltaPair();
            case 3:
                MaterialDynamicColors materialDynamicColors4 = this.b;
                materialDynamicColors4.e();
                materialDynamicColors4.d();
                return new ToneDeltaPair();
            case 4:
                return this.b.d();
            case 5:
                return this.b.a();
            case 6:
                return this.b.e();
            case 7:
                MaterialDynamicColors materialDynamicColors5 = this.b;
                materialDynamicColors5.i();
                materialDynamicColors5.h();
                return new ToneDeltaPair();
            case 8:
                return this.b.f();
            case 9:
                MaterialDynamicColors materialDynamicColors6 = this.b;
                materialDynamicColors6.g();
                materialDynamicColors6.f();
                return new ToneDeltaPair();
            case 10:
                return this.b.h();
            case 11:
                return this.b.i();
            case 12:
                return this.b.g();
            case 13:
                MaterialDynamicColors materialDynamicColors7 = this.b;
                materialDynamicColors7.b();
                materialDynamicColors7.a();
                return new ToneDeltaPair();
            case 14:
                return this.b.b();
            default:
                MaterialDynamicColors materialDynamicColors8 = this.b;
                materialDynamicColors8.b();
                materialDynamicColors8.a();
                return new ToneDeltaPair();
        }
    }
}
