package com.halilibo.richtext.commonmark;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import org.commonmark.Extension;
import org.commonmark.ext.autolink.AutolinkExtension;
import org.commonmark.ext.gfm.strikethrough.StrikethroughExtension;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.parser.Parser;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/commonmark/CommonmarkAstNodeParser;", "", "richtext-commonmark_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonmarkAstNodeParser {

    /* renamed from: a, reason: collision with root package name */
    public final Parser f16242a;

    public CommonmarkAstNodeParser(CommonMarkdownParseOptions commonMarkdownParseOptions) {
        Parser.Builder builder = new Parser.Builder();
        builder.a(ArraysKt.F(new Extension[]{new TablesExtension(), new StrikethroughExtension(), commonMarkdownParseOptions.f16241a ? new AutolinkExtension() : null}));
        this.f16242a = new Parser(builder);
    }
}
