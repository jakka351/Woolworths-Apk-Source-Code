package com.google.firebase.firestore;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.CustomClassMapper;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class DocumentSnapshot {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseFirestore f15425a;
    public final DocumentKey b;
    public final Document c;
    public final SnapshotMetadata d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ServerTimestampBehavior {
        public static final /* synthetic */ ServerTimestampBehavior[] d = {new ServerTimestampBehavior("NONE", 0), new ServerTimestampBehavior("ESTIMATE", 1), new ServerTimestampBehavior("PREVIOUS", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ServerTimestampBehavior EF5;

        public static ServerTimestampBehavior valueOf(String str) {
            return (ServerTimestampBehavior) Enum.valueOf(ServerTimestampBehavior.class, str);
        }

        public static ServerTimestampBehavior[] values() {
            return (ServerTimestampBehavior[]) d.clone();
        }
    }

    public DocumentSnapshot(FirebaseFirestore firebaseFirestore, DocumentKey documentKey, Document document, boolean z, boolean z2) {
        firebaseFirestore.getClass();
        this.f15425a = firebaseFirestore;
        documentKey.getClass();
        this.b = documentKey;
        this.c = document;
        this.d = new SnapshotMetadata(z2, z);
    }

    public HashMap a() {
        UserDataWriter userDataWriter = new UserDataWriter(this.f15425a);
        Document document = this.c;
        if (document == null) {
            return null;
        }
        return userDataWriter.a(document.getData().b().d0().O());
    }

    public Object b() {
        return c();
    }

    public Object c() {
        HashMap mapA = a();
        if (mapA == null) {
            return null;
        }
        return CustomClassMapper.b(mapA, new DocumentReference(this.b, this.f15425a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentSnapshot)) {
            return false;
        }
        DocumentSnapshot documentSnapshot = (DocumentSnapshot) obj;
        Document document = documentSnapshot.c;
        if (!this.f15425a.equals(documentSnapshot.f15425a) || !this.b.equals(documentSnapshot.b) || !this.d.equals(documentSnapshot.d)) {
            return false;
        }
        Document document2 = this.c;
        return document2 == null ? document == null : document != null && document2.getData().equals(document.getData());
    }

    public final int hashCode() {
        int iHashCode = (this.b.d.hashCode() + (this.f15425a.hashCode() * 31)) * 31;
        Document document = this.c;
        return this.d.hashCode() + ((((iHashCode + (document != null ? document.getKey().d.hashCode() : 0)) * 31) + (document != null ? document.getData().hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DocumentSnapshot{key=" + this.b + ", metadata=" + this.d + ", doc=" + this.c + '}';
    }
}
