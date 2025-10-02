package com.google.firebase.firestore;

import com.google.firebase.firestore.core.DocumentViewChange;

/* loaded from: classes6.dex */
public class DocumentChange {

    /* renamed from: com.google.firebase.firestore.DocumentChange$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15423a;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            f15423a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15423a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15423a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15423a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final /* synthetic */ Type[] d = {new Type("ADDED", 0), new Type("MODIFIED", 1), new Type("REMOVED", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) d.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DocumentChange) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }
}
