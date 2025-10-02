package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.Document;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.BlockContinue;

/* loaded from: classes8.dex */
public class DocumentBlockParser extends AbstractBlockParser {

    /* renamed from: a, reason: collision with root package name */
    public final Document f26823a = new Document();

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final boolean b() {
        return true;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26823a;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void e(SourceLine sourceLine) {
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final boolean f(Block block) {
        return true;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        return BlockContinue.a(documentParser.c);
    }
}
