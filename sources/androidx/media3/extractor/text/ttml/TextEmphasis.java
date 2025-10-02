package androidx.media3.extractor.text.ttml;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.common.collect.ImmutableSet;
import com.scandit.datacapture.core.source.CameraSettings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class TextEmphasis {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final ImmutableSet e = ImmutableSet.o(2, CameraSettings.FOCUS_STRATEGY_AUTO, DevicePublicKeyStringDef.NONE);
    public static final ImmutableSet f = ImmutableSet.x("dot", "sesame", "circle");
    public static final ImmutableSet g = ImmutableSet.o(2, "filled", "open");
    public static final ImmutableSet h = ImmutableSet.x("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f3383a;
    public final int b;
    public final int c;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public TextEmphasis(int i, int i2, int i3) {
        this.f3383a = i;
        this.b = i2;
        this.c = i3;
    }
}
