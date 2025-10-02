package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ListItem;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;

/* loaded from: classes8.dex */
public class ListBlockParser extends AbstractBlockParser {

    /* renamed from: a, reason: collision with root package name */
    public final ListBlock f26838a;
    public boolean b;
    public int c;

    public static class Factory extends AbstractBlockParserFactory {
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.commonmark.parser.block.BlockParserFactory
        public final org.commonmark.internal.BlockStartImpl a(org.commonmark.internal.DocumentParser r17, org.commonmark.parser.block.MatchedBlockParser r18) {
            /*
                Method dump skipped, instructions count: 394
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.ListBlockParser.Factory.a(org.commonmark.internal.DocumentParser, org.commonmark.parser.block.MatchedBlockParser):org.commonmark.internal.BlockStartImpl");
        }
    }

    public static class ListData {

        /* renamed from: a, reason: collision with root package name */
        public final ListBlock f26839a;
        public final int b;

        public ListData(ListBlock listBlock, int i) {
            this.f26839a = listBlock;
            this.b = i;
        }
    }

    public static class ListMarkerData {

        /* renamed from: a, reason: collision with root package name */
        public final ListBlock f26840a;
        public final int b;

        public ListMarkerData(ListBlock listBlock, int i) {
            this.f26840a = listBlock;
            this.b = i;
        }
    }

    public ListBlockParser(ListBlock listBlock) {
        this.f26838a = listBlock;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final boolean b() {
        return true;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final Block d() {
        return this.f26838a;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public final boolean f(Block block) {
        if (!(block instanceof ListItem)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.f26838a.g = false;
            this.b = false;
        }
        return true;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public final BlockContinue g(DocumentParser documentParser) {
        if (documentParser.i) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return BlockContinue.a(documentParser.c);
    }
}
