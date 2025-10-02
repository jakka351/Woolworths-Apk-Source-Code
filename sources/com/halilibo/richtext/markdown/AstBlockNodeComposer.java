package com.halilibo.richtext.markdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.halilibo.richtext.markdown.node.AstBlockNodeType;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.ui.RichTextScope;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/AstBlockNodeComposer;", "", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AstBlockNodeComposer {
    boolean a(AstBlockNodeType astBlockNodeType);

    void b(RichTextScope richTextScope, AstNode astNode, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i);
}
