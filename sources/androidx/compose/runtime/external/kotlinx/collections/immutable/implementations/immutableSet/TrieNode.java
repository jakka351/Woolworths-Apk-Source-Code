package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TrieNode<E> {
    public static final TrieNode d = new TrieNode(0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f1682a;
    public Object[] b;
    public final MutabilityOwnership c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public TrieNode(int i, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.f1682a = i;
        this.b = objArr;
        this.c = mutabilityOwnership;
    }

    public static TrieNode h(int i, Object obj, int i2, Object obj2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode(0, new Object[]{obj, obj2}, mutabilityOwnership);
        }
        int iC = TrieNodeKt.c(i, i3);
        int iC2 = TrieNodeKt.c(i2, i3);
        if (iC != iC2) {
            return new TrieNode((1 << iC) | (1 << iC2), iC < iC2 ? new Object[]{obj, obj2} : new Object[]{obj2, obj}, mutabilityOwnership);
        }
        return new TrieNode(1 << iC, new Object[]{h(i, obj, i2, obj2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    public final TrieNode a(int i, int i2, Object obj) {
        int iC = 1 << TrieNodeKt.c(i, i2);
        if (f(iC)) {
            return new TrieNode(this.f1682a | iC, TrieNodeKt.a(obj, this.b, g(iC)), null);
        }
        int iG = g(iC);
        Object obj2 = this.b[iG];
        if (obj2 instanceof TrieNode) {
            TrieNode trieNodeP = p(iG);
            TrieNode trieNode = i2 == 30 ? ArraysKt.l(trieNodeP.b, obj) ? trieNodeP : new TrieNode(0, TrieNodeKt.a(obj, trieNodeP.b, 0), null) : trieNodeP.a(i, i2 + 5, obj);
            if (trieNodeP != trieNode) {
                return r(iG, trieNode);
            }
        } else if (!Intrinsics.c(obj, obj2)) {
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iG] = i(iG, i, obj, i2, null);
            return new TrieNode(this.f1682a, objArrCopyOf, null);
        }
        return this;
    }

    public final int b() {
        if (this.f1682a == 0) {
            return this.b.length;
        }
        int iB = 0;
        for (Object obj : this.b) {
            iB += obj instanceof TrieNode ? ((TrieNode) obj).b() : 1;
        }
        return iB;
    }

    public final boolean c(int i, int i2, Object obj) {
        int iC = 1 << TrieNodeKt.c(i, i2);
        if (f(iC)) {
            return false;
        }
        int iG = g(iC);
        Object obj2 = this.b[iG];
        if (!(obj2 instanceof TrieNode)) {
            return Intrinsics.c(obj, obj2);
        }
        TrieNode trieNodeP = p(iG);
        return i2 == 30 ? ArraysKt.l(trieNodeP.b, obj) : trieNodeP.c(i, i2 + 5, obj);
    }

    public final boolean d(int i, TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (i > 30) {
            for (Object obj : trieNode.b) {
                if (!ArraysKt.l(this.b, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i2 = this.f1682a;
        int i3 = trieNode.f1682a;
        int i4 = i2 & i3;
        if (i4 != i3) {
            return false;
        }
        while (i4 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i4);
            int iG = g(iLowestOneBit);
            int iG2 = trieNode.g(iLowestOneBit);
            Object obj2 = this.b[iG];
            Object obj3 = trieNode.b[iG2];
            boolean z = obj2 instanceof TrieNode;
            boolean z2 = obj3 instanceof TrieNode;
            if (z && z2) {
                if (!((TrieNode) obj2).d(i + 5, (TrieNode) obj3)) {
                    return false;
                }
            } else if (z) {
                if (!((TrieNode) obj2).c(obj3 != null ? obj3.hashCode() : 0, i + 5, obj3)) {
                    return false;
                }
            } else if (z2 || !Intrinsics.c(obj2, obj3)) {
                return false;
            }
            i4 ^= iLowestOneBit;
        }
        return true;
    }

    public final boolean e(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f1682a != trieNode.f1682a) {
            return false;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (this.b[i] != trieNode.b[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean f(int i) {
        return (i & this.f1682a) == 0;
    }

    public final int g(int i) {
        return Integer.bitCount((i - 1) & this.f1682a);
    }

    public final TrieNode i(int i, int i2, Object obj, int i3, MutabilityOwnership mutabilityOwnership) {
        Object obj2 = this.b[i];
        return h(obj2 != null ? obj2.hashCode() : 0, obj2, i2, obj, i3 + 5, mutabilityOwnership);
    }

    public final TrieNode j(int i, Object obj, int i2, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode trieNodeJ;
        int iC = 1 << TrieNodeKt.c(i, i2);
        boolean zF = f(iC);
        MutabilityOwnership mutabilityOwnership = this.c;
        if (zF) {
            persistentHashSetBuilder.g(persistentHashSetBuilder.h + 1);
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.e;
            int iG = g(iC);
            if (mutabilityOwnership != mutabilityOwnership2) {
                return new TrieNode(this.f1682a | iC, TrieNodeKt.a(obj, this.b, iG), mutabilityOwnership2);
            }
            this.b = TrieNodeKt.a(obj, this.b, iG);
            this.f1682a |= iC;
            return this;
        }
        int iG2 = g(iC);
        Object obj2 = this.b[iG2];
        if (obj2 instanceof TrieNode) {
            TrieNode trieNodeP = p(iG2);
            if (i2 != 30) {
                trieNodeJ = trieNodeP.j(i, obj, i2 + 5, persistentHashSetBuilder);
            } else if (ArraysKt.l(trieNodeP.b, obj)) {
                trieNodeJ = trieNodeP;
            } else {
                persistentHashSetBuilder.g(persistentHashSetBuilder.h + 1);
                if (trieNodeP.c == persistentHashSetBuilder.e) {
                    trieNodeP.b = TrieNodeKt.a(obj, trieNodeP.b, 0);
                    trieNodeJ = trieNodeP;
                } else {
                    trieNodeJ = new TrieNode(0, TrieNodeKt.a(obj, trieNodeP.b, 0), persistentHashSetBuilder.e);
                }
            }
            if (trieNodeP != trieNodeJ) {
                return o(iG2, trieNodeJ, persistentHashSetBuilder.e);
            }
        } else if (!Intrinsics.c(obj, obj2)) {
            persistentHashSetBuilder.g(persistentHashSetBuilder.h + 1);
            MutabilityOwnership mutabilityOwnership3 = persistentHashSetBuilder.e;
            if (mutabilityOwnership == mutabilityOwnership3) {
                this.b[iG2] = i(iG2, i, obj, i2, mutabilityOwnership3);
                return this;
            }
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iG2] = i(iG2, i, obj, i2, mutabilityOwnership3);
            return new TrieNode(this.f1682a, objArrCopyOf, mutabilityOwnership3);
        }
        return this;
    }

    public final TrieNode k(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        Object objH;
        if (this == trieNode) {
            deltaCounter.f1686a = b() + deltaCounter.f1686a;
            return this;
        }
        MutabilityOwnership mutabilityOwnership = this.c;
        if (i > 30) {
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.e;
            if (this == trieNode) {
                deltaCounter.a(this.b.length);
                return this;
            }
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + trieNode.b.length);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            Object[] objArr2 = trieNode.b;
            int length = this.b.length;
            int i2 = 0;
            for (int i3 = 0; i3 < objArr2.length; i3++) {
                if (!ArraysKt.l(this.b, objArr2[i3])) {
                    objArrCopyOf[length + i2] = objArr2[i3];
                    i2++;
                }
            }
            int length2 = i2 + this.b.length;
            deltaCounter.a(objArrCopyOf.length - length2);
            if (length2 != this.b.length) {
                if (length2 == trieNode.b.length) {
                    return trieNode;
                }
                if (length2 != objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
                    Intrinsics.g(objArrCopyOf, "copyOf(...)");
                }
                if (!Intrinsics.c(mutabilityOwnership, mutabilityOwnership2)) {
                    return new TrieNode(0, objArrCopyOf, mutabilityOwnership2);
                }
                this.b = objArrCopyOf;
                return this;
            }
        } else {
            int i4 = this.f1682a;
            int i5 = trieNode.f1682a | i4;
            TrieNode trieNode2 = (i5 == i4 && Intrinsics.c(mutabilityOwnership, persistentHashSetBuilder.e)) ? this : new TrieNode(i5, new Object[Integer.bitCount(i5)], persistentHashSetBuilder.e);
            int i6 = 0;
            while (i5 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i5);
                int iG = g(iLowestOneBit);
                int iG2 = trieNode.g(iLowestOneBit);
                Object[] objArr3 = trieNode2.b;
                if (f(iLowestOneBit)) {
                    objH = trieNode.b[iG2];
                } else if (trieNode.f(iLowestOneBit)) {
                    objH = this.b[iG];
                } else {
                    Object obj = this.b[iG];
                    Object obj2 = trieNode.b[iG2];
                    boolean z = obj instanceof TrieNode;
                    boolean z2 = obj2 instanceof TrieNode;
                    if (z && z2) {
                        objH = ((TrieNode) obj).k((TrieNode) obj2, i + 5, deltaCounter, persistentHashSetBuilder);
                    } else if (z) {
                        TrieNode trieNode3 = (TrieNode) obj;
                        int i7 = persistentHashSetBuilder.h;
                        objH = trieNode3.j(obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.h == i7) {
                            deltaCounter.f1686a++;
                        }
                    } else if (z2) {
                        TrieNode trieNode4 = (TrieNode) obj2;
                        int i8 = persistentHashSetBuilder.h;
                        objH = trieNode4.j(obj != null ? obj.hashCode() : 0, obj, i + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.h == i8) {
                            deltaCounter.f1686a++;
                        }
                    } else if (Intrinsics.c(obj, obj2)) {
                        deltaCounter.f1686a++;
                        objH = obj;
                    } else {
                        objH = h(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, persistentHashSetBuilder.e);
                    }
                }
                objArr3[i6] = objH;
                i6++;
                i5 ^= iLowestOneBit;
            }
            if (!e(trieNode2)) {
                return trieNode.e(trieNode2) ? trieNode : trieNode2;
            }
        }
        return this;
    }

    public final TrieNode l(int i, Object obj, int i2, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode trieNodeL;
        int iC = 1 << TrieNodeKt.c(i, i2);
        if (!f(iC)) {
            int iG = g(iC);
            Object obj2 = this.b[iG];
            boolean z = obj2 instanceof TrieNode;
            MutabilityOwnership mutabilityOwnership = this.c;
            if (z) {
                TrieNode trieNodeP = p(iG);
                if (i2 == 30) {
                    int iQ = ArraysKt.Q(trieNodeP.b, obj);
                    if (iQ != -1) {
                        persistentHashSetBuilder.g(persistentHashSetBuilder.h - 1);
                        MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.e;
                        if (trieNodeP.c == mutabilityOwnership2) {
                            trieNodeP.b = TrieNodeKt.b(iQ, trieNodeP.b);
                            trieNodeL = trieNodeP;
                        } else {
                            trieNodeL = new TrieNode(0, TrieNodeKt.b(iQ, trieNodeP.b), mutabilityOwnership2);
                        }
                    } else {
                        trieNodeL = trieNodeP;
                    }
                } else {
                    trieNodeL = trieNodeP.l(i, obj, i2 + 5, persistentHashSetBuilder);
                }
                MutabilityOwnership mutabilityOwnership3 = persistentHashSetBuilder.e;
                if (mutabilityOwnership == mutabilityOwnership3 || trieNodeP != trieNodeL) {
                    return o(iG, trieNodeL, mutabilityOwnership3);
                }
            } else if (Intrinsics.c(obj, obj2)) {
                persistentHashSetBuilder.g(persistentHashSetBuilder.h - 1);
                MutabilityOwnership mutabilityOwnership4 = persistentHashSetBuilder.e;
                if (mutabilityOwnership != mutabilityOwnership4) {
                    return new TrieNode(this.f1682a ^ iC, TrieNodeKt.b(iG, this.b), mutabilityOwnership4);
                }
                this.b = TrieNodeKt.b(iG, this.b);
                this.f1682a ^= iC;
                return this;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r19, int r20, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r21, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder r22) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.m(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r18, int r19, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r20, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder r21) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.n(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final TrieNode o(int i, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r0 = trieNode.b;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.b.length == 1) {
                    trieNode.f1682a = this.f1682a;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        if (this.c == mutabilityOwnership) {
            this.b[i] = trieNode;
            return this;
        }
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = trieNode;
        return new TrieNode(this.f1682a, objArrCopyOf, mutabilityOwnership);
    }

    public final TrieNode p(int i) {
        Object obj = this.b[i];
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    public final TrieNode q(int i, int i2, Object obj) {
        TrieNode trieNodeQ;
        int iC = 1 << TrieNodeKt.c(i, i2);
        if (!f(iC)) {
            int iG = g(iC);
            Object obj2 = this.b[iG];
            if (obj2 instanceof TrieNode) {
                TrieNode trieNodeP = p(iG);
                if (i2 == 30) {
                    int iQ = ArraysKt.Q(trieNodeP.b, obj);
                    trieNodeQ = iQ != -1 ? new TrieNode(0, TrieNodeKt.b(iQ, trieNodeP.b), null) : trieNodeP;
                } else {
                    trieNodeQ = trieNodeP.q(i, i2 + 5, obj);
                }
                if (trieNodeP != trieNodeQ) {
                    return r(iG, trieNodeQ);
                }
            } else if (Intrinsics.c(obj, obj2)) {
                return new TrieNode(this.f1682a ^ iC, TrieNodeKt.b(iG, this.b), null);
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final TrieNode r(int i, TrieNode trieNode) {
        ?? r0 = trieNode.b;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.b.length == 1) {
                    trieNode.f1682a = this.f1682a;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = trieNode;
        return new TrieNode(this.f1682a, objArrCopyOf, null);
    }
}
