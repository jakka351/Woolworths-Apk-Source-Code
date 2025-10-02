package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaversKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SaverKt$Saver$1 f2055a;
    public static final SaverKt$Saver$1 b;
    public static final SaverKt$Saver$1 c;
    public static final SaverKt$Saver$1 d;
    public static final SaverKt$Saver$1 e;
    public static final SaverKt$Saver$1 f;
    public static final SaverKt$Saver$1 g;
    public static final SaverKt$Saver$1 h;
    public static final SaverKt$Saver$1 i;
    public static final SaverKt$Saver$1 j;
    public static final SaverKt$Saver$1 k;
    public static final SaverKt$Saver$1 l;
    public static final SaverKt$Saver$1 m;
    public static final SaverKt$Saver$1 n;
    public static final SaverKt$Saver$1 o;
    public static final SaverKt$Saver$1 p;
    public static final SaverKt$Saver$1 q;
    public static final SaversKt$NonNullValueClassSaver$1 r;
    public static final SaversKt$NonNullValueClassSaver$1 s;
    public static final SaversKt$NonNullValueClassSaver$1 t;
    public static final SaverKt$Saver$1 u;
    public static final SaverKt$Saver$1 v;
    public static final SaverKt$Saver$1 w;

    static {
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        f2055a = new SaverKt$Saver$1(SaversKt$AnnotatedStringSaver$2.h, SaversKt$AnnotatedStringSaver$1.h);
        b = new SaverKt$Saver$1(SaversKt$AnnotationRangeListSaver$2.h, SaversKt$AnnotationRangeListSaver$1.h);
        c = new SaverKt$Saver$1(SaversKt$AnnotationRangeSaver$2.h, SaversKt$AnnotationRangeSaver$1.h);
        d = new SaverKt$Saver$1(SaversKt$VerbatimTtsAnnotationSaver$2.h, SaversKt$VerbatimTtsAnnotationSaver$1.h);
        e = new SaverKt$Saver$1(SaversKt$UrlAnnotationSaver$2.h, SaversKt$UrlAnnotationSaver$1.h);
        f = new SaverKt$Saver$1(SaversKt$LinkSaver$2.h, SaversKt$LinkSaver$1.h);
        g = new SaverKt$Saver$1(SaversKt$ClickableSaver$2.h, SaversKt$ClickableSaver$1.h);
        h = new SaverKt$Saver$1(SaversKt$ParagraphStyleSaver$2.h, SaversKt$ParagraphStyleSaver$1.h);
        i = new SaverKt$Saver$1(SaversKt$SpanStyleSaver$2.h, SaversKt$SpanStyleSaver$1.h);
        j = new SaverKt$Saver$1(SaversKt$TextLinkStylesSaver$2.h, SaversKt$TextLinkStylesSaver$1.h);
        k = new SaverKt$Saver$1(SaversKt$TextDecorationSaver$2.h, SaversKt$TextDecorationSaver$1.h);
        l = new SaverKt$Saver$1(SaversKt$TextGeometricTransformSaver$2.h, SaversKt$TextGeometricTransformSaver$1.h);
        m = new SaverKt$Saver$1(SaversKt$TextIndentSaver$2.h, SaversKt$TextIndentSaver$1.h);
        n = new SaverKt$Saver$1(SaversKt$FontWeightSaver$2.h, SaversKt$FontWeightSaver$1.h);
        o = new SaverKt$Saver$1(SaversKt$BaselineShiftSaver$2.h, SaversKt$BaselineShiftSaver$1.h);
        p = new SaverKt$Saver$1(SaversKt$TextRangeSaver$2.h, SaversKt$TextRangeSaver$1.h);
        q = new SaverKt$Saver$1(SaversKt$ShadowSaver$2.h, SaversKt$ShadowSaver$1.h);
        r = new SaversKt$NonNullValueClassSaver$1(SaversKt$ColorSaver$2.h, SaversKt$ColorSaver$1.h);
        s = new SaversKt$NonNullValueClassSaver$1(SaversKt$TextUnitSaver$2.h, SaversKt$TextUnitSaver$1.h);
        t = new SaversKt$NonNullValueClassSaver$1(SaversKt$OffsetSaver$2.h, SaversKt$OffsetSaver$1.h);
        u = new SaverKt$Saver$1(SaversKt$LocaleListSaver$2.h, SaversKt$LocaleListSaver$1.h);
        v = new SaverKt$Saver$1(SaversKt$LocaleSaver$2.h, SaversKt$LocaleSaver$1.h);
        w = new SaverKt$Saver$1(SaversKt$LineHeightStyleSaver$2.h, SaversKt$LineHeightStyleSaver$1.h);
    }

    public static final Object a(Object obj, Saver saver, SaverScope saverScope) {
        Object objA;
        return (obj == null || (objA = saver.a(saverScope, obj)) == null) ? Boolean.FALSE : objA;
    }
}
