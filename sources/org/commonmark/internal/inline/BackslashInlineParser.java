package org.commonmark.internal.inline;

import androidx.camera.core.impl.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Text;
import org.commonmark.parser.beta.InlineContentParser;
import org.commonmark.parser.beta.InlineContentParserFactory;
import org.commonmark.parser.beta.Scanner;

/* loaded from: classes8.dex */
public class BackslashInlineParser implements InlineContentParser {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f26846a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    public static class Factory implements InlineContentParserFactory {
        @Override // org.commonmark.parser.beta.InlineContentParserFactory
        public final Set a() {
            HashSet hashSet = new HashSet(1);
            Object obj = new Object[]{'\\'}[0];
            Objects.requireNonNull(obj);
            if (hashSet.add(obj)) {
                return Collections.unmodifiableSet(hashSet);
            }
            throw new IllegalArgumentException(b.m(obj, "duplicate element: "));
        }

        @Override // org.commonmark.parser.beta.InlineContentParserFactory
        public final InlineContentParser create() {
            return new BackslashInlineParser();
        }
    }

    @Override // org.commonmark.parser.beta.InlineContentParser
    public final ParsedInlineImpl a(InlineParserImpl inlineParserImpl) {
        Scanner scanner = inlineParserImpl.h;
        scanner.g();
        char cJ = scanner.j();
        if (cJ == '\n') {
            scanner.g();
            return new ParsedInlineImpl(new HardLineBreak(), scanner.k());
        }
        if (!f26846a.matcher(String.valueOf(cJ)).matches()) {
            return new ParsedInlineImpl(new Text("\\"), scanner.k());
        }
        scanner.g();
        return new ParsedInlineImpl(new Text(String.valueOf(cJ)), scanner.k());
    }
}
