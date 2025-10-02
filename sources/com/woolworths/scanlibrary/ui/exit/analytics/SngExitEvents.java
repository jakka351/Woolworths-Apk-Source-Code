package com.woolworths.scanlibrary.ui.exit.analytics;

import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.analytics.tracking.SngEvent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/analytics/SngExitEvents;", "Lcom/woolworths/scanlibrary/analytics/tracking/SngEvent;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SngExitEvents implements SngEvent {
    public static final SngExitEvents d;
    public static final SngExitEvents e;
    public static final /* synthetic */ SngExitEvents[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        SngExitEvents sngExitEvents = new SngExitEvents() { // from class: com.woolworths.scanlibrary.ui.exit.analytics.SngExitEvents.EXIT_SUCCESSFUL_PAYMENT
            public final Screen h;
            public final String i;
            public final Category j;
            public final String k;

            {
                Screens screens = Screens.h;
                this.h = screens;
                this.i = "S&G payment successful";
                this.j = Category.B;
                this.k = screens.b();
            }

            @Override // com.woolworths.scanlibrary.analytics.tracking.SngEvent
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.i;
            }

            @Override // com.woolworths.scanlibrary.analytics.tracking.SngEvent
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // com.woolworths.scanlibrary.analytics.tracking.SngEvent
            /* renamed from: f, reason: from getter */
            public final Screen getH() {
                return this.h;
            }
        };
        d = sngExitEvents;
        SngExitEvents sngExitEvents2 = new SngExitEvents() { // from class: com.woolworths.scanlibrary.ui.exit.analytics.SngExitEvents.EXIT_PENDING_PAYMENT
            public final Screen h;
            public final String i;
            public final Category j;
            public final String k;

            {
                Screens screens = Screens.h;
                this.h = screens;
                this.i = "S&G payment pending";
                this.j = Category.B;
                this.k = screens.b();
            }

            @Override // com.woolworths.scanlibrary.analytics.tracking.SngEvent
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.i;
            }

            @Override // com.woolworths.scanlibrary.analytics.tracking.SngEvent
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // com.woolworths.scanlibrary.analytics.tracking.SngEvent
            /* renamed from: f, reason: from getter */
            public final Screen getH() {
                return this.h;
            }
        };
        e = sngExitEvents2;
        SngExitEvents[] sngExitEventsArr = {sngExitEvents, sngExitEvents2};
        f = sngExitEventsArr;
        g = EnumEntriesKt.a(sngExitEventsArr);
    }

    public static SngExitEvents valueOf(String str) {
        return (SngExitEvents) Enum.valueOf(SngExitEvents.class, str);
    }

    public static SngExitEvents[] values() {
        return (SngExitEvents[]) f.clone();
    }
}
