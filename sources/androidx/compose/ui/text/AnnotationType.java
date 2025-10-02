package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotationType;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AnnotationType {
    public static final AnnotationType d;
    public static final AnnotationType e;
    public static final AnnotationType f;
    public static final AnnotationType g;
    public static final AnnotationType h;
    public static final AnnotationType i;
    public static final AnnotationType j;
    public static final /* synthetic */ AnnotationType[] k;
    public static final /* synthetic */ EnumEntries l;

    static {
        AnnotationType annotationType = new AnnotationType("Paragraph", 0);
        d = annotationType;
        AnnotationType annotationType2 = new AnnotationType("Span", 1);
        e = annotationType2;
        AnnotationType annotationType3 = new AnnotationType("VerbatimTts", 2);
        f = annotationType3;
        AnnotationType annotationType4 = new AnnotationType("Url", 3);
        g = annotationType4;
        AnnotationType annotationType5 = new AnnotationType("Link", 4);
        h = annotationType5;
        AnnotationType annotationType6 = new AnnotationType("Clickable", 5);
        i = annotationType6;
        AnnotationType annotationType7 = new AnnotationType("String", 6);
        j = annotationType7;
        AnnotationType[] annotationTypeArr = {annotationType, annotationType2, annotationType3, annotationType4, annotationType5, annotationType6, annotationType7};
        k = annotationTypeArr;
        l = EnumEntriesKt.a(annotationTypeArr);
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) k.clone();
    }
}
