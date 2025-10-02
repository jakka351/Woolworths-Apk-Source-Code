package me.oriient.ipssdk.base.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/base/utils/SdkError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "EngineLibrariesUnavailable", "General", "Lme/oriient/ipssdk/base/utils/SdkError$EngineLibrariesUnavailable;", "Lme/oriient/ipssdk/base/utils/SdkError$General;", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SdkError extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/ipssdk/base/utils/SdkError$EngineLibrariesUnavailable;", "Lme/oriient/ipssdk/base/utils/SdkError;", "()V", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EngineLibrariesUnavailable extends SdkError {
        public EngineLibrariesUnavailable() {
            super("Missing engine dependencies", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/ipssdk/base/utils/SdkError$General;", "Lme/oriient/ipssdk/base/utils/SdkError;", "message", "", "(Ljava/lang/String;)V", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class General extends SdkError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public General(@NotNull String message) {
            super(message, null);
            Intrinsics.h(message, "message");
        }
    }

    public SdkError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
    }
}
