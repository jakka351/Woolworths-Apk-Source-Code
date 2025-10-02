package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.remote.WatchChange;
import com.google.firebase.firestore.util.Assert;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public class WatchChangeAggregator {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteStore f15590a;
    public final HashMap b = new HashMap();
    public HashMap c = new HashMap();
    public HashMap d = new HashMap();
    public HashMap e = new HashMap();
    public final DatabaseId f;

    /* renamed from: com.google.firebase.firestore.remote.WatchChangeAggregator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15591a;

        static {
            int[] iArr = new int[WatchChange.WatchTargetChangeType.values().length];
            f15591a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15591a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15591a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15591a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15591a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BloomFilterApplicationStatus {
        public static final BloomFilterApplicationStatus d;
        public static final BloomFilterApplicationStatus e;
        public static final BloomFilterApplicationStatus f;
        public static final /* synthetic */ BloomFilterApplicationStatus[] g;

        static {
            BloomFilterApplicationStatus bloomFilterApplicationStatus = new BloomFilterApplicationStatus("SUCCESS", 0);
            d = bloomFilterApplicationStatus;
            BloomFilterApplicationStatus bloomFilterApplicationStatus2 = new BloomFilterApplicationStatus("SKIPPED", 1);
            e = bloomFilterApplicationStatus2;
            BloomFilterApplicationStatus bloomFilterApplicationStatus3 = new BloomFilterApplicationStatus("FALSE_POSITIVE", 2);
            f = bloomFilterApplicationStatus3;
            g = new BloomFilterApplicationStatus[]{bloomFilterApplicationStatus, bloomFilterApplicationStatus2, bloomFilterApplicationStatus3};
        }

        public static BloomFilterApplicationStatus valueOf(String str) {
            return (BloomFilterApplicationStatus) Enum.valueOf(BloomFilterApplicationStatus.class, str);
        }

        public static BloomFilterApplicationStatus[] values() {
            return (BloomFilterApplicationStatus[]) g.clone();
        }
    }

    public interface TargetMetadataProvider {
    }

    public WatchChangeAggregator(DatabaseId databaseId, RemoteStore remoteStore) {
        this.f = databaseId;
        this.f15590a = remoteStore;
    }

    public final TargetState a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        TargetState targetState = (TargetState) map.get(numValueOf);
        if (targetState != null) {
            return targetState;
        }
        TargetState targetState2 = new TargetState();
        map.put(Integer.valueOf(i), targetState2);
        return targetState2;
    }

    public final boolean b(int i) {
        return c(i) != null;
    }

    public final TargetData c(int i) {
        TargetState targetState = (TargetState) this.b.get(Integer.valueOf(i));
        if (targetState == null || targetState.f15584a == 0) {
            return (TargetData) this.f15590a.e.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void d(int i, DocumentKey documentKey, MutableDocument mutableDocument) {
        if (b(i)) {
            TargetState targetStateA = a(i);
            HashMap map = targetStateA.b;
            if (this.f15590a.b.b(i).d.b(documentKey)) {
                targetStateA.c = true;
                map.put(documentKey, DocumentViewChange.Type.d);
            } else {
                targetStateA.c = true;
                map.remove(documentKey);
            }
            Set hashSet = (Set) this.d.get(documentKey);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.d.put(documentKey, hashSet);
            }
            hashSet.add(Integer.valueOf(i));
            if (mutableDocument != null) {
                this.c.put(documentKey, mutableDocument);
            }
        }
    }

    public final void e(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        Assert.b(map.get(numValueOf) != null && ((TargetState) map.get(Integer.valueOf(i))).f15584a == 0, "Should only reset active targets", new Object[0]);
        map.put(Integer.valueOf(i), new TargetState());
        Iterator it = this.f15590a.b.b(i).iterator();
        while (it.hasNext()) {
            d(i, (DocumentKey) it.next(), null);
        }
    }
}
