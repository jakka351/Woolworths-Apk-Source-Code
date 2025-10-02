package org.commonmark.parser.block;

import org.commonmark.internal.BlockStartImpl;
import org.commonmark.internal.DocumentParser;

/* loaded from: classes8.dex */
public interface BlockParserFactory {
    BlockStartImpl a(DocumentParser documentParser, MatchedBlockParser matchedBlockParser);
}
