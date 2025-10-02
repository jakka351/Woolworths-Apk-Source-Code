package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CaptureStatus {
    public static final CaptureStatus d;
    public static final /* synthetic */ CaptureStatus[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        CaptureStatus captureStatus = new CaptureStatus("FOR_SUBTYPING", 0);
        d = captureStatus;
        CaptureStatus[] captureStatusArr = {captureStatus, new CaptureStatus("FOR_INCORPORATION", 1), new CaptureStatus("FROM_EXPRESSION", 2)};
        e = captureStatusArr;
        f = EnumEntriesKt.a(captureStatusArr);
    }

    public static CaptureStatus valueOf(String str) {
        return (CaptureStatus) Enum.valueOf(CaptureStatus.class, str);
    }

    public static CaptureStatus[] values() {
        return (CaptureStatus[]) e.clone();
    }
}
