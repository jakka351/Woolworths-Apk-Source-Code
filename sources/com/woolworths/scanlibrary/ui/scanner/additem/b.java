package com.woolworths.scanlibrary.ui.scanner.additem;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ AddItemActivity e;

    public /* synthetic */ b(AddItemActivity addItemActivity, int i) {
        this.d = i;
        this.e = addItemActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        AddItemActivity addItemActivity = this.e;
        switch (i) {
            case 0:
                int i2 = AddItemActivity.I;
                addItemActivity.c5();
                break;
            case 1:
                int i3 = AddItemActivity.I;
                addItemActivity.finish();
                break;
            case 2:
                int i4 = AddItemActivity.I;
                addItemActivity.finish();
                break;
            default:
                int i5 = AddItemActivity.I;
                addItemActivity.finish();
                break;
        }
        return unit;
    }
}
