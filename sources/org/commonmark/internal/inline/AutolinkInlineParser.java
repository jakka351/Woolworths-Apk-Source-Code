package org.commonmark.internal.inline;

import YU.a;
import androidx.camera.core.impl.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.node.Link;
import org.commonmark.node.Text;
import org.commonmark.parser.SourceLines;
import org.commonmark.parser.beta.InlineContentParser;
import org.commonmark.parser.beta.InlineContentParserFactory;
import org.commonmark.parser.beta.Position;
import org.commonmark.parser.beta.Scanner;

/* loaded from: classes8.dex */
public class AutolinkInlineParser implements InlineContentParser {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f26845a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
    public static final Pattern b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    public static class Factory implements InlineContentParserFactory {
        @Override // org.commonmark.parser.beta.InlineContentParserFactory
        public final Set a() {
            HashSet hashSet = new HashSet(1);
            Object obj = new Object[]{'<'}[0];
            Objects.requireNonNull(obj);
            if (hashSet.add(obj)) {
                return Collections.unmodifiableSet(hashSet);
            }
            throw new IllegalArgumentException(b.m(obj, "duplicate element: "));
        }

        @Override // org.commonmark.parser.beta.InlineContentParserFactory
        public final InlineContentParser create() {
            return new AutolinkInlineParser();
        }
    }

    @Override // org.commonmark.parser.beta.InlineContentParser
    public final ParsedInlineImpl a(InlineParserImpl inlineParserImpl) {
        Scanner scanner = inlineParserImpl.h;
        scanner.g();
        Position positionK = scanner.k();
        if (scanner.b('>') > 0) {
            SourceLines sourceLinesC = scanner.c(positionK, scanner.k());
            String strA = sourceLinesC.a();
            scanner.g();
            String strA2 = f26845a.matcher(strA).matches() ? strA : b.matcher(strA).matches() ? a.A("mailto:", strA) : null;
            if (strA2 != null) {
                Link link = new Link(strA2, null);
                Text text = new Text(strA);
                text.h(sourceLinesC.b());
                link.c(text);
                return new ParsedInlineImpl(link, scanner.k());
            }
        }
        return null;
    }
}
