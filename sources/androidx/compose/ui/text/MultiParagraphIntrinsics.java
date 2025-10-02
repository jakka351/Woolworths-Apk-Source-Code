package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f2046a;
    public final List b;
    public final Object c;
    public final Object d;
    public final ArrayList e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List list, Density density, FontFamily.Resolver resolver) {
        int i;
        String strSubstring;
        String str;
        List list2;
        AnnotatedString annotatedString2 = annotatedString;
        TextStyle textStyle2 = textStyle;
        this.f2046a = annotatedString2;
        this.b = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        this.c = LazyKt.a(lazyThreadSafetyMode, new Function0<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                ArrayList arrayList = this.h.e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = arrayList.get(0);
                    float fB = ((ParagraphIntrinsicInfo) obj2).f2048a.b();
                    int I = CollectionsKt.I(arrayList);
                    int i2 = 1;
                    if (1 <= I) {
                        while (true) {
                            Object obj3 = arrayList.get(i2);
                            float fB2 = ((ParagraphIntrinsicInfo) obj3).f2048a.b();
                            if (Float.compare(fB, fB2) < 0) {
                                obj2 = obj3;
                                fB = fB2;
                            }
                            if (i2 == I) {
                                break;
                            }
                            i2++;
                        }
                    }
                    obj = obj2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
                return Float.valueOf(paragraphIntrinsicInfo != null ? paragraphIntrinsicInfo.f2048a.b() : BitmapDescriptorFactory.HUE_RED);
            }
        });
        this.d = LazyKt.a(lazyThreadSafetyMode, new Function0<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                ArrayList arrayList = this.h.e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = arrayList.get(0);
                    float fC = ((ParagraphIntrinsicInfo) obj2).f2048a.i.c();
                    int I = CollectionsKt.I(arrayList);
                    int i2 = 1;
                    if (1 <= I) {
                        while (true) {
                            Object obj3 = arrayList.get(i2);
                            float fC2 = ((ParagraphIntrinsicInfo) obj3).f2048a.i.c();
                            if (Float.compare(fC, fC2) < 0) {
                                obj2 = obj3;
                                fC = fC2;
                            }
                            if (i2 == I) {
                                break;
                            }
                            i2++;
                        }
                    }
                    obj = obj2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
                return Float.valueOf(paragraphIntrinsicInfo != null ? paragraphIntrinsicInfo.f2048a.i.c() : BitmapDescriptorFactory.HUE_RED);
            }
        });
        ParagraphStyle paragraphStyle = textStyle2.b;
        AnnotatedString annotatedString3 = AnnotatedStringKt.f2033a;
        ArrayList arrayList = annotatedString2.g;
        String str2 = annotatedString2.e;
        EmptyList emptyList = EmptyList.d;
        List listU0 = arrayList != null ? CollectionsKt.u0(new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.a(Integer.valueOf(((AnnotatedString.Range) obj).b), Integer.valueOf(((AnnotatedString.Range) obj2).b));
            }
        }, arrayList) : emptyList;
        ArrayList arrayList2 = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int size = listU0.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            AnnotatedString.Range range = (AnnotatedString.Range) listU0.get(i3);
            AnnotatedString.Range rangeA = AnnotatedString.Range.a(range, paragraphStyle.a((ParagraphStyle) range.f2032a), i2, i2, 14);
            Object obj = rangeA.f2032a;
            int i5 = rangeA.c;
            int i6 = rangeA.b;
            while (i4 < i6 && !arrayDeque.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) arrayDeque.last();
                List list3 = listU0;
                int i7 = range2.c;
                EmptyList emptyList2 = emptyList;
                Object obj2 = range2.f2032a;
                if (i6 < i7) {
                    arrayList2.add(new AnnotatedString.Range(i4, i6, obj2));
                    i4 = i6;
                    listU0 = list3;
                    emptyList = emptyList2;
                } else {
                    int i8 = size;
                    arrayList2.add(new AnnotatedString.Range(i4, i7, obj2));
                    i4 = range2.c;
                    while (!arrayDeque.isEmpty() && i4 == ((AnnotatedString.Range) arrayDeque.last()).c) {
                        arrayDeque.removeLast();
                    }
                    listU0 = list3;
                    emptyList = emptyList2;
                    size = i8;
                }
            }
            List list4 = listU0;
            EmptyList emptyList3 = emptyList;
            int i9 = size;
            if (i4 < i6) {
                arrayList2.add(new AnnotatedString.Range(i4, i6, paragraphStyle));
                i4 = i6;
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayDeque.k();
            if (range3 != null) {
                int i10 = range3.c;
                Object obj3 = range3.f2032a;
                int i11 = range3.b;
                if (i11 == i6 && i10 == i5) {
                    arrayDeque.removeLast();
                    arrayDeque.addLast(new AnnotatedString.Range(i6, i5, ((ParagraphStyle) obj3).a((ParagraphStyle) obj)));
                } else if (i11 == i10) {
                    arrayList2.add(new AnnotatedString.Range(i11, i10, obj3));
                    arrayDeque.removeLast();
                    arrayDeque.addLast(new AnnotatedString.Range(i6, i5, obj));
                } else {
                    if (i10 < i5) {
                        throw new IllegalArgumentException();
                    }
                    arrayDeque.addLast(new AnnotatedString.Range(i6, i5, ((ParagraphStyle) obj3).a((ParagraphStyle) obj)));
                }
            } else {
                arrayDeque.addLast(new AnnotatedString.Range(i6, i5, obj));
            }
            i3++;
            listU0 = list4;
            emptyList = emptyList3;
            size = i9;
            i2 = 0;
        }
        EmptyList emptyList4 = emptyList;
        while (i4 <= str2.length() && !arrayDeque.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) arrayDeque.last();
            Object obj4 = range4.f2032a;
            int i12 = range4.c;
            arrayList2.add(new AnnotatedString.Range(i4, i12, obj4));
            while (!arrayDeque.isEmpty() && i12 == ((AnnotatedString.Range) arrayDeque.last()).c) {
                arrayDeque.removeLast();
            }
            i4 = i12;
        }
        if (i4 < str2.length()) {
            arrayList2.add(new AnnotatedString.Range(i4, str2.length(), paragraphStyle));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new AnnotatedString.Range(0, 0, paragraphStyle));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i13 = i;
        while (i13 < size2) {
            AnnotatedString.Range range5 = (AnnotatedString.Range) arrayList2.get(i13);
            int i14 = range5.b;
            int i15 = range5.c;
            if (i14 != i15) {
                strSubstring = str2.substring(i14, i15);
                Intrinsics.g(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listA = AnnotatedStringKt.a(annotatedString2, i14, i15, AnnotatedStringKt$substringWithoutParagraphStyles$1.h);
            AnnotatedString annotatedString4 = new AnnotatedString(strSubstring, listA == null ? emptyList4 : listA);
            ParagraphStyle paragraphStyle2 = (ParagraphStyle) range5.f2032a;
            if (paragraphStyle2.b == Integer.MIN_VALUE) {
                str = str2;
                paragraphStyle2 = new ParagraphStyle(paragraphStyle2.f2049a, paragraphStyle.b, paragraphStyle2.c, paragraphStyle2.d, paragraphStyle2.e, paragraphStyle2.f, paragraphStyle2.g, paragraphStyle2.h, paragraphStyle2.i);
            } else {
                str = str2;
            }
            TextStyle textStyle3 = new TextStyle(textStyle2.f2068a, paragraphStyle.a(paragraphStyle2));
            ?? r6 = annotatedString4.d;
            EmptyList emptyList5 = r6 == 0 ? emptyList4 : r6;
            List list5 = this.b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i16 = 0;
            while (i16 < size3) {
                AnnotatedString.Range range6 = (AnnotatedString.Range) list5.get(i16);
                ParagraphStyle paragraphStyle3 = paragraphStyle;
                int i17 = range6.b;
                TextStyle textStyle4 = textStyle3;
                int i18 = range6.c;
                if (AnnotatedStringKt.b(i14, i15, i17, i18)) {
                    if (i14 > i17 || i18 > i15) {
                        InlineClassHelperKt.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list5;
                    arrayList4.add(new AnnotatedString.Range(i17 - i14, i18 - i14, range6.f2032a));
                } else {
                    list2 = list5;
                }
                i16++;
                list5 = list2;
                textStyle3 = textStyle4;
                paragraphStyle = paragraphStyle3;
            }
            arrayList3.add(new ParagraphIntrinsicInfo(new AndroidParagraphIntrinsics(strSubstring, textStyle3, emptyList5, arrayList4, resolver, density), i14, i15));
            i13++;
            annotatedString2 = annotatedString;
            textStyle2 = textStyle;
            str2 = str;
        }
        this.e = arrayList3;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final boolean a() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ParagraphIntrinsicInfo) arrayList.get(i)).f2048a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float b() {
        return ((Number) this.c.getD()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float c() {
        return ((Number) this.d.getD()).floatValue();
    }
}
