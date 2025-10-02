package com.google.common.collect;

import com.google.common.base.Function;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements Function {
    public final /* synthetic */ int d;

    public /* synthetic */ e(int i) {
        this.d = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.d) {
            case 0:
                return ((Range) obj).d;
            case 1:
                return ((Range) obj).e;
            default:
                return ((Iterable) obj).iterator();
        }
    }
}
