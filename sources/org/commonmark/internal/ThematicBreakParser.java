package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.MatchedBlockParser;

/* loaded from: classes8.dex */
public class ThematicBreakParser extends AbstractBlockParser {

    /* renamed from: a, reason: collision with root package name */
    public final ThematicBreak f26844a = new ThematicBreak();

    public static class Factory extends AbstractBlockParserFactory {
        @Override // org.commonmark.parser.block.BlockParserFactory
        public final BlockStartImpl a(DocumentParser documentParser, MatchedBlockParser matchedBlockParser) {
            if (documentParser.h >= 4) {
                return null;
            }
            CharSequence charSequence = documentParser.f26824a.f26860a;
            int length = charSequence.length();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = documentParser.f; i4 < length; i4++) {
                char cCharAt = charSequence.charAt(i4);
                if (cCharAt != '\t' && cCharAt != ' ') {
                    if (cCharAt == '*') {
                        i3++;
                    } else if (cCharAt == '-') {
                        i++;
                    } else {
                        if (cCharAt != '_') {
                            return null;
                        }
                        i2++;
                    }
                }
            }
            if ((i < 3 || i2 != 0 || i3 != 0) && ((i2 < 3 || i != 0 || i3 != 0) && (i3 < 3 || i != 0 || i2 != 0))) {
                return null;
            }
            BlockStartImpl blockStartImpl = new BlockStartImpl(new ThematicBreakParser(String.valueOf(charSequence.subSequence(documentParser.c, charSequence.length()))));
            blockStartImpl.b = charSequence.length();
            return blockStartImpl;
        }
    }

    public ThematicBreakParser(String str) {
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26844a;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        return null;
    }
}
