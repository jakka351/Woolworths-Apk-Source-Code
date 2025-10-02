package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.halilibo.richtext.ui.string.RichTextString;
import com.halilibo.richtext.ui.string.TextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ RichTextScope e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ g(RichTextScope richTextScope, RichTextString richTextString, Modifier modifier, Function1 function1, boolean z, int i, int i2, int i3, int i4) {
        this.e = richTextScope;
        this.m = richTextString;
        this.f = modifier;
        this.g = function1;
        this.h = z;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                RichTextLocalsKt.b(this.e, (String) this.m, this.f, this.g, this.i, this.h, this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1), this.l);
                break;
            default:
                ((Integer) obj2).getClass();
                TextKt.a(this.e, (RichTextString) this.m, this.f, this.g, this.h, this.i, this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1), this.l);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ g(RichTextScope richTextScope, String str, Modifier modifier, Function1 function1, int i, boolean z, int i2, int i3, int i4) {
        this.e = richTextScope;
        this.m = str;
        this.f = modifier;
        this.g = function1;
        this.i = i;
        this.h = z;
        this.j = i2;
        this.k = i3;
        this.l = i4;
    }
}
