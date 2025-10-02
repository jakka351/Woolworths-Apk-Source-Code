package org.commonmark.internal.inline;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.node.Code;
import org.commonmark.node.Text;
import org.commonmark.parser.beta.InlineContentParser;
import org.commonmark.parser.beta.InlineContentParserFactory;
import org.commonmark.parser.beta.Position;
import org.commonmark.parser.beta.Scanner;

/* loaded from: classes8.dex */
public class BackticksInlineParser implements InlineContentParser {

    public static class Factory implements InlineContentParserFactory {
        @Override // org.commonmark.parser.beta.InlineContentParserFactory
        public final Set a() {
            HashSet hashSet = new HashSet(1);
            Object obj = new Object[]{'`'}[0];
            Objects.requireNonNull(obj);
            if (hashSet.add(obj)) {
                return Collections.unmodifiableSet(hashSet);
            }
            throw new IllegalArgumentException(b.m(obj, "duplicate element: "));
        }

        @Override // org.commonmark.parser.beta.InlineContentParserFactory
        public final InlineContentParser create() {
            return new BackticksInlineParser();
        }
    }

    @Override // org.commonmark.parser.beta.InlineContentParser
    public final ParsedInlineImpl a(InlineParserImpl inlineParserImpl) {
        Scanner scanner = inlineParserImpl.h;
        Position positionK = scanner.k();
        int iF = scanner.f('`');
        Position positionK2 = scanner.k();
        while (scanner.b('`') > 0) {
            Position positionK3 = scanner.k();
            if (scanner.f('`') == iF) {
                Code code = new Code();
                String strReplace = scanner.c(positionK2, positionK3).a().replace('\n', ' ');
                if (strReplace.length() >= 3) {
                    int i = 0;
                    if (strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                        int length = strReplace.length();
                        while (true) {
                            if (i >= length) {
                                i = length;
                                break;
                            }
                            if (strReplace.charAt(i) != ' ') {
                                break;
                            }
                            i++;
                        }
                        if (i != length) {
                            strReplace = a.h(1, 1, strReplace);
                        }
                    }
                }
                code.g = strReplace;
                return new ParsedInlineImpl(code, scanner.k());
            }
        }
        return new ParsedInlineImpl(new Text(scanner.c(positionK, positionK2).a()), positionK2);
    }
}
