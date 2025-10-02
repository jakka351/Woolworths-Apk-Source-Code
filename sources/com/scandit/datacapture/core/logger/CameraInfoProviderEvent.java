package com.scandit.datacapture.core.logger;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006!"}, d2 = {"Lcom/scandit/datacapture/core/logger/CameraInfoProviderEvent;", "Lcom/scandit/datacapture/core/logger/Event;", "", "component1", "component2", "", "component3", "component4", "api", "numCameras", "exceptionDescription", "extraInfo", "copy", "toString", "hashCode", "", "other", "", "equals", "b", "I", "getApi", "()I", "c", "getNumCameras", "d", "Ljava/lang/String;", "getExceptionDescription", "()Ljava/lang/String;", "e", "getExtraInfo", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class CameraInfoProviderEvent extends Event {

    /* renamed from: b, reason: from kotlin metadata */
    private final int api;

    /* renamed from: c, reason: from kotlin metadata */
    private final int numCameras;

    /* renamed from: d, reason: from kotlin metadata */
    private final String exceptionDescription;

    /* renamed from: e, reason: from kotlin metadata */
    private final String extraInfo;

    public /* synthetic */ CameraInfoProviderEvent(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ CameraInfoProviderEvent copy$default(CameraInfoProviderEvent cameraInfoProviderEvent, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cameraInfoProviderEvent.api;
        }
        if ((i3 & 2) != 0) {
            i2 = cameraInfoProviderEvent.numCameras;
        }
        if ((i3 & 4) != 0) {
            str = cameraInfoProviderEvent.exceptionDescription;
        }
        if ((i3 & 8) != 0) {
            str2 = cameraInfoProviderEvent.extraInfo;
        }
        return cameraInfoProviderEvent.copy(i, i2, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getApi() {
        return this.api;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumCameras() {
        return this.numCameras;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getExceptionDescription() {
        return this.exceptionDescription;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getExtraInfo() {
        return this.extraInfo;
    }

    @NotNull
    public final CameraInfoProviderEvent copy(int api, int numCameras, @NotNull String exceptionDescription, @Nullable String extraInfo) {
        Intrinsics.h(exceptionDescription, "exceptionDescription");
        return new CameraInfoProviderEvent(api, numCameras, exceptionDescription, extraInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraInfoProviderEvent)) {
            return false;
        }
        CameraInfoProviderEvent cameraInfoProviderEvent = (CameraInfoProviderEvent) other;
        return this.api == cameraInfoProviderEvent.api && this.numCameras == cameraInfoProviderEvent.numCameras && Intrinsics.c(this.exceptionDescription, cameraInfoProviderEvent.exceptionDescription) && Intrinsics.c(this.extraInfo, cameraInfoProviderEvent.extraInfo);
    }

    public final int getApi() {
        return this.api;
    }

    @NotNull
    public final String getExceptionDescription() {
        return this.exceptionDescription;
    }

    @Nullable
    public final String getExtraInfo() {
        return this.extraInfo;
    }

    public final int getNumCameras() {
        return this.numCameras;
    }

    public int hashCode() {
        int iC = b.c(b.a(this.numCameras, Integer.hashCode(this.api) * 31, 31), 31, this.exceptionDescription);
        String str = this.extraInfo;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CameraInfoProviderEvent(api=");
        sb.append(this.api);
        sb.append(", numCameras=");
        sb.append(this.numCameras);
        sb.append(", exceptionDescription=");
        sb.append(this.exceptionDescription);
        sb.append(", extraInfo=");
        return b.r(sb, this.extraInfo, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraInfoProviderEvent(int i, int i2, @NotNull String exceptionDescription, @Nullable String str) {
        super(null);
        Intrinsics.h(exceptionDescription, "exceptionDescription");
        this.api = i;
        this.numCameras = i2;
        this.exceptionDescription = exceptionDescription;
        this.extraInfo = str;
    }
}
