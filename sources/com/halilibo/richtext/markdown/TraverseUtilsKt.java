package com.halilibo.richtext.markdown;

import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.markdown.node.AstNodeLinks;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-markdown_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TraverseUtilsKt {
    public static final Sequence a(AstNode astNode, boolean z) {
        Intrinsics.h(astNode, "<this>");
        AstNodeLinks astNodeLinks = astNode.b;
        return !z ? SequencesKt.m(astNodeLinks.b, new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(10)) : SequencesKt.m(astNodeLinks.c, new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(11));
    }

    public static FilteringSequence b(AstNode astNode, Function1 function1) {
        Intrinsics.h(astNode, "<this>");
        return SequencesKt.g(a(astNode, false), function1);
    }
}
