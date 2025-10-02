package androidx.media3.ui;

import android.text.Html;
import androidx.media3.ui.SpannedToHtmlConverter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class SpannedToHtmlConverter {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f3460a = Pattern.compile("(&#13;)?&#10;");

    public static class HtmlAndCss {

        /* renamed from: a, reason: collision with root package name */
        public final String f3461a;
        public final Object b;

        public HtmlAndCss(String str, Map map) {
            this.f3461a = str;
            this.b = map;
        }
    }

    public static final class SpanInfo {
        public static final m e;
        public static final m f;

        /* renamed from: a, reason: collision with root package name */
        public final int f3462a;
        public final int b;
        public final String c;
        public final String d;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.ui.m] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.ui.m] */
        static {
            final int i = 0;
            e = new Comparator() { // from class: androidx.media3.ui.m
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    SpannedToHtmlConverter.SpanInfo spanInfo = (SpannedToHtmlConverter.SpanInfo) obj;
                    SpannedToHtmlConverter.SpanInfo spanInfo2 = (SpannedToHtmlConverter.SpanInfo) obj2;
                    switch (i) {
                        case 0:
                            int iCompare = Integer.compare(spanInfo2.b, spanInfo.b);
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            int iCompareTo = spanInfo.c.compareTo(spanInfo2.c);
                            return iCompareTo != 0 ? iCompareTo : spanInfo.d.compareTo(spanInfo2.d);
                        default:
                            int iCompare2 = Integer.compare(spanInfo2.f3462a, spanInfo.f3462a);
                            if (iCompare2 != 0) {
                                return iCompare2;
                            }
                            int iCompareTo2 = spanInfo2.c.compareTo(spanInfo.c);
                            return iCompareTo2 != 0 ? iCompareTo2 : spanInfo2.d.compareTo(spanInfo.d);
                    }
                }
            };
            final int i2 = 1;
            f = new Comparator() { // from class: androidx.media3.ui.m
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    SpannedToHtmlConverter.SpanInfo spanInfo = (SpannedToHtmlConverter.SpanInfo) obj;
                    SpannedToHtmlConverter.SpanInfo spanInfo2 = (SpannedToHtmlConverter.SpanInfo) obj2;
                    switch (i2) {
                        case 0:
                            int iCompare = Integer.compare(spanInfo2.b, spanInfo.b);
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            int iCompareTo = spanInfo.c.compareTo(spanInfo2.c);
                            return iCompareTo != 0 ? iCompareTo : spanInfo.d.compareTo(spanInfo2.d);
                        default:
                            int iCompare2 = Integer.compare(spanInfo2.f3462a, spanInfo.f3462a);
                            if (iCompare2 != 0) {
                                return iCompare2;
                            }
                            int iCompareTo2 = spanInfo2.c.compareTo(spanInfo.c);
                            return iCompareTo2 != 0 ? iCompareTo2 : spanInfo2.d.compareTo(spanInfo.d);
                    }
                }
            };
        }

        public SpanInfo(int i, int i2, String str, String str2) {
            this.f3462a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }
    }

    public static final class Transition {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3463a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return f3460a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
