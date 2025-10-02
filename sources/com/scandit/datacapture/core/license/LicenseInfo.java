package com.scandit.datacapture.core.license;

import com.scandit.datacapture.core.internal.sdk.capture.NativeExpirationDateStatus;
import com.scandit.datacapture.core.internal.sdk.capture.NativeLicenseInfo;
import com.scandit.datacapture.core.license.Expiration;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/license/LicenseInfo;", "", "", "toJson", "Lcom/scandit/datacapture/core/license/Expiration;", "b", "Lcom/scandit/datacapture/core/license/Expiration;", "getExpiration", "()Lcom/scandit/datacapture/core/license/Expiration;", "expiration", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeLicenseInfo;", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeLicenseInfo;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class LicenseInfo {

    /* renamed from: a, reason: collision with root package name */
    private final NativeLicenseInfo f18799a;

    /* renamed from: b, reason: from kotlin metadata */
    private final Expiration expiration;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeExpirationDateStatus.values().length];
            try {
                iArr[NativeExpirationDateStatus.PERPETUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeExpirationDateStatus.AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LicenseInfo(@NotNull NativeLicenseInfo impl) {
        Intrinsics.h(impl, "impl");
        this.f18799a = impl;
        NativeExpirationDateStatus expirationDateStatus = impl.getExpirationDateStatus();
        int i = expirationDateStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[expirationDateStatus.ordinal()];
        this.expiration = i != 1 ? i != 2 ? Expiration.NotAvailable.INSTANCE : new Expiration.Available(new Date(impl.getExpirationDate().secondsSinceEpochUInt64() * 1000)) : Expiration.Perpetual.INSTANCE;
    }

    @NotNull
    public final Expiration getExpiration() {
        return this.expiration;
    }

    @NotNull
    public final String toJson() {
        String json = this.f18799a.toJson();
        Intrinsics.g(json, "impl.toJson()");
        return json;
    }
}
