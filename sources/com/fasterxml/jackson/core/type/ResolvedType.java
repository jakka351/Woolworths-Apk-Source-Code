package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes4.dex */
public abstract class ResolvedType {
    public abstract JavaType a();

    public boolean b() {
        return a() != null;
    }

    public abstract String c();
}
