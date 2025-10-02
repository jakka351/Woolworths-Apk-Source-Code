package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class CameraCaptureMetaData {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AeMode {
        public static final AeMode d;
        public static final AeMode e;
        public static final AeMode f;
        public static final AeMode g;
        public static final AeMode h;
        public static final AeMode i;
        public static final AeMode j;
        public static final /* synthetic */ AeMode[] k;

        static {
            AeMode aeMode = new AeMode("UNKNOWN", 0);
            d = aeMode;
            AeMode aeMode2 = new AeMode("OFF", 1);
            e = aeMode2;
            AeMode aeMode3 = new AeMode("ON", 2);
            f = aeMode3;
            AeMode aeMode4 = new AeMode("ON_AUTO_FLASH", 3);
            g = aeMode4;
            AeMode aeMode5 = new AeMode("ON_ALWAYS_FLASH", 4);
            h = aeMode5;
            AeMode aeMode6 = new AeMode("ON_AUTO_FLASH_REDEYE", 5);
            i = aeMode6;
            AeMode aeMode7 = new AeMode("ON_EXTERNAL_FLASH", 6);
            j = aeMode7;
            k = new AeMode[]{aeMode, aeMode2, aeMode3, aeMode4, aeMode5, aeMode6, aeMode7};
        }

        public static AeMode valueOf(String str) {
            return (AeMode) Enum.valueOf(AeMode.class, str);
        }

        public static AeMode[] values() {
            return (AeMode[]) k.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AeState {
        public static final AeState d;
        public static final AeState e;
        public static final AeState f;
        public static final AeState g;
        public static final AeState h;
        public static final AeState i;
        public static final /* synthetic */ AeState[] j;

        static {
            AeState aeState = new AeState("UNKNOWN", 0);
            d = aeState;
            AeState aeState2 = new AeState("INACTIVE", 1);
            e = aeState2;
            AeState aeState3 = new AeState("SEARCHING", 2);
            f = aeState3;
            AeState aeState4 = new AeState("FLASH_REQUIRED", 3);
            g = aeState4;
            AeState aeState5 = new AeState("CONVERGED", 4);
            h = aeState5;
            AeState aeState6 = new AeState("LOCKED", 5);
            i = aeState6;
            j = new AeState[]{aeState, aeState2, aeState3, aeState4, aeState5, aeState6};
        }

        public static AeState valueOf(String str) {
            return (AeState) Enum.valueOf(AeState.class, str);
        }

        public static AeState[] values() {
            return (AeState[]) j.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AfMode {
        public static final AfMode d;
        public static final AfMode e;
        public static final AfMode f;
        public static final AfMode g;
        public static final /* synthetic */ AfMode[] h;

        static {
            AfMode afMode = new AfMode("UNKNOWN", 0);
            d = afMode;
            AfMode afMode2 = new AfMode("OFF", 1);
            e = afMode2;
            AfMode afMode3 = new AfMode("ON_MANUAL_AUTO", 2);
            f = afMode3;
            AfMode afMode4 = new AfMode("ON_CONTINUOUS_AUTO", 3);
            g = afMode4;
            h = new AfMode[]{afMode, afMode2, afMode3, afMode4};
        }

        public static AfMode valueOf(String str) {
            return (AfMode) Enum.valueOf(AfMode.class, str);
        }

        public static AfMode[] values() {
            return (AfMode[]) h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AfState {
        public static final AfState d;
        public static final AfState e;
        public static final AfState f;
        public static final AfState g;
        public static final AfState h;
        public static final AfState i;
        public static final AfState j;
        public static final /* synthetic */ AfState[] k;

        static {
            AfState afState = new AfState("UNKNOWN", 0);
            d = afState;
            AfState afState2 = new AfState("INACTIVE", 1);
            e = afState2;
            AfState afState3 = new AfState("SCANNING", 2);
            f = afState3;
            AfState afState4 = new AfState("PASSIVE_FOCUSED", 3);
            g = afState4;
            AfState afState5 = new AfState("PASSIVE_NOT_FOCUSED", 4);
            h = afState5;
            AfState afState6 = new AfState("LOCKED_FOCUSED", 5);
            i = afState6;
            AfState afState7 = new AfState("LOCKED_NOT_FOCUSED", 6);
            j = afState7;
            k = new AfState[]{afState, afState2, afState3, afState4, afState5, afState6, afState7};
        }

        public static AfState valueOf(String str) {
            return (AfState) Enum.valueOf(AfState.class, str);
        }

        public static AfState[] values() {
            return (AfState[]) k.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AwbMode {
        public static final AwbMode d;
        public static final AwbMode e;
        public static final AwbMode f;
        public static final AwbMode g;
        public static final AwbMode h;
        public static final AwbMode i;
        public static final AwbMode j;
        public static final AwbMode k;
        public static final AwbMode l;
        public static final AwbMode m;
        public static final /* synthetic */ AwbMode[] n;

        static {
            AwbMode awbMode = new AwbMode("UNKNOWN", 0);
            d = awbMode;
            AwbMode awbMode2 = new AwbMode("OFF", 1);
            e = awbMode2;
            AwbMode awbMode3 = new AwbMode("AUTO", 2);
            f = awbMode3;
            AwbMode awbMode4 = new AwbMode("INCANDESCENT", 3);
            g = awbMode4;
            AwbMode awbMode5 = new AwbMode("FLUORESCENT", 4);
            h = awbMode5;
            AwbMode awbMode6 = new AwbMode("WARM_FLUORESCENT", 5);
            i = awbMode6;
            AwbMode awbMode7 = new AwbMode("DAYLIGHT", 6);
            j = awbMode7;
            AwbMode awbMode8 = new AwbMode("CLOUDY_DAYLIGHT", 7);
            k = awbMode8;
            AwbMode awbMode9 = new AwbMode("TWILIGHT", 8);
            l = awbMode9;
            AwbMode awbMode10 = new AwbMode("SHADE", 9);
            m = awbMode10;
            n = new AwbMode[]{awbMode, awbMode2, awbMode3, awbMode4, awbMode5, awbMode6, awbMode7, awbMode8, awbMode9, awbMode10};
        }

        public static AwbMode valueOf(String str) {
            return (AwbMode) Enum.valueOf(AwbMode.class, str);
        }

        public static AwbMode[] values() {
            return (AwbMode[]) n.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AwbState {
        public static final AwbState d;
        public static final AwbState e;
        public static final AwbState f;
        public static final AwbState g;
        public static final AwbState h;
        public static final /* synthetic */ AwbState[] i;

        static {
            AwbState awbState = new AwbState("UNKNOWN", 0);
            d = awbState;
            AwbState awbState2 = new AwbState("INACTIVE", 1);
            e = awbState2;
            AwbState awbState3 = new AwbState("METERING", 2);
            f = awbState3;
            AwbState awbState4 = new AwbState("CONVERGED", 3);
            g = awbState4;
            AwbState awbState5 = new AwbState("LOCKED", 4);
            h = awbState5;
            i = new AwbState[]{awbState, awbState2, awbState3, awbState4, awbState5};
        }

        public static AwbState valueOf(String str) {
            return (AwbState) Enum.valueOf(AwbState.class, str);
        }

        public static AwbState[] values() {
            return (AwbState[]) i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FlashState {
        public static final FlashState d;
        public static final FlashState e;
        public static final FlashState f;
        public static final FlashState g;
        public static final /* synthetic */ FlashState[] h;

        static {
            FlashState flashState = new FlashState("UNKNOWN", 0);
            d = flashState;
            FlashState flashState2 = new FlashState("NONE", 1);
            e = flashState2;
            FlashState flashState3 = new FlashState("READY", 2);
            f = flashState3;
            FlashState flashState4 = new FlashState("FIRED", 3);
            g = flashState4;
            h = new FlashState[]{flashState, flashState2, flashState3, flashState4};
        }

        public static FlashState valueOf(String str) {
            return (FlashState) Enum.valueOf(FlashState.class, str);
        }

        public static FlashState[] values() {
            return (FlashState[]) h.clone();
        }
    }
}
