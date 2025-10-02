package org.sqlite;

/* loaded from: classes8.dex */
public abstract class Function {

    public static abstract class Aggregate extends Function implements Cloneable {
        public final Object clone() {
            return super.clone();
        }
    }

    public static abstract class Window extends Aggregate {
    }
}
