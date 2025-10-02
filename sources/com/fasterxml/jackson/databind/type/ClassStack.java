package com.fasterxml.jackson.databind.type;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ClassStack {

    /* renamed from: a, reason: collision with root package name */
    public final ClassStack f14324a;
    public final Class b;
    public ArrayList c;

    public ClassStack(ClassStack classStack, Class cls) {
        this.f14324a = classStack;
        this.b = cls;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ClassStack (self-refs: ");
        ArrayList arrayList = this.c;
        sb.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb.append(')');
        for (ClassStack classStack = this; classStack != null; classStack = classStack.f14324a) {
            sb.append(' ');
            sb.append(classStack.b.getName());
        }
        sb.append(']');
        return sb.toString();
    }
}
