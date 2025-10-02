package au.com.woolworths.design.core.ui.foundation.typography;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens;", "", "Body", "Caption", "Display", "Headline", "Title", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTypographyTokens {

    /* renamed from: a, reason: collision with root package name */
    public final Body f5120a;
    public final Caption b;
    public final Display c;
    public final Headline d;
    public final Title e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Body;", "", "Lg", "Md", "Sm", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Immutable
    public static final class Body {

        /* renamed from: a, reason: collision with root package name */
        public final Lg f5121a;
        public final Md b;
        public final Sm c;

        @Immutable
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Body$Lg;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Lg {

            /* renamed from: a, reason: collision with root package name */
            public final TextStyle f5122a;
            public final TextStyle b;
            public final TextStyle c;

            public Lg(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3) {
                this.f5122a = textStyle;
                this.b = textStyle2;
                this.c = textStyle3;
            }
        }

        @Immutable
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Body$Md;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Md {

            /* renamed from: a, reason: collision with root package name */
            public final TextStyle f5123a;
            public final TextStyle b;
            public final TextStyle c;

            public Md(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3) {
                this.f5123a = textStyle;
                this.b = textStyle2;
                this.c = textStyle3;
            }
        }

        @Immutable
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Body$Sm;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Sm {

            /* renamed from: a, reason: collision with root package name */
            public final TextStyle f5124a;
            public final TextStyle b;
            public final TextStyle c;

            public Sm(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3) {
                this.f5124a = textStyle;
                this.b = textStyle2;
                this.c = textStyle3;
            }
        }

        public Body(Lg lg, Md md, Sm sm) {
            this.f5121a = lg;
            this.b = md;
            this.c = sm;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Caption;", "", "Sm", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Immutable
    public static final class Caption {

        /* renamed from: a, reason: collision with root package name */
        public final Sm f5125a;

        @Immutable
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Caption$Sm;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Sm {

            /* renamed from: a, reason: collision with root package name */
            public final TextStyle f5126a;
            public final TextStyle b;

            public Sm(TextStyle textStyle, TextStyle textStyle2) {
                this.f5126a = textStyle;
                this.b = textStyle2;
            }
        }

        public Caption(Sm sm) {
            this.f5125a = sm;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Display;", "", "Lg", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Immutable
    public static final class Display {

        /* renamed from: a, reason: collision with root package name */
        public final Lg f5127a;

        @Immutable
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Display$Lg;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Lg {

            /* renamed from: a, reason: collision with root package name */
            public final TextStyle f5128a;

            public Lg(TextStyle textStyle) {
                this.f5128a = textStyle;
            }
        }

        public Display(Lg lg) {
            this.f5127a = lg;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Headline;", "", "Lg", "Md", "Sm", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Immutable
    public static final class Headline {

        /* renamed from: a, reason: collision with root package name */
        public final Lg f5129a;
        public final Md b;
        public final Sm c;

        @Immutable
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Headline$Lg;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Lg {

            /* renamed from: a, reason: collision with root package name */
            public final TextStyle f5130a;
            public final TextStyle b;
            public final TextStyle c;

            public Lg(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4) {
                this.f5130a = textStyle;
                this.b = textStyle2;
                this.c = textStyle4;
            }
        }

        @Immutable
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Headline$Md;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Md {

            /* renamed from: a, reason: collision with root package name */
            public final TextStyle f5131a;
            public final TextStyle b;
            public final TextStyle c;
            public final TextStyle d;

            public Md(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4) {
                this.f5131a = textStyle;
                this.b = textStyle2;
                this.c = textStyle3;
                this.d = textStyle4;
            }
        }

        @Immutable
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Headline$Sm;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Sm {

            /* renamed from: a, reason: collision with root package name */
            public final TextStyle f5132a;
            public final TextStyle b;
            public final TextStyle c;
            public final TextStyle d;

            public Sm(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4) {
                this.f5132a = textStyle;
                this.b = textStyle2;
                this.c = textStyle3;
                this.d = textStyle4;
            }
        }

        public Headline(Lg lg, Md md, Sm sm) {
            this.f5129a = lg;
            this.b = md;
            this.c = sm;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Title;", "", "Md", "Sm", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Immutable
    public static final class Title {

        /* renamed from: a, reason: collision with root package name */
        public final Md f5133a;
        public final Sm b;

        @Immutable
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Title$Md;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Md {

            /* renamed from: a, reason: collision with root package name */
            public final TextStyle f5134a;
            public final TextStyle b;

            public Md(TextStyle textStyle, TextStyle textStyle2) {
                this.f5134a = textStyle;
                this.b = textStyle2;
            }
        }

        @Immutable
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/CoreTypographyTokens$Title$Sm;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Sm {

            /* renamed from: a, reason: collision with root package name */
            public final TextStyle f5135a;
            public final TextStyle b;

            public Sm(TextStyle textStyle, TextStyle textStyle2) {
                this.f5135a = textStyle;
                this.b = textStyle2;
            }
        }

        public Title(Md md, Sm sm) {
            this.f5133a = md;
            this.b = sm;
        }
    }

    public CoreTypographyTokens(Body body, Caption caption, Display display, Headline headline, Title title) {
        this.f5120a = body;
        this.b = caption;
        this.c = display;
        this.d = headline;
        this.e = title;
    }
}
