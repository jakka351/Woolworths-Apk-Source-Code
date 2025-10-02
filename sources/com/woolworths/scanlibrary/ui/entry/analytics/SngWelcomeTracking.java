package com.woolworths.scanlibrary.ui.entry.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/analytics/SngWelcomeTracking;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SngWelcomeTracking implements Action {
    public static final SngWelcomeTracking e;
    public static final SngWelcomeTracking f;
    public static final SngWelcomeTracking g;
    public static final SngWelcomeTracking h;
    public static final /* synthetic */ SngWelcomeTracking[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Screens d = Screens.q;

    static {
        SngWelcomeTracking sngWelcomeTracking = new SngWelcomeTracking() { // from class: com.woolworths.scanlibrary.ui.entry.analytics.SngWelcomeTracking.CLOSE_CLICK
            public final Category k = Category.m;
            public final String l = "cancel";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        e = sngWelcomeTracking;
        SngWelcomeTracking sngWelcomeTracking2 = new SngWelcomeTracking() { // from class: com.woolworths.scanlibrary.ui.entry.analytics.SngWelcomeTracking.SETUP_CLICK
            public final Category k = Category.m;
            public final String l = "Set up Scan&Go";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        f = sngWelcomeTracking2;
        SngWelcomeTracking sngWelcomeTracking3 = new SngWelcomeTracking() { // from class: com.woolworths.scanlibrary.ui.entry.analytics.SngWelcomeTracking.TUTORIAL_CLICK
            public final Category k = Category.D;
            public final String l = "How does it work?";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        g = sngWelcomeTracking3;
        SngWelcomeTracking sngWelcomeTracking4 = new SngWelcomeTracking() { // from class: com.woolworths.scanlibrary.ui.entry.analytics.SngWelcomeTracking.AVAILABLE_STORES_CLICK
            public final Category k = Category.D;
            public final String l = "Find your nearest Scan&Go store";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.k;
            }
        };
        h = sngWelcomeTracking4;
        SngWelcomeTracking[] sngWelcomeTrackingArr = {sngWelcomeTracking, sngWelcomeTracking2, sngWelcomeTracking3, sngWelcomeTracking4};
        i = sngWelcomeTrackingArr;
        j = EnumEntriesKt.a(sngWelcomeTrackingArr);
    }

    public SngWelcomeTracking(String str, int i2) {
    }

    public static SngWelcomeTracking valueOf(String str) {
        return (SngWelcomeTracking) Enum.valueOf(SngWelcomeTracking.class, str);
    }

    public static SngWelcomeTracking[] values() {
        return (SngWelcomeTracking[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
