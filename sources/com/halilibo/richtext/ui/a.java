package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RichTextScope e;
    public final /* synthetic */ ComposableLambdaImpl f;
    public final /* synthetic */ int g;

    public /* synthetic */ a(RichTextScope richTextScope, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.d = i2;
        this.e = richTextScope;
        this.f = composableLambdaImpl;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BlockQuoteKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                CodeBlockKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }
}
