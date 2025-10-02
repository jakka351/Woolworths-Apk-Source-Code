package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements Function1<Object, AnnotatedString.Range<? extends Object>> {
    public static final SaversKt$AnnotationRangeSaver$2 h = new SaversKt$AnnotationRangeSaver$2(1);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnnotationType annotationType = AnnotationType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnnotationType annotationType2 = AnnotationType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnnotationType annotationType3 = AnnotationType.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnnotationType annotationType4 = AnnotationType.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnnotationType annotationType5 = AnnotationType.d;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnnotationType annotationType6 = AnnotationType.d;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        ParagraphStyle paragraphStyle = null;
        clickable = null;
        LinkAnnotation.Clickable clickable = null;
        url = null;
        LinkAnnotation.Url url = null;
        urlAnnotation = null;
        UrlAnnotation urlAnnotation = null;
        verbatimTtsAnnotation = null;
        VerbatimTtsAnnotation verbatimTtsAnnotation = null;
        spanStyle = null;
        SpanStyle spanStyle = null;
        paragraphStyle = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        Intrinsics.e(annotationType);
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.e(num);
        int iIntValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        Intrinsics.e(num2);
        int iIntValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        Intrinsics.e(str);
        switch (annotationType.ordinal()) {
            case 0:
                Object obj6 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.h;
                if ((!Intrinsics.c(obj6, Boolean.FALSE) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj6 != null) {
                    paragraphStyle = (ParagraphStyle) saverKt$Saver$1.b.invoke(obj6);
                }
                Intrinsics.e(paragraphStyle);
                return new AnnotatedString.Range(iIntValue, iIntValue2, paragraphStyle, str);
            case 1:
                Object obj7 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.i;
                if ((!Intrinsics.c(obj7, Boolean.FALSE) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj7 != null) {
                    spanStyle = (SpanStyle) saverKt$Saver$12.b.invoke(obj7);
                }
                Intrinsics.e(spanStyle);
                return new AnnotatedString.Range(iIntValue, iIntValue2, spanStyle, str);
            case 2:
                Object obj8 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$13 = SaversKt.d;
                if ((!Intrinsics.c(obj8, Boolean.FALSE) || (saverKt$Saver$13 instanceof NonNullValueClassSaver)) && obj8 != null) {
                    verbatimTtsAnnotation = (VerbatimTtsAnnotation) saverKt$Saver$13.b.invoke(obj8);
                }
                Intrinsics.e(verbatimTtsAnnotation);
                return new AnnotatedString.Range(iIntValue, iIntValue2, verbatimTtsAnnotation, str);
            case 3:
                Object obj9 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$14 = SaversKt.e;
                if ((!Intrinsics.c(obj9, Boolean.FALSE) || (saverKt$Saver$14 instanceof NonNullValueClassSaver)) && obj9 != null) {
                    urlAnnotation = (UrlAnnotation) saverKt$Saver$14.b.invoke(obj9);
                }
                Intrinsics.e(urlAnnotation);
                return new AnnotatedString.Range(iIntValue, iIntValue2, urlAnnotation, str);
            case 4:
                Object obj10 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$15 = SaversKt.f;
                if ((!Intrinsics.c(obj10, Boolean.FALSE) || (saverKt$Saver$15 instanceof NonNullValueClassSaver)) && obj10 != null) {
                    url = (LinkAnnotation.Url) saverKt$Saver$15.b.invoke(obj10);
                }
                Intrinsics.e(url);
                return new AnnotatedString.Range(iIntValue, iIntValue2, url, str);
            case 5:
                Object obj11 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$16 = SaversKt.g;
                if ((!Intrinsics.c(obj11, Boolean.FALSE) || (saverKt$Saver$16 instanceof NonNullValueClassSaver)) && obj11 != null) {
                    clickable = (LinkAnnotation.Clickable) saverKt$Saver$16.b.invoke(obj11);
                }
                Intrinsics.e(clickable);
                return new AnnotatedString.Range(iIntValue, iIntValue2, clickable, str);
            case 6:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                Intrinsics.e(str2);
                return new AnnotatedString.Range(iIntValue, iIntValue2, StringAnnotation.a(str2), str);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
