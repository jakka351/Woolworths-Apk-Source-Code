package com.woolworths.scanlibrary.analytics.tracking;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/analytics/tracking/ScanAndGoEntryActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ScanAndGoEntryActions implements Action {
    public static final ScanAndGoEntryActions e;
    public static final ScanAndGoEntryActions f;
    public static final ScanAndGoEntryActions g;
    public static final ScanAndGoEntryActions h;
    public static final /* synthetic */ ScanAndGoEntryActions[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Screen d = Screens.d;

    static {
        ScanAndGoEntryActions scanAndGoEntryActions = new ScanAndGoEntryActions() { // from class: com.woolworths.scanlibrary.analytics.tracking.ScanAndGoEntryActions.SERVER_ERROR
            public final Category k = Category.v;
            public final String l = "Server Error";

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
        e = scanAndGoEntryActions;
        ScanAndGoEntryActions scanAndGoEntryActions2 = new ScanAndGoEntryActions() { // from class: com.woolworths.scanlibrary.analytics.tracking.ScanAndGoEntryActions.SERVER_ERROR_TRY_AGAIN
            public final Category k = Category.m;
            public final String l = "Server Error - Try Again";

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
        f = scanAndGoEntryActions2;
        ScanAndGoEntryActions scanAndGoEntryActions3 = new ScanAndGoEntryActions() { // from class: com.woolworths.scanlibrary.analytics.tracking.ScanAndGoEntryActions.NETWORK_ERROR
            public final Category k = Category.v;
            public final String l = "Network Error";

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
        g = scanAndGoEntryActions3;
        ScanAndGoEntryActions scanAndGoEntryActions4 = new ScanAndGoEntryActions() { // from class: com.woolworths.scanlibrary.analytics.tracking.ScanAndGoEntryActions.NETWORK_ERROR_TRY_AGAIN
            public final Category k = Category.m;
            public final String l = "Network Error - Try Again";

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
        h = scanAndGoEntryActions4;
        ScanAndGoEntryActions[] scanAndGoEntryActionsArr = {scanAndGoEntryActions, scanAndGoEntryActions2, scanAndGoEntryActions3, scanAndGoEntryActions4};
        i = scanAndGoEntryActionsArr;
        j = EnumEntriesKt.a(scanAndGoEntryActionsArr);
    }

    public ScanAndGoEntryActions(String str, int i2) {
    }

    public static ScanAndGoEntryActions valueOf(String str) {
        return (ScanAndGoEntryActions) Enum.valueOf(ScanAndGoEntryActions.class, str);
    }

    public static ScanAndGoEntryActions[] values() {
        return (ScanAndGoEntryActions[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
