package androidx.camera.core;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class CameraState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorType {
        public static final /* synthetic */ ErrorType[] d = {new ErrorType("RECOVERABLE", 0), new ErrorType("CRITICAL", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ErrorType EF5;

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) d.clone();
        }
    }

    @AutoValue
    public static abstract class StateError {
        public static StateError a(int i) {
            return new AutoValue_CameraState_StateError(i, null);
        }

        public static StateError b(int i, Throwable th) {
            return new AutoValue_CameraState_StateError(i, th);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final Type h;
        public static final /* synthetic */ Type[] i;

        static {
            Type type = new Type("PENDING_OPEN", 0);
            d = type;
            Type type2 = new Type("OPENING", 1);
            e = type2;
            Type type3 = new Type("OPEN", 2);
            f = type3;
            Type type4 = new Type("CLOSING", 3);
            g = type4;
            Type type5 = new Type("CLOSED", 4);
            h = type5;
            i = new Type[]{type, type2, type3, type4, type5};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) i.clone();
        }
    }

    public static CameraState a(Type type) {
        return new AutoValue_CameraState(type, null);
    }

    public static CameraState b(Type type, StateError stateError) {
        return new AutoValue_CameraState(type, stateError);
    }

    public abstract StateError c();

    public abstract Type d();
}
