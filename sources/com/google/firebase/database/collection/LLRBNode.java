package com.google.firebase.database.collection;

import java.util.Comparator;

/* loaded from: classes6.dex */
public interface LLRBNode<K, V> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Color {
        public static final Color d;
        public static final Color e;
        public static final /* synthetic */ Color[] f;

        static {
            Color color = new Color("RED", 0);
            d = color;
            Color color2 = new Color("BLACK", 1);
            e = color2;
            f = new Color[]{color, color2};
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) f.clone();
        }
    }

    public static abstract class NodeVisitor<K, V> implements ShortCircuitingNodeVisitor<K, V> {
    }

    public interface ShortCircuitingNodeVisitor<K, V> {
    }

    LLRBNode a(Color color, LLRBValueNode lLRBValueNode, LLRBValueNode lLRBValueNode2);

    boolean b();

    LLRBNode c(Object obj, Object obj2, Comparator comparator);

    LLRBNode d(Object obj, Comparator comparator);

    LLRBNode e();

    LLRBNode f();

    Object getKey();

    Object getValue();

    LLRBNode i();

    boolean isEmpty();

    LLRBNode n();

    int size();
}
