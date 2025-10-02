package au.com.woolworths.foundation.ui.fullpagemessage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.ThemeContext;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessageSpec;", "", "Companion", "fullpagemessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FullPageMessageSpec {

    /* renamed from: a, reason: collision with root package name */
    public final Painter f8917a;
    public final Color b;
    public final String c;
    public final String d;
    public final String e;
    public final Function0 f;
    public final String g;
    public final Function0 h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessageSpec$Companion;", "", "fullpagemessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[ThemeContext.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ThemeContext themeContext = ThemeContext.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public static FullPageMessageSpec a(FullPageMessage.Error error, String str, String str2, Function0 function0, Composer composer, int i, int i2) {
            FullPageMessageSpec fullPageMessageSpecF;
            Intrinsics.h(error, "error");
            composer.o(204050580);
            boolean z = (i2 & 2) != 0;
            String strC = (i2 & 8) != 0 ? StringResources_androidKt.c(composer, com.woolworths.R.string.default_connection_error_description) : str;
            String strC2 = (i2 & 16) != 0 ? StringResources_androidKt.c(composer, com.woolworths.R.string.default_server_error_description) : str2;
            if (error.equals(FullPageMessage.Error.ConnectionError.f8915a)) {
                composer.o(-1475869629);
                if (z) {
                    composer.o(1492687618);
                    fullPageMessageSpecF = c(null, null, strC, null, function0, composer, 21);
                    composer.l();
                } else {
                    composer.o(1492928736);
                    fullPageMessageSpecF = c(null, null, strC, null, function0, composer, 20);
                    composer.l();
                }
                composer.l();
            } else {
                if (!error.equals(FullPageMessage.Error.ServerError.f8916a)) {
                    throw a.x(composer, -1475871165);
                }
                composer.o(-1475851149);
                if (z) {
                    composer.o(1493260746);
                    fullPageMessageSpecF = f(null, null, null, strC2, null, function0, composer, 21);
                    composer.l();
                } else {
                    composer.o(1493493928);
                    fullPageMessageSpecF = f(null, null, null, strC2, null, function0, composer, 20);
                    composer.l();
                }
                composer.l();
            }
            composer.l();
            return fullPageMessageSpecF;
        }

        public static FullPageMessageSpec b(ColorPainter colorPainter, Function0 onPrimaryButtonClick, Function0 onSecondaryButtonClick) {
            Intrinsics.h(onPrimaryButtonClick, "onPrimaryButtonClick");
            Intrinsics.h(onSecondaryButtonClick, "onSecondaryButtonClick");
            return new FullPageMessageSpec(colorPainter, null, "Location services are disabled", "Turn location ON in device settings to see Pick up locations nearby.", "Go To Settings", onPrimaryButtonClick, "Search Pick Up Locations", onSecondaryButtonClick);
        }

        public static FullPageMessageSpec c(Painter painter, String str, String str2, String str3, Function0 function0, Composer composer, int i) {
            int i2;
            int i3;
            composer.o(1942297886);
            if ((i & 1) != 0) {
                int iOrdinal = ((ThemeContext) composer.x(CoreThemeKt.f4773a)).ordinal();
                if (iOrdinal == 0) {
                    i3 = com.woolworths.R.drawable.ic_shop_connection_error;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = com.woolworths.R.drawable.ic_rewards_connection_error;
                }
                painter = PainterResources_androidKt.a(i3, 0, composer);
            }
            Painter painter2 = painter;
            if ((i & 4) != 0) {
                int iOrdinal2 = ((ThemeContext) composer.x(CoreThemeKt.f4773a)).ordinal();
                if (iOrdinal2 == 0) {
                    i2 = com.woolworths.R.string.default_connection_error_title_shop;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = com.woolworths.R.string.default_connection_error_title_rewards;
                }
                str = StringResources_androidKt.c(composer, i2);
            }
            String str4 = str;
            if ((i & 8) != 0) {
                str2 = StringResources_androidKt.c(composer, com.woolworths.R.string.default_connection_error_description);
            }
            String str5 = str2;
            if ((i & 16) != 0) {
                str3 = StringResources_androidKt.c(composer, com.woolworths.R.string.try_again);
            }
            FullPageMessageSpec fullPageMessageSpec = new FullPageMessageSpec(painter2, null, str4, str5, null, null, str3, function0);
            composer.l();
            return fullPageMessageSpec;
        }

        public static FullPageMessageSpec d(Painter painter, String str, String message, String buttonText, Function0 onButtonClick) {
            Intrinsics.h(message, "message");
            Intrinsics.h(buttonText, "buttonText");
            Intrinsics.h(onButtonClick, "onButtonClick");
            return new FullPageMessageSpec(painter, null, str, message, buttonText, onButtonClick, null, null);
        }

        public static FullPageMessageSpec e(Painter painter, String str, String message, String buttonText, Function0 onButtonClick) {
            Intrinsics.h(message, "message");
            Intrinsics.h(buttonText, "buttonText");
            Intrinsics.h(onButtonClick, "onButtonClick");
            return new FullPageMessageSpec(painter, null, str, message, null, null, buttonText, onButtonClick);
        }

        public static FullPageMessageSpec f(Painter painter, Color color, String str, String str2, String str3, Function0 function0, Composer composer, int i) {
            int i2;
            composer.o(-1185697917);
            if ((i & 1) != 0) {
                int iOrdinal = ((ThemeContext) composer.x(CoreThemeKt.f4773a)).ordinal();
                if (iOrdinal == 0) {
                    i2 = com.woolworths.R.drawable.ic_shop_server_error;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = com.woolworths.R.drawable.ic_rewards_server_error;
                }
                painter = PainterResources_androidKt.a(i2, 0, composer);
            }
            Painter painter2 = painter;
            if ((i & 2) != 0) {
                color = null;
            }
            Color color2 = color;
            if ((i & 4) != 0) {
                str = StringResources_androidKt.c(composer, com.woolworths.R.string.default_server_error_title);
            }
            String str4 = str;
            if ((i & 8) != 0) {
                str2 = StringResources_androidKt.c(composer, com.woolworths.R.string.default_server_error_description);
            }
            String str5 = str2;
            if ((i & 16) != 0) {
                str3 = StringResources_androidKt.c(composer, com.woolworths.R.string.try_again);
            }
            FullPageMessageSpec fullPageMessageSpec = new FullPageMessageSpec(painter2, color2, str4, str5, null, null, str3, function0);
            composer.l();
            return fullPageMessageSpec;
        }

        public static FullPageMessageSpec g(Painter painter, String str, String message) {
            Intrinsics.h(message, "message");
            return new FullPageMessageSpec(painter, null, str, message, null, null, null, null);
        }
    }

    public FullPageMessageSpec(Painter painter, Color color, String str, String str2, String str3, Function0 function0, String str4, Function0 function02) {
        this.f8917a = painter;
        this.b = color;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = function0;
        this.g = str4;
        this.h = function02;
    }
}
