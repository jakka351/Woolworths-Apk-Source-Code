package androidx.compose.ui.text;

import androidx.camera.core.impl.b;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "Annotation", "Builder", "Companion", "ExhaustiveAnnotation", "Range", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnnotatedString implements CharSequence {
    public static final /* synthetic */ int h = 0;
    public final List d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", "Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/UrlAnnotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Annotation {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "BulletScope", "MutableRange", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class Builder implements Appendable {
        public final StringBuilder d;
        public final ArrayList e;
        public final ArrayList f;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BulletScope {
        }

        public /* synthetic */ Builder() {
            this(16);
        }

        public final void a(LinkAnnotation.Clickable clickable, int i, int i2) {
            this.f.add(new MutableRange(clickable, i, i2, null, 8));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                d((AnnotatedString) charSequence);
                return this;
            }
            this.d.append(charSequence);
            return this;
        }

        public final void b(LinkAnnotation.Url url, int i, int i2) {
            this.f.add(new MutableRange(url, i, i2, null, 8));
        }

        public final void c(SpanStyle spanStyle, int i, int i2) {
            this.f.add(new MutableRange(spanStyle, i, i2, null, 8));
        }

        public final void d(AnnotatedString annotatedString) {
            StringBuilder sb = this.d;
            int length = sb.length();
            sb.append(annotatedString.e);
            List list = annotatedString.d;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Range range = (Range) list.get(i);
                    this.f.add(new MutableRange(range.b + length, range.c + length, range.f2032a, range.d));
                }
            }
        }

        public final void e(String str) {
            this.d.append(str);
        }

        public final void f(Function1 function1) {
            ArrayList arrayList = this.f;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                List list = (List) function1.invoke(((MutableRange) arrayList.get(i)).a(Integer.MIN_VALUE));
                ArrayList arrayList3 = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Range range = (Range) list.get(i2);
                    arrayList3.add(new MutableRange(range.b, range.c, range.f2032a, range.d));
                }
                CollectionsKt.h(arrayList3, arrayList2);
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
        }

        public final void g(Function1 function1) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Range range = (Range) function1.invoke(((MutableRange) arrayList.get(i)).a(Integer.MIN_VALUE));
                arrayList.set(i, new MutableRange(range.b, range.c, range.f2032a, range.d));
            }
        }

        public final void h() {
            ArrayList arrayList = this.e;
            if (arrayList.isEmpty()) {
                InlineClassHelperKt.c("Nothing to pop.");
            }
            ((MutableRange) arrayList.remove(arrayList.size() - 1)).c = this.d.length();
        }

        public final void i(int i) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                InlineClassHelperKt.c(i + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i) {
                h();
            }
        }

        public final int j(LinkAnnotation.Url url) {
            MutableRange mutableRange = new MutableRange(url, this.d.length(), 0, null, 12);
            this.e.add(mutableRange);
            this.f.add(mutableRange);
            return r7.size() - 1;
        }

        public final int k(String str, String str2) {
            MutableRange mutableRange = new MutableRange(new StringAnnotation(str2), this.d.length(), 0, str, 4);
            this.e.add(mutableRange);
            this.f.add(mutableRange);
            return r7.size() - 1;
        }

        public final int l(SpanStyle spanStyle) {
            MutableRange mutableRange = new MutableRange(spanStyle, this.d.length(), 0, null, 12);
            this.e.add(mutableRange);
            this.f.add(mutableRange);
            return r7.size() - 1;
        }

        public final AnnotatedString m() {
            StringBuilder sb = this.d;
            String string = sb.toString();
            ArrayList arrayList = this.f;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((MutableRange) arrayList.get(i)).a(sb.length()));
            }
            return new AnnotatedString(string, arrayList2);
        }

        public Builder(int i) {
            this.d = new StringBuilder(i);
            this.e = new ArrayList();
            this.f = new ArrayList();
            new ArrayList();
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            boolean z = charSequence instanceof AnnotatedString;
            StringBuilder sb = this.d;
            if (z) {
                AnnotatedString annotatedString = (AnnotatedString) charSequence;
                int length = sb.length();
                sb.append((CharSequence) annotatedString.e, i, i2);
                List listA = AnnotatedStringKt.a(annotatedString, i, i2, null);
                if (listA != null) {
                    int size = listA.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Range range = (Range) listA.get(i3);
                        this.f.add(new MutableRange(range.b + length, range.c + length, range.f2032a, range.d));
                    }
                }
                return this;
            }
            sb.append(charSequence, i, i2);
            return this;
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class MutableRange<T> {

            /* renamed from: a, reason: collision with root package name */
            public final Object f2031a;
            public final int b;
            public int c;
            public final String d;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
            }

            public MutableRange(int i, int i2, Object obj, String str) {
                this.f2031a = obj;
                this.b = i;
                this.c = i2;
                this.d = str;
            }

            public final Range a(int i) {
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (!(i != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.c("Item.end should be set first");
                }
                return new Range(this.b, i, this.f2031a, this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return Intrinsics.c(this.f2031a, mutableRange.f2031a) && this.b == mutableRange.b && this.c == mutableRange.c && Intrinsics.c(this.d, mutableRange.d);
            }

            public final int hashCode() {
                Object obj = this.f2031a;
                return this.d.hashCode() + b.a(this.c, b.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.f2031a);
                sb.append(", start=");
                sb.append(this.b);
                sb.append(", end=");
                sb.append(this.c);
                sb.append(", tag=");
                return b.r(sb, this.d, ')');
            }

            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3) {
                this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, obj, (i3 & 8) != 0 ? "" : str);
            }
        }

        public Builder(AnnotatedString annotatedString) {
            this();
            d(annotatedString);
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            this.d.append(c);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ExhaustiveAnnotation implements Annotation {
    }

    static {
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f2055a;
    }

    public AnnotatedString(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.d = list;
        this.e = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                Range range = (Range) list.get(i);
                Object obj = range.f2032a;
                if (obj instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(range);
                } else if (obj instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f = arrayList;
        this.g = arrayList2;
        List listU0 = arrayList2 != null ? CollectionsKt.u0(new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ComparisonsKt.a(Integer.valueOf(((AnnotatedString.Range) obj2).b), Integer.valueOf(((AnnotatedString.Range) obj3).b));
            }
        }, arrayList2) : null;
        List list2 = listU0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i2 = ((Range) CollectionsKt.D(listU0)).c;
        MutableIntList mutableIntList = IntListKt.f677a;
        MutableIntList mutableIntList2 = new MutableIntList(1);
        mutableIntList2.c(i2);
        int size2 = listU0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            Range range2 = (Range) listU0.get(i3);
            while (true) {
                if (mutableIntList2.b != 0) {
                    int iB = mutableIntList2.b();
                    int i4 = range2.b;
                    int i5 = range2.c;
                    if (i4 >= iB) {
                        mutableIntList2.e(mutableIntList2.b - 1);
                    } else if (i5 > iB) {
                        InlineClassHelperKt.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + iB);
                    }
                }
            }
            mutableIntList2.c(range2.c);
        }
    }

    public final List a(int i) {
        List list = this.d;
        if (list == null) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            Range range = (Range) obj;
            if ((range.f2032a instanceof LinkAnnotation) && AnnotatedStringKt.b(0, i, range.b, range.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List b(int i, int i2) {
        List list = this.d;
        if (list == null) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range range = (Range) list.get(i3);
            if ((range.f2032a instanceof StringAnnotation) && AnnotatedStringKt.b(i, i2, range.b, range.c)) {
                arrayList.add(StringAnnotationKt.a(range));
            }
        }
        return arrayList;
    }

    public final List c(int i, String str) {
        List list = this.d;
        if (list == null) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Range range = (Range) list.get(i2);
            if ((range.f2032a instanceof StringAnnotation) && Intrinsics.c(str, range.d) && AnnotatedStringKt.b(0, i, range.b, range.c)) {
                arrayList.add(StringAnnotationKt.a(range));
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    @Override // java.lang.CharSequence
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.text.AnnotatedString subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.compose.ui.text.internal.InlineClassHelperKt.a(r1)
        L26:
            java.lang.String r1 = r10.e
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r4)
            androidx.compose.ui.text.AnnotatedString r4 = androidx.compose.ui.text.AnnotatedStringKt.f2033a
            if (r11 > r12) goto L3f
            goto L59
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            androidx.compose.ui.text.internal.InlineClassHelperKt.a(r2)
        L59:
            java.util.List r2 = r10.d
            if (r2 != 0) goto L5e
            goto La1
        L5e:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
        L6e:
            if (r0 >= r4) goto L9b
            java.lang.Object r5 = r2.get(r0)
            androidx.compose.ui.text.AnnotatedString$Range r5 = (androidx.compose.ui.text.AnnotatedString.Range) r5
            int r6 = r5.b
            int r7 = r5.c
            boolean r6 = androidx.compose.ui.text.AnnotatedStringKt.b(r11, r12, r6, r7)
            if (r6 == 0) goto L98
            androidx.compose.ui.text.AnnotatedString$Range r6 = new androidx.compose.ui.text.AnnotatedString$Range
            java.lang.Object r8 = r5.f2032a
            int r9 = r5.b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.d
            r6.<init>(r9, r7, r8, r5)
            r3.add(r6)
        L98:
            int r0 = r0 + 1
            goto L6e
        L9b:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto La2
        La1:
            r3 = 0
        La2:
            androidx.compose.ui.text.AnnotatedString r11 = new androidx.compose.ui.text.AnnotatedString
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.subSequence(int, int):androidx.compose.ui.text.AnnotatedString");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return Intrinsics.c(this.e, annotatedString.e) && Intrinsics.c(this.d, annotatedString.d);
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.e;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final /* data */ class Range<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2032a;
        public final int b;
        public final int c;
        public final String d;

        public Range(int i, int i2, Object obj, String str) {
            this.f2032a = obj;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i <= i2) {
                return;
            }
            InlineClassHelperKt.a("Reversed range is not supported");
        }

        public static Range a(Range range, ParagraphStyle paragraphStyle, int i, int i2, int i3) {
            Object obj = paragraphStyle;
            if ((i3 & 1) != 0) {
                obj = range.f2032a;
            }
            if ((i3 & 2) != 0) {
                i = range.b;
            }
            if ((i3 & 4) != 0) {
                i2 = range.c;
            }
            return new Range(i, i2, obj, range.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return Intrinsics.c(this.f2032a, range.f2032a) && this.b == range.b && this.c == range.c && Intrinsics.c(this.d, range.d);
        }

        public final int hashCode() {
            Object obj = this.f2032a;
            return this.d.hashCode() + b.a(this.c, b.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.f2032a);
            sb.append(", start=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", tag=");
            return b.r(sb, this.d, ')');
        }

        public Range(int i, int i2, Object obj) {
            this(i, i2, obj, "");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(int i, String str, ArrayList arrayList) {
        List list = (i & 2) != 0 ? EmptyList.d : arrayList;
        AnnotatedString annotatedString = AnnotatedStringKt.f2033a;
        this(list.isEmpty() ? null : list, str);
    }

    public /* synthetic */ AnnotatedString(String str) {
        this(str, EmptyList.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(String str, List list) {
        List list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
