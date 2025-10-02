package com.woolworths.scanlibrary.analytics.medallia;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/analytics/medallia/MedalliaActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class MedalliaActionData implements Action {
    public static final MedalliaActionData e;
    public static final MedalliaActionData f;
    public static final MedalliaActionData g;
    public static final MedalliaActionData h;
    public static final /* synthetic */ MedalliaActionData[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Screens d = Screens.j;

    static {
        MedalliaActionData medalliaActionData = new MedalliaActionData() { // from class: com.woolworths.scanlibrary.analytics.medallia.MedalliaActionData.MEDALLIA_SUBMIT_IMPRESSION
            public final Category k = Category.B;
            public final String l = "formDidSubmit";

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
        e = medalliaActionData;
        MedalliaActionData medalliaActionData2 = new MedalliaActionData() { // from class: com.woolworths.scanlibrary.analytics.medallia.MedalliaActionData.MEDALLIA_DISMISS_IMPRESSION
            public final Category k = Category.B;
            public final String l = "formDidDismiss";

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
        f = medalliaActionData2;
        MedalliaActionData medalliaActionData3 = new MedalliaActionData() { // from class: com.woolworths.scanlibrary.analytics.medallia.MedalliaActionData.MEDALLIA_CLOSE_IMPRESSION
            public final Category k = Category.B;
            public final String l = "formDidClose";

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
        g = medalliaActionData3;
        MedalliaActionData medalliaActionData4 = new MedalliaActionData() { // from class: com.woolworths.scanlibrary.analytics.medallia.MedalliaActionData.MEDALLIA_THANK_YOU_IMPRESSION
            public final Category k = Category.B;
            public final String l = "formDidThankYouPrompt";

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
        h = medalliaActionData4;
        MedalliaActionData[] medalliaActionDataArr = {medalliaActionData, medalliaActionData2, medalliaActionData3, medalliaActionData4};
        i = medalliaActionDataArr;
        j = EnumEntriesKt.a(medalliaActionDataArr);
    }

    public MedalliaActionData(String str, int i2) {
    }

    public static MedalliaActionData valueOf(String str) {
        return (MedalliaActionData) Enum.valueOf(MedalliaActionData.class, str);
    }

    public static MedalliaActionData[] values() {
        return (MedalliaActionData[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
