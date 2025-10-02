package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;

/* loaded from: classes6.dex */
public class LLRBEmptyNode<K, V> implements LLRBNode<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public static final LLRBEmptyNode f15403a = new LLRBEmptyNode();

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode a(LLRBNode.Color color, LLRBValueNode lLRBValueNode, LLRBValueNode lLRBValueNode2) {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final boolean b() {
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode c(Object obj, Object obj2, Comparator comparator) {
        LLRBEmptyNode lLRBEmptyNode = f15403a;
        return new LLRBRedValueNode(obj, obj2, lLRBEmptyNode, lLRBEmptyNode);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode d(Object obj, Comparator comparator) {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode e() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode f() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final Object getKey() {
        return null;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final Object getValue() {
        return null;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode i() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final boolean isEmpty() {
        return true;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode n() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final int size() {
        return 0;
    }
}
