package org.commonmark.parser.block;

import java.util.List;
import org.commonmark.internal.DocumentParser;
import org.commonmark.node.Block;
import org.commonmark.node.SourceSpan;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLine;

/* loaded from: classes8.dex */
public interface BlockParser {
    void a(InlineParser inlineParser);

    boolean b();

    boolean c();

    Block d();

    void e(SourceLine sourceLine);

    boolean f(Block block);

    BlockContinue g(DocumentParser documentParser);

    void h(SourceSpan sourceSpan);

    void i();

    List j();
}
