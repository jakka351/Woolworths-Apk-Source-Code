package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "Companion", "ModificationResult", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TrieNode<K, V> {
    public static final TrieNode e = new TrieNode(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f1680a;
    public int b;
    public final MutabilityOwnership c;
    public Object[] d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ModificationResult<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public TrieNode f1681a;
        public final int b;

        public ModificationResult(TrieNode trieNode, int i) {
            this.f1681a = trieNode;
            this.b = i;
        }
    }

    public TrieNode(int i, int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.f1680a = i;
        this.b = i2;
        this.c = mutabilityOwnership;
        this.d = objArr;
    }

    public static TrieNode j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode(0, 0, new Object[]{obj, obj2, obj3, obj4}, mutabilityOwnership);
        }
        int iD = TrieNodeKt.d(i, i3);
        int iD2 = TrieNodeKt.d(i2, i3);
        if (iD != iD2) {
            return new TrieNode((1 << iD) | (1 << iD2), 0, iD < iD2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, mutabilityOwnership);
        }
        return new TrieNode(0, 1 << iD, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, MutabilityOwnership mutabilityOwnership) {
        Object obj3 = this.d[i];
        TrieNode trieNodeJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, mutabilityOwnership);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.x(objArr, 0, objArr2, i, 6);
        ArraysKt.t(objArr, i, objArr2, i + 2, i5);
        objArr2[iT - 1] = trieNodeJ;
        ArraysKt.t(objArr, iT, objArr2, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f1680a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, this.d.length));
        int i = intProgressionN.d;
        int i2 = intProgressionN.e;
        int i3 = intProgressionN.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!Intrinsics.c(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iD = 1 << TrieNodeKt.d(i, i2);
        if (h(iD)) {
            return Intrinsics.c(obj, this.d[f(iD)]);
        }
        if (!i(iD)) {
            return false;
        }
        TrieNode trieNodeS = s(t(iD));
        return i2 == 30 ? trieNodeS.c(obj) : trieNodeS.d(i, i2 + 5, obj);
    }

    public final boolean e(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.b == trieNode.b && this.f1680a == trieNode.f1680a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == trieNode.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.f1680a) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iD = 1 << TrieNodeKt.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (Intrinsics.c(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iD)) {
            return null;
        }
        TrieNode trieNodeS = s(t(iD));
        if (i2 != 30) {
            return trieNodeS.g(i, i2 + 5, obj);
        }
        IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, trieNodeS.d.length));
        int i3 = intProgressionN.d;
        int i4 = intProgressionN.e;
        int i5 = intProgressionN.f;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!Intrinsics.c(obj, trieNodeS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return trieNodeS.x(i3);
    }

    public final boolean h(int i) {
        return (i & this.f1680a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.b) != 0;
    }

    public final TrieNode k(int i, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.f(persistentHashMapBuilder.i - 1);
        persistentHashMapBuilder.g = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != persistentHashMapBuilder.e) {
            return new TrieNode(0, 0, TrieNodeKt.b(i, objArr), persistentHashMapBuilder.e);
        }
        this.d = TrieNodeKt.b(i, objArr);
        return this;
    }

    public final TrieNode l(int i, Object obj, Object obj2, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        PersistentHashMapBuilder persistentHashMapBuilder2;
        TrieNode trieNodeL;
        int iD = 1 << TrieNodeKt.d(i, i2);
        boolean zH = h(iD);
        MutabilityOwnership mutabilityOwnership = this.c;
        if (zH) {
            int iF = f(iD);
            if (!Intrinsics.c(obj, this.d[iF])) {
                persistentHashMapBuilder.f(persistentHashMapBuilder.i + 1);
                MutabilityOwnership mutabilityOwnership2 = persistentHashMapBuilder.e;
                if (mutabilityOwnership != mutabilityOwnership2) {
                    return new TrieNode(this.f1680a ^ iD, this.b | iD, a(iF, iD, i, obj, obj2, i2, mutabilityOwnership2), mutabilityOwnership2);
                }
                this.d = a(iF, iD, i, obj, obj2, i2, mutabilityOwnership2);
                this.f1680a ^= iD;
                this.b |= iD;
                return this;
            }
            persistentHashMapBuilder.g = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (mutabilityOwnership == persistentHashMapBuilder.e) {
                this.d[iF + 1] = obj2;
                return this;
            }
            persistentHashMapBuilder.h++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new TrieNode(this.f1680a, this.b, objArrCopyOf, persistentHashMapBuilder.e);
        }
        if (!i(iD)) {
            persistentHashMapBuilder.f(persistentHashMapBuilder.i + 1);
            MutabilityOwnership mutabilityOwnership3 = persistentHashMapBuilder.e;
            int iF2 = f(iD);
            if (mutabilityOwnership != mutabilityOwnership3) {
                return new TrieNode(this.f1680a | iD, this.b, TrieNodeKt.a(obj, obj2, this.d, iF2), mutabilityOwnership3);
            }
            this.d = TrieNodeKt.a(obj, obj2, this.d, iF2);
            this.f1680a |= iD;
            return this;
        }
        int iT = t(iD);
        TrieNode trieNodeS = s(iT);
        if (i2 == 30) {
            IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, trieNodeS.d.length));
            int i3 = intProgressionN.d;
            int i4 = intProgressionN.e;
            int i5 = intProgressionN.f;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                persistentHashMapBuilder.f(persistentHashMapBuilder.i + 1);
                trieNodeL = new TrieNode(0, 0, TrieNodeKt.a(obj, obj2, trieNodeS.d, 0), persistentHashMapBuilder.e);
                persistentHashMapBuilder2 = persistentHashMapBuilder;
            } else {
                while (!Intrinsics.c(obj, trieNodeS.d[i3])) {
                    if (i3 == i4) {
                        persistentHashMapBuilder.f(persistentHashMapBuilder.i + 1);
                        trieNodeL = new TrieNode(0, 0, TrieNodeKt.a(obj, obj2, trieNodeS.d, 0), persistentHashMapBuilder.e);
                        break;
                    }
                    i3 += i5;
                }
                persistentHashMapBuilder.g = trieNodeS.x(i3);
                if (trieNodeS.c == persistentHashMapBuilder.e) {
                    trieNodeS.d[i3 + 1] = obj2;
                    trieNodeL = trieNodeS;
                } else {
                    persistentHashMapBuilder.h++;
                    Object[] objArr2 = trieNodeS.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    Intrinsics.g(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i3 + 1] = obj2;
                    trieNodeL = new TrieNode(0, 0, objArrCopyOf2, persistentHashMapBuilder.e);
                }
                persistentHashMapBuilder2 = persistentHashMapBuilder;
            }
        } else {
            persistentHashMapBuilder2 = persistentHashMapBuilder;
            trieNodeL = trieNodeS.l(i, obj, obj2, i2 + 5, persistentHashMapBuilder2);
        }
        return trieNodeS == trieNodeL ? this : r(iT, trieNodeL, persistentHashMapBuilder2.e);
    }

    public final TrieNode m(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashMapBuilder persistentHashMapBuilder) {
        Object[] objArr;
        TrieNode trieNodeJ;
        if (this == trieNode) {
            deltaCounter.a(b());
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            MutabilityOwnership mutabilityOwnership = persistentHashMapBuilder.e;
            int i3 = trieNode.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + trieNode.d.length);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            int length = this.d.length;
            IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, trieNode.d.length));
            int i4 = intProgressionN.d;
            int i5 = intProgressionN.e;
            int i6 = intProgressionN.f;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(trieNode.d[i4])) {
                        deltaCounter.f1686a++;
                    } else {
                        Object[] objArr3 = trieNode.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == trieNode.d.length) {
                    return trieNode;
                }
                if (length == objArrCopyOf.length) {
                    return new TrieNode(0, 0, objArrCopyOf, mutabilityOwnership);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                Intrinsics.g(objArrCopyOf2, "copyOf(...)");
                return new TrieNode(0, 0, objArrCopyOf2, mutabilityOwnership);
            }
        } else {
            int i7 = this.b | trieNode.b;
            int i8 = this.f1680a;
            int i9 = trieNode.f1680a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (Intrinsics.c(this.d[f(iLowestOneBit)], trieNode.d[trieNode.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                PreconditionsKt.b("Check failed.");
            }
            TrieNode trieNode2 = (Intrinsics.c(this.c, persistentHashMapBuilder.e) && this.f1680a == i12 && this.b == i7) ? this : new TrieNode(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = trieNode2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    trieNodeJ = s(t(iLowestOneBit2));
                    if (trieNode.i(iLowestOneBit2)) {
                        trieNodeJ = trieNodeJ.m(trieNode.s(trieNode.t(iLowestOneBit2)), i + 5, deltaCounter, persistentHashMapBuilder);
                        objArr = objArr4;
                    } else if (trieNode.h(iLowestOneBit2)) {
                        int iF = trieNode.f(iLowestOneBit2);
                        Object obj = trieNode.d[iF];
                        Object objX = trieNode.x(iF);
                        int i15 = persistentHashMapBuilder.i;
                        objArr = objArr4;
                        trieNodeJ = trieNodeJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, persistentHashMapBuilder);
                        if (persistentHashMapBuilder.i == i15) {
                            deltaCounter.f1686a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (trieNode.i(iLowestOneBit2)) {
                        TrieNode trieNodeS = trieNode.s(trieNode.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (trieNodeS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                deltaCounter.f1686a++;
                                trieNodeJ = trieNodeS;
                            } else {
                                trieNodeJ = trieNodeS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, persistentHashMapBuilder);
                            }
                        } else {
                            trieNodeJ = trieNodeS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = trieNode.f(iLowestOneBit2);
                        Object obj4 = trieNode.d[iF4];
                        trieNodeJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, trieNode.x(iF4), i + 5, persistentHashMapBuilder.e);
                    }
                }
                objArr[length2] = trieNodeJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (trieNode.h(iLowestOneBit3)) {
                    int iF5 = trieNode.f(iLowestOneBit3);
                    Object[] objArr5 = trieNode2.d;
                    objArr5[i18] = trieNode.d[iF5];
                    objArr5[i18 + 1] = trieNode.x(iF5);
                    if (h(iLowestOneBit3)) {
                        deltaCounter.f1686a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = trieNode2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(trieNode2)) {
                return trieNode.e(trieNode2) ? trieNode : trieNode2;
            }
        }
        return this;
    }

    public final TrieNode n(int i, Object obj, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode trieNodeN;
        int iD = 1 << TrieNodeKt.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (Intrinsics.c(obj, this.d[iF])) {
                return p(iF, iD, persistentHashMapBuilder);
            }
        } else if (i(iD)) {
            int iT = t(iD);
            TrieNode trieNodeS = s(iT);
            if (i2 == 30) {
                IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, trieNodeS.d.length));
                int i3 = intProgressionN.d;
                int i4 = intProgressionN.e;
                int i5 = intProgressionN.f;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    trieNodeN = trieNodeS;
                    break;
                }
                while (!Intrinsics.c(obj, trieNodeS.d[i3])) {
                    if (i3 == i4) {
                        trieNodeN = trieNodeS;
                        break;
                    }
                    i3 += i5;
                }
                trieNodeN = trieNodeS.k(i3, persistentHashMapBuilder);
            } else {
                trieNodeN = trieNodeS.n(i, obj, i2 + 5, persistentHashMapBuilder);
            }
            return q(trieNodeS, trieNodeN, iT, iD, persistentHashMapBuilder.e);
        }
        return this;
    }

    public final TrieNode o(int i, Object obj, Object obj2, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode trieNode;
        TrieNode trieNodeO;
        int iD = 1 << TrieNodeKt.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (Intrinsics.c(obj, this.d[iF]) && Intrinsics.c(obj2, x(iF))) {
                return p(iF, iD, persistentHashMapBuilder);
            }
        } else if (i(iD)) {
            int iT = t(iD);
            TrieNode trieNodeS = s(iT);
            if (i2 == 30) {
                IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, trieNodeS.d.length));
                int i3 = intProgressionN.d;
                int i4 = intProgressionN.e;
                int i5 = intProgressionN.f;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    trieNodeO = trieNodeS;
                    trieNode = trieNodeS;
                } else {
                    while (true) {
                        if (!Intrinsics.c(obj, trieNodeS.d[i3]) || !Intrinsics.c(obj2, trieNodeS.x(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            trieNodeO = trieNodeS.k(i3, persistentHashMapBuilder);
                            break;
                        }
                    }
                    trieNodeO = trieNodeS;
                    trieNode = trieNodeS;
                }
            } else {
                trieNode = trieNodeS;
                trieNodeO = trieNode.o(i, obj, obj2, i2 + 5, persistentHashMapBuilder);
            }
            return q(trieNode, trieNodeO, iT, iD, persistentHashMapBuilder.e);
        }
        return this;
    }

    public final TrieNode p(int i, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.f(persistentHashMapBuilder.i - 1);
        persistentHashMapBuilder.g = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != persistentHashMapBuilder.e) {
            return new TrieNode(i2 ^ this.f1680a, this.b, TrieNodeKt.b(i, objArr), persistentHashMapBuilder.e);
        }
        this.d = TrieNodeKt.b(i, objArr);
        this.f1680a ^= i2;
        return this;
    }

    public final TrieNode q(TrieNode trieNode, TrieNode trieNode2, int i, int i2, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.c;
        if (trieNode2 != null) {
            return (mutabilityOwnership2 == mutabilityOwnership || trieNode != trieNode2) ? r(i, trieNode2, mutabilityOwnership) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (mutabilityOwnership2 != mutabilityOwnership) {
            return new TrieNode(this.f1680a, i2 ^ this.b, TrieNodeKt.c(i, objArr), mutabilityOwnership);
        }
        this.d = TrieNodeKt.c(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final TrieNode r(int i, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && trieNode.d.length == 2 && trieNode.b == 0) {
            trieNode.f1680a = this.b;
            return trieNode;
        }
        if (this.c == mutabilityOwnership) {
            objArr[i] = trieNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = trieNode;
        return new TrieNode(this.f1680a, this.b, objArrCopyOf, mutabilityOwnership);
    }

    public final TrieNode s(int i) {
        Object obj = this.d[i];
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        r14.f1681a = w(r12, r4, r14.f1681a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult u(java.lang.Object r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.u(java.lang.Object, int, int, java.lang.Object):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode$ModificationResult");
    }

    public final TrieNode v(int i, int i2, Object obj) {
        TrieNode trieNodeV;
        int iD = 1 << TrieNodeKt.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (Intrinsics.c(obj, this.d[iF])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new TrieNode(this.f1680a ^ iD, this.b, TrieNodeKt.b(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iD)) {
            int iT = t(iD);
            TrieNode trieNodeS = s(iT);
            if (i2 == 30) {
                IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, trieNodeS.d.length));
                int i3 = intProgressionN.d;
                int i4 = intProgressionN.e;
                int i5 = intProgressionN.f;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!Intrinsics.c(obj, trieNodeS.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = trieNodeS.d;
                    trieNodeV = objArr2.length == 2 ? null : new TrieNode(0, 0, TrieNodeKt.b(i3, objArr2), null);
                }
                trieNodeV = trieNodeS;
                break;
            }
            trieNodeV = trieNodeS.v(i, i2 + 5, obj);
            if (trieNodeV == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new TrieNode(this.f1680a, iD ^ this.b, TrieNodeKt.c(iT, objArr3), null);
                }
                return null;
            }
            if (trieNodeS != trieNodeV) {
                return w(iT, iD, trieNodeV);
            }
        }
        return this;
    }

    public final TrieNode w(int i, int i2, TrieNode trieNode) {
        Object[] objArr = trieNode.d;
        if (objArr.length != 2 || trieNode.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i] = trieNode;
            return new TrieNode(this.f1680a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            trieNode.f1680a = this.b;
            return trieNode;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        Intrinsics.g(objArrCopyOf2, "copyOf(...)");
        ArraysKt.t(objArrCopyOf2, i + 2, objArrCopyOf2, i + 1, objArr3.length);
        ArraysKt.t(objArrCopyOf2, iF + 2, objArrCopyOf2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new TrieNode(this.f1680a ^ i2, i2 ^ this.b, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
