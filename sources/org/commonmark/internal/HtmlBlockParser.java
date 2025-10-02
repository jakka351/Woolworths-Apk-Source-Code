package org.commonmark.internal;

import java.util.regex.Pattern;
import org.commonmark.internal.DocumentParser;
import org.commonmark.node.Block;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.MatchedBlockParser;

/* loaded from: classes8.dex */
public class HtmlBlockParser extends AbstractBlockParser {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;

    /* renamed from: a, reason: collision with root package name */
    public final HtmlBlock f26829a = new HtmlBlock();
    public boolean c = false;
    public BlockContent d = new BlockContent();

    public static class Factory extends AbstractBlockParserFactory {
        @Override // org.commonmark.parser.block.BlockParserFactory
        public final BlockStartImpl a(DocumentParser documentParser, MatchedBlockParser matchedBlockParser) {
            int i = documentParser.f;
            CharSequence charSequence = documentParser.f26824a.f26860a;
            if (documentParser.h >= 4 || charSequence.charAt(i) != '<') {
                return null;
            }
            for (int i2 = 1; i2 <= 7; i2++) {
                if (i2 != 7 || (!(((DocumentParser.MatchedBlockParserImpl) matchedBlockParser).f26825a.d() instanceof Paragraph) && !documentParser.g().c())) {
                    Pattern[] patternArr = HtmlBlockParser.e[i2];
                    Pattern pattern = patternArr[0];
                    Pattern pattern2 = patternArr[1];
                    if (pattern.matcher(charSequence.subSequence(i, charSequence.length())).find()) {
                        BlockStartImpl blockStartImpl = new BlockStartImpl(new HtmlBlockParser(pattern2));
                        blockStartImpl.b = documentParser.c;
                        return blockStartImpl;
                    }
                }
            }
            return null;
        }
    }

    public HtmlBlockParser(Pattern pattern) {
        this.b = pattern;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26829a;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void e(SourceLine sourceLine) {
        BlockContent blockContent = this.d;
        CharSequence charSequence = sourceLine.f26860a;
        StringBuilder sb = blockContent.f26816a;
        if (blockContent.b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        blockContent.b++;
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.c = true;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        if (this.c) {
            return null;
        }
        if (documentParser.i && this.b == null) {
            return null;
        }
        return BlockContinue.a(documentParser.c);
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void i() {
        this.f26829a.g = this.d.f26816a.toString();
        this.d = null;
    }
}
