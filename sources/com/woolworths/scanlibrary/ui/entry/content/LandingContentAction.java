package com.woolworths.scanlibrary.ui.entry.content;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/content/LandingContentAction;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LandingContentAction {
    public static final LandingContentAction d;
    public static final /* synthetic */ LandingContentAction[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        LandingContentAction landingContentAction = new LandingContentAction("HOW_DOES_IT_WORK", 0);
        d = landingContentAction;
        LandingContentAction[] landingContentActionArr = {landingContentAction};
        e = landingContentActionArr;
        f = EnumEntriesKt.a(landingContentActionArr);
    }

    public static LandingContentAction valueOf(String str) {
        return (LandingContentAction) Enum.valueOf(LandingContentAction.class, str);
    }

    public static LandingContentAction[] values() {
        return (LandingContentAction[]) e.clone();
    }
}
