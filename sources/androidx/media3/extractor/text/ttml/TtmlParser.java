package androidx.media3.extractor.text.ttml;

import YU.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

@UnstableApi
/* loaded from: classes2.dex */
public final class TtmlParser implements SubtitleParser {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final FrameAndTickRate i = new FrameAndTickRate(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f3385a;

    public static final class FrameAndTickRate {

        /* renamed from: a, reason: collision with root package name */
        public final float f3386a;
        public final int b;
        public final int c;

        public FrameAndTickRate(float f, int i, int i2) {
            this.f3386a = f;
            this.b = i;
            this.c = i2;
        }
    }

    public static final class TtsExtent {

        /* renamed from: a, reason: collision with root package name */
        public final int f3387a;
        public final int b;

        public TtsExtent(int i, int i2) {
            this.f3387a = i;
            this.b = i2;
        }
    }

    public TtmlParser() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f3385a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static TtmlStyle c(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    public static boolean d(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int e(XmlPullParser xmlPullParser) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.g("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i3 = Integer.parseInt(strGroup2);
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            Assertions.a("Invalid cell resolution " + i2 + " " + i3, z);
            return i3;
        } catch (NumberFormatException unused) {
            Log.g("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void f(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        int i2 = Util.f2928a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(a.m(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            Log.g("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(a.h("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                ttmlStyle.j = 3;
                break;
            case "em":
                ttmlStyle.j = 2;
                break;
            case "px":
                ttmlStyle.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(a.h("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        ttmlStyle.k = Float.parseFloat(strGroup2);
    }

    public static FrameAndTickRate g(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i3 = Util.f2928a;
            Assertions.a("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = i;
        int i4 = frameAndTickRate.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i4 = Integer.parseInt(attributeValue3);
        }
        int i5 = frameAndTickRate.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i5 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(i2 * f2, i4, i5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, androidx.media3.extractor.text.ttml.TtmlParser.TtsExtent r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, androidx.media3.extractor.text.ttml.TtmlParser$TtsExtent, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.extractor.text.ttml.TtmlNode i(org.xmlpull.v1.XmlPullParser r21, androidx.media3.extractor.text.ttml.TtmlNode r22, java.util.HashMap r23, androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate r24) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.i(org.xmlpull.v1.XmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode, java.util.HashMap, androidx.media3.extractor.text.ttml.TtmlParser$FrameAndTickRate):androidx.media3.extractor.text.ttml.TtmlNode");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.extractor.text.ttml.TtmlStyle j(org.xmlpull.v1.XmlPullParser r18, androidx.media3.extractor.text.ttml.TtmlStyle r19) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.j(org.xmlpull.v1.XmlPullParser, androidx.media3.extractor.text.ttml.TtmlStyle):androidx.media3.extractor.text.ttml.TtmlStyle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long k(java.lang.String r13, androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate r14) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.k(java.lang.String, androidx.media3.extractor.text.ttml.TtmlParser$FrameAndTickRate):long");
    }

    public static TtsExtent l(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strA = XmlPullParserUtil.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = g.matcher(strA);
        if (!matcher.matches()) {
            Log.g("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strA));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new TtsExtent(i2, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            Log.g("TtmlParser", "Ignoring malformed tts extent: ".concat(strA));
            return null;
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        LegacySubtitleUtil.b(b(i2, i3, bArr), outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final Subtitle b(int i2, int i3, byte[] bArr) throws XmlPullParserException, NumberFormatException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f3385a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new TtmlRegion("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            TtsExtent ttsExtentL = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRateG = i;
            int i4 = 0;
            int iE = 15;
            TtmlSubtitle ttmlSubtitle = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i4 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            frameAndTickRateG = g(xmlPullParserNewPullParser);
                            iE = e(xmlPullParserNewPullParser);
                            ttsExtentL = l(xmlPullParserNewPullParser);
                        }
                        FrameAndTickRate frameAndTickRate = frameAndTickRateG;
                        TtsExtent ttsExtent = ttsExtentL;
                        int i5 = iE;
                        if (d(name)) {
                            if ("head".equals(name)) {
                                h(xmlPullParserNewPullParser, map, i5, ttsExtent, map2, map3);
                            } else {
                                try {
                                    TtmlNode ttmlNodeI = i(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRate);
                                    arrayDeque.push(ttmlNodeI);
                                    if (ttmlNode != null) {
                                        if (ttmlNode.m == null) {
                                            ttmlNode.m = new ArrayList();
                                        }
                                        ttmlNode.m.add(ttmlNodeI);
                                    }
                                } catch (SubtitleDecoderException e2) {
                                    Log.h("TtmlParser", "Suppressing parser error", e2);
                                }
                            }
                            iE = i5;
                            ttsExtentL = ttsExtent;
                            frameAndTickRateG = frameAndTickRate;
                        } else {
                            Log.f("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i4++;
                        iE = i5;
                        ttsExtentL = ttsExtent;
                        frameAndTickRateG = frameAndTickRate;
                    } else if (eventType == 4) {
                        ttmlNode.getClass();
                        TtmlNode ttmlNodeA = TtmlNode.a(xmlPullParserNewPullParser.getText());
                        if (ttmlNode.m == null) {
                            ttmlNode.m = new ArrayList();
                        }
                        ttmlNode.m.add(ttmlNodeA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            TtmlNode ttmlNode2 = (TtmlNode) arrayDeque.peek();
                            ttmlNode2.getClass();
                            ttmlSubtitle = new TtmlSubtitle(ttmlNode2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i4++;
                } else if (eventType == 3) {
                    i4--;
                }
                xmlPullParserNewPullParser.next();
            }
            ttmlSubtitle.getClass();
            return ttmlSubtitle;
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new IllegalStateException("Unable to decode source", e4);
        }
    }
}
