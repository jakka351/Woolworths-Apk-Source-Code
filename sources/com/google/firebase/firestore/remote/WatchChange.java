package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import io.grpc.Status;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class WatchChange {

    public static final class DocumentChange extends WatchChange {

        /* renamed from: a, reason: collision with root package name */
        public final List f15587a;
        public final List b;
        public final DocumentKey c;
        public final MutableDocument d;

        public DocumentChange(List list, Internal.IntList intList, DocumentKey documentKey, MutableDocument mutableDocument) {
            this.f15587a = list;
            this.b = intList;
            this.c = documentKey;
            this.d = mutableDocument;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && DocumentChange.class == obj.getClass()) {
                DocumentChange documentChange = (DocumentChange) obj;
                MutableDocument mutableDocument = documentChange.d;
                if (!this.f15587a.equals(documentChange.f15587a) || !this.b.equals(documentChange.b) || !this.c.equals(documentChange.c)) {
                    return false;
                }
                MutableDocument mutableDocument2 = this.d;
                if (mutableDocument2 != null) {
                    return mutableDocument2.equals(mutableDocument);
                }
                if (mutableDocument == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = (this.c.d.hashCode() + ((this.b.hashCode() + (this.f15587a.hashCode() * 31)) * 31)) * 31;
            MutableDocument mutableDocument = this.d;
            return iHashCode + (mutableDocument != null ? mutableDocument.hashCode() : 0);
        }

        public final String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f15587a + ", removedTargetIds=" + this.b + ", key=" + this.c + ", newDocument=" + this.d + '}';
        }
    }

    public static final class ExistenceFilterWatchChange extends WatchChange {

        /* renamed from: a, reason: collision with root package name */
        public final int f15588a;
        public final ExistenceFilter b;

        public ExistenceFilterWatchChange(int i, ExistenceFilter existenceFilter) {
            this.f15588a = i;
            this.b = existenceFilter;
        }

        public final String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f15588a + ", existenceFilter=" + this.b + '}';
        }
    }

    public static final class WatchTargetChange extends WatchChange {

        /* renamed from: a, reason: collision with root package name */
        public final WatchTargetChangeType f15589a;
        public final List b;
        public final ByteString c;
        public final Status d;

        public WatchTargetChange(WatchTargetChangeType watchTargetChangeType, Internal.IntList intList, ByteString byteString, Status status) {
            Assert.b(status == null || watchTargetChangeType == WatchTargetChangeType.f, "Got cause for a target change that was not a removal", new Object[0]);
            this.f15589a = watchTargetChangeType;
            this.b = intList;
            this.c = byteString;
            if (status == null || status.f()) {
                this.d = null;
            } else {
                this.d = status;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && WatchTargetChange.class == obj.getClass()) {
                WatchTargetChange watchTargetChange = (WatchTargetChange) obj;
                Status status = watchTargetChange.d;
                if (this.f15589a != watchTargetChange.f15589a || !this.b.equals(watchTargetChange.b) || !this.c.equals(watchTargetChange.c)) {
                    return false;
                }
                Status status2 = this.d;
                if (status2 != null) {
                    return status != null && status2.f23971a.equals(status.f23971a);
                }
                if (status == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f15589a.hashCode() * 31)) * 31)) * 31;
            Status status = this.d;
            return iHashCode + (status != null ? status.f23971a.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WatchTargetChange{changeType=");
            sb.append(this.f15589a);
            sb.append(", targetIds=");
            return androidx.compose.ui.input.pointer.a.o(sb, this.b, '}');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WatchTargetChangeType {
        public static final WatchTargetChangeType d;
        public static final WatchTargetChangeType e;
        public static final WatchTargetChangeType f;
        public static final WatchTargetChangeType g;
        public static final WatchTargetChangeType h;
        public static final /* synthetic */ WatchTargetChangeType[] i;

        static {
            WatchTargetChangeType watchTargetChangeType = new WatchTargetChangeType("NoChange", 0);
            d = watchTargetChangeType;
            WatchTargetChangeType watchTargetChangeType2 = new WatchTargetChangeType("Added", 1);
            e = watchTargetChangeType2;
            WatchTargetChangeType watchTargetChangeType3 = new WatchTargetChangeType("Removed", 2);
            f = watchTargetChangeType3;
            WatchTargetChangeType watchTargetChangeType4 = new WatchTargetChangeType("Current", 3);
            g = watchTargetChangeType4;
            WatchTargetChangeType watchTargetChangeType5 = new WatchTargetChangeType("Reset", 4);
            h = watchTargetChangeType5;
            i = new WatchTargetChangeType[]{watchTargetChangeType, watchTargetChangeType2, watchTargetChangeType3, watchTargetChangeType4, watchTargetChangeType5};
        }

        public static WatchTargetChangeType valueOf(String str) {
            return (WatchTargetChangeType) Enum.valueOf(WatchTargetChangeType.class, str);
        }

        public static WatchTargetChangeType[] values() {
            return (WatchTargetChangeType[]) i.clone();
        }
    }
}
