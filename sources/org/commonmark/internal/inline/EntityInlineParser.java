package org.commonmark.internal.inline;

import androidx.camera.core.impl.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.internal.util.Html5Entities;
import org.commonmark.node.Text;
import org.commonmark.parser.beta.InlineContentParser;
import org.commonmark.parser.beta.InlineContentParserFactory;
import org.commonmark.parser.beta.Position;
import org.commonmark.parser.beta.Scanner;
import org.commonmark.text.AsciiMatcher;

/* loaded from: classes8.dex */
public class EntityInlineParser implements InlineContentParser {

    /* renamed from: a, reason: collision with root package name */
    public static final AsciiMatcher f26848a;
    public static final AsciiMatcher b;
    public static final AsciiMatcher c;
    public static final AsciiMatcher d;

    public static class Factory implements InlineContentParserFactory {
        @Override // org.commonmark.parser.beta.InlineContentParserFactory
        public final Set a() {
            HashSet hashSet = new HashSet(1);
            Object obj = new Object[]{'&'}[0];
            Objects.requireNonNull(obj);
            if (hashSet.add(obj)) {
                return Collections.unmodifiableSet(hashSet);
            }
            throw new IllegalArgumentException(b.m(obj, "duplicate element: "));
        }

        @Override // org.commonmark.parser.beta.InlineContentParserFactory
        public final InlineContentParser create() {
            return new EntityInlineParser();
        }
    }

    static {
        AsciiMatcher.Builder builderB = AsciiMatcher.b();
        builderB.b('0', '9');
        builderB.b('A', 'F');
        builderB.b('a', 'f');
        f26848a = new AsciiMatcher(builderB);
        AsciiMatcher.Builder builderB2 = AsciiMatcher.b();
        builderB2.b('0', '9');
        b = new AsciiMatcher(builderB2);
        AsciiMatcher.Builder builderB3 = AsciiMatcher.b();
        builderB3.b('A', Matrix.MATRIX_TYPE_ZERO);
        builderB3.b('a', 'z');
        AsciiMatcher asciiMatcher = new AsciiMatcher(builderB3);
        c = asciiMatcher;
        AsciiMatcher.Builder builderC = asciiMatcher.c();
        builderC.b('0', '9');
        d = new AsciiMatcher(builderC);
    }

    public static ParsedInlineImpl b(Position position, Scanner scanner) {
        return new ParsedInlineImpl(new Text(Html5Entities.a(scanner.c(position, scanner.k()).a())), scanner.k());
    }

    @Override // org.commonmark.parser.beta.InlineContentParser
    public final ParsedInlineImpl a(InlineParserImpl inlineParserImpl) {
        Scanner scanner = inlineParserImpl.h;
        Position positionK = scanner.k();
        scanner.g();
        char cJ = scanner.j();
        if (cJ != '#') {
            if (!c.f26867a.get(cJ)) {
                return null;
            }
            scanner.e(d);
            if (scanner.h(';')) {
                return b(positionK, scanner);
            }
            return null;
        }
        scanner.g();
        if (scanner.h('x') || scanner.h('X')) {
            int iE = scanner.e(f26848a);
            if (1 > iE || iE > 6 || !scanner.h(';')) {
                return null;
            }
            return b(positionK, scanner);
        }
        int iE2 = scanner.e(b);
        if (1 > iE2 || iE2 > 7 || !scanner.h(';')) {
            return null;
        }
        return b(positionK, scanner);
    }
}
