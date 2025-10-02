package io.noties.markwon.html;

import io.jsonwebtoken.Claims;
import io.noties.markwon.html.jsoup.parser.Token;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes7.dex */
public class MarkwonHtmlParserImpl extends MarkwonHtmlParser {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f24207a = Collections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", AnnotatedPrivateKey.LABEL, "map", "object", "q", "samp", "script", "select", "small", "span", "strong", Claims.SUBJECT, "sup", "textarea", "time", "tt", "var")));
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));

    /* renamed from: io.noties.markwon.html.MarkwonHtmlParserImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24208a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f24208a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24208a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24208a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
