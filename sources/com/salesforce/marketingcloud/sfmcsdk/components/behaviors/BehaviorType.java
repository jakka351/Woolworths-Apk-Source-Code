package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import android.os.Bundle;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.Behavior;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'APPLICATION_BACKGROUNDED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014j\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006 "}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/BehaviorType;", "", "intentFilter", "", "sticky", "", "behaviorTypesToClear", "", "(Ljava/lang/String;ILjava/lang/String;ZLjava/util/List;)V", "getBehaviorTypesToClear$sfmcsdk_release", "()Ljava/util/List;", "setBehaviorTypesToClear$sfmcsdk_release", "(Ljava/util/List;)V", "getIntentFilter$sfmcsdk_release", "()Ljava/lang/String;", "setIntentFilter$sfmcsdk_release", "(Ljava/lang/String;)V", "getSticky$sfmcsdk_release", "()Z", "setSticky$sfmcsdk_release", "(Z)V", "toBehavior", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior;", "data", "Landroid/os/Bundle;", "toBehavior$sfmcsdk_release", "toString", "SCREEN_ENTRY", "APPLICATION_FOREGROUNDED", "APPLICATION_BACKGROUNDED", "APP_VERSION_CHANGED", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BehaviorType {
    private static final /* synthetic */ BehaviorType[] $VALUES;
    public static final BehaviorType APPLICATION_BACKGROUNDED;
    public static final BehaviorType APPLICATION_FOREGROUNDED;
    public static final BehaviorType APP_VERSION_CHANGED;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String INTENT_FILTER_APPLICATION_BACKGROUNDED = "com.salesforce.marketingcloud.sfmcsdk.sdk.APPLICATION_BACKGROUNDED";

    @NotNull
    public static final String INTENT_FILTER_APPLICATION_FOREGROUNDED = "com.salesforce.marketingcloud.sfmcsdk.sdk.APPLICATION_FOREGROUNDED";

    @NotNull
    public static final String INTENT_FILTER_APP_VERSION_CHANGED = "com.salesforce.marketingcloud.sfmcsdk.sdk.APP_VERSION_CHANGED";

    @NotNull
    public static final String INTENT_FILTER_SCREEN_ENTRY = "com.salesforce.marketingcloud.sfmcsdk.sdk.SCREEN_ENTRY";
    public static final BehaviorType SCREEN_ENTRY;

    @Nullable
    private List<? extends BehaviorType> behaviorTypesToClear;

    @NotNull
    private String intentFilter;
    private boolean sticky;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/BehaviorType$Companion;", "", "()V", "INTENT_FILTER_APPLICATION_BACKGROUNDED", "", "INTENT_FILTER_APPLICATION_FOREGROUNDED", "INTENT_FILTER_APP_VERSION_CHANGED", "INTENT_FILTER_SCREEN_ENTRY", "fromString", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/BehaviorType;", "intentFilter", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final BehaviorType fromString(@Nullable String intentFilter) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.d = EmptyList.d;
            if (intentFilter != null) {
                BehaviorType[] behaviorTypeArrValues = BehaviorType.values();
                ArrayList arrayList = new ArrayList();
                for (BehaviorType behaviorType : behaviorTypeArrValues) {
                    if (intentFilter.equals(behaviorType.getIntentFilter())) {
                        arrayList.add(behaviorType);
                    }
                }
                objectRef.d = arrayList;
            }
            if (((Collection) objectRef.d).isEmpty()) {
                return null;
            }
            return (BehaviorType) ((List) objectRef.d).get(0);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BehaviorType[] $values() {
        return new BehaviorType[]{SCREEN_ENTRY, APPLICATION_FOREGROUNDED, APPLICATION_BACKGROUNDED, APP_VERSION_CHANGED};
    }

    static {
        BehaviorType behaviorType = new BehaviorType("SCREEN_ENTRY", 0, INTENT_FILTER_SCREEN_ENTRY, true, null, 4, null);
        SCREEN_ENTRY = behaviorType;
        BehaviorType behaviorType2 = new BehaviorType("APPLICATION_FOREGROUNDED", 1, INTENT_FILTER_APPLICATION_FOREGROUNDED, true, null, 4, null);
        APPLICATION_FOREGROUNDED = behaviorType2;
        APPLICATION_BACKGROUNDED = new BehaviorType("APPLICATION_BACKGROUNDED", 2, INTENT_FILTER_APPLICATION_BACKGROUNDED, false, CollectionsKt.R(behaviorType2, behaviorType), 2, null);
        APP_VERSION_CHANGED = new BehaviorType("APP_VERSION_CHANGED", 3, INTENT_FILTER_APP_VERSION_CHANGED, true, null, 4, null);
        $VALUES = $values();
        INSTANCE = new Companion(null);
    }

    private BehaviorType(String str, int i, String str2, boolean z, List list) {
        this.intentFilter = str2;
        this.sticky = z;
        this.behaviorTypesToClear = list;
    }

    public static BehaviorType valueOf(String str) {
        return (BehaviorType) Enum.valueOf(BehaviorType.class, str);
    }

    public static BehaviorType[] values() {
        return (BehaviorType[]) $VALUES.clone();
    }

    @Nullable
    public final List<BehaviorType> getBehaviorTypesToClear$sfmcsdk_release() {
        return this.behaviorTypesToClear;
    }

    @NotNull
    /* renamed from: getIntentFilter$sfmcsdk_release, reason: from getter */
    public final String getIntentFilter() {
        return this.intentFilter;
    }

    /* renamed from: getSticky$sfmcsdk_release, reason: from getter */
    public final boolean getSticky() {
        return this.sticky;
    }

    public final void setBehaviorTypesToClear$sfmcsdk_release(@Nullable List<? extends BehaviorType> list) {
        this.behaviorTypesToClear = list;
    }

    public final void setIntentFilter$sfmcsdk_release(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.intentFilter = str;
    }

    public final void setSticky$sfmcsdk_release(boolean z) {
        this.sticky = z;
    }

    @Nullable
    public final Behavior toBehavior$sfmcsdk_release(@NotNull Bundle data) {
        String string;
        Intrinsics.h(data, "data");
        long j = data.getLong("timestamp");
        String string2 = data.getString(BehaviorManagerImpl.BUNDLE_KEY_CURRENT_VERSION);
        String string3 = data.getString(BehaviorManagerImpl.BUNDLE_KEY_APP_NAME);
        String str = this.intentFilter;
        switch (str.hashCode()) {
            case -2046669238:
                if (str.equals(INTENT_FILTER_APPLICATION_BACKGROUNDED)) {
                    return new Behavior.AppBackgrounded(j, string2, string3);
                }
                return null;
            case -1610764001:
                if (str.equals(INTENT_FILTER_APPLICATION_FOREGROUNDED)) {
                    return new Behavior.AppForegrounded(j, string2, string3);
                }
                return null;
            case 100058561:
                if (str.equals(INTENT_FILTER_APP_VERSION_CHANGED)) {
                    return new Behavior.AppVersionChanged(j, string2, string3, data.getString(BehaviorManagerImpl.BUNDLE_KEY_PREVIOUS_VERSION));
                }
                return null;
            case 518948109:
                if (str.equals(INTENT_FILTER_SCREEN_ENTRY) && (string = data.getString(Behavior.ScreenEntry.KEY_NAME)) != null) {
                    return new Behavior.ScreenEntry(string, j, string2, string3);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.intentFilter;
    }

    public /* synthetic */ BehaviorType(String str, int i, String str2, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : list);
    }
}
