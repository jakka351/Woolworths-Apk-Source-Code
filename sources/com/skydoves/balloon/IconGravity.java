package com.skydoves.balloon;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/IconGravity;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IconGravity {
    public static final IconGravity d;
    public static final /* synthetic */ IconGravity[] e;

    static {
        IconGravity iconGravity = new IconGravity("START", 0);
        d = iconGravity;
        e = new IconGravity[]{iconGravity, new IconGravity("END", 1), new IconGravity("TOP", 2), new IconGravity("BOTTOM", 3)};
    }

    public static IconGravity valueOf(String str) {
        return (IconGravity) Enum.valueOf(IconGravity.class, str);
    }

    public static IconGravity[] values() {
        return (IconGravity[]) e.clone();
    }
}
