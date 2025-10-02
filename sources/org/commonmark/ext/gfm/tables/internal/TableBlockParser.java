package org.commonmark.ext.gfm.tables.internal;

import YU.a;
import java.util.ArrayList;
import java.util.List;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.internal.BlockStartImpl;
import org.commonmark.internal.DocumentParser;
import org.commonmark.node.Block;
import org.commonmark.node.SourceSpan;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.SourceLines;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.text.Characters;

/* loaded from: classes8.dex */
public class TableBlockParser extends AbstractBlockParser {

    /* renamed from: a, reason: collision with root package name */
    public final TableBlock f26813a = new TableBlock();
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;

    public static class Factory extends AbstractBlockParserFactory {
        @Override // org.commonmark.parser.block.BlockParserFactory
        public final BlockStartImpl a(DocumentParser documentParser, MatchedBlockParser matchedBlockParser) {
            int i;
            boolean z;
            ArrayList arrayList = matchedBlockParser.a().f26861a;
            if (arrayList.size() >= 1 && Characters.a('|', ((SourceLine) a.c(1, arrayList)).f26860a, 0) != -1) {
                SourceLine sourceLine = documentParser.f26824a;
                CharSequence charSequence = sourceLine.a(documentParser.c, sourceLine.f26860a.length()).f26860a;
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (true) {
                    if (i2 >= charSequence.length()) {
                        if (!z2) {
                            break;
                        }
                    } else {
                        char cCharAt = charSequence.charAt(i2);
                        if (cCharAt == '\t' || cCharAt == ' ') {
                            i2++;
                        } else if (cCharAt == '-' || cCharAt == ':') {
                            if (i3 == 0 && !arrayList2.isEmpty()) {
                                break;
                            }
                            if (cCharAt == ':') {
                                i2++;
                                i = 1;
                            } else {
                                i = 0;
                            }
                            int i4 = i;
                            boolean z3 = false;
                            while (i2 < charSequence.length() && charSequence.charAt(i2) == '-') {
                                i2++;
                                i++;
                                z3 = true;
                            }
                            if (!z3) {
                                break;
                            }
                            if (i2 >= charSequence.length() || charSequence.charAt(i2) != ':') {
                                z = false;
                            } else {
                                i2++;
                                i++;
                                z = true;
                            }
                            arrayList2.add(new TableCellInfo((i4 == 0 || !z) ? i4 != 0 ? TableCell.Alignment.d : z ? TableCell.Alignment.f : null : TableCell.Alignment.e, i));
                            i3 = 0;
                        } else {
                            if (cCharAt != '|') {
                                break;
                            }
                            i2++;
                            i3++;
                            if (i3 > 1) {
                                break;
                            }
                            z2 = true;
                        }
                    }
                }
                arrayList2 = null;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    SourceLine sourceLine2 = (SourceLine) a.c(1, arrayList);
                    if (arrayList2.size() >= TableBlockParser.l(sourceLine2).size()) {
                        BlockStartImpl blockStartImpl = new BlockStartImpl(new TableBlockParser(arrayList2, sourceLine2));
                        blockStartImpl.b = documentParser.c;
                        blockStartImpl.d = 1;
                        return blockStartImpl;
                    }
                }
            }
            return null;
        }
    }

    public static class TableCellInfo {

        /* renamed from: a, reason: collision with root package name */
        public final TableCell.Alignment f26814a;

        public TableCellInfo(TableCell.Alignment alignment, int i) {
            this.f26814a = alignment;
        }
    }

    public TableBlockParser(ArrayList arrayList, SourceLine sourceLine) {
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.d = true;
        this.c = arrayList;
        arrayList2.add(sourceLine);
    }

    public static ArrayList l(SourceLine sourceLine) {
        CharSequence charSequence = sourceLine.f26860a;
        int iD = Characters.d(charSequence, 0, charSequence.length());
        int length = charSequence.length();
        if (charSequence.charAt(iD) == '|') {
            iD++;
            length = Characters.e(charSequence, charSequence.length() - 1, iD) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = iD;
        while (iD < length) {
            char cCharAt = charSequence.charAt(iD);
            if (cCharAt == '\\') {
                int i2 = iD + 1;
                if (i2 >= length || charSequence.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    iD = i2;
                }
            } else if (cCharAt != '|') {
                sb.append(cCharAt);
            } else {
                arrayList.add(new SourceLine(sb.toString(), sourceLine.a(i, iD).b));
                sb.setLength(0);
                i = iD + 1;
            }
            iD++;
        }
        if (sb.length() > 0) {
            arrayList.add(new SourceLine(sb.toString(), sourceLine.a(i, sourceLine.f26860a.length()).b));
        }
        return arrayList;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void a(InlineParser inlineParser) {
        TableBlock tableBlock = this.f26813a;
        List listE = tableBlock.e();
        SourceSpan sourceSpan = !listE.isEmpty() ? (SourceSpan) listE.get(0) : null;
        TableHead tableHead = new TableHead();
        if (sourceSpan != null) {
            tableHead.b(sourceSpan);
        }
        tableBlock.c(tableHead);
        TableRow tableRow = new TableRow();
        tableRow.h(tableHead.e());
        tableHead.c(tableRow);
        ArrayList arrayList = this.b;
        ArrayList arrayListL = l((SourceLine) arrayList.get(0));
        int size = arrayListL.size();
        for (int i = 0; i < size; i++) {
            TableCell tableCellK = k((SourceLine) arrayListL.get(i), i, inlineParser);
            tableCellK.g = true;
            tableRow.c(tableCellK);
        }
        int i2 = 2;
        TableBody tableBody = null;
        while (i2 < arrayList.size()) {
            SourceLine sourceLine = (SourceLine) arrayList.get(i2);
            SourceSpan sourceSpan2 = i2 < listE.size() ? (SourceSpan) listE.get(i2) : null;
            ArrayList arrayListL2 = l(sourceLine);
            TableRow tableRow2 = new TableRow();
            if (sourceSpan2 != null) {
                tableRow2.b(sourceSpan2);
            }
            int i3 = 0;
            while (i3 < size) {
                tableRow2.c(k(i3 < arrayListL2.size() ? (SourceLine) arrayListL2.get(i3) : new SourceLine("", null), i3, inlineParser));
                i3++;
            }
            if (tableBody == null) {
                tableBody = new TableBody();
                tableBlock.c(tableBody);
            }
            tableBody.c(tableRow2);
            tableBody.b(sourceSpan2);
            i2++;
        }
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final boolean c() {
        return this.d;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26813a;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final void e(SourceLine sourceLine) {
        this.b.add(sourceLine);
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        CharSequence charSequence = documentParser.f26824a.f26860a;
        int iA = Characters.a('|', charSequence, documentParser.f);
        if (iA == -1) {
            return null;
        }
        if (iA != documentParser.f || Characters.d(charSequence, iA + 1, charSequence.length()) != charSequence.length()) {
            return BlockContinue.a(documentParser.c);
        }
        this.d = false;
        return null;
    }

    public final TableCell k(SourceLine sourceLine, int i, InlineParser inlineParser) {
        TableCell tableCell = new TableCell();
        SourceSpan sourceSpan = sourceLine.b;
        if (sourceSpan != null) {
            tableCell.b(sourceSpan);
        }
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            tableCell.h = ((TableCellInfo) arrayList.get(i)).f26814a;
        }
        CharSequence charSequence = sourceLine.f26860a;
        int iD = Characters.d(charSequence, 0, charSequence.length());
        SourceLine sourceLineA = sourceLine.a(iD, Characters.e(charSequence, charSequence.length() - 1, iD) + 1);
        SourceLines sourceLines = new SourceLines();
        sourceLines.f26861a.add(sourceLineA);
        inlineParser.a(sourceLines, tableCell);
        return tableCell;
    }
}
