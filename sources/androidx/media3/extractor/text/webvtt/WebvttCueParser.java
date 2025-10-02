package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
/* loaded from: classes2.dex */
public final class WebvttCueParser {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f3398a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    public static class Element {
        public static final a c = new a(0);

        /* renamed from: a, reason: collision with root package name */
        public final StartTag f3399a;
        public final int b;

        public Element(StartTag startTag, int i) {
            this.f3399a = startTag;
            this.b = i;
        }
    }

    public static final class StartTag {

        /* renamed from: a, reason: collision with root package name */
        public final String f3400a;
        public final int b;
        public final String c;
        public final Set d;

        public StartTag(String str, int i, String str2, Set set) {
            this.b = i;
            this.f3400a = str;
            this.c = str2;
            this.d = set;
        }
    }

    public static final class StyleMatch implements Comparable<StyleMatch> {
        public final int d;
        public final WebvttCssStyle e;

        public StyleMatch(int i, WebvttCssStyle webvttCssStyle) {
            this.d = i;
            this.e = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public final int compareTo(StyleMatch styleMatch) {
            return Integer.compare(this.d, styleMatch.d);
        }
    }

    public static final class WebvttCueInfoBuilder {
        public CharSequence c;

        /* renamed from: a, reason: collision with root package name */
        public long f3401a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.media3.common.text.Cue.Builder a() {
            /*
                Method dump skipped, instructions count: 178
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder.a():androidx.media3.common.text.Cue$Builder");
        }
    }

    static {
        HashMap map = new HashMap();
        androidx.compose.ui.input.pointer.a.s(255, 255, 255, map, "white");
        androidx.compose.ui.input.pointer.a.s(0, 255, 0, map, "lime");
        androidx.compose.ui.input.pointer.a.s(0, 255, 255, map, "cyan");
        androidx.compose.ui.input.pointer.a.s(255, 0, 0, map, "red");
        androidx.compose.ui.input.pointer.a.s(255, 255, 0, map, "yellow");
        androidx.compose.ui.input.pointer.a.s(255, 0, 255, map, "magenta");
        androidx.compose.ui.input.pointer.a.s(0, 0, 255, map, "blue");
        androidx.compose.ui.input.pointer.a.s(0, 0, 0, map, "black");
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        androidx.compose.ui.input.pointer.a.s(255, 255, 255, map2, "bg_white");
        androidx.compose.ui.input.pointer.a.s(0, 255, 0, map2, "bg_lime");
        androidx.compose.ui.input.pointer.a.s(0, 255, 255, map2, "bg_cyan");
        androidx.compose.ui.input.pointer.a.s(255, 0, 0, map2, "bg_red");
        androidx.compose.ui.input.pointer.a.s(255, 255, 0, map2, "bg_yellow");
        androidx.compose.ui.input.pointer.a.s(255, 0, 255, map2, "bg_magenta");
        androidx.compose.ui.input.pointer.a.s(0, 0, 255, map2, "bg_blue");
        androidx.compose.ui.input.pointer.a.s(0, 0, 0, map2, "bg_black");
        d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r19, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag r20, java.util.List r21, android.text.SpannableStringBuilder r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.webvtt.WebvttCueParser.a(java.lang.String, androidx.media3.extractor.text.webvtt.WebvttCueParser$StartTag, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, StartTag startTag) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WebvttCssStyle webvttCssStyle = (WebvttCssStyle) list.get(i);
            String str2 = startTag.f3400a;
            Set set = startTag.d;
            String str3 = startTag.c;
            if (webvttCssStyle.f3396a.isEmpty() && webvttCssStyle.b.isEmpty() && webvttCssStyle.c.isEmpty() && webvttCssStyle.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = WebvttCssStyle.a(WebvttCssStyle.a(WebvttCssStyle.a(0, 1073741824, webvttCssStyle.f3396a, str), 2, webvttCssStyle.b, str2), 4, webvttCssStyle.d, str3);
                size = (iA == -1 || !set.containsAll(webvttCssStyle.c)) ? 0 : iA + (webvttCssStyle.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new StyleMatch(size, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, StartTag startTag) {
        ArrayList arrayListB = b(list, str, startTag);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((StyleMatch) arrayListB.get(i)).e.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static WebvttCueInfo d(String str, Matcher matcher, ParsableByteArray parsableByteArray, ArrayList arrayList) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            webvttCueInfoBuilder.f3401a = WebvttParserUtil.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            webvttCueInfoBuilder.b = WebvttParserUtil.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, webvttCueInfoBuilder);
            StringBuilder sb = new StringBuilder();
            parsableByteArray.getClass();
            String strH = parsableByteArray.h(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strH.trim());
                strH = parsableByteArray.h(StandardCharsets.UTF_8);
            }
            webvttCueInfoBuilder.c = f(str, sb.toString(), arrayList);
            return new WebvttCueInfo(webvttCueInfoBuilder.a().a(), webvttCueInfoBuilder.f3401a, webvttCueInfoBuilder.b);
        } catch (IllegalArgumentException unused) {
            Log.g("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r18, androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.webvtt.WebvttCueParser.e(java.lang.String, androidx.media3.extractor.text.webvtt.WebvttCueParser$WebvttCueInfoBuilder):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.webvtt.WebvttCueParser.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        String strSubstring;
        int i;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    Log.g("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            webvttCueInfoBuilder.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            webvttCueInfoBuilder.e = WebvttParserUtil.a(str);
            webvttCueInfoBuilder.f = 0;
        } else {
            webvttCueInfoBuilder.e = Integer.parseInt(str);
            webvttCueInfoBuilder.f = 1;
        }
    }
}
