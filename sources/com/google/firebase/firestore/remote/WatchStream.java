package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.remote.WatchChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firestore.v1.DocumentChange;
import com.google.firestore.v1.DocumentDelete;
import com.google.firestore.v1.DocumentRemove;
import com.google.firestore.v1.FirestoreGrpc;
import com.google.firestore.v1.ListenRequest;
import com.google.firestore.v1.ListenResponse;
import com.google.firestore.v1.Target;
import com.google.protobuf.ByteString;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.Timestamp;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.protobuf.lite.ProtoLiteUtils;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class WatchStream extends AbstractStream<ListenRequest, ListenResponse, Callback> {
    public static final ByteString t = ByteString.e;
    public final RemoteSerializer s;

    public interface Callback extends Stream.StreamCallback {
        void a(SnapshotVersion snapshotVersion, WatchChange watchChange);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WatchStream(FirestoreChannel firestoreChannel, AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, RemoteStore.AnonymousClass1 anonymousClass1) {
        MethodDescriptor methodDescriptorA = FirestoreGrpc.b;
        if (methodDescriptorA == null) {
            synchronized (FirestoreGrpc.class) {
                try {
                    methodDescriptorA = FirestoreGrpc.b;
                    if (methodDescriptorA == null) {
                        MethodDescriptor.Builder builderB = MethodDescriptor.b();
                        builderB.c = MethodDescriptor.MethodType.f;
                        builderB.d = MethodDescriptor.a("google.firestore.v1.Firestore", "Listen");
                        builderB.f = true;
                        builderB.f23963a = ProtoLiteUtils.a(ListenRequest.P());
                        builderB.b = ProtoLiteUtils.a(ListenResponse.L());
                        methodDescriptorA = builderB.a();
                        FirestoreGrpc.b = methodDescriptorA;
                    }
                } finally {
                }
            }
        }
        super(firestoreChannel, methodDescriptorA, asyncQueue, AsyncQueue.TimerId.e, AsyncQueue.TimerId.d, anonymousClass1);
        this.s = remoteSerializer;
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public final void e(Object obj) {
        f((ListenResponse) obj);
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void f(ListenResponse listenResponse) {
        WatchChange.WatchTargetChangeType watchTargetChangeType;
        WatchChange watchTargetChange;
        WatchChange.DocumentChange documentChange;
        this.k.f = 0L;
        RemoteSerializer remoteSerializer = this.s;
        remoteSerializer.getClass();
        int iOrdinal = listenResponse.Q().ordinal();
        Status statusI = null;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                DocumentChange documentChangeM = listenResponse.M();
                Internal.IntList intListO = documentChangeM.O();
                Internal.IntList intListN = documentChangeM.N();
                DocumentKey documentKeyB = remoteSerializer.b(documentChangeM.M().Q());
                SnapshotVersion snapshotVersionE = RemoteSerializer.e(documentChangeM.M().R());
                Assert.b(!snapshotVersionE.equals(SnapshotVersion.e), "Got a document change without an update time", new Object[0]);
                ObjectValue objectValueD = ObjectValue.d(documentChangeM.M().P());
                MutableDocument mutableDocument = new MutableDocument(documentKeyB);
                mutableDocument.g(snapshotVersionE, objectValueD);
                documentChange = new WatchChange.DocumentChange(intListO, intListN, documentKeyB, mutableDocument);
            } else if (iOrdinal == 2) {
                DocumentDelete documentDeleteN = listenResponse.N();
                Internal.IntList intListO2 = documentDeleteN.O();
                MutableDocument mutableDocumentO = MutableDocument.o(remoteSerializer.b(documentDeleteN.M()), RemoteSerializer.e(documentDeleteN.N()));
                documentChange = new WatchChange.DocumentChange(Collections.EMPTY_LIST, intListO2, mutableDocumentO.f15535a, mutableDocumentO);
            } else if (iOrdinal == 3) {
                DocumentRemove documentRemoveO = listenResponse.O();
                documentChange = new WatchChange.DocumentChange(Collections.EMPTY_LIST, documentRemoveO.N(), remoteSerializer.b(documentRemoveO.M()), null);
            } else {
                if (iOrdinal != 4) {
                    throw new IllegalArgumentException("Unknown change type set");
                }
                com.google.firestore.v1.ExistenceFilter existenceFilterP = listenResponse.P();
                watchTargetChange = new WatchChange.ExistenceFilterWatchChange(existenceFilterP.N(), new ExistenceFilter(existenceFilterP.L(), existenceFilterP.O()));
            }
            watchTargetChange = documentChange;
        } else {
            com.google.firestore.v1.TargetChange targetChangeR = listenResponse.R();
            int iOrdinal2 = targetChangeR.P().ordinal();
            if (iOrdinal2 == 0) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.d;
            } else if (iOrdinal2 == 1) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.e;
            } else if (iOrdinal2 == 2) {
                com.google.rpc.Status statusL = targetChangeR.L();
                statusI = Status.d(statusL.L()).i(statusL.N());
                watchTargetChangeType = WatchChange.WatchTargetChangeType.f;
            } else if (iOrdinal2 == 3) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.g;
            } else {
                if (iOrdinal2 != 4) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                watchTargetChangeType = WatchChange.WatchTargetChangeType.h;
            }
            watchTargetChange = new WatchChange.WatchTargetChange(watchTargetChangeType, targetChangeR.R(), targetChangeR.O(), statusI);
        }
        SnapshotVersion snapshotVersionE2 = (listenResponse.Q() == ListenResponse.ResponseTypeCase.d && listenResponse.R().Q() == 0) ? RemoteSerializer.e(listenResponse.R().N()) : SnapshotVersion.e;
        ((Callback) this.l).a(snapshotVersionE2, watchTargetChange);
    }

    public final void k(int i) {
        Assert.b(super.c(), "Unwatching targets requires an open stream", new Object[0]);
        ListenRequest.Builder builderQ = ListenRequest.Q();
        String str = this.s.b;
        builderQ.p();
        ListenRequest.M((ListenRequest) builderQ.e, str);
        builderQ.p();
        ListenRequest.O((ListenRequest) builderQ.e, i);
        i((ListenRequest) builderQ.m());
    }

    public final void l(TargetData targetData) {
        String str;
        Assert.b(super.c(), "Watching queries requires an open stream", new Object[0]);
        ListenRequest.Builder builderQ = ListenRequest.Q();
        RemoteSerializer remoteSerializer = this.s;
        String str2 = remoteSerializer.b;
        builderQ.p();
        ListenRequest.M((ListenRequest) builderQ.e, str2);
        Target.Builder builderR = Target.R();
        com.google.firebase.firestore.core.Target target = targetData.f15522a;
        Integer num = targetData.h;
        SnapshotVersion snapshotVersion = targetData.e;
        ByteString byteString = targetData.g;
        if (target.e()) {
            Target.DocumentsTarget.Builder builderP = Target.DocumentsTarget.P();
            String strK = RemoteSerializer.k(remoteSerializer.f15578a, target.d);
            builderP.p();
            Target.DocumentsTarget.L((Target.DocumentsTarget) builderP.e, strK);
            Target.DocumentsTarget documentsTarget = (Target.DocumentsTarget) builderP.m();
            builderR.p();
            Target.M((Target) builderR.e, documentsTarget);
        } else {
            Target.QueryTarget queryTargetJ = remoteSerializer.j(target);
            builderR.p();
            Target.L((Target) builderR.e, queryTargetJ);
        }
        int i = targetData.b;
        builderR.p();
        Target.P((Target) builderR.e, i);
        if (!byteString.isEmpty() || snapshotVersion.compareTo(SnapshotVersion.e) <= 0) {
            builderR.p();
            Target.N((Target) builderR.e, byteString);
        } else {
            Timestamp timestampL = RemoteSerializer.l(snapshotVersion.d);
            builderR.p();
            Target.O((Target) builderR.e, timestampL);
        }
        if (num != null && (!byteString.isEmpty() || snapshotVersion.compareTo(SnapshotVersion.e) > 0)) {
            Int32Value.Builder builderO = Int32Value.O();
            int iIntValue = num.intValue();
            builderO.p();
            Int32Value.L((Int32Value) builderO.e, iIntValue);
            builderR.p();
            Target.Q((Target) builderR.e, (Int32Value) builderO.m());
        }
        Target target2 = (Target) builderR.m();
        builderQ.p();
        ListenRequest.N((ListenRequest) builderQ.e, target2);
        QueryPurpose queryPurpose = targetData.d;
        int iOrdinal = queryPurpose.ordinal();
        HashMap map = null;
        if (iOrdinal == 0) {
            str = null;
        } else if (iOrdinal == 1) {
            str = "existence-filter-mismatch";
        } else if (iOrdinal == 2) {
            str = "existence-filter-mismatch-bloom";
        } else {
            if (iOrdinal != 3) {
                Assert.a("Unrecognized query purpose: %s", queryPurpose);
                throw null;
            }
            str = "limbo-document";
        }
        if (str != null) {
            map = new HashMap(1);
            map.put("goog-listen-tags", str);
        }
        if (map != null) {
            builderQ.p();
            ListenRequest.L((ListenRequest) builderQ.e).putAll(map);
        }
        i((ListenRequest) builderQ.m());
    }
}
