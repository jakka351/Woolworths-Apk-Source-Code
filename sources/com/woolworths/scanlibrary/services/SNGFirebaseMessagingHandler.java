package com.woolworths.scanlibrary.services;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.domain.device.DeviceRegistrationUC;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.mesaging.EventAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/services/SNGFirebaseMessagingHandler;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SNGFirebaseMessagingHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21211a;
    public final UserManager b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/services/SNGFirebaseMessagingHandler$Companion;", "", "", "SNG_ORIGINATING_SOURCE", "Ljava/lang/String;", "SNG_PUSH_MESSAGE_SOURCE", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21212a;

        static {
            int[] iArr = new int[EventAction.values().length];
            try {
                EventAction.Companion companion = EventAction.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EventAction.Companion companion2 = EventAction.e;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EventAction.Companion companion3 = EventAction.e;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EventAction.Companion companion4 = EventAction.e;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EventAction.Companion companion5 = EventAction.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EventAction.Companion companion6 = EventAction.e;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f21212a = iArr;
        }
    }

    public SNGFirebaseMessagingHandler(Context mContext, UserManager userManager, SharedPreferences prefs, DeviceRegistrationUC deviceRegistrationUC) {
        Intrinsics.h(mContext, "mContext");
        Intrinsics.h(userManager, "userManager");
        Intrinsics.h(prefs, "prefs");
        this.f21211a = mContext;
        this.b = userManager;
    }
}
