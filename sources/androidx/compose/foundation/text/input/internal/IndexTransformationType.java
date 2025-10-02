package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IndexTransformationType {
    public static final IndexTransformationType d;
    public static final IndexTransformationType e;
    public static final IndexTransformationType f;
    public static final IndexTransformationType g;
    public static final /* synthetic */ IndexTransformationType[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        IndexTransformationType indexTransformationType = new IndexTransformationType("Untransformed", 0);
        d = indexTransformationType;
        IndexTransformationType indexTransformationType2 = new IndexTransformationType("Insertion", 1);
        e = indexTransformationType2;
        IndexTransformationType indexTransformationType3 = new IndexTransformationType("Replacement", 2);
        f = indexTransformationType3;
        IndexTransformationType indexTransformationType4 = new IndexTransformationType("Deletion", 3);
        g = indexTransformationType4;
        IndexTransformationType[] indexTransformationTypeArr = {indexTransformationType, indexTransformationType2, indexTransformationType3, indexTransformationType4};
        h = indexTransformationTypeArr;
        i = EnumEntriesKt.a(indexTransformationTypeArr);
    }

    public static IndexTransformationType valueOf(String str) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, str);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) h.clone();
    }
}
