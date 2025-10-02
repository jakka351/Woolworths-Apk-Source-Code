package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.halilibo.richtext.ui.material.RichTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ComposableLambdaImpl e;

    public /* synthetic */ d(ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.d = i2;
        this.e = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                FormattedListKt.c(RecomposeScopeImplKt.a(7), composer, this.e);
                break;
            default:
                RichTextKt.b(RecomposeScopeImplKt.a(7), composer, this.e);
                break;
        }
        return Unit.f24250a;
    }
}
