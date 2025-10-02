package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.extractor.jpeg.MotionPhotoDescription;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
final class XmpMotionPhotoDescriptionParser {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f3280a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.extractor.jpeg.MotionPhotoDescription a(java.lang.String r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r19
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.c(r0, r1)
            r3 = 0
            if (r2 == 0) goto Lcf
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.t()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = androidx.media3.common.util.XmlPullParserUtil.c(r0, r8)
            if (r8 == 0) goto L9b
            r2 = 0
            r6 = r2
        L35:
            r7 = 4
            if (r6 >= r7) goto Lc8
            java.lang.String[] r8 = androidx.media3.extractor.jpeg.XmpMotionPhotoDescriptionParser.f3280a
            r8 = r8[r6]
            java.lang.String r8 = androidx.media3.common.util.XmlPullParserUtil.a(r0, r8)
            if (r8 == 0) goto L98
            int r6 = java.lang.Integer.parseInt(r8)
            r8 = 1
            if (r6 != r8) goto Lc8
            r6 = r2
        L4a:
            if (r6 >= r7) goto L60
            java.lang.String[] r8 = androidx.media3.extractor.jpeg.XmpMotionPhotoDescriptionParser.b
            r8 = r8[r6]
            java.lang.String r8 = androidx.media3.common.util.XmlPullParserUtil.a(r0, r8)
            if (r8 == 0) goto L62
            long r6 = java.lang.Long.parseLong(r8)
            r8 = -1
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L65
        L60:
            r6 = r4
            goto L65
        L62:
            int r6 = r6 + 1
            goto L4a
        L65:
            r8 = 2
            if (r2 >= r8) goto L93
            java.lang.String[] r8 = androidx.media3.extractor.jpeg.XmpMotionPhotoDescriptionParser.c
            r8 = r8[r2]
            java.lang.String r8 = androidx.media3.common.util.XmlPullParserUtil.a(r0, r8)
            if (r8 == 0) goto L90
            long r11 = java.lang.Long.parseLong(r8)
            androidx.media3.extractor.jpeg.MotionPhotoDescription$ContainerItem r13 = new androidx.media3.extractor.jpeg.MotionPhotoDescription$ContainerItem
            r15 = 0
            r17 = 0
            java.lang.String r14 = "image/jpeg"
            r13.<init>(r14, r15, r17)
            r2 = r13
            androidx.media3.extractor.jpeg.MotionPhotoDescription$ContainerItem r9 = new androidx.media3.extractor.jpeg.MotionPhotoDescription$ContainerItem
            java.lang.String r10 = "video/mp4"
            r13 = 0
            r9.<init>(r10, r11, r13)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.x(r2, r9)
            goto Lbc
        L90:
            int r2 = r2 + 1
            goto L65
        L93:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.t()
            goto Lbc
        L98:
            int r6 = r6 + 1
            goto L35
        L9b:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = androidx.media3.common.util.XmlPullParserUtil.c(r0, r8)
            if (r8 == 0) goto Lac
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            com.google.common.collect.ImmutableList r2 = b(r0, r2, r8)
            goto Lbc
        Lac:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = androidx.media3.common.util.XmlPullParserUtil.c(r0, r8)
            if (r8 == 0) goto Lbc
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            com.google.common.collect.ImmutableList r2 = b(r0, r2, r8)
        Lbc:
            boolean r8 = androidx.media3.common.util.XmlPullParserUtil.b(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc9
        Lc8:
            return r3
        Lc9:
            androidx.media3.extractor.jpeg.MotionPhotoDescription r0 = new androidx.media3.extractor.jpeg.MotionPhotoDescription
            r0.<init>(r6, r2)
            return r0
        Lcf:
            java.lang.String r0 = "Couldn't find xmp metadata"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.jpeg.XmpMotionPhotoDescriptionParser.a(java.lang.String):androidx.media3.extractor.jpeg.MotionPhotoDescription");
    }

    public static ImmutableList b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.Builder builderM = ImmutableList.m();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = XmlPullParserUtil.a(xmlPullParser, strConcat3);
                String strA2 = XmlPullParserUtil.a(xmlPullParser, strConcat4);
                String strA3 = XmlPullParserUtil.a(xmlPullParser, strConcat5);
                String strA4 = XmlPullParserUtil.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return ImmutableList.t();
                }
                builderM.h(new MotionPhotoDescription.ContainerItem(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!XmlPullParserUtil.b(xmlPullParser, strConcat2));
        return builderM.j();
    }
}
