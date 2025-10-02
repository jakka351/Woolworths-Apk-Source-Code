package org.commonmark.internal;

import java.util.ArrayList;
import org.commonmark.node.Block;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.text.Characters;

/* loaded from: classes8.dex */
public class IndentedCodeBlockParser extends AbstractBlockParser {

    /* renamed from: a, reason: collision with root package name */
    public final IndentedCodeBlock f26830a = new IndentedCodeBlock();
    public final ArrayList b = new ArrayList();

    public static class Factory extends AbstractBlockParserFactory {
        @Override // org.commonmark.parser.block.BlockParserFactory
        public final BlockStartImpl a(DocumentParser documentParser, MatchedBlockParser matchedBlockParser) {
            if (documentParser.h < 4 || documentParser.i || (documentParser.g().d() instanceof Paragraph)) {
                return null;
            }
            BlockStartImpl blockStartImpl = new BlockStartImpl(new IndentedCodeBlockParser());
            blockStartImpl.c = documentParser.d + 4;
            return blockStartImpl;
        }
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26830a;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void e(SourceLine sourceLine) {
        this.b.add(sourceLine.f26860a);
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        if (documentParser.h >= 4) {
            return new BlockContinueImpl(-1, documentParser.d + 4, false);
        }
        if (documentParser.i) {
            return BlockContinue.a(documentParser.f);
        }
        return null;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void i() {
        int i;
        CharSequence charSequence;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                break;
            } else {
                charSequence = (CharSequence) arrayList.get(size);
            }
        } while (Characters.d(charSequence, 0, charSequence.length()) == charSequence.length());
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < size + 1; i++) {
            sb.append((CharSequence) arrayList.get(i));
            sb.append('\n');
        }
        this.f26830a.g = sb.toString();
    }
}
