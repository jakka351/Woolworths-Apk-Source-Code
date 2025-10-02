package org.commonmark.ext.autolink;

import java.util.EnumSet;
import java.util.HashSet;
import org.commonmark.ext.autolink.internal.AutolinkPostProcessor;
import org.commonmark.parser.Parser;
import org.nibor.autolink.LinkExtractor;
import org.nibor.autolink.LinkType;
import org.nibor.autolink.internal.EmailScanner;
import org.nibor.autolink.internal.UrlScanner;
import org.nibor.autolink.internal.WwwScanner;

/* loaded from: classes8.dex */
public class AutolinkExtension implements Parser.ParserExtension {
    @Override // org.commonmark.parser.Parser.ParserExtension
    public final void a(Parser.Builder builder) {
        AutolinkPostProcessor autolinkPostProcessor = new AutolinkPostProcessor();
        LinkExtractor.Builder builder2 = new LinkExtractor.Builder();
        builder2.f26870a = EnumSet.allOf(LinkType.class);
        LinkType linkType = LinkType.d;
        LinkType linkType2 = LinkType.e;
        EnumSet enumSetOf = EnumSet.of(linkType, linkType2);
        if (enumSetOf == null) {
            throw new NullPointerException("linkTypes must not be null");
        }
        HashSet hashSet = new HashSet(enumSetOf);
        builder2.f26870a = hashSet;
        autolinkPostProcessor.f26811a = new LinkExtractor(hashSet.contains(linkType) ? new UrlScanner() : null, builder2.f26870a.contains(LinkType.f) ? new WwwScanner() : null, builder2.f26870a.contains(linkType2) ? new EmailScanner() : null);
        builder.e.add(autolinkPostProcessor);
    }
}
