package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/DerivedState;", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {
    public final Function0 e;
    public final SnapshotMutationPolicy f;
    public ResultRecord g = new ResultRecord(SnapshotKt.k().getB());

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {
        public static final Object h = new Object();
        public long c;
        public int d;
        public ObjectIntMap e;
        public Object f;
        public int g;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }

        public ResultRecord(long j) {
            super(j);
            MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.f693a;
            Intrinsics.f(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.e = mutableObjectIntMap;
            this.f = h;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            this.e = resultRecord.e;
            this.f = resultRecord.f;
            this.g = resultRecord.g;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new ResultRecord(SnapshotKt.k().getB());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord c(long j) {
            return new ResultRecord(j);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean d(androidx.compose.runtime.DerivedState r7, androidx.compose.runtime.snapshots.Snapshot r8) {
            /*
                r6 = this;
                java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.c
                monitor-enter(r0)
                long r1 = r6.c     // Catch: java.lang.Throwable -> L1a
                long r3 = r8.getB()     // Catch: java.lang.Throwable -> L1a
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1c
                int r1 = r6.d     // Catch: java.lang.Throwable -> L1a
                int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
                if (r1 == r4) goto L18
                goto L1c
            L18:
                r1 = r3
                goto L1d
            L1a:
                r7 = move-exception
                goto L47
            L1c:
                r1 = r2
            L1d:
                monitor-exit(r0)
                java.lang.Object r4 = r6.f
                java.lang.Object r5 = androidx.compose.runtime.DerivedSnapshotState.ResultRecord.h
                if (r4 == r5) goto L2f
                if (r1 == 0) goto L30
                int r4 = r6.g
                int r7 = r6.e(r7, r8)
                if (r4 != r7) goto L2f
                goto L30
            L2f:
                r2 = r3
            L30:
                if (r2 == 0) goto L46
                if (r1 == 0) goto L46
                monitor-enter(r0)
                long r3 = r8.getB()     // Catch: java.lang.Throwable -> L43
                r6.c = r3     // Catch: java.lang.Throwable -> L43
                int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
                r6.d = r7     // Catch: java.lang.Throwable -> L43
                monitor-exit(r0)
                return r2
            L43:
                r7 = move-exception
                monitor-exit(r0)
                throw r7
            L46:
                return r2
            L47:
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.ResultRecord.d(androidx.compose.runtime.DerivedState, androidx.compose.runtime.snapshots.Snapshot):boolean");
        }

        public final int e(DerivedState derivedState, Snapshot snapshot) throws Throwable {
            ObjectIntMap objectIntMap;
            int iIdentityHashCode;
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            int i3;
            StateRecord stateRecordD;
            synchronized (SnapshotKt.c) {
                objectIntMap = this.e;
            }
            int i4 = 7;
            if (objectIntMap.e == 0) {
                return 7;
            }
            MutableVector mutableVectorB = SnapshotStateKt.b();
            Object[] objArr = mutableVectorB.d;
            int i5 = mutableVectorB.f;
            for (int i6 = 0; i6 < i5; i6++) {
                ((DerivedStateObserver) objArr[i6]).start();
            }
            try {
                Object[] objArr2 = objectIntMap.b;
                int[] iArr = objectIntMap.c;
                long[] jArr3 = objectIntMap.f692a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    iIdentityHashCode = 7;
                    int i7 = 0;
                    while (true) {
                        long j = jArr3[i7];
                        if ((((~j) << i4) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j & 255) < 128) {
                                    int i11 = (i7 << 3) + i10;
                                    Object obj = objArr2[i11];
                                    i2 = i4;
                                    int i12 = iArr[i11];
                                    i3 = i8;
                                    StateObject stateObject = (StateObject) obj;
                                    if (i12 != 1) {
                                        jArr2 = jArr3;
                                    } else {
                                        if (stateObject instanceof DerivedSnapshotState) {
                                            try {
                                                DerivedSnapshotState derivedSnapshotState = (DerivedSnapshotState) stateObject;
                                                stateRecordD = derivedSnapshotState.D((ResultRecord) SnapshotKt.j(derivedSnapshotState.g, snapshot), snapshot, false, derivedSnapshotState.e);
                                            } catch (Throwable th) {
                                                th = th;
                                                Object[] objArr3 = mutableVectorB.d;
                                                int i13 = mutableVectorB.f;
                                                for (int i14 = 0; i14 < i13; i14++) {
                                                    ((DerivedStateObserver) objArr3[i14]).a();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            stateRecordD = SnapshotKt.j(stateObject.t(), snapshot);
                                        }
                                        jArr2 = jArr3;
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(stateRecordD)) * 31) + Long.hashCode(stateRecordD.f1715a);
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i2 = i4;
                                    i3 = i8;
                                }
                                j >>= i3;
                                i10++;
                                i4 = i2;
                                jArr3 = jArr2;
                                i8 = i3;
                            }
                            jArr = jArr3;
                            i = i4;
                            if (i9 != i8) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                            i = i4;
                        }
                        if (i7 == length) {
                            i4 = iIdentityHashCode;
                            break;
                        }
                        i7++;
                        i4 = i;
                        jArr3 = jArr;
                    }
                }
                iIdentityHashCode = i4;
                Object[] objArr4 = mutableVectorB.d;
                int i15 = mutableVectorB.f;
                for (int i16 = 0; i16 < i15; i16++) {
                    ((DerivedStateObserver) objArr4[i16]).a();
                }
                return iIdentityHashCode;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public DerivedSnapshotState(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        this.e = function0;
        this.f = snapshotMutationPolicy;
    }

    @Override // androidx.compose.runtime.DerivedState
    public final ResultRecord A() {
        Snapshot snapshotK = SnapshotKt.k();
        return D((ResultRecord) SnapshotKt.j(this.g, snapshotK), snapshotK, false, this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.DerivedSnapshotState.ResultRecord D(androidx.compose.runtime.DerivedSnapshotState.ResultRecord r22, androidx.compose.runtime.snapshots.Snapshot r23, boolean r24, kotlin.jvm.functions.Function0 r25) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.D(androidx.compose.runtime.DerivedSnapshotState$ResultRecord, androidx.compose.runtime.snapshots.Snapshot, boolean, kotlin.jvm.functions.Function0):androidx.compose.runtime.DerivedSnapshotState$ResultRecord");
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void b(StateRecord stateRecord) {
        Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.g = (ResultRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.DerivedState
    /* renamed from: c, reason: from getter */
    public final SnapshotMutationPolicy getF() {
        return this.f;
    }

    @Override // androidx.compose.runtime.State
    /* renamed from: getValue */
    public final Object getD() {
        Function1 function1E = SnapshotKt.k().e();
        if (function1E != null) {
            function1E.invoke(this);
        }
        Snapshot snapshotK = SnapshotKt.k();
        return D((ResultRecord) SnapshotKt.j(this.g, snapshotK), snapshotK, true, this.e).f;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord t() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.i(this.g);
        sb.append(resultRecord.d(this, SnapshotKt.k()) ? String.valueOf(resultRecord.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
