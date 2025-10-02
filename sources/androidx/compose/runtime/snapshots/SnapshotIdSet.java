package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Long>, KMappedMarker {
    public static final SnapshotIdSet h = new SnapshotIdSet(0, 0, 0, null);
    public final long d;
    public final long e;
    public final long f;
    public final long[] g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {
        public long[] q;
        public int r;
        public int s;
        public int t;
        public /* synthetic */ Object u;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(continuation);
            anonymousClass1.u = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:26:0x009a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:37:0x00c6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 203
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SnapshotIdSet(long j, long j2, long j3, long[] jArr) {
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = jArr;
    }

    public final SnapshotIdSet b(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSetD;
        long j;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2 = h;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        long j2 = snapshotIdSet.f;
        long j3 = snapshotIdSet.f;
        long[] jArr2 = snapshotIdSet.g;
        long j4 = snapshotIdSet.e;
        long j5 = snapshotIdSet.d;
        long j6 = this.f;
        if (j2 == j6 && jArr2 == (jArr = this.g)) {
            return new SnapshotIdSet(this.d & (~j5), this.e & (~j4), j6, jArr);
        }
        if (jArr2 != null) {
            snapshotIdSetD = this;
            for (long j7 : jArr2) {
                snapshotIdSetD = snapshotIdSetD.d(j7);
            }
        } else {
            snapshotIdSetD = this;
        }
        long j8 = 0;
        if (j4 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j4) != j8) {
                    j = j8;
                    snapshotIdSetD = snapshotIdSetD.d(i + j3);
                } else {
                    j = j8;
                }
                i++;
                j8 = j;
            }
        }
        long j9 = j8;
        if (j5 != j9) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != j9) {
                    snapshotIdSetD = snapshotIdSetD.d(i2 + j3 + 64);
                }
            }
        }
        return snapshotIdSetD;
    }

    public final SnapshotIdSet d(long j) {
        long[] jArr;
        int iA;
        long[] jArr2;
        long j2 = this.f;
        long j3 = j - j2;
        if (j3 >= 0 && j3 < 64) {
            long j4 = 1 << ((int) j3);
            long j5 = this.e;
            if ((j5 & j4) != 0) {
                return new SnapshotIdSet(this.d, j5 & (~j4), j2, this.g);
            }
        } else if (j3 >= 64 && j3 < 128) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.d;
            if ((j7 & j6) != 0) {
                return new SnapshotIdSet(j7 & (~j6), this.e, j2, this.g);
            }
        } else if (j3 < 0 && (jArr = this.g) != null && (iA = SnapshotId_jvmKt.a(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iA > 0) {
                    ArraysKt.r(0, jArr, 0, jArr3, iA);
                }
                if (iA < i) {
                    ArraysKt.r(iA, jArr, iA + 1, jArr3, length);
                }
                jArr2 = jArr3;
            }
            return new SnapshotIdSet(this.d, this.e, this.f, jArr2);
        }
        return this;
    }

    public final boolean g(long j) {
        long[] jArr;
        long j2 = j - this.f;
        return (j2 < 0 || j2 >= 64) ? (j2 < 64 || j2 >= 128) ? j2 <= 0 && (jArr = this.g) != null && SnapshotId_jvmKt.a(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.d) != 0 : ((1 << ((int) j2)) & this.e) != 0;
    }

    public final SnapshotIdSet h(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSetI;
        SnapshotIdSet snapshotIdSetI2;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2 = h;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        long j = snapshotIdSet.f;
        long j2 = snapshotIdSet.f;
        long[] jArr2 = snapshotIdSet.g;
        long j3 = snapshotIdSet.e;
        long j4 = snapshotIdSet.d;
        long j5 = this.f;
        long j6 = this.e;
        long j7 = this.d;
        if (j == j5 && jArr2 == (jArr = this.g)) {
            return new SnapshotIdSet(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = this.g;
        if (jArr3 != null) {
            if (jArr2 != null) {
                snapshotIdSetI = this;
                for (long j8 : jArr2) {
                    snapshotIdSetI = snapshotIdSetI.i(j8);
                }
            } else {
                snapshotIdSetI = this;
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        snapshotIdSetI = snapshotIdSetI.i(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        snapshotIdSetI = snapshotIdSetI.i(i + j2 + 64);
                    }
                    i++;
                }
            }
            return snapshotIdSetI;
        }
        if (jArr3 != null) {
            snapshotIdSetI2 = snapshotIdSet;
            for (long j9 : jArr3) {
                snapshotIdSetI2 = snapshotIdSetI2.i(j9);
            }
        } else {
            snapshotIdSetI2 = snapshotIdSet;
        }
        long j10 = this.f;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    snapshotIdSetI2 = snapshotIdSetI2.i(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    snapshotIdSetI2 = snapshotIdSetI2.i(i + j10 + 64);
                }
                i++;
            }
        }
        return snapshotIdSetI2;
    }

    public final SnapshotIdSet i(long j) {
        long j2;
        long j3;
        long[] jArrB;
        long j4 = this.f;
        long j5 = j - j4;
        long j6 = this.d;
        long j7 = this.e;
        long[] jArr = this.g;
        if (j5 >= 0 && j5 < 64) {
            long j8 = 1 << ((int) j5);
            if ((j7 & j8) == 0) {
                return new SnapshotIdSet(j6, j7 | j8, j4, jArr);
            }
        } else if (j5 >= 64 && j5 < 128) {
            long j9 = 1 << (((int) j5) - 64);
            if ((j6 & j9) == 0) {
                return new SnapshotIdSet(j9 | j6, j7, j4, jArr);
            }
        } else if (j5 < 128) {
            if (jArr == null) {
                return new SnapshotIdSet(j6, j7, j4, new long[]{j});
            }
            int iA = SnapshotId_jvmKt.a(jArr, j);
            if (iA < 0) {
                int i = -(iA + 1);
                int length = jArr.length;
                long[] jArr2 = new long[length + 1];
                ArraysKt.r(0, jArr, 0, jArr2, i);
                ArraysKt.r(i + 1, jArr, i, jArr2, length);
                jArr2[i] = j;
                return new SnapshotIdSet(this.d, this.e, this.f, jArr2);
            }
        } else if (!g(j)) {
            long j10 = 64;
            long j11 = ((j + 1) / j10) * j10;
            if (j11 < 0) {
                j11 = 9223372036854775680L;
            }
            long j12 = j11;
            long j13 = this.f;
            SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
            long j14 = j6;
            while (true) {
                if (j13 >= j12) {
                    j2 = j13;
                    j3 = j7;
                    break;
                }
                if (j7 != 0) {
                    if (snapshotIdArrayBuilder == null) {
                        snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(jArr);
                    }
                    for (int i2 = 0; i2 < 64; i2++) {
                        if (((1 << i2) & j7) != 0) {
                            snapshotIdArrayBuilder.a(i2 + j13);
                        }
                    }
                }
                if (j14 == 0) {
                    j3 = 0;
                    j2 = j12;
                    break;
                }
                j13 += j10;
                j7 = j14;
                j14 = 0;
            }
            return new SnapshotIdSet(j14, j3, j2, (snapshotIdArrayBuilder == null || (jArrB = snapshotIdArrayBuilder.b()) == null) ? jArr : jArrB).i(j);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(new AnonymousClass1(null)).iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
