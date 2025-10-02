package com.woolworths.scanlibrary.ui.payment.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/analytics/AddPaymentTracking;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AddPaymentTracking implements Action {
    public static final AddPaymentTracking d;
    public static final AddPaymentTracking e;
    public static final /* synthetic */ AddPaymentTracking[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        AddPaymentTracking addPaymentTracking = new AddPaymentTracking() { // from class: com.woolworths.scanlibrary.ui.payment.analytics.AddPaymentTracking.ADD_SECURE_PAYMENT_CLICK
            public final Category h = Category.D;
            public final String i = "Add a payment method";
            public final Screens j = Screens.f;

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

            @Override // au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f */
            public final Screen getD() {
                return this.j;
            }
        };
        d = addPaymentTracking;
        AddPaymentTracking addPaymentTracking2 = new AddPaymentTracking() { // from class: com.woolworths.scanlibrary.ui.payment.analytics.AddPaymentTracking.ADD_PAYMENT_CLICK
            public final Category h = Category.m;
            public final String i = "Add Card";
            public final Screens j = Screens.e;

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

            @Override // au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f */
            public final Screen getD() {
                return this.j;
            }
        };
        e = addPaymentTracking2;
        AddPaymentTracking[] addPaymentTrackingArr = {addPaymentTracking, addPaymentTracking2};
        f = addPaymentTrackingArr;
        g = EnumEntriesKt.a(addPaymentTrackingArr);
    }

    public static AddPaymentTracking valueOf(String str) {
        return (AddPaymentTracking) Enum.valueOf(AddPaymentTracking.class, str);
    }

    public static AddPaymentTracking[] values() {
        return (AddPaymentTracking[]) f.clone();
    }
}
