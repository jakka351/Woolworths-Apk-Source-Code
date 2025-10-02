package com.woolworths.scanlibrary.ui.exit.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/analytics/ExitActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ExitActionData implements Action {
    public static final ExitActionData e;
    public static final /* synthetic */ ExitActionData[] f;
    public static final /* synthetic */ EnumEntries g;
    public final Screens d = Screens.h;

    static {
        ExitActionData exitActionData = new ExitActionData() { // from class: com.woolworths.scanlibrary.ui.exit.analytics.ExitActionData.I_SCANNED_CODE_CLICK
            public final Category h = Category.D;
            public final String i = "I've scanned my code";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.h;
            }
        };
        e = exitActionData;
        ExitActionData[] exitActionDataArr = {exitActionData};
        f = exitActionDataArr;
        g = EnumEntriesKt.a(exitActionDataArr);
    }

    public static ExitActionData valueOf(String str) {
        return (ExitActionData) Enum.valueOf(ExitActionData.class, str);
    }

    public static ExitActionData[] values() {
        return (ExitActionData[]) f.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
