package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;

/* loaded from: classes6.dex */
public class LLRBBlackValueNode<K, V> extends LLRBValueNode<K, V> {
    public int e;

    public LLRBBlackValueNode(Object obj, Object obj2, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        super(obj, obj2, lLRBNode, lLRBNode2);
        this.e = -1;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final boolean b() {
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public final LLRBValueNode j(Object obj, Object obj2, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        if (obj == null) {
            obj = this.f15404a;
        }
        if (obj2 == null) {
            obj2 = this.b;
        }
        if (lLRBNode == null) {
            lLRBNode = this.c;
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = this.d;
        }
        return new LLRBBlackValueNode(obj, obj2, lLRBNode, lLRBNode2);
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public final LLRBNode.Color l() {
        return LLRBNode.Color.e;
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public final void q(LLRBValueNode lLRBValueNode) {
        if (this.e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.c = lLRBValueNode;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final int size() {
        if (this.e == -1) {
            this.e = this.d.size() + this.c.size() + 1;
        }
        return this.e;
    }
}
