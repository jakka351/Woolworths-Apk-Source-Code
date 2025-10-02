package com.google.firebase.firestore;

import androidx.annotation.RestrictTo;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestrictTo
/* loaded from: classes6.dex */
public class UserDataWriter {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseFirestore f15430a;

    /* renamed from: com.google.firebase.firestore.UserDataWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15431a;

        static {
            int[] iArr = new int[DocumentSnapshot.ServerTimestampBehavior.values().length];
            f15431a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15431a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public UserDataWriter(FirebaseFirestore firebaseFirestore) {
        this.f15430a = firebaseFirestore;
    }

    public final HashMap a(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), b((Value) entry.getValue()));
        }
        return map2;
    }

    public final Object b(Value value) {
        boolean z = false;
        z = false;
        z = false;
        switch (Values.k(value)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(value.X());
            case 2:
                return value.h0().equals(Value.ValueTypeCase.f) ? Long.valueOf(value.c0()) : Double.valueOf(value.a0());
            case 3:
                Timestamp timestampG0 = value.g0();
                return new com.google.firebase.Timestamp(timestampG0.P(), timestampG0.O());
            case 4:
                return null;
            case 5:
                return value.f0();
            case 6:
                ByteString byteStringY = value.Y();
                Preconditions.a(byteStringY, "Provided ByteString must not be null.");
                return new Blob(byteStringY);
            case 7:
                ResourcePath resourcePathP = ResourcePath.p(value.e0());
                if (resourcePathP.d.size() > 3 && resourcePathP.f(0).equals("projects") && resourcePathP.f(2).equals("databases")) {
                    z = true;
                }
                Assert.b(z, "Tried to parse an invalid resource name: %s", resourcePathP);
                String strF = resourcePathP.f(1);
                String strF2 = resourcePathP.f(3);
                DatabaseId databaseId = new DatabaseId(strF, strF2);
                DocumentKey documentKeyC = DocumentKey.c(value.e0());
                FirebaseFirestore firebaseFirestore = this.f15430a;
                DatabaseId databaseId2 = firebaseFirestore.c;
                if (!databaseId.equals(databaseId2)) {
                    Logger.c("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", documentKeyC.d, strF, strF2, databaseId2.d, databaseId2.e);
                }
                return new DocumentReference(documentKeyC, firebaseFirestore);
            case 8:
                return new GeoPoint(value.b0().O(), value.b0().P());
            case 9:
                ArrayValue arrayValueW = value.W();
                ArrayList arrayList = new ArrayList(arrayValueW.Q());
                Iterator it = arrayValueW.i().iterator();
                while (it.hasNext()) {
                    arrayList.add(b((Value) it.next()));
                }
                return arrayList;
            case 10:
                List listI = ((Value) value.d0().O().get("value")).W().i();
                double[] dArr = new double[listI.size()];
                for (int i = 0; i < listI.size(); i++) {
                    dArr[i] = ((Value) listI.get(i)).a0();
                }
                return new VectorValue(dArr);
            case 11:
                return a(value.d0().O());
            default:
                Assert.a("Unknown value type: " + value.h0(), new Object[0]);
                throw null;
        }
    }
}
