package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;

/* loaded from: classes6.dex */
public class LLRBRedValueNode<K, V> extends LLRBValueNode<K, V> {
    @Override // com.google.firebase.database.collection.LLRBNode
    public final boolean b() {
        return true;
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
        return new LLRBRedValueNode(obj, obj2, lLRBNode, lLRBNode2);
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public final LLRBNode.Color l() {
        return LLRBNode.Color.d;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final int size() {
        return this.d.size() + this.c.size() + 1;
    }
}
