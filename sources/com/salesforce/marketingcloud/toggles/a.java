package com.salesforce.marketingcloud.toggles;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17068a = new a("UNKNOWN", 0);
    public static final a b = new a("ENABLED", 1);
    public static final a c = new a("DISABLED", 2);
    private static final /* synthetic */ a[] d;
    private static final /* synthetic */ EnumEntries e;

    static {
        a[] aVarArrA = a();
        d = aVarArrA;
        e = EnumEntriesKt.a(aVarArrA);
    }

    private a(String str, int i) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f17068a, b, c};
    }

    @NotNull
    public static EnumEntries<a> b() {
        return e;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}
