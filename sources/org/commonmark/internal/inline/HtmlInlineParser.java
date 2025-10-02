package org.commonmark.internal.inline;

import androidx.camera.core.impl.b;
import io.jsonwebtoken.JwtParser;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import org.commonmark.node.HtmlInline;
import org.commonmark.parser.beta.InlineContentParser;
import org.commonmark.parser.beta.InlineContentParserFactory;
import org.commonmark.parser.beta.Position;
import org.commonmark.parser.beta.Scanner;
import org.commonmark.text.AsciiMatcher;

/* loaded from: classes8.dex */
public class HtmlInlineParser implements InlineContentParser {

    /* renamed from: a, reason: collision with root package name */
    public static final AsciiMatcher f26849a;
    public static final AsciiMatcher b;
    public static final AsciiMatcher c;
    public static final AsciiMatcher d;
    public static final AsciiMatcher e;
    public static final AsciiMatcher f;

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
            return new HtmlInlineParser();
        }
    }

    static {
        AsciiMatcher.Builder builderB = AsciiMatcher.b();
        builderB.b('A', Matrix.MATRIX_TYPE_ZERO);
        builderB.b('a', 'z');
        AsciiMatcher asciiMatcher = new AsciiMatcher(builderB);
        f26849a = asciiMatcher;
        b = asciiMatcher;
        AsciiMatcher.Builder builderC = asciiMatcher.c();
        builderC.b('0', '9');
        builderC.a('-');
        c = new AsciiMatcher(builderC);
        AsciiMatcher.Builder builderC2 = asciiMatcher.c();
        builderC2.a('_');
        builderC2.a(':');
        AsciiMatcher asciiMatcher2 = new AsciiMatcher(builderC2);
        d = asciiMatcher2;
        AsciiMatcher.Builder builderC3 = asciiMatcher2.c();
        builderC3.b('0', '9');
        builderC3.a(JwtParser.SEPARATOR_CHAR);
        builderC3.a('-');
        e = new AsciiMatcher(builderC3);
        AsciiMatcher.Builder builderB2 = AsciiMatcher.b();
        builderB2.a(' ');
        builderB2.a('\t');
        builderB2.a('\n');
        builderB2.a((char) 11);
        builderB2.a('\f');
        builderB2.a('\r');
        builderB2.a('\"');
        builderB2.a('\'');
        builderB2.a('=');
        builderB2.a('<');
        builderB2.a('>');
        builderB2.a('`');
        f = new AsciiMatcher(builderB2);
    }

    public static ParsedInlineImpl b(Position position, Scanner scanner) {
        String strA = scanner.c(position, scanner.k()).a();
        HtmlInline htmlInline = new HtmlInline();
        htmlInline.g = strA;
        return new ParsedInlineImpl(htmlInline, scanner.k());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r10.e(org.commonmark.internal.inline.HtmlInlineParser.d) < 1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0179, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x002e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r10.e(org.commonmark.internal.inline.HtmlInlineParser.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r10.m() < 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r10.h('=') == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r10.m();
        r1 = r10.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r1 != '\'') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r10.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r10.b('\'') >= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        r10.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r1 != '\"') goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r10.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r10.b('\"') >= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r10.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r2 = r10.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r2 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (org.commonmark.internal.inline.HtmlInlineParser.f.f26867a.get(r2) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r1 > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r10.m() < 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        r1 = r1 + 1;
        r10.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        r10.h('/');
        r8 = r10.h('>');
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        if (r8 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        return b(r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r10.m() >= 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r1 == false) goto L114;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0093 -> B:6:0x002b). Please report as a decompilation issue!!! */
    @Override // org.commonmark.parser.beta.InlineContentParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.commonmark.internal.inline.ParsedInlineImpl a(org.commonmark.internal.InlineParserImpl r10) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.inline.HtmlInlineParser.a(org.commonmark.internal.InlineParserImpl):org.commonmark.internal.inline.ParsedInlineImpl");
    }
}
