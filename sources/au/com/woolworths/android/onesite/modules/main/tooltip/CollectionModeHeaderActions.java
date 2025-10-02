package au.com.woolworths.android.onesite.modules.main.tooltip;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/tooltip/CollectionModeHeaderActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CollectionModeHeaderActions implements Action {
    public static final CollectionModeHeaderActions e;
    public static final /* synthetic */ CollectionModeHeaderActions[] f;
    public static final /* synthetic */ EnumEntries g;
    public Screen d;

    static {
        CollectionModeHeaderActions collectionModeHeaderActions = new CollectionModeHeaderActions() { // from class: au.com.woolworths.android.onesite.modules.main.tooltip.CollectionModeHeaderActions.CHANGE_CLICK
            public final Category h = Category.m;
            public final String i = "Change Shopping Mode";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.h;
            }
        };
        e = collectionModeHeaderActions;
        CollectionModeHeaderActions[] collectionModeHeaderActionsArr = {collectionModeHeaderActions, new CollectionModeHeaderActions() { // from class: au.com.woolworths.android.onesite.modules.main.tooltip.CollectionModeHeaderActions.HEADER_IMPRESSION
            public final Category h = Category.B;
            public final String i = "Change shopping mode impression";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getO() {
                return this.h;
            }
        }};
        f = collectionModeHeaderActionsArr;
        g = EnumEntriesKt.a(collectionModeHeaderActionsArr);
    }

    public static CollectionModeHeaderActions valueOf(String str) {
        return (CollectionModeHeaderActions) Enum.valueOf(CollectionModeHeaderActions.class, str);
    }

    public static CollectionModeHeaderActions[] values() {
        return (CollectionModeHeaderActions[]) f.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        Screen screen = this.d;
        if (screen != null) {
            return screen;
        }
        Intrinsics.p("screen");
        throw null;
    }
}
