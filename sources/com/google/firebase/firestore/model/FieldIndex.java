package com.google.firebase.firestore.model;

import androidx.browser.trusted.a;
import com.google.auto.value.AutoValue;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.List;

@AutoValue
/* loaded from: classes6.dex */
public abstract class FieldIndex {

    /* renamed from: a, reason: collision with root package name */
    public static final IndexState f15534a = new AutoValue_FieldIndex_IndexState(0, IndexOffset.d);

    @AutoValue
    public static abstract class IndexOffset implements Comparable<IndexOffset> {
        public static final IndexOffset d = new AutoValue_FieldIndex_IndexOffset(SnapshotVersion.e, DocumentKey.b(), -1);
        public static final a e = new a(9);

        public static IndexOffset b(SnapshotVersion snapshotVersion, DocumentKey documentKey, int i) {
            return new AutoValue_FieldIndex_IndexOffset(snapshotVersion, documentKey, i);
        }

        public static IndexOffset c(SnapshotVersion snapshotVersion) {
            Timestamp timestamp = snapshotVersion.d;
            long j = timestamp.d;
            int i = timestamp.e + 1;
            return new AutoValue_FieldIndex_IndexOffset(new SnapshotVersion(((double) i) == 1.0E9d ? new Timestamp(j + 1, 0) : new Timestamp(j, i)), DocumentKey.b(), -1);
        }

        public static IndexOffset d(Document document) {
            return new AutoValue_FieldIndex_IndexOffset(document.c(), document.getKey(), -1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(IndexOffset indexOffset) {
            int iCompareTo = l().compareTo(indexOffset.l());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = e().compareTo(indexOffset.e());
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(f(), indexOffset.f());
        }

        public abstract DocumentKey e();

        public abstract int f();

        public abstract SnapshotVersion l();
    }

    @AutoValue
    public static abstract class IndexState {
        public static IndexState a(long j, IndexOffset indexOffset) {
            return new AutoValue_FieldIndex_IndexState(j, indexOffset);
        }

        public static IndexState b(long j, SnapshotVersion snapshotVersion, DocumentKey documentKey, int i) {
            IndexOffset indexOffset = IndexOffset.d;
            return new AutoValue_FieldIndex_IndexState(j, new AutoValue_FieldIndex_IndexOffset(snapshotVersion, documentKey, i));
        }

        public abstract IndexOffset c();

        public abstract long d();
    }

    @AutoValue
    public static abstract class Segment implements Comparable<Segment> {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Kind {
            public static final Kind d;
            public static final Kind e;
            public static final Kind f;
            public static final /* synthetic */ Kind[] g;

            static {
                Kind kind = new Kind("ASCENDING", 0);
                d = kind;
                Kind kind2 = new Kind("DESCENDING", 1);
                e = kind2;
                Kind kind3 = new Kind("CONTAINS", 2);
                f = kind3;
                g = new Kind[]{kind, kind2, kind3};
            }

            public static Kind valueOf(String str) {
                return (Kind) Enum.valueOf(Kind.class, str);
            }

            public static Kind[] values() {
                return (Kind[]) g.clone();
            }
        }

        public static Segment a(FieldPath fieldPath, Kind kind) {
            return new AutoValue_FieldIndex_Segment(fieldPath, kind);
        }

        public abstract FieldPath b();

        public abstract Kind c();

        @Override // java.lang.Comparable
        public final int compareTo(Segment segment) {
            Segment segment2 = segment;
            int iCompareTo = b().compareTo(segment2.b());
            return iCompareTo != 0 ? iCompareTo : c().compareTo(segment2.c());
        }
    }

    public static FieldIndex a(int i, String str, List list, IndexState indexState) {
        return new AutoValue_FieldIndex(i, str, list, indexState);
    }

    public final Segment b() {
        for (Segment segment : g()) {
            if (segment.c().equals(Segment.Kind.f)) {
                return segment;
            }
        }
        return null;
    }

    public abstract String c();

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (Segment segment : g()) {
            if (!segment.c().equals(Segment.Kind.f)) {
                arrayList.add(segment);
            }
        }
        return arrayList;
    }

    public abstract int e();

    public abstract IndexState f();

    public abstract List g();
}
