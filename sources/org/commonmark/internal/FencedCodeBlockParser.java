package org.commonmark.internal;

import org.commonmark.internal.util.Escaping;
import org.commonmark.node.Block;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.text.Characters;

/* loaded from: classes8.dex */
public class FencedCodeBlockParser extends AbstractBlockParser {

    /* renamed from: a, reason: collision with root package name */
    public final FencedCodeBlock f26827a;
    public final char b;
    public final int c;
    public String d;
    public final StringBuilder e;

    public static class Factory extends AbstractBlockParserFactory {
        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        @Override // org.commonmark.parser.block.BlockParserFactory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final org.commonmark.internal.BlockStartImpl a(org.commonmark.internal.DocumentParser r11, org.commonmark.parser.block.MatchedBlockParser r12) {
            /*
                r10 = this;
                int r12 = r11.h
                r0 = 4
                r1 = 0
                if (r12 < r0) goto L7
                goto L63
            L7:
                int r0 = r11.f
                org.commonmark.parser.SourceLine r11 = r11.f26824a
                java.lang.CharSequence r11 = r11.f26860a
                int r2 = r11.length()
                r3 = 0
                r4 = r0
                r5 = r3
                r6 = r5
            L15:
                r7 = 126(0x7e, float:1.77E-43)
                r8 = 96
                if (r4 >= r2) goto L2c
                char r9 = r11.charAt(r4)
                if (r9 == r8) goto L27
                if (r9 == r7) goto L24
                goto L2c
            L24:
                int r6 = r6 + 1
                goto L29
            L27:
                int r5 = r5 + 1
            L29:
                int r4 = r4 + 1
                goto L15
            L2c:
                r2 = 3
                if (r5 < r2) goto L41
                if (r6 != 0) goto L41
                int r2 = r0 + r5
                int r11 = org.commonmark.text.Characters.a(r8, r11, r2)
                r2 = -1
                if (r11 == r2) goto L3b
                goto L4b
            L3b:
                org.commonmark.internal.FencedCodeBlockParser r11 = new org.commonmark.internal.FencedCodeBlockParser
                r11.<init>(r5, r12, r8)
                goto L4c
            L41:
                if (r6 < r2) goto L4b
                if (r5 != 0) goto L4b
                org.commonmark.internal.FencedCodeBlockParser r11 = new org.commonmark.internal.FencedCodeBlockParser
                r11.<init>(r6, r12, r7)
                goto L4c
            L4b:
                r11 = r1
            L4c:
                if (r11 == 0) goto L63
                r12 = 1
                org.commonmark.parser.block.BlockParser[] r12 = new org.commonmark.parser.block.BlockParser[r12]
                r12[r3] = r11
                org.commonmark.internal.BlockStartImpl r1 = new org.commonmark.internal.BlockStartImpl
                r1.<init>(r12)
                org.commonmark.node.FencedCodeBlock r11 = r11.f26827a
                java.lang.Integer r11 = r11.h
                int r11 = r11.intValue()
                int r11 = r11 + r0
                r1.b = r11
            L63:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.FencedCodeBlockParser.Factory.a(org.commonmark.internal.DocumentParser, org.commonmark.parser.block.MatchedBlockParser):org.commonmark.internal.BlockStartImpl");
        }
    }

    public FencedCodeBlockParser(int i, int i2, char c) {
        FencedCodeBlock fencedCodeBlock = new FencedCodeBlock();
        this.f26827a = fencedCodeBlock;
        this.e = new StringBuilder();
        this.b = c;
        this.c = i;
        fencedCodeBlock.g = String.valueOf(c);
        Integer numValueOf = Integer.valueOf(i);
        if (i < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        Integer num = fencedCodeBlock.i;
        if (num != null && num.intValue() < i) {
            throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
        }
        fencedCodeBlock.h = numValueOf;
        fencedCodeBlock.j = i2;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26827a;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void e(SourceLine sourceLine) {
        CharSequence charSequence = sourceLine.f26860a;
        if (this.d == null) {
            this.d = charSequence.toString();
            return;
        }
        StringBuilder sb = this.e;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        int i = documentParser.f;
        int i2 = documentParser.c;
        CharSequence charSequence = documentParser.f26824a.f26860a;
        int i3 = documentParser.h;
        FencedCodeBlock fencedCodeBlock = this.f26827a;
        if (i3 < 4 && i < charSequence.length()) {
            int length = charSequence.length();
            int i4 = i;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (charSequence.charAt(i4) != this.b) {
                    length = i4;
                    break;
                }
                i4++;
            }
            int i5 = length - i;
            if (i5 >= this.c && Characters.d(charSequence, i + i5, charSequence.length()) == charSequence.length()) {
                Integer numValueOf = Integer.valueOf(i5);
                if (i5 < 3) {
                    throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
                }
                Integer num = fencedCodeBlock.h;
                if (num != null && i5 < num.intValue()) {
                    throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
                }
                fencedCodeBlock.i = numValueOf;
                return new BlockContinueImpl(-1, -1, true);
            }
        }
        int length2 = charSequence.length();
        for (int i6 = fencedCodeBlock.j; i6 > 0 && i2 < length2 && charSequence.charAt(i2) == ' '; i6--) {
            i2++;
        }
        return BlockContinue.a(i2);
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void i() {
        String strB = Escaping.b(this.d.trim());
        FencedCodeBlock fencedCodeBlock = this.f26827a;
        fencedCodeBlock.k = strB;
        fencedCodeBlock.l = this.e.toString();
    }
}
