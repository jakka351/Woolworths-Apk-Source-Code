package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.BlockQuote;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.MatchedBlockParser;

/* loaded from: classes8.dex */
public class BlockQuoteParser extends AbstractBlockParser {

    /* renamed from: a, reason: collision with root package name */
    public final BlockQuote f26818a = new BlockQuote();

    public static class Factory extends AbstractBlockParserFactory {
        @Override // org.commonmark.parser.block.BlockParserFactory
        public final BlockStartImpl a(DocumentParser documentParser, MatchedBlockParser matchedBlockParser) {
            char cCharAt;
            int i = documentParser.f;
            if (!BlockQuoteParser.k(documentParser, i)) {
                return null;
            }
            int i2 = documentParser.h + documentParser.d;
            int i3 = i2 + 1;
            CharSequence charSequence = documentParser.f26824a.f26860a;
            int i4 = i + 1;
            if (i4 < charSequence.length() && ((cCharAt = charSequence.charAt(i4)) == '\t' || cCharAt == ' ')) {
                i3 = i2 + 2;
            }
            BlockStartImpl blockStartImpl = new BlockStartImpl(new BlockQuoteParser());
            blockStartImpl.c = i3;
            return blockStartImpl;
        }
    }

    public static boolean k(DocumentParser documentParser, int i) {
        CharSequence charSequence = documentParser.f26824a.f26860a;
        return documentParser.h < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26818a;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        char cCharAt;
        int i = documentParser.f;
        if (!k(documentParser, i)) {
            return null;
        }
        int i2 = documentParser.h + documentParser.d;
        int i3 = i2 + 1;
        CharSequence charSequence = documentParser.f26824a.f26860a;
        int i4 = i + 1;
        if (i4 < charSequence.length() && ((cCharAt = charSequence.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new BlockContinueImpl(-1, i3, false);
    }
}
