package com.google.firebase.firestore.model;

import com.google.firestore.v1.Value;

/* loaded from: classes6.dex */
public final class MutableDocument implements Document {

    /* renamed from: a, reason: collision with root package name */
    public final DocumentKey f15535a;
    public DocumentType b;
    public SnapshotVersion c;
    public SnapshotVersion d;
    public ObjectValue e;
    public DocumentState f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DocumentState {
        public static final DocumentState d;
        public static final DocumentState e;
        public static final DocumentState f;
        public static final /* synthetic */ DocumentState[] g;

        static {
            DocumentState documentState = new DocumentState("HAS_LOCAL_MUTATIONS", 0);
            d = documentState;
            DocumentState documentState2 = new DocumentState("HAS_COMMITTED_MUTATIONS", 1);
            e = documentState2;
            DocumentState documentState3 = new DocumentState("SYNCED", 2);
            f = documentState3;
            g = new DocumentState[]{documentState, documentState2, documentState3};
        }

        public static DocumentState valueOf(String str) {
            return (DocumentState) Enum.valueOf(DocumentState.class, str);
        }

        public static DocumentState[] values() {
            return (DocumentState[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DocumentType {
        public static final DocumentType d;
        public static final DocumentType e;
        public static final DocumentType f;
        public static final DocumentType g;
        public static final /* synthetic */ DocumentType[] h;

        static {
            DocumentType documentType = new DocumentType("INVALID", 0);
            d = documentType;
            DocumentType documentType2 = new DocumentType("FOUND_DOCUMENT", 1);
            e = documentType2;
            DocumentType documentType3 = new DocumentType("NO_DOCUMENT", 2);
            f = documentType3;
            DocumentType documentType4 = new DocumentType("UNKNOWN_DOCUMENT", 3);
            g = documentType4;
            h = new DocumentType[]{documentType, documentType2, documentType3, documentType4};
        }

        public static DocumentType valueOf(String str) {
            return (DocumentType) Enum.valueOf(DocumentType.class, str);
        }

        public static DocumentType[] values() {
            return (DocumentType[]) h.clone();
        }
    }

    public MutableDocument(DocumentKey documentKey) {
        this.f15535a = documentKey;
        this.d = SnapshotVersion.e;
    }

    public static MutableDocument n(DocumentKey documentKey) {
        SnapshotVersion snapshotVersion = SnapshotVersion.e;
        return new MutableDocument(documentKey, DocumentType.d, snapshotVersion, snapshotVersion, new ObjectValue(), DocumentState.f);
    }

    public static MutableDocument o(DocumentKey documentKey, SnapshotVersion snapshotVersion) {
        MutableDocument mutableDocument = new MutableDocument(documentKey);
        mutableDocument.h(snapshotVersion);
        return mutableDocument;
    }

    @Override // com.google.firebase.firestore.model.Document
    public final MutableDocument a() {
        return new MutableDocument(this.f15535a, this.b, this.c, this.d, new ObjectValue(this.e.b()), this.f);
    }

    @Override // com.google.firebase.firestore.model.Document
    public final boolean b() {
        return this.b.equals(DocumentType.e);
    }

    @Override // com.google.firebase.firestore.model.Document
    public final SnapshotVersion c() {
        return this.d;
    }

    @Override // com.google.firebase.firestore.model.Document
    public final Value d(FieldPath fieldPath) {
        return this.e.e(fieldPath);
    }

    @Override // com.google.firebase.firestore.model.Document
    public final boolean e() {
        return this.f.equals(DocumentState.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MutableDocument.class != obj.getClass()) {
            return false;
        }
        MutableDocument mutableDocument = (MutableDocument) obj;
        if (this.f15535a.equals(mutableDocument.f15535a) && this.c.equals(mutableDocument.c) && this.b.equals(mutableDocument.b) && this.f.equals(mutableDocument.f)) {
            return this.e.equals(mutableDocument.e);
        }
        return false;
    }

    @Override // com.google.firebase.firestore.model.Document
    public final boolean f() {
        return this.f.equals(DocumentState.d);
    }

    public final void g(SnapshotVersion snapshotVersion, ObjectValue objectValue) {
        this.c = snapshotVersion;
        this.b = DocumentType.e;
        this.e = objectValue;
        this.f = DocumentState.f;
    }

    @Override // com.google.firebase.firestore.model.Document
    public final ObjectValue getData() {
        return this.e;
    }

    @Override // com.google.firebase.firestore.model.Document
    public final DocumentKey getKey() {
        return this.f15535a;
    }

    public final void h(SnapshotVersion snapshotVersion) {
        this.c = snapshotVersion;
        this.b = DocumentType.f;
        this.e = new ObjectValue();
        this.f = DocumentState.f;
    }

    public final int hashCode() {
        return this.f15535a.d.hashCode();
    }

    public final void i(SnapshotVersion snapshotVersion) {
        this.c = snapshotVersion;
        this.b = DocumentType.g;
        this.e = new ObjectValue();
        this.f = DocumentState.e;
    }

    public final SnapshotVersion j() {
        return this.c;
    }

    public final boolean k() {
        return this.b.equals(DocumentType.f);
    }

    public final boolean l() {
        return this.b.equals(DocumentType.g);
    }

    public final boolean m() {
        return !this.b.equals(DocumentType.d);
    }

    public final void p() {
        this.f = DocumentState.e;
    }

    public final void q() {
        this.f = DocumentState.d;
        this.c = SnapshotVersion.e;
    }

    public final String toString() {
        return "Document{key=" + this.f15535a + ", version=" + this.c + ", readTime=" + this.d + ", type=" + this.b + ", documentState=" + this.f + ", value=" + this.e + '}';
    }

    public MutableDocument(DocumentKey documentKey, DocumentType documentType, SnapshotVersion snapshotVersion, SnapshotVersion snapshotVersion2, ObjectValue objectValue, DocumentState documentState) {
        this.f15535a = documentKey;
        this.c = snapshotVersion;
        this.d = snapshotVersion2;
        this.b = documentType;
        this.f = documentState;
        this.e = objectValue;
    }
}
