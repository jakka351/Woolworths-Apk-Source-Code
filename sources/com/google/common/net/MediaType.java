package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.Immutable;
import io.jsonwebtoken.Header;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import org.bouncycastle.i18n.TextBundle;

@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class MediaType {
    public static final ImmutableListMultimap f = ImmutableListMultimap.p(Ascii.b(StandardCharsets.UTF_8.name()));
    public static final CharMatcher g = CharMatcher.e().b(CharMatcher.l().p()).b(CharMatcher.k()).b(CharMatcher.c("()<>@,;:\\\"/[]?=").p());
    public static final HashMap h;
    public static final Joiner.MapJoiner i;

    /* renamed from: a, reason: collision with root package name */
    public final String f14938a;
    public final String b;
    public final ImmutableListMultimap c;
    public String d;
    public int e;

    public static final class Tokenizer {
    }

    static {
        CharMatcher.e().b(CharMatcher.c("\"\\\r").p());
        CharMatcher.c(" \t\r\n");
        h = new HashMap();
        a("*", "*");
        a(TextBundle.TEXT_ENTRY, "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        b(TextBundle.TEXT_ENTRY, "cache-manifest");
        b(TextBundle.TEXT_ENTRY, "css");
        b(TextBundle.TEXT_ENTRY, "csv");
        b(TextBundle.TEXT_ENTRY, "html");
        b(TextBundle.TEXT_ENTRY, "calendar");
        b(TextBundle.TEXT_ENTRY, "markdown");
        b(TextBundle.TEXT_ENTRY, "plain");
        b(TextBundle.TEXT_ENTRY, "javascript");
        b(TextBundle.TEXT_ENTRY, "tab-separated-values");
        b(TextBundle.TEXT_ENTRY, "vcard");
        b(TextBundle.TEXT_ENTRY, "vnd.wap.wml");
        b(TextBundle.TEXT_ENTRY, "xml");
        b(TextBundle.TEXT_ENTRY, "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        b("application", "json");
        a("application", "jwt");
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", Header.COMPRESSION_ALGORITHM);
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        i = new Joiner.MapJoiner(new Joiner("; "));
    }

    public MediaType(String str, String str2, ImmutableListMultimap immutableListMultimap) {
        this.f14938a = str;
        this.b = str2;
        this.c = immutableListMultimap;
    }

    public static void a(String str, String str2) {
        MediaType mediaType = new MediaType(str, str2, ImmutableListMultimap.o());
        h.put(mediaType, mediaType);
    }

    public static void b(String str, String str2) {
        MediaType mediaType = new MediaType(str, str2, f);
        h.put(mediaType, mediaType);
        Optional.d(StandardCharsets.UTF_8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        MediaType mediaType = (MediaType) obj;
        if (this.f14938a.equals(mediaType.f14938a) && this.b.equals(mediaType.b)) {
            return ((AbstractMap) Maps.j(this.c.p1(), new a(1))).equals(Maps.j(mediaType.c.p1(), new a(1)));
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(new Object[]{this.f14938a, this.b, Maps.j(this.c.p1(), new a(1))});
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14938a);
        sb.append('/');
        sb.append(this.b);
        ImmutableListMultimap immutableListMultimap = this.c;
        if (!immutableListMultimap.isEmpty()) {
            sb.append("; ");
            Collection collectionL = Multimaps.a(immutableListMultimap, new a(0)).l();
            Joiner.MapJoiner mapJoiner = i;
            mapJoiner.getClass();
            try {
                mapJoiner.a(sb, collectionL.iterator());
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        String string = sb.toString();
        this.d = string;
        return string;
    }
}
