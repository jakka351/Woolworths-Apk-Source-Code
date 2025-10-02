package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ListItem;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.BlockContinue;

/* loaded from: classes8.dex */
public class ListItemParser extends AbstractBlockParser {

    /* renamed from: a, reason: collision with root package name */
    public final ListItem f26841a = new ListItem();
    public final int b;
    public boolean c;

    public ListItemParser(int i, int i2) {
        this.b = i2;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final boolean b() {
        return true;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26841a;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final boolean f(Block block) {
        if (!this.c) {
            return true;
        }
        Block block2 = (Block) this.f26841a.f26855a;
        if (!(block2 instanceof ListBlock)) {
            return true;
        }
        ((ListBlock) block2).g = false;
        return true;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        if (documentParser.i) {
            if (this.f26841a.b == null) {
                return null;
            }
            Block blockD = documentParser.g().d();
            this.c = (blockD instanceof Paragraph) || (blockD instanceof ListItem);
            return BlockContinue.a(documentParser.f);
        }
        int i = documentParser.h;
        int i2 = this.b;
        if (i >= i2) {
            return new BlockContinueImpl(-1, documentParser.d + i2, false);
        }
        return null;
    }
}
