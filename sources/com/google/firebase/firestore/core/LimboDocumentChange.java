package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.DocumentKey;

/* loaded from: classes6.dex */
public class LimboDocumentChange {

    /* renamed from: a, reason: collision with root package name */
    public final Type f15454a;
    public final DocumentKey b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final /* synthetic */ Type[] f;

        static {
            Type type = new Type("ADDED", 0);
            d = type;
            Type type2 = new Type("REMOVED", 1);
            e = type2;
            f = new Type[]{type, type2};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f.clone();
        }
    }

    public LimboDocumentChange(Type type, DocumentKey documentKey) {
        this.f15454a = type;
        this.b = documentKey;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LimboDocumentChange)) {
            return false;
        }
        LimboDocumentChange limboDocumentChange = (LimboDocumentChange) obj;
        return this.f15454a.equals(limboDocumentChange.f15454a) && this.b.equals(limboDocumentChange.b);
    }

    public final int hashCode() {
        return this.b.d.hashCode() + ((this.f15454a.hashCode() + 2077) * 31);
    }
}
