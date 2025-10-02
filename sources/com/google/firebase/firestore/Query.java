package com.google.firebase.firestore;

import com.google.firebase.firestore.core.FieldFilter;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class Query {

    /* renamed from: com.google.firebase.firestore.Query$1, reason: invalid class name */
    class AnonymousClass1 extends ArrayList<AggregateField> {
    }

    /* renamed from: com.google.firebase.firestore.Query$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15428a;

        static {
            int[] iArr = new int[FieldFilter.Operator.values().length];
            f15428a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15428a[7] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15428a[8] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15428a[9] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        public static final /* synthetic */ Direction[] d = {new Direction("ASCENDING", 0), new Direction("DESCENDING", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Direction EF5;

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) d.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Query) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }
}
