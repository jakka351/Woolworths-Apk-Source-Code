package com.salesforce.marketingcloud;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MCKeep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0012\b\u0007\u0018\u0000 .2\u00020\u0001:\u0003/01Bu\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 \u0012\b\b\u0002\u0010+\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001d\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001e\u0010\fJ\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 H\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010$\u001a\u00020\u0012H\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010\u0004R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010\bR\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0019\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u001b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u001d\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u001f\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\u001f\u0010\fR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 8\u0007¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b#\u0010\"R\u0017\u0010+\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b+\u0010\f¨\u00062"}, d2 = {"Lcom/salesforce/marketingcloud/InitializationStatus;", "", "Lcom/salesforce/marketingcloud/InitializationStatus$Status;", "-deprecated_status", "()Lcom/salesforce/marketingcloud/InitializationStatus$Status;", "status", "", "-deprecated_unrecoverableException", "()Ljava/lang/Throwable;", "unrecoverableException", "", "-deprecated_locationsError", "()Z", "locationsError", "", "-deprecated_playServicesStatus", "()I", "playServicesStatus", "", "-deprecated_playServicesMessage", "()Ljava/lang/String;", "playServicesMessage", "-deprecated_encryptionChanged", "encryptionChanged", "-deprecated_storageError", "storageError", "-deprecated_proximityError", "proximityError", "-deprecated_messagingPermissionError", "messagingPermissionError", "-deprecated_sslProviderEnablementError", "sslProviderEnablementError", "", "-deprecated_initializedComponents", "()Ljava/util/List;", "initializedComponents", "toString", "Lcom/salesforce/marketingcloud/InitializationStatus$Status;", "Ljava/lang/Throwable;", "Z", "I", "Ljava/lang/String;", "Ljava/util/List;", "isUsable", "<init>", "(Lcom/salesforce/marketingcloud/InitializationStatus$Status;Ljava/lang/Throwable;ZILjava/lang/String;ZZZZZLjava/util/List;Z)V", "Companion", "a", "b", "Status", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class InitializationStatus {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean encryptionChanged;

    @NotNull
    private final List<String> initializedComponents;
    private final boolean isUsable;
    private final boolean locationsError;
    private final boolean messagingPermissionError;

    @Nullable
    private final String playServicesMessage;
    private final int playServicesStatus;
    private final boolean proximityError;
    private final boolean sslProviderEnablementError;

    @NotNull
    private final Status status;
    private final boolean storageError;

    @Nullable
    private final Throwable unrecoverableException;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/InitializationStatus$Status;", "", "(Ljava/lang/String;I)V", "SUCCESS", "COMPLETED_WITH_DEGRADED_FUNCTIONALITY", "FAILED", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status COMPLETED_WITH_DEGRADED_FUNCTIONALITY = new Status("COMPLETED_WITH_DEGRADED_FUNCTIONALITY", 1);
        public static final Status FAILED = new Status("FAILED", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, COMPLETED_WITH_DEGRADED_FUNCTIONALITY, FAILED};
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntriesKt.a(statusArr$values);
        }

        private Status(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    @RestrictTo
    @SourceDebugExtension
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private Throwable f16824a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;

        @Nullable
        private String g;
        private boolean i;
        private int h = -1;

        @NotNull
        private final List<String> j = new ArrayList();

        public final void a(@NotNull d component) {
            Intrinsics.h(component, "component");
            List<String> list = this.j;
            String strComponentName = component.componentName();
            Intrinsics.g(strComponentName, "componentName(...)");
            list.add(strComponentName);
        }

        public final boolean b() {
            return this.f16824a == null;
        }

        public final void c(boolean z) {
            this.e = z;
        }

        public final void d(boolean z) {
            this.i = z;
        }

        public final void e(boolean z) {
            this.f = z;
        }

        public final void f(boolean z) {
            this.d = z;
        }

        public final void a(@Nullable String str) {
            if (str != null) {
                String str2 = this.g;
                if (str2 == null) {
                    this.g = str;
                } else {
                    this.g = androidx.camera.core.impl.b.o(str2, "\n", str);
                }
            }
        }

        public final void b(boolean z) {
            this.b = z;
        }

        @NotNull
        public final InitializationStatus a() {
            Status status = b() ? (this.b || this.d || this.e || this.i || this.f) ? Status.COMPLETED_WITH_DEGRADED_FUNCTIONALITY : Status.SUCCESS : Status.FAILED;
            Throwable th = this.f16824a;
            boolean z = this.b;
            int i = this.h;
            String str = this.g;
            boolean z2 = this.c;
            boolean z3 = this.d;
            boolean z4 = this.i;
            boolean z5 = this.e;
            boolean z6 = this.f;
            String[] strArr = (String[]) this.j.toArray(new String[0]);
            return new InitializationStatus(status, th, z, i, str, z2, z3, z4, z5, z6, CollectionsKt.R(Arrays.copyOf(strArr, strArr.length)), false, 2048, null);
        }

        public final void a(boolean z) {
            this.c = z;
        }

        public final void a(int i) {
            this.h = i;
        }

        public final void a(@NotNull Throwable throwable) {
            Intrinsics.h(throwable, "throwable");
            this.f16824a = throwable;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.InitializationStatus$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @JvmName
        @NotNull
        public final InitializationStatus a() {
            a aVarB = b();
            aVarB.a(new IllegalStateException("Amazon devices are not supported"));
            return aVarB.a();
        }

        @JvmName
        @NotNull
        public final a b() {
            return new a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public InitializationStatus(@NotNull Status status, @Nullable Throwable th, boolean z, int i, @Nullable String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull List<String> initializedComponents, boolean z7) {
        Intrinsics.h(status, "status");
        Intrinsics.h(initializedComponents, "initializedComponents");
        this.status = status;
        this.unrecoverableException = th;
        this.locationsError = z;
        this.playServicesStatus = i;
        this.playServicesMessage = str;
        this.encryptionChanged = z2;
        this.storageError = z3;
        this.proximityError = z4;
        this.messagingPermissionError = z5;
        this.sslProviderEnablementError = z6;
        this.initializedComponents = initializedComponents;
        this.isUsable = z7;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_encryptionChanged, reason: not valid java name and from getter */
    public final boolean getEncryptionChanged() {
        return this.encryptionChanged;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_initializedComponents, reason: not valid java name */
    public final List<String> m56deprecated_initializedComponents() {
        return this.initializedComponents;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_locationsError, reason: not valid java name and from getter */
    public final boolean getLocationsError() {
        return this.locationsError;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_messagingPermissionError, reason: not valid java name and from getter */
    public final boolean getMessagingPermissionError() {
        return this.messagingPermissionError;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_playServicesMessage, reason: not valid java name and from getter */
    public final String getPlayServicesMessage() {
        return this.playServicesMessage;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_playServicesStatus, reason: not valid java name and from getter */
    public final int getPlayServicesStatus() {
        return this.playServicesStatus;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_proximityError, reason: not valid java name and from getter */
    public final boolean getProximityError() {
        return this.proximityError;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_sslProviderEnablementError, reason: not valid java name and from getter */
    public final boolean getSslProviderEnablementError() {
        return this.sslProviderEnablementError;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_status, reason: not valid java name and from getter */
    public final Status getStatus() {
        return this.status;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_storageError, reason: not valid java name and from getter */
    public final boolean getStorageError() {
        return this.storageError;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_unrecoverableException, reason: not valid java name and from getter */
    public final Throwable getUnrecoverableException() {
        return this.unrecoverableException;
    }

    @JvmName
    public final boolean encryptionChanged() {
        return this.encryptionChanged;
    }

    @JvmName
    @NotNull
    public final List<String> initializedComponents() {
        return this.initializedComponents;
    }

    @JvmName
    /* renamed from: isUsable, reason: from getter */
    public final boolean getIsUsable() {
        return this.isUsable;
    }

    @JvmName
    public final boolean locationsError() {
        return this.locationsError;
    }

    @JvmName
    public final boolean messagingPermissionError() {
        return this.messagingPermissionError;
    }

    @JvmName
    @Nullable
    public final String playServicesMessage() {
        return this.playServicesMessage;
    }

    @JvmName
    public final int playServicesStatus() {
        return this.playServicesStatus;
    }

    @JvmName
    public final boolean proximityError() {
        return this.proximityError;
    }

    @JvmName
    public final boolean sslProviderEnablementError() {
        return this.sslProviderEnablementError;
    }

    @JvmName
    @NotNull
    public final Status status() {
        return this.status;
    }

    @JvmName
    public final boolean storageError() {
        return this.storageError;
    }

    @NotNull
    public String toString() {
        Status status = this.status;
        Throwable th = this.unrecoverableException;
        boolean z = this.locationsError;
        int i = this.playServicesStatus;
        String str = this.playServicesMessage;
        boolean z2 = this.encryptionChanged;
        boolean z3 = this.storageError;
        boolean z4 = this.proximityError;
        boolean z5 = this.messagingPermissionError;
        boolean z6 = this.sslProviderEnablementError;
        List<String> list = this.initializedComponents;
        boolean z7 = this.isUsable;
        StringBuilder sb = new StringBuilder("InitializationStatus(status=");
        sb.append(status);
        sb.append(", unrecoverableException=");
        sb.append(th);
        sb.append(", locationsError=");
        sb.append(z);
        sb.append(", playServicesStatus=");
        sb.append(i);
        sb.append(", playServicesMessage=");
        au.com.woolworths.dynamic.page.ui.content.d.A(str, ", encryptionChanged=", ", storageError=", sb, z2);
        au.com.woolworths.android.onesite.a.D(sb, z3, ", proximityError=", z4, ", messagingPermissionError=");
        au.com.woolworths.android.onesite.a.D(sb, z5, ", sslProviderEnablementError=", z6, ", initializedComponents=");
        sb.append(list);
        sb.append(", isUsable=");
        sb.append(z7);
        sb.append(")");
        return sb.toString();
    }

    @JvmName
    @Nullable
    public final Throwable unrecoverableException() {
        return this.unrecoverableException;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InitializationStatus(com.salesforce.marketingcloud.InitializationStatus.Status r15, java.lang.Throwable r16, boolean r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, java.util.List r25, boolean r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r0 = r27
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L25
            com.salesforce.marketingcloud.InitializationStatus$Status r0 = com.salesforce.marketingcloud.InitializationStatus.Status.FAILED
            if (r15 == r0) goto L23
            r0 = 1
        Lb:
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r0
            goto L3d
        L23:
            r0 = 0
            goto Lb
        L25:
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
        L3d:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.InitializationStatus.<init>(com.salesforce.marketingcloud.InitializationStatus$Status, java.lang.Throwable, boolean, int, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
