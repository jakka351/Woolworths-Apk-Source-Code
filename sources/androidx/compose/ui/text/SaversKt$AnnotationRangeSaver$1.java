package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/AnnotatedString$Range;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaversKt$AnnotationRangeSaver$1 extends Lambda implements Function2<SaverScope, AnnotatedString.Range<? extends Object>, Object> {
    public static final SaversKt$AnnotationRangeSaver$1 h = new SaversKt$AnnotationRangeSaver$1(2);

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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AnnotationType annotationType;
        Object objA;
        SaverScope saverScope = (SaverScope) obj;
        AnnotatedString.Range range = (AnnotatedString.Range) obj2;
        Object obj3 = range.f2032a;
        if (obj3 instanceof ParagraphStyle) {
            annotationType = AnnotationType.d;
        } else if (obj3 instanceof SpanStyle) {
            annotationType = AnnotationType.e;
        } else if (obj3 instanceof VerbatimTtsAnnotation) {
            annotationType = AnnotationType.f;
        } else if (obj3 instanceof UrlAnnotation) {
            annotationType = AnnotationType.g;
        } else if (obj3 instanceof LinkAnnotation.Url) {
            annotationType = AnnotationType.h;
        } else if (obj3 instanceof LinkAnnotation.Clickable) {
            annotationType = AnnotationType.i;
        } else {
            if (!(obj3 instanceof StringAnnotation)) {
                throw new UnsupportedOperationException();
            }
            annotationType = AnnotationType.j;
        }
        switch (annotationType.ordinal()) {
            case 0:
                Intrinsics.f(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                objA = SaversKt.a((ParagraphStyle) obj3, SaversKt.h, saverScope);
                break;
            case 1:
                Intrinsics.f(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                objA = SaversKt.a((SpanStyle) obj3, SaversKt.i, saverScope);
                break;
            case 2:
                Intrinsics.f(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                objA = SaversKt.a((VerbatimTtsAnnotation) obj3, SaversKt.d, saverScope);
                break;
            case 3:
                Intrinsics.f(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                objA = SaversKt.a((UrlAnnotation) obj3, SaversKt.e, saverScope);
                break;
            case 4:
                Intrinsics.f(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                objA = SaversKt.a((LinkAnnotation.Url) obj3, SaversKt.f, saverScope);
                break;
            case 5:
                Intrinsics.f(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                objA = SaversKt.a((LinkAnnotation.Clickable) obj3, SaversKt.g, saverScope);
                break;
            case 6:
                Intrinsics.f(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                objA = ((StringAnnotation) obj3).getF2060a();
                SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f2055a;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt.k(annotationType, objA, Integer.valueOf(range.b), Integer.valueOf(range.c), range.d);
    }
}
