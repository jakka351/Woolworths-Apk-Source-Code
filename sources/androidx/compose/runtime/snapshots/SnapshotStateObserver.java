package androidx.compose.runtime.snapshots;

import androidx.camera.core.impl.b;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SnapshotStateObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Lambda f1710a;
    public boolean c;
    public a h;
    public ObservedScopeMap i;
    public final AtomicReference b = new AtomicReference(null);
    public final Function2 d = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Collection collectionC0;
            Collection collection = (Set) obj;
            final SnapshotStateObserver snapshotStateObserver = this.h;
            AtomicReference atomicReference = snapshotStateObserver.b;
            while (true) {
                Object obj3 = atomicReference.get();
                if (obj3 == null) {
                    collectionC0 = collection;
                } else if (obj3 instanceof Set) {
                    collectionC0 = CollectionsKt.R(obj3, collection);
                } else {
                    if (!(obj3 instanceof List)) {
                        ComposerKt.d("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    collectionC0 = CollectionsKt.c0(CollectionsKt.Q(collection), (Collection) obj3);
                }
                while (!atomicReference.compareAndSet(obj3, collectionC0)) {
                    if (atomicReference.get() != obj3) {
                        break;
                    }
                }
                if (SnapshotStateObserver.a(snapshotStateObserver)) {
                    snapshotStateObserver.f1710a.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Finally extract failed */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke() {
                            /*
                                r22 = this;
                                r1 = r22
                            L2:
                                androidx.compose.runtime.snapshots.SnapshotStateObserver r2 = r1
                                java.lang.Object r3 = r2.g
                                monitor-enter(r3)
                                boolean r0 = r2.c     // Catch: java.lang.Throwable -> L84
                                if (r0 != 0) goto L89
                                r0 = 1
                                r2.c = r0     // Catch: java.lang.Throwable -> L84
                                androidx.compose.runtime.collection.MutableVector r0 = r2.f     // Catch: java.lang.Throwable -> L7e
                                java.lang.Object[] r5 = r0.d     // Catch: java.lang.Throwable -> L7e
                                int r0 = r0.f     // Catch: java.lang.Throwable -> L7e
                                r6 = 0
                            L15:
                                if (r6 >= r0) goto L80
                                r7 = r5[r6]     // Catch: java.lang.Throwable -> L7e
                                androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r7 = (androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap) r7     // Catch: java.lang.Throwable -> L7e
                                androidx.collection.MutableScatterSet r8 = r7.g     // Catch: java.lang.Throwable -> L7e
                                kotlin.jvm.functions.Function1 r7 = r7.f1711a     // Catch: java.lang.Throwable -> L7e
                                java.lang.Object[] r9 = r8.b     // Catch: java.lang.Throwable -> L7e
                                long[] r10 = r8.f700a     // Catch: java.lang.Throwable -> L7e
                                int r11 = r10.length     // Catch: java.lang.Throwable -> L7e
                                int r11 = r11 + (-2)
                                if (r11 < 0) goto L72
                                r12 = 0
                            L29:
                                r13 = r10[r12]     // Catch: java.lang.Throwable -> L7e
                                r16 = r5
                                long r4 = ~r13     // Catch: java.lang.Throwable -> L7e
                                r17 = 7
                                long r4 = r4 << r17
                                long r4 = r4 & r13
                                r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                                long r4 = r4 & r17
                                int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
                                if (r4 == 0) goto L6b
                                int r4 = r12 - r11
                                int r4 = ~r4     // Catch: java.lang.Throwable -> L7e
                                int r4 = r4 >>> 31
                                r5 = 8
                                int r4 = 8 - r4
                                r15 = 0
                            L48:
                                if (r15 >= r4) goto L69
                                r18 = 255(0xff, double:1.26E-321)
                                long r18 = r13 & r18
                                r20 = 128(0x80, double:6.32E-322)
                                int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
                                if (r18 >= 0) goto L60
                                int r18 = r12 << 3
                                int r18 = r18 + r15
                                r19 = r5
                                r5 = r9[r18]     // Catch: java.lang.Throwable -> L7e
                                r7.invoke(r5)     // Catch: java.lang.Throwable -> L7e
                                goto L62
                            L60:
                                r19 = r5
                            L62:
                                long r13 = r13 >> r19
                                int r15 = r15 + 1
                                r5 = r19
                                goto L48
                            L69:
                                if (r4 != r5) goto L74
                            L6b:
                                if (r12 == r11) goto L74
                                int r12 = r12 + 1
                                r5 = r16
                                goto L29
                            L72:
                                r16 = r5
                            L74:
                                r8.g()     // Catch: java.lang.Throwable -> L7e
                                int r6 = r6 + 1
                                r5 = r16
                                goto L15
                            L7c:
                                r15 = 0
                                goto L86
                            L7e:
                                r0 = move-exception
                                goto L7c
                            L80:
                                r15 = 0
                                r2.c = r15     // Catch: java.lang.Throwable -> L84
                                goto L89
                            L84:
                                r0 = move-exception
                                goto L95
                            L86:
                                r2.c = r15     // Catch: java.lang.Throwable -> L84
                                throw r0     // Catch: java.lang.Throwable -> L84
                            L89:
                                monitor-exit(r3)
                                androidx.compose.runtime.snapshots.SnapshotStateObserver r0 = r1
                                boolean r0 = androidx.compose.runtime.snapshots.SnapshotStateObserver.a(r0)
                                if (r0 != 0) goto L2
                                kotlin.Unit r0 = kotlin.Unit.f24250a
                                return r0
                            L95:
                                monitor-exit(r3)
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1.invoke():java.lang.Object");
                        }
                    });
                }
                return Unit.f24250a;
            }
        }
    };
    public final Function1 e = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SnapshotStateObserver snapshotStateObserver = this.h;
            synchronized (snapshotStateObserver.g) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.i;
                Intrinsics.e(observedScopeMap);
                Object obj2 = observedScopeMap.b;
                Intrinsics.e(obj2);
                int i = observedScopeMap.d;
                MutableObjectIntMap mutableObjectIntMap = observedScopeMap.c;
                if (mutableObjectIntMap == null) {
                    mutableObjectIntMap = new MutableObjectIntMap();
                    observedScopeMap.c = mutableObjectIntMap;
                    observedScopeMap.f.m(obj2, mutableObjectIntMap);
                }
                observedScopeMap.c(obj, i, obj2, mutableObjectIntMap);
            }
            return Unit.f24250a;
        }
    };
    public final MutableVector f = new MutableVector(new ObservedScopeMap[16], 0);
    public final Object g = new Object();
    public long j = -1;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ObservedScopeMap {

        /* renamed from: a, reason: collision with root package name */
        public final Function1 f1711a;
        public Object b;
        public MutableObjectIntMap c;
        public int j;
        public int d = -1;
        public final MutableScatterMap e = ScopeMap.c();
        public final MutableScatterMap f = new MutableScatterMap();
        public final MutableScatterSet g = new MutableScatterSet();
        public final MutableVector h = new MutableVector(new DerivedState[16], 0);
        public final SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 i = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void a() {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.f1712a;
                observedScopeMap.j--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void start() {
                this.f1712a.j++;
            }
        };
        public final MutableScatterMap k = ScopeMap.c();
        public final HashMap l = new HashMap();

        /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1] */
        public ObservedScopeMap(Function1 function1) {
            this.f1711a = function1;
        }

        public final void a(Object obj, Function1 function1, Function0 function0) {
            boolean z;
            int i;
            int i2;
            Object obj2 = this.b;
            MutableObjectIntMap mutableObjectIntMap = this.c;
            int i3 = this.d;
            this.b = obj;
            this.c = (MutableObjectIntMap) this.f.e(obj);
            if (this.d == -1) {
                this.d = Long.hashCode(SnapshotKt.k().getB());
            }
            SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 snapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 = this.i;
            MutableVector mutableVectorB = SnapshotStateKt.b();
            boolean z2 = true;
            try {
                mutableVectorB.c(snapshotStateObserver$ObservedScopeMap$derivedStateObserver$1);
                Snapshot.Companion.c(function0, function1);
                mutableVectorB.l(mutableVectorB.f - 1);
                Object obj3 = this.b;
                Intrinsics.e(obj3);
                int i4 = this.d;
                MutableObjectIntMap mutableObjectIntMap2 = this.c;
                if (mutableObjectIntMap2 != null) {
                    long[] jArr = mutableObjectIntMap2.f692a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                z = z2;
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i2 = i6;
                                        Object obj4 = mutableObjectIntMap2.b[i9];
                                        i = i8;
                                        boolean z3 = mutableObjectIntMap2.c[i9] != i4 ? z : false;
                                        if (z3) {
                                            d(obj3, obj4);
                                        }
                                        if (z3) {
                                            mutableObjectIntMap2.g(i9);
                                        }
                                    } else {
                                        i = i8;
                                        i2 = i6;
                                    }
                                    j >>= i2;
                                    i8 = i + 1;
                                    i6 = i2;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                z = z2;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                            z2 = z;
                        }
                    }
                }
                this.b = obj2;
                this.c = mutableObjectIntMap;
                this.d = i3;
            } catch (Throwable th) {
                mutableVectorB.l(mutableVectorB.f - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:120:0x02a6 A[PHI: r12
  0x02a6: PHI (r12v39 boolean) = (r12v38 boolean), (r12v40 boolean) binds: [B:111:0x027f, B:119:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:221:0x04da A[PHI: r12
  0x04da: PHI (r12v11 boolean) = (r12v10 boolean), (r12v12 boolean) binds: [B:212:0x04b3, B:220:0x04d8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:225:0x04e8  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x04f4  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x0537 A[EDGE_INSN: B:243:0x0537->B:325:0x0540 BREAK  A[LOOP:18: B:233:0x0506->B:244:0x0539], PHI: r12
  0x0537: PHI (r12v5 boolean) = (r12v4 boolean), (r12v6 boolean) binds: [B:234:0x0510, B:242:0x0535] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:322:0x0540 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0244 A[PHI: r12
  0x0244: PHI (r12v48 boolean) = (r12v47 boolean), (r12v49 boolean) binds: [B:89:0x021d, B:97:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(java.util.Set r44) {
            /*
                Method dump skipped, instructions count: 1574
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.b(java.util.Set):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.lang.Object r21, int r22, java.lang.Object r23, androidx.collection.MutableObjectIntMap r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                r3 = r24
                int r4 = r0.j
                if (r4 <= 0) goto Le
                goto La4
            Le:
                int r4 = r3.e(r1)
                if (r4 >= 0) goto L17
                int r4 = ~r4
                r6 = -1
                goto L1b
            L17:
                int[] r6 = r3.c
                r6 = r6[r4]
            L1b:
                java.lang.Object[] r7 = r3.b
                r7[r4] = r1
                int[] r3 = r3.c
                r3[r4] = r2
                boolean r3 = r1 instanceof androidx.compose.runtime.DerivedState
                r4 = 2
                if (r3 == 0) goto L90
                if (r6 == r2) goto L90
                r2 = r1
                androidx.compose.runtime.DerivedState r2 = (androidx.compose.runtime.DerivedState) r2
                androidx.compose.runtime.DerivedSnapshotState$ResultRecord r2 = r2.A()
                java.util.HashMap r3 = r0.l
                java.lang.Object r7 = r2.f
                r3.put(r1, r7)
                androidx.collection.ObjectIntMap r2 = r2.e
                androidx.collection.MutableScatterMap r3 = r0.k
                androidx.compose.runtime.collection.ScopeMap.e(r3, r1)
                java.lang.Object[] r7 = r2.b
                long[] r2 = r2.f692a
                int r8 = r2.length
                int r8 = r8 - r4
                if (r8 < 0) goto L90
                r10 = 0
            L48:
                r11 = r2[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L8b
                int r13 = r10 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                r14 = 8
                int r13 = 8 - r13
                r15 = 0
            L62:
                if (r15 >= r13) goto L89
                r16 = 255(0xff, double:1.26E-321)
                long r16 = r11 & r16
                r18 = 128(0x80, double:6.32E-322)
                int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r16 >= 0) goto L85
                int r16 = r10 << 3
                int r16 = r16 + r15
                r16 = r7[r16]
                r9 = r16
                androidx.compose.runtime.snapshots.StateObject r9 = (androidx.compose.runtime.snapshots.StateObject) r9
                boolean r5 = r9 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
                if (r5 == 0) goto L82
                r5 = r9
                androidx.compose.runtime.snapshots.StateObjectImpl r5 = (androidx.compose.runtime.snapshots.StateObjectImpl) r5
                r5.B(r4)
            L82:
                androidx.compose.runtime.collection.ScopeMap.a(r3, r9, r1)
            L85:
                long r11 = r11 >> r14
                int r15 = r15 + 1
                goto L62
            L89:
                if (r13 != r14) goto L90
            L8b:
                if (r10 == r8) goto L90
                int r10 = r10 + 1
                goto L48
            L90:
                r2 = -1
                if (r6 != r2) goto La4
                boolean r2 = r1 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
                if (r2 == 0) goto L9d
                r2 = r1
                androidx.compose.runtime.snapshots.StateObjectImpl r2 = (androidx.compose.runtime.snapshots.StateObjectImpl) r2
                r2.B(r4)
            L9d:
                androidx.collection.MutableScatterMap r2 = r0.e
                r3 = r23
                androidx.compose.runtime.collection.ScopeMap.a(r2, r1, r3)
            La4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.c(java.lang.Object, int, java.lang.Object, androidx.collection.MutableObjectIntMap):void");
        }

        public final void d(Object obj, Object obj2) {
            MutableScatterMap mutableScatterMap = this.e;
            ScopeMap.d(mutableScatterMap, obj2, obj);
            if (!(obj2 instanceof DerivedState) || mutableScatterMap.c(obj2)) {
                return;
            }
            ScopeMap.e(this.k, obj2);
            this.l.remove(obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(kotlin.jvm.functions.Function1 r34) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.e(kotlin.jvm.functions.Function1):void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(Function1 function1) {
        this.f1710a = (Lambda) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(SnapshotStateObserver snapshotStateObserver) {
        boolean z;
        Set set;
        Set set2;
        synchronized (snapshotStateObserver.g) {
            z = snapshotStateObserver.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = snapshotStateObserver.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List listSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        ComposerKt.d("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    List list2 = (List) obj;
                    Set set3 = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        listSubList = list2.get(1);
                    } else if (list2.size() > 2) {
                        listSubList = list2.subList(1, list2.size());
                    }
                    set2 = set3;
                    list = listSubList;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (snapshotStateObserver.g) {
                MutableVector mutableVector = snapshotStateObserver.f;
                Object[] objArr = mutableVector.d;
                int i = mutableVector.f;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((ObservedScopeMap) objArr[i2]).b(set) || z2;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.g) {
            MutableVector mutableVector = this.f;
            Object[] objArr = mutableVector.d;
            int i = mutableVector.f;
            for (int i2 = 0; i2 < i; i2++) {
                ObservedScopeMap observedScopeMap = (ObservedScopeMap) objArr[i2];
                observedScopeMap.e.g();
                observedScopeMap.f.g();
                observedScopeMap.k.g();
                observedScopeMap.l.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.Object r2 = r1.g
            monitor-enter(r2)
            androidx.compose.runtime.collection.MutableVector r3 = r1.f     // Catch: java.lang.Throwable -> L93
            int r4 = r3.f     // Catch: java.lang.Throwable -> L93
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L9b
            java.lang.Object[] r8 = r3.d     // Catch: java.lang.Throwable -> L93
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L93
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r8 = (androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap) r8     // Catch: java.lang.Throwable -> L93
            androidx.collection.MutableScatterMap r9 = r8.f     // Catch: java.lang.Throwable -> L93
            java.lang.Object r9 = r9.k(r0)     // Catch: java.lang.Throwable -> L93
            androidx.collection.MutableObjectIntMap r9 = (androidx.collection.MutableObjectIntMap) r9     // Catch: java.lang.Throwable -> L93
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L7a
        L22:
            java.lang.Object[] r10 = r9.b     // Catch: java.lang.Throwable -> L93
            int[] r11 = r9.c     // Catch: java.lang.Throwable -> L93
            long[] r9 = r9.f692a     // Catch: java.lang.Throwable -> L93
            int r12 = r9.length     // Catch: java.lang.Throwable -> L93
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L93
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L93
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L71
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L93
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r17 = r6
            r6 = 0
        L4f:
            if (r6 >= r5) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.32E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L66
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L93
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L93
            r8.d(r0, r1)     // Catch: java.lang.Throwable -> L93
        L66:
            long r14 = r14 >> r17
            int r6 = r6 + 1
            r1 = r22
            goto L4f
        L6d:
            r1 = r17
            if (r5 != r1) goto L7a
        L71:
            if (r13 == r12) goto L7a
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L7a:
            androidx.collection.MutableScatterMap r1 = r8.f     // Catch: java.lang.Throwable -> L93
            int r1 = r1.e     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L82
            r1 = 1
            goto L83
        L82:
            r1 = 0
        L83:
            if (r1 != 0) goto L88
            int r7 = r7 + 1
            goto L95
        L88:
            if (r7 <= 0) goto L95
            java.lang.Object[] r1 = r3.d     // Catch: java.lang.Throwable -> L93
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L93
            r1[r6] = r5     // Catch: java.lang.Throwable -> L93
            goto L95
        L93:
            r0 = move-exception
            goto La7
        L95:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L9b:
            java.lang.Object[] r0 = r3.d     // Catch: java.lang.Throwable -> L93
            int r1 = r4 - r7
            r5 = 0
            java.util.Arrays.fill(r0, r1, r4, r5)     // Catch: java.lang.Throwable -> L93
            r3.f = r1     // Catch: java.lang.Throwable -> L93
            monitor-exit(r2)
            return
        La7:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.c(java.lang.Object):void");
    }

    public final void d(Function1 function1) {
        synchronized (this.g) {
            try {
                MutableVector mutableVector = this.f;
                int i = mutableVector.f;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) mutableVector.d[i3];
                    observedScopeMap.e(function1);
                    if (!(observedScopeMap.f.e != 0)) {
                        i2++;
                    } else if (i2 > 0) {
                        Object[] objArr = mutableVector.d;
                        objArr[i3 - i2] = objArr[i3];
                    }
                }
                int i4 = i - i2;
                Arrays.fill(mutableVector.d, i4, i, (Object) null);
                mutableVector.f = i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        ObservedScopeMap observedScopeMap;
        synchronized (this.g) {
            MutableVector mutableVector = this.f;
            Object[] objArr = mutableVector.d;
            int i = mutableVector.f;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i2];
                if (((ObservedScopeMap) obj2).f1711a == function1) {
                    break;
                } else {
                    i2++;
                }
            }
            observedScopeMap = (ObservedScopeMap) obj2;
            if (observedScopeMap == null) {
                Intrinsics.f(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                TypeIntrinsics.d(1, function1);
                observedScopeMap = new ObservedScopeMap(function1);
                mutableVector.c(observedScopeMap);
            }
        }
        ObservedScopeMap observedScopeMap2 = this.i;
        long j = this.j;
        if (j != -1 && j != Thread_jvmKt.a()) {
            StringBuilder sbT = b.t(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbT.append(Thread_jvmKt.a());
            sbT.append(", name=");
            sbT.append(Thread.currentThread().getName());
            sbT.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            PreconditionsKt.a(sbT.toString());
        }
        try {
            this.i = observedScopeMap;
            this.j = Thread_jvmKt.a();
            observedScopeMap.a(obj, this.e, function0);
        } finally {
            this.i = observedScopeMap2;
            this.j = j;
        }
    }

    public final void f() {
        this.h = Snapshot.Companion.d(this.d);
    }
}
