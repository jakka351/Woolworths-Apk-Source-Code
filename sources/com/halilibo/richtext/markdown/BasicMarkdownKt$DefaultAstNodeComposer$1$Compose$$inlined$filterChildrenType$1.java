package com.halilibo.richtext.markdown;

import com.halilibo.richtext.markdown.node.AstListItem;
import com.halilibo.richtext.markdown.node.AstNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasicMarkdownKt$DefaultAstNodeComposer$1$Compose$$inlined$filterChildrenType$1 implements Function1<AstNode, Boolean> {
    public static final BasicMarkdownKt$DefaultAstNodeComposer$1$Compose$$inlined$filterChildrenType$1 d = new BasicMarkdownKt$DefaultAstNodeComposer$1$Compose$$inlined$filterChildrenType$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AstNode it = (AstNode) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(it.f16260a instanceof AstListItem);
    }
}
