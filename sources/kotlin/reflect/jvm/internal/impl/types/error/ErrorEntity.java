package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ErrorEntity {
    public static final /* synthetic */ ErrorEntity[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ErrorEntity[] errorEntityArr = {new ErrorEntity("ERROR_CLASS", 0), new ErrorEntity("ERROR_FUNCTION", 1), new ErrorEntity("ERROR_SCOPE", 2), new ErrorEntity("ERROR_MODULE", 3), new ErrorEntity("ERROR_PROPERTY", 4), new ErrorEntity("ERROR_TYPE", 5), new ErrorEntity("PARENT_OF_ERROR_SCOPE", 6)};
        d = errorEntityArr;
        e = EnumEntriesKt.a(errorEntityArr);
    }

    public static ErrorEntity valueOf(String str) {
        return (ErrorEntity) Enum.valueOf(ErrorEntity.class, str);
    }

    public static ErrorEntity[] values() {
        return (ErrorEntity[]) d.clone();
    }
}
