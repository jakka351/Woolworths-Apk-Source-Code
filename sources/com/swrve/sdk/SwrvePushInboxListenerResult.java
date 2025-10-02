package com.swrve.sdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/swrve/sdk/SwrvePushInboxListenerResult;", "", "ResultCode", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwrvePushInboxListenerResult {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/swrve/sdk/SwrvePushInboxListenerResult$ResultCode;", "", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResultCode {
        public static final /* synthetic */ ResultCode[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            ResultCode[] resultCodeArr = {new ResultCode("SUCCESS", 0), new ResultCode("ERROR_UNKNOWN", 1), new ResultCode("ERROR", 2)};
            d = resultCodeArr;
            e = EnumEntriesKt.a(resultCodeArr);
        }

        public static ResultCode valueOf(String str) {
            return (ResultCode) Enum.valueOf(ResultCode.class, str);
        }

        public static ResultCode[] values() {
            return (ResultCode[]) d.clone();
        }
    }

    public SwrvePushInboxListenerResult(String errorMessage) {
        ResultCode[] resultCodeArr = ResultCode.d;
        Intrinsics.h(errorMessage, "errorMessage");
    }
}
