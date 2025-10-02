package com.halilibo.richtext.markdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.ui.RichTextScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RichTextScope e;
    public final /* synthetic */ AstNode f;
    public final /* synthetic */ AstBlockNodeComposer g;
    public final /* synthetic */ int h;

    public /* synthetic */ a(RichTextScope richTextScope, AstNode astNode, AstBlockNodeComposer astBlockNodeComposer, int i, int i2) {
        this.d = i2;
        this.e = richTextScope;
        this.f = astNode;
        this.g = astBlockNodeComposer;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.d) {
            case 0:
                num.getClass();
                BasicMarkdownKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 1:
                num.intValue();
                BasicMarkdownKt.c(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 2:
                num.intValue();
                BasicMarkdownKt.b(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                num.intValue();
                BasicMarkdownKt.b(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }
}
