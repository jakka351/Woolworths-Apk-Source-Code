package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.Heading;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLines;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;

/* loaded from: classes8.dex */
public class HeadingParser extends AbstractBlockParser {

    /* renamed from: a, reason: collision with root package name */
    public final Heading f26828a;
    public final SourceLines b;

    public static class Factory extends AbstractBlockParserFactory {
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
        @Override // org.commonmark.parser.block.BlockParserFactory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final org.commonmark.internal.BlockStartImpl a(org.commonmark.internal.DocumentParser r14, org.commonmark.parser.block.MatchedBlockParser r15) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.HeadingParser.Factory.a(org.commonmark.internal.DocumentParser, org.commonmark.parser.block.MatchedBlockParser):org.commonmark.internal.BlockStartImpl");
        }
    }

    public HeadingParser(int i, SourceLines sourceLines) {
        Heading heading = new Heading();
        this.f26828a = heading;
        heading.g = i;
        this.b = sourceLines;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void a(InlineParser inlineParser) {
        inlineParser.a(this.b, this.f26828a);
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26828a;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        return null;
    }
}
