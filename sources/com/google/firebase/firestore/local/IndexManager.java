package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.ResourcePath;
import java.util.List;

/* loaded from: classes6.dex */
public interface IndexManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IndexType {
        public static final IndexType d;
        public static final IndexType e;
        public static final IndexType f;
        public static final /* synthetic */ IndexType[] g;

        static {
            IndexType indexType = new IndexType("NONE", 0);
            d = indexType;
            IndexType indexType2 = new IndexType("PARTIAL", 1);
            e = indexType2;
            IndexType indexType3 = new IndexType("FULL", 2);
            f = indexType3;
            g = new IndexType[]{indexType, indexType2, indexType3};
        }

        public static IndexType valueOf(String str) {
            return (IndexType) Enum.valueOf(IndexType.class, str);
        }

        public static IndexType[] values() {
            return (IndexType[]) g.clone();
        }
    }

    void a(ImmutableSortedMap immutableSortedMap);

    FieldIndex.IndexOffset b(Target target);

    FieldIndex.IndexOffset c(String str);

    void d(ResourcePath resourcePath);

    void e(String str, FieldIndex.IndexOffset indexOffset);

    List f(String str);

    String g();

    IndexType h(Target target);

    List i(Target target);

    void start();
}
