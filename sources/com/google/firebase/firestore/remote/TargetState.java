package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.ByteString;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class TargetState {

    /* renamed from: a, reason: collision with root package name */
    public int f15584a = 0;
    public final HashMap b = new HashMap();
    public boolean c = true;
    public ByteString d = ByteString.e;
    public boolean e = false;

    /* renamed from: com.google.firebase.firestore.remote.TargetState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15585a;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            f15585a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15585a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15585a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final TargetChange a() {
        ImmutableSortedSet immutableSortedSet = DocumentKey.f;
        ImmutableSortedSet immutableSortedSetB = immutableSortedSet;
        ImmutableSortedSet immutableSortedSetB2 = immutableSortedSetB;
        ImmutableSortedSet immutableSortedSetB3 = immutableSortedSetB2;
        for (Map.Entry entry : this.b.entrySet()) {
            DocumentKey documentKey = (DocumentKey) entry.getKey();
            DocumentViewChange.Type type = (DocumentViewChange.Type) entry.getValue();
            int iOrdinal = type.ordinal();
            if (iOrdinal == 0) {
                immutableSortedSetB3 = immutableSortedSetB3.b(documentKey);
            } else if (iOrdinal == 1) {
                immutableSortedSetB = immutableSortedSetB.b(documentKey);
            } else {
                if (iOrdinal != 2) {
                    Assert.a("Encountered invalid change type: %s", type);
                    throw null;
                }
                immutableSortedSetB2 = immutableSortedSetB2.b(documentKey);
            }
        }
        return new TargetChange(this.d, this.e, immutableSortedSetB, immutableSortedSetB2, immutableSortedSetB3);
    }
}
