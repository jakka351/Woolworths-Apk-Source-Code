package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firestore.v1.FirestoreGrpc;
import com.google.firestore.v1.Write;
import com.google.firestore.v1.WriteRequest;
import com.google.firestore.v1.WriteResponse;
import com.google.firestore.v1.WriteResult;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.lite.ProtoLiteUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class WriteStream extends AbstractStream<WriteRequest, WriteResponse, Callback> {
    public static final ByteString v = ByteString.e;
    public final RemoteSerializer s;
    public boolean t;
    public ByteString u;

    public interface Callback extends Stream.StreamCallback {
        void b();

        void d(SnapshotVersion snapshotVersion, ArrayList arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WriteStream(FirestoreChannel firestoreChannel, AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, Callback callback) {
        MethodDescriptor methodDescriptorA = FirestoreGrpc.f15878a;
        if (methodDescriptorA == null) {
            synchronized (FirestoreGrpc.class) {
                try {
                    methodDescriptorA = FirestoreGrpc.f15878a;
                    if (methodDescriptorA == null) {
                        MethodDescriptor.Builder builderB = MethodDescriptor.b();
                        builderB.c = MethodDescriptor.MethodType.f;
                        builderB.d = MethodDescriptor.a("google.firestore.v1.Firestore", "Write");
                        builderB.f = true;
                        builderB.f23963a = ProtoLiteUtils.a(WriteRequest.O());
                        builderB.b = ProtoLiteUtils.a(WriteResponse.M());
                        methodDescriptorA = builderB.a();
                        FirestoreGrpc.f15878a = methodDescriptorA;
                    }
                } finally {
                }
            }
        }
        super(firestoreChannel, methodDescriptorA, asyncQueue, AsyncQueue.TimerId.g, AsyncQueue.TimerId.f, callback);
        this.t = false;
        this.u = v;
        this.s = remoteSerializer;
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public final void e(Object obj) {
        this.u = ((WriteResponse) obj).N();
        this.t = true;
        ((Callback) this.l).b();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public final void f(Object obj) {
        WriteResponse writeResponse = (WriteResponse) obj;
        this.u = writeResponse.N();
        this.k.f = 0L;
        Timestamp timestampL = writeResponse.L();
        this.s.getClass();
        SnapshotVersion snapshotVersionE = RemoteSerializer.e(timestampL);
        int iP = writeResponse.P();
        ArrayList arrayList = new ArrayList(iP);
        for (int i = 0; i < iP; i++) {
            WriteResult writeResultO = writeResponse.O(i);
            SnapshotVersion snapshotVersionE2 = RemoteSerializer.e(writeResultO.N());
            if (SnapshotVersion.e.equals(snapshotVersionE2)) {
                snapshotVersionE2 = snapshotVersionE;
            }
            int iM = writeResultO.M();
            ArrayList arrayList2 = new ArrayList(iM);
            for (int i2 = 0; i2 < iM; i2++) {
                arrayList2.add(writeResultO.L(i2));
            }
            arrayList.add(new MutationResult(snapshotVersionE2, arrayList2));
        }
        ((Callback) this.l).d(snapshotVersionE, arrayList);
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public final void g() {
        this.t = false;
        super.g();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public final void h() {
        if (this.t) {
            k(Collections.EMPTY_LIST);
        }
    }

    public final void j() {
        Assert.b(super.c(), "Writing handshake requires an opened stream", new Object[0]);
        Assert.b(!this.t, "Handshake already completed", new Object[0]);
        WriteRequest.Builder builderP = WriteRequest.P();
        String str = this.s.b;
        builderP.p();
        WriteRequest.L((WriteRequest) builderP.e, str);
        i((WriteRequest) builderP.m());
    }

    public final void k(List list) {
        Assert.b(super.c(), "Writing mutations requires an opened stream", new Object[0]);
        Assert.b(this.t, "Handshake must be complete before writing mutations", new Object[0]);
        WriteRequest.Builder builderP = WriteRequest.P();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Write writeI = this.s.i((Mutation) it.next());
            builderP.p();
            WriteRequest.N((WriteRequest) builderP.e, writeI);
        }
        ByteString byteString = this.u;
        builderP.p();
        WriteRequest.M((WriteRequest) builderP.e, byteString);
        i((WriteRequest) builderP.m());
    }
}
