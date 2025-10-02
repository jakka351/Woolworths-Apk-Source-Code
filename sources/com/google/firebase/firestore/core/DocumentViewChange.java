package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;

/* loaded from: classes6.dex */
public class DocumentViewChange {

    /* renamed from: a, reason: collision with root package name */
    public final Type f15445a;
    public final Document b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final /* synthetic */ Type[] h;

        static {
            Type type = new Type("REMOVED", 0);
            d = type;
            Type type2 = new Type("ADDED", 1);
            e = type2;
            Type type3 = new Type("MODIFIED", 2);
            f = type3;
            Type type4 = new Type("METADATA", 3);
            g = type4;
            h = new Type[]{type, type2, type3, type4};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) h.clone();
        }
    }

    public DocumentViewChange(Type type, Document document) {
        this.f15445a = type;
        this.b = document;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DocumentViewChange)) {
            return false;
        }
        DocumentViewChange documentViewChange = (DocumentViewChange) obj;
        return this.f15445a.equals(documentViewChange.f15445a) && this.b.equals(documentViewChange.b);
    }

    public final int hashCode() {
        int iHashCode = (this.f15445a.hashCode() + 1891) * 31;
        Document document = this.b;
        return document.getData().hashCode() + ((document.getKey().d.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "DocumentViewChange(" + this.b + "," + this.f15445a + ")";
    }
}
