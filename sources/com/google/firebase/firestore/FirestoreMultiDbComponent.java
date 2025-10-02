package com.google.firebase.firestore;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.remote.FirebaseClientGrpcMetadataProvider;
import com.google.firebase.inject.Deferred;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FirestoreMultiDbComponent implements FirebaseAppLifecycleListener, FirebaseFirestore.InstanceRegistry {
    public final HashMap d = new HashMap();
    public final FirebaseApp e;
    public final Context f;
    public final Deferred g;
    public final Deferred h;
    public final FirebaseClientGrpcMetadataProvider i;

    public FirestoreMultiDbComponent(Context context, FirebaseApp firebaseApp, Deferred deferred, Deferred deferred2, FirebaseClientGrpcMetadataProvider firebaseClientGrpcMetadataProvider) {
        this.f = context;
        this.e = firebaseApp;
        this.g = deferred;
        this.h = deferred2;
        this.i = firebaseClientGrpcMetadataProvider;
        firebaseApp.a();
        Preconditions.checkNotNull(this);
        firebaseApp.j.add(this);
    }
}
