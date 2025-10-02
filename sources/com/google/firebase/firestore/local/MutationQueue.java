package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
interface MutationQueue {
    void a();

    MutationBatch b(int i);

    MutationBatch c(int i);

    ByteString d();

    void e(MutationBatch mutationBatch, ByteString byteString);

    ArrayList f(Set set);

    void g(MutationBatch mutationBatch);

    void h(ByteString byteString);

    List i();

    void start();
}
