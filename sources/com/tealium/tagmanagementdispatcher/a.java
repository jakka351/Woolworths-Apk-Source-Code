package com.tealium.tagmanagementdispatcher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final /* synthetic */ a[] j;

    static {
        a aVar = new a("LOADED_SUCCESS", 0);
        d = aVar;
        a aVar2 = new a("LOADED_ERROR", 1);
        e = aVar2;
        a aVar3 = new a("LOADING", 2);
        f = aVar3;
        a aVar4 = new a("INIT", 3);
        g = aVar4;
        a aVar5 = new a("INITIALIZING", 4);
        h = aVar5;
        a aVar6 = new a("INITIALIZED", 5);
        i = aVar6;
        j = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) j.clone();
    }
}
