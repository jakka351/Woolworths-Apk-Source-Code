package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.remote.FirestoreChannel;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.inject.Deferred;
import java.util.List;

/* loaded from: classes6.dex */
public class FirebaseFirestore {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.net.a f15426a;
    public final Context b;
    public final DatabaseId c;
    public final String d;
    public final FirebaseAuthCredentialsProvider e;
    public final FirebaseAppCheckTokenProvider f;
    public final InstanceRegistry g;
    public final FirebaseFirestoreSettings h;
    public final FirestoreClientProvider i;
    public final GrpcMetadataProvider j;

    /* loaded from: classes.dex */
    public interface InstanceRegistry {
    }

    public FirebaseFirestore(Context context, DatabaseId databaseId, String str, FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider, FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider, com.google.common.net.a aVar, InstanceRegistry instanceRegistry, GrpcMetadataProvider grpcMetadataProvider) {
        context.getClass();
        this.b = context;
        this.c = databaseId;
        str.getClass();
        this.d = str;
        this.e = firebaseAuthCredentialsProvider;
        this.f = firebaseAppCheckTokenProvider;
        this.f15426a = aVar;
        this.i = new FirestoreClientProvider(new b(this));
        this.g = instanceRegistry;
        this.j = grpcMetadataProvider;
        this.h = new FirebaseFirestoreSettings();
    }

    public static FirebaseFirestore b(FirebaseApp firebaseApp) {
        FirebaseFirestore firebaseFirestoreC;
        Preconditions.a(firebaseApp, "Provided FirebaseApp must not be null.");
        FirestoreMultiDbComponent firestoreMultiDbComponent = (FirestoreMultiDbComponent) firebaseApp.b(FirestoreMultiDbComponent.class);
        Preconditions.a(firestoreMultiDbComponent, "Firestore component is not present.");
        synchronized (firestoreMultiDbComponent) {
            firebaseFirestoreC = (FirebaseFirestore) firestoreMultiDbComponent.d.get("(default)");
            if (firebaseFirestoreC == null) {
                firebaseFirestoreC = c(firestoreMultiDbComponent.f, firestoreMultiDbComponent.e, firestoreMultiDbComponent.g, firestoreMultiDbComponent.h, firestoreMultiDbComponent, firestoreMultiDbComponent.i);
                firestoreMultiDbComponent.d.put("(default)", firebaseFirestoreC);
            }
        }
        return firebaseFirestoreC;
    }

    public static FirebaseFirestore c(Context context, FirebaseApp firebaseApp, Deferred deferred, Deferred deferred2, InstanceRegistry instanceRegistry, GrpcMetadataProvider grpcMetadataProvider) {
        firebaseApp.a();
        String str = firebaseApp.c.g;
        if (str == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        DatabaseId databaseId = new DatabaseId(str, "(default)");
        FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider = new FirebaseAuthCredentialsProvider(deferred);
        FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider = new FirebaseAppCheckTokenProvider();
        deferred2.a(new au.com.woolworths.product.details.epoxy.a(firebaseAppCheckTokenProvider, 19));
        firebaseApp.a();
        return new FirebaseFirestore(context, databaseId, firebaseApp.b, firebaseAuthCredentialsProvider, firebaseAppCheckTokenProvider, new com.google.common.net.a(4), instanceRegistry, grpcMetadataProvider);
    }

    @Keep
    public static void setClientLanguage(@NonNull String str) {
        FirestoreChannel.j = str;
    }

    public final DocumentReference a(String str) {
        Preconditions.a(str, "Provided document path must not be null.");
        this.i.a();
        ResourcePath resourcePathP = ResourcePath.p(str);
        List list = resourcePathP.d;
        if (list.size() % 2 == 0) {
            return new DocumentReference(new DocumentKey(resourcePathP), this);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + resourcePathP.b() + " has " + list.size());
    }
}
