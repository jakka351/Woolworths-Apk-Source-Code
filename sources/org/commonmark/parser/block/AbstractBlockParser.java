package org.commonmark.parser.block;

import java.util.Collections;
import java.util.List;
import org.commonmark.internal.BlockQuoteParser;
import org.commonmark.internal.ParagraphParser;
import org.commonmark.node.Block;
import org.commonmark.node.SourceSpan;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLine;

/* loaded from: classes8.dex */
public abstract class AbstractBlockParser implements BlockParser {
    @Override // org.commonmark.parser.block.BlockParser
    public void a(InlineParser inlineParser) {
    }

    @Override // org.commonmark.parser.block.BlockParser
    public boolean b() {
        return this instanceof BlockQuoteParser;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public boolean c() {
        return this instanceof ParagraphParser;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public void e(SourceLine sourceLine) {
    }

    @Override // org.commonmark.parser.block.BlockParser
    public boolean f(Block block) {
        return this instanceof BlockQuoteParser;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public void h(SourceSpan sourceSpan) {
        d().b(sourceSpan);
    }

    @Override // org.commonmark.parser.block.BlockParser
    public void i() {
    }

    @Override // org.commonmark.parser.block.BlockParser
    public List j() {
        return Collections.EMPTY_LIST;
    }
}
