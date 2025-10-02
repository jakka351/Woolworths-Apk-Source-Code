package com.woolworths.scanlibrary.ui.setupcomplete.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/setupcomplete/analytics/SetupCompleteTracking;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SetupCompleteTracking implements Action {
    public static final SetupCompleteTracking d;
    public static final /* synthetic */ SetupCompleteTracking[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        SetupCompleteTracking setupCompleteTracking = new SetupCompleteTracking() { // from class: com.woolworths.scanlibrary.ui.setupcomplete.analytics.SetupCompleteTracking.GET_START_CLICK
            public final Category g = Category.m;
            public final String h = "Get started";
            public final Screens i = Screens.n;

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getH() {
                return this.h;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getG() {
                return this.g;
            }

            @Override // au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f */
            public final Screen getD() {
                return this.i;
            }
        };
        d = setupCompleteTracking;
        SetupCompleteTracking[] setupCompleteTrackingArr = {setupCompleteTracking};
        e = setupCompleteTrackingArr;
        f = EnumEntriesKt.a(setupCompleteTrackingArr);
    }

    public static SetupCompleteTracking valueOf(String str) {
        return (SetupCompleteTracking) Enum.valueOf(SetupCompleteTracking.class, str);
    }

    public static SetupCompleteTracking[] values() {
        return (SetupCompleteTracking[]) e.clone();
    }
}
