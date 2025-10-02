package org.commonmark.internal;

import org.commonmark.parser.block.BlockParser;
import org.commonmark.parser.block.BlockStart;

/* loaded from: classes8.dex */
public class BlockStartImpl extends BlockStart {

    /* renamed from: a, reason: collision with root package name */
    public final BlockParser[] f26819a;
    public int b = -1;
    public int c = -1;
    public int d = 0;

    public BlockStartImpl(BlockParser... blockParserArr) {
        this.f26819a = blockParserArr;
    }
}
