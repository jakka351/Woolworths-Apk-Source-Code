package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.proto.NoDocument;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.proto.UnknownDocument;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.admin.v1.Index;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.Write;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class LocalSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteSerializer f15485a;

    /* renamed from: com.google.firebase.firestore.local.LocalSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15486a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Target.TargetTypeCase.values().length];
            b = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[MaybeDocument.DocumentTypeCase.values().length];
            f15486a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15486a[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15486a[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public LocalSerializer(RemoteSerializer remoteSerializer) {
        this.f15485a = remoteSerializer;
    }

    public static ArrayList a(Index index) {
        ArrayList arrayList = new ArrayList();
        for (Index.IndexField indexField : index.L()) {
            arrayList.add(FieldIndex.Segment.a(FieldPath.p(indexField.L()), indexField.N().equals(Index.IndexField.ValueModeCase.e) ? FieldIndex.Segment.Kind.f : indexField.M().equals(Index.IndexField.Order.ASCENDING) ? FieldIndex.Segment.Kind.d : FieldIndex.Segment.Kind.e));
        }
        return arrayList;
    }

    public final MutableDocument b(MaybeDocument maybeDocument) {
        int iOrdinal = maybeDocument.Q().ordinal();
        RemoteSerializer remoteSerializer = this.f15485a;
        if (iOrdinal == 0) {
            NoDocument noDocumentS = maybeDocument.S();
            boolean zR = maybeDocument.R();
            MutableDocument mutableDocumentO = MutableDocument.o(remoteSerializer.b(noDocumentS.O()), RemoteSerializer.e(noDocumentS.P()));
            if (zR) {
                mutableDocumentO.p();
            }
            return mutableDocumentO;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                Assert.a("Unknown MaybeDocument %s", maybeDocument);
                throw null;
            }
            UnknownDocument unknownDocumentT = maybeDocument.T();
            DocumentKey documentKeyB = remoteSerializer.b(unknownDocumentT.O());
            SnapshotVersion snapshotVersionE = RemoteSerializer.e(unknownDocumentT.P());
            MutableDocument mutableDocument = new MutableDocument(documentKeyB);
            mutableDocument.i(snapshotVersionE);
            return mutableDocument;
        }
        Document documentP = maybeDocument.P();
        boolean zR2 = maybeDocument.R();
        DocumentKey documentKeyB2 = remoteSerializer.b(documentP.Q());
        SnapshotVersion snapshotVersionE2 = RemoteSerializer.e(documentP.R());
        ObjectValue objectValueD = ObjectValue.d(documentP.P());
        MutableDocument mutableDocument2 = new MutableDocument(documentKeyB2);
        mutableDocument2.g(snapshotVersionE2, objectValueD);
        if (zR2) {
            mutableDocument2.p();
        }
        return mutableDocument2;
    }

    public final MutationBatch c(WriteBatch writeBatch) {
        RemoteSerializer remoteSerializer;
        int iN = writeBatch.N();
        Timestamp timestampO = writeBatch.O();
        com.google.firebase.Timestamp timestamp = new com.google.firebase.Timestamp(timestampO.P(), timestampO.O());
        int iM = writeBatch.M();
        ArrayList arrayList = new ArrayList(iM);
        int i = 0;
        while (true) {
            remoteSerializer = this.f15485a;
            if (i >= iM) {
                break;
            }
            arrayList.add(remoteSerializer.c(writeBatch.L(i)));
            i++;
        }
        ArrayList arrayList2 = new ArrayList(writeBatch.Q());
        int i2 = 0;
        while (i2 < writeBatch.Q()) {
            Write writeP = writeBatch.P(i2);
            int i3 = i2 + 1;
            if (i3 >= writeBatch.Q() || !writeBatch.P(i3).a0()) {
                arrayList2.add(remoteSerializer.c(writeP));
            } else {
                Assert.b(writeBatch.P(i2).b0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                Write.Builder builderE0 = Write.e0(writeP);
                for (DocumentTransform.FieldTransform fieldTransform : writeBatch.P(i3).U().M()) {
                    builderE0.p();
                    Write.M((Write) builderE0.e, fieldTransform);
                }
                arrayList2.add(remoteSerializer.c((Write) builderE0.m()));
                i2 = i3;
            }
            i2++;
        }
        return new MutationBatch(iN, timestamp, arrayList, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3  */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.firebase.firestore.local.TargetData d(com.google.firebase.firestore.proto.Target r21) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.LocalSerializer.d(com.google.firebase.firestore.proto.Target):com.google.firebase.firestore.local.TargetData");
    }
}
