package kotlin.annotation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnnotationRetention {
    public static final AnnotationRetention d;
    public static final /* synthetic */ AnnotationRetention[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        AnnotationRetention annotationRetention = new AnnotationRetention("SOURCE", 0);
        AnnotationRetention annotationRetention2 = new AnnotationRetention("BINARY", 1);
        AnnotationRetention annotationRetention3 = new AnnotationRetention("RUNTIME", 2);
        d = annotationRetention3;
        AnnotationRetention[] annotationRetentionArr = {annotationRetention, annotationRetention2, annotationRetention3};
        e = annotationRetentionArr;
        f = EnumEntriesKt.a(annotationRetentionArr);
    }

    public static AnnotationRetention valueOf(String str) {
        return (AnnotationRetention) Enum.valueOf(AnnotationRetention.class, str);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[]) e.clone();
    }
}
