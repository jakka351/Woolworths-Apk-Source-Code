package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;

/* loaded from: classes6.dex */
public abstract class LLRBValueNode<K, V> implements LLRBNode<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15404a;
    public final Object b;
    public LLRBNode c;
    public final LLRBNode d;

    public LLRBValueNode(Object obj, Object obj2, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        this.f15404a = obj;
        this.b = obj2;
        LLRBEmptyNode lLRBEmptyNode = LLRBEmptyNode.f15403a;
        this.c = lLRBNode == null ? lLRBEmptyNode : lLRBNode;
        this.d = lLRBNode2 == null ? lLRBEmptyNode : lLRBNode2;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode c(Object obj, Object obj2, Comparator comparator) {
        int iCompare = comparator.compare(obj, this.f15404a);
        return (iCompare < 0 ? j(null, null, this.c.c(obj, obj2, comparator), null) : iCompare == 0 ? j(obj, obj2, null, null) : j(null, null, null, this.d.c(obj, obj2, comparator))).k();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode d(Object obj, Comparator comparator) {
        LLRBValueNode lLRBValueNodeJ;
        if (comparator.compare(obj, this.f15404a) < 0) {
            LLRBValueNode<K, V> lLRBValueNodeM = (this.c.isEmpty() || this.c.b() || ((LLRBValueNode) this.c).c.b()) ? this : m();
            lLRBValueNodeJ = lLRBValueNodeM.j(null, null, lLRBValueNodeM.c.d(obj, comparator), null);
        } else {
            LLRBValueNode lLRBValueNodeP = this.c.b() ? p() : this;
            LLRBNode lLRBNode = lLRBValueNodeP.d;
            if (!lLRBNode.isEmpty() && !lLRBNode.b() && !((LLRBValueNode) lLRBNode).c.b()) {
                lLRBValueNodeP = lLRBValueNodeP.g();
                if (lLRBValueNodeP.c.n().b()) {
                    lLRBValueNodeP = lLRBValueNodeP.p().g();
                }
            }
            LLRBNode lLRBNode2 = lLRBValueNodeP.d;
            if (comparator.compare(obj, lLRBValueNodeP.f15404a) == 0) {
                if (lLRBNode2.isEmpty()) {
                    return LLRBEmptyNode.f15403a;
                }
                LLRBNode lLRBNodeE = lLRBNode2.e();
                lLRBValueNodeP = lLRBValueNodeP.j(lLRBNodeE.getKey(), lLRBNodeE.getValue(), null, ((LLRBValueNode) lLRBNode2).o());
            }
            lLRBValueNodeJ = lLRBValueNodeP.j(null, null, null, lLRBValueNodeP.d.d(obj, comparator));
        }
        return lLRBValueNodeJ.k();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode e() {
        return this.c.isEmpty() ? this : this.c.e();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode f() {
        LLRBNode lLRBNode = this.d;
        return lLRBNode.isEmpty() ? this : lLRBNode.f();
    }

    public final LLRBValueNode g() {
        LLRBNode lLRBNode = this.c;
        boolean zB = lLRBNode.b();
        LLRBNode.Color color = LLRBNode.Color.d;
        LLRBNode.Color color2 = LLRBNode.Color.e;
        LLRBNode lLRBNodeA = lLRBNode.a(zB ? color2 : color, null, null);
        LLRBNode lLRBNode2 = this.d;
        LLRBNode lLRBNodeA2 = lLRBNode2.a(lLRBNode2.b() ? color2 : color, null, null);
        if (b()) {
            color = color2;
        }
        return a(color, lLRBNodeA, lLRBNodeA2);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final Object getKey() {
        return this.f15404a;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final Object getValue() {
        return this.b;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final LLRBValueNode a(LLRBNode.Color color, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        if (lLRBNode == null) {
            lLRBNode = this.c;
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = this.d;
        }
        LLRBNode.Color color2 = LLRBNode.Color.d;
        Object obj = this.f15404a;
        Object obj2 = this.b;
        return color == color2 ? new LLRBRedValueNode(obj, obj2, lLRBNode, lLRBNode2) : new LLRBBlackValueNode(obj, obj2, lLRBNode, lLRBNode2);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode i() {
        return this.d;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final boolean isEmpty() {
        return false;
    }

    public abstract LLRBValueNode j(Object obj, Object obj2, LLRBNode lLRBNode, LLRBNode lLRBNode2);

    public final LLRBValueNode k() {
        LLRBNode lLRBNode = this.d;
        LLRBValueNode<K, V> lLRBValueNodeP = (!lLRBNode.b() || this.c.b()) ? this : (LLRBValueNode) lLRBNode.a(l(), a(LLRBNode.Color.d, null, ((LLRBValueNode) lLRBNode).c), null);
        if (lLRBValueNodeP.c.b() && ((LLRBValueNode) lLRBValueNodeP.c).c.b()) {
            lLRBValueNodeP = lLRBValueNodeP.p();
        }
        return (lLRBValueNodeP.c.b() && lLRBValueNodeP.d.b()) ? lLRBValueNodeP.g() : lLRBValueNodeP;
    }

    public abstract LLRBNode.Color l();

    public final LLRBValueNode m() {
        LLRBValueNode lLRBValueNodeG = g();
        LLRBNode lLRBNode = lLRBValueNodeG.d;
        if (!lLRBNode.n().b()) {
            return lLRBValueNodeG;
        }
        LLRBValueNode lLRBValueNodeJ = lLRBValueNodeG.j(null, null, null, ((LLRBValueNode) lLRBNode).p());
        LLRBNode lLRBNode2 = lLRBValueNodeJ.d;
        return ((LLRBValueNode) lLRBNode2.a(lLRBValueNodeJ.l(), lLRBValueNodeJ.a(LLRBNode.Color.d, null, ((LLRBValueNode) lLRBNode2).c), null)).g();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode n() {
        return this.c;
    }

    public final LLRBNode o() {
        if (this.c.isEmpty()) {
            return LLRBEmptyNode.f15403a;
        }
        LLRBValueNode<K, V> lLRBValueNodeM = (this.c.b() || this.c.n().b()) ? this : m();
        return lLRBValueNodeM.j(null, null, ((LLRBValueNode) lLRBValueNodeM.c).o(), null).k();
    }

    public final LLRBValueNode p() {
        return (LLRBValueNode) this.c.a(l(), null, a(LLRBNode.Color.d, ((LLRBValueNode) this.c).d, null));
    }

    public void q(LLRBValueNode lLRBValueNode) {
        this.c = lLRBValueNode;
    }
}
