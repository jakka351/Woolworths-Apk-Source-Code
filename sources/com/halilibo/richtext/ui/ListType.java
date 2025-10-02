package com.halilibo.richtext.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/ListType;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ListType {
    public static final ListType d;
    public static final ListType e;
    public static final /* synthetic */ ListType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ListType listType = new ListType("Ordered", 0);
        d = listType;
        ListType listType2 = new ListType("Unordered", 1);
        e = listType2;
        ListType[] listTypeArr = {listType, listType2};
        f = listTypeArr;
        g = EnumEntriesKt.a(listTypeArr);
    }

    public static ListType valueOf(String str) {
        return (ListType) Enum.valueOf(ListType.class, str);
    }

    public static ListType[] values() {
        return (ListType[]) f.clone();
    }
}
