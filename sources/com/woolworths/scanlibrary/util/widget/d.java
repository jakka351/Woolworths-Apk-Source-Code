package com.woolworths.scanlibrary.util.widget;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ LoadingViewDelegate e;

    public /* synthetic */ d(LoadingViewDelegate loadingViewDelegate, int i) {
        this.d = i;
        this.e = loadingViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                this.e.b();
                return Unit.f24250a;
            default:
                LoadingViewDelegate loadingViewDelegate = this.e;
                ArrayList arrayList = loadingViewDelegate.e;
                if (arrayList == null) {
                    Intrinsics.p("wappleMessages");
                    throw null;
                }
                if (arrayList.isEmpty()) {
                    loadingViewDelegate.d.e();
                } else {
                    ArrayList arrayList2 = loadingViewDelegate.e;
                    if (arrayList2 == null) {
                        Intrinsics.p("wappleMessages");
                        throw null;
                    }
                    loadingViewDelegate.c.setText((String) arrayList2.remove(0));
                }
                return Unit.f24250a;
        }
    }
}
