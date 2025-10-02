package androidx.constraintlayout.core.dsl;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class OnSwipe {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Boundary {
        public static final /* synthetic */ Boundary[] d = {new Boundary("OVERSHOOT", 0), new Boundary("BOUNCE_START", 1), new Boundary("BOUNCE_END", 2), new Boundary("BOUNCE_BOTH", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Boundary EF5;

        public static Boundary valueOf(String str) {
            return (Boundary) Enum.valueOf(Boundary.class, str);
        }

        public static Boundary[] values() {
            return (Boundary[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Drag {
        public static final /* synthetic */ Drag[] d = {new Drag("UP", 0), new Drag("DOWN", 1), new Drag("LEFT", 2), new Drag("RIGHT", 3), new Drag("START", 4), new Drag("END", 5), new Drag("CLOCKWISE", 6), new Drag("ANTICLOCKWISE", 7)};

        /* JADX INFO: Fake field, exist only in values array */
        Drag EF5;

        public static Drag valueOf(String str) {
            return (Drag) Enum.valueOf(Drag.class, str);
        }

        public static Drag[] values() {
            return (Drag[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        public static final /* synthetic */ Mode[] d = {new Mode("VELOCITY", 0), new Mode("SPRING", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Mode EF5;

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Side {
        public static final /* synthetic */ Side[] d = {new Side("TOP", 0), new Side("LEFT", 1), new Side("RIGHT", 2), new Side("BOTTOM", 3), new Side("MIDDLE", 4), new Side("START", 5), new Side("END", 6)};

        /* JADX INFO: Fake field, exist only in values array */
        Side EF5;

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TouchUp {
        public static final /* synthetic */ TouchUp[] d = {new TouchUp("AUTOCOMPLETE", 0), new TouchUp("TO_START", 1), new TouchUp("NEVER_COMPLETE_END", 2), new TouchUp("TO_END", 3), new TouchUp("STOP", 4), new TouchUp("DECELERATE", 5), new TouchUp("DECELERATE_COMPLETE", 6), new TouchUp("NEVER_COMPLETE_START", 7)};

        /* JADX INFO: Fake field, exist only in values array */
        TouchUp EF5;

        public static TouchUp valueOf(String str) {
            return (TouchUp) Enum.valueOf(TouchUp.class, str);
        }

        public static TouchUp[] values() {
            return (TouchUp[]) d.clone();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnSwipe:{\n");
        if (!Float.isNaN(BitmapDescriptorFactory.HUE_RED)) {
            sb.append("scale:'0.0',\n");
        }
        if (!Float.isNaN(BitmapDescriptorFactory.HUE_RED)) {
            sb.append("threshold:'0.0',\n");
        }
        if (!Float.isNaN(BitmapDescriptorFactory.HUE_RED)) {
            sb.append("maxVelocity:'0.0',\n");
        }
        if (!Float.isNaN(BitmapDescriptorFactory.HUE_RED)) {
            sb.append("maxAccel:'0.0',\n");
        }
        if (!Float.isNaN(BitmapDescriptorFactory.HUE_RED)) {
            sb.append("springMass:'0.0',\n");
        }
        if (!Float.isNaN(BitmapDescriptorFactory.HUE_RED)) {
            sb.append("springStiffness:'0.0',\n");
        }
        if (!Float.isNaN(BitmapDescriptorFactory.HUE_RED)) {
            sb.append("springDamping:'0.0',\n");
        }
        if (!Float.isNaN(BitmapDescriptorFactory.HUE_RED)) {
            sb.append("stopThreshold:'0.0',\n");
        }
        sb.append("},\n");
        return sb.toString();
    }
}
